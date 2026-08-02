package ru.ozon.app.android.fresh.main.widgets.product.imagesswipeview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.product.imagesswipeview.LoopedRecyclerView;

@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001\u0016\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/imagesswipeview/LoopedRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "adapter", "", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$g;)V", "Lru/ozon/app/android/fresh/main/widgets/product/imagesswipeview/LoopedRecyclerView$ScrollListenerForLoop;", "scrollListenerForLoop", "Lru/ozon/app/android/fresh/main/widgets/product/imagesswipeview/LoopedRecyclerView$ScrollListenerForLoop;", "Lru/ozon/app/android/fresh/main/widgets/product/imagesswipeview/LoopedRecyclerView$ScrollListenerForPositionChanges;", "scrollListenerForPositionChanges", "Lru/ozon/app/android/fresh/main/widgets/product/imagesswipeview/LoopedRecyclerView$ScrollListenerForPositionChanges;", "ru/ozon/app/android/fresh/main/widgets/product/imagesswipeview/LoopedRecyclerView$adapterDataObserver$1", "adapterDataObserver", "Lru/ozon/app/android/fresh/main/widgets/product/imagesswipeview/LoopedRecyclerView$adapterDataObserver$1;", "AdapterWrapper", "ScrollListenerForLoop", "ScrollListenerForPositionChanges", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoopedRecyclerView extends RecyclerView {

    @NotNull
    private final LoopedRecyclerView$adapterDataObserver$1 adapterDataObserver;

    @NotNull
    private final ScrollListenerForLoop scrollListenerForLoop;

    @NotNull
    private final ScrollListenerForPositionChanges scrollListenerForPositionChanges;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/imagesswipeview/LoopedRecyclerView$AdapterWrapper;", "Landroidx/recyclerview/widget/RecyclerView$C;", "T", "Landroidx/recyclerview/widget/RecyclerView$g;", "adapter", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$g;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "getItemCount", "()I", "Landroidx/recyclerview/widget/RecyclerView$g;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class AdapterWrapper<T extends RecyclerView.C> extends RecyclerView.g<T> {

        @NotNull
        private final RecyclerView.g<T> adapter;

        public AdapterWrapper(@NotNull RecyclerView.g<T> adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.adapter = adapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: getItemCount */
        public int getCardsCount() {
            int cardsCount = this.adapter.getCardsCount();
            return cardsCount >= 2 ? cardsCount + 2 : cardsCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(@NotNull T holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (getCardsCount() >= 2) {
                position = position == 0 ? getCardsCount() - 3 : position == getCardsCount() + (-1) ? 0 : position - 1;
            }
            this.adapter.onBindViewHolder(holder, position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        @NotNull
        public T onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return this.adapter.onCreateViewHolder(parent, viewType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/imagesswipeview/LoopedRecyclerView$ScrollListenerForLoop;", "Landroidx/recyclerview/widget/RecyclerView$t;", "<init>", "()V", "", "shouldMakeLoop", "()Z", "", "getScrollToPosition", "(I)Ljava/lang/Integer;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "itemsCount", "I", "getItemsCount", "()I", "setItemsCount", "(I)V", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ScrollListenerForLoop extends RecyclerView.t {
        private int itemsCount;

        private final Integer getScrollToPosition(int i11) {
            return i11 == 0 ? Integer.valueOf(this.itemsCount - 2) : i11 == this.itemsCount - 1 ? 1 : null;
        }

        private final boolean shouldMakeLoop() {
            return this.itemsCount >= 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (shouldMakeLoop() && newState == 0) {
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
                Integer scrollToPosition = getScrollToPosition(((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition());
                if (scrollToPosition != null) {
                    recyclerView.scrollToPosition(scrollToPosition.intValue());
                }
            }
        }

        public final void setItemsCount(int i11) {
            this.itemsCount = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/imagesswipeview/LoopedRecyclerView$ScrollListenerForPositionChanges;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "<init>", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "itemsCount", "I", "getItemsCount", "()I", "setItemsCount", "(I)V", "Lkotlin/Function1;", "onPositionChangeListener", "Lkotlin/jvm/functions/Function1;", "getOnPositionChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnPositionChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ScrollListenerForPositionChanges extends RecyclerView.t {
        private int itemsCount;

        @NotNull
        private final LinearLayoutManager layoutManager;
        private Function1<? super Integer, Unit> onPositionChangeListener;

        public ScrollListenerForPositionChanges(@NotNull LinearLayoutManager layoutManager) {
            Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
            this.layoutManager = layoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
            int findFirstCompletelyVisibleItemPosition;
            int i11;
            Function1<? super Integer, Unit> function1;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (newState != 0 || (findFirstCompletelyVisibleItemPosition = this.layoutManager.findFirstCompletelyVisibleItemPosition()) == -1) {
                return;
            }
            if (findFirstCompletelyVisibleItemPosition != 0) {
                int i12 = this.itemsCount;
                if (findFirstCompletelyVisibleItemPosition != i12 - 2) {
                    i11 = (findFirstCompletelyVisibleItemPosition == 1 || findFirstCompletelyVisibleItemPosition == i12 - 1) ? 0 : findFirstCompletelyVisibleItemPosition - 1;
                    if (i11 >= 0 || i11 > this.itemsCount - 2 || (function1 = this.onPositionChangeListener) == null) {
                        return;
                    }
                    function1.invoke(Integer.valueOf(i11));
                    return;
                }
            }
            i11 = this.itemsCount - 3;
            if (i11 >= 0) {
            }
        }

        public final void setItemsCount(int i11) {
            this.itemsCount = i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoopedRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.g<RecyclerView.C> adapter) {
        if (adapter == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        super.setAdapter(new AdapterWrapper(adapter));
        adapter.registerAdapterDataObserver(this.adapterDataObserver);
    }

    public /* synthetic */ LoopedRecyclerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v3, types: [ru.ozon.app.android.fresh.main.widgets.product.imagesswipeview.LoopedRecyclerView$adapterDataObserver$1] */
    public LoopedRecyclerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ScrollListenerForLoop scrollListenerForLoop = new ScrollListenerForLoop();
        this.scrollListenerForLoop = scrollListenerForLoop;
        RecyclerView.o layoutManager = getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ScrollListenerForPositionChanges scrollListenerForPositionChanges = new ScrollListenerForPositionChanges((LinearLayoutManager) layoutManager);
        this.scrollListenerForPositionChanges = scrollListenerForPositionChanges;
        this.adapterDataObserver = new RecyclerView.i() { // from class: ru.ozon.app.android.fresh.main.widgets.product.imagesswipeview.LoopedRecyclerView$adapterDataObserver$1
            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                LoopedRecyclerView.ScrollListenerForLoop scrollListenerForLoop2;
                LoopedRecyclerView.ScrollListenerForPositionChanges scrollListenerForPositionChanges2;
                RecyclerView.g adapter = LoopedRecyclerView.this.getAdapter();
                if (adapter == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                adapter.notifyDataSetChanged();
                scrollListenerForLoop2 = LoopedRecyclerView.this.scrollListenerForLoop;
                scrollListenerForLoop2.setItemsCount(adapter.getCardsCount());
                scrollListenerForPositionChanges2 = LoopedRecyclerView.this.scrollListenerForPositionChanges;
                scrollListenerForPositionChanges2.setItemsCount(adapter.getCardsCount());
                if (adapter.getCardsCount() >= 2) {
                    LoopedRecyclerView.this.scrollToPosition(1);
                }
            }
        };
        addOnScrollListener(scrollListenerForLoop);
        addOnScrollListener(scrollListenerForPositionChanges);
    }
}
