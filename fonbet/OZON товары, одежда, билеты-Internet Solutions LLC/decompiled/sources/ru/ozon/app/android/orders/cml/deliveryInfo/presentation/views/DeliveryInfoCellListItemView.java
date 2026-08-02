package ru.ozon.app.android.orders.cml.deliveryInfo.presentation.views;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewItem.InfoCellVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ7\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/views/DeliveryInfoCellListItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initView", "()V", "setupConstraints", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/InfoCellVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindView", "(Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/InfoCellVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsInRowAdapter$delegate", "LSc/j;", "getButtonsInRowAdapter", "()Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsInRowAdapter", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "buttonsInRowLayout", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "Landroid/view/View;", "separator", "Landroid/view/View;", "Companion", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryInfoCellListItemView extends ConstraintLayout {

    /* renamed from: buttonsInRowAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonsInRowAdapter;

    @NotNull
    private final HorizontalFlexAtomsLayout buttonsInRowLayout;

    @NotNull
    private final CellView cellView;

    @NotNull
    private final View separator;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int SEPARATOR_HEIGHT = ResourceExtKt.toPx(0.5d);
    private static final int SEPARATOR_TOP_MARGIN = ResourceExtKt.toPx(8);
    private static final int BUTTONS_BOTTOM_MARGIN = ResourceExtKt.toPx(16);
    private static final int BUTTONS_BOTTOM_MARGIN_WITH_SEPARATOR = ResourceExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/views/DeliveryInfoCellListItemView$Companion;", "", "<init>", "()V", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeliveryInfoCellListItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final AtomsAdapter getButtonsInRowAdapter() {
        return (AtomsAdapter) this.buttonsInRowAdapter.getValue();
    }

    private final void initView() {
        addView(this.cellView);
        addView(this.buttonsInRowLayout);
        addView(this.separator);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        dVar.s(this.cellView.getId(), 6, 0, 6);
        dVar.s(this.cellView.getId(), 7, 0, 7);
        dVar.s(this.cellView.getId(), 3, 0, 3);
        dVar.s(this.buttonsInRowLayout.getId(), 6, 0, 6);
        dVar.s(this.buttonsInRowLayout.getId(), 7, 0, 7);
        dVar.s(this.buttonsInRowLayout.getId(), 3, this.cellView.getId(), 4);
        dVar.t(this.buttonsInRowLayout.getId(), 4, this.separator.getId(), 3, BUTTONS_BOTTOM_MARGIN_WITH_SEPARATOR);
        dVar.Z(this.buttonsInRowLayout.getId(), 4, BUTTONS_BOTTOM_MARGIN);
        dVar.s(this.separator.getId(), 6, 0, 6);
        dVar.s(this.separator.getId(), 7, 0, 7);
        dVar.t(this.separator.getId(), 3, this.buttonsInRowLayout.getId(), 4, SEPARATOR_TOP_MARGIN);
        dVar.s(this.separator.getId(), 4, 0, 4);
        dVar.f(this);
    }

    public final void bindView(@NotNull InfoCellVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        getButtonsInRowAdapter().setOnAction(onAction);
        this.buttonsInRowLayout.setAdapter(getButtonsInRowAdapter());
        CellHolderKt.bind(this.cellView, item.getCell(), onAction);
        List<ButtonV3DTO> buttons = item.getButtons();
        if (buttons != null) {
            AtomsAdapter buttonsInRowAdapter = getButtonsInRowAdapter();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            buttonsInRowAdapter.bind(context, buttons);
            ViewExtKt.show(this.buttonsInRowLayout);
        } else {
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.buttonsInRowLayout);
        }
        View view = this.separator;
        Boolean hasSeparator = item.getHasSeparator();
        view.setVisibility(hasSeparator != null ? hasSeparator.booleanValue() : false ? 0 : 8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            int left2 = this.cellView.getCenterBlock().getLeft();
            HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = this.buttonsInRowLayout;
            ViewGroup.LayoutParams layoutParams = horizontalFlexAtomsLayout.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = left2;
            horizontalFlexAtomsLayout.setLayoutParams(bVar);
            View view = this.separator;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) bVar2).leftMargin = left2;
            view.setLayoutParams(bVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryInfoCellListItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.buttonsInRowAdapter = k.b(DeliveryInfoCellListItemView$buttonsInRowAdapter$2.INSTANCE);
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(View.generateViewId());
        cellView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        this.cellView = cellView;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = new HorizontalFlexAtomsLayout(context, null, 0, 6, null);
        horizontalFlexAtomsLayout.setId(View.generateViewId());
        horizontalFlexAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(horizontalFlexAtomsLayout);
        this.buttonsInRowLayout = horizontalFlexAtomsLayout;
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, SEPARATOR_HEIGHT));
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(view);
        this.separator = view;
        initView();
        setupConstraints();
    }
}
