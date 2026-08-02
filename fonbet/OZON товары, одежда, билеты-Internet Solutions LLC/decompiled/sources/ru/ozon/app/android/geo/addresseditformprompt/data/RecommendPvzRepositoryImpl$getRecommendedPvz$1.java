package ru.ozon.app.android.geo.addresseditformprompt.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.geo.addresseditformprompt.data.RecommendPvzRepository;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class RecommendPvzRepositoryImpl$getRecommendedPvz$1 extends AbstractC7737t implements Function1<ActionV2Response<RecommendPvzResponse>, RecommendPvzRepository.Result> {
    public static final RecommendPvzRepositoryImpl$getRecommendedPvz$1 INSTANCE = new RecommendPvzRepositoryImpl$getRecommendedPvz$1();

    RecommendPvzRepositoryImpl$getRecommendedPvz$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final RecommendPvzRepository.Result invoke(ActionV2Response<RecommendPvzResponse> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RecommendPvzResponse data = it.getData();
        if (data == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (data.getCustomTplLink() != null && data.getViewport() != null) {
            return new RecommendPvzRepository.Result.Refresh(data.getCustomTplLink(), data.getViewport());
        }
        if (data.getRestriction() != null) {
            return new RecommendPvzRepository.Result.Notification(data.getRestriction(), it.getTrackingPayloads());
        }
        throw new IllegalArgumentException("refreshLink and restriction are null");
    }
}
