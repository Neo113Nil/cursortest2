package ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core;

import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackDTO;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackVO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "", "widgetId", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "toVO", "(Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;J)Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$WidgetButtons;", "mapButton", "(Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons;)Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO$WidgetButtons;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ButtonStackMapperKt {
    @NotNull
    public static final ButtonStackVO.WidgetButtons mapButton(@NotNull ButtonStackDTO.WidgetButtons widgetButtons) {
        Intrinsics.checkNotNullParameter(widgetButtons, "<this>");
        return new ButtonStackVO.WidgetButtons(widgetButtons.getButton(), ButtonStackVO.WidgetButtons.Sizing.valueOf(widgetButtons.getSizing().name()), widgetButtons.getButtonWidth());
    }

    @NotNull
    public static final ButtonStackVO toVO(@NotNull ButtonStackDTO buttonStackDTO, long j11) {
        Intrinsics.checkNotNullParameter(buttonStackDTO, "<this>");
        List<ButtonStackDTO.WidgetButtons> buttons = buttonStackDTO.getButtons();
        if (buttonStackDTO.getOrientation() != ButtonStackDTO.ButtonsOrientation.ORIENTATION_HORIZONTAL) {
            buttons = C7714v.K0(buttons, 2);
        }
        List<ButtonStackDTO.WidgetButtons> list = buttons;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapButton((ButtonStackDTO.WidgetButtons) it.next()));
        }
        boolean isSticky = buttonStackDTO.isSticky();
        ButtonStackVO.ButtonsOrientation valueOf = ButtonStackVO.ButtonsOrientation.valueOf(buttonStackDTO.getOrientation().name());
        ButtonStackDTO.ButtonsSize buttonsSize = buttonStackDTO.getButtonsSize();
        if (buttonsSize == null) {
            buttonsSize = ButtonStackDTO.ButtonsSize.SIZE_500;
        }
        ButtonStackVO.ButtonsSize valueOf2 = ButtonStackVO.ButtonsSize.valueOf(buttonsSize.name());
        String backgroundColor = buttonStackDTO.getBackgroundColor();
        CornerRadius backgroundRadius = buttonStackDTO.getBackgroundRadius();
        ButtonStackVO.AlignType valueOf3 = ButtonStackVO.AlignType.valueOf(buttonStackDTO.getAlign().name());
        ButtonStackDTO.Paddings paddings = buttonStackDTO.getPaddings();
        Paddings leftPadding = paddings != null ? paddings.getLeftPadding() : null;
        ButtonStackDTO.Paddings paddings2 = buttonStackDTO.getPaddings();
        Paddings rightPadding = paddings2 != null ? paddings2.getRightPadding() : null;
        ButtonStackDTO.Paddings paddings3 = buttonStackDTO.getPaddings();
        Paddings topPadding = paddings3 != null ? paddings3.getTopPadding() : null;
        ButtonStackDTO.Paddings paddings4 = buttonStackDTO.getPaddings();
        Paddings bottomPadding = paddings4 != null ? paddings4.getBottomPadding() : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = buttonStackDTO.getTrackingInfo();
        return new ButtonStackVO(j11, arrayList, isSticky, valueOf, valueOf2, backgroundColor, backgroundRadius, valueOf3, leftPadding, rightPadding, topPadding, bottomPadding, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null);
    }
}
