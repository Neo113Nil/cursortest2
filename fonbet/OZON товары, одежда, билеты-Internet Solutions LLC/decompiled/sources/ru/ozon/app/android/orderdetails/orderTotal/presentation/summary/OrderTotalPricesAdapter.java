package ru.ozon.app.android.orderdetails.orderTotal.presentation.summary;

import Ej.b;
import Ve.C4636t5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderTotalFooterPriceBinding;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderTotalPriceBinding;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\f\b\u0001\u0018\u0000 !2\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001:\u0004!\"#$B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00062\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter$AbstractViewHolder;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/AbstractPriceBlockVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter$AbstractViewHolder;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter$AbstractViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "prices", "Ljava/util/List;", "getPrices", "()Ljava/util/List;", "setPrices", "(Ljava/util/List;)V", "Companion", "AbstractViewHolder", "ViewHolder", "FooterViewHolder", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTotalPricesAdapter extends RecyclerView.g<AbstractViewHolder<? extends AbstractPriceBlockVO>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private List<? extends AbstractPriceBlockVO> prices;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter$AbstractViewHolder;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/AbstractPriceBlockVO;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AbstractViewHolder<T extends AbstractPriceBlockVO> extends RecyclerView.C {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractViewHolder(@NotNull View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter$FooterViewHolder;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter$AbstractViewHolder;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/FooterPriceBlockVO;", "binding", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderTotalFooterPriceBinding;", "<init>", "(Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter;Lru/ozon/app/android/orderdetails/databinding/ItemOrderTotalFooterPriceBinding;)V", "bind", "", "item", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class FooterViewHolder extends AbstractViewHolder<FooterPriceBlockVO> {

        @NotNull
        private final ItemOrderTotalFooterPriceBinding binding;
        final /* synthetic */ OrderTotalPricesAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public FooterViewHolder(@NotNull OrderTotalPricesAdapter orderTotalPricesAdapter, ItemOrderTotalFooterPriceBinding binding) {
            super(r2);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = orderTotalPricesAdapter;
            ConstraintLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
        }

        public void bind(@NotNull FooterPriceBlockVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemOrderTotalFooterPriceBinding itemOrderTotalFooterPriceBinding = this.binding;
            itemOrderTotalFooterPriceBinding.orderPriceTitleTv.setText(item.getTitle());
            PriceView orderPriceTitlePV = itemOrderTotalFooterPriceBinding.orderPriceTitlePV;
            Intrinsics.checkNotNullExpressionValue(orderPriceTitlePV, "orderPriceTitlePV");
            PriceHolderKt.bindOrGone$default(orderPriceTitlePV, item.getPrice(), null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter$ViewHolder;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter$AbstractViewHolder;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/PriceBlockVO;", "binding", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderTotalPriceBinding;", "<init>", "(Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter;Lru/ozon/app/android/orderdetails/databinding/ItemOrderTotalPriceBinding;)V", "bind", "", "item", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ViewHolder extends AbstractViewHolder<PriceBlockVO> {

        @NotNull
        private final ItemOrderTotalPriceBinding binding;
        final /* synthetic */ OrderTotalPricesAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ViewHolder(@NotNull OrderTotalPricesAdapter orderTotalPricesAdapter, ItemOrderTotalPriceBinding binding) {
            super(r2);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = orderTotalPricesAdapter;
            ConstraintLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
        }

        public void bind(@NotNull PriceBlockVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemOrderTotalPriceBinding itemOrderTotalPriceBinding = this.binding;
            OrderTotalPricesAdapter orderTotalPricesAdapter = this.this$0;
            itemOrderTotalPriceBinding.orderPriceTitleTv.setText(item.getTitle());
            PriceAtomView orderPriceTitleUikit = itemOrderTotalPriceBinding.orderPriceTitleUikit;
            Intrinsics.checkNotNullExpressionValue(orderPriceTitleUikit, "orderPriceTitleUikit");
            PriceAtomHolderKt.bindOrGone$default(orderPriceTitleUikit, item.getAtomPrice(), null, 2, null);
            PriceView orderPriceTitlePV = itemOrderTotalPriceBinding.orderPriceTitlePV;
            Intrinsics.checkNotNullExpressionValue(orderPriceTitlePV, "orderPriceTitlePV");
            orderPriceTitlePV.setVisibility(item.getAtomPrice() == null ? 0 : 8);
            PriceView orderPriceTitlePV2 = itemOrderTotalPriceBinding.orderPriceTitlePV;
            Intrinsics.checkNotNullExpressionValue(orderPriceTitlePV2, "orderPriceTitlePV");
            PriceHolderKt.bindOrGone$default(orderPriceTitlePV2, item.getPrice(), null, 2, null);
            PriceView priceView = itemOrderTotalPriceBinding.orderPriceTitlePV;
            int i11 = R$style.TextStyle_Body_L;
            priceView.applyStyles(i11, i11);
            ButtonV3View orderPriceBtn = itemOrderTotalPriceBinding.orderPriceBtn;
            Intrinsics.checkNotNullExpressionValue(orderPriceBtn, "orderPriceBtn");
            ButtonV3HolderKt.bindOrGone(orderPriceBtn, item.getButton(), orderTotalPricesAdapter.actionHandler);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderTotalPricesAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.prices = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.prices.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AbstractPriceBlockVO abstractPriceBlockVO = this.prices.get(position);
        if (abstractPriceBlockVO instanceof PriceBlockVO) {
            return 0;
        }
        if (abstractPriceBlockVO instanceof FooterPriceBlockVO) {
            return 1;
        }
        throw new IllegalArgumentException(b.a(position, "incorrect type = "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AbstractViewHolder<? extends AbstractPriceBlockVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == 0) {
            ItemOrderTotalPriceBinding inflate = ItemOrderTotalPriceBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new ViewHolder(this, inflate);
        }
        ItemOrderTotalFooterPriceBinding inflate2 = ItemOrderTotalFooterPriceBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
        return new FooterViewHolder(this, inflate2);
    }

    public final void setPrices(@NotNull List<? extends AbstractPriceBlockVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.prices = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AbstractViewHolder<? extends AbstractPriceBlockVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AbstractPriceBlockVO abstractPriceBlockVO = this.prices.get(position);
        if (holder instanceof ViewHolder) {
            ViewHolder viewHolder = (ViewHolder) holder;
            PriceBlockVO priceBlockVO = abstractPriceBlockVO instanceof PriceBlockVO ? (PriceBlockVO) abstractPriceBlockVO : null;
            if (priceBlockVO == null) {
                return;
            }
            viewHolder.bind(priceBlockVO);
            return;
        }
        if (holder instanceof FooterViewHolder) {
            FooterViewHolder footerViewHolder = (FooterViewHolder) holder;
            FooterPriceBlockVO footerPriceBlockVO = abstractPriceBlockVO instanceof FooterPriceBlockVO ? (FooterPriceBlockVO) abstractPriceBlockVO : null;
            if (footerPriceBlockVO == null) {
                return;
            }
            footerViewHolder.bind(footerPriceBlockVO);
        }
    }
}
