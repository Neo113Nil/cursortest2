package ru.ozon.app.android.fresh.geo.widgets.deliveryRating.presentation;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.geo.utils.ExtensionsKt;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.data.DeliveryRatingDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/presentation/DeliveryRatingMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/data/DeliveryRatingDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/presentation/DeliveryRatingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/data/DeliveryRatingDTO;J)Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/presentation/DeliveryRatingVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/geo/widgets/deliveryRating/data/DeliveryRatingDTO;Ll20/d;)Ljava/util/List;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryRatingMapper implements Function2<DeliveryRatingDTO, d, List<? extends DeliveryRatingVO>> {
    private final DeliveryRatingVO toVO(DeliveryRatingDTO deliveryRatingDTO, long j11) {
        AtomActionDTO action;
        TextDTO title = deliveryRatingDTO.getTitle();
        TextDTO subtitle = deliveryRatingDTO.getSubtitle();
        String image = deliveryRatingDTO.getImage();
        RatingDTO rating = deliveryRatingDTO.getRating();
        CommonControlSettings common = deliveryRatingDTO.getRating().getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, deliveryRatingDTO.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = deliveryRatingDTO.getTrackingInfo();
        return new DeliveryRatingVO(j11, title, subtitle, rating, atomAction, image, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryRatingVO> invoke(@NotNull DeliveryRatingDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtensionsKt.getId(widgetInfo)));
    }
}
