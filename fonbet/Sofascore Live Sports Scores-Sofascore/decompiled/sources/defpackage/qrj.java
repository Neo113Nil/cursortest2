package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qrj extends a3 {
    public final e1d k;
    public String l;
    public boolean m;
    public Integer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrj(Context context) {
        super(context, null, 0);
        context.getClass();
        this.k = e.f(null);
        this.l = Sports.TENNIS;
        setVisibility(8);
    }

    private final prj getUiModel() {
        return (prj) ((eoh) this.k).getValue();
    }

    private final void setUiModel(prj prjVar) {
        ((eoh) this.k).setValue(prjVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1602607629);
        int i2 = 2;
        int i3 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            prj uiModel = getUiModel();
            if (uiModel == null) {
                av8Var.d0(-427360936);
                av8Var.s(false);
            } else {
                av8Var.d0(-427360935);
                haa.f(yqo.H(-138329692, av8Var, new bmj(3, uiModel, this)), av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lqj(this, i, i2);
        }
    }

    public final void l(int i, List list, UniqueTournamentDetails uniqueTournamentDetails, String str) {
        str.getClass();
        if (getVisibility() != 0 && b.j(Sports.TENNIS, Sports.BASKETBALL).contains(str)) {
            this.l = str;
            this.n = Integer.valueOf(i);
            this.m = yid.m(list != null ? Integer.valueOf(list.size()) : null) > 5;
            prj E = l4a.E(list != null ? CollectionsKt.L0(list, 5) : null, uniqueTournamentDetails, str);
            if (E == null) {
                return;
            }
            setUiModel(E);
            setVisibility(0);
        }
    }
}
