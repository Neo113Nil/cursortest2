package ru.ozon.app.android.ordertracking.v4.presentation.util;

import B90.f0;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001(\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/MarqueeItemVisibilityTracker;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "trackingItemViewType", "Lru/ozon/app/android/ordertracking/v4/presentation/util/MarqueeItemVisibilityCallback;", "visibilityCallback", "Landroidx/lifecycle/v;", "lifecycle", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;ILru/ozon/app/android/ordertracking/v4/presentation/util/MarqueeItemVisibilityCallback;Landroidx/lifecycle/v;)V", "", "updateMostVisibleHolder", "()V", "Landroid/view/View;", "itemView", "", "calculateVisibleWidth", "(Landroid/view/View;)F", "Landroidx/lifecycle/J;", "owner", "onPause", "(Landroidx/lifecycle/J;)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "getCurrentMostVisibleHolder", "()Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/recyclerview/widget/RecyclerView;", "I", "Lru/ozon/app/android/ordertracking/v4/presentation/util/MarqueeItemVisibilityCallback;", "Landroidx/lifecycle/v;", "currentMostVisibleHolder", "Landroidx/recyclerview/widget/RecyclerView$C;", "", "isScrolling", "Z", "Landroid/graphics/Rect;", "itemRect", "Landroid/graphics/Rect;", "parentRect", "ru/ozon/app/android/ordertracking/v4/presentation/util/MarqueeItemVisibilityTracker$scrollListener$1", "scrollListener", "Lru/ozon/app/android/ordertracking/v4/presentation/util/MarqueeItemVisibilityTracker$scrollListener$1;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarqueeItemVisibilityTracker implements DefaultLifecycleObserver {
    private RecyclerView.C currentMostVisibleHolder;
    private boolean isScrolling;

    @NotNull
    private final Rect itemRect;

    @NotNull
    private final AbstractC5434v lifecycle;

    @NotNull
    private final Rect parentRect;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final MarqueeItemVisibilityTracker$scrollListener$1 scrollListener;
    private final int trackingItemViewType;

    @NotNull
    private final MarqueeItemVisibilityCallback visibilityCallback;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.ordertracking.v4.presentation.util.MarqueeItemVisibilityTracker$scrollListener$1] */
    public MarqueeItemVisibilityTracker(@NotNull RecyclerView recyclerView, int i11, @NotNull MarqueeItemVisibilityCallback visibilityCallback, @NotNull AbstractC5434v lifecycle) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(visibilityCallback, "visibilityCallback");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.recyclerView = recyclerView;
        this.trackingItemViewType = i11;
        this.visibilityCallback = visibilityCallback;
        this.lifecycle = lifecycle;
        this.itemRect = new Rect();
        this.parentRect = new Rect();
        ?? r32 = new RecyclerView.t() { // from class: ru.ozon.app.android.ordertracking.v4.presentation.util.MarqueeItemVisibilityTracker$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                RecyclerView.C c11;
                MarqueeItemVisibilityCallback marqueeItemVisibilityCallback;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 0) {
                    MarqueeItemVisibilityTracker.this.isScrolling = false;
                    MarqueeItemVisibilityTracker.this.updateMostVisibleHolder();
                } else {
                    if (newState != 1) {
                        return;
                    }
                    MarqueeItemVisibilityTracker.this.isScrolling = true;
                    c11 = MarqueeItemVisibilityTracker.this.currentMostVisibleHolder;
                    if (c11 != null) {
                        marqueeItemVisibilityCallback = MarqueeItemVisibilityTracker.this.visibilityCallback;
                        marqueeItemVisibilityCallback.onScrollingStateChanged(true, c11);
                    }
                }
            }
        };
        this.scrollListener = r32;
        recyclerView.addOnScrollListener(r32);
        recyclerView.post(new f0(this, 3));
        lifecycle.a(this);
    }

    private final float calculateVisibleWidth(View itemView) {
        itemView.getGlobalVisibleRect(this.itemRect);
        this.recyclerView.getGlobalVisibleRect(this.parentRect);
        return (Math.min(this.itemRect.right, this.parentRect.right) - Math.max(this.itemRect.left, this.parentRect.left)) / itemView.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMostVisibleHolder() {
        RecyclerView.g adapter;
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        RecyclerView.C c11 = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            float f7 = 0.0f;
            while (true) {
                RecyclerView.C findViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                if (findViewHolderForAdapterPosition != null && (adapter = this.recyclerView.getAdapter()) != null && adapter.getItemViewType(findFirstVisibleItemPosition) == this.trackingItemViewType) {
                    View itemView = findViewHolderForAdapterPosition.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    float calculateVisibleWidth = calculateVisibleWidth(itemView);
                    if (calculateVisibleWidth > f7) {
                        c11 = findViewHolderForAdapterPosition;
                        f7 = calculateVisibleWidth;
                    }
                }
                if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                    break;
                } else {
                    findFirstVisibleItemPosition++;
                }
            }
        }
        if (c11 != null) {
            if (c11.equals(this.currentMostVisibleHolder)) {
                if (this.isScrolling) {
                    return;
                }
                this.visibilityCallback.onScrollingStateChanged(false, this.currentMostVisibleHolder);
            } else {
                RecyclerView.C c12 = this.currentMostVisibleHolder;
                this.currentMostVisibleHolder = c11;
                if (this.isScrolling) {
                    return;
                }
                this.visibilityCallback.onMostVisibleHolderChanged(c11, c12);
            }
        }
    }

    public final RecyclerView.C getCurrentMostVisibleHolder() {
        return this.currentMostVisibleHolder;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        this.recyclerView.removeOnScrollListener(this.scrollListener);
        this.currentMostVisibleHolder = null;
        this.lifecycle.e(this);
    }
}
