package q1;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import q1.t;

/* renamed from: q1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6104m {

    /* renamed from: q1.m$a */
    public static class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f63330a;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f63330a = i10;
        }
    }

    static void e(InterfaceC6104m interfaceC6104m, InterfaceC6104m interfaceC6104m2) {
        if (interfaceC6104m == interfaceC6104m2) {
            return;
        }
        if (interfaceC6104m2 != null) {
            interfaceC6104m2.b(null);
        }
        if (interfaceC6104m != null) {
            interfaceC6104m.d(null);
        }
    }

    UUID a();

    void b(t.a aVar);

    boolean c();

    void d(t.a aVar);

    k1.b f();

    Map g();

    a getError();

    int getState();

    boolean h(String str);
}
