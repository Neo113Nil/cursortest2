package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.data.FreshProgressBarDTO;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarMapperKt;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.data.CheckoutTotalDTO;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalVO;
import ru.ozon.app.android.fresh.common.utils.ExtentionsKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u001b\u0010\u000b\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000b\u0010\u0014J\u0013\u0010\u000b\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u000b\u0010\u0017J\u0013\u0010\u000b\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u000b\u0010\u001aJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary;", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection;", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$InteractiveActions;", "", "widgetId", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$InteractiveActions;", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$InteractiveActions;Ljava/lang/String;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$InteractiveActions;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection$PriceBlock;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection$PriceBlock;", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$PriceSection$PriceBlock;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection$PriceBlock;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Spacers;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Spacers;", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO$Summary$Spacers;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$Spacers;", "state", "info", "invoke", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO;Ll20/d;)Ljava/util/List;", "", "toVO$widgets_checkout_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/data/CheckoutTotalDTO;J)Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutTotalMapper implements Function2<CheckoutTotalDTO, d, List<? extends CheckoutTotalVO>> {
    private final CheckoutTotalVO.Summary toVO(CheckoutTotalDTO.Summary summary) {
        CheckoutTotalVO.Summary.Header header = new CheckoutTotalVO.Summary.Header(summary.getHeader().getTitle(), summary.getHeader().getPrice());
        CheckoutTotalVO.Summary.PriceSection vo = toVO(summary.getPriceSection());
        List<CellDTO> infos = summary.getInfos();
        CheckoutTotalDTO.Summary.Spacers spacers = summary.getSpacers();
        if (spacers == null) {
            spacers = new CheckoutTotalDTO.Summary.Spacers(null, null, null, null, null, null, 63, null);
        }
        return new CheckoutTotalVO.Summary(header, vo, infos, toVO(spacers));
    }

    @NotNull
    public final CheckoutTotalVO toVO$widgets_checkout_prodGoogleAllVendorsRelease(@NotNull CheckoutTotalDTO checkoutTotalDTO, long j11) {
        Intrinsics.checkNotNullParameter(checkoutTotalDTO, "<this>");
        CheckoutTotalVO.InteractiveActions vo = toVO(checkoutTotalDTO.getInteractiveActions(), String.valueOf(j11));
        CheckoutTotalVO.Summary vo2 = toVO(checkoutTotalDTO.getSummary());
        String backgroundColor = checkoutTotalDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str = backgroundColor;
        Map<String, TokenizedTrackingInfo> trackingInfo = checkoutTotalDTO.getTrackingInfo();
        t tVar = null;
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(j11);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            tVar = x.b(trackingInfo, valueOf, null);
        }
        return new CheckoutTotalVO(j11, vo2, vo, str, tVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CheckoutTotalVO> invoke(@NotNull CheckoutTotalDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO$widgets_checkout_prodGoogleAllVendorsRelease(state, ExtentionsKt.getId(info)));
    }

    private final CheckoutTotalVO.Summary.PriceSection toVO(CheckoutTotalDTO.Summary.PriceSection priceSection) {
        List<CheckoutTotalDTO.Summary.PriceSection.PriceBlock> prices = priceSection.getPrices();
        ArrayList arrayList = new ArrayList(C7714v.z(prices, 10));
        Iterator<T> it = prices.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((CheckoutTotalDTO.Summary.PriceSection.PriceBlock) it.next()));
        }
        String backgroundColor = priceSection.getBackgroundColor();
        CornerRadius cornerRadius = priceSection.getCornerRadius();
        return new CheckoutTotalVO.Summary.PriceSection(arrayList, backgroundColor, cornerRadius != null ? Integer.valueOf(UiExtKt.toPx(cornerRadius.getPx())) : null);
    }

    private final CheckoutTotalVO.InteractiveActions toVO(CheckoutTotalDTO.InteractiveActions interactiveActions, String str) {
        ButtonV3DTO button = interactiveActions.getButton();
        List<AtomDTO> hints = interactiveActions.getHints();
        if (hints == null || hints.isEmpty()) {
            hints = null;
        }
        FreshProgressBarDTO progressBar = interactiveActions.getProgressBar();
        return new CheckoutTotalVO.InteractiveActions(button, hints, progressBar != null ? FreshCheckoutProgressBarMapperKt.toVO(progressBar, str) : null);
    }

    private final CheckoutTotalVO.Summary.PriceSection.PriceBlock toVO(CheckoutTotalDTO.Summary.PriceSection.PriceBlock priceBlock) {
        return new CheckoutTotalVO.Summary.PriceSection.PriceBlock(priceBlock.getTitle(), priceBlock.getPrice(), priceBlock.getSubtitle(), priceBlock.getInfoBadge());
    }

    private final CheckoutTotalVO.Summary.Spacers toVO(CheckoutTotalDTO.Summary.Spacers spacers) {
        return new CheckoutTotalVO.Summary.Spacers(UiExtKt.toPx(spacers.getTop().getPx()), UiExtKt.toPx(spacers.getBottom().getPx()), UiExtKt.toPx(spacers.getLeft().getPx()), UiExtKt.toPx(spacers.getRight().getPx()), UiExtKt.toPx(spacers.getBetweenPrices().getPx()), UiExtKt.toPx(spacers.getBetweenInfos().getPx()));
    }
}
