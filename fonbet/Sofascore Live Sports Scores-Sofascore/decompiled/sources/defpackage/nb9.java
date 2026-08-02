package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nb9 extends a3 {
    public final e1d k;
    public s26 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb9(Context context) {
        super(context, null, 0);
        context.getClass();
        this.k = e.f(null);
        setVisibility(8);
    }

    private final sxa getHistoricalData() {
        return (sxa) ((eoh) this.k).getValue();
    }

    private final void setHistoricalData(sxa sxaVar) {
        ((eoh) this.k).setValue(sxaVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1200400543);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            sxa historicalData = getHistoricalData();
            if (historicalData == null) {
                av8Var.d0(1234924392);
                av8Var.s(false);
            } else {
                av8Var.d0(1234924393);
                haa.f(yqo.H(1875630613, av8Var, new kz6(27, historicalData, this)), av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hl7(this, i, 24);
        }
    }

    public final void l(sxa sxaVar, s26 s26Var) {
        this.l = s26Var;
        setVisibility(sxaVar != null ? 0 : 8);
        setHistoricalData(sxaVar);
    }
}
