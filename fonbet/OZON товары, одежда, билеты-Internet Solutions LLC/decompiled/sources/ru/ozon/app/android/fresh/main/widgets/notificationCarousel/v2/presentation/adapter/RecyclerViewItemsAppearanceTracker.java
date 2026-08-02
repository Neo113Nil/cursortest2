package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter;

import I.g;
import Sc.InterfaceC4008j;
import Sc.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.RecyclerViewItemsAppearanceTracker$scrollListener$2;

@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0016\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\fJ\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/RecyclerViewItemsAppearanceTracker;", "Landroidx/recyclerview/widget/RecyclerView$C;", "T", "", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/Function1;", "", "onScrollStopped", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V", "updateMostVisibleHolder", "()V", "Landroid/view/View;", "itemView", "", "calculateVisiblePercentage", "(Landroid/view/View;)F", "startItemTracking", "stopItemTracking", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/RecyclerViewItemsAppearanceTracker$scrollListener$2$1", "scrollListener$delegate", "LSc/j;", "getScrollListener", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/RecyclerViewItemsAppearanceTracker$scrollListener$2$1;", "scrollListener", "Landroid/graphics/Rect;", "itemRect$delegate", "getItemRect", "()Landroid/graphics/Rect;", "itemRect", "parentRect$delegate", "getParentRect", "parentRect", "currentMostVisibleItem", "Landroidx/recyclerview/widget/RecyclerView$C;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecyclerViewItemsAppearanceTracker<T extends RecyclerView.C> {
    private T currentMostVisibleItem;

    /* renamed from: itemRect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j itemRect;

    @NotNull
    private final Function1<T, Unit> onScrollStopped;

    /* renamed from: parentRect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j parentRect;

    @NotNull
    private final RecyclerView recyclerView;

    /* renamed from: scrollListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scrollListener;

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerViewItemsAppearanceTracker(@NotNull RecyclerView recyclerView, @NotNull Function1<? super T, Unit> onScrollStopped) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(onScrollStopped, "onScrollStopped");
        this.recyclerView = recyclerView;
        this.onScrollStopped = onScrollStopped;
        this.scrollListener = k.b(new RecyclerViewItemsAppearanceTracker$scrollListener$2(this));
        this.itemRect = k.b(RecyclerViewItemsAppearanceTracker$itemRect$2.INSTANCE);
        this.parentRect = k.b(RecyclerViewItemsAppearanceTracker$parentRect$2.INSTANCE);
    }

    private final float calculateVisiblePercentage(View itemView) {
        itemView.getGlobalVisibleRect(getItemRect());
        this.recyclerView.getGlobalVisibleRect(getParentRect());
        return (Math.min(getItemRect().right, getParentRect().right) - Math.max(getItemRect().left, getParentRect().left)) / itemView.getWidth();
    }

    private final Rect getItemRect() {
        return (Rect) this.itemRect.getValue();
    }

    private final Rect getParentRect() {
        return (Rect) this.parentRect.getValue();
    }

    private final RecyclerViewItemsAppearanceTracker$scrollListener$2.AnonymousClass1 getScrollListener() {
        return (RecyclerViewItemsAppearanceTracker$scrollListener$2.AnonymousClass1) this.scrollListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.recyclerview.widget.RecyclerView$C] */
    public final void updateMostVisibleHolder() {
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        T t2 = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            float f7 = 0.0f;
            T t11 = null;
            while (true) {
                ?? findViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                T t12 = findViewHolderForAdapterPosition;
                if (findViewHolderForAdapterPosition == 0) {
                    t12 = null;
                }
                if (t12 != null) {
                    View itemView = t12.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    float calculateVisiblePercentage = calculateVisiblePercentage(itemView);
                    if (calculateVisiblePercentage > f7) {
                        t11 = t12;
                        f7 = calculateVisiblePercentage;
                    }
                }
                if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                    break;
                } else {
                    findFirstVisibleItemPosition++;
                }
            }
            t2 = t11;
        }
        if (Intrinsics.d(t2, this.currentMostVisibleItem)) {
            return;
        }
        this.currentMostVisibleItem = t2;
        if (t2 != null) {
            this.onScrollStopped.invoke(t2);
        }
    }

    public final void startItemTracking() {
        stopItemTracking();
        this.recyclerView.addOnScrollListener(getScrollListener());
        this.recyclerView.post(new g(this, 6));
    }

    public final void stopItemTracking() {
        this.recyclerView.removeOnScrollListener(getScrollListener());
    }
}
