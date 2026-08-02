package C7;

import H6.a;
import android.util.Log;
import java.io.Closeable;

/* renamed from: C7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1037a {

    /* renamed from: a, reason: collision with root package name */
    public final a.c f1257a;

    /* renamed from: C7.a$a, reason: collision with other inner class name */
    public class C0033a implements a.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E7.a f1258a;

        public C0033a(E7.a aVar) {
            this.f1258a = aVar;
        }

        @Override // H6.a.c
        public void a(H6.i iVar, Throwable th2) {
            this.f1258a.a(iVar, th2);
            Object f10 = iVar.f();
            E6.a.M("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), f10 != null ? f10.getClass().getName() : "<value is null>", C1037a.d(th2));
        }

        @Override // H6.a.c
        public boolean b() {
            return this.f1258a.b();
        }
    }

    public C1037a(E7.a aVar) {
        this.f1257a = new C0033a(aVar);
    }

    public static String d(Throwable th2) {
        return th2 == null ? "" : Log.getStackTraceString(th2);
    }

    public H6.a b(Closeable closeable) {
        return H6.a.m1(closeable, this.f1257a);
    }

    public H6.a c(Object obj, H6.h hVar) {
        return H6.a.y1(obj, hVar, this.f1257a);
    }
}
