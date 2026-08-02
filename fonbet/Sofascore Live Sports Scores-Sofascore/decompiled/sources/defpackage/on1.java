package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class on1 extends a3 {
    public final e1d k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.k = e.f(null);
    }

    private final mn1 getData() {
        return (mn1) ((eoh) this.k).getValue();
    }

    private final void setData(mn1 mn1Var) {
        ((eoh) this.k).setValue(mn1Var);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2105497649);
        int i2 = (av8Var.g(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            mn1 data = getData();
            if (data == null) {
                av8Var.d0(-1178032692);
                av8Var.s(false);
            } else {
                av8Var.d0(-1178032691);
                haa.f(yqo.H(1101018350, av8Var, new t21(data, 23)), av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t21(this, i, 24);
        }
    }

    public final void l(mn1 mn1Var) {
        setData(mn1Var);
    }
}
