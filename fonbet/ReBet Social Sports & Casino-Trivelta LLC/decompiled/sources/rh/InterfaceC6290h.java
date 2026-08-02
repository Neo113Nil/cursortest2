package rh;

import ph.AbstractC6070a;
import uh.InterfaceC6579c;
import uh.InterfaceC6585i;

/* renamed from: rh.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6290h extends InterfaceC6585i {
    static InterfaceC6290h current() {
        InterfaceC6290h interfaceC6290h = (InterfaceC6290h) InterfaceC6579c.current().h(AbstractC6293k.f64401a);
        return interfaceC6290h == null ? e() : interfaceC6290h;
    }

    static InterfaceC6290h e() {
        return C6289g.f64399b;
    }

    static InterfaceC6290h f(InterfaceC6579c interfaceC6579c) {
        if (interfaceC6579c == null) {
            AbstractC6070a.a("context is null");
            return e();
        }
        InterfaceC6290h interfaceC6290h = (InterfaceC6290h) interfaceC6579c.h(AbstractC6293k.f64401a);
        return interfaceC6290h == null ? e() : interfaceC6290h;
    }

    static InterfaceC6290h i(InterfaceC6292j interfaceC6292j) {
        if (interfaceC6292j != null) {
            return C6289g.c(interfaceC6292j);
        }
        AbstractC6070a.a("context is null");
        return e();
    }

    InterfaceC6292j a();

    @Override // uh.InterfaceC6585i
    default InterfaceC6579c b(InterfaceC6579c interfaceC6579c) {
        return interfaceC6579c.f(AbstractC6293k.f64401a, this);
    }

    void end();

    InterfaceC6290h g(oh.e eVar, Object obj);

    default InterfaceC6290h h(String str, String str2) {
        return g(oh.e.a(str), str2);
    }

    default InterfaceC6290h j(String str, boolean z10) {
        return g(oh.e.b(str), Boolean.valueOf(z10));
    }

    default InterfaceC6290h k(String str, long j10) {
        return g(oh.e.c(str), Long.valueOf(j10));
    }
}
