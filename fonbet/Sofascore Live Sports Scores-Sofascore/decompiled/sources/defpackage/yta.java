package defpackage;

import android.app.Application;
import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lyta;", "Lq8;", "nta", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class yta extends q8 {
    public final yzc A;
    public final yzc B;
    public final yzc C;
    public final zzc D;
    public final zzc E;
    public final zzc F;
    public final zzc G;
    public final hof H;
    public final jof I;
    public final w3b e;
    public final sef f;
    public final wi7 g;
    public final kgl h;
    public final int i;
    public final Integer j;
    public int k;
    public boolean l;
    public boolean m;
    public Integer n;
    public Gender o;
    public Boolean p;
    public final BrandingTournament q;
    public final boolean r;
    public final boolean s;
    public Integer t;
    public final yzc u;
    public final yzc v;
    public final yzc w;
    public final yzc x;
    public final yzc y;
    public final yzc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yta(Application application, w3b w3bVar, sef sefVar, wi7 wi7Var, bt7 bt7Var, fqg fqgVar, kgl kglVar) {
        super(application);
        w3bVar.getClass();
        sefVar.getClass();
        wi7Var.getClass();
        fqgVar.getClass();
        kglVar.getClass();
        this.e = w3bVar;
        this.f = sefVar;
        this.g = wi7Var;
        this.h = kglVar;
        Integer num = (Integer) fqgVar.a("UNIQUE_TOURNAMENT_ID");
        int intValue = num != null ? num.intValue() : 0;
        this.i = intValue;
        this.j = (Integer) fqgVar.a("TEAM_OF_THE_PERIOD_ID");
        int i = 1;
        this.l = true;
        this.m = true;
        BrandingTournament C = ccd.C(i(), Integer.valueOf(intValue));
        this.q = C;
        this.r = C != null;
        this.s = tz9.H(C);
        yzc yzcVar = new yzc();
        this.u = yzcVar;
        this.v = yzcVar;
        yzc yzcVar2 = new yzc();
        this.w = yzcVar2;
        this.x = yzcVar2;
        yzc yzcVar3 = new yzc();
        this.y = yzcVar3;
        this.z = yzcVar3;
        yzc yzcVar4 = new yzc();
        this.A = yzcVar4;
        this.B = yzcVar4;
        this.C = new yzc(Boolean.TRUE);
        zzc zzcVar = new zzc();
        this.D = zzcVar;
        this.E = zzcVar;
        zzc zzcVar2 = new zzc();
        this.F = zzcVar2;
        this.G = zzcVar2;
        irj irjVar = w3bVar.a;
        hof H = un0.H(hkg.H(zm2.s(irjVar.a, false, new String[]{"leagues"}, new tj(intValue, irjVar, 14))), un0.z(this), new uci(5000L, Long.MAX_VALUE), 0);
        this.H = H;
        rq3 rq3Var = null;
        this.I = un0.K(la8.a(H, new lr5(rq3Var, bt7Var, i)), un0.z(this), new uci(5000L, Long.MAX_VALUE), null);
        if (intValue > 0) {
            xw3.L(un0.z(this), null, null, new yp7(this, rq3Var, 22), 3);
        }
    }

    public final void k() {
        iz2 z = un0.z(this);
        hs4 hs4Var = z45.a;
        xw3.L(z, hq4.c, null, new ts2(this, null), 2);
    }

    public final Season l() {
        return (Season) this.w.d();
    }

    public final String m() {
        Tournament tournament;
        Category category;
        Sport sport;
        Pair pair = (Pair) this.u.d();
        if (pair == null || (tournament = (Tournament) pair.a) == null || (category = tournament.getCategory()) == null || (sport = category.getSport()) == null) {
            return null;
        }
        return sport.getSlug();
    }

    public final Tournament n() {
        Pair pair = (Pair) this.u.d();
        if (pair != null) {
            return (Tournament) pair.a;
        }
        return null;
    }

    public final Tournament o() {
        Pair pair = (Pair) this.u.d();
        Tournament tournament = pair != null ? (Tournament) pair.a : null;
        if (tournament != null) {
            return tournament;
        }
        a70.r("Required value was null.");
        return null;
    }

    public final boolean t() {
        Tournament n;
        UniqueTournament uniqueTournament;
        yea yeaVar = j58.a;
        if (!fn0.B("featured_tournament_popular_players_enabled") || (n = n()) == null || (uniqueTournament = n.getUniqueTournament()) == null) {
            return false;
        }
        int id = uniqueTournament.getId();
        rv7.c.getClass();
        return id == 270;
    }
}
