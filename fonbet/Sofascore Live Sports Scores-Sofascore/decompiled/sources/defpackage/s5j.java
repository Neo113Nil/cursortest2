package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s5j extends a3 {
    public final e1d k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5j(Context context) {
        super(context, null, 0);
        context.getClass();
        this.k = e.f(null);
        setVisibility(8);
    }

    private final q5j getRankingUIModel() {
        return (q5j) ((eoh) this.k).getValue();
    }

    public static final Unit l(s5j s5jVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            haa.g(s5jVar.getRankingUIModel(), av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final void setRankingUIModel(q5j q5jVar) {
        ((eoh) this.k).setValue(q5jVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(402482829);
        int i2 = (av8Var.g(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            haa.f(yqo.H(1064665096, av8Var, new r5j(this)), av8Var, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r5j(this, i);
        }
    }

    public final void m(q5j q5jVar) {
        if (getVisibility() == 0 || q5jVar == null) {
            return;
        }
        setVisibility(0);
        setRankingUIModel(q5jVar);
    }
}
