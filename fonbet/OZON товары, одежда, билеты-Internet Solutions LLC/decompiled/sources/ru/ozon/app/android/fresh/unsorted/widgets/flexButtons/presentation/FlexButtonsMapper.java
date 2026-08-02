package ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.presentation;

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
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.data.FlexButtonsDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.domain.FlexButtonsVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/presentation/FlexButtonsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FlexButtonsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$Spacers;", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FlexButtonsVO$Spacers;", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$Spacers;)Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FlexButtonsVO$Spacers;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO;Ll20/d;)Ljava/util/List;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlexButtonsMapper implements Function2<FlexButtonsDTO, d, List<? extends FlexButtonsVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int defaultHorizontalMargin = ResourceExtKt.toPx(16);
    private static final int defaultVerticalMargin = ResourceExtKt.toPx(0);
    private static final int defaultBetweenButtonsMargin = ResourceExtKt.toPx(6);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/presentation/FlexButtonsMapper$Companion;", "", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final FlexButtonsVO.Spacers toVO(FlexButtonsDTO.Spacers spacers) {
        Paddings betweenButtons;
        Paddings bottom;
        Paddings top;
        Paddings right;
        Paddings left;
        return new FlexButtonsVO.Spacers((spacers == null || (left = spacers.getLeft()) == null) ? defaultHorizontalMargin : ResourceExtKt.toPx(left.getPx()), (spacers == null || (right = spacers.getRight()) == null) ? defaultHorizontalMargin : ResourceExtKt.toPx(right.getPx()), (spacers == null || (top = spacers.getTop()) == null) ? defaultVerticalMargin : ResourceExtKt.toPx(top.getPx()), (spacers == null || (bottom = spacers.getBottom()) == null) ? defaultVerticalMargin : ResourceExtKt.toPx(bottom.getPx()), (spacers == null || (betweenButtons = spacers.getBetweenButtons()) == null) ? defaultBetweenButtonsMargin : ResourceExtKt.toPx(betweenButtons.getPx()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FlexButtonsVO> invoke(@NotNull FlexButtonsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        List<ButtonV3DTO> buttons = state.getButtons();
        FlexButtonsVO.Spacers vo = toVO(state.getSpacers());
        FlexButtonsDTO.ButtonsArrangement buttonsArrangement = state.getButtonsArrangement();
        if (buttonsArrangement == null) {
            buttonsArrangement = FlexButtonsDTO.ButtonsArrangement.EVEN_SPREAD;
        }
        return C7714v.a0(new FlexButtonsVO(hashCode, buttons, mapToTokenizedEvent$default, vo, buttonsArrangement));
    }
}
