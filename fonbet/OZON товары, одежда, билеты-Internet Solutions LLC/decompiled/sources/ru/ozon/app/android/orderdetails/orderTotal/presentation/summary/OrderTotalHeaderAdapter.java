package ru.ozon.app.android.orderdetails.orderTotal.presentation.summary;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderTotalHeaderBinding;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalHeaderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalHeaderAdapter$ViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalHeaderAdapter$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalHeaderAdapter$ViewHolder;I)V", "", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/LineVO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "lines", "Ljava/util/List;", "getLines", "()Ljava/util/List;", "setLines", "(Ljava/util/List;)V", "ViewHolder", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTotalHeaderAdapter extends RecyclerView.g<ViewHolder> {

    @NotNull
    private List<LineVO> lines = K.f71697a;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalHeaderAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderTotalHeaderBinding;", "binding", "<init>", "(Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalHeaderAdapter;Lru/ozon/app/android/orderdetails/databinding/ItemOrderTotalHeaderBinding;)V", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/LineVO;", "item", "", "bind", "(Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/LineVO;)V", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderTotalHeaderBinding;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ViewHolder extends RecyclerView.C {

        @NotNull
        private final ItemOrderTotalHeaderBinding binding;
        final /* synthetic */ OrderTotalHeaderAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OrderTotalHeaderAdapter orderTotalHeaderAdapter, ItemOrderTotalHeaderBinding binding) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = orderTotalHeaderAdapter;
            this.binding = binding;
        }

        public final void bind(@NotNull LineVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemOrderTotalHeaderBinding itemOrderTotalHeaderBinding = this.binding;
            itemOrderTotalHeaderBinding.orderHeaderTitleTv.setText(item.getTitle());
            TextView orderHeaderValueTv = itemOrderTotalHeaderBinding.orderHeaderValueTv;
            Intrinsics.checkNotNullExpressionValue(orderHeaderValueTv, "orderHeaderValueTv");
            TextViewExtKt.setTextOrGone(orderHeaderValueTv, item.getPrice());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.lines.size();
    }

    public final void setLines(@NotNull List<LineVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.lines = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.lines.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOrderTotalHeaderBinding inflate = ItemOrderTotalHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ViewHolder(this, inflate);
    }
}
