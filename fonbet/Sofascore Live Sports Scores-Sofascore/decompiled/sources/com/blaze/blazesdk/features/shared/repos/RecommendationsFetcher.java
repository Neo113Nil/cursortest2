package com.blaze.blazesdk.features.shared.repos;

import androidx.annotation.Keep;
import com.blaze.blazesdk.app_configurations.models.recommendations.RecommendationsConfigurations;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.BlazeRecommendationsType;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.a9m;
import defpackage.jdm;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.rrl;
import defpackage.rwl;
import defpackage.svl;
import defpackage.tul;
import defpackage.uzl;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/blaze/blazesdk/features/shared/repos/RecommendationsFetcher;", "", "<init>", "()V", "T", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Recommendations;", "dataSource", "Lcom/blaze/blazesdk/features/shared/repos/RecommendationsFetchStrategy;", U3.f.e, "La9m;", "execute", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType$Recommendations;Lcom/blaze/blazesdk/features/shared/repos/RecommendationsFetchStrategy;Lrq3;)Ljava/lang/Object;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecommendationsFetcher {
    public static final int $stable = 0;

    @NotNull
    public static final RecommendationsFetcher INSTANCE = new RecommendationsFetcher();

    private RecommendationsFetcher() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r7 == r10) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        if (r7 == r10) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object execute(@NotNull BlazeDataSourceType.Recommendations recommendations, @NotNull RecommendationsFetchStrategy<T> recommendationsFetchStrategy, @NotNull rq3<? super a9m> rq3Var) {
        rrl rrlVar;
        int i;
        RecommendationsConfigurations recommendationsConfigurations;
        Object unsupportedError;
        if (rq3Var instanceof rrl) {
            rrlVar = (rrl) rq3Var;
            int i2 = rrlVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rrlVar.u = i2 - Integer.MIN_VALUE;
                rrl rrlVar2 = rrlVar;
                Object obj = rrlVar2.s;
                lu3 lu3Var = lu3.a;
                i = rrlVar2.u;
                if (i != 0) {
                    y6a.M(obj);
                    tul tulVar = jdm.d;
                    if (tulVar != null && (recommendationsConfigurations = tulVar.e) != null) {
                        BlazeRecommendationsType type = recommendations.getType();
                        if (type instanceof BlazeRecommendationsType.ForYou) {
                            if (recommendationsConfigurations.isSupportForYou()) {
                                rwl rwlVar = rwl.a;
                                svl svlVar = new svl(recommendationsFetchStrategy, (BlazeRecommendationsType.ForYou) type, null);
                                rrlVar2.r = recommendationsFetchStrategy;
                                rrlVar2.u = 1;
                                obj = rwl.safeApiCall$default(rwlVar, false, svlVar, rrlVar2, 1, null);
                            } else {
                                unsupportedError = recommendationsFetchStrategy.unsupportedError();
                            }
                        } else {
                            if (!(type instanceof BlazeRecommendationsType.Trending)) {
                                zzl.b();
                                return null;
                            }
                            if (recommendationsConfigurations.isSupportTrending()) {
                                rwl rwlVar2 = rwl.a;
                                uzl uzlVar = new uzl(recommendationsFetchStrategy, (BlazeRecommendationsType.Trending) type, null);
                                rrlVar2.r = recommendationsFetchStrategy;
                                rrlVar2.u = 2;
                                obj = rwl.safeApiCall$default(rwlVar2, false, uzlVar, rrlVar2, 1, null);
                            } else {
                                unsupportedError = recommendationsFetchStrategy.unsupportedError();
                            }
                        }
                    }
                    return recommendationsFetchStrategy.unsupportedError();
                }
                if (i == 1) {
                    recommendationsFetchStrategy = rrlVar2.r;
                    y6a.M(obj);
                    unsupportedError = (a9m) obj;
                } else {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    recommendationsFetchStrategy = rrlVar2.r;
                    y6a.M(obj);
                    unsupportedError = (a9m) obj;
                }
                if (unsupportedError != null) {
                    return unsupportedError;
                }
                return recommendationsFetchStrategy.unsupportedError();
            }
        }
        rrlVar = new rrl(this, rq3Var);
        rrl rrlVar22 = rrlVar;
        Object obj2 = rrlVar22.s;
        lu3 lu3Var2 = lu3.a;
        i = rrlVar22.u;
        if (i != 0) {
        }
        if (unsupportedError != null) {
        }
        return recommendationsFetchStrategy.unsupportedError();
    }
}
