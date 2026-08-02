package com.detmir.recycli.adapters;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/detmir/recycli/adapters/RecyclerDiffItemCallback;", "Landroidx/recyclerview/widget/i$d;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/detmir/recycli/adapters/RecyclerItem;Lcom/detmir/recycli/adapters/RecyclerItem;)Z", "areContentsTheSame", "recycli_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RecyclerDiffItemCallback extends i.d<RecyclerItem> {
    @Override // androidx.recyclerview.widget.i.d
    public boolean areContentsTheSame(@NotNull RecyclerItem oldItem, @NotNull RecyclerItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.areContentsTheSame(newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull RecyclerItem oldItem, @NotNull RecyclerItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem.provideId(), newItem.provideId());
    }
}
