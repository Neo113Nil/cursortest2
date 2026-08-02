package w6;

import w6.InterfaceC6710a;

/* loaded from: classes2.dex */
public class g implements InterfaceC6710a {

    /* renamed from: a, reason: collision with root package name */
    public static g f67481a;

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            try {
                if (f67481a == null) {
                    f67481a = new g();
                }
                gVar = f67481a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @Override // w6.InterfaceC6710a
    public void a(InterfaceC6710a.EnumC0954a enumC0954a, Class cls, String str, Throwable th2) {
    }
}
