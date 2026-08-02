package ru.ozon.app.android.cscore.padding;

import android.content.res.Resources;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\n\u001a\u00020\t*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/view/View;", "Lru/ozon/app/android/cscore/padding/Padding;", "paddings", "", "applyPaddings", "(Landroid/view/View;Lru/ozon/app/android/cscore/padding/Padding;)V", "Landroid/content/res/Resources;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layoutPadding", "", "getPadding", "(Landroid/content/res/Resources;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "csma_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaddingExtKt {
    public static final void applyPaddings(@NotNull View view, Padding padding) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Resources resources = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int padding2 = getPadding(resources, padding != null ? padding.getLeft() : null);
        Resources resources2 = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        int padding3 = getPadding(resources2, padding != null ? padding.getTop() : null);
        Resources resources3 = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        int padding4 = getPadding(resources3, padding != null ? padding.getRight() : null);
        Resources resources4 = view.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        view.setPadding(padding2, padding3, padding4, getPadding(resources4, padding != null ? padding.getBottom() : null));
    }

    private static final int getPadding(Resources resources, CommonCellSettings.LayoutPadding layoutPadding) {
        return (int) resources.getDimension(layoutPadding != null ? layoutPadding.getCellLayoutPadding() : CommonCellSettingsKt.getNone());
    }
}
