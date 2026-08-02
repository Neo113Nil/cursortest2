package v0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.graphics.v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v0.i;
import x0.InterfaceC6772a;
import z.r;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final z.j f66790a = new z.j(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f66791b = j.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f66792c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final r f66793d = new r();

    public class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f66794a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f66795b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v0.e f66796c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f66797d;

        public a(String str, Context context, v0.e eVar, int i10) {
            this.f66794a = str;
            this.f66795b = context;
            this.f66796c = eVar;
            this.f66797d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            List a10;
            String str = this.f66794a;
            Context context = this.f66795b;
            a10 = g.a(new Object[]{this.f66796c});
            return h.c(str, context, a10, this.f66797d);
        }
    }

    public class b implements InterfaceC6772a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C6594a f66798a;

        public b(C6594a c6594a) {
            this.f66798a = c6594a;
        }

        @Override // x0.InterfaceC6772a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f66798a.b(eVar);
        }
    }

    public class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f66799a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f66800b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f66801c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f66802d;

        public c(String str, Context context, List list, int i10) {
            this.f66799a = str;
            this.f66800b = context;
            this.f66801c = list;
            this.f66802d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return h.c(this.f66799a, this.f66800b, this.f66801c, this.f66802d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements InterfaceC6772a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f66803a;

        public d(String str) {
            this.f66803a = str;
        }

        @Override // x0.InterfaceC6772a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (h.f66792c) {
                try {
                    r rVar = h.f66793d;
                    ArrayList arrayList = (ArrayList) rVar.get(this.f66803a);
                    if (arrayList == null) {
                        return;
                    }
                    rVar.remove(this.f66803a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((InterfaceC6772a) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static String a(List list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((v0.e) list.get(i11)).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static int b(i.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        i.b[] c10 = aVar.c();
        if (c10 != null && c10.length != 0) {
            i10 = 0;
            for (i.b bVar : c10) {
                int b10 = bVar.b();
                if (b10 != 0) {
                    if (b10 < 0) {
                        return -3;
                    }
                    return b10;
                }
            }
        }
        return i10;
    }

    public static e c(String str, Context context, List list, int i10) {
        K2.a.c("getFontSync");
        try {
            z.j jVar = f66790a;
            Typeface typeface = (Typeface) jVar.get(str);
            if (typeface != null) {
                return new e(typeface);
            }
            i.a e10 = v0.d.e(context, list, null);
            int b10 = b(e10);
            if (b10 != 0) {
                return new e(b10);
            }
            Typeface b11 = (!e10.f() || Build.VERSION.SDK_INT < 29) ? v.b(context, null, e10.c(), i10) : v.c(context, null, e10.d(), i10);
            if (b11 == null) {
                return new e(-3);
            }
            jVar.put(str, b11);
            return new e(b11);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            K2.a.f();
        }
    }

    public static Typeface d(Context context, List list, int i10, Executor executor, C6594a c6594a) {
        String a10 = a(list, i10);
        Typeface typeface = (Typeface) f66790a.get(a10);
        if (typeface != null) {
            c6594a.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c6594a);
        synchronized (f66792c) {
            try {
                r rVar = f66793d;
                ArrayList arrayList = (ArrayList) rVar.get(a10);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                rVar.put(a10, arrayList2);
                c cVar = new c(a10, context, list, i10);
                if (executor == null) {
                    executor = f66791b;
                }
                j.c(executor, cVar, new d(a10));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Typeface e(Context context, v0.e eVar, C6594a c6594a, int i10, int i11) {
        List a10;
        List a11;
        a10 = g.a(new Object[]{eVar});
        String a12 = a(a10, i10);
        Typeface typeface = (Typeface) f66790a.get(a12);
        if (typeface != null) {
            c6594a.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            a11 = g.a(new Object[]{eVar});
            e c10 = c(a12, context, a11, i10);
            c6594a.b(c10);
            return c10.f66804a;
        }
        try {
            e eVar2 = (e) j.d(f66791b, new a(a12, context, eVar, i10), i11);
            c6594a.b(eVar2);
            return eVar2.f66804a;
        } catch (InterruptedException unused) {
            c6594a.b(new e(-3));
            return null;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f66804a;

        /* renamed from: b, reason: collision with root package name */
        public final int f66805b;

        public e(int i10) {
            this.f66804a = null;
            this.f66805b = i10;
        }

        public boolean a() {
            return this.f66805b == 0;
        }

        public e(Typeface typeface) {
            this.f66804a = typeface;
            this.f66805b = 0;
        }
    }
}
