package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.AiAnalystDemoEvent;
import com.sofascore.model.profile.ReferralResponse;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lagk;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class agk extends q8 {
    public final bfk e;
    public final s96 f;
    public final dhk g;
    public final bli h;
    public final fqg i;
    public final ith j;
    public final boolean k;
    public final yzc l;
    public final yzc m;
    public final fdi n;
    public final jof o;
    public final yf4 p;
    public AiAnalystDemoEvent q;
    public im r;
    public final fu3 s;
    public String t;
    public final aeh u;
    public final hof v;
    public final fdi w;
    public final jof x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agk(Application application, bfk bfkVar, s96 s96Var, dhk dhkVar, bli bliVar, SharedPreferences sharedPreferences, fqg fqgVar, ith ithVar, cg4 cg4Var) {
        super(application);
        boolean z;
        String string;
        bfkVar.getClass();
        s96Var.getClass();
        dhkVar.getClass();
        bliVar.getClass();
        sharedPreferences.getClass();
        fqgVar.getClass();
        ithVar.getClass();
        cg4Var.getClass();
        this.e = bfkVar;
        this.f = s96Var;
        this.g = dhkVar;
        this.h = bliVar;
        this.i = fqgVar;
        this.j = ithVar;
        rq3 rq3Var = null;
        int i = 0;
        if (sharedPreferences.getString("ADVERTISING_ID", null) != null && ((string = sharedPreferences.getString("PR_XAIST", null)) == null || string.length() == 0)) {
            yea yeaVar = j58.a;
            if (fn0.B("show_referral") || sharedPreferences.getBoolean("DEV_MODE_SHOW_REFERRAL", false)) {
                z = true;
                this.k = z;
                yzc yzcVar = new yzc();
                this.l = yzcVar;
                this.m = yzcVar;
                fdi a = gdi.a(null);
                this.n = a;
                this.o = un0.u(a);
                this.p = cg4Var.f(new e5f("referred_user"), Boolean.FALSE);
                this.s = j72.t(rf4.a(i()).getData());
                this.t = "";
                aeh b = beh.b(0, 0, null, 7);
                this.u = b;
                this.v = un0.t(b);
                fdi a2 = gdi.a(new ush(false, null));
                this.w = a2;
                this.x = un0.u(a2);
                xw3.L(un0.z(this), null, null, new pdk(this, rq3Var, 5), 3);
                xw3.L(un0.z(this), null, null, new mj5(this, rq3Var, 14), 3);
                xw3.L(un0.z(this), null, null, new yfk(this, rq3Var, i), 3);
            }
        }
        z = false;
        this.k = z;
        yzc yzcVar2 = new yzc();
        this.l = yzcVar2;
        this.m = yzcVar2;
        fdi a3 = gdi.a(null);
        this.n = a3;
        this.o = un0.u(a3);
        this.p = cg4Var.f(new e5f("referred_user"), Boolean.FALSE);
        this.s = j72.t(rf4.a(i()).getData());
        this.t = "";
        aeh b2 = beh.b(0, 0, null, 7);
        this.u = b2;
        this.v = un0.t(b2);
        fdi a22 = gdi.a(new ush(false, null));
        this.w = a22;
        this.x = un0.u(a22);
        xw3.L(un0.z(this), null, null, new pdk(this, rq3Var, 5), 3);
        xw3.L(un0.z(this), null, null, new mj5(this, rq3Var, 14), 3);
        xw3.L(un0.z(this), null, null, new yfk(this, rq3Var, i), 3);
    }

    @Override // defpackage.ltk
    public final void e() {
        this.h.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x007e, code lost:
    
        if (r13 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(sq3 sq3Var) {
        zfk zfkVar;
        int i;
        x2g x2gVar;
        ReferralResponse referralResponse;
        AiAnalystDemoEvent aiAnalystDemoEvent;
        agk agkVar;
        ReferralResponse referralResponse2;
        Object f;
        ReferralResponse referralResponse3;
        agk agkVar2;
        fdi fdiVar;
        Object value;
        if (sq3Var instanceof zfk) {
            zfkVar = (zfk) sq3Var;
            int i2 = zfkVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zfkVar.v = i2 - Integer.MIN_VALUE;
                Object obj = zfkVar.t;
                lu3 lu3Var = lu3.a;
                i = zfkVar.v;
                int i3 = 2;
                x2gVar = null;
                Object[] objArr = 0;
                if (i != 0) {
                    y6a.M(obj);
                    bfk bfkVar = this.e;
                    if (!bfkVar.b().getIsLoggedIn()) {
                        return null;
                    }
                    if (this.k) {
                        String str = (String) this.i.a("OPEN_PROFILE_ID");
                        if (str == null) {
                            str = bfkVar.b().getId();
                        }
                        zfkVar.v = 1;
                        dhk dhkVar = this.g;
                        dhkVar.getClass();
                        obj = yaa.P(new hgk(dhkVar, str, objArr == true ? 1 : 0, i3), zfkVar);
                    }
                    if (x2gVar != null || (referralResponse = (ReferralResponse) yaa.x(x2gVar)) == null) {
                        referralResponse = new ReferralResponse(this.k, false, km5.a, null, 0);
                    }
                    if (referralResponse.getCanRedeemReward()) {
                        AiAnalystDemoEvent aiAnalystDemoEvent2 = this.q;
                        if (aiAnalystDemoEvent2 != null) {
                            aiAnalystDemoEvent = aiAnalystDemoEvent2;
                            agkVar = this;
                            agkVar.q = aiAnalystDemoEvent;
                            s5k s5kVar = s5k.c;
                            zfkVar.r = referralResponse;
                            zfkVar.s = this;
                            zfkVar.v = 3;
                            f = this.h.f(false, s5kVar, zfkVar);
                            if (f != lu3Var) {
                            }
                            return lu3Var;
                        }
                        zfkVar.r = referralResponse;
                        zfkVar.s = this;
                        zfkVar.v = 2;
                        Object w = this.f.w(Sports.FOOTBALL, zfkVar);
                        if (w != lu3Var) {
                            referralResponse2 = referralResponse;
                            obj = w;
                            agkVar = this;
                            ReferralResponse referralResponse4 = referralResponse2;
                            aiAnalystDemoEvent = (AiAnalystDemoEvent) obj;
                            referralResponse = referralResponse4;
                            agkVar.q = aiAnalystDemoEvent;
                            s5k s5kVar2 = s5k.c;
                            zfkVar.r = referralResponse;
                            zfkVar.s = this;
                            zfkVar.v = 3;
                            f = this.h.f(false, s5kVar2, zfkVar);
                            if (f != lu3Var) {
                            }
                        }
                        return lu3Var;
                    }
                    this.t = referralResponse.getMyProgressAsInvitedUser() != null ? "invitee" : "inviter";
                    do {
                        fdiVar = this.n;
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, referralResponse));
                    return referralResponse;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        agkVar2 = zfkVar.s;
                        referralResponse3 = zfkVar.r;
                        y6a.M(obj);
                        agkVar2.r = (im) obj;
                        referralResponse = referralResponse3;
                        this.t = referralResponse.getMyProgressAsInvitedUser() != null ? "invitee" : "inviter";
                        do {
                            fdiVar = this.n;
                            value = fdiVar.getValue();
                        } while (!fdiVar.k(value, referralResponse));
                        return referralResponse;
                    }
                    agkVar = zfkVar.s;
                    referralResponse2 = zfkVar.r;
                    y6a.M(obj);
                    ReferralResponse referralResponse42 = referralResponse2;
                    aiAnalystDemoEvent = (AiAnalystDemoEvent) obj;
                    referralResponse = referralResponse42;
                    agkVar.q = aiAnalystDemoEvent;
                    s5k s5kVar22 = s5k.c;
                    zfkVar.r = referralResponse;
                    zfkVar.s = this;
                    zfkVar.v = 3;
                    f = this.h.f(false, s5kVar22, zfkVar);
                    if (f != lu3Var) {
                        referralResponse3 = referralResponse;
                        obj = f;
                        agkVar2 = this;
                        agkVar2.r = (im) obj;
                        referralResponse = referralResponse3;
                        this.t = referralResponse.getMyProgressAsInvitedUser() != null ? "invitee" : "inviter";
                        do {
                            fdiVar = this.n;
                            value = fdiVar.getValue();
                        } while (!fdiVar.k(value, referralResponse));
                        return referralResponse;
                    }
                    return lu3Var;
                }
                y6a.M(obj);
                x2gVar = (x2g) obj;
                if (x2gVar != null) {
                }
                referralResponse = new ReferralResponse(this.k, false, km5.a, null, 0);
                if (referralResponse.getCanRedeemReward()) {
                }
                this.t = referralResponse.getMyProgressAsInvitedUser() != null ? "invitee" : "inviter";
                do {
                    fdiVar = this.n;
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, referralResponse));
                return referralResponse;
            }
        }
        zfkVar = new zfk(this, sq3Var);
        Object obj2 = zfkVar.t;
        lu3 lu3Var2 = lu3.a;
        i = zfkVar.v;
        int i32 = 2;
        x2gVar = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        x2gVar = (x2g) obj2;
        if (x2gVar != null) {
        }
        referralResponse = new ReferralResponse(this.k, false, km5.a, null, 0);
        if (referralResponse.getCanRedeemReward()) {
        }
        this.t = referralResponse.getMyProgressAsInvitedUser() != null ? "invitee" : "inviter";
        do {
            fdiVar = this.n;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, referralResponse));
        return referralResponse;
    }
}
