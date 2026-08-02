package ru.ozon.app.android.checkoutcomposer.paymentschedule;

import Ej.b;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkout.databinding.ItemTotalPriceBinding;
import ru.ozon.app.android.checkoutcomposer.paymentschedule.PaymentScheduleVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/recyclerview/widget/i$d;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/i$d;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentScheduleAdapter extends t<PaymentScheduleVO.PaymentItem, RecyclerView.C> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentScheduleAdapter(@NotNull i.d<PaymentScheduleVO.PaymentItem> diffCallback) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        PaymentScheduleVO.PaymentItem item = getItem(position);
        if (item instanceof PaymentScheduleVO.PaymentItem.Payment) {
            return 0;
        }
        if (item instanceof PaymentScheduleVO.PaymentItem.TotalPrice) {
            return 1;
        }
        if (item instanceof PaymentScheduleVO.PaymentItem.PaymentTotal) {
            return 2;
        }
        throw new IllegalArgumentException(b.a(position, "Illegal item on position: "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof PaymentScheduleAdapterViewHolder) {
            PaymentScheduleVO.PaymentItem item = getItem(position);
            PaymentScheduleVO.PaymentItem.Payment payment = item instanceof PaymentScheduleVO.PaymentItem.Payment ? (PaymentScheduleVO.PaymentItem.Payment) item : null;
            if (payment != null) {
                ((PaymentScheduleAdapterViewHolder) holder).bind(payment);
                return;
            }
            return;
        }
        if (holder instanceof TotalPriceAdapterViewHolder) {
            PaymentScheduleVO.PaymentItem item2 = getItem(position);
            PaymentScheduleVO.PaymentItem.TotalPrice totalPrice = item2 instanceof PaymentScheduleVO.PaymentItem.TotalPrice ? (PaymentScheduleVO.PaymentItem.TotalPrice) item2 : null;
            if (totalPrice != null) {
                ((TotalPriceAdapterViewHolder) holder).bind(totalPrice);
                return;
            }
            return;
        }
        if (holder instanceof TotalAdapterViewHolder) {
            PaymentScheduleVO.PaymentItem item3 = getItem(position);
            PaymentScheduleVO.PaymentItem.PaymentTotal paymentTotal = item3 instanceof PaymentScheduleVO.PaymentItem.PaymentTotal ? (PaymentScheduleVO.PaymentItem.PaymentTotal) item3 : null;
            if (paymentTotal != null) {
                ((TotalAdapterViewHolder) holder).bind(paymentTotal);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemTotalPriceBinding bind = ItemTotalPriceBinding.bind(ViewGroupExtKt.inflate(parent, R$layout.item_total_price));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        if (viewType == 0) {
            return new PaymentScheduleAdapterViewHolder(bind);
        }
        if (viewType == 1) {
            return new TotalPriceAdapterViewHolder(bind);
        }
        if (viewType == 2) {
            return new TotalAdapterViewHolder(bind);
        }
        throw new IllegalArgumentException(b.a(viewType, "No such view type: "));
    }
}
