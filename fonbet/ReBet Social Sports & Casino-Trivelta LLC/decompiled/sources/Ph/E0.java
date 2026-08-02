package Ph;

import kotlin.Unit;

/* loaded from: classes5.dex */
public class E0 extends I0 implements A {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9004c;

    public E0(C0 c02) {
        super(true);
        a0(c02);
        this.f9004c = K0();
    }

    public final boolean K0() {
        I0 t10;
        InterfaceC1478u U10 = U();
        C1480v c1480v = U10 instanceof C1480v ? (C1480v) U10 : null;
        if (c1480v != null && (t10 = c1480v.t()) != null) {
            while (!t10.Q()) {
                InterfaceC1478u U11 = t10.U();
                C1480v c1480v2 = U11 instanceof C1480v ? (C1480v) U11 : null;
                if (c1480v2 != null && (t10 = c1480v2.t()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Ph.I0
    public boolean Q() {
        return this.f9004c;
    }

    @Override // Ph.I0
    public boolean S() {
        return true;
    }

    @Override // Ph.A
    public boolean k(Throwable th2) {
        return g0(new C(th2, false, 2, null));
    }

    @Override // Ph.A
    public boolean y1() {
        return g0(Unit.INSTANCE);
    }
}
