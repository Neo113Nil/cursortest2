package ru.ozon.app.android.pdp.view.shared;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.view.shared.ListItem;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/view/shared/ListItemDiffUtils;", "Lru/ozon/app/android/pdp/view/shared/ListItem;", "T", "Landroidx/recyclerview/widget/i$d;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/pdp/view/shared/ListItem;Lru/ozon/app/android/pdp/view/shared/ListItem;)Z", "areContentsTheSame", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ListItemDiffUtils<T extends ListItem> extends i.d<T> {
    @Override // androidx.recyclerview.widget.i.d
    @SuppressLint({"DiffUtilEquals"})
    public boolean areContentsTheSame(@NotNull T oldItem, @NotNull T newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.d(oldItem, newItem);
    }

    @Override // androidx.recyclerview.widget.i.d
    public boolean areItemsTheSame(@NotNull T oldItem, @NotNull T newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getId() == newItem.getId();
    }
}
