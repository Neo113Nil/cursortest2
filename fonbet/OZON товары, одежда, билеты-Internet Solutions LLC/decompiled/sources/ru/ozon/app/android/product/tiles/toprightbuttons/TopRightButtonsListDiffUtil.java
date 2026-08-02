package ru.ozon.app.android.product.tiles.toprightbuttons;

import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/product/tiles/toprightbuttons/TopRightButtonsListDiffUtil;", "Landroidx/recyclerview/widget/i$b;", "", "", "oldList", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "getOldListSize", "()I", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "Ljava/util/List;", "getOldList", "()Ljava/util/List;", "setOldList", "(Ljava/util/List;)V", "getNewList", "setNewList", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TopRightButtonsListDiffUtil extends i.b {

    @NotNull
    private List<? extends Object> newList;

    @NotNull
    private List<? extends Object> oldList;

    public TopRightButtonsListDiffUtil(@NotNull List<? extends Object> oldList, @NotNull List<? extends Object> newList) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override // androidx.recyclerview.widget.i.b
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return Intrinsics.d(this.oldList.get(oldItemPosition), this.newList.get(newItemPosition));
    }

    @Override // androidx.recyclerview.widget.i.b
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return this.oldList.get(oldItemPosition).getClass().equals(this.newList.get(newItemPosition).getClass());
    }

    @Override // androidx.recyclerview.widget.i.b
    public int getNewListSize() {
        return this.newList.size();
    }

    @Override // androidx.recyclerview.widget.i.b
    public int getOldListSize() {
        return this.oldList.size();
    }

    public final void setNewList(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.newList = list;
    }

    public final void setOldList(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.oldList = list;
    }
}
