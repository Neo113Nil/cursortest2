package defpackage;

import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.profile.UserBadge;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class afk extends hoi implements Function2 {
    public final /* synthetic */ Long A;
    public final /* synthetic */ Boolean B;
    public final /* synthetic */ Boolean C;
    public /* synthetic */ Object r;
    public final /* synthetic */ Boolean s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Boolean v;
    public final /* synthetic */ Boolean w;
    public final /* synthetic */ Boolean x;
    public final /* synthetic */ Boolean y;
    public final /* synthetic */ UserBadge z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afk(Boolean bool, String str, String str2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, UserBadge userBadge, Long l, Boolean bool6, Boolean bool7, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = bool;
        this.t = str;
        this.u = str2;
        this.v = bool2;
        this.w = bool3;
        this.x = bool4;
        this.y = bool5;
        this.z = userBadge;
        this.A = l;
        this.B = bool6;
        this.C = bool7;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        afk afkVar = new afk(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, rq3Var);
        afkVar.r = obj;
        return afkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((afk) create((UserAccount) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        String userBadge;
        UserAccount userAccount = (UserAccount) this.r;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Boolean bool = this.s;
        boolean booleanValue = bool != null ? bool.booleanValue() : userAccount.getIsLoggedIn();
        String str = this.t;
        if (str == null) {
            str = userAccount.getImageUrl();
        }
        String str2 = str;
        String str3 = this.u;
        if (str3 == null) {
            str3 = userAccount.getNickname();
        }
        String str4 = str3;
        String chatFlag = userAccount.getChatFlag();
        Boolean bool2 = this.v;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : userAccount.getForceAds();
        Boolean bool3 = this.w;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : userAccount.getPurchasedAds();
        Boolean bool4 = this.x;
        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : userAccount.getDevMod();
        Boolean bool5 = this.y;
        boolean booleanValue5 = bool5 != null ? bool5.booleanValue() : userAccount.getShowTestRating();
        boolean forceHideAds = userAccount.getForceHideAds();
        UserBadge userBadge2 = this.z;
        if (userBadge2 == null || (userBadge = userBadge2.name()) == null) {
            userBadge = userAccount.getUserBadge();
        }
        String str5 = userBadge;
        Long l = this.A;
        long longValue = l != null ? l.longValue() : userAccount.getWeeklyChallengeDailyBonusUsedAtTimestamp();
        Boolean bool6 = this.B;
        if (bool6 == null) {
            bool6 = userAccount.getHasPremium();
        }
        Boolean bool7 = bool6;
        Boolean bool8 = this.C;
        return UserAccount.copy$default(userAccount, null, null, null, null, null, booleanValue, false, str2, str4, booleanValue3, booleanValue4, booleanValue2, booleanValue5, 0L, null, chatFlag, null, false, 0, 0, 0, 0L, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bool8 != null ? bool8.booleanValue() : userAccount.getFantasyUser(), forceHideAds, str5, longValue, null, bool7, null, null, null, -1577099169, 3, null);
    }
}
