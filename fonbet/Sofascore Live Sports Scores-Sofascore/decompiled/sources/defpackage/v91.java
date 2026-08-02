package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v91 extends a3 {
    public final e1d k;
    public v9b l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v91(Context context) {
        super(context, null, 0);
        context.getClass();
        this.k = e.f(null);
    }

    private final r91 getData() {
        return (r91) ((eoh) this.k).getValue();
    }

    private final void setData(r91 r91Var) {
        ((eoh) this.k).setValue(r91Var);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        tee teeVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2081819269);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            r91 data = getData();
            if (data == null || (teeVar = data.e) == null || teeVar.isEmpty()) {
                data = null;
            }
            if (data == null) {
                av8Var.d0(-150010449);
                av8Var.s(false);
            } else {
                av8Var.d0(-150010448);
                haa.f(yqo.H(-1997219168, av8Var, new vn6(10, data, this)), av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t21(this, i, 18);
        }
    }

    public final void l(r91 r91Var) {
        r91Var.getClass();
        setData(r91Var);
    }
}
