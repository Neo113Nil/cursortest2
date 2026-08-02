package com.detmir.recycli.adapters;

import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/detmir/recycli/adapters/RecyclerBinder;", "", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$C;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "position", "", "state", "Lcom/detmir/recycli/adapters/RecyclerItem;", "item", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;ILjava/lang/String;Lcom/detmir/recycli/adapters/RecyclerItem;)V", "recyclerItemState", "getItemViewType", "(Ljava/lang/String;)I", "Ljava/util/HashMap;", "getStateToIndexMap", "()Ljava/util/HashMap;", "stateToIndexMap", "recycli_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface RecyclerBinder {
    int getItemViewType(@NotNull String recyclerItemState);

    @NotNull
    HashMap<String, Integer> getStateToIndexMap();

    void onBindViewHolder(@NotNull RecyclerView.C holder, int position, @NotNull String state, @NotNull RecyclerItem item);

    @NotNull
    RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType);
}
