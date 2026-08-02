package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.model.AnalystOfferRemoteConfig;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventHeadFlags;
import com.sofascore.model.network.response.MediaHighlightSummaryResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmr5;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class mr5 extends q8 {
    public final zzc A;
    public final zzc B;
    public final zzc C;
    public final zzc D;
    public final yzc E;
    public im F;
    public boolean G;
    public final yzc H;
    public final lec I;
    public MediaHighlightSummaryResponse J;
    public boolean K;
    public Integer L;
    public boolean M;
    public boolean N;
    public final jof O;
    public final joa P;
    public final yzc Q;
    public final yzc R;
    public g9i S;
    public final t9c e;
    public final s96 f;
    public final j0j g;
    public final pai h;
    public final vrj i;
    public final e64 j;
    public final umd k;
    public final amd l;
    public final SharedPreferences m;
    public final cg4 n;
    public final bli o;
    public final int p;
    public Integer q;
    public final Integer r;
    public boolean s;
    public final boolean t;
    public final fdi u;
    public final fu3 v;
    public final yzc w;
    public final lec x;
    public final yzc y;
    public final lec z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr5(Application application, t9c t9cVar, s96 s96Var, j0j j0jVar, pai paiVar, vrj vrjVar, e64 e64Var, umd umdVar, amd amdVar, SharedPreferences sharedPreferences, cg4 cg4Var, bli bliVar, bt7 bt7Var, s5d s5dVar, fqg fqgVar) {
        super(application);
        Integer oddsProviderId;
        t9cVar.getClass();
        s96Var.getClass();
        j0jVar.getClass();
        paiVar.getClass();
        vrjVar.getClass();
        e64Var.getClass();
        umdVar.getClass();
        amdVar.getClass();
        sharedPreferences.getClass();
        cg4Var.getClass();
        bliVar.getClass();
        s5dVar.getClass();
        fqgVar.getClass();
        this.e = t9cVar;
        this.f = s96Var;
        this.g = j0jVar;
        this.h = paiVar;
        this.i = vrjVar;
        this.j = e64Var;
        this.k = umdVar;
        this.l = amdVar;
        this.m = sharedPreferences;
        this.n = cg4Var;
        this.o = bliVar;
        Object a = fqgVar.a("eventId");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.p = ((Number) a).intValue();
        this.q = (Integer) fqgVar.a("eventPlayerId");
        this.r = (Integer) fqgVar.a("eventPlayerTeamId");
        Boolean bool = (Boolean) fqgVar.a("playerOfTheMatchVote");
        int i = 0;
        this.s = bool != null ? bool.booleanValue() : false;
        Integer num = (Integer) fqgVar.a("fromUniqueTournamentId");
        BrandingTournament C = ccd.C(i(), num);
        Boolean forceOdds = C != null ? C.getForceOdds() : null;
        Boolean bool2 = Boolean.TRUE;
        C = Intrinsics.c(forceOdds, bool2) ? C : null;
        this.t = C != null;
        fdi a2 = gdi.a(null);
        this.u = a2;
        this.v = j72.t(a2);
        yzc yzcVar = new yzc();
        this.w = yzcVar;
        this.x = waa.w(yzcVar);
        yzc yzcVar2 = new yzc();
        this.y = yzcVar2;
        this.z = waa.w(yzcVar2);
        zzc zzcVar = new zzc();
        this.A = zzcVar;
        this.B = zzcVar;
        zzc zzcVar2 = new zzc();
        this.C = zzcVar2;
        this.D = zzcVar2;
        this.E = new yzc(bool2);
        yzc yzcVar3 = new yzc(null);
        this.H = yzcVar3;
        this.I = waa.w(yzcVar3);
        this.K = true;
        this.O = un0.K(la8.a(a2, new lr5(rq3Var, bt7Var, i)), un0.z(this), new uci(5000L, Long.MAX_VALUE), null);
        this.P = ypa.a(ysa.c, new h63(this, 22));
        if (num != null && C != null && (oddsProviderId = C.getOddsProviderId()) != null) {
            int intValue = oddsProviderId.intValue();
            bga bgaVar = xld.a;
            amdVar.f = rld.e(Integer.valueOf(intValue), xld.b(amdVar.a));
            amdVar.g = rld.e(Integer.valueOf(intValue), xld.c(amdVar.a));
        }
        yzc yzcVar4 = new yzc();
        this.Q = yzcVar4;
        this.R = yzcVar4;
    }

    public static boolean n(Event event) {
        String s = ok3.s(event);
        switch (s.hashCode()) {
            case -2002238939:
                return s.equals(Sports.ICE_HOCKEY);
            case -83759494:
                return s.equals(Sports.AMERICAN_FOOTBALL);
            case 1767150:
                return s.equals(Sports.HANDBALL);
            case 727149765:
                return s.equals(Sports.BASKETBALL);
            default:
                return false;
        }
    }

    @Override // defpackage.ltk
    public final void e() {
        this.o.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r11) < 1728000000) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
    
        if (r3.getLong(defpackage.lnb.o("PREF_ANALYST_PROMOTION_MODAL_TIMESTAMP", r0.getStartDate(), (r1 == null || (r6 = r1.d) == null) ? null : r6.a), 0) == 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        boolean z;
        boolean z2;
        cu cuVar;
        yea yeaVar = j58.a;
        AnalystOfferRemoteConfig c = j58.c();
        im imVar = this.F;
        boolean A = s6a.A(i());
        SharedPreferences sharedPreferences = this.m;
        boolean z3 = true;
        if (sharedPreferences.getBoolean("PREF_SHOULD_SEND_ANALYST_OFFER_EVENT", true) && !A && this.G) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.getClass();
            edit.putBoolean("PREF_SHOULD_SEND_ANALYST_OFFER_EVENT", false);
            edit.apply();
            Context i = i();
            FirebaseBundle firebaseBundle = new FirebaseBundle();
            ia0 ia0Var = ia0.q;
            me4.d((f5d) me4.e(), "offer_available", firebaseBundle, i).a.e(n9e.K(firebaseBundle), null, "offer_available", false);
        }
        if ((imVar != null ? imVar.d : null) != cu.f) {
            if ((imVar != null ? imVar.d : null) != cu.e) {
                z = false;
                if (z) {
                    if (c != null) {
                    }
                    z3 = false;
                } else {
                    long j = sharedPreferences.getLong("PREF_WC_OFFER_POPUP_LAST_SHOWN_TIMESTAMP", 0L);
                    if (j != 0) {
                    }
                }
                if (z) {
                    z2 = this.G;
                } else {
                    Event event = (Event) this.u.getValue();
                    z2 = Intrinsics.c(event != null ? ok3.s(event) : null, Sports.FOOTBALL);
                }
                if (A && z2) {
                    if (Intrinsics.c((imVar == null || (cuVar = imVar.d) == null) ? null : Boolean.valueOf(cuVar.c), Boolean.TRUE) && z3) {
                        this.H.k(imVar != null ? imVar.d : null);
                        return;
                    }
                    return;
                }
            }
        }
        z = true;
        if (z) {
        }
        if (z) {
        }
        if (A) {
        }
    }

    public final boolean l() {
        x2g x2gVar = (x2g) this.w.d();
        EventHeadFlags eventHeadFlags = x2gVar != null ? (EventHeadFlags) yaa.x(x2gVar) : null;
        return Intrinsics.c(eventHeadFlags != null ? Boolean.valueOf(eventHeadFlags.getAiInsights()) : null, Boolean.TRUE);
    }

    public final void m() {
        g9i g9iVar = this.S;
        rq3 rq3Var = null;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.S = xw3.L(un0.z(this), null, null, new dr5(this, rq3Var, 1), 3);
    }
}
