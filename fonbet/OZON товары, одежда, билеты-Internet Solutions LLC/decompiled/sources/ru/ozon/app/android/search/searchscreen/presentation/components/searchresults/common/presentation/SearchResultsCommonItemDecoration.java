package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation;

import android.content.Context;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$drawable;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridViewHolder;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/SearchResultsCommonItemDecoration;", "Lru/ozon/app/android/uikit/view/recycler/decoration/CustomDividerDecoration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "", "isCurrentSearchViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "Lm10/l;", "Lru/ozon/app/android/composer/view/DecoratedAdapter;", "adapter", "isNextSearchViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Lm10/l;)Z", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "isSearchViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;)Z", "drawFor", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultsCommonItemDecoration extends CustomDividerDecoration {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsCommonItemDecoration(@NotNull Context context) {
        super(context, 2, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        setDivider(a.getDrawable(context, R$drawable.divider_gray));
    }

    private final boolean isCurrentSearchViewHolder(RecyclerView parent, View child) {
        return isSearchViewHolder(parent.findContainingViewHolder(child));
    }

    private final boolean isNextSearchViewHolder(RecyclerView parent, View child, l adapter) {
        int childAdapterPosition = parent.getChildAdapterPosition(child) + 1;
        if (childAdapterPosition < adapter.getItemCount()) {
            return isSearchViewHolder(parent.findViewHolderForAdapterPosition(childAdapterPosition));
        }
        return false;
    }

    private final boolean isSearchViewHolder(RecyclerView.C viewHolder) {
        return viewHolder instanceof SearchResultsGridViewHolder;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
    public boolean drawFor(@NotNull RecyclerView parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Object adapter = parent.getAdapter();
        if (adapter instanceof l) {
            return isCurrentSearchViewHolder(parent, child) || isNextSearchViewHolder(parent, child, (l) adapter);
        }
        return false;
    }
}
