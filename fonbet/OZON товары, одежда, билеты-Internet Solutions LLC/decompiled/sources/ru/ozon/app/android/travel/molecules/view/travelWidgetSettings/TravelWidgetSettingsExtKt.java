package ru.ozon.app.android.travel.molecules.view.travelWidgetSettings;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.travel.utils.compouseExt.ApplyWidgetSettingsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Landroid/view/View;", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO$PaddingsVO;", "paddings", "", "topInset", "bottomInset", "leftInset", "rightInset", "", "updatePadding", "(Landroid/view/View;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO$PaddingsVO;IIII)V", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "new", "cached", "defaultBackgroundColorId", "safeUpdateBackground", "(Landroid/view/View;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;I)V", "Landroidx/compose/ui/e;", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "settings", "applyWidgetSettings", "(Landroidx/compose/ui/e;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;LS0/k;II)Landroidx/compose/ui/e;", "defaultBackgroundColor", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelWidgetSettingsExtKt {
    @NotNull
    public static final e applyWidgetSettings(@NotNull e eVar, TravelWidgetSettingsDTO travelWidgetSettingsDTO, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        TravelWidgetSettingsDTO.PaddingsSetting paddings;
        TravelWidgetSettingsDTO.PaddingsSetting paddings2;
        TravelWidgetSettingsDTO.PaddingsSetting paddings3;
        TravelWidgetSettingsDTO.PaddingsSetting paddings4;
        TravelWidgetSettingsDTO.CornersSetting corners;
        TravelWidgetSettingsDTO.CornersSetting corners2;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        interfaceC3967k.o(69752773);
        Paddings paddings5 = null;
        TravelWidgetSettingsDTO travelWidgetSettingsDTO2 = (i12 & 1) != 0 ? null : travelWidgetSettingsDTO;
        String backgroundColor = travelWidgetSettingsDTO2 != null ? travelWidgetSettingsDTO2.getBackgroundColor() : null;
        CornerRadius topRadius = (travelWidgetSettingsDTO2 == null || (corners2 = travelWidgetSettingsDTO2.getCorners()) == null) ? null : corners2.getTopRadius();
        CornerRadius bottomRadius = (travelWidgetSettingsDTO2 == null || (corners = travelWidgetSettingsDTO2.getCorners()) == null) ? null : corners.getBottomRadius();
        Paddings leftPadding = (travelWidgetSettingsDTO2 == null || (paddings4 = travelWidgetSettingsDTO2.getPaddings()) == null) ? null : paddings4.getLeftPadding();
        Paddings rightPadding = (travelWidgetSettingsDTO2 == null || (paddings3 = travelWidgetSettingsDTO2.getPaddings()) == null) ? null : paddings3.getRightPadding();
        Paddings topPadding = (travelWidgetSettingsDTO2 == null || (paddings2 = travelWidgetSettingsDTO2.getPaddings()) == null) ? null : paddings2.getTopPadding();
        if (travelWidgetSettingsDTO2 != null && (paddings = travelWidgetSettingsDTO2.getPaddings()) != null) {
            paddings5 = paddings.getBottomPadding();
        }
        e applySettings = ApplyWidgetSettingsKt.applySettings(eVar, backgroundColor, topRadius, bottomRadius, leftPadding, rightPadding, topPadding, paddings5, interfaceC3967k, i11 & 14, 0);
        interfaceC3967k.k();
        return applySettings;
    }

    public static final void safeUpdateBackground(@NotNull View view, @NotNull TravelWidgetSettingsVO travelWidgetSettingsVO, TravelWidgetSettingsVO travelWidgetSettingsVO2, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(travelWidgetSettingsVO, "new");
        Drawable background = view.getBackground();
        ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
        if (shapeDrawable == null) {
            shapeDrawable = new ShapeDrawable();
            view.setBackground(shapeDrawable);
        }
        if (!Intrinsics.d(travelWidgetSettingsVO.getCorners(), travelWidgetSettingsVO2 != null ? travelWidgetSettingsVO2.getCorners() : null)) {
            shapeDrawable.setShape(new RoundRectShape(new float[]{travelWidgetSettingsVO.getCorners().getTopRadius(), travelWidgetSettingsVO.getCorners().getTopRadius(), travelWidgetSettingsVO.getCorners().getTopRadius(), travelWidgetSettingsVO.getCorners().getTopRadius(), travelWidgetSettingsVO.getCorners().getBottomRadius(), travelWidgetSettingsVO.getCorners().getBottomRadius(), travelWidgetSettingsVO.getCorners().getBottomRadius(), travelWidgetSettingsVO.getCorners().getBottomRadius()}, null, null));
        }
        if (Intrinsics.d(travelWidgetSettingsVO.getBackgroundColor(), travelWidgetSettingsVO2 != null ? travelWidgetSettingsVO2.getBackgroundColor() : null)) {
            return;
        }
        InterfaceC4008j unsafeLazy = LazyUtilsKt.unsafeLazy(new TravelWidgetSettingsExtKt$safeUpdateBackground$defaultBackgroundColor$2(view, i11));
        Paint paint = shapeDrawable.getPaint();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, travelWidgetSettingsVO.getBackgroundColor());
        paint.setColor(parseColor != null ? parseColor.intValue() : safeUpdateBackground$lambda$1(unsafeLazy));
    }

    public static /* synthetic */ void safeUpdateBackground$default(View view, TravelWidgetSettingsVO travelWidgetSettingsVO, TravelWidgetSettingsVO travelWidgetSettingsVO2, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = UniColors.LAYER_FLOOR_1.getResId();
        }
        safeUpdateBackground(view, travelWidgetSettingsVO, travelWidgetSettingsVO2, i11);
    }

    private static final int safeUpdateBackground$lambda$1(InterfaceC4008j<Integer> interfaceC4008j) {
        return interfaceC4008j.getValue().intValue();
    }

    public static final void updatePadding(@NotNull View view, @NotNull TravelWidgetSettingsVO.PaddingsVO paddings, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        ViewExtKt.updatePadding(view, paddings.getLeftPadding() + i13, paddings.getTopPadding() + i11, paddings.getRightPadding() + i14, paddings.getBottomPadding() + i12);
    }

    public static /* synthetic */ void updatePadding$default(View view, TravelWidgetSettingsVO.PaddingsVO paddingsVO, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i11 = 0;
        }
        if ((i15 & 4) != 0) {
            i12 = 0;
        }
        if ((i15 & 8) != 0) {
            i13 = 0;
        }
        if ((i15 & 16) != 0) {
            i14 = 0;
        }
        updatePadding(view, paddingsVO, i11, i12, i13, i14);
    }
}
