package defpackage;

import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeAssetsResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeaderboardResponse;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeagueAsset;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeTimestampData;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeTimestampResponse;
import com.sofascore.results.R;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h4l extends hoi implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ WeeklyChallengeViewModel B;
    public WeeklyChallengeViewModel r;
    public List s;
    public b7 t;
    public Serializable u;
    public fdi v;
    public int w;
    public int x;
    public long y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4l(WeeklyChallengeViewModel weeklyChallengeViewModel, rq3 rq3Var) {
        super(2, rq3Var);
        this.B = weeklyChallengeViewModel;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        h4l h4lVar = new h4l(this.B, rq3Var);
        h4lVar.A = obj;
        return h4lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h4l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x017c, code lost:
    
        if (r0 != r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c5, code lost:
    
        if (r1 == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008f, code lost:
    
        if (r1 == r6) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0234  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        b7 O;
        mea meaVar;
        Object e;
        Object d;
        b7 b7Var;
        WeeklyChallengeViewModel weeklyChallengeViewModel;
        List<WeeklyChallengeLeagueAsset> list;
        int i;
        Object n;
        WeeklyChallengeViewModel weeklyChallengeViewModel2;
        Pair pair;
        mea meaVar2;
        long j;
        WeeklyChallengeTimestampData meta;
        WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse;
        Object e2;
        WeeklyChallengeViewModel weeklyChallengeViewModel3;
        fdi fdiVar;
        Object k;
        ku3 ku3Var = (ku3) this.A;
        lu3 lu3Var = lu3.a;
        int i2 = this.z;
        long j2 = 0;
        int i3 = 0;
        WeeklyChallengeViewModel weeklyChallengeViewModel4 = this.B;
        switch (i2) {
            case 0:
                y6a.M(obj);
                a3l a3lVar = weeklyChallengeViewModel4.e;
                this.A = ku3Var;
                this.z = 1;
                c = a3lVar.c(this);
                break;
            case 1:
                y6a.M(obj);
                c = obj;
                WeeklyChallengeAssetsResponse weeklyChallengeAssetsResponse = (WeeklyChallengeAssetsResponse) c;
                List<WeeklyChallengeLeagueAsset> meta2 = weeklyChallengeAssetsResponse != null ? weeklyChallengeAssetsResponse.getMeta() : null;
                if (meta2 != null) {
                    O = waa.O(meta2);
                    weeklyChallengeViewModel4.getClass();
                    UserAccount l = WeeklyChallengeViewModel.l();
                    a3l a3lVar2 = weeklyChallengeViewModel4.e;
                    if (l.getLeaderboardId() == 0 || !WeeklyChallengeViewModel.l().getIsLoggedIn()) {
                        meaVar = WeeklyChallengeViewModel.l().getIsLoggedIn() ? mea.b : mea.a;
                        this.A = null;
                        this.r = weeklyChallengeViewModel4;
                        this.s = null;
                        this.t = O;
                        this.u = meaVar;
                        this.w = 0;
                        this.z = 2;
                        e = a3lVar2.e(this);
                        break;
                    } else {
                        String valueOf = String.valueOf(WeeklyChallengeViewModel.l().getLeaderboardId());
                        this.A = ku3Var;
                        this.r = weeklyChallengeViewModel4;
                        this.s = meta2;
                        this.t = O;
                        this.w = 0;
                        this.z = 4;
                        d = a3lVar2.d(valueOf, this);
                        if (d != lu3Var) {
                            b7Var = O;
                            weeklyChallengeViewModel = weeklyChallengeViewModel4;
                            list = meta2;
                            i = 0;
                            weeklyChallengeLeaderboardResponse = (WeeklyChallengeLeaderboardResponse) d;
                            if (weeklyChallengeLeaderboardResponse != null) {
                                fdi fdiVar2 = weeklyChallengeViewModel.k;
                                v3l v3lVar = new v3l(new jm5(b7Var, mea.b, 0L, R.string.weekly_challenge_leaderboard_filling_up, R.string.weekly_challenge_waiting));
                                fdiVar2.getClass();
                                fdiVar2.m(null, v3lVar);
                            } else if (weeklyChallengeLeaderboardResponse.getLeague().getEndDateTimestamp() - xe6.c().b().longValue() > 0) {
                                dhk dhkVar = weeklyChallengeViewModel.h;
                                String id = WeeklyChallengeViewModel.l().getId();
                                this.A = ku3Var;
                                this.r = weeklyChallengeViewModel;
                                this.s = list;
                                this.t = b7Var;
                                this.u = weeklyChallengeLeaderboardResponse;
                                this.w = i;
                                this.x = 0;
                                this.z = 5;
                                e2 = dhkVar.e(id, this);
                                if (e2 != lu3Var) {
                                    weeklyChallengeViewModel3 = weeklyChallengeViewModel;
                                    WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse2 = weeklyChallengeLeaderboardResponse;
                                    ProfileData profileData = (ProfileData) yaa.x((x2g) e2);
                                    fdiVar = weeklyChallengeViewModel3.k;
                                    UserAccount l2 = WeeklyChallengeViewModel.l();
                                    this.A = ku3Var;
                                    this.r = weeklyChallengeViewModel3;
                                    this.s = null;
                                    this.t = b7Var;
                                    this.u = null;
                                    this.v = fdiVar;
                                    this.w = i;
                                    this.x = i3;
                                    this.z = 6;
                                    k = weeklyChallengeViewModel3.k(profileData, l2, list, weeklyChallengeLeaderboardResponse2, this);
                                    break;
                                }
                            } else {
                                fdi fdiVar3 = weeklyChallengeViewModel.k;
                                mea meaVar3 = mea.a;
                                long endDateTimestamp = weeklyChallengeLeaderboardResponse.getLeague().getEndDateTimestamp();
                                wd5 wd5Var = xd5.b;
                                v3l v3lVar2 = new v3l(new qw0(b7Var, xd5.k(wkn.R(1, be5.HOURS), be5.SECONDS) + endDateTimestamp));
                                fdiVar3.getClass();
                                fdiVar3.m(null, v3lVar2);
                            }
                        }
                    }
                    return lu3Var;
                }
                return Unit.a;
            case 2:
                i3 = this.w;
                meaVar = (mea) this.u;
                b7 b7Var2 = this.t;
                weeklyChallengeViewModel4 = this.r;
                y6a.M(obj);
                O = b7Var2;
                e = obj;
                WeeklyChallengeTimestampResponse weeklyChallengeTimestampResponse = (WeeklyChallengeTimestampResponse) e;
                if (weeklyChallengeTimestampResponse != null && (meta = weeklyChallengeTimestampResponse.getMeta()) != null) {
                    j2 = meta.getEndDateTimestamp();
                }
                weeklyChallengeViewModel4.getClass();
                if (!WeeklyChallengeViewModel.l().getIsLoggedIn()) {
                    pair = new Pair(new Integer(R.string.join_the_challenge), new Integer(R.string.weekly_challenge_sign_in));
                    meaVar2 = meaVar;
                    j = j2;
                    b7 b7Var3 = O;
                    int intValue = ((Number) pair.a).intValue();
                    int intValue2 = ((Number) pair.b).intValue();
                    fdi fdiVar4 = weeklyChallengeViewModel4.k;
                    v3l v3lVar3 = new v3l(new jm5(b7Var3, meaVar2, j, intValue, intValue2));
                    fdiVar4.getClass();
                    fdiVar4.m(null, v3lVar3);
                    return Unit.a;
                }
                this.A = null;
                this.r = weeklyChallengeViewModel4;
                this.s = null;
                this.t = O;
                this.u = meaVar;
                this.w = i3;
                this.y = j2;
                this.z = 3;
                n = weeklyChallengeViewModel4.n(this);
                if (n != lu3Var) {
                    weeklyChallengeViewModel2 = weeklyChallengeViewModel4;
                    meaVar2 = meaVar;
                    j = j2;
                    weeklyChallengeViewModel4 = weeklyChallengeViewModel2;
                    pair = !((Boolean) n).booleanValue() ? new Pair(new Integer(R.string.weekly_challenge_leaderboard_filling_up), new Integer(R.string.weekly_challenge_waiting)) : new Pair(new Integer(R.string.join_the_challenge), new Integer(R.string.weekly_challenge_get_started));
                    b7 b7Var32 = O;
                    int intValue3 = ((Number) pair.a).intValue();
                    int intValue22 = ((Number) pair.b).intValue();
                    fdi fdiVar42 = weeklyChallengeViewModel4.k;
                    v3l v3lVar32 = new v3l(new jm5(b7Var32, meaVar2, j, intValue3, intValue22));
                    fdiVar42.getClass();
                    fdiVar42.m(null, v3lVar32);
                    return Unit.a;
                }
                return lu3Var;
            case 3:
                long j3 = this.y;
                mea meaVar4 = (mea) this.u;
                b7 b7Var4 = this.t;
                weeklyChallengeViewModel2 = this.r;
                y6a.M(obj);
                O = b7Var4;
                n = obj;
                meaVar = meaVar4;
                j2 = j3;
                meaVar2 = meaVar;
                j = j2;
                weeklyChallengeViewModel4 = weeklyChallengeViewModel2;
                pair = !((Boolean) n).booleanValue() ? new Pair(new Integer(R.string.weekly_challenge_leaderboard_filling_up), new Integer(R.string.weekly_challenge_waiting)) : new Pair(new Integer(R.string.join_the_challenge), new Integer(R.string.weekly_challenge_get_started));
                b7 b7Var322 = O;
                int intValue32 = ((Number) pair.a).intValue();
                int intValue222 = ((Number) pair.b).intValue();
                fdi fdiVar422 = weeklyChallengeViewModel4.k;
                v3l v3lVar322 = new v3l(new jm5(b7Var322, meaVar2, j, intValue32, intValue222));
                fdiVar422.getClass();
                fdiVar422.m(null, v3lVar322);
                return Unit.a;
            case 4:
                i = this.w;
                b7 b7Var5 = this.t;
                list = this.s;
                weeklyChallengeViewModel = this.r;
                y6a.M(obj);
                b7Var = b7Var5;
                d = obj;
                weeklyChallengeLeaderboardResponse = (WeeklyChallengeLeaderboardResponse) d;
                if (weeklyChallengeLeaderboardResponse != null) {
                }
                return Unit.a;
            case 5:
                i3 = this.x;
                i = this.w;
                weeklyChallengeLeaderboardResponse = (WeeklyChallengeLeaderboardResponse) this.u;
                b7 b7Var6 = this.t;
                List<WeeklyChallengeLeagueAsset> list2 = this.s;
                weeklyChallengeViewModel3 = this.r;
                y6a.M(obj);
                b7Var = b7Var6;
                list = list2;
                e2 = obj;
                WeeklyChallengeLeaderboardResponse weeklyChallengeLeaderboardResponse22 = weeklyChallengeLeaderboardResponse;
                ProfileData profileData2 = (ProfileData) yaa.x((x2g) e2);
                fdiVar = weeklyChallengeViewModel3.k;
                UserAccount l22 = WeeklyChallengeViewModel.l();
                this.A = ku3Var;
                this.r = weeklyChallengeViewModel3;
                this.s = null;
                this.t = b7Var;
                this.u = null;
                this.v = fdiVar;
                this.w = i;
                this.x = i3;
                this.z = 6;
                k = weeklyChallengeViewModel3.k(profileData2, l22, list, weeklyChallengeLeaderboardResponse22, this);
                break;
            case 6:
                fdi fdiVar5 = this.v;
                y6a.M(obj);
                fdiVar = fdiVar5;
                k = obj;
                fdiVar.l(k);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
