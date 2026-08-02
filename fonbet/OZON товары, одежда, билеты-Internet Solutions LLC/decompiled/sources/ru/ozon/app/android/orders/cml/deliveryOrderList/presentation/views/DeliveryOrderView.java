package ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.views;

import D3.h;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.views.DeliveryInfoCellListView;
import ru.ozon.app.android.orders.cml.groupButtons.presentation.view.GroupButtonsView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\u0010\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020+H\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006-"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/views/DeliveryOrderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "statusTitleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getStatusTitleTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "statusTitleSingleAtomView", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getStatusTitleSingleAtomView", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "titleTextView", "getTitleTextView", "subtitleTextView", "getSubtitleTextView", "badgeInRowLayout", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "getBadgeInRowLayout", "()Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "inputCellView", "Lru/ozon/uni/android/cell/CellView;", "getInputCellView", "()Lru/ozon/uni/android/cell/CellView;", "deliveryInfoView", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/views/DeliveryInfoCellListView;", "getDeliveryInfoView", "()Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/views/DeliveryInfoCellListView;", "groupButtonsView", "Lru/ozon/app/android/orders/cml/groupButtons/presentation/view/GroupButtonsView;", "getGroupButtonsView", "()Lru/ozon/app/android/orders/cml/groupButtons/presentation/view/GroupButtonsView;", "initView", "", "setupConstraints", "createRoundedCorner", "radius", "", "Companion", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrderView extends ConstraintLayout {

    @NotNull
    private final HorizontalFlexAtomsLayout badgeInRowLayout;

    @NotNull
    private final DeliveryInfoCellListView deliveryInfoView;

    @NotNull
    private final GroupButtonsView groupButtonsView;

    @NotNull
    private final CellView inputCellView;

    @NotNull
    private final SingleAtom statusTitleSingleAtomView;

    @NotNull
    private final TextAtomV2View statusTitleTextView;

    @NotNull
    private final TextAtomV2View subtitleTextView;

    @NotNull
    private final TextAtomV2View titleTextView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int TOP_PADDING = UiExtKt.toPx(14);
    private static final int BOTTOM_PADDING = UiExtKt.toPx(16);
    private static final int HORIZONTAL_PADDING = UiExtKt.toPx(16);
    private static final int TITLE_TOP_MARGIN = UiExtKt.toPx(4);
    private static final int SUBTITLE_TOP_MARGIN = UiExtKt.toPx(4);
    private static final int BADGE_IN_ROW_TOP_MARGIN = UiExtKt.toPx(12);
    private static final int INPUT_TOP_MARGIN = UiExtKt.toPx(12);
    private static final int DELIVERY_INFO_TOP_MARGIN = UiExtKt.toPx(12);
    private static final int BUTTONS_TOP_MARGIN = UiExtKt.toPx(12);
    private static final float ROUNDED_CORNER_VALUE = UiExtKt.toPxF(24);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderList/presentation/views/DeliveryOrderView$Companion;", "", "<init>", "()V", "", "TITLE_TOP_MARGIN", "I", "getTITLE_TOP_MARGIN", "()I", "SUBTITLE_TOP_MARGIN", "getSUBTITLE_TOP_MARGIN", "BADGE_IN_ROW_TOP_MARGIN", "getBADGE_IN_ROW_TOP_MARGIN", "INPUT_TOP_MARGIN", "getINPUT_TOP_MARGIN", "DELIVERY_INFO_TOP_MARGIN", "getDELIVERY_INFO_TOP_MARGIN", "BUTTONS_TOP_MARGIN", "getBUTTONS_TOP_MARGIN", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getBADGE_IN_ROW_TOP_MARGIN() {
            return DeliveryOrderView.BADGE_IN_ROW_TOP_MARGIN;
        }

        public final int getBUTTONS_TOP_MARGIN() {
            return DeliveryOrderView.BUTTONS_TOP_MARGIN;
        }

        public final int getDELIVERY_INFO_TOP_MARGIN() {
            return DeliveryOrderView.DELIVERY_INFO_TOP_MARGIN;
        }

        public final int getINPUT_TOP_MARGIN() {
            return DeliveryOrderView.INPUT_TOP_MARGIN;
        }

        public final int getSUBTITLE_TOP_MARGIN() {
            return DeliveryOrderView.SUBTITLE_TOP_MARGIN;
        }

        public final int getTITLE_TOP_MARGIN() {
            return DeliveryOrderView.TITLE_TOP_MARGIN;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeliveryOrderView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void createRoundedCorner(float radius) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(radius);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setBackground(gradientDrawable);
    }

    private final void initView() {
        int i11 = HORIZONTAL_PADDING;
        setPadding(i11, TOP_PADDING, i11, BOTTOM_PADDING);
        createRoundedCorner(ROUNDED_CORNER_VALUE);
        addView(this.statusTitleTextView);
        addView(this.statusTitleSingleAtomView);
        addView(this.titleTextView);
        addView(this.subtitleTextView);
        addView(this.badgeInRowLayout);
        addView(this.inputCellView);
        addView(this.deliveryInfoView);
        addView(this.groupButtonsView);
        setupConstraints();
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new DeliveryOrderView$setupConstraints$1(this));
    }

    @NotNull
    public final HorizontalFlexAtomsLayout getBadgeInRowLayout() {
        return this.badgeInRowLayout;
    }

    @NotNull
    public final DeliveryInfoCellListView getDeliveryInfoView() {
        return this.deliveryInfoView;
    }

    @NotNull
    public final GroupButtonsView getGroupButtonsView() {
        return this.groupButtonsView;
    }

    @NotNull
    public final CellView getInputCellView() {
        return this.inputCellView;
    }

    @NotNull
    public final SingleAtom getStatusTitleSingleAtomView() {
        return this.statusTitleSingleAtomView;
    }

    @NotNull
    public final TextAtomV2View getStatusTitleTextView() {
        return this.statusTitleTextView;
    }

    @NotNull
    public final TextAtomV2View getSubtitleTextView() {
        return this.subtitleTextView;
    }

    @NotNull
    public final TextAtomV2View getTitleTextView() {
        return this.titleTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryOrderView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        h.f(0, -2, textAtomV2View);
        this.statusTitleTextView = textAtomV2View;
        SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom.setId(View.generateViewId());
        singleAtom.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.statusTitleSingleAtomView = singleAtom;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        h.f(0, -2, textAtomV2View2);
        this.titleTextView = textAtomV2View2;
        TextAtomV2View textAtomV2View3 = new TextAtomV2View(context, null, 0, 6, null);
        h.f(0, -2, textAtomV2View3);
        this.subtitleTextView = textAtomV2View3;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = new HorizontalFlexAtomsLayout(context, null, 0, 6, null);
        horizontalFlexAtomsLayout.setId(View.generateViewId());
        horizontalFlexAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        ViewExtKt.gone(horizontalFlexAtomsLayout);
        this.badgeInRowLayout = horizontalFlexAtomsLayout;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(View.generateViewId());
        cellView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.inputCellView = cellView;
        int i13 = 6;
        DeliveryInfoCellListView deliveryInfoCellListView = new DeliveryInfoCellListView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        deliveryInfoCellListView.setId(View.generateViewId());
        deliveryInfoCellListView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.deliveryInfoView = deliveryInfoCellListView;
        GroupButtonsView groupButtonsView = new GroupButtonsView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        groupButtonsView.setId(View.generateViewId());
        groupButtonsView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.groupButtonsView = groupButtonsView;
        initView();
    }
}
