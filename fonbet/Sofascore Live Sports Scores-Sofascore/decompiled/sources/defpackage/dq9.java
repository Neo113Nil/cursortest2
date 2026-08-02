package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dq9 extends i7 {
    public final e1d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq9(Context context) {
        super(context);
        context.getClass();
        this.e = e.f(null);
        setVisibility(8);
    }

    private final ysi getState() {
        return (ysi) ((eoh) this.e).getValue();
    }

    private final void setState(ysi ysiVar) {
        ((eoh) this.e).setValue(ysiVar);
    }

    @Override // defpackage.i7
    public final void j(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1329186428);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            ysi state = getState();
            if (state == null) {
                av8Var.d0(-1805556301);
                av8Var.s(false);
            } else {
                av8Var.d0(-1805556300);
                ww9.m(state, l98.c0(utc.a, 8.0f, 4.0f), av8Var, 48);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hl7(this, i, 28);
        }
    }

    public final void l(ysi ysiVar) {
        setState(ysiVar);
        setVisibility(ysiVar != null ? 0 : 8);
    }
}
