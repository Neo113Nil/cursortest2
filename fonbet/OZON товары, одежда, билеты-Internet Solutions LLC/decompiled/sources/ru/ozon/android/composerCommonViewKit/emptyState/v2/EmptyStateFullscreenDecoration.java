package ru.ozon.android.composerCommonViewKit.emptyState.v2;

import T7.P;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.G;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import jk0.j;
import jk0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ViewHolder;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/EmptyStateFullscreenDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "viewHolderTag", "<init>", "(Ljava/lang/String;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "emptyStateView", "", "getOverlapContainersHeight", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "Ljk0/l;", "Landroid/graphics/Rect;", "nonOverlappedRect", "", "updateNonOverlappedRect", "(Ljk0/l;Landroid/graphics/Rect;)V", "outRect", "view", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Ljava/lang/String;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateFullscreenDecoration extends RecyclerView.n {

    @NotNull
    private final String viewHolderTag;

    public EmptyStateFullscreenDecoration(@NotNull String viewHolderTag) {
        Intrinsics.checkNotNullParameter(viewHolderTag, "viewHolderTag");
        this.viewHolderTag = viewHolderTag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOverlapContainersHeight(RecyclerView parent, View emptyStateView) {
        RecyclerView.C childViewHolder = parent.getChildViewHolder(emptyStateView);
        j jVar = childViewHolder instanceof j ? (j) childViewHolder : null;
        if (jVar == null) {
            return 0;
        }
        l a11 = jVar.getViewHolderPositionInfo().a();
        Rect e11 = a11.e();
        updateNonOverlappedRect(a11, e11);
        return a11.f().height() - e11.height();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateNonOverlappedRect(l lVar, Rect rect) {
        int i11;
        Integer valueOf;
        int intValue;
        Integer valueOf2 = Integer.valueOf(lVar.i().bottom);
        if (lVar.i().isEmpty()) {
            valueOf2 = null;
        }
        if (valueOf2 == null) {
            valueOf2 = Integer.valueOf(lVar.b().bottom);
            if (lVar.b().isEmpty()) {
                valueOf2 = null;
            }
            if (valueOf2 == null) {
                i11 = lVar.f().top + lVar.h().top;
                valueOf = Integer.valueOf(lVar.d().top);
                if (lVar.d().isEmpty()) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    intValue = valueOf.intValue();
                } else {
                    Integer c11 = lVar.c();
                    Integer valueOf3 = c11 != null ? Integer.valueOf(c11.intValue() - lVar.h().bottom) : null;
                    intValue = valueOf3 != null ? valueOf3.intValue() : lVar.f().bottom - lVar.h().bottom;
                }
                rect.set(lVar.f().left, i11, lVar.f().right, intValue);
            }
        }
        i11 = valueOf2.intValue();
        valueOf = Integer.valueOf(lVar.d().top);
        if (lVar.d().isEmpty()) {
        }
        if (valueOf == null) {
        }
        rect.set(lVar.f().left, i11, lVar.f().right, intValue);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull final View view, @NotNull final RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.C e11 = P.e(parent, "parent", state, "state", view);
        if ((e11 instanceof EmptyStateV2ViewHolder) && Intrinsics.d(((EmptyStateV2ViewHolder) e11).getTag(), this.viewHolderTag)) {
            Iterable<View> children = ViewGroupExtKt.children(parent);
            ArrayList arrayList = new ArrayList();
            for (View view2 : children) {
                if (parent.getChildAdapterPosition(view2) != -1) {
                    arrayList.add(view2);
                }
            }
            ArrayList<View> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (Intrinsics.d((View) obj, view)) {
                    break;
                } else {
                    arrayList2.add(obj);
                }
            }
            final int i11 = 0;
            for (View view3 : arrayList2) {
                int physicalPartHeight = i11 + (view3 instanceof IslandSeparatorView ? ((IslandSeparatorView) view3).getViewState().getPhysicalPartHeight() : view3.getHeight());
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i12 = physicalPartHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                i11 = i12 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
            }
            G.a(view, new Runnable() { // from class: ru.ozon.android.composerCommonViewKit.emptyState.v2.EmptyStateFullscreenDecoration$getItemOffsets$lambda$4$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    final View view4 = view;
                    final RecyclerView recyclerView = parent;
                    final int i13 = i11;
                    final EmptyStateFullscreenDecoration emptyStateFullscreenDecoration = this;
                    view4.post(new Runnable() { // from class: ru.ozon.android.composerCommonViewKit.emptyState.v2.EmptyStateFullscreenDecoration$getItemOffsets$4$1$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int overlapContainersHeight;
                            if (RecyclerView.this.getChildAdapterPosition(view4) == -1) {
                                View view5 = view4;
                                ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                                if (layoutParams3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                                layoutParams3.height = 0;
                                view5.setLayoutParams(layoutParams3);
                                return;
                            }
                            int height = RecyclerView.this.getHeight() - i13;
                            overlapContainersHeight = emptyStateFullscreenDecoration.getOverlapContainersHeight(RecyclerView.this, view4);
                            int i14 = height - overlapContainersHeight;
                            int height2 = i14 - view4.getHeight();
                            if (height2 != 0 || view4.getHeight() == 0) {
                                View view6 = view4;
                                ViewGroup.LayoutParams layoutParams4 = view6.getLayoutParams();
                                if (layoutParams4 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                                if (height2 <= 0) {
                                    i14 = -2;
                                }
                                layoutParams4.height = i14;
                                view6.setLayoutParams(layoutParams4);
                            }
                        }
                    });
                }
            });
        }
    }
}
