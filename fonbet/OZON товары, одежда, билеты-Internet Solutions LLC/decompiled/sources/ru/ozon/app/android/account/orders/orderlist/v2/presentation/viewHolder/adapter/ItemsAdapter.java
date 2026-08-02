package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter.ItemsAdapter;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.ProductVO;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.ItemOrderListItemAtomBinding;
import ru.ozon.app.android.cscore.adultimage.DeliveryAdultImageView;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/ItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProductVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;I)V", "getItemCount", "()I", "", "list", "setItems", "(Ljava/util/List;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "", "items", "Ljava/util/List;", "ItemViewHolder", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemsAdapter extends RecyclerView.g<BaseViewHolder<? super ProductVO>> {

    @NotNull
    private final List<ProductVO> items;

    @NotNull
    private final ComposerReferences ref;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/ItemsAdapter$ItemViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProductVO;", "Lru/ozon/app/android/cs_orders/databinding/ItemOrderListItemAtomBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/ItemOrderListItemAtomBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "", "payloads", "", "bind", "(Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProductVO;Ljava/util/List;)V", "Lru/ozon/app/android/cs_orders/databinding/ItemOrderListItemAtomBinding;", "", "deeplink", "Ljava/lang/String;", "getDeeplink", "()Ljava/lang/String;", "setDeeplink", "(Ljava/lang/String;)V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ItemViewHolder extends BaseViewHolder<ProductVO> {

        @NotNull
        private final ItemOrderListItemAtomBinding binding;
        private String deeplink;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ItemViewHolder(@NotNull ItemOrderListItemAtomBinding binding, @NotNull final ComposerReferences ref) {
            super(r0);
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(ref, "ref");
            DeliveryAdultImageView constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
            binding.itemIv.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemsAdapter.ItemViewHolder._init_$lambda$1(ItemsAdapter.ItemViewHolder.this, ref, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(ItemViewHolder itemViewHolder, ComposerReferences composerReferences, View view) {
            String str = itemViewHolder.deeplink;
            if (str != null) {
                ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences.getNavigator(), str, null, 2, null);
            }
        }

        @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
        public /* bridge */ /* synthetic */ void bind(ProductVO productVO, List list) {
            bind2(productVO, (List<? extends Object>) list);
        }

        /* renamed from: bind, reason: avoid collision after fix types in other method */
        public void bind2(@NotNull ProductVO item, @NotNull List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            ItemOrderListItemAtomBinding itemOrderListItemAtomBinding = this.binding;
            this.deeplink = item.getDeeplink();
            DeliveryAdultImageView.bind$default(itemOrderListItemAtomBinding.itemIv, item.getImage(), item.getIsAdult(), null, 4, null);
        }
    }

    public ItemsAdapter(@NotNull ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.ref = ref;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    public final void setItems(@NotNull List<ProductVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.items.clear();
        this.items.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseViewHolder<? super ProductVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), K.f71697a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseViewHolder<? super ProductVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOrderListItemAtomBinding inflate = ItemOrderListItemAtomBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ItemViewHolder(inflate, this.ref);
    }
}
