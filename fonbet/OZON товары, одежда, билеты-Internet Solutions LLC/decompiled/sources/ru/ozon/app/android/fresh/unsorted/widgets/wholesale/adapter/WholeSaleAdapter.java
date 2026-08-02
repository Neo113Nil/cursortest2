package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.Map;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.app.android.fresh.unsorted.databinding.LayoutWholesaleItemBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.WholeSaleVO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BK\u00122\u0010\t\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR@\u0010\t\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/adapter/WholeSaleAdapter;", "Ljk0/i;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleVO$Cell;", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/adapter/WholeSaleItemViewHolder;", "Lkotlin/Function2;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "", "addToCartAction", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/adapter/WholeSaleDiffUtil;", "diffUtil", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/adapter/WholeSaleDiffUtil;Landroidx/lifecycle/J;)V", "holder", "", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/adapter/WholeSaleItemViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/adapter/WholeSaleItemViewHolder;", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function2;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WholeSaleAdapter extends i<WholeSaleVO.Cell, WholeSaleItemViewHolder> {

    @NotNull
    private final Function2<Map<String, String>, Map<String, TokenizedTrackingInfo>, Unit> addToCartAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WholeSaleAdapter(@NotNull Function2<? super Map<String, String>, ? super Map<String, TokenizedTrackingInfo>, Unit> addToCartAction, @NotNull WholeSaleDiffUtil diffUtil, @NotNull J lifecycleOwner) {
        super(diffUtil, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(addToCartAction, "addToCartAction");
        Intrinsics.checkNotNullParameter(diffUtil, "diffUtil");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.addToCartAction = addToCartAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$layout.layout_wholesale_item;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull WholeSaleItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        WholeSaleVO.Cell item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public WholeSaleItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutWholesaleItemBinding inflate = LayoutWholesaleItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new WholeSaleItemViewHolder(inflate, this.addToCartAction);
    }
}
