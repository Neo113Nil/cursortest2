package ru.ozon.app.android.commonwidgets.widgets.iconButton.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.presentation.IconButtonWidgetVO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/IconButtonWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/IconButtonWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/presentation/IconButtonWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/IconButtonWidgetDTO;Ll20/d;)Ljava/util/List;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IconButtonWidgetMapper implements Function2<IconButtonWidgetDTO, d, List<? extends IconButtonWidgetVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<IconButtonWidgetVO> invoke(@NotNull IconButtonWidgetDTO state, @NotNull d widgetInfo) {
        DynamicOnScrollColors dynamicOnScrollColors;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.getIconButton().hashCode();
        IconButtonV3DTO iconButton = state.getIconButton();
        PaddingOption options = state.getOptions();
        DynamicOnScrollColors dynamicOnScrollColors2 = state.getDynamicOnScrollColors();
        if (dynamicOnScrollColors2 != null) {
            String iconTintColorExpanded = state.getDynamicOnScrollColors().getIconTintColorExpanded();
            if (iconTintColorExpanded == null) {
                iconTintColorExpanded = state.getIconButton().getIconColor();
            }
            String iconTintColorCollapsed = state.getDynamicOnScrollColors().getIconTintColorCollapsed();
            if (iconTintColorCollapsed == null) {
                iconTintColorCollapsed = state.getIconButton().getIconColor();
            }
            String backgroundColorExpanded = state.getDynamicOnScrollColors().getBackgroundColorExpanded();
            if (backgroundColorExpanded == null) {
                backgroundColorExpanded = state.getIconButton().getBackgroundColor();
            }
            String backgroundColorCollapsed = state.getDynamicOnScrollColors().getBackgroundColorCollapsed();
            if (backgroundColorCollapsed == null) {
                backgroundColorCollapsed = state.getIconButton().getBackgroundColor();
            }
            dynamicOnScrollColors = dynamicOnScrollColors2.copy(iconTintColorExpanded, iconTintColorCollapsed, backgroundColorExpanded, backgroundColorCollapsed);
        } else {
            dynamicOnScrollColors = null;
        }
        return C7714v.a0(new IconButtonWidgetVO(hashCode, options, iconButton, dynamicOnScrollColors, state.getDynamicOnScrollColors() != null));
    }
}
