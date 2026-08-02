package ru.ozon.app.android.common.buttonwidget.core;

import Ih.a;
import android.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.ui.buttonwidget.ButtonVO;
import ru.ozon.app.android.widgets.buttonWidget.AlignType;
import ru.ozon.app.android.widgets.buttonWidget.ButtonWidgetDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/common/buttonwidget/core/ButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/common/ui/buttonwidget/ButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;Ljava/lang/String;)Lru/ozon/app/android/common/ui/buttonwidget/ButtonVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/widgets/buttonWidget/ButtonWidgetDTO;Ll20/d;)Ljava/util/List;", "button-widget_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonMapper implements Function2<ButtonWidgetDTO, d, List<? extends ButtonVO>> {
    private final ButtonVO toVO(ButtonWidgetDTO buttonWidgetDTO, String str) {
        long a11 = a.a("ButtonView", str);
        ButtonV3Atom.LargeButton button = buttonWidgetDTO.getButton();
        ButtonDTO buttonV2 = buttonWidgetDTO.getButtonV2();
        ButtonV3DTO buttonV3 = buttonWidgetDTO.getButtonV3();
        Boolean hasShadowIfSticky = buttonWidgetDTO.getHasShadowIfSticky();
        Boolean valueOf = Boolean.valueOf(hasShadowIfSticky != null ? hasShadowIfSticky.booleanValue() : true);
        AlignType align = buttonWidgetDTO.getAlign();
        if (align == null) {
            align = AlignType.ALIGN_CENTER;
        }
        AlignType alignType = align;
        Boolean buttonFill = buttonWidgetDTO.getButtonFill();
        boolean booleanValue = buttonFill != null ? buttonFill.booleanValue() : false;
        Integer buttonHorizontalMargin = buttonWidgetDTO.getButtonHorizontalMargin();
        int intValue = buttonHorizontalMargin != null ? buttonHorizontalMargin.intValue() : 0;
        Integer buttonVerticalMargin = buttonWidgetDTO.getButtonVerticalMargin();
        return new ButtonVO(a11, button, buttonV2, buttonV3, valueOf, alignType, booleanValue, intValue, buttonVerticalMargin != null ? buttonVerticalMargin.intValue() : 0, Intrinsics.d(buttonWidgetDTO.getHasBackgroundColor(), Boolean.FALSE) ? R.color.transparent : UniColors.LAYER_FLOOR_1.getResId());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ButtonVO> invoke(@NotNull ButtonWidgetDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d()));
    }
}
