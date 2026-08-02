package defpackage;

import android.os.Build;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zt6 implements ct8 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hu6 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ il8 e;
    public final /* synthetic */ p3e f;

    public /* synthetic */ zt6(hu6 hu6Var, Function1 function1, String str, il8 il8Var, p3e p3eVar) {
        this.b = hu6Var;
        this.c = function1;
        this.d = str;
        this.e = il8Var;
        this.f = p3eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0400  */
    /* JADX WARN: Type inference failed for: r14v1, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v33 */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        ?? r7;
        av8 av8Var;
        boolean z;
        av8 av8Var2;
        ev6 ev6Var;
        final int i2;
        av8 av8Var3;
        mj7 mj7Var;
        boolean z2;
        il8 il8Var;
        gv9 gv9Var;
        boolean z3;
        xtc Z;
        boolean g;
        Object O;
        boolean g2;
        Object O2;
        final int i3;
        boolean g3;
        Object O3;
        switch (this.a) {
            case 0:
                uj7 uj7Var = (uj7) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                uj7Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).e(uj7Var.ordinal()) ? 4 : 2;
                }
                ?? r14 = (av8) of3Var;
                if (r14.T(intValue & 1, (intValue & 19) != 18)) {
                    int ordinal = uj7Var.ordinal();
                    final hu6 hu6Var = this.b;
                    if (ordinal != 0) {
                        final Function1 function1 = this.c;
                        Object obj4 = nf3.a;
                        if (ordinal == 1) {
                            i = 6;
                            r14.d0(1160754340);
                            boolean g4 = r14.g(function1);
                            Object O4 = r14.O();
                            if (g4 || O4 == obj4) {
                                O4 = new rt6(0, function1);
                                r14.n0(O4);
                            }
                            yqo.f((Function0) O4, l98.d0(bkh.r(bkh.c, null, 3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 0L, r14, 48, 4);
                            av8 av8Var4 = r14;
                            av8Var4.s(false);
                            Unit unit = Unit.a;
                            r7 = 0;
                            av8Var = av8Var4;
                        } else {
                            if (ordinal != 2) {
                                throw dmi.h(r14, 1838568436, false);
                            }
                            r14.d0(1161689982);
                            gv9 gv9Var2 = hu6Var.d;
                            gv9 gv9Var3 = hu6Var.f;
                            do7 do7Var = hu6Var.b;
                            ho7 ho7Var = hu6Var.c;
                            if (gv9Var2 != null && hu6Var.e != null && ho7Var != null) {
                                mj7 mj7Var2 = ho7Var.a;
                                if (gv9Var3 != null && do7Var != null) {
                                    ev6 ev6Var2 = do7Var.c;
                                    FantasyCompetitionType fantasyCompetitionType = ev6Var2.d;
                                    r14.d0(1161881655);
                                    png pngVar = new png(8.0f, uxf.l);
                                    xtc f0 = ml4.f0(l98.f0(hkg.u0(bkh.c, u0a.J(r14), false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7));
                                    u23 a = t23.a(pngVar, uxf.o, r14, 6);
                                    int hashCode = Long.hashCode(r14.T);
                                    aee m = r14.m();
                                    xtc C = fqj.C(r14, f0);
                                    if3.k7.getClass();
                                    zg3 zg3Var = hf3.b;
                                    r14.h0();
                                    if (r14.S) {
                                        r14.l(zg3Var);
                                    } else {
                                        r14.q0();
                                    }
                                    f50 f50Var = hf3.g;
                                    waa.K(r14, a, f50Var);
                                    ff3 ff3Var = hf3.f;
                                    waa.K(r14, m, ff3Var);
                                    Integer valueOf = Integer.valueOf(hashCode);
                                    f50 f50Var2 = hf3.j;
                                    waa.K(r14, valueOf, f50Var2);
                                    ry ryVar = hf3.k;
                                    waa.J(r14, ryVar);
                                    f50 f50Var3 = hf3.d;
                                    waa.K(r14, C, f50Var3);
                                    ho7 ho7Var2 = hu6Var.c;
                                    gv9 gv9Var4 = hu6Var.d;
                                    gv9 gv9Var5 = hu6Var.e;
                                    utc utcVar = utc.a;
                                    xtc E = d2a.E(utcVar, 8.0f, null, false, 0L, 30);
                                    long D = lz.D(R.color.surface_1, r14);
                                    jf9 jf9Var = oyn.e;
                                    xtc q = n9e.q(E, D, jf9Var);
                                    boolean g5 = r14.g(function1);
                                    Object O5 = r14.O();
                                    if (g5 || O5 == obj4) {
                                        O5 = new k46(9, function1);
                                        r14.n0(O5);
                                    }
                                    fcp.Q(ho7Var2, (Function1) O5, gv9Var5, gv9Var4, q, r14, 0);
                                    int i4 = eu6.a[fantasyCompetitionType.ordinal()];
                                    String str = this.d;
                                    if (i4 == 1) {
                                        ev6Var = ev6Var2;
                                        r14.d0(1394115192);
                                        ho7 ho7Var3 = hu6Var.c;
                                        gv9 W = l6g.W(ph0.x(new vl7[]{hu6Var.q, hu6Var.p, hu6Var.o}));
                                        boolean g6 = r14.g(function1);
                                        Object O6 = r14.O();
                                        if (g6 || O6 == obj4) {
                                            O6 = new k46(10, function1);
                                            r14.n0(O6);
                                        }
                                        fkf.f(ho7Var3, str, (Function1) O6, null, W, r14, 0, 8);
                                        i2 = 0;
                                        r14.s(false);
                                        Unit unit2 = Unit.a;
                                        av8Var3 = r14;
                                    } else {
                                        if (i4 != 2) {
                                            throw dmi.h(r14, 322062243, false);
                                        }
                                        r14.d0(1394764394);
                                        ho7 ho7Var4 = hu6Var.c;
                                        rx6 rx6Var = hu6Var.v;
                                        gv9 gv9Var6 = hu6Var.u;
                                        if (gv9Var6 == null) {
                                            gv9Var6 = rlh.b;
                                        }
                                        boolean z4 = ev6Var2.A;
                                        boolean g7 = r14.g(function1);
                                        ev6Var = ev6Var2;
                                        Object O7 = r14.O();
                                        if (g7 || O7 == obj4) {
                                            O7 = new rt6(1, function1);
                                            r14.n0(O7);
                                        }
                                        Function0 function0 = (Function0) O7;
                                        boolean g8 = r14.g(function1) | r14.g(hu6Var);
                                        Object O8 = r14.O();
                                        if (g8 || O8 == obj4) {
                                            O8 = new st6(function1, hu6Var);
                                            r14.n0(O8);
                                        }
                                        l6g.l(ho7Var4, rx6Var, gv9Var6, str, function0, (Function0) O8, z4, null, r14, 0);
                                        av8 av8Var5 = r14;
                                        i2 = 0;
                                        av8Var5.s(false);
                                        Unit unit3 = Unit.a;
                                        av8Var3 = av8Var5;
                                    }
                                    dy0.a(hu6Var.w != null ? 1 : i2, null, yqo.H(470525863, av8Var3, new ct8() { // from class: tt6
                                        @Override // defpackage.ct8
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            ImageVector N;
                                            String str2;
                                            int i5 = i2;
                                            utc utcVar2 = utc.a;
                                            a99 a99Var = nf3.a;
                                            hu6 hu6Var2 = hu6Var;
                                            switch (i5) {
                                                case 0:
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    av8 av8Var6 = (av8) ((of3) obj6);
                                                    Object O9 = av8Var6.O();
                                                    if (O9 == a99Var) {
                                                        O9 = e.f(hu6Var2.w);
                                                        av8Var6.n0(O9);
                                                    }
                                                    e1d e1dVar = (e1d) O9;
                                                    FantasyRemoteAnnouncement fantasyRemoteAnnouncement = hu6Var2.w;
                                                    boolean g9 = av8Var6.g(hu6Var2);
                                                    Object O10 = av8Var6.O();
                                                    if (g9 || O10 == a99Var) {
                                                        O10 = new du6(hu6Var2, e1dVar, null, 0);
                                                        av8Var6.n0(O10);
                                                    }
                                                    hz8.o(av8Var6, fantasyRemoteAnnouncement, (Function2) O10);
                                                    FantasyRemoteAnnouncement fantasyRemoteAnnouncement2 = (FantasyRemoteAnnouncement) e1dVar.getValue();
                                                    if (fantasyRemoteAnnouncement2 == null) {
                                                        av8Var6.d0(-1336800635);
                                                        av8Var6.s(false);
                                                    } else {
                                                        av8Var6.d0(-1336800634);
                                                        c5n.d(fantasyRemoteAnnouncement2, l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var6, 48);
                                                        av8Var6.s(false);
                                                    }
                                                    break;
                                                case 1:
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    av8 av8Var7 = (av8) ((of3) obj6);
                                                    Object O11 = av8Var7.O();
                                                    if (O11 == a99Var) {
                                                        O11 = e.f(hu6Var2.c.a);
                                                        av8Var7.n0(O11);
                                                    }
                                                    e1d e1dVar2 = (e1d) O11;
                                                    ho7 ho7Var5 = hu6Var2.c;
                                                    boolean g10 = av8Var7.g(hu6Var2);
                                                    Object O12 = av8Var7.O();
                                                    if (g10 || O12 == a99Var) {
                                                        O12 = new du6(hu6Var2, e1dVar2, null, 1);
                                                        av8Var7.n0(O12);
                                                    }
                                                    hz8.o(av8Var7, ho7Var5, (Function2) O12);
                                                    o1j.f((mj7) e1dVar2.getValue(), l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var7, 48);
                                                    break;
                                                default:
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    av8 av8Var8 = (av8) ((of3) obj6);
                                                    Object O13 = av8Var8.O();
                                                    if (O13 == a99Var) {
                                                        O13 = e.f(hu6Var2.c);
                                                        av8Var8.n0(O13);
                                                    }
                                                    e1d e1dVar3 = (e1d) O13;
                                                    ho7 ho7Var6 = hu6Var2.c;
                                                    boolean g11 = av8Var8.g(hu6Var2);
                                                    Object O14 = av8Var8.O();
                                                    if (g11 || O14 == a99Var) {
                                                        O14 = new du6(hu6Var2, e1dVar3, null, 2);
                                                        av8Var8.n0(O14);
                                                    }
                                                    hz8.o(av8Var8, ho7Var6, (Function2) O14);
                                                    if (((ho7) e1dVar3.getValue()).g) {
                                                        av8Var8.d0(-1938061199);
                                                        N = s6a.N(R.drawable.ic_triple_captain, 6, av8Var8);
                                                        av8Var8.s(false);
                                                    } else {
                                                        av8Var8.d0(-1938057689);
                                                        N = s6a.N(R.drawable.ic_team, 6, av8Var8);
                                                        av8Var8.s(false);
                                                    }
                                                    ImageVector imageVector = N;
                                                    if (((ho7) e1dVar3.getValue()).g) {
                                                        av8Var8.d0(-1938050982);
                                                        str2 = oea.v(((ho7) e1dVar3.getValue()).a.d() ? R.string.fantasy_triple_captain_token_used_info : R.string.fantasy_triple_captain_active_info, av8Var8);
                                                        av8Var8.s(false);
                                                    } else if (((ho7) e1dVar3.getValue()).e) {
                                                        av8Var8.d0(-1938043848);
                                                        str2 = oea.v(((ho7) e1dVar3.getValue()).a.d() ? R.string.fantasy_rebuild_squad_token_used_info : R.string.fantasy_rebuild_squad_active_info, av8Var8);
                                                        av8Var8.s(false);
                                                    } else if (((ho7) e1dVar3.getValue()).f) {
                                                        av8Var8.d0(-1938036816);
                                                        str2 = oea.v(((ho7) e1dVar3.getValue()).a.d() ? R.string.fantasy_quick_fix_token_used_info : R.string.fantasy_quick_fix_active_info, av8Var8);
                                                        av8Var8.s(false);
                                                    } else {
                                                        av8Var8.d0(50587902);
                                                        av8Var8.s(false);
                                                        str2 = "";
                                                    }
                                                    m6k.h(384, 8, av8Var8, l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), imageVector, str2, null, !((ho7) e1dVar3.getValue()).g);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    }), av8Var3, 384);
                                    Boolean bool = hu6Var.l;
                                    Boolean bool2 = Boolean.TRUE;
                                    final int i5 = 1;
                                    dy0.a(Intrinsics.c(bool, bool2), null, yqo.H(355131550, av8Var3, new ct8() { // from class: tt6
                                        @Override // defpackage.ct8
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            ImageVector N;
                                            String str2;
                                            int i52 = i5;
                                            utc utcVar2 = utc.a;
                                            a99 a99Var = nf3.a;
                                            hu6 hu6Var2 = hu6Var;
                                            switch (i52) {
                                                case 0:
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    av8 av8Var6 = (av8) ((of3) obj6);
                                                    Object O9 = av8Var6.O();
                                                    if (O9 == a99Var) {
                                                        O9 = e.f(hu6Var2.w);
                                                        av8Var6.n0(O9);
                                                    }
                                                    e1d e1dVar = (e1d) O9;
                                                    FantasyRemoteAnnouncement fantasyRemoteAnnouncement = hu6Var2.w;
                                                    boolean g9 = av8Var6.g(hu6Var2);
                                                    Object O10 = av8Var6.O();
                                                    if (g9 || O10 == a99Var) {
                                                        O10 = new du6(hu6Var2, e1dVar, null, 0);
                                                        av8Var6.n0(O10);
                                                    }
                                                    hz8.o(av8Var6, fantasyRemoteAnnouncement, (Function2) O10);
                                                    FantasyRemoteAnnouncement fantasyRemoteAnnouncement2 = (FantasyRemoteAnnouncement) e1dVar.getValue();
                                                    if (fantasyRemoteAnnouncement2 == null) {
                                                        av8Var6.d0(-1336800635);
                                                        av8Var6.s(false);
                                                    } else {
                                                        av8Var6.d0(-1336800634);
                                                        c5n.d(fantasyRemoteAnnouncement2, l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var6, 48);
                                                        av8Var6.s(false);
                                                    }
                                                    break;
                                                case 1:
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    av8 av8Var7 = (av8) ((of3) obj6);
                                                    Object O11 = av8Var7.O();
                                                    if (O11 == a99Var) {
                                                        O11 = e.f(hu6Var2.c.a);
                                                        av8Var7.n0(O11);
                                                    }
                                                    e1d e1dVar2 = (e1d) O11;
                                                    ho7 ho7Var5 = hu6Var2.c;
                                                    boolean g10 = av8Var7.g(hu6Var2);
                                                    Object O12 = av8Var7.O();
                                                    if (g10 || O12 == a99Var) {
                                                        O12 = new du6(hu6Var2, e1dVar2, null, 1);
                                                        av8Var7.n0(O12);
                                                    }
                                                    hz8.o(av8Var7, ho7Var5, (Function2) O12);
                                                    o1j.f((mj7) e1dVar2.getValue(), l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var7, 48);
                                                    break;
                                                default:
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    av8 av8Var8 = (av8) ((of3) obj6);
                                                    Object O13 = av8Var8.O();
                                                    if (O13 == a99Var) {
                                                        O13 = e.f(hu6Var2.c);
                                                        av8Var8.n0(O13);
                                                    }
                                                    e1d e1dVar3 = (e1d) O13;
                                                    ho7 ho7Var6 = hu6Var2.c;
                                                    boolean g11 = av8Var8.g(hu6Var2);
                                                    Object O14 = av8Var8.O();
                                                    if (g11 || O14 == a99Var) {
                                                        O14 = new du6(hu6Var2, e1dVar3, null, 2);
                                                        av8Var8.n0(O14);
                                                    }
                                                    hz8.o(av8Var8, ho7Var6, (Function2) O14);
                                                    if (((ho7) e1dVar3.getValue()).g) {
                                                        av8Var8.d0(-1938061199);
                                                        N = s6a.N(R.drawable.ic_triple_captain, 6, av8Var8);
                                                        av8Var8.s(false);
                                                    } else {
                                                        av8Var8.d0(-1938057689);
                                                        N = s6a.N(R.drawable.ic_team, 6, av8Var8);
                                                        av8Var8.s(false);
                                                    }
                                                    ImageVector imageVector = N;
                                                    if (((ho7) e1dVar3.getValue()).g) {
                                                        av8Var8.d0(-1938050982);
                                                        str2 = oea.v(((ho7) e1dVar3.getValue()).a.d() ? R.string.fantasy_triple_captain_token_used_info : R.string.fantasy_triple_captain_active_info, av8Var8);
                                                        av8Var8.s(false);
                                                    } else if (((ho7) e1dVar3.getValue()).e) {
                                                        av8Var8.d0(-1938043848);
                                                        str2 = oea.v(((ho7) e1dVar3.getValue()).a.d() ? R.string.fantasy_rebuild_squad_token_used_info : R.string.fantasy_rebuild_squad_active_info, av8Var8);
                                                        av8Var8.s(false);
                                                    } else if (((ho7) e1dVar3.getValue()).f) {
                                                        av8Var8.d0(-1938036816);
                                                        str2 = oea.v(((ho7) e1dVar3.getValue()).a.d() ? R.string.fantasy_quick_fix_token_used_info : R.string.fantasy_quick_fix_active_info, av8Var8);
                                                        av8Var8.s(false);
                                                    } else {
                                                        av8Var8.d0(50587902);
                                                        av8Var8.s(false);
                                                        str2 = "";
                                                    }
                                                    m6k.h(384, 8, av8Var8, l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), imageVector, str2, null, !((ho7) e1dVar3.getValue()).g);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    }), av8Var3, 384);
                                    dy0.a(hu6Var.m, null, yqo.H(1566499999, av8Var3, new y47(13, function1)), av8Var3, 384);
                                    final int i6 = 2;
                                    dy0.a(ho7Var.d(), null, yqo.H(-1517098848, av8Var3, new ct8() { // from class: tt6
                                        @Override // defpackage.ct8
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            ImageVector N;
                                            String str2;
                                            int i52 = i6;
                                            utc utcVar2 = utc.a;
                                            a99 a99Var = nf3.a;
                                            hu6 hu6Var2 = hu6Var;
                                            switch (i52) {
                                                case 0:
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    av8 av8Var6 = (av8) ((of3) obj6);
                                                    Object O9 = av8Var6.O();
                                                    if (O9 == a99Var) {
                                                        O9 = e.f(hu6Var2.w);
                                                        av8Var6.n0(O9);
                                                    }
                                                    e1d e1dVar = (e1d) O9;
                                                    FantasyRemoteAnnouncement fantasyRemoteAnnouncement = hu6Var2.w;
                                                    boolean g9 = av8Var6.g(hu6Var2);
                                                    Object O10 = av8Var6.O();
                                                    if (g9 || O10 == a99Var) {
                                                        O10 = new du6(hu6Var2, e1dVar, null, 0);
                                                        av8Var6.n0(O10);
                                                    }
                                                    hz8.o(av8Var6, fantasyRemoteAnnouncement, (Function2) O10);
                                                    FantasyRemoteAnnouncement fantasyRemoteAnnouncement2 = (FantasyRemoteAnnouncement) e1dVar.getValue();
                                                    if (fantasyRemoteAnnouncement2 == null) {
                                                        av8Var6.d0(-1336800635);
                                                        av8Var6.s(false);
                                                    } else {
                                                        av8Var6.d0(-1336800634);
                                                        c5n.d(fantasyRemoteAnnouncement2, l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var6, 48);
                                                        av8Var6.s(false);
                                                    }
                                                    break;
                                                case 1:
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    av8 av8Var7 = (av8) ((of3) obj6);
                                                    Object O11 = av8Var7.O();
                                                    if (O11 == a99Var) {
                                                        O11 = e.f(hu6Var2.c.a);
                                                        av8Var7.n0(O11);
                                                    }
                                                    e1d e1dVar2 = (e1d) O11;
                                                    ho7 ho7Var5 = hu6Var2.c;
                                                    boolean g10 = av8Var7.g(hu6Var2);
                                                    Object O12 = av8Var7.O();
                                                    if (g10 || O12 == a99Var) {
                                                        O12 = new du6(hu6Var2, e1dVar2, null, 1);
                                                        av8Var7.n0(O12);
                                                    }
                                                    hz8.o(av8Var7, ho7Var5, (Function2) O12);
                                                    o1j.f((mj7) e1dVar2.getValue(), l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var7, 48);
                                                    break;
                                                default:
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    av8 av8Var8 = (av8) ((of3) obj6);
                                                    Object O13 = av8Var8.O();
                                                    if (O13 == a99Var) {
                                                        O13 = e.f(hu6Var2.c);
                                                        av8Var8.n0(O13);
                                                    }
                                                    e1d e1dVar3 = (e1d) O13;
                                                    ho7 ho7Var6 = hu6Var2.c;
                                                    boolean g11 = av8Var8.g(hu6Var2);
                                                    Object O14 = av8Var8.O();
                                                    if (g11 || O14 == a99Var) {
                                                        O14 = new du6(hu6Var2, e1dVar3, null, 2);
                                                        av8Var8.n0(O14);
                                                    }
                                                    hz8.o(av8Var8, ho7Var6, (Function2) O14);
                                                    if (((ho7) e1dVar3.getValue()).g) {
                                                        av8Var8.d0(-1938061199);
                                                        N = s6a.N(R.drawable.ic_triple_captain, 6, av8Var8);
                                                        av8Var8.s(false);
                                                    } else {
                                                        av8Var8.d0(-1938057689);
                                                        N = s6a.N(R.drawable.ic_team, 6, av8Var8);
                                                        av8Var8.s(false);
                                                    }
                                                    ImageVector imageVector = N;
                                                    if (((ho7) e1dVar3.getValue()).g) {
                                                        av8Var8.d0(-1938050982);
                                                        str2 = oea.v(((ho7) e1dVar3.getValue()).a.d() ? R.string.fantasy_triple_captain_token_used_info : R.string.fantasy_triple_captain_active_info, av8Var8);
                                                        av8Var8.s(false);
                                                    } else if (((ho7) e1dVar3.getValue()).e) {
                                                        av8Var8.d0(-1938043848);
                                                        str2 = oea.v(((ho7) e1dVar3.getValue()).a.d() ? R.string.fantasy_rebuild_squad_token_used_info : R.string.fantasy_rebuild_squad_active_info, av8Var8);
                                                        av8Var8.s(false);
                                                    } else if (((ho7) e1dVar3.getValue()).f) {
                                                        av8Var8.d0(-1938036816);
                                                        str2 = oea.v(((ho7) e1dVar3.getValue()).a.d() ? R.string.fantasy_quick_fix_token_used_info : R.string.fantasy_quick_fix_active_info, av8Var8);
                                                        av8Var8.s(false);
                                                    } else {
                                                        av8Var8.d0(50587902);
                                                        av8Var8.s(false);
                                                        str2 = "";
                                                    }
                                                    m6k.h(384, 8, av8Var8, l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), imageVector, str2, null, !((ho7) e1dVar3.getValue()).g);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    }), av8Var3, 384);
                                    rz0.a(new sz0(AdType.Banner.FantasySmall, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var3, 24960, 10);
                                    k1c c = e12.c(uxf.g, false);
                                    int hashCode2 = Long.hashCode(av8Var3.T);
                                    aee m2 = av8Var3.m();
                                    xtc C2 = fqj.C(av8Var3, utcVar);
                                    av8Var3.h0();
                                    if (av8Var3.S) {
                                        av8Var3.l(zg3Var);
                                    } else {
                                        av8Var3.q0();
                                    }
                                    waa.K(av8Var3, c, f50Var);
                                    waa.K(av8Var3, m2, ff3Var);
                                    bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
                                    waa.K(av8Var3, C2, f50Var3);
                                    if (gv9Var3.isEmpty()) {
                                        mj7Var = mj7Var2;
                                    } else {
                                        mj7Var = mj7Var2;
                                        if (!Boolean.valueOf(mj7Var.n).equals(bool2)) {
                                            z2 = false;
                                            gv9 gv9Var7 = hu6Var.f;
                                            gv9 gv9Var8 = hu6Var.g;
                                            il8Var = this.e;
                                            if (il8Var == null) {
                                                il8Var = il8.f;
                                            }
                                            boolean z5 = hu6Var.n;
                                            boolean z6 = ho7Var.g;
                                            boolean h = mj7Var.h();
                                            if (Build.VERSION.SDK_INT < 31) {
                                                av8Var3.d0(-1700105153);
                                                float f = z2 ? 12.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                Z = yqo.u(utcVar, f, f, jf9Var);
                                                av8Var3.s(false);
                                                gv9Var = gv9Var8;
                                            } else {
                                                av8Var3.d0(-716154274);
                                                long D2 = lz.D(R.color.darken_overlay_3, av8Var3);
                                                boolean h2 = av8Var3.h(z2) | av8Var3.f(D2);
                                                gv9Var = gv9Var8;
                                                Object O9 = av8Var3.O();
                                                if (h2 || O9 == obj4) {
                                                    z3 = false;
                                                    O9 = new ut6(z2, D2, 0);
                                                    av8Var3.n0(O9);
                                                } else {
                                                    z3 = false;
                                                }
                                                Z = td4.Z(utcVar, (Function1) O9);
                                                av8Var3.s(z3);
                                            }
                                            xtc xtcVar = Z;
                                            g = av8Var3.g(function1) | av8Var3.g(hu6Var);
                                            O = av8Var3.O();
                                            if (!g || O == obj4) {
                                                O = new vt6(1, hu6Var, function1);
                                                av8Var3.n0(O);
                                            }
                                            Function1 function12 = (Function1) O;
                                            g2 = av8Var3.g(function1);
                                            O2 = av8Var3.O();
                                            if (!g2 || O2 == obj4) {
                                                O2 = new rt6(4, function1);
                                                av8Var3.n0(O2);
                                            }
                                            av8 av8Var6 = av8Var3;
                                            tol.j(gv9Var7, ev6Var, function12, il8Var, (Function0) O2, z5, z6, h, xtcVar, false, gv9Var, av8Var6, 0, 512);
                                            av8 av8Var7 = av8Var6;
                                            if (z2) {
                                                i3 = 0;
                                                av8Var7.d0(-670191521);
                                                av8Var7.s(false);
                                            } else {
                                                av8Var7.d0(-670637425);
                                                xtc b = n12.a.b(utcVar);
                                                Object O10 = av8Var7.O();
                                                if (O10 == obj4) {
                                                    O10 = new au6(0);
                                                    av8Var7.n0(O10);
                                                }
                                                xtc y = tol.y(b, false, false, false, 0L, null, (Function0) O10, av8Var7, 30);
                                                av8Var7 = av8Var7;
                                                i3 = 0;
                                                e12.a(0, av8Var7, y);
                                                av8Var7.s(false);
                                            }
                                            i = 6;
                                            av8 av8Var8 = av8Var7;
                                            fz8.e((gv9Var3.isEmpty() || hu6Var.r) ? i3 : 1, null, uo5.e(s02.h0(200, i3, null, 6), 2), uo5.f(s02.h0(200, i3, null, 6), 2), null, yqo.H(440794331, av8Var7, new ct8() { // from class: bu6
                                                @Override // defpackage.ct8
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    lj7 lj7Var;
                                                    Object obj8;
                                                    int i7 = i3;
                                                    a99 a99Var = nf3.a;
                                                    Function1 function13 = function1;
                                                    hu6 hu6Var2 = hu6Var;
                                                    switch (i7) {
                                                        case 0:
                                                            ((Integer) obj7).getClass();
                                                            ((r70) obj5).getClass();
                                                            av8 av8Var9 = (av8) ((of3) obj6);
                                                            Object O11 = av8Var9.O();
                                                            if (O11 == a99Var) {
                                                                O11 = e.f(hu6Var2.c.a);
                                                                av8Var9.n0(O11);
                                                            }
                                                            e1d e1dVar = (e1d) O11;
                                                            Boolean valueOf2 = Boolean.valueOf(hu6Var2.f.isEmpty());
                                                            Boolean valueOf3 = Boolean.valueOf(hu6Var2.r);
                                                            boolean g9 = av8Var9.g(hu6Var2);
                                                            Object O12 = av8Var9.O();
                                                            if (g9 || O12 == a99Var) {
                                                                O12 = new du6(hu6Var2, e1dVar, null, 3);
                                                                av8Var9.n0(O12);
                                                            }
                                                            hz8.q(valueOf2, valueOf3, (Function2) O12, av8Var9);
                                                            boolean c2 = Intrinsics.c(hu6Var2.u != null ? Boolean.valueOf(!r5.isEmpty()) : null, Boolean.TRUE);
                                                            Long l = ((mj7) e1dVar.getValue()).h;
                                                            long longValue = l != null ? l.longValue() : 0L;
                                                            int i8 = ((mj7) e1dVar.getValue()).c;
                                                            boolean g10 = av8Var9.g(function13) | av8Var9.g(hu6Var2);
                                                            Object O13 = av8Var9.O();
                                                            if (g10 || O13 == a99Var) {
                                                                O13 = new vt6(0, hu6Var2, function13);
                                                                av8Var9.n0(O13);
                                                            }
                                                            n9e.g(i8, 0, longValue, av8Var9, null, (Function1) O13, c2);
                                                            break;
                                                        default:
                                                            of3 of3Var2 = (of3) obj6;
                                                            ((Integer) obj7).getClass();
                                                            ((r70) obj5).getClass();
                                                            do7 do7Var2 = hu6Var2.b;
                                                            ho7 ho7Var5 = hu6Var2.c;
                                                            int i9 = do7Var2.c.c;
                                                            gv9 gv9Var9 = hu6Var2.h;
                                                            if (gv9Var9 != null) {
                                                                Iterator<E> it = gv9Var9.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        obj8 = it.next();
                                                                        if (((lj7) obj8).a == ho7Var5.a.a) {
                                                                        }
                                                                    } else {
                                                                        obj8 = null;
                                                                    }
                                                                }
                                                                lj7Var = (lj7) obj8;
                                                            } else {
                                                                lj7Var = null;
                                                            }
                                                            boolean h3 = ho7Var5.a.h();
                                                            boolean z7 = hu6Var2.b.c.A;
                                                            xtc x = gz8.x(l98.d0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, null, 3);
                                                            av8 av8Var10 = (av8) of3Var2;
                                                            boolean g11 = av8Var10.g(function13);
                                                            Object O14 = av8Var10.O();
                                                            if (g11 || O14 == a99Var) {
                                                                O14 = new rt6(3, function13);
                                                                av8Var10.n0(O14);
                                                            }
                                                            u6h.i(lj7Var, i9, h3, (Function0) O14, z7, x, false, av8Var10, 0, 64);
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            }), av8Var8, 200064, 18);
                                            fz8.e(mj7Var.n, null, uo5.e(s02.h0(200, i3, null, 6), 2), uo5.f(s02.h0(200, i3, null, 6), 2), null, td4.a, av8Var8, 200064, 18);
                                            av8Var8.s(true);
                                            String v = oea.v(R.string.fantasy_learn_how_to_play, av8Var8);
                                            xtc d0 = l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                            g3 = av8Var8.g(function1);
                                            O3 = av8Var8.O();
                                            if (!g3 || O3 == obj4) {
                                                O3 = new rt6(9, function1);
                                                av8Var8.n0(O3);
                                            }
                                            x2a.d(v, d0, null, 0L, 0L, 0L, (Function0) O3, td4.b, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var8, 12582960, 0, 1852);
                                            av8 av8Var9 = av8Var8;
                                            final int i7 = 1;
                                            dy0.a((fantasyCompetitionType == FantasyCompetitionType.SEASON || mj7Var.a == do7Var.h.a) ? false : true, null, yqo.H(-305730399, av8Var9, new ct8() { // from class: bu6
                                                @Override // defpackage.ct8
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    lj7 lj7Var;
                                                    Object obj8;
                                                    int i72 = i7;
                                                    a99 a99Var = nf3.a;
                                                    Function1 function13 = function1;
                                                    hu6 hu6Var2 = hu6Var;
                                                    switch (i72) {
                                                        case 0:
                                                            ((Integer) obj7).getClass();
                                                            ((r70) obj5).getClass();
                                                            av8 av8Var92 = (av8) ((of3) obj6);
                                                            Object O11 = av8Var92.O();
                                                            if (O11 == a99Var) {
                                                                O11 = e.f(hu6Var2.c.a);
                                                                av8Var92.n0(O11);
                                                            }
                                                            e1d e1dVar = (e1d) O11;
                                                            Boolean valueOf2 = Boolean.valueOf(hu6Var2.f.isEmpty());
                                                            Boolean valueOf3 = Boolean.valueOf(hu6Var2.r);
                                                            boolean g9 = av8Var92.g(hu6Var2);
                                                            Object O12 = av8Var92.O();
                                                            if (g9 || O12 == a99Var) {
                                                                O12 = new du6(hu6Var2, e1dVar, null, 3);
                                                                av8Var92.n0(O12);
                                                            }
                                                            hz8.q(valueOf2, valueOf3, (Function2) O12, av8Var92);
                                                            boolean c2 = Intrinsics.c(hu6Var2.u != null ? Boolean.valueOf(!r5.isEmpty()) : null, Boolean.TRUE);
                                                            Long l = ((mj7) e1dVar.getValue()).h;
                                                            long longValue = l != null ? l.longValue() : 0L;
                                                            int i8 = ((mj7) e1dVar.getValue()).c;
                                                            boolean g10 = av8Var92.g(function13) | av8Var92.g(hu6Var2);
                                                            Object O13 = av8Var92.O();
                                                            if (g10 || O13 == a99Var) {
                                                                O13 = new vt6(0, hu6Var2, function13);
                                                                av8Var92.n0(O13);
                                                            }
                                                            n9e.g(i8, 0, longValue, av8Var92, null, (Function1) O13, c2);
                                                            break;
                                                        default:
                                                            of3 of3Var2 = (of3) obj6;
                                                            ((Integer) obj7).getClass();
                                                            ((r70) obj5).getClass();
                                                            do7 do7Var2 = hu6Var2.b;
                                                            ho7 ho7Var5 = hu6Var2.c;
                                                            int i9 = do7Var2.c.c;
                                                            gv9 gv9Var9 = hu6Var2.h;
                                                            if (gv9Var9 != null) {
                                                                Iterator<E> it = gv9Var9.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        obj8 = it.next();
                                                                        if (((lj7) obj8).a == ho7Var5.a.a) {
                                                                        }
                                                                    } else {
                                                                        obj8 = null;
                                                                    }
                                                                }
                                                                lj7Var = (lj7) obj8;
                                                            } else {
                                                                lj7Var = null;
                                                            }
                                                            boolean h3 = ho7Var5.a.h();
                                                            boolean z7 = hu6Var2.b.c.A;
                                                            xtc x = gz8.x(l98.d0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, null, 3);
                                                            av8 av8Var10 = (av8) of3Var2;
                                                            boolean g11 = av8Var10.g(function13);
                                                            Object O14 = av8Var10.O();
                                                            if (g11 || O14 == a99Var) {
                                                                O14 = new rt6(3, function13);
                                                                av8Var10.n0(O14);
                                                            }
                                                            u6h.i(lj7Var, i9, h3, (Function0) O14, z7, x, false, av8Var10, 0, 64);
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            }), av8Var9, 384);
                                            rz0.a(new sz0(AdType.Banner.FantasyBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var9, 24576, 14);
                                            av8Var9.s(true);
                                            z = false;
                                            av8Var9.s(false);
                                            av8Var2 = av8Var9;
                                            av8Var2.s(z);
                                            Unit unit4 = Unit.a;
                                            r7 = z;
                                            av8Var = av8Var2;
                                        }
                                    }
                                    z2 = true;
                                    gv9 gv9Var72 = hu6Var.f;
                                    gv9 gv9Var82 = hu6Var.g;
                                    il8Var = this.e;
                                    if (il8Var == null) {
                                    }
                                    boolean z52 = hu6Var.n;
                                    boolean z62 = ho7Var.g;
                                    boolean h3 = mj7Var.h();
                                    if (Build.VERSION.SDK_INT < 31) {
                                    }
                                    xtc xtcVar2 = Z;
                                    g = av8Var3.g(function1) | av8Var3.g(hu6Var);
                                    O = av8Var3.O();
                                    if (!g) {
                                    }
                                    O = new vt6(1, hu6Var, function1);
                                    av8Var3.n0(O);
                                    Function1 function122 = (Function1) O;
                                    g2 = av8Var3.g(function1);
                                    O2 = av8Var3.O();
                                    if (!g2) {
                                    }
                                    O2 = new rt6(4, function1);
                                    av8Var3.n0(O2);
                                    av8 av8Var62 = av8Var3;
                                    tol.j(gv9Var72, ev6Var, function122, il8Var, (Function0) O2, z52, z62, h3, xtcVar2, false, gv9Var, av8Var62, 0, 512);
                                    av8 av8Var72 = av8Var62;
                                    if (z2) {
                                    }
                                    i = 6;
                                    av8 av8Var82 = av8Var72;
                                    fz8.e((gv9Var3.isEmpty() || hu6Var.r) ? i3 : 1, null, uo5.e(s02.h0(200, i3, null, 6), 2), uo5.f(s02.h0(200, i3, null, 6), 2), null, yqo.H(440794331, av8Var72, new ct8() { // from class: bu6
                                        @Override // defpackage.ct8
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            lj7 lj7Var;
                                            Object obj8;
                                            int i72 = i3;
                                            a99 a99Var = nf3.a;
                                            Function1 function13 = function1;
                                            hu6 hu6Var2 = hu6Var;
                                            switch (i72) {
                                                case 0:
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    av8 av8Var92 = (av8) ((of3) obj6);
                                                    Object O11 = av8Var92.O();
                                                    if (O11 == a99Var) {
                                                        O11 = e.f(hu6Var2.c.a);
                                                        av8Var92.n0(O11);
                                                    }
                                                    e1d e1dVar = (e1d) O11;
                                                    Boolean valueOf2 = Boolean.valueOf(hu6Var2.f.isEmpty());
                                                    Boolean valueOf3 = Boolean.valueOf(hu6Var2.r);
                                                    boolean g9 = av8Var92.g(hu6Var2);
                                                    Object O12 = av8Var92.O();
                                                    if (g9 || O12 == a99Var) {
                                                        O12 = new du6(hu6Var2, e1dVar, null, 3);
                                                        av8Var92.n0(O12);
                                                    }
                                                    hz8.q(valueOf2, valueOf3, (Function2) O12, av8Var92);
                                                    boolean c2 = Intrinsics.c(hu6Var2.u != null ? Boolean.valueOf(!r5.isEmpty()) : null, Boolean.TRUE);
                                                    Long l = ((mj7) e1dVar.getValue()).h;
                                                    long longValue = l != null ? l.longValue() : 0L;
                                                    int i8 = ((mj7) e1dVar.getValue()).c;
                                                    boolean g10 = av8Var92.g(function13) | av8Var92.g(hu6Var2);
                                                    Object O13 = av8Var92.O();
                                                    if (g10 || O13 == a99Var) {
                                                        O13 = new vt6(0, hu6Var2, function13);
                                                        av8Var92.n0(O13);
                                                    }
                                                    n9e.g(i8, 0, longValue, av8Var92, null, (Function1) O13, c2);
                                                    break;
                                                default:
                                                    of3 of3Var2 = (of3) obj6;
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    do7 do7Var2 = hu6Var2.b;
                                                    ho7 ho7Var5 = hu6Var2.c;
                                                    int i9 = do7Var2.c.c;
                                                    gv9 gv9Var9 = hu6Var2.h;
                                                    if (gv9Var9 != null) {
                                                        Iterator<E> it = gv9Var9.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                obj8 = it.next();
                                                                if (((lj7) obj8).a == ho7Var5.a.a) {
                                                                }
                                                            } else {
                                                                obj8 = null;
                                                            }
                                                        }
                                                        lj7Var = (lj7) obj8;
                                                    } else {
                                                        lj7Var = null;
                                                    }
                                                    boolean h32 = ho7Var5.a.h();
                                                    boolean z7 = hu6Var2.b.c.A;
                                                    xtc x = gz8.x(l98.d0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, null, 3);
                                                    av8 av8Var10 = (av8) of3Var2;
                                                    boolean g11 = av8Var10.g(function13);
                                                    Object O14 = av8Var10.O();
                                                    if (g11 || O14 == a99Var) {
                                                        O14 = new rt6(3, function13);
                                                        av8Var10.n0(O14);
                                                    }
                                                    u6h.i(lj7Var, i9, h32, (Function0) O14, z7, x, false, av8Var10, 0, 64);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    }), av8Var82, 200064, 18);
                                    fz8.e(mj7Var.n, null, uo5.e(s02.h0(200, i3, null, 6), 2), uo5.f(s02.h0(200, i3, null, 6), 2), null, td4.a, av8Var82, 200064, 18);
                                    av8Var82.s(true);
                                    String v2 = oea.v(R.string.fantasy_learn_how_to_play, av8Var82);
                                    xtc d02 = l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                    g3 = av8Var82.g(function1);
                                    O3 = av8Var82.O();
                                    if (!g3) {
                                    }
                                    O3 = new rt6(9, function1);
                                    av8Var82.n0(O3);
                                    x2a.d(v2, d02, null, 0L, 0L, 0L, (Function0) O3, td4.b, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var82, 12582960, 0, 1852);
                                    av8 av8Var92 = av8Var82;
                                    final int i72 = 1;
                                    dy0.a((fantasyCompetitionType == FantasyCompetitionType.SEASON || mj7Var.a == do7Var.h.a) ? false : true, null, yqo.H(-305730399, av8Var92, new ct8() { // from class: bu6
                                        @Override // defpackage.ct8
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            lj7 lj7Var;
                                            Object obj8;
                                            int i722 = i72;
                                            a99 a99Var = nf3.a;
                                            Function1 function13 = function1;
                                            hu6 hu6Var2 = hu6Var;
                                            switch (i722) {
                                                case 0:
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    av8 av8Var922 = (av8) ((of3) obj6);
                                                    Object O11 = av8Var922.O();
                                                    if (O11 == a99Var) {
                                                        O11 = e.f(hu6Var2.c.a);
                                                        av8Var922.n0(O11);
                                                    }
                                                    e1d e1dVar = (e1d) O11;
                                                    Boolean valueOf2 = Boolean.valueOf(hu6Var2.f.isEmpty());
                                                    Boolean valueOf3 = Boolean.valueOf(hu6Var2.r);
                                                    boolean g9 = av8Var922.g(hu6Var2);
                                                    Object O12 = av8Var922.O();
                                                    if (g9 || O12 == a99Var) {
                                                        O12 = new du6(hu6Var2, e1dVar, null, 3);
                                                        av8Var922.n0(O12);
                                                    }
                                                    hz8.q(valueOf2, valueOf3, (Function2) O12, av8Var922);
                                                    boolean c2 = Intrinsics.c(hu6Var2.u != null ? Boolean.valueOf(!r5.isEmpty()) : null, Boolean.TRUE);
                                                    Long l = ((mj7) e1dVar.getValue()).h;
                                                    long longValue = l != null ? l.longValue() : 0L;
                                                    int i8 = ((mj7) e1dVar.getValue()).c;
                                                    boolean g10 = av8Var922.g(function13) | av8Var922.g(hu6Var2);
                                                    Object O13 = av8Var922.O();
                                                    if (g10 || O13 == a99Var) {
                                                        O13 = new vt6(0, hu6Var2, function13);
                                                        av8Var922.n0(O13);
                                                    }
                                                    n9e.g(i8, 0, longValue, av8Var922, null, (Function1) O13, c2);
                                                    break;
                                                default:
                                                    of3 of3Var2 = (of3) obj6;
                                                    ((Integer) obj7).getClass();
                                                    ((r70) obj5).getClass();
                                                    do7 do7Var2 = hu6Var2.b;
                                                    ho7 ho7Var5 = hu6Var2.c;
                                                    int i9 = do7Var2.c.c;
                                                    gv9 gv9Var9 = hu6Var2.h;
                                                    if (gv9Var9 != null) {
                                                        Iterator<E> it = gv9Var9.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                obj8 = it.next();
                                                                if (((lj7) obj8).a == ho7Var5.a.a) {
                                                                }
                                                            } else {
                                                                obj8 = null;
                                                            }
                                                        }
                                                        lj7Var = (lj7) obj8;
                                                    } else {
                                                        lj7Var = null;
                                                    }
                                                    boolean h32 = ho7Var5.a.h();
                                                    boolean z7 = hu6Var2.b.c.A;
                                                    xtc x = gz8.x(l98.d0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, null, 3);
                                                    av8 av8Var10 = (av8) of3Var2;
                                                    boolean g11 = av8Var10.g(function13);
                                                    Object O14 = av8Var10.O();
                                                    if (g11 || O14 == a99Var) {
                                                        O14 = new rt6(3, function13);
                                                        av8Var10.n0(O14);
                                                    }
                                                    u6h.i(lj7Var, i9, h32, (Function0) O14, z7, x, false, av8Var10, 0, 64);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    }), av8Var92, 384);
                                    rz0.a(new sz0(AdType.Banner.FantasyBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var92, 24576, 14);
                                    av8Var92.s(true);
                                    z = false;
                                    av8Var92.s(false);
                                    av8Var2 = av8Var92;
                                    av8Var2.s(z);
                                    Unit unit42 = Unit.a;
                                    r7 = z;
                                    av8Var = av8Var2;
                                }
                            }
                            z = false;
                            i = 6;
                            r14.d0(1177128726);
                            r14.s(false);
                            av8Var2 = r14;
                            av8Var2.s(z);
                            Unit unit422 = Unit.a;
                            r7 = z;
                            av8Var = av8Var2;
                        }
                    } else {
                        i = 6;
                        r14.d0(1160596147);
                        s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, r14, bkh.c);
                        av8 av8Var10 = r14;
                        r7 = 0;
                        av8Var10.s(false);
                        Unit unit5 = Unit.a;
                        av8Var = av8Var10;
                    }
                    fz8.e(hu6Var.r, null, uo5.e(s02.h0(200, r7, null, i), 2), uo5.f(s02.h0(200, r7, null, i), 2), null, yqo.H(-761759548, av8Var, new kr1(this.f, 1)), av8Var, 200064, 18);
                } else {
                    r14.W();
                }
                return Unit.a;
            default:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var11 = (av8) of3Var2;
                if (av8Var11.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    hu6 hu6Var2 = this.b;
                    wkn.a(hu6Var2.a, null, null, null, yqo.H(-1285236244, av8Var11, new zt6(this.c, hu6Var2, this.d, this.e, this.f)), av8Var11, 24576, 14);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ zt6(Function1 function1, hu6 hu6Var, String str, il8 il8Var, p3e p3eVar) {
        this.c = function1;
        this.b = hu6Var;
        this.d = str;
        this.e = il8Var;
        this.f = p3eVar;
    }
}
