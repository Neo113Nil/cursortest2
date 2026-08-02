package com.detmir.recycli.adapters;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fR(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/detmir/recycli/adapters/RecyclerDiffCallback;", "Landroidx/recyclerview/widget/i$b;", "<init>", "()V", "", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "getOldListSize", "()I", "getNewListSize", "", "Lcom/detmir/recycli/adapters/RecyclerItem;", "old", "Ljava/util/List;", "getOld", "()Ljava/util/List;", "setOld", "(Ljava/util/List;)V", "aNew", "getANew", "setANew", "recycli_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RecyclerDiffCallback extends i.b {
    public List<RecyclerItem> aNew;
    public List<RecyclerItem> old;

    @Override // androidx.recyclerview.widget.i.b
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return getOld().get(oldItemPosition).areContentsTheSame(getANew().get(newItemPosition));
    }

    @Override // androidx.recyclerview.widget.i.b
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return Intrinsics.d(getOld().get(oldItemPosition).provideId(), getANew().get(newItemPosition).provideId());
    }

    @NotNull
    public final List<RecyclerItem> getANew() {
        List<RecyclerItem> list = this.aNew;
        if (list != null) {
            return list;
        }
        Intrinsics.n("aNew");
        throw null;
    }

    @Override // androidx.recyclerview.widget.i.b
    public int getNewListSize() {
        return getANew().size();
    }

    @NotNull
    public final List<RecyclerItem> getOld() {
        List<RecyclerItem> list = this.old;
        if (list != null) {
            return list;
        }
        Intrinsics.n("old");
        throw null;
    }

    @Override // androidx.recyclerview.widget.i.b
    public int getOldListSize() {
        return getOld().size();
    }

    public final void setANew(@NotNull List<RecyclerItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.aNew = list;
    }

    public final void setOld(@NotNull List<RecyclerItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.old = list;
    }
}
