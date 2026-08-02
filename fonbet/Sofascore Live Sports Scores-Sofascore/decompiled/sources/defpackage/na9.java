package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class na9 extends a3 {
    public final e1d k;
    public hx5 l;
    public boolean m;
    public int n;
    public String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na9(Context context) {
        super(context, null, 0);
        context.getClass();
        this.k = e.f(null);
        this.o = "";
        setVisibility(8);
    }

    private final ua9 getMediaModel() {
        return (ua9) ((eoh) this.k).getValue();
    }

    private final void setMediaModel(ua9 ua9Var) {
        ((eoh) this.k).setValue(ua9Var);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1543396348);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            ua9 mediaModel = getMediaModel();
            if (mediaModel == null) {
                av8Var.d0(1695787443);
                av8Var.s(false);
            } else {
                av8Var.d0(1695787444);
                haa.f(yqo.H(1223107856, av8Var, new kz6(26, this, mediaModel)), av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hl7(this, i, 22);
        }
    }

    public final void l(ua9 ua9Var, boolean z, int i, String str, boolean z2, hx5 hx5Var) {
        str.getClass();
        if (!(ua9Var instanceof ta9) && !(ua9Var instanceof sa9)) {
            z = ua9Var instanceof ra9;
        }
        setVisibility(z ? 0 : 8);
        if (getVisibility() == 0) {
            setMediaModel(ua9Var);
        }
        this.n = i;
        this.o = str;
        this.l = hx5Var;
        this.m = z2;
    }
}
