package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcode.R$id;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.animation.HeaderCellAnimationManager;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.animation.ItemsListAnimationManager;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u0006\u0010!\u001a\u00020\u001cJ\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u001cJ\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020\u001cH\u0002J\b\u0010+\u001a\u00020\u001cH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/BarcodeProductsListView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "horizontalMargin", "headerAnimationManager", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/animation/HeaderCellAnimationManager;", "itemsListAnimationManager", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/animation/ItemsListAnimationManager;", "itemsListHeightForCollapse", "itemsListHeightForCollapseStartValue", "measureItemsListHeight", "defaultBottomPadding", "headerCell", "Lru/ozon/uni/android/cell/CellView;", "getHeaderCell", "()Lru/ozon/uni/android/cell/CellView;", "itemsList", "Landroidx/recyclerview/widget/RecyclerView;", "getItemsList", "()Landroidx/recyclerview/widget/RecyclerView;", "updateVerticalPadding", "", "top", "bottom", "startExpandAnimation", "startCollapseAnimation", "setExpandedState", "setCollapsedState", "clearItemsListHeight", "onExpandItemList", "interpolatedTime", "", "onCollapseItemList", "onExpandBottomPadding", "onCollapseBottomPadding", "setupLinearLayout", "measureItemsListView", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeProductsListView extends LinearLayout {
    private int defaultBottomPadding;

    @NotNull
    private final HeaderCellAnimationManager headerAnimationManager;

    @NotNull
    private final CellView headerCell;
    private final int horizontalMargin;

    @NotNull
    private final RecyclerView itemsList;

    @NotNull
    private final ItemsListAnimationManager itemsListAnimationManager;
    private int itemsListHeightForCollapse;
    private int itemsListHeightForCollapseStartValue;
    private int measureItemsListHeight;

    public /* synthetic */ BarcodeProductsListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void measureItemsListView() {
        if (this.measureItemsListHeight > 0) {
            return;
        }
        RecyclerView recyclerView = this.itemsList;
        recyclerView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.measureItemsListHeight = this.itemsList.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCollapseBottomPadding(float interpolatedTime) {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), (int) ((1 - interpolatedTime) * this.defaultBottomPadding));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCollapseItemList(float interpolatedTime) {
        this.itemsList.getLayoutParams().height = (int) ((1 - interpolatedTime) * this.itemsListHeightForCollapse);
        this.itemsList.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExpandBottomPadding(float interpolatedTime) {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), (int) (this.defaultBottomPadding * interpolatedTime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExpandItemList(float interpolatedTime) {
        this.itemsList.getLayoutParams().height = this.itemsListHeightForCollapseStartValue + ((int) ((this.measureItemsListHeight - r1) * interpolatedTime));
        this.itemsList.requestLayout();
    }

    private final void setupLinearLayout() {
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public final void clearItemsListHeight() {
        this.itemsListHeightForCollapseStartValue = 0;
        this.measureItemsListHeight = 0;
        this.itemsListHeightForCollapse = 0;
    }

    @NotNull
    public final CellView getHeaderCell() {
        return this.headerCell;
    }

    @NotNull
    public final RecyclerView getItemsList() {
        return this.itemsList;
    }

    public final void setCollapsedState() {
        this.headerCell.getRightBlock().getIconView().startAnimation(this.headerAnimationManager.getRotateToDown());
    }

    public final void setExpandedState() {
        this.headerCell.getRightBlock().getIconView().startAnimation(this.headerAnimationManager.getRotateToUp());
        RecyclerView recyclerView = this.itemsList;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i11 = this.horizontalMargin;
        layoutParams.setMargins(i11, 0, i11, 0);
        recyclerView.setLayoutParams(layoutParams);
        this.itemsList.requestLayout();
    }

    public final void startCollapseAnimation() {
        this.itemsListHeightForCollapse = this.itemsList.getHeight();
        this.headerCell.getRightBlock().getIconView().startAnimation(this.headerAnimationManager.getRotateToDown());
        this.itemsList.startAnimation(this.itemsListAnimationManager.getCollapseItemsListAnimation());
        startAnimation(this.itemsListAnimationManager.getCollapseBottomPaddingAnimation());
    }

    public final void startExpandAnimation() {
        this.itemsListHeightForCollapseStartValue = this.itemsList.getHeight();
        measureItemsListView();
        this.headerCell.getRightBlock().getIconView().startAnimation(this.headerAnimationManager.getRotateToUp());
        this.itemsList.startAnimation(this.itemsListAnimationManager.getExpandItemsListAnimation());
        startAnimation(this.itemsListAnimationManager.getExpandBottomPaddingAnimation());
    }

    public final void updateVerticalPadding(int top, int bottom) {
        int i11 = this.defaultBottomPadding;
        if (bottom >= i11) {
            i11 = bottom;
        }
        this.defaultBottomPadding = i11;
        setPadding(getPaddingLeft(), top, getPaddingRight(), bottom);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeProductsListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16);
        this.horizontalMargin = px;
        this.headerAnimationManager = new HeaderCellAnimationManager(0L);
        this.itemsListAnimationManager = new ItemsListAnimationManager(200L, new BarcodeProductsListView$itemsListAnimationManager$1(this), new BarcodeProductsListView$itemsListAnimationManager$2(this), new BarcodeProductsListView$itemsListAnimationManager$3(this), new BarcodeProductsListView$itemsListAnimationManager$4(this));
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(R$id.barcodeProductsListCellHeader);
        cellView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.headerCell = cellView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.barcodeProductsItemsList);
        recyclerView.setNestedScrollingEnabled(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px, 0, px, 0);
        recyclerView.setLayoutParams(layoutParams);
        this.itemsList = recyclerView;
        setupLinearLayout();
        addView(cellView);
        addView(recyclerView);
    }
}
