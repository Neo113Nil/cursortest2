package defpackage;

import com.blaze.blazesdk.data_source.BlazeRecommendationsType;
import com.blaze.blazesdk.features.shared.repos.RecommendationsFetchStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uzl extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ RecommendationsFetchStrategy s;
    public final /* synthetic */ BlazeRecommendationsType.Trending t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzl(RecommendationsFetchStrategy recommendationsFetchStrategy, BlazeRecommendationsType.Trending trending, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = recommendationsFetchStrategy;
        this.t = trending;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new uzl(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new uzl(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            this.r = 1;
            Object fetchTrending = this.s.fetchTrending(this.t, this);
            return fetchTrending == lu3Var ? lu3Var : fetchTrending;
        }
        if (i == 1) {
            y6a.M(obj);
            return obj;
        }
        a70.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
