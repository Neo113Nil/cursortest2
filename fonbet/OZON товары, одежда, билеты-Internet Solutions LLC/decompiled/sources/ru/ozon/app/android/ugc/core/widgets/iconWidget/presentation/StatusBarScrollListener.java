package ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/StatusBarScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "", "statusBarHeight", "Lkotlin/Function1;", "", "", "onScrolledChanged", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "initialOffset", "resetWithInitialOffset", "(I)V", "I", "Lkotlin/jvm/functions/Function1;", "accumulatedDy", "isScrolledPastStatusBar", "Z", "initialized", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StatusBarScrollListener extends RecyclerView.t {
    private int accumulatedDy;
    private boolean initialized;
    private boolean isScrolledPastStatusBar;

    @NotNull
    private final Function1<Boolean, Unit> onScrolledChanged;
    private final int statusBarHeight;

    /* JADX WARN: Multi-variable type inference failed */
    public StatusBarScrollListener(int i11, @NotNull Function1<? super Boolean, Unit> onScrolledChanged) {
        Intrinsics.checkNotNullParameter(onScrolledChanged, "onScrolledChanged");
        this.statusBarHeight = i11;
        this.onScrolledChanged = onScrolledChanged;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (!this.initialized) {
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            this.accumulatedDy = computeVerticalScrollOffset;
            this.isScrolledPastStatusBar = computeVerticalScrollOffset >= this.statusBarHeight;
            this.initialized = true;
        }
        int i11 = this.accumulatedDy + dy;
        if (i11 < 0) {
            i11 = 0;
        }
        this.accumulatedDy = i11;
        boolean z11 = i11 >= this.statusBarHeight;
        if (z11 != this.isScrolledPastStatusBar) {
            this.isScrolledPastStatusBar = z11;
            this.onScrolledChanged.invoke(Boolean.valueOf(z11));
        }
    }

    public final void resetWithInitialOffset(int initialOffset) {
        this.accumulatedDy = initialOffset;
        this.isScrolledPastStatusBar = initialOffset >= this.statusBarHeight;
    }
}
