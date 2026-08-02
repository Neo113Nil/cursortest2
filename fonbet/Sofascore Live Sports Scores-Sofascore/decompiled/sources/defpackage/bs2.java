package defpackage;

import com.sofascore.model.chat.BanReason;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.fantasy.FantasyEditLeagueBody;
import com.sofascore.model.fantasy.FantasySubstitutionsPostBody;
import com.sofascore.model.newNetwork.AiInsightsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaReactionPost;
import com.sofascore.network.api.FantasyAPI;
import com.sofascore.network.api.NetworkCoroutineAPI;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bs2 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs2(fyk fykVar, String str, String str2, int i, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = 8;
        this.v = fykVar;
        this.u = str;
        this.w = str2;
        this.t = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.w;
        Object obj2 = this.u;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                return new bs2((cs2) obj3, this.t, (String) obj2, (BanReason) obj, rq3Var, 0);
            case 1:
                return new bs2((xs5) obj3, this.t, (String) obj2, (String) obj, rq3Var, 1);
            case 2:
                return new bs2((String) obj2, (s96) obj3, this.t, (String) obj, rq3Var);
            case 3:
                return new bs2((wi7) obj3, this.t, (String) obj2, (String) obj, rq3Var, 3);
            case 4:
                return new bs2((wi7) obj3, this.t, (List) obj2, (Boolean) obj, rq3Var, 4);
            case 5:
                return new bs2((w3b) obj3, this.t, (String) obj2, (String) obj, rq3Var, 5);
            case 6:
                return new bs2((m7c) obj3, this.t, (MediaReactionType) obj2, (MediaReactionType) obj, rq3Var, 6);
            case 7:
                return new bs2((pyg) obj3, this.t, (nxg) obj2, (ComparisonSeasonInfo) obj, rq3Var, 7);
            default:
                return new bs2((fyk) obj3, (String) obj2, (String) obj, this.t, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((bs2) create(rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0140, code lost:
    
        if (r14 == r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0150, code lost:
    
        if (r14 != r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
    
        return r0;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.t;
        Object obj2 = this.w;
        Object obj3 = this.u;
        Object obj4 = this.v;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object reportMessage = ((cs2) obj4).b.reportMessage(i2, (String) obj3, (BanReason) obj2, this);
                    return reportMessage == lu3Var ? lu3Var : reportMessage;
                }
                if (i3 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var = ((xs5) obj4).l;
                this.s = 1;
                s96Var.getClass();
                Object P = yaa.P(new bs2((String) obj2, s96Var, this.t, (String) obj3, (rq3) null), this);
                return P == lu3Var2 ? lu3Var2 : P;
            case 2:
                String str = (String) obj2;
                s96 s96Var2 = (s96) obj4;
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    String str2 = (String) obj3;
                    if (str2 != null) {
                        NetworkCoroutineAPI networkCoroutineAPI = s96Var2.a;
                        this.s = 1;
                        obj = networkCoroutineAPI.getEventAiInsights(i2, str, str2, this);
                        break;
                    }
                    NetworkCoroutineAPI networkCoroutineAPI2 = s96Var2.a;
                    this.s = 2;
                    obj = networkCoroutineAPI2.getEventAiInsightsPostMatch(i2, str, this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            y6a.M(obj);
                            return (AiInsightsResponse) obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                AiInsightsResponse aiInsightsResponse = (AiInsightsResponse) obj;
                if (aiInsightsResponse != null) {
                    return aiInsightsResponse;
                }
                NetworkCoroutineAPI networkCoroutineAPI22 = s96Var2.a;
                this.s = 2;
                obj = networkCoroutineAPI22.getEventAiInsightsPostMatch(i2, str, this);
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI = ((wi7) obj4).a;
                FantasyEditLeagueBody fantasyEditLeagueBody = new FantasyEditLeagueBody((String) obj3, (String) obj2);
                this.s = 1;
                Object editLeague = fantasyAPI.editLeague(i2, fantasyEditLeagueBody, this);
                return editLeague == lu3Var4 ? lu3Var4 : editLeague;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI2 = ((wi7) obj4).a;
                FantasySubstitutionsPostBody fantasySubstitutionsPostBody = new FantasySubstitutionsPostBody((List) obj3, (Boolean) obj2);
                this.s = 1;
                Object postSubstitutions = fantasyAPI2.postSubstitutions(i2, fantasySubstitutionsPostBody, this);
                return postSubstitutions == lu3Var5 ? lu3Var5 : postSubstitutions;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object uniqueTournamentProspects = ((w3b) obj4).b.uniqueTournamentProspects(i2, (String) obj3, (String) obj2, this);
                    return uniqueTournamentProspects == lu3Var6 ? lu3Var6 : uniqueTournamentProspects;
                }
                if (i8 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                NetworkCoroutineAPI networkCoroutineAPI3 = ((m7c) obj4).a;
                MediaReactionType mediaReactionType = (MediaReactionType) obj3;
                MediaReactionType mediaReactionType2 = (MediaReactionType) obj2;
                MediaReactionPost mediaReactionPost = new MediaReactionPost(mediaReactionType != null ? mediaReactionType.getType() : null, mediaReactionType2 != null ? mediaReactionType2.getType() : null);
                this.s = 1;
                Object addMediaPostReaction = networkCoroutineAPI3.addMediaPostReaction(i2, mediaReactionPost, this);
                return addMediaPostReaction == lu3Var7 ? lu3Var7 : addMediaPostReaction;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((pyg) obj4).x(i2, ((fxg) ((nxg) obj3)).b, (ComparisonSeasonInfo) obj2, this) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var9 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object userPredictions = ((fyk) obj4).c.userPredictions((String) obj3, (String) obj2, i2, this);
                    return userPredictions == lu3Var9 ? lu3Var9 : userPredictions;
                }
                if (i11 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bs2(Object obj, int i, Object obj2, Object obj3, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.v = obj;
        this.t = i;
        this.u = obj2;
        this.w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs2(String str, s96 s96Var, int i, String str2, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = 2;
        this.u = str;
        this.v = s96Var;
        this.t = i;
        this.w = str2;
    }
}
