package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.BaseballAdditionalPlayerData;
import com.sofascore.model.mvvm.model.BaseballRole;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerDataExtras;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.network.response.BaseballPlayerEventStatistics;
import com.sofascore.model.network.response.FootballPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.newNetwork.FootballEventPlayerRatingBreakdownResponse;
import com.sofascore.model.newNetwork.PlayerHeatmapResponse;
import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lfqe;", "Lq8;", "ppe", "qpe", "npe", "mpe", "ope", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class fqe extends q8 {
    public static yzd B = yzd.PerCategory;
    public mpe A;
    public final wve e;
    public final g39 f;
    public final s96 g;
    public final hzd h;
    public final yzc i;
    public final yzc j;
    public final yzc k;
    public final yzc l;
    public final yzc m;
    public final yzc n;
    public final fdi o;
    public final jof p;
    public final fdi q;
    public final jof r;
    public ope s;
    public final fdi t;
    public final jof u;
    public List v;
    public final fdi w;
    public final jof x;
    public final joa y;
    public av4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqe(Application application, fqg fqgVar, wve wveVar, g39 g39Var, s96 s96Var) {
        super(application);
        fqgVar.getClass();
        wveVar.getClass();
        g39Var.getClass();
        s96Var.getClass();
        this.e = wveVar;
        this.f = g39Var;
        this.g = s96Var;
        hzd hzdVar = (hzd) fqgVar.a("DATA");
        this.h = hzdVar;
        yzc yzcVar = new yzc();
        this.i = yzcVar;
        this.j = yzcVar;
        yzc yzcVar2 = new yzc();
        this.k = yzcVar2;
        this.l = yzcVar2;
        yzc yzcVar3 = new yzc();
        this.m = yzcVar3;
        this.n = yzcVar3;
        rlh rlhVar = rlh.b;
        fdi a = gdi.a(new uzd(9.0d, rlhVar, Gender.Male));
        this.o = a;
        this.p = un0.u(a);
        fdi a2 = gdi.a(new xzd(yid.m(hzdVar != null ? Integer.valueOf(hzdVar.g) : null), (hzdVar != null ? hzdVar.l : null) != null ? yzd.PerCategory : B, rlhVar, null, rlhVar, rlhVar, null));
        this.q = a2;
        this.r = un0.u(a2);
        this.s = new ope(rlhVar, null);
        fdi a3 = gdi.a(new lzd(rlhVar, true));
        this.t = a3;
        this.u = un0.u(a3);
        fdi a4 = gdi.a(null);
        this.w = a4;
        this.x = un0.u(a4);
        this.y = ypa.a(ysa.c, new boe(7));
    }

    public static pb A(FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement ratingBreakdownElement, Integer num, boolean z) {
        long k = k(ratingBreakdownElement.getPlayerCoordinates());
        Point2D passEndCoordinates = ratingBreakdownElement.getPassEndCoordinates();
        return new pb(k, passEndCoordinates != null ? k(passEndCoordinates) : k(ratingBreakdownElement.getPlayerCoordinates()), z ? sb.b : sb.a, num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void D(fqe fqeVar, ll1 ll1Var, kl1 kl1Var, String str, String str2, Boolean bool, int i) {
        boolean z;
        jl1 jl1Var;
        nl1 a;
        jl1 jl1Var2;
        nl1 b;
        Boolean bool2;
        Boolean bool3 = null;
        ll1 ll1Var2 = (i & 1) != 0 ? null : ll1Var;
        kl1 kl1Var2 = (i & 2) != 0 ? null : kl1Var;
        String str3 = (i & 4) != 0 ? null : str;
        String str4 = (i & 8) != 0 ? null : str2;
        Boolean bool4 = (i & 16) != 0 ? null : bool;
        fdi fdiVar = fqeVar.w;
        vl1 vl1Var = (vl1) fdiVar.getValue();
        if (ll1Var2 != null) {
            if (ll1Var2 != (vl1Var != null ? vl1Var.e : null)) {
                z = true;
                wj1 wj1Var = fqeVar.s.b;
                if (ll1Var2 == null) {
                    ll1Var2 = vl1Var != null ? vl1Var.e : null;
                }
                if (kl1Var2 == null) {
                    kl1Var2 = vl1Var != null ? vl1Var.g : null;
                }
                ql1 ql1Var = vl1Var == null ? vl1Var.h : null;
                if (!z) {
                    if (!Intrinsics.c(bool4, Boolean.TRUE)) {
                        if (vl1Var != null && (jl1Var = vl1Var.j) != null && (a = jl1Var.a()) != null) {
                            str3 = a.c;
                        }
                    }
                    if (!z) {
                        if (!Intrinsics.c(bool4, Boolean.FALSE)) {
                            if (vl1Var != null && (jl1Var2 = vl1Var.j) != null && (b = jl1Var2.b()) != null) {
                                str4 = b.c;
                            }
                        }
                        if (!z) {
                            if (bool4 != null) {
                                bool2 = bool4;
                                fdiVar.l(m(fqeVar, wj1Var, ll1Var2, kl1Var2, ql1Var, str3, str4, bool2, 128));
                            } else if (vl1Var != null) {
                                bool3 = vl1Var.i;
                            }
                        }
                        bool2 = bool3;
                        fdiVar.l(m(fqeVar, wj1Var, ll1Var2, kl1Var2, ql1Var, str3, str4, bool2, 128));
                    }
                    str4 = null;
                    if (!z) {
                    }
                    bool2 = bool3;
                    fdiVar.l(m(fqeVar, wj1Var, ll1Var2, kl1Var2, ql1Var, str3, str4, bool2, 128));
                }
                str3 = null;
                if (!z) {
                }
                str4 = null;
                if (!z) {
                }
                bool2 = bool3;
                fdiVar.l(m(fqeVar, wj1Var, ll1Var2, kl1Var2, ql1Var, str3, str4, bool2, 128));
            }
        }
        z = false;
        wj1 wj1Var2 = fqeVar.s.b;
        if (ll1Var2 == null) {
        }
        if (kl1Var2 == null) {
        }
        if (vl1Var == null) {
        }
        if (!z) {
        }
        str3 = null;
        if (!z) {
        }
        str4 = null;
        if (!z) {
        }
        bool2 = bool3;
        fdiVar.l(m(fqeVar, wj1Var2, ll1Var2, kl1Var2, ql1Var, str3, str4, bool2, 128));
    }

    public static long k(Point2D point2D) {
        float x = point2D.getX();
        float y = 100.0f - point2D.getY();
        return (Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32);
    }

    public static vl1 l(wj1 wj1Var, ll1 ll1Var, kl1 kl1Var, ql1 ql1Var, String str, String str2, Boolean bool, mpe mpeVar) {
        Pair pair;
        Pair pair2;
        List list;
        int i = wj1Var == null ? -1 : rpe.b[wj1Var.ordinal()];
        if (i == 1) {
            pair = new Pair(mpeVar != null ? mpeVar.b : null, BaseballSeasonPitchesPerspective.Pitching);
        } else {
            if (i != 2) {
                pair2 = new Pair(null, null);
                list = (List) pair2.a;
                BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective = (BaseballSeasonPitchesPerspective) pair2.b;
                if (list != null || baseballSeasonPitchesPerspective == null) {
                    return null;
                }
                return s02.F(list, baseballSeasonPitchesPerspective, ll1Var, kl1Var, ql1Var, str, str2, bool, gl1.b);
            }
            pair = new Pair(mpeVar != null ? mpeVar.c : null, BaseballSeasonPitchesPerspective.Batting);
        }
        pair2 = pair;
        list = (List) pair2.a;
        BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective2 = (BaseballSeasonPitchesPerspective) pair2.b;
        if (list != null) {
        }
        return null;
    }

    public static /* synthetic */ vl1 m(fqe fqeVar, wj1 wj1Var, ll1 ll1Var, kl1 kl1Var, ql1 ql1Var, String str, String str2, Boolean bool, int i) {
        if ((i & 2) != 0) {
            ll1Var = null;
        }
        if ((i & 4) != 0) {
            kl1Var = null;
        }
        if ((i & 8) != 0) {
            ql1Var = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        mpe mpeVar = fqeVar.A;
        fqeVar.getClass();
        return l(wj1Var, ll1Var, kl1Var, ql1Var, str, str2, bool, mpeVar);
    }

    public static ub z(FootballEventPlayerRatingBreakdownResponse.RatingBreakdownElement ratingBreakdownElement, Integer num) {
        return new ub(k(ratingBreakdownElement.getPlayerCoordinates()), num != null ? num.intValue() : R.color.primary_default);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        if (r2.equals(com.sofascore.model.mvvm.model.PlayerKt.FOOTBALL_MIDFIELDER) == false) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v6, types: [km5] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i, xbb xbbVar, PlayerEventStatisticsResponse playerEventStatisticsResponse) {
        fdi fdiVar;
        Object value;
        xzd xzdVar;
        xbb a;
        mzd mzdVar;
        pzd pzdVar;
        ?? r4;
        gv9 W;
        PlayerEventStatistics statistics = playerEventStatisticsResponse.getStatistics();
        if (!(statistics instanceof FootballPlayerEventStatistics)) {
            statistics = null;
        }
        FootballPlayerEventStatistics footballPlayerEventStatistics = (FootballPlayerEventStatistics) statistics;
        boolean z = yid.k(footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getKilometersCovered() : null) > 0.0d;
        boolean z2 = ((double) yid.m(footballPlayerEventStatistics != null ? footballPlayerEventStatistics.getTotalShots() : null)) > 0.0d;
        String position = playerEventStatisticsResponse.getPosition();
        do {
            fdiVar = this.q;
            value = fdiVar.getValue();
            xzdVar = (xzd) value;
            rik rikVar = mzd.b;
            boolean c = Intrinsics.c(playerEventStatisticsResponse.getPosition(), "G");
            rikVar.getClass();
            xbb b = a.b();
            if (!c || z2) {
                b.add(mzd.Shooting);
            }
            mzd mzdVar2 = mzd.Passing;
            b.add(mzdVar2);
            b.add(mzd.Dribbling);
            mzd mzdVar3 = mzd.Defending;
            b.add(mzdVar3);
            if (z) {
                b.add(mzd.Running);
            }
            if (c) {
                b.add(mzd.Goalkeeping);
            }
            a = a.a(b);
            mzdVar = xzdVar.d;
            pzdVar = xzdVar.g;
            if (!CollectionsKt.R(a, mzdVar)) {
                mzdVar = null;
            }
            if (mzdVar == null) {
                hzd hzdVar = this.h;
                if (hzdVar == null || (mzdVar = hzdVar.l) == null || !a.contains(mzdVar)) {
                    mzdVar = null;
                }
                if (mzdVar == null) {
                    if (position != null) {
                        int hashCode = position.hashCode();
                        if (hashCode != 68) {
                            if (hashCode != 71) {
                                if (hashCode == 77) {
                                }
                            } else if (position.equals("G")) {
                                mzdVar2 = mzd.Goalkeeping;
                                mzdVar = a.contains(mzdVar2) ? mzdVar2 : null;
                                if (mzdVar == null) {
                                    mzdVar = (mzd) CollectionsKt.firstOrNull(a);
                                }
                            }
                        } else if (position.equals("D")) {
                            mzdVar2 = mzdVar3;
                            if (a.contains(mzdVar2)) {
                            }
                            if (mzdVar == null) {
                            }
                        }
                    }
                    mzdVar2 = mzd.Shooting;
                    if (a.contains(mzdVar2)) {
                    }
                    if (mzdVar == null) {
                    }
                }
            }
            if (xbbVar != null) {
                r4 = new ArrayList();
                ListIterator listIterator = xbbVar.listIterator(0);
                while (true) {
                    hc9 hc9Var = (hc9) listIterator;
                    if (!hc9Var.hasNext()) {
                        break;
                    }
                    Object next = hc9Var.next();
                    if (((pzd) next).b == mzdVar) {
                        r4.add(next);
                    }
                }
            } else {
                r4 = 0;
            }
            if (r4 == 0) {
                r4 = km5.a;
            }
            W = l6g.W(r4);
            if (!CollectionsKt.R(W, pzdVar)) {
                pzdVar = (pzd) CollectionsKt.firstOrNull(W);
            }
        } while (!fdiVar.k(value, new xzd(i, xzdVar.b, l6g.W(a), mzdVar, l6g.W(xbbVar == null ? km5.a : xbbVar), W, pzdVar)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(PlayerEventStatisticsResponse playerEventStatisticsResponse) {
        boolean z;
        boolean z2;
        xbb a;
        wj1 wj1Var;
        wj1 wj1Var2;
        PlayerEventStatistics statistics = playerEventStatisticsResponse.getStatistics();
        wj1 wj1Var3 = null;
        if (!(statistics instanceof BaseballPlayerEventStatistics)) {
            statistics = null;
        }
        BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) statistics;
        PlayerDataExtras extra = playerEventStatisticsResponse.getExtra();
        BaseballAdditionalPlayerData baseballAllPositions = extra != null ? extra.getBaseballAllPositions() : null;
        List<BaseballRole> roles = baseballAllPositions != null ? baseballAllPositions.getRoles() : null;
        if (roles == null) {
            roles = km5.a;
        }
        boolean z3 = false;
        if (yid.m(baseballAllPositions != null ? baseballAllPositions.getBattingOrder() : null) <= 0) {
            if (roles == null || !roles.isEmpty()) {
                loop1: for (BaseballRole baseballRole : roles) {
                    List<BaseballRole> battingPositions = BaseballRole.INSTANCE.getBattingPositions();
                    if (battingPositions == null || !battingPositions.isEmpty()) {
                        Iterator<T> it = battingPositions.iterator();
                        while (it.hasNext()) {
                            if (((BaseballRole) it.next()) == baseballRole) {
                            }
                        }
                    }
                }
            }
            z = false;
            if (yid.k(baseballPlayerEventStatistics == null ? baseballPlayerEventStatistics.getPitchingInningsPitched() : null) <= 0.0d) {
                if (roles == null || !roles.isEmpty()) {
                    Iterator<T> it2 = roles.iterator();
                    while (it2.hasNext()) {
                        if (((BaseballRole) it2.next()) == BaseballRole.Pitcher) {
                        }
                    }
                }
                z2 = false;
                boolean z4 = roles.size() != 1 && CollectionsKt.Y(roles) == BaseballRole.DesignatedHitter;
                if ((!z || z2) && !z4) {
                    z3 = true;
                }
                xbb b = a.b();
                if (z) {
                    b.add(wj1.b);
                }
                if (z2) {
                    b.add(wj1.c);
                }
                if (z3) {
                    b.add(wj1.d);
                }
                a = a.a(b);
                wj1Var = this.s.b;
                if (!CollectionsKt.R(a, wj1Var)) {
                    wj1Var = null;
                }
                if (wj1Var == null) {
                    hzd hzdVar = this.h;
                    if (hzdVar != null && (wj1Var2 = hzdVar.m) != null && a.contains(wj1Var2)) {
                        wj1Var3 = wj1Var2;
                    }
                    wj1Var = wj1Var3 == null ? (wj1) CollectionsKt.firstOrNull(a) : wj1Var3;
                }
                this.s = new ope(l6g.W(a), wj1Var);
            }
            z2 = true;
            if (roles.size() != 1) {
            }
            if (!z) {
            }
            z3 = true;
            xbb b2 = a.b();
            if (z) {
            }
            if (z2) {
            }
            if (z3) {
            }
            a = a.a(b2);
            wj1Var = this.s.b;
            if (!CollectionsKt.R(a, wj1Var)) {
            }
            if (wj1Var == null) {
            }
            this.s = new ope(l6g.W(a), wj1Var);
        }
        z = true;
        if (yid.k(baseballPlayerEventStatistics == null ? baseballPlayerEventStatistics.getPitchingInningsPitched() : null) <= 0.0d) {
        }
        z2 = true;
        if (roles.size() != 1) {
        }
        if (!z) {
        }
        z3 = true;
        xbb b22 = a.b();
        if (z) {
        }
        if (z2) {
        }
        if (z3) {
        }
        a = a.a(b22);
        wj1Var = this.s.b;
        if (!CollectionsKt.R(a, wj1Var)) {
        }
        if (wj1Var == null) {
        }
        this.s = new ope(l6g.W(a), wj1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3 A[LOOP:0: B:10:0x003b->B:12:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[EDGE_INSN: B:13:0x0054->B:14:0x0054 BREAK  A[LOOP:0: B:10:0x003b->B:12:0x00b3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(pzd pzdVar) {
        lwj lwjVar;
        fdi fdiVar;
        Object value;
        pzd pzdVar2;
        boolean z;
        hzd hzdVar;
        List list;
        Iterator it;
        Object obj;
        xoe xoeVar;
        PlayerEventStatisticsResponse playerEventStatisticsResponse;
        Player player;
        if (pzdVar != null) {
            ozd ozdVar = (ozd) this.y.getValue();
            ozdVar.getClass();
            Set set = (Set) ozdVar.a.get(pzdVar);
            if (set == null) {
                set = rm5.a;
            }
            List list2 = this.v;
            if (list2 != null) {
                lwjVar = i5h.n(i5h.g(new oh0(list2, 1), new ph4(3, set)), new jie(10));
                while (true) {
                    fdiVar = this.q;
                    value = fdiVar.getValue();
                    pzdVar2 = pzdVar;
                    if (!fdiVar.k(value, xzd.a((xzd) value, null, null, null, pzdVar2, 63))) {
                        break;
                    } else {
                        pzdVar = pzdVar2;
                    }
                }
                if (lwjVar != null || (r12 = l6g.a0(lwjVar)) == null) {
                    gv9 gv9Var = rlh.b;
                }
                z = false;
                hzdVar = this.h;
                if (hzdVar != null && (list = hzdVar.c) != null) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = it.next();
                            xoe xoeVar2 = (xoe) obj;
                            ppe ppeVar = (ppe) this.i.d();
                            if (ppeVar != null && (playerEventStatisticsResponse = ppeVar.a) != null && (player = playerEventStatisticsResponse.getPlayer()) != null && xoeVar2.a.getId() == player.getId()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    xoeVar = (xoe) obj;
                    if (xoeVar != null && xoeVar.f == 2) {
                        z = true;
                    }
                }
                lzd lzdVar = new lzd(gv9Var, true ^ z);
                fdi fdiVar2 = this.t;
                fdiVar2.getClass();
                fdiVar2.m(null, lzdVar);
            }
        }
        lwjVar = null;
        while (true) {
            fdiVar = this.q;
            value = fdiVar.getValue();
            pzdVar2 = pzdVar;
            if (!fdiVar.k(value, xzd.a((xzd) value, null, null, null, pzdVar2, 63))) {
            }
            pzdVar = pzdVar2;
        }
        if (lwjVar != null) {
        }
        gv9 gv9Var2 = rlh.b;
        z = false;
        hzdVar = this.h;
        if (hzdVar != null) {
            it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            xoeVar = (xoe) obj;
            if (xoeVar != null) {
                z = true;
            }
        }
        lzd lzdVar2 = new lzd(gv9Var2, true ^ z);
        fdi fdiVar22 = this.t;
        fdiVar22.getClass();
        fdiVar22.m(null, lzdVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(int i, int i2, sq3 sq3Var) {
        spe speVar;
        int i3;
        if (sq3Var instanceof spe) {
            speVar = (spe) sq3Var;
            int i4 = speVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                speVar.t = i4 - Integer.MIN_VALUE;
                Object obj = speVar.r;
                lu3 lu3Var = lu3.a;
                i3 = speVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    speVar.t = 1;
                    g39 g39Var = this.f;
                    g39Var.getClass();
                    obj = yaa.P(new w29(g39Var, i, i2, null, 7), speVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        speVar = new spe(this, sq3Var);
        Object obj2 = speVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = speVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable o(int i, int i2, sq3 sq3Var) {
        tpe tpeVar;
        int i3;
        PlayerHeatmapResponse playerHeatmapResponse;
        if (sq3Var instanceof tpe) {
            tpeVar = (tpe) sq3Var;
            int i4 = tpeVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tpeVar.t = i4 - Integer.MIN_VALUE;
                Object obj = tpeVar.r;
                lu3 lu3Var = lu3.a;
                i3 = tpeVar.t;
                rq3 rq3Var = null;
                if (i3 != 0) {
                    y6a.M(obj);
                    tpeVar.t = 1;
                    g39 g39Var = this.f;
                    g39Var.getClass();
                    obj = yaa.P(new w29(g39Var, i, i2, rq3Var, 6), tpeVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                playerHeatmapResponse = (PlayerHeatmapResponse) yaa.x((x2g) obj);
                if (playerHeatmapResponse != null || playerHeatmapResponse.getHeatmap().size() <= 5) {
                    return null;
                }
                return playerHeatmapResponse;
            }
        }
        tpeVar = new tpe(this, sq3Var);
        Object obj2 = tpeVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = tpeVar.t;
        rq3 rq3Var2 = null;
        if (i3 != 0) {
        }
        playerHeatmapResponse = (PlayerHeatmapResponse) yaa.x((x2g) obj2);
        if (playerHeatmapResponse != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(int i, int i2, sq3 sq3Var) {
        upe upeVar;
        int i3;
        if (sq3Var instanceof upe) {
            upeVar = (upe) sq3Var;
            int i4 = upeVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                upeVar.t = i4 - Integer.MIN_VALUE;
                Object obj = upeVar.r;
                lu3 lu3Var = lu3.a;
                i3 = upeVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    upeVar.t = 1;
                    g39 g39Var = this.f;
                    g39Var.getClass();
                    obj = yaa.P(new w29(g39Var, i, i2, null, 4), upeVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        upeVar = new upe(this, sq3Var);
        Object obj2 = upeVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = upeVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(int i, int i2, boolean z, sq3 sq3Var) {
        vpe vpeVar;
        int i3;
        if (sq3Var instanceof vpe) {
            vpeVar = (vpe) sq3Var;
            int i4 = vpeVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vpeVar.t = i4 - Integer.MIN_VALUE;
                Object obj = vpeVar.r;
                lu3 lu3Var = lu3.a;
                i3 = vpeVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    vpeVar.t = 1;
                    g39 g39Var = this.f;
                    g39Var.getClass();
                    obj = yaa.P(new b39(g39Var, i, i2, z, null), vpeVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        vpeVar = new vpe(this, sq3Var);
        Object obj2 = vpeVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = vpeVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(int i, sq3 sq3Var) {
        wpe wpeVar;
        int i2;
        if (sq3Var instanceof wpe) {
            wpeVar = (wpe) sq3Var;
            int i3 = wpeVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wpeVar.t = i3 - Integer.MIN_VALUE;
                Object obj = wpeVar.r;
                lu3 lu3Var = lu3.a;
                i2 = wpeVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    wpeVar.t = 1;
                    obj = this.e.i(i, wpeVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        wpeVar = new wpe(this, sq3Var);
        Object obj2 = wpeVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = wpeVar.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(int i, int i2, sq3 sq3Var) {
        xpe xpeVar;
        int i3;
        if (sq3Var instanceof xpe) {
            xpeVar = (xpe) sq3Var;
            int i4 = xpeVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                xpeVar.t = i4 - Integer.MIN_VALUE;
                Object obj = xpeVar.r;
                lu3 lu3Var = lu3.a;
                i3 = xpeVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    xpeVar.t = 1;
                    obj = this.e.j(i, i2, xpeVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        xpeVar = new xpe(this, sq3Var);
        Object obj2 = xpeVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = xpeVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(int i, int i2, int i3, sq3 sq3Var, String str) {
        ype ypeVar;
        int i4;
        if (sq3Var instanceof ype) {
            ypeVar = (ype) sq3Var;
            int i5 = ypeVar.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ypeVar.t = i5 - Integer.MIN_VALUE;
                Object obj = ypeVar.r;
                lu3 lu3Var = lu3.a;
                i4 = ypeVar.t;
                if (i4 != 0) {
                    y6a.M(obj);
                    ypeVar.t = 1;
                    wve wveVar = this.e;
                    wveVar.getClass();
                    obj = yaa.P(new sve(wveVar, i, i2, i3, str, null, 1), ypeVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        ypeVar = new ype(this, sq3Var);
        Object obj2 = ypeVar.r;
        lu3 lu3Var2 = lu3.a;
        i4 = ypeVar.t;
        if (i4 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final void y(int i, int i2, String str, Integer num, Integer num2, String str2, boolean z) {
        str2.getClass();
        xw3.L(un0.z(this), null, null, new cqe(str2, i, num, num2, str, this, i2, z, null), 3);
    }
}
