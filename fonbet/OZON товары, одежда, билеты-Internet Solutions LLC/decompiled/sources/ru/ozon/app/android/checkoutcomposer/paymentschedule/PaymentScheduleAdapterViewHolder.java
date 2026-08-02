package ru.ozon.app.android.checkoutcomposer.paymentschedule;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.databinding.ItemTotalPriceBinding;
import ru.ozon.app.android.checkoutcomposer.paymentschedule.PaymentScheduleVO;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleAdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkout/databinding/ItemTotalPriceBinding;", "binding", "<init>", "(Lru/ozon/app/android/checkout/databinding/ItemTotalPriceBinding;)V", "Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$Payment;", "item", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/paymentschedule/PaymentScheduleVO$PaymentItem$Payment;)V", "Lru/ozon/app/android/checkout/databinding/ItemTotalPriceBinding;", "getBinding", "()Lru/ozon/app/android/checkout/databinding/ItemTotalPriceBinding;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentScheduleAdapterViewHolder extends RecyclerView.C {

    @NotNull
    private final ItemTotalPriceBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentScheduleAdapterViewHolder(@NotNull ItemTotalPriceBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bind(@NotNull PaymentScheduleVO.PaymentItem.Payment item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemTotalPriceBinding itemTotalPriceBinding = this.binding;
        TextAtomView paymentTotalTv = itemTotalPriceBinding.paymentTotalTv;
        Intrinsics.checkNotNullExpressionValue(paymentTotalTv, "paymentTotalTv");
        TextViewExtKt.setTextOrGone(paymentTotalTv, item.getDate());
        TextAtomView paymentTotalSubtitleTv = itemTotalPriceBinding.paymentTotalSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(paymentTotalSubtitleTv, "paymentTotalSubtitleTv");
        ViewExtKt.gone(paymentTotalSubtitleTv);
        TextAtomView paymentTotalAmountTv = itemTotalPriceBinding.paymentTotalAmountTv;
        Intrinsics.checkNotNullExpressionValue(paymentTotalAmountTv, "paymentTotalAmountTv");
        TextViewExtKt.setTextOrGone(paymentTotalAmountTv, item.getAmount());
    }
}
