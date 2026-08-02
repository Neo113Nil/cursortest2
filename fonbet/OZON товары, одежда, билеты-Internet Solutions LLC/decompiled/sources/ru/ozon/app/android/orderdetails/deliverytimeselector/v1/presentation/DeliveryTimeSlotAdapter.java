package ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation;

import Bk0.a;
import Ve.C4636t5;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.R$layout;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotViewHolder;", "Lkotlin/Function1;", "", "", "clickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotViewHolder;I)V", "", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotVO;", "list", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "", "Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryTimeSlotAdapter extends RecyclerView.g<DeliveryTimeSlotViewHolder> {

    @NotNull
    private final Function1<String, Unit> clickListener;

    @NotNull
    private final List<DeliveryTimeSlotVO> list;

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryTimeSlotAdapter(@NotNull Function1<? super String, Unit> clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.clickListener = clickListener;
        this.list = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$3$lambda$2(DeliveryTimeSlotViewHolder deliveryTimeSlotViewHolder, DeliveryTimeSlotAdapter deliveryTimeSlotAdapter, View view) {
        Integer valueOf = Integer.valueOf(deliveryTimeSlotViewHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            deliveryTimeSlotAdapter.clickListener.invoke(deliveryTimeSlotAdapter.list.get(valueOf.intValue()).getDeeplink());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public DeliveryTimeSlotViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View inflate = C4636t5.a(parent, "parent").inflate(R$layout.item_time_slot, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        DeliveryTimeSlotViewHolder deliveryTimeSlotViewHolder = new DeliveryTimeSlotViewHolder(inflate);
        deliveryTimeSlotViewHolder.itemView.setOnClickListener(new a(3, deliveryTimeSlotViewHolder, this));
        return deliveryTimeSlotViewHolder;
    }

    public final void submitList(@NotNull List<DeliveryTimeSlotVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        i.c a11 = i.a(new DiffUtilDeliveryTimeSlot(list, this.list), true);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.list.clear();
        this.list.addAll(list);
        a11.c(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull DeliveryTimeSlotViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.list.get(position), (List<? extends Object>) K.f71697a);
    }
}
