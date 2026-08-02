package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation;

import Fv.RunnableC3061a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingBottomOffsetDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroidx/recyclerview/widget/RecyclerView$g;", "adapter", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$g;)V", "Landroid/view/View;", "view", "", "currentPosition", "lastItemPosition", "", "checkIsItemInLastRow", "(Landroid/view/View;II)Z", "", "invalidateItemDecorations", "()V", "Landroid/graphics/Rect;", "outRect", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "offset", "setBottomOffset", "(I)V", "bottomOffset", "I", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/os/Handler;", "handler$delegate", "LSc/j;", "getHandler", "()Landroid/os/Handler;", "handler", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GeotrackingBottomOffsetDecorator extends RecyclerView.n {
    private int bottomOffset;

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handler;
    private RecyclerView recyclerView;

    public GeotrackingBottomOffsetDecorator(@NotNull RecyclerView.g<?> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.handler = k.a(n.NONE, GeotrackingBottomOffsetDecorator$handler$2.INSTANCE);
        adapter.registerAdapterDataObserver(new RecyclerView.i() { // from class: ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingBottomOffsetDecorator$observer$1
            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                GeotrackingBottomOffsetDecorator.this.invalidateItemDecorations();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeChanged(int positionStart, int itemCount) {
                GeotrackingBottomOffsetDecorator.this.invalidateItemDecorations();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeInserted(int positionStart, int itemCount) {
                GeotrackingBottomOffsetDecorator.this.invalidateItemDecorations();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
                GeotrackingBottomOffsetDecorator.this.invalidateItemDecorations();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeRemoved(int positionStart, int itemCount) {
                GeotrackingBottomOffsetDecorator.this.invalidateItemDecorations();
            }
        });
    }

    private final boolean checkIsItemInLastRow(View view, int currentPosition, int lastItemPosition) {
        if (currentPosition == lastItemPosition) {
            return true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.b bVar = layoutParams instanceof GridLayoutManager.b ? (GridLayoutManager.b) layoutParams : null;
        if (bVar == null) {
            return false;
        }
        RecyclerView recyclerView = this.recyclerView;
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return false;
        }
        int g10 = gridLayoutManager.g();
        if (bVar.d() + bVar.c() == g10) {
            return false;
        }
        RecyclerView recyclerView2 = this.recyclerView;
        Object adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
        C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
        if (c8042d == null) {
            return false;
        }
        int d11 = bVar.d() + bVar.c();
        while (d11 < g10 && currentPosition < lastItemPosition) {
            currentPosition++;
            d11 += c8042d.h(currentPosition).p().a();
        }
        return d11 <= g10 && currentPosition == lastItemPosition;
    }

    private final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateItemDecorations() {
        getHandler().removeCallbacksAndMessages(null);
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null && recyclerView.isComputingLayout()) {
            getHandler().post(new RunnableC3061a(this, 0));
            return;
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.invalidateItemDecorations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidateItemDecorations$lambda$1(GeotrackingBottomOffsetDecorator geotrackingBottomOffsetDecorator) {
        RecyclerView recyclerView = geotrackingBottomOffsetDecorator.recyclerView;
        if (recyclerView != null) {
            recyclerView.invalidateItemDecorations();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        this.recyclerView = parent;
        Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (parent.getAdapter() != null && checkIsItemInLastRow(view, intValue, r4.getItemCount() - 1)) {
                outRect.bottom = this.bottomOffset;
            }
        }
    }

    public final void setBottomOffset(int offset) {
        if (this.bottomOffset == offset) {
            return;
        }
        this.bottomOffset = offset;
        invalidateItemDecorations();
    }
}
