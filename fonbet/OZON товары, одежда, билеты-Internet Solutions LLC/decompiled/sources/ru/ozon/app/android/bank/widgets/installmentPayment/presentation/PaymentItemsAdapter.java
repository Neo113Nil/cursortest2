package ru.ozon.app.android.bank.widgets.installmentPayment.presentation;

import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.R$layout;
import ru.ozon.app.android.bank.widgets.installmentPayment.presentation.InstallmentPaymentVO;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleListAdapter;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/PaymentItemsAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleListAdapter;", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$PaymentVO;", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/PaymentVH;", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/PaymentVH;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/PaymentVH;I)V", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentItemsAdapter extends LifecycleListAdapter<InstallmentPaymentVO.PaymentVO, PaymentVH> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentItemsAdapter(@NotNull J lifecycleOwner) {
        super(new i.d<InstallmentPaymentVO.PaymentVO>() { // from class: ru.ozon.app.android.bank.widgets.installmentPayment.presentation.PaymentItemsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(InstallmentPaymentVO.PaymentVO oldItem, InstallmentPaymentVO.PaymentVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(InstallmentPaymentVO.PaymentVO oldItem, InstallmentPaymentVO.PaymentVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PaymentVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        InstallmentPaymentVO.PaymentVO item = getItem(position);
        Intrinsics.f(item);
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PaymentVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new PaymentVH(ViewGroupExtKt.inflate(parent, R$layout.widget_installment_payment_item));
    }
}
