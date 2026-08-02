package s7;

import s7.InterfaceC9612g;

/* renamed from: s7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C9606a implements InterfaceC9612g.a<InterfaceC9612g<Object>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9607b f98232a;

    C9606a(C9607b c9607b) {
        this.f98232a = c9607b;
    }

    @Override // s7.InterfaceC9612g.a
    public final void a(InterfaceC9612g<Object> interfaceC9612g, boolean z11) {
        boolean z12;
        boolean m11;
        boolean g10;
        InterfaceC9612g<Object> interfaceC9612g2 = interfaceC9612g;
        C9607b c9607b = this.f98232a;
        if (z11) {
            g10 = c9607b.g(interfaceC9612g2);
            if (!g10) {
                return;
            }
        } else {
            z12 = c9607b.f98237e;
            m11 = c9607b.m(interfaceC9612g2, z12);
            if (!m11) {
                return;
            }
        }
        C9607b.d(c9607b);
    }
}
