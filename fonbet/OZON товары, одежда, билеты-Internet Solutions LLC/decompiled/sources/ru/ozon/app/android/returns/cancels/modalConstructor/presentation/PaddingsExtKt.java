package ru.ozon.app.android.returns.cancels.modalConstructor.presentation;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.cancels.modalConstructor.presentation.models.ModalConstructorVO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\u000b"}, d2 = {"applyMargins", "", "Landroid/view/View;", "paddings", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "applyPaddings", "getPadding", "", "Landroid/content/res/Resources;", "layoutPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "cancels_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaddingsExtKt {
    public static final void applyMargins(@NotNull View view, @NotNull ModalConstructorVO.PaddingVO paddings) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Resources resources = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        marginLayoutParams.leftMargin = getPadding(resources, paddings.getLeft());
        Resources resources2 = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        marginLayoutParams.topMargin = getPadding(resources2, paddings.getTop());
        Resources resources3 = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        marginLayoutParams.rightMargin = getPadding(resources3, paddings.getRight());
        Resources resources4 = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        marginLayoutParams.bottomMargin = getPadding(resources4, paddings.getBottom());
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void applyPaddings(@NotNull View view, @NotNull ModalConstructorVO.PaddingVO paddings) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Resources resources = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int padding = getPadding(resources, paddings.getLeft());
        Resources resources2 = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        int padding2 = getPadding(resources2, paddings.getTop());
        Resources resources3 = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        int padding3 = getPadding(resources3, paddings.getRight());
        Resources resources4 = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        view.setPadding(padding, padding2, padding3, getPadding(resources4, paddings.getBottom()));
    }

    private static final int getPadding(Resources resources, CommonCellSettings.LayoutPadding layoutPadding) {
        return (int) resources.getDimension(layoutPadding != null ? layoutPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone());
    }
}
