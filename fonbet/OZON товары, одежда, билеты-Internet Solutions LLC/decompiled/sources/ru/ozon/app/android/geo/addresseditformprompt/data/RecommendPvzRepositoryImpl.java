package ru.ozon.app.android.geo.addresseditformprompt.data;

import Bc.r;
import Bc.w;
import DM.h;
import Mc.a;
import W10.c;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.geo.addresseditformprompt.data.RecommendPvzRepository;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepositoryImpl;", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "link", "LW10/c;", "trackingData", "Lio/reactivex/y;", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result;", "getRecommendedPvz", "(Ljava/lang/String;LW10/c;)Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecommendPvzRepositoryImpl implements RecommendPvzRepository {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    public RecommendPvzRepositoryImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendPvzRepository.Result getRecommendedPvz$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (RecommendPvzRepository.Result) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.geo.addresseditformprompt.data.RecommendPvzRepository
    @NotNull
    public y<RecommendPvzRepository.Result> getRecommendedPvz(@NotNull String link, c trackingData) {
        Intrinsics.checkNotNullParameter(link, "link");
        ActionV2Request actionV2Request = new ActionV2Request(null, link, false, 5, null);
        ActionV2Repository actionV2Repository = this.actionV2Repository;
        if (trackingData == null) {
            trackingData = new c(null, null, null);
        }
        y callActionWithTracking = actionV2Repository.callActionWithTracking(actionV2Request, trackingData, RecommendPvzResponse.class);
        h hVar = new h(RecommendPvzRepositoryImpl$getRecommendedPvz$1.INSTANCE, 11);
        callActionWithTracking.getClass();
        w j11 = new r(callActionWithTracking, hVar).j(a.b());
        Intrinsics.checkNotNullExpressionValue(j11, "subscribeOn(...)");
        return j11;
    }
}
