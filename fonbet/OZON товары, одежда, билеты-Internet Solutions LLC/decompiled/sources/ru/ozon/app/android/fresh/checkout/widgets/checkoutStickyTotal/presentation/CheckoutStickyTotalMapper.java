package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation;

import WZ.t;
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
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.data.FreshProgressBarDTO;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarMapperKt;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.data.CheckoutStickyTotalDTO;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation.CheckoutStickyTotalVO;
import ru.ozon.app.android.fresh.common.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation.CheckoutButtonMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation.CheckoutButtonVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO;J)Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalVO;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO$Spacers;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalVO$Spacers;", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO$Spacers;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalVO$Spacers;", "state", "info", "invoke", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalDTO;Ll20/d;)Ljava/util/List;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutStickyTotalMapper implements Function2<CheckoutStickyTotalDTO, d, List<? extends CheckoutStickyTotalVO>> {
    private final CheckoutStickyTotalVO toVO(CheckoutStickyTotalDTO checkoutStickyTotalDTO, long j11) {
        CheckoutButtonVO vo = CheckoutButtonMapperKt.toVO(checkoutStickyTotalDTO.getButton(), j11);
        BadgeDTO badgeInfo = checkoutStickyTotalDTO.getBadgeInfo();
        CheckoutStickyTotalDTO.Spacers spacers = checkoutStickyTotalDTO.getSpacers();
        if (spacers == null) {
            spacers = new CheckoutStickyTotalDTO.Spacers(null, null, null, null, 15, null);
        }
        CheckoutStickyTotalVO.Spacers vo2 = toVO(spacers);
        String borderColor = checkoutStickyTotalDTO.getBorderColor();
        String backgroundColor = checkoutStickyTotalDTO.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = checkoutStickyTotalDTO.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Boolean isRoundedCorners = checkoutStickyTotalDTO.isRoundedCorners();
        boolean booleanValue = isRoundedCorners != null ? isRoundedCorners.booleanValue() : true;
        FreshProgressBarDTO progressBar = checkoutStickyTotalDTO.getProgressBar();
        return new CheckoutStickyTotalVO(j11, vo, badgeInfo, borderColor, backgroundColor, vo2, mapToTokenizedEvent$default, booleanValue, progressBar != null ? FreshCheckoutProgressBarMapperKt.toVO(progressBar, String.valueOf(j11)) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CheckoutStickyTotalVO> invoke(@NotNull CheckoutStickyTotalDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(info)));
    }

    private final CheckoutStickyTotalVO.Spacers toVO(CheckoutStickyTotalDTO.Spacers spacers) {
        return new CheckoutStickyTotalVO.Spacers(UiExtKt.toPx(spacers.getTop().getPx()), UiExtKt.toPx(spacers.getBottom().getPx()), UiExtKt.toPx(spacers.getLeft().getPx()), UiExtKt.toPx(spacers.getRight().getPx()));
    }
}
