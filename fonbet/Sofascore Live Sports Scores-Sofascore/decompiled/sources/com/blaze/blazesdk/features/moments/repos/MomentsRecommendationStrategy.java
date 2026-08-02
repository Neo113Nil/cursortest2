package com.blaze.blazesdk.features.moments.repos;

import androidx.annotation.Keep;
import com.blaze.blazesdk.data_source.BlazeRecommendationsType;
import com.blaze.blazesdk.features.moments.models.responses.MomentsResponse;
import com.blaze.blazesdk.features.shared.repos.RecommendationsFetchStrategy;
import defpackage.a6m;
import defpackage.c2g;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.ul6;
import defpackage.vsl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/blaze/blazesdk/features/moments/repos/MomentsRecommendationStrategy;", "Lcom/blaze/blazesdk/features/shared/repos/RecommendationsFetchStrategy;", "Lcom/blaze/blazesdk/features/moments/models/responses/MomentsResponse;", "Lvsl;", "api", "<init>", "(Lvsl;)V", "Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$ForYou;", "type", "Lc2g;", "fetchForYou", "(Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$ForYou;Lrq3;)Ljava/lang/Object;", "Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$Trending;", "fetchTrending", "(Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$Trending;Lrq3;)Ljava/lang/Object;", "La6m;", "unsupportedError", "()La6m;", "Lvsl;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MomentsRecommendationStrategy implements RecommendationsFetchStrategy<MomentsResponse> {
    public static final int $stable = 8;

    @Nullable
    private final vsl api;

    public MomentsRecommendationStrategy(@Nullable vsl vslVar) {
        this.api = vslVar;
    }

    @Override // com.blaze.blazesdk.features.shared.repos.RecommendationsFetchStrategy
    @Nullable
    public Object fetchForYou(@NotNull BlazeRecommendationsType.ForYou forYou, @NotNull rq3<? super c2g<MomentsResponse>> rq3Var) {
        vsl vslVar = this.api;
        if (vslVar == null) {
            return null;
        }
        Object forYouMoments = vslVar.getForYouMoments(forYou.getAnyLabelFilterQueryParam$blazesdk_release(), forYou.getPromotedLabelsQueryParam$blazesdk_release(), rq3Var);
        return forYouMoments == lu3.a ? forYouMoments : (c2g) forYouMoments;
    }

    @Override // com.blaze.blazesdk.features.shared.repos.RecommendationsFetchStrategy
    @Nullable
    public Object fetchTrending(@NotNull BlazeRecommendationsType.Trending trending, @NotNull rq3<? super c2g<MomentsResponse>> rq3Var) {
        vsl vslVar = this.api;
        if (vslVar == null) {
            return null;
        }
        Object trendingMoments = vslVar.getTrendingMoments(trending.getAnyLabelFilterQueryParam$blazesdk_release(), rq3Var);
        return trendingMoments == lu3.a ? trendingMoments : (c2g) trendingMoments;
    }

    @Override // com.blaze.blazesdk.features.shared.repos.RecommendationsFetchStrategy
    @NotNull
    public a6m unsupportedError() {
        return ul6.e;
    }
}
