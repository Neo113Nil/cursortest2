package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.decarator;

import Sc.InterfaceC4008j;
import Sc.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.badge.MultilineBadge;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/decarator/SearchResultsRecyclerAtomDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "badgeMargin$delegate", "LSc/j;", "getBadgeMargin", "()I", "badgeMargin", "multilineBadgeMargin$delegate", "getMultilineBadgeMargin", "multilineBadgeMargin", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultsRecyclerAtomDecorator extends RecyclerView.n {

    /* renamed from: badgeMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeMargin = k.b(SearchResultsRecyclerAtomDecorator$badgeMargin$2.INSTANCE);

    /* renamed from: multilineBadgeMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j multilineBadgeMargin = k.b(SearchResultsRecyclerAtomDecorator$multilineBadgeMargin$2.INSTANCE);

    private final int getBadgeMargin() {
        return ((Number) this.badgeMargin.getValue()).intValue();
    }

    private final int getMultilineBadgeMargin() {
        return ((Number) this.multilineBadgeMargin.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.C childViewHolder = parent.getChildViewHolder(view);
        AtomItemViewHolder atomItemViewHolder = childViewHolder instanceof AtomItemViewHolder ? (AtomItemViewHolder) childViewHolder : null;
        if (atomItemViewHolder == null) {
            return;
        }
        AtomDTO data = atomItemViewHolder.getAtom().getData();
        if (data instanceof MultilineBadge) {
            outRect.top = getMultilineBadgeMargin();
            outRect.bottom = getMultilineBadgeMargin();
        } else if (data instanceof Badge) {
            outRect.top = getBadgeMargin();
            outRect.bottom = getBadgeMargin();
        }
    }
}
