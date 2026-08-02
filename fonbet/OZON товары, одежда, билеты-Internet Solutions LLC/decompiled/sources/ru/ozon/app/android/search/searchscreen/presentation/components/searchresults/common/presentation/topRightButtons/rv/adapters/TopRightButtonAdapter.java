package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.adapters;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/adapters/TopRightButtonAdapter;", "", "", "list", "", "submitList", "(Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView$g;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$g;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface TopRightButtonAdapter {
    @NotNull
    RecyclerView.g<j> getAdapter();

    void submitList(List<? extends Object> list);
}
