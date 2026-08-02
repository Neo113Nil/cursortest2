package ru.ozon.app.android.pdp.view.shared;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.view.shared.ListItem;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u001f\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0001H\u0017¢\u0006\u0004\b\f\u0010\rR\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/view/shared/ListItemsAdapter;", "Lru/ozon/app/android/pdp/view/shared/ListItem;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "VH", "Landroidx/recyclerview/widget/t;", "Lkotlin/Function1;", "", "onItemVisible", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "holder", "onViewAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "Lkotlin/jvm/functions/Function1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ListItemsAdapter<T extends ListItem, VH extends RecyclerView.C> extends t<T, VH> {
    private final Function1<T, Unit> onItemVisible;

    public /* synthetic */ ListItemsAdapter(Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : function1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull VH holder) {
        ListItem listItem;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.onItemVisible == null || (listItem = (ListItem) getItem(holder.getAdapterPosition())) == null) {
            return;
        }
        this.onItemVisible.invoke(listItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListItemsAdapter(Function1<? super T, Unit> function1) {
        super(new ListItemDiffUtils());
        this.onItemVisible = function1;
    }
}
