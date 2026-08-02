package t2;

import android.os.Looper;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6383a {

    /* renamed from: t2.a$a, reason: collision with other inner class name */
    public static class C0908a {

        /* renamed from: a, reason: collision with root package name */
        public final int f65192a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65193b;

        public C0908a(int i10, boolean z10) {
            this.f65192a = i10;
            this.f65193b = z10;
        }
    }

    /* renamed from: t2.a$b */
    public interface b {
        InterfaceC6383a a(E e10, Looper looper, c cVar, C0908a c0908a);
    }

    /* renamed from: t2.a$c */
    public interface c {
        L0 a(androidx.media3.common.a aVar);

        boolean b(androidx.media3.common.a aVar, int i10);

        void c(int i10);

        void d(C6427w0 c6427w0);

        void f(long j10);
    }

    int e(K0 k02);

    com.google.common.collect.B g();

    void release();

    void start();
}
