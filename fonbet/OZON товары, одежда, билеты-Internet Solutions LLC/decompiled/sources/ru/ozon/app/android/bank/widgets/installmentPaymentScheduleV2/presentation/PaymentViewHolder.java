package ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.databinding.WidgetInstallmentPaymentScheduleItemBinding;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation.InstallmentPaymentScheduleVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/PaymentViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/bank/databinding/WidgetInstallmentPaymentScheduleItemBinding;", "binding", "<init>", "(Lru/ozon/app/android/bank/databinding/WidgetInstallmentPaymentScheduleItemBinding;)V", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleVO$PaymentVO;", "item", "", "bind", "(Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleVO$PaymentVO;)Lkotlin/Unit;", "Lru/ozon/app/android/bank/databinding/WidgetInstallmentPaymentScheduleItemBinding;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentViewHolder extends j {

    @NotNull
    private final WidgetInstallmentPaymentScheduleItemBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentViewHolder(@NotNull WidgetInstallmentPaymentScheduleItemBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    public final Unit bind(@NotNull InstallmentPaymentScheduleVO.PaymentVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetInstallmentPaymentScheduleItemBinding widgetInstallmentPaymentScheduleItemBinding = this.binding;
        TextAtomV2View date = widgetInstallmentPaymentScheduleItemBinding.date;
        Intrinsics.checkNotNullExpressionValue(date, "date");
        TextHolderKt.bind$default(date, item.getDate(), null, 2, null);
        TextAtomV2View amount = widgetInstallmentPaymentScheduleItemBinding.amount;
        Intrinsics.checkNotNullExpressionValue(amount, "amount");
        TextHolderKt.bind$default(amount, item.getAmount(), null, 2, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = widgetInstallmentPaymentScheduleItemBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor == null) {
            return null;
        }
        int intValue = parseColor.intValue();
        ConstraintLayout constraintLayout = widgetInstallmentPaymentScheduleItemBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.setBackgroundTint(constraintLayout, intValue);
        return Unit.f71690a;
    }
}
