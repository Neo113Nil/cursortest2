package M5;

import r5.InterfaceC6207a;

/* loaded from: classes2.dex */
public interface a extends N5.a {

    /* renamed from: M5.a$a, reason: collision with other inner class name */
    public static final class C0150a {
        public static boolean a(a aVar) {
            return aVar.a().a() - aVar.e() > 900000;
        }

        public static boolean b(a aVar) {
            return aVar.a().a() - aVar.k().d() > 3600000;
        }

        public static void c(a aVar) {
            if (aVar.isIdle() || aVar.i()) {
                aVar.l();
            }
            aVar.b(aVar.a().a());
        }
    }

    InterfaceC6207a a();

    void b(long j10);

    long e();

    boolean i();

    boolean isIdle();

    void l();

    void shutdown();
}
