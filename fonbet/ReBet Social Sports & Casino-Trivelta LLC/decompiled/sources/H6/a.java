package H6;

import D6.k;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a implements Cloneable, Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static int f4822f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4825a = false;

    /* renamed from: b, reason: collision with root package name */
    public final i f4826b;

    /* renamed from: c, reason: collision with root package name */
    public final c f4827c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f4828d;

    /* renamed from: e, reason: collision with root package name */
    public static Class f4821e = a.class;

    /* renamed from: g, reason: collision with root package name */
    public static final h f4823g = new C0101a();

    /* renamed from: h, reason: collision with root package name */
    public static final c f4824h = new b();

    /* renamed from: H6.a$a, reason: collision with other inner class name */
    public class C0101a implements h {
        @Override // H6.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Closeable closeable) {
            try {
                D6.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    public class b implements c {
        @Override // H6.a.c
        public void a(i iVar, Throwable th2) {
            Object f10 = iVar.f();
            E6.a.I(a.f4821e, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), f10 == null ? null : f10.getClass().getName());
        }

        @Override // H6.a.c
        public boolean b() {
            return false;
        }
    }

    public interface c {
        void a(i iVar, Throwable th2);

        boolean b();
    }

    public a(i iVar, c cVar, Throwable th2) {
        this.f4826b = (i) k.g(iVar);
        iVar.b();
        this.f4827c = cVar;
        this.f4828d = th2;
    }

    public static a B(a aVar) {
        if (aVar != null) {
            return aVar.r();
        }
        return null;
    }

    public static a D0(Closeable closeable) {
        return n1(closeable, f4823g);
    }

    public static List J(Collection collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(B((a) it.next()));
        }
        return arrayList;
    }

    public static a T1(Object obj, h hVar, c cVar, Throwable th2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof d)) {
            int i10 = f4822f;
            if (i10 == 1) {
                return new H6.c(obj, hVar, cVar, th2);
            }
            if (i10 == 2) {
                return new g(obj, hVar, cVar, th2);
            }
            if (i10 == 3) {
                return new e(obj);
            }
        }
        return new H6.b(obj, hVar, cVar, th2);
    }

    public static void U(a aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static a m1(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return T1(closeable, f4823g, cVar, cVar.b() ? new Throwable() : null);
    }

    public static a n1(Object obj, h hVar) {
        return y1(obj, hVar, f4824h);
    }

    public static void w0(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                U((a) it.next());
            }
        }
    }

    public static a y1(Object obj, h hVar, c cVar) {
        if (obj == null) {
            return null;
        }
        return T1(obj, hVar, cVar, cVar.b() ? new Throwable() : null);
    }

    public int A0() {
        if (isValid()) {
            return System.identityHashCode(this.f4826b.f());
        }
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f4825a) {
                    return;
                }
                this.f4825a = true;
                this.f4826b.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized boolean isValid() {
        return !this.f4825a;
    }

    /* renamed from: k */
    public abstract a clone();

    public synchronized a r() {
        if (!isValid()) {
            return null;
        }
        return clone();
    }

    public synchronized Object z0() {
        k.i(!this.f4825a);
        return k.g(this.f4826b.f());
    }

    public static boolean isValid(a aVar) {
        return aVar != null && aVar.isValid();
    }

    public a(Object obj, h hVar, c cVar, Throwable th2, boolean z10) {
        this.f4826b = new i(obj, hVar, z10);
        this.f4827c = cVar;
        this.f4828d = th2;
    }
}
