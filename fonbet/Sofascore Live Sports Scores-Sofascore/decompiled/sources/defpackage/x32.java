package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x32 extends wtc implements p32, ula {
    public wo3 o;
    public boolean p;

    public static final oqf k1(x32 x32Var, wdd wddVar, y1 y1Var) {
        oqf oqfVar;
        if (x32Var.n && x32Var.p) {
            wdd b0 = c6o.b0(x32Var);
            if (!wddVar.e1().n) {
                wddVar = null;
            }
            if (wddVar != null && (oqfVar = (oqf) y1Var.invoke()) != null) {
                return oqfVar.k(b0.p(wddVar, false).f());
            }
        }
        return null;
    }

    @Override // defpackage.p32
    public final Object J0(wdd wddVar, y1 y1Var, sq3 sq3Var) {
        Object r = s9a.r(new w32(this, wddVar, y1Var, new mi(9, this, wddVar, y1Var), null, 0), sq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.ula
    public final void q0(dma dmaVar) {
        this.p = true;
    }
}
