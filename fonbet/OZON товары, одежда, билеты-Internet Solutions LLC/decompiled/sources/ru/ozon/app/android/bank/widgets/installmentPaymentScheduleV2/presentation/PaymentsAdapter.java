package ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import jk0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.databinding.WidgetInstallmentPaymentScheduleItemBinding;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation.InstallmentPaymentScheduleVO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/PaymentsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleVO$PaymentVO;", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/PaymentViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/J;)V", "holder", "", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/PaymentViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/PaymentViewHolder;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentsAdapter extends i<InstallmentPaymentScheduleVO.PaymentVO, PaymentViewHolder> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsAdapter(@NotNull J lifecycleOwner) {
        super(new i.d<InstallmentPaymentScheduleVO.PaymentVO>() { // from class: ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation.PaymentsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(InstallmentPaymentScheduleVO.PaymentVO oldItem, InstallmentPaymentScheduleVO.PaymentVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(InstallmentPaymentScheduleVO.PaymentVO oldItem, InstallmentPaymentScheduleVO.PaymentVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PaymentViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        InstallmentPaymentScheduleVO.PaymentVO item = getItem(position);
        Intrinsics.f(item);
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PaymentViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetInstallmentPaymentScheduleItemBinding inflate = WidgetInstallmentPaymentScheduleItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new PaymentViewHolder(inflate);
    }
}
