package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.UtilsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.Paddings;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/view/CartCellItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cellView", "Lru/ozon/uni/android/cell/CellView;", "getCellView", "()Lru/ozon/uni/android/cell/CellView;", "setCellViewBorderWithBackground", "", "strokeColor", "backgroundColor", "(ILjava/lang/Integer;)V", "updatePadding", "paddings", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;", "getPaddingValue", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)Ljava/lang/Integer;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartCellItemView extends FrameLayout {
    private static final int HORIZONTAL_PADDING;
    private static final int STROKE_WIDTH;

    @NotNull
    private static final Set<Integer> cellViewInitIds;

    @NotNull
    private final CellView cellView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = CellView.$stable;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/view/CartCellItemView$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Integer[] elements = {Integer.valueOf(R$id.cell_left_icon), Integer.valueOf(R$id.cell_center_title), Integer.valueOf(R$id.cell_right_button)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        cellViewInitIds = C7705l.j0(elements);
        HORIZONTAL_PADDING = UiExtKt.toPx(16);
        STROKE_WIDTH = UiExtKt.toPx(1);
    }

    public /* synthetic */ CartCellItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Integer getPaddingValue(CommonCellSettings.LayoutPadding layoutPadding) {
        if (layoutPadding == null) {
            return null;
        }
        return Integer.valueOf(getResources().getDimensionPixelSize(layoutPadding.getCellLayoutPadding()));
    }

    @NotNull
    public final CellView getCellView() {
        return this.cellView;
    }

    public final void setCellViewBorderWithBackground(int strokeColor, Integer backgroundColor) {
        CellView cellView = this.cellView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (backgroundColor != null) {
            gradientDrawable.setColor(backgroundColor.intValue());
        }
        gradientDrawable.setCornerRadius(this.cellView.getCellCornerRadius());
        gradientDrawable.setStroke(STROKE_WIDTH, strokeColor);
        cellView.setBackground(gradientDrawable);
    }

    public final void updatePadding(@NotNull Paddings paddings) {
        Integer paddingValue;
        Integer paddingValue2;
        Integer paddingValue3;
        Integer paddingValue4;
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        CommonCellSettings.LayoutPadding left = paddings.getLeft();
        int intValue = (left == null || (paddingValue4 = getPaddingValue(left)) == null) ? HORIZONTAL_PADDING : paddingValue4.intValue();
        CommonCellSettings.LayoutPadding top = paddings.getTop();
        int i11 = 0;
        int intValue2 = (top == null || (paddingValue3 = getPaddingValue(top)) == null) ? 0 : paddingValue3.intValue();
        CommonCellSettings.LayoutPadding right = paddings.getRight();
        int intValue3 = (right == null || (paddingValue2 = getPaddingValue(right)) == null) ? HORIZONTAL_PADDING : paddingValue2.intValue();
        CommonCellSettings.LayoutPadding bottom = paddings.getBottom();
        if (bottom != null && (paddingValue = getPaddingValue(bottom)) != null) {
            i11 = paddingValue.intValue();
        }
        setPadding(intValue, intValue2, intValue3, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartCellItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        CellView cellView = new CellView(context, null, 0, 0, cellViewInitIds, 14, null);
        cellView.setId(ru.ozon.app.android.cart.feature.R$id.cartCellItemCellView);
        cellView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(cellView);
        this.cellView = cellView;
        setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
        int i12 = HORIZONTAL_PADDING;
        setPadding(i12, getPaddingTop(), i12, getPaddingBottom());
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }
}
