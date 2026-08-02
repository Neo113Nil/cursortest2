package ru.ozon.app.android.pdp.widgets.sellersortswitcher.presentation.sticky;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ)\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0015\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellersortswitcher/presentation/sticky/SellerSortSwitcherStickyPostitionWatcher;", "Landroidx/recyclerview/widget/RecyclerView$i;", "Lkotlin/Function0;", "", "sellerSortSwitcherUiPositionFinder", "Lkotlin/Function1;", "", "onWidgetPositionChanged", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "onChanged", "()V", "positionStart", "itemCount", "onItemRangeRemoved", "(II)V", "fromPosition", "toPosition", "onItemRangeMoved", "(III)V", "onItemRangeInserted", "onItemRangeChanged", "", "payload", "(IILjava/lang/Object;)V", "performCheck", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerSortSwitcherStickyPostitionWatcher extends RecyclerView.i {

    @NotNull
    private final Function1<Integer, Unit> onWidgetPositionChanged;

    @NotNull
    private final Function0<Integer> sellerSortSwitcherUiPositionFinder;

    /* JADX WARN: Multi-variable type inference failed */
    public SellerSortSwitcherStickyPostitionWatcher(@NotNull Function0<Integer> sellerSortSwitcherUiPositionFinder, @NotNull Function1<? super Integer, Unit> onWidgetPositionChanged) {
        Intrinsics.checkNotNullParameter(sellerSortSwitcherUiPositionFinder, "sellerSortSwitcherUiPositionFinder");
        Intrinsics.checkNotNullParameter(onWidgetPositionChanged, "onWidgetPositionChanged");
        this.sellerSortSwitcherUiPositionFinder = sellerSortSwitcherUiPositionFinder;
        this.onWidgetPositionChanged = onWidgetPositionChanged;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onChanged() {
        performCheck();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onItemRangeChanged(int positionStart, int itemCount) {
        performCheck();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onItemRangeInserted(int positionStart, int itemCount) {
        performCheck();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
        performCheck();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onItemRangeRemoved(int positionStart, int itemCount) {
        performCheck();
    }

    public final void performCheck() {
        this.onWidgetPositionChanged.invoke(this.sellerSortSwitcherUiPositionFinder.invoke());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
        performCheck();
    }
}
