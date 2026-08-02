package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.MediaHighlightSummaryResponse;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lple;", "Lq8;", "mle", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ple extends q8 {
    public final jof A;
    public final wve e;
    public final wi7 f;
    public final t9c g;
    public final sef h;
    public final bfk i;
    public final int j;
    public final wk2 k;
    public Player l;
    public Integer m;
    public Integer n;
    public String o;
    public final yzc p;
    public final yzc q;
    public final zzc r;
    public final zzc s;
    public boolean t;
    public boolean u;
    public boolean v;
    public MediaHighlightSummaryResponse w;
    public final aeh x;
    public final hof y;
    public final hof z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ple(Application application, wve wveVar, wi7 wi7Var, t9c t9cVar, sef sefVar, bfk bfkVar, bt7 bt7Var, fqg fqgVar) {
        super(application);
        wveVar.getClass();
        wi7Var.getClass();
        t9cVar.getClass();
        sefVar.getClass();
        bfkVar.getClass();
        fqgVar.getClass();
        this.e = wveVar;
        this.f = wi7Var;
        this.g = t9cVar;
        this.h = sefVar;
        this.i = bfkVar;
        Integer num = (Integer) fqgVar.a("PLAYER_ID");
        int intValue = num != null ? num.intValue() : 0;
        this.j = intValue;
        this.k = (wk2) fqgVar.a("PRESELECTED_COMPETITION_TYPE");
        yzc yzcVar = new yzc();
        this.p = yzcVar;
        this.q = yzcVar;
        zzc zzcVar = new zzc();
        this.r = zzcVar;
        this.s = zzcVar;
        this.u = true;
        aeh b = beh.b(0, 0, null, 7);
        this.x = b;
        this.y = un0.t(b);
        aoe aoeVar = wveVar.a;
        this.z = un0.H(hkg.H(zm2.s(aoeVar.a, false, new String[]{"players"}, new tj(intValue, aoeVar, 8))), un0.z(this), new uci(5000L, Long.MAX_VALUE), 0);
        this.A = un0.K(hkg.H(zm2.s(bt7Var.c.a.a, false, new String[]{"my_players"}, new jie(6))), un0.z(this), new uci(5000L, Long.MAX_VALUE), km5.a);
    }

    public final void k(UniqueTournament uniqueTournament, String str, String str2, String str3) {
        uniqueTournament.getClass();
        str.getClass();
        str2.getClass();
        xw3.L(un0.z(this), null, null, new h10(this, uniqueTournament, str, str2, str3, null, 16), 3);
    }
}
