package defpackage;

import com.blaze.blazesdk.features.shared.repos.RecommendationsFetchStrategy;
import com.blaze.blazesdk.features.shared.repos.RecommendationsFetcher;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rrl extends sq3 {
    public RecommendationsFetchStrategy r;
    public /* synthetic */ Object s;
    public final /* synthetic */ RecommendationsFetcher t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrl(RecommendationsFetcher recommendationsFetcher, rq3 rq3Var) {
        super(rq3Var);
        this.t = recommendationsFetcher;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.execute(null, null, this);
    }
}
