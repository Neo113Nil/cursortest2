package com.blaze.blazesdk.features.shared.repos;

import androidx.annotation.Keep;
import com.blaze.blazesdk.data_source.BlazeRecommendationsType;
import defpackage.a6m;
import defpackage.c2g;
import defpackage.rq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J \u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/features/shared/repos/RecommendationsFetchStrategy;", "T", "", "Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$ForYou;", "type", "Lc2g;", "fetchForYou", "(Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$ForYou;Lrq3;)Ljava/lang/Object;", "Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$Trending;", "fetchTrending", "(Lcom/blaze/blazesdk/data_source/BlazeRecommendationsType$Trending;Lrq3;)Ljava/lang/Object;", "La6m;", "unsupportedError", "()La6m;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RecommendationsFetchStrategy<T> {
    @Nullable
    Object fetchForYou(@NotNull BlazeRecommendationsType.ForYou forYou, @NotNull rq3<? super c2g<T>> rq3Var);

    @Nullable
    Object fetchTrending(@NotNull BlazeRecommendationsType.Trending trending, @NotNull rq3<? super c2g<T>> rq3Var);

    @NotNull
    a6m unsupportedError();
}
