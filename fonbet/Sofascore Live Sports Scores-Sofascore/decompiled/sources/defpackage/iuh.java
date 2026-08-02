package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iuh extends a3 {
    public final e1d k;
    public final e1d l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuh(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.k = e.f(null);
        this.l = e.f(Boolean.TRUE);
    }

    private final fv getPromotionLocation() {
        return (fv) ((eoh) this.k).getValue();
    }

    private final boolean getVisible() {
        return ((Boolean) ((eoh) this.l).getValue()).booleanValue();
    }

    public static final Unit l(iuh iuhVar) {
        ke0.m.add(-8);
        iuhVar.setVisible(false);
        return Unit.a;
    }

    private final void setPromotionLocation(fv fvVar) {
        ((eoh) this.k).setValue(fvVar);
    }

    private final void setVisible(boolean z) {
        ((eoh) this.l).setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(45528636);
        int i2 = (av8Var.g(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            fv promotionLocation = getPromotionLocation();
            if (promotionLocation == null) {
                av8Var.d0(-866011466);
                av8Var.s(false);
            } else {
                av8Var.d0(-866011465);
                fz8.e(getVisible(), null, null, uo5.f(null, 3).a(uo5.l(null, null, 15)), null, yqo.H(-1579003471, av8Var, new yya(27, promotionLocation, this)), av8Var, 199680, 22);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fvg(this, i, 17);
        }
    }

    public final void m(fv fvVar) {
        setPromotionLocation(fvVar);
    }
}
