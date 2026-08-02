package ru.ozon.app.android.account.orders.orderfilters.presentation;

import EE.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderfilters.presentation.OrderFiltersVO;
import ru.ozon.app.android.cs_orders.databinding.WidgetOrderFiltersYearBinding;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\n\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00052\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/account/orders/orderfilters/presentation/YearsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/account/orders/orderfilters/presentation/YearsAdapter$YearVH;", "Lkotlin/Function1;", "Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO$YearVO;", "", "onYearClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/account/orders/orderfilters/presentation/YearsAdapter$YearVH;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/account/orders/orderfilters/presentation/YearsAdapter$YearVH;I)V", "Lkotlin/jvm/functions/Function1;", "", "_years", "Ljava/util/List;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getYears", "()Ljava/util/List;", "setYears", "(Ljava/util/List;)V", "years", "YearVH", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YearsAdapter extends RecyclerView.g<YearVH> {

    @NotNull
    private List<OrderFiltersVO.YearVO> _years;

    @NotNull
    private final Function1<OrderFiltersVO.YearVO, Unit> onYearClick;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/orderfilters/presentation/YearsAdapter$YearVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/cs_orders/databinding/WidgetOrderFiltersYearBinding;", "binding", "<init>", "(Lru/ozon/app/android/account/orders/orderfilters/presentation/YearsAdapter;Lru/ozon/app/android/cs_orders/databinding/WidgetOrderFiltersYearBinding;)V", "Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO$YearVO;", "year", "", "bind", "(Lru/ozon/app/android/account/orders/orderfilters/presentation/OrderFiltersVO$YearVO;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetOrderFiltersYearBinding;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class YearVH extends RecyclerView.C {

        @NotNull
        private final WidgetOrderFiltersYearBinding binding;
        final /* synthetic */ YearsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YearVH(@NotNull YearsAdapter yearsAdapter, WidgetOrderFiltersYearBinding binding) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = yearsAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$1$lambda$0(YearsAdapter yearsAdapter, OrderFiltersVO.YearVO yearVO, View view) {
            yearsAdapter.onYearClick.invoke(yearVO);
        }

        public final void bind(@NotNull OrderFiltersVO.YearVO year) {
            Intrinsics.checkNotNullParameter(year, "year");
            TextView textView = this.binding.yearTv;
            YearsAdapter yearsAdapter = this.this$0;
            textView.setText(year.getName());
            textView.setSelected(year.getIsSelected());
            textView.setOnClickListener(new a(4, yearsAdapter, year));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YearsAdapter(@NotNull Function1<? super OrderFiltersVO.YearVO, Unit> onYearClick) {
        Intrinsics.checkNotNullParameter(onYearClick, "onYearClick");
        this.onYearClick = onYearClick;
        this._years = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return getYears().size();
    }

    @NotNull
    public final List<OrderFiltersVO.YearVO> getYears() {
        return this._years;
    }

    public final void setYears(@NotNull List<OrderFiltersVO.YearVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._years = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull YearVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(getYears().get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public YearVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetOrderFiltersYearBinding inflate = WidgetOrderFiltersYearBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new YearVH(this, inflate);
    }
}
