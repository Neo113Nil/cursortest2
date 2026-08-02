package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.model.profile.ReferralResponse;
import com.sofascore.results.profile.UserProfileActivity;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qfk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserProfileActivity b;
    public final /* synthetic */ ComposeView c;

    public /* synthetic */ qfk(UserProfileActivity userProfileActivity, ComposeView composeView, int i) {
        this.a = i;
        this.b = userProfileActivity;
        this.c = composeView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (r11 == defpackage.nf3.a) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c5, code lost:
    
        if (java.time.Instant.ofEpochMilli(r13.getJoinDate()).isBefore(java.time.Instant.now().minus((java.time.temporal.TemporalAmount) java.time.Duration.ofDays(15))) != false) goto L74;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Object ufkVar;
        Boolean bool;
        Object obj3;
        rq3 rq3Var = null;
        boolean z3 = true;
        boolean z4 = true;
        switch (this.a) {
            case 0:
                boolean z5 = false;
                UserProfileActivity userProfileActivity = this.b;
                ComposeView composeView = this.c;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                int i = UserProfileActivity.S;
                if ((intValue & 3) != 2) {
                    z5 = true;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, z5)) {
                    haa.f(yqo.H(1987713166, av8Var, new qfk(userProfileActivity, composeView, z4 ? 1 : 0)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                UserProfileActivity userProfileActivity2 = this.b;
                ComposeView composeView2 = this.c;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = UserProfileActivity.S;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    e1d x = rfo.x(userProfileActivity2.R().o, av8Var2, 0);
                    e1d v = rfo.v(userProfileActivity2.R().p, Boolean.FALSE, av8Var2, 48);
                    ia0 ia0Var = ia0.q;
                    UserAccount e = ok3.p().e();
                    Context context = (Context) av8Var2.k(nz.b);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    Object obj4 = O;
                    if (O == a99Var) {
                        context.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = context.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences = a5f.d(applicationContext);
                                uic.j = sharedPreferences;
                            }
                            sharedPreferences.getClass();
                        }
                        String string = sharedPreferences.getString("PR_XAIST", null);
                        Boolean valueOf = Boolean.valueOf(!(string == null || string.length() == 0));
                        av8Var2.n0(valueOf);
                        obj4 = valueOf;
                    }
                    boolean booleanValue = ((Boolean) obj4).booleanValue();
                    ReferralResponse referralResponse = (ReferralResponse) x.getValue();
                    boolean z6 = (referralResponse != null ? referralResponse.getMyProgressAsInvitedUser() : null) != null || ((Boolean) v.getValue()).booleanValue();
                    ReferralResponse referralResponse2 = (ReferralResponse) x.getValue();
                    boolean canRedeemReward = referralResponse2 != null ? referralResponse2.getCanRedeemReward() : false;
                    if (e.getIsLoggedIn()) {
                        ReferralResponse referralResponse3 = (ReferralResponse) x.getValue();
                        if (referralResponse3 != null ? referralResponse3.getShowInviteFriendsBanner() : false) {
                            break;
                        }
                    }
                    z3 = false;
                    ReferralResponse referralResponse4 = (ReferralResponse) x.getValue();
                    Boolean bool2 = (Boolean) v.getValue();
                    bool2.booleanValue();
                    boolean i3 = av8Var2.i(composeView2) | av8Var2.h(z3) | av8Var2.h(z6) | av8Var2.h(canRedeemReward) | av8Var2.i(userProfileActivity2);
                    Object O2 = av8Var2.O();
                    if (i3 || O2 == a99Var) {
                        z = booleanValue;
                        z2 = z3;
                        bool = bool2;
                        ufkVar = new ufk(composeView2, z2, z6, canRedeemReward, userProfileActivity2, null);
                        av8Var2.n0(ufkVar);
                    } else {
                        boolean z7 = z3;
                        ufkVar = O2;
                        z = booleanValue;
                        z2 = z7;
                        bool = bool2;
                    }
                    hz8.q(referralResponse4, bool, (Function2) ufkVar, av8Var2);
                    if (e.getIsLoggedIn()) {
                        av8Var2.d0(-1068048936);
                        ReferralResponse referralResponse5 = (ReferralResponse) x.getValue();
                        InvitedUser myProgressAsInvitedUser = referralResponse5 != null ? referralResponse5.getMyProgressAsInvitedUser() : null;
                        boolean i4 = av8Var2.i(userProfileActivity2);
                        Object O3 = av8Var2.O();
                        Object obj5 = O3;
                        if (i4 || O3 == a99Var) {
                            m1 m1Var = new m1(userProfileActivity2, z, 8);
                            av8Var2.n0(m1Var);
                            obj5 = m1Var;
                        }
                        Function0 function0 = (Function0) obj5;
                        boolean i5 = av8Var2.i(context) | av8Var2.i(userProfileActivity2) | av8Var2.g(x);
                        Object O4 = av8Var2.O();
                        Object obj6 = O4;
                        if (i5 || O4 == a99Var) {
                            mth mthVar = new mth(7, context, userProfileActivity2, x);
                            av8Var2.n0(mthVar);
                            obj6 = mthVar;
                        }
                        sea.d(myProgressAsInvitedUser, canRedeemReward, z2, z6, function0, (Function0) obj6, av8Var2, 0);
                        av8Var2.s(false);
                    } else if (((Boolean) v.getValue()).booleanValue()) {
                        av8Var2.d0(-1068001023);
                        boolean i6 = av8Var2.i(context) | av8Var2.i(userProfileActivity2);
                        Object O5 = av8Var2.O();
                        Object obj7 = O5;
                        if (i6 || O5 == a99Var) {
                            fej fejVar = new fej(12, context, userProfileActivity2);
                            av8Var2.n0(fejVar);
                            obj7 = fejVar;
                        }
                        Function0 function02 = (Function0) obj7;
                        boolean i7 = av8Var2.i(userProfileActivity2);
                        Object O6 = av8Var2.O();
                        Object obj8 = O6;
                        if (i7 || O6 == a99Var) {
                            pfk pfkVar = new pfk(userProfileActivity2, 2);
                            av8Var2.n0(pfkVar);
                            obj8 = pfkVar;
                        }
                        mha.e(function02, (Function0) obj8, av8Var2, 0);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(1252361780);
                        av8Var2.s(false);
                    }
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            default:
                UserProfileActivity userProfileActivity3 = this.b;
                ComposeView composeView3 = this.c;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i8 = UserProfileActivity.S;
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    e1d x2 = rfo.x(userProfileActivity3.R().x, av8Var3, 0);
                    Boolean valueOf2 = Boolean.valueOf(((ush) x2.getValue()).a);
                    ehk ehkVar = ((ush) x2.getValue()).b;
                    boolean i9 = av8Var3.i(composeView3) | av8Var3.g(x2);
                    Object O7 = av8Var3.O();
                    if (!i9) {
                        obj3 = O7;
                        break;
                    }
                    pdk pdkVar = new pdk(composeView3, x2, rq3Var, 4);
                    av8Var3.n0(pdkVar);
                    obj3 = pdkVar;
                    hz8.q(valueOf2, ehkVar, (Function2) obj3, av8Var3);
                    xtc d0 = l98.d0(bkh.d(utc.a, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var3.T);
                    aee m = av8Var3.m();
                    xtc C = fqj.C(av8Var3, d0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c, hf3.g);
                    waa.K(av8Var3, m, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    waa.K(av8Var3, C, hf3.d);
                    z1a.a(((ush) x2.getValue()).b, null, av8Var3, 48);
                    av8Var3.s(true);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
        }
    }
}
