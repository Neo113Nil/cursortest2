package ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgeItemsList;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.ReviewBadgeListItemDecoration;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.timerMolecule.presentation.TimerVOKt;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgeItemsList.SingleReviewBadgeItemsListVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ7\u0010\u0012\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010 R$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.R\u001b\u00102\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b0\u0010,*\u0004\b1\u0010.¨\u00063"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "submitVisibleItems", "()V", "updateGradientVisibility", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListVO$BadgeItem;", "badgeItems", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Landroidx/lifecycle/B;", "lifecycleScope", "bind", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/B;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsAdapter;", "itemsAdapter", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "itemsLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$t;", "itemsScrollListener", "Landroidx/recyclerview/widget/RecyclerView$t;", "", "lastItemIndex", "I", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "Landroidx/lifecycle/B;", "LSc/j;", "Landroid/view/View;", "leftGradientDelegate", "LSc/j;", "rightGradientDelegate", "Landroidx/recyclerview/widget/RecyclerView;", "itemsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getLeftGradient", "()Landroid/view/View;", "getLeftGradient$delegate", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/badgeItemsList/SingleReviewBadgeItemsListView;)Ljava/lang/Object;", "leftGradient", "getRightGradient", "getRightGradient$delegate", "rightGradient", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewBadgeItemsListView extends FrameLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private List<? extends SingleReviewBadgeItemsListVO.BadgeItem> badgeItems;

    @NotNull
    private final SingleReviewBadgeItemsAdapter itemsAdapter;

    @NotNull
    private final LinearLayoutManager itemsLayoutManager;

    @NotNull
    private final RecyclerView itemsRv;

    @NotNull
    private final RecyclerView.t itemsScrollListener;
    private int lastItemIndex;

    @NotNull
    private final InterfaceC4008j<View> leftGradientDelegate;
    private B lifecycleScope;

    @NotNull
    private final InterfaceC4008j<View> rightGradientDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewBadgeItemsListView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        SingleReviewBadgeItemsAdapter singleReviewBadgeItemsAdapter = new SingleReviewBadgeItemsAdapter();
        singleReviewBadgeItemsAdapter.setOnTimerFinished(new SingleReviewBadgeItemsListView$itemsAdapter$1$1(this));
        this.itemsAdapter = singleReviewBadgeItemsAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        this.itemsLayoutManager = linearLayoutManager;
        RecyclerView.t tVar = new RecyclerView.t() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgeItemsList.SingleReviewBadgeItemsListView$itemsScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                SingleReviewBadgeItemsListView.this.updateGradientVisibility();
            }
        };
        this.itemsScrollListener = tVar;
        this.badgeItems = K.f71697a;
        this.leftGradientDelegate = LazyUtilsKt.unsafeLazy(new SingleReviewBadgeItemsListView$leftGradientDelegate$1(context, this));
        this.rightGradientDelegate = LazyUtilsKt.unsafeLazy(new SingleReviewBadgeItemsListView$rightGradientDelegate$1(context, this));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setOverScrollMode(2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(singleReviewBadgeItemsAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.addOnScrollListener(tVar);
        Dimens dimens = Dimens.INSTANCE;
        recyclerView.addItemDecoration(new ReviewBadgeListItemDecoration(dimens.getDP_4(), 0, 2, null));
        this.itemsRv = recyclerView;
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setLayoutParams(new RecyclerView.p(-1, -2));
        setPadding(dimens.getDP_16(), dimens.getDP_8(), dimens.getDP_16(), getPaddingBottom());
        addView(recyclerView);
    }

    private final View getLeftGradient() {
        return this.leftGradientDelegate.getValue();
    }

    private final View getRightGradient() {
        return this.rightGradientDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitVisibleItems() {
        B b11;
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 == null || (b11 = this.lifecycleScope) == null) {
            return;
        }
        List<? extends SingleReviewBadgeItemsListVO.BadgeItem> list = this.badgeItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SingleReviewBadgeItemsListVO.BadgeItem badgeItem = (SingleReviewBadgeItemsListVO.BadgeItem) obj;
            if (!(badgeItem instanceof SingleReviewBadgeItemsListVO.BadgeItem.TimerContent) || !TimerVOKt.isFinished(((SingleReviewBadgeItemsListVO.BadgeItem.TimerContent) badgeItem).getTimer())) {
                arrayList.add(obj);
            }
        }
        this.itemsAdapter.submit(arrayList, function1, b11);
        this.lastItemIndex = arrayList.size() - 1;
        this.itemsRv.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgeItemsList.SingleReviewBadgeItemsListView$submitVisibleItems$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                SingleReviewBadgeItemsListView.this.updateGradientVisibility();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGradientVisibility() {
        int findFirstCompletelyVisibleItemPosition = this.itemsLayoutManager.findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = this.itemsLayoutManager.findLastCompletelyVisibleItemPosition();
        boolean z11 = findFirstCompletelyVisibleItemPosition > 0;
        boolean z12 = findLastCompletelyVisibleItemPosition >= 0 && findLastCompletelyVisibleItemPosition < this.lastItemIndex;
        if (z11 || this.leftGradientDelegate.isInitialized()) {
            ViewExtKt.showOrGone(getLeftGradient(), Boolean.valueOf(z11));
        }
        if (z12 || this.rightGradientDelegate.isInitialized()) {
            ViewExtKt.showOrGone(getRightGradient(), Boolean.valueOf(z12));
        }
    }

    public final void bind(@NotNull List<? extends SingleReviewBadgeItemsListVO.BadgeItem> badgeItems, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull B lifecycleScope) {
        Intrinsics.checkNotNullParameter(badgeItems, "badgeItems");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        this.badgeItems = badgeItems;
        this.actionHandler = actionHandler;
        this.lifecycleScope = lifecycleScope;
        submitVisibleItems();
    }
}
