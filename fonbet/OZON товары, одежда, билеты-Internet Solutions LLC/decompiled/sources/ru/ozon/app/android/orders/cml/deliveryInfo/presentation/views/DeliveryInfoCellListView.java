package ru.ozon.app.android.orders.cml.deliveryInfo.presentation.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewItem.DeliveryInfoVO;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewItem.InfoCellVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/views/DeliveryInfoCellListView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initView", "()V", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "paddings", "setVerticalPadding", "(Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;)V", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "setContainerStyle", "(ILru/ozon/uni/atoms/data/common/CornerRadius;)V", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindView", "(Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;Lkotlin/jvm/functions/Function1;)V", "resetAllPaddings", "Landroid/widget/LinearLayout;", "verticalLLContainer", "Landroid/widget/LinearLayout;", "Companion", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryInfoCellListView extends FrameLayout {

    @NotNull
    private final LinearLayout verticalLLContainer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int PARENT_TOP_DEFAULT_PADDING = ResourceExtKt.toPx(8);
    private static final int PARENT_BOTTOM_DEFAULT_PADDING = ResourceExtKt.toPx(8);
    private static final int PARENT_HORIZONTAL_DEFAULT_PADDINGS = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/views/DeliveryInfoCellListView$Companion;", "", "<init>", "()V", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeliveryInfoCellListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void initView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        int i11 = PARENT_HORIZONTAL_DEFAULT_PADDINGS;
        setPadding(i11, PARENT_TOP_DEFAULT_PADDING, i11, PARENT_BOTTOM_DEFAULT_PADDING);
        LinearLayout linearLayout = this.verticalLLContainer;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, this.verticalLLContainer.getPaddingRight(), 0);
        addView(this.verticalLLContainer);
    }

    private final void setContainerStyle(int backgroundColor, CornerRadius cornerRadius) {
        LinearLayout linearLayout = this.verticalLLContainer;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(backgroundColor);
        gradientDrawable.setCornerRadius(cornerRadius != null ? UiExtKt.toPxF(cornerRadius.getPx()) : 0.0f);
        linearLayout.setBackground(gradientDrawable);
    }

    private final void setVerticalPadding(VerticalPadding paddings) {
        int i11;
        int i12;
        CommonCellSettings.LayoutPadding top;
        CommonCellSettings.LayoutPadding top2;
        int paddingLeft = getPaddingLeft();
        if (paddings == null || (top2 = paddings.getTop()) == null) {
            i11 = PARENT_TOP_DEFAULT_PADDING;
        } else {
            int cellLayoutPadding = top2.getCellLayoutPadding();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i11 = ResourceExtKt.dim(context, cellLayoutPadding);
        }
        int paddingRight = getPaddingRight();
        if (paddings == null || (top = paddings.getTop()) == null) {
            i12 = PARENT_BOTTOM_DEFAULT_PADDING;
        } else {
            int cellLayoutPadding2 = top.getCellLayoutPadding();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i12 = ResourceExtKt.dim(context2, cellLayoutPadding2);
        }
        setPadding(paddingLeft, i11, paddingRight, i12);
    }

    public final void bindView(@NotNull DeliveryInfoVO item, Function1<? super AtomAction, Unit> onAction) {
        int themeColor;
        Intrinsics.checkNotNullParameter(item, "item");
        this.verticalLLContainer.removeAllViews();
        setVerticalPadding(item.getVerticalPadding());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor != null) {
            themeColor = parseColor.intValue();
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context2, R$attr.layerFloor0);
        }
        setContainerStyle(themeColor, item.getIslandCornerRadius());
        for (InfoCellVO infoCellVO : item.getCellList()) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            DeliveryInfoCellListItemView deliveryInfoCellListItemView = new DeliveryInfoCellListItemView(context3, null, 0, 6, null);
            deliveryInfoCellListItemView.bindView(infoCellVO, onAction);
            this.verticalLLContainer.addView(deliveryInfoCellListItemView);
        }
    }

    public final void resetAllPaddings() {
        setPadding(0, 0, 0, 0);
        this.verticalLLContainer.setPadding(0, 0, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryInfoCellListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(View.generateViewId());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        this.verticalLLContainer = linearLayout;
        initView();
    }
}
