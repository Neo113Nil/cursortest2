package ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.core;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.data.PriceCellDTO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation.PriceCellVO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation.PriceCounterBadge;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u0000 \u001e2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u001eB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/core/PriceCellMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVo", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO;J)Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$CounterBadge;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCounterBadge;", "toVoBadge", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$CounterBadge;)Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCounterBadge;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$Disclosure;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$Disclosure;", "toVoDisclosure", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO$Disclosure;)Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$Disclosure;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "", "withSubtitle", "calcMaxLines", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Z)Lru/ozon/uni/atoms/data/texts/TextAtom;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/data/PriceCellDTO;Ll20/d;)Ljava/util/List;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceCellMapper implements Function2<PriceCellDTO, d, List<? extends PriceCellVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/core/PriceCellMapper$Companion;", "", "<init>", "()V", "TITLE_MAX_LINES", "", "TITLE_WITHOUT_SUBTITLE_MAX_LINES", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final TextAtom calcMaxLines(TextAtom textAtom, boolean z11) {
        return TextAtom.copy$default(textAtom, null, null, null, Integer.valueOf(z11 ? 1 : 2), null, null, null, 119, null);
    }

    private final PriceCellVO toVo(PriceCellDTO priceCellDTO, long j11) {
        String tabGroupId = priceCellDTO.getTabGroupId();
        Icon icon = priceCellDTO.getIcon();
        TextAtom title = priceCellDTO.getTitle();
        TextAtom subtitle = priceCellDTO.getSubtitle();
        OzonSpannableString text = subtitle != null ? subtitle.getText() : null;
        TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(calcMaxLines(title, !(text == null || text.length() == 0)));
        TextAtom subtitle2 = priceCellDTO.getSubtitle();
        TextDTO dsTextAtom$default = subtitle2 != null ? TextMapperKt.dsTextAtom$default(subtitle2, null, null, null, null, null, null, null, null, null, 1, null, false, 3583, null) : null;
        PriceCellDTO.CounterBadge counterBadge = priceCellDTO.getCounterBadge();
        PriceCounterBadge voBadge = counterBadge != null ? toVoBadge(counterBadge) : null;
        PriceCellDTO.Disclosure disclosure = priceCellDTO.getDisclosure();
        PriceCellVO.Disclosure voDisclosure = disclosure != null ? toVoDisclosure(disclosure) : null;
        String innerBackgroundColor = priceCellDTO.getInnerBackgroundColor();
        if (innerBackgroundColor == null) {
            innerBackgroundColor = UniColors.BG_PRIMARY.getToken();
        }
        String outerBackgroundColor = priceCellDTO.getOuterBackgroundColor();
        if (outerBackgroundColor == null) {
            outerBackgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        PriceCellVO.BackgroundColors backgroundColors = new PriceCellVO.BackgroundColors(innerBackgroundColor, outerBackgroundColor);
        AtomActionDTO action = priceCellDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, priceCellDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = priceCellDTO.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Integer animationTimer = priceCellDTO.getAnimationTimer();
        Map<String, TokenizedTrackingInfo> animationTrackingInfo = priceCellDTO.getAnimationTrackingInfo();
        return new PriceCellVO(j11, tabGroupId, icon, dsTextAtom, dsTextAtom$default, voBadge, voDisclosure, backgroundColors, atomAction, mapToTokenizedEvent$default, animationTimer, animationTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(animationTrackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final PriceCounterBadge toVoBadge(PriceCellDTO.CounterBadge counterBadge) {
        String value = counterBadge.getValue();
        String textColor = counterBadge.getTextColor();
        if (textColor == null) {
            textColor = UniColors.TEXT_SECONDARY.getToken();
        }
        String backgroundColor = counterBadge.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_SECONDARY.getToken();
        }
        return new PriceCounterBadge(value, textColor, backgroundColor);
    }

    private final PriceCellVO.Disclosure toVoDisclosure(PriceCellDTO.Disclosure disclosure) {
        String tintColor = disclosure.getTintColor();
        if (tintColor == null) {
            tintColor = UniColors.GRAPHIC_QUATERNARY.getToken();
        }
        return new PriceCellVO.Disclosure(tintColor);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PriceCellVO> invoke(@NotNull PriceCellDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
