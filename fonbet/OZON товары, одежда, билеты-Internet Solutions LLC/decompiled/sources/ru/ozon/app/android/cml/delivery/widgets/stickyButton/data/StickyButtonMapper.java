package ru.ozon.app.android.cml.delivery.widgets.stickyButton.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.widgets.stickyButton.presentation.StickyButtonVO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/stickyButton/data/StickyButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/stickyButton/data/StickyButtonDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/stickyButton/presentation/StickyButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/stickyButton/data/StickyButtonDTO;Ll20/d;)Ljava/util/List;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyButtonMapper implements Function2<StickyButtonDTO, d, List<? extends StickyButtonVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<StickyButtonVO> invoke(@NotNull StickyButtonDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = WidgetExtKt.getWidgetId(widgetInfo);
        ButtonV3DTO button = state.getButton();
        String topBorderColor = state.getTopBorderColor();
        String backgroundColor = state.getBackgroundColor();
        CornerRadius topCornerRadius = state.getTopCornerRadius();
        if (topCornerRadius == null) {
            topCornerRadius = CornerRadius.NO_RADIUS;
        }
        CornerRadius cornerRadius = topCornerRadius;
        Paddings topPadding = state.getTopPadding();
        if (topPadding == null) {
            topPadding = Paddings.NONE;
        }
        Paddings paddings = topPadding;
        Paddings rightPadding = state.getRightPadding();
        if (rightPadding == null) {
            rightPadding = Paddings.NONE;
        }
        Paddings paddings2 = rightPadding;
        Paddings bottomPadding = state.getBottomPadding();
        if (bottomPadding == null) {
            bottomPadding = Paddings.NONE;
        }
        Paddings paddings3 = bottomPadding;
        Paddings leftPadding = state.getLeftPadding();
        if (leftPadding == null) {
            leftPadding = Paddings.NONE;
        }
        return C7714v.a0(new StickyButtonVO(widgetId, button, topBorderColor, backgroundColor, cornerRadius, paddings, paddings2, paddings3, leftPadding));
    }
}
