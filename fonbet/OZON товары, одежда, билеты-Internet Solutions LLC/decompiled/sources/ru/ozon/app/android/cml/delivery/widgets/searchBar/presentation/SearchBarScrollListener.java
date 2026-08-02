package ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lkotlin/Function1;", "", "", "onScrollDistanceChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "resetScrollDistance", "()V", "Lkotlin/jvm/functions/Function1;", "scrollDistanceY", "I", "", "resetScrollDistanceWhenIdle", "Z", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchBarScrollListener extends RecyclerView.t {

    @NotNull
    private final Function1<Integer, Unit> onScrollDistanceChanged;
    private boolean resetScrollDistanceWhenIdle;
    private int scrollDistanceY;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchBarScrollListener(@NotNull Function1<? super Integer, Unit> onScrollDistanceChanged) {
        Intrinsics.checkNotNullParameter(onScrollDistanceChanged, "onScrollDistanceChanged");
        this.onScrollDistanceChanged = onScrollDistanceChanged;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (newState == 0) {
            boolean canScrollVertically = recyclerView.canScrollVertically(-1);
            if (this.resetScrollDistanceWhenIdle) {
                this.resetScrollDistanceWhenIdle = false;
                this.scrollDistanceY = 0;
            } else {
                if (canScrollVertically) {
                    return;
                }
                this.scrollDistanceY = 0;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.resetScrollDistanceWhenIdle) {
            return;
        }
        int i11 = this.scrollDistanceY + dy;
        this.scrollDistanceY = i11;
        this.onScrollDistanceChanged.invoke(Integer.valueOf(i11));
    }

    public final void resetScrollDistance() {
        this.resetScrollDistanceWhenIdle = true;
    }
}
