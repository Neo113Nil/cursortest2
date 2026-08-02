package ru.ozon.app.android.returns.details.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.common.presentation.views.ReturnStatusView;
import ru.ozon.app.android.returns.list.presentation.views.ReturnTotalView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/views/ReturnDetailsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "createIslandSeparatorView", "(Landroid/content/Context;)Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "", "isVisibleTotal", "", "setTotalBlockVisibility", "(Z)V", "statusMarginTop", "I", "islandSeparatorVerticalMargin", "availableActionsMarginTop", "availableActionsMarginHorizontal", "returnDetailsViewBottomPadding", "itemsMarginTop", "Lru/ozon/app/android/returns/common/presentation/views/ReturnStatusView;", "status", "Lru/ozon/app/android/returns/common/presentation/views/ReturnStatusView;", "getStatus", "()Lru/ozon/app/android/returns/common/presentation/views/ReturnStatusView;", "Landroidx/recyclerview/widget/RecyclerView;", "componentsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getComponentsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "componentsIslandSeparatorView", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "Lru/ozon/app/android/returns/details/presentation/views/ReturnItemsView;", "itemsView", "Lru/ozon/app/android/returns/details/presentation/views/ReturnItemsView;", "getItemsView", "()Lru/ozon/app/android/returns/details/presentation/views/ReturnItemsView;", "itemsIslandSeparatorView", "getItemsIslandSeparatorView", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;", "total", "Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;", "getTotal", "()Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "availableActionsVerticalAtomsLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getAvailableActionsVerticalAtomsLayout", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnDetailsView extends LinearLayout {
    private final int availableActionsMarginHorizontal;
    private final int availableActionsMarginTop;

    @NotNull
    private final VerticalAtomsLayout availableActionsVerticalAtomsLayout;

    @NotNull
    private final IslandSeparatorView componentsIslandSeparatorView;

    @NotNull
    private final RecyclerView componentsRecyclerView;
    private final int islandSeparatorVerticalMargin;

    @NotNull
    private final IslandSeparatorView itemsIslandSeparatorView;
    private final int itemsMarginTop;

    @NotNull
    private final ReturnItemsView itemsView;
    private final int returnDetailsViewBottomPadding;

    @NotNull
    private final ReturnStatusView status;
    private final int statusMarginTop;

    @NotNull
    private final ReturnTotalView total;

    public /* synthetic */ ReturnDetailsView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final IslandSeparatorView createIslandSeparatorView(Context context) {
        IslandSeparatorView islandSeparatorView = new IslandSeparatorView(context, null, 0, 6, null);
        islandSeparatorView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i11 = this.islandSeparatorVerticalMargin;
        layoutParams.setMargins(0, i11, 0, i11);
        islandSeparatorView.setLayoutParams(layoutParams);
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(true, true, UiExtKt.toPx(AppTokensProvider.IslandSeparatorHeight.INSTANCE.between()), ThemeExtKt.themeColor(context, R$attr.layerFloor0)));
        return islandSeparatorView;
    }

    @NotNull
    public final VerticalAtomsLayout getAvailableActionsVerticalAtomsLayout() {
        return this.availableActionsVerticalAtomsLayout;
    }

    @NotNull
    public final RecyclerView getComponentsRecyclerView() {
        return this.componentsRecyclerView;
    }

    @NotNull
    public final ReturnItemsView getItemsView() {
        return this.itemsView;
    }

    @NotNull
    public final ReturnStatusView getStatus() {
        return this.status;
    }

    @NotNull
    public final ReturnTotalView getTotal() {
        return this.total;
    }

    public final void setTotalBlockVisibility(boolean isVisibleTotal) {
        this.itemsIslandSeparatorView.setVisibility(isVisibleTotal ? 0 : 8);
        this.availableActionsVerticalAtomsLayout.setVisibility(isVisibleTotal ? 0 : 8);
        this.total.setVisibility(isVisibleTotal ? 0 : 8);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), isVisibleTotal ? this.returnDetailsViewBottomPadding : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnDetailsView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(16, context);
        this.statusMarginTop = px;
        this.islandSeparatorVerticalMargin = -UiExtKt.toPx(40, context);
        int px2 = UiExtKt.toPx(8, context);
        this.availableActionsMarginTop = px2;
        int px3 = UiExtKt.toPx(16, context);
        this.availableActionsMarginHorizontal = px3;
        int px4 = UiExtKt.toPx(10, context);
        this.returnDetailsViewBottomPadding = px4;
        int px5 = UiExtKt.toPx(16, context);
        this.itemsMarginTop = px5;
        ReturnStatusView returnStatusView = new ReturnStatusView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, px, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        returnStatusView.setLayoutParams(layoutParams);
        this.status = returnStatusView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.componentsRecyclerView = recyclerView;
        IslandSeparatorView createIslandSeparatorView = createIslandSeparatorView(context);
        this.componentsIslandSeparatorView = createIslandSeparatorView;
        int i13 = 0;
        int i14 = 0;
        int i15 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ReturnItemsView returnItemsView = new ReturnItemsView(context, null, i13, i14, i15, defaultConstructorMarker);
        returnItemsView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, px5, 0, 0);
        returnItemsView.setLayoutParams(layoutParams2);
        this.itemsView = returnItemsView;
        IslandSeparatorView createIslandSeparatorView2 = createIslandSeparatorView(context);
        this.itemsIslandSeparatorView = createIslandSeparatorView2;
        ReturnTotalView returnTotalView = new ReturnTotalView(context, null, i13, i14, i15, defaultConstructorMarker);
        returnTotalView.setId(View.generateViewId());
        returnTotalView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.total = returnTotalView;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(px3, px2, px3, 0);
        verticalAtomsLayout.setLayoutParams(layoutParams3);
        this.availableActionsVerticalAtomsLayout = verticalAtomsLayout;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        setPadding(0, 0, 0, px4);
        addView(returnStatusView);
        addView(recyclerView);
        addView(createIslandSeparatorView);
        addView(returnItemsView);
        addView(createIslandSeparatorView2);
        addView(returnTotalView);
        addView(verticalAtomsLayout);
    }
}
