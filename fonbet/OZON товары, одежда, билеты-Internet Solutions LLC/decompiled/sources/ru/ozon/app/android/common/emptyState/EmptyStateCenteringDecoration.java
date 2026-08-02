package ru.ozon.app.android.common.emptyState;

import T00.a;
import T7.P;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.G;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import jk0.j;
import jk0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/common/emptyState/EmptyStateCenteringDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "view", "", "isViewRecycled", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "Landroid/graphics/Point;", "screenSize", "", "aboveEmptyStateViewOffset", "", "setupVerticalMargins", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Point;I)V", "emptySpaceWithView", "setupEqualsVerticalMargins", "(Landroid/view/View;I)V", "isViewLast", "emptyStateView", "getOverlapContainersHeight", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "Landroid/graphics/Rect;", "outRect", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "parentRect", "Landroid/graphics/Rect;", "empty-state_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmptyStateCenteringDecoration extends RecyclerView.n {

    @NotNull
    private final Rect parentRect = new Rect();

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOverlapContainersHeight(RecyclerView parent, View emptyStateView) {
        RecyclerView.C childViewHolder = parent.getChildViewHolder(emptyStateView);
        j jVar = childViewHolder instanceof j ? (j) childViewHolder : null;
        if (jVar == null) {
            return 0;
        }
        l a11 = jVar.getViewHolderPositionInfo().a();
        return a11.f().height() - a11.e().height();
    }

    private final boolean isViewLast(RecyclerView parent, View view) {
        ru.ozon.composer.ui.widget.l h11;
        d c11;
        a b11;
        RecyclerView.g adapter = parent.getAdapter();
        String str = null;
        C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == (c8042d != null ? c8042d.getShimmersCount() : 0) - 1) {
            if (c8042d != null && (h11 = c8042d.h(childAdapterPosition)) != null && (c11 = h11.c()) != null && (b11 = c11.b()) != null) {
                str = b11.f();
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    private final boolean isViewRecycled(RecyclerView parent, View view) {
        return parent.indexOfChild(view) != parent.getChildAdapterPosition(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupEqualsVerticalMargins(View view, int emptySpaceWithView) {
        int i11 = emptySpaceWithView / 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.bottomMargin = i11;
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupVerticalMargins(RecyclerView parent, View view, Point screenSize, int aboveEmptyStateViewOffset) {
        int i11 = screenSize.y;
        int i12 = i11 / 8;
        if (aboveEmptyStateViewOffset >= i11 / 2 || isViewRecycled(parent, view)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i12;
        marginLayoutParams.bottomMargin = i12;
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull final View view, @NotNull final RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.C e11 = P.e(parent, "parent", state, "state", view);
        if ((e11 instanceof EmptyStateViewHolder) || (e11 instanceof EmptyStateV2ViewHolder) || (e11 instanceof EmptyStatePrecreationViewHolder)) {
            boolean isViewLast = isViewLast(parent, view);
            Iterable<View> children = ViewGroupExtKt.children(parent);
            ArrayList arrayList = new ArrayList();
            for (View view2 : children) {
                if (Intrinsics.d(view2, view)) {
                    break;
                } else {
                    arrayList.add(view2);
                }
            }
            Iterator it = arrayList.iterator();
            final int i11 = 0;
            while (it.hasNext()) {
                i11 += ((View) it.next()).getHeight();
            }
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            final Point appUsableScreenSize = ContextExtKt.getAppUsableScreenSize(context);
            if (isViewLast) {
                G.a(view, new Runnable() { // from class: ru.ozon.app.android.common.emptyState.EmptyStateCenteringDecoration$getItemOffsets$lambda$3$$inlined$doOnPreDraw$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int overlapContainersHeight;
                        int height = parent.getHeight() - i11;
                        overlapContainersHeight = this.getOverlapContainersHeight(parent, view);
                        int height2 = (height - overlapContainersHeight) - view.getHeight();
                        if (height2 > 0) {
                            this.setupEqualsVerticalMargins(view, height2);
                        } else {
                            this.setupVerticalMargins(parent, view, appUsableScreenSize, i11);
                        }
                    }
                });
            } else {
                setupVerticalMargins(parent, view, appUsableScreenSize, i11);
            }
        }
    }
}
