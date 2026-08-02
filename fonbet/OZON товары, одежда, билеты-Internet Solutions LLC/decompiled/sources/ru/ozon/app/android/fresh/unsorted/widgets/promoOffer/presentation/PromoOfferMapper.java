package ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation;

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
import ru.ozon.app.android.fresh.unsorted.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.data.PromoOfferDTO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/data/PromoOfferDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/data/PromoOfferDTO;J)Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/data/PromoOfferDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoOfferMapper implements Function2<PromoOfferDTO, d, List<? extends PromoOfferVO>> {
    private final PromoOfferVO toVO(PromoOfferDTO promoOfferDTO, long j11) {
        TextDTO title = promoOfferDTO.getTitle();
        TextDTO subtitle = promoOfferDTO.getSubtitle();
        ButtonV3DTO button = promoOfferDTO.getButton();
        NotificationDTO notification = promoOfferDTO.getNotification();
        String backgroundColor = promoOfferDTO.getBackgroundColor();
        ImageDTO image = promoOfferDTO.getImage();
        float pxF = UiExtKt.toPxF(promoOfferDTO.getRadius().getPx());
        Map<String, TokenizedTrackingInfo> trackingInfo = promoOfferDTO.getTrackingInfo();
        return new PromoOfferVO(j11, title, subtitle, button, notification, image, backgroundColor, pxF, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PromoOfferVO> invoke(@NotNull PromoOfferDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }
}
