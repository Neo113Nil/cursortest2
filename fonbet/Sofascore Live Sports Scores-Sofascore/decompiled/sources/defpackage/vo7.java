package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lvo7;", "Lq8;", "Lmk7;", "ro7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class vo7 extends q8 implements mk7 {
    public final wi7 e;
    public final ky6 f;
    public final tj7 g;
    public final String h;
    public final int i;
    public final Integer j;
    public final fdi k;
    public final jof l;
    public final e1d m;
    public final FantasyCompetitionType n;
    public Integer o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo7(Application application, fqg fqgVar, wi7 wi7Var, ky6 ky6Var, tj7 tj7Var) {
        super(application);
        fqgVar.getClass();
        wi7Var.getClass();
        ky6Var.getClass();
        tj7Var.getClass();
        this.e = wi7Var;
        this.f = ky6Var;
        this.g = tj7Var;
        Object a = fqgVar.a("USER_ID_EXTRA");
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.h = (String) a;
        Object a2 = fqgVar.a("COMPETITION_ID_EXTRA");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.i = ((Number) a2).intValue();
        this.j = (Integer) fqgVar.a("GAMEWEEK_ID_EXTRA");
        fdi a3 = gdi.a(oo7.a);
        this.k = a3;
        this.l = un0.u(a3);
        this.m = e.f(null);
        Object a4 = fqgVar.a("competitionType");
        if (a4 != null) {
            this.n = (FantasyCompetitionType) a4;
        } else {
            a70.r("Required value was null.");
            throw null;
        }
    }

    @Override // defpackage.mk7
    /* renamed from: p, reason: from getter */
    public final FantasyCompetitionType getN() {
        return this.n;
    }

    @Override // defpackage.mk7
    public final void q(il8 il8Var) {
        ((eoh) this.m).setValue(il8Var);
    }

    @Override // defpackage.mk7
    public final il8 r() {
        return (il8) ((eoh) this.m).getValue();
    }
}
