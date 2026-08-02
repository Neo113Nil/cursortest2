package ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting.items;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting.PostingVO;
import ru.ozon.app.android.returns.cancels.databinding.WidgetCancelPostingsV2ItemBinding;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/items/ItemsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/PostingVO$ItemVO;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/items/ItemViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/items/ItemViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/items/ItemViewHolder;I)V", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ItemsAdapter extends t<PostingVO.ItemVO, ItemViewHolder> {
    public ItemsAdapter() {
        super(new ItemDiffCallback());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        PostingVO.ItemVO itemVO = getCurrentList().get(position);
        Intrinsics.checkNotNullExpressionValue(itemVO, "get(...)");
        holder.bind(itemVO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetCancelPostingsV2ItemBinding inflate = WidgetCancelPostingsV2ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ItemViewHolder(inflate);
    }
}
