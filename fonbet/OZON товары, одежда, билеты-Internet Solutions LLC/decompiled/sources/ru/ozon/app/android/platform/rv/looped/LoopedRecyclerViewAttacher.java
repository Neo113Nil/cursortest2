package ru.ozon.app.android.platform.rv.looped;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001a\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerViewAttacher;", "Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator$b;", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView$o;", "layoutManager", "", "checkLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$o;)V", "Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;", "indicator", "pager", "attachToPager", "(Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;)V", "detachFromPager", "recyclerView", "Lru/ozon/app/android/platform/rv/looped/LoopedRecyclerView;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "adapter", "Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "pagerIndicator", "Lru/tinkoff/scrollingpagerindicator/ScrollingPagerIndicator;", "Landroidx/recyclerview/widget/RecyclerView$i;", "dataObserver", "Landroidx/recyclerview/widget/RecyclerView$i;", "Lkotlin/Function1;", "", "onPositionChangeListener", "Lkotlin/jvm/functions/Function1;", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoopedRecyclerViewAttacher implements ScrollingPagerIndicator.b<LoopedRecyclerView> {
    private LoopedAdapter<?> adapter;
    private RecyclerView.i dataObserver;
    private LinearLayoutManager layoutManager;

    @NotNull
    private final Function1<Integer, Unit> onPositionChangeListener = new LoopedRecyclerViewAttacher$onPositionChangeListener$1(this);
    private ScrollingPagerIndicator pagerIndicator;
    private LoopedRecyclerView recyclerView;

    private final void checkLayoutManager(RecyclerView.o layoutManager) {
        if (layoutManager == null) {
            throw new IllegalStateException("LayoutManager must not be null");
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        }
        if (((LinearLayoutManager) layoutManager).getOrientation() != 0) {
            throw new IllegalStateException("Only HORIZONTAL orientation is supported");
        }
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.b
    public void detachFromPager() {
        LoopedAdapter<?> loopedAdapter = this.adapter;
        if (loopedAdapter == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        RecyclerView.i iVar = this.dataObserver;
        if (iVar == null) {
            Intrinsics.n("dataObserver");
            throw null;
        }
        loopedAdapter.unregisterAdapterDataObserver(iVar);
        LoopedRecyclerView loopedRecyclerView = this.recyclerView;
        if (loopedRecyclerView != null) {
            loopedRecyclerView.clearOnPositionChangeListener();
        } else {
            Intrinsics.n("recyclerView");
            throw null;
        }
    }

    @Override // ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.b
    public void attachToPager(@NotNull ScrollingPagerIndicator indicator, @NotNull LoopedRecyclerView pager) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(pager, "pager");
        this.recyclerView = pager;
        checkLayoutManager(pager.getLayoutManager());
        RecyclerView.o layoutManager = pager.getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        this.layoutManager = (LinearLayoutManager) layoutManager;
        this.adapter = pager.getAdapter();
        this.pagerIndicator = indicator;
        RecyclerView.i iVar = new RecyclerView.i() { // from class: ru.ozon.app.android.platform.rv.looped.LoopedRecyclerViewAttacher$attachToPager$1
            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                ScrollingPagerIndicator scrollingPagerIndicator;
                LoopedAdapter loopedAdapter;
                ScrollingPagerIndicator scrollingPagerIndicator2;
                scrollingPagerIndicator = LoopedRecyclerViewAttacher.this.pagerIndicator;
                if (scrollingPagerIndicator == null) {
                    Intrinsics.n("pagerIndicator");
                    throw null;
                }
                loopedAdapter = LoopedRecyclerViewAttacher.this.adapter;
                if (loopedAdapter == null) {
                    Intrinsics.n("adapter");
                    throw null;
                }
                scrollingPagerIndicator.m(loopedAdapter.getCorrectItemsCount());
                scrollingPagerIndicator2 = LoopedRecyclerViewAttacher.this.pagerIndicator;
                if (scrollingPagerIndicator2 != null) {
                    scrollingPagerIndicator2.k(0);
                } else {
                    Intrinsics.n("pagerIndicator");
                    throw null;
                }
            }
        };
        this.dataObserver = iVar;
        LoopedAdapter<?> loopedAdapter = this.adapter;
        if (loopedAdapter == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        loopedAdapter.registerAdapterDataObserver(iVar);
        LoopedRecyclerView loopedRecyclerView = this.recyclerView;
        if (loopedRecyclerView != null) {
            loopedRecyclerView.addOnPositionChangeListener(this.onPositionChangeListener);
        } else {
            Intrinsics.n("recyclerView");
            throw null;
        }
    }
}
