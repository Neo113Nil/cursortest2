package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\f\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\"\u0010\"\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/shared/CenterOnScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/shared/OnSnapPositionChangeListener;", "onSnapPositionChangeListener", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/shared/OnScrollFinishedListener;", "onScrollFinishedListener", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/shared/OnSnapPositionChangeListener;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/shared/OnScrollFinishedListener;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "isScrollFinished", "", "onScrolledNotify", "(Landroidx/recyclerview/widget/RecyclerView;Z)V", "", "selectMiddleItem", "(Landroidx/recyclerview/widget/RecyclerView;)I", "T", "", "list", "Lkotlin/Function1;", "action", "iterateFromCenter", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/shared/OnSnapPositionChangeListener;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/shared/OnScrollFinishedListener;", "snapPosition", "I", "getSnapPosition", "()I", "setSnapPosition", "(I)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CenterOnScrollListener extends RecyclerView.t {
    private final OnScrollFinishedListener onScrollFinishedListener;
    private final OnSnapPositionChangeListener onSnapPositionChangeListener;
    private int snapPosition = -1;

    public CenterOnScrollListener(OnSnapPositionChangeListener onSnapPositionChangeListener, OnScrollFinishedListener onScrollFinishedListener) {
        this.onSnapPositionChangeListener = onSnapPositionChangeListener;
        this.onScrollFinishedListener = onScrollFinishedListener;
    }

    private final <T> void iterateFromCenter(List<? extends T> list, Function1<? super T, Boolean> action) {
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i11 = size / 2;
        if (!action.invoke(list.get(i11)).booleanValue()) {
            return;
        }
        int i12 = 1;
        if (1 > i11) {
            return;
        }
        while (true) {
            int i13 = i11 - i12;
            int i14 = i11 + i12;
            if (i13 >= 0 && !action.invoke(list.get(i13)).booleanValue()) {
                return;
            }
            if ((i14 < size && !action.invoke(list.get(i14)).booleanValue()) || i12 == i11) {
                return;
            } else {
                i12++;
            }
        }
    }

    private final void onScrolledNotify(RecyclerView recyclerView, boolean isScrollFinished) {
        OnSnapPositionChangeListener onSnapPositionChangeListener;
        int selectMiddleItem = selectMiddleItem(recyclerView);
        if (selectMiddleItem == -1) {
            return;
        }
        if (isScrollFinished) {
            OnScrollFinishedListener onScrollFinishedListener = this.onScrollFinishedListener;
            if (onScrollFinishedListener != null) {
                onScrollFinishedListener.onScrollFinished(selectMiddleItem);
            }
        } else if (this.snapPosition != selectMiddleItem && (onSnapPositionChangeListener = this.onSnapPositionChangeListener) != null) {
            onSnapPositionChangeListener.onSnapPositionChange(selectMiddleItem);
        }
        this.snapPosition = selectMiddleItem;
    }

    private final int selectMiddleItem(RecyclerView recyclerView) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        ArrayList N11 = C7714v.N(C7714v.a0(new IntRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), 1)));
        K k11 = new K();
        k11.f71785a = -1;
        iterateFromCenter(N11, new CenterOnScrollListener$selectMiddleItem$1(recyclerView, recyclerView.getWidth() / 2, k11, linearLayoutManager));
        return k11.f71785a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (newState == 0) {
            onScrolledNotify(recyclerView, true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, dx, dy);
        onScrolledNotify(recyclerView, false);
    }

    public final void setSnapPosition(int i11) {
        this.snapPosition = i11;
    }
}
