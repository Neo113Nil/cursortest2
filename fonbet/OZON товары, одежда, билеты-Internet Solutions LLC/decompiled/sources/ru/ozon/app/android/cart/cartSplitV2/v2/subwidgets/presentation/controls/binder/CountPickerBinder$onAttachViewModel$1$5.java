package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.view.CartCountPickerView;
import ru.ozon.app.android.cart.ui.quantityInput.QuantityInput;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "quantity", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CountPickerBinder$onAttachViewModel$1$5 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ CountPickerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountPickerBinder$onAttachViewModel$1$5(CountPickerBinder countPickerBinder) {
        super(1);
        this.this$0 = countPickerBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        CartCountPickerView cartCountPickerView;
        SimpleTextWatcher simpleTextWatcher;
        SimpleTextWatcher simpleTextWatcher2;
        cartCountPickerView = this.this$0.countPickerView;
        QuantityInput inputEt = cartCountPickerView.getInputEt();
        CountPickerBinder countPickerBinder = this.this$0;
        simpleTextWatcher = countPickerBinder.quantityTextWatcher;
        inputEt.removeTextChangedListener(simpleTextWatcher);
        String format = String.format(Locale.getDefault(), "%,d", Arrays.copyOf(new Object[]{num}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String X9 = h.X(format, " ", " ", false);
        inputEt.setText(X9);
        inputEt.setSelection(X9.length());
        simpleTextWatcher2 = countPickerBinder.quantityTextWatcher;
        inputEt.addTextChangedListener(simpleTextWatcher2);
    }
}
