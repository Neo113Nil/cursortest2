package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.Team;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lh8i;", "Lq8;", "e8i", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class h8i extends q8 {
    public final j0j e;
    public final s96 f;
    public final int g;
    public boolean h;
    public boolean i;
    public final yzc j;
    public final yzc k;
    public final yzc l;
    public final yzc m;
    public final yzc n;
    public final yzc o;
    public final yzc p;
    public final yzc q;
    public StageSeason r;
    public final hof s;
    public final jof t;
    public g9i u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8i(Application application, j0j j0jVar, s96 s96Var, bt7 bt7Var, fqg fqgVar) {
        super(application);
        j0jVar.getClass();
        s96Var.getClass();
        fqgVar.getClass();
        this.e = j0jVar;
        this.f = s96Var;
        Integer num = (Integer) fqgVar.a("STAGE_TEAM_ID");
        int intValue = num != null ? num.intValue() : 0;
        this.g = intValue;
        this.h = true;
        yzc yzcVar = new yzc();
        this.j = yzcVar;
        this.k = yzcVar;
        yzc yzcVar2 = new yzc();
        this.l = yzcVar2;
        this.m = yzcVar2;
        yzc yzcVar3 = new yzc();
        this.n = yzcVar3;
        this.o = yzcVar3;
        yzc yzcVar4 = new yzc();
        this.p = yzcVar4;
        this.q = yzcVar4;
        hof H = un0.H(j0jVar.e(intValue), un0.z(this), new uci(5000L, Long.MAX_VALUE), 0);
        this.s = H;
        this.t = un0.K(la8.a(H, new lr5(null, bt7Var, 4)), un0.z(this), new uci(5000L, Long.MAX_VALUE), null);
    }

    public final void k() {
        xw3.L(un0.z(this), null, null, new big(this, null, 23), 3);
    }

    public final Team l() {
        e8i e8iVar = (e8i) this.j.d();
        if (e8iVar != null) {
            return e8iVar.a;
        }
        return null;
    }
}
