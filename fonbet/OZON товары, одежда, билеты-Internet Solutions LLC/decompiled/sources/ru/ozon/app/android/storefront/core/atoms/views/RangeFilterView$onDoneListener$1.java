package ru.ozon.app.android.storefront.core.atoms.views;

import android.widget.EditText;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.core.atoms.databinding.ViewAtomFilterRangeBinding;
import ru.ozon.app.android.storefront.core.atoms.views.RangeFilterView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "shouldIgnoreKeyboard", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RangeFilterView$onDoneListener$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ RangeFilterView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RangeFilterView$onDoneListener$1(RangeFilterView rangeFilterView) {
        super(1);
        this.this$0 = rangeFilterView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        RangeFilterView.Data data;
        ViewAtomFilterRangeBinding viewAtomFilterRangeBinding;
        float value;
        ViewAtomFilterRangeBinding viewAtomFilterRangeBinding2;
        float value2;
        data = this.this$0.data;
        if (data != null) {
            RangeFilterView rangeFilterView = this.this$0;
            rangeFilterView.correctValuesIfNeeded();
            InterfaceC6511n<Float, Float, Boolean, Unit> valuesChangeListener = rangeFilterView.getValuesChangeListener();
            if (valuesChangeListener != null) {
                viewAtomFilterRangeBinding = rangeFilterView.binding;
                EditText rangeFromEt = viewAtomFilterRangeBinding.rangeFromEt;
                Intrinsics.checkNotNullExpressionValue(rangeFromEt, "rangeFromEt");
                value = rangeFilterView.getValue(rangeFromEt, data.getMin());
                Float valueOf = Float.valueOf(value);
                viewAtomFilterRangeBinding2 = rangeFilterView.binding;
                EditText rangeToEt = viewAtomFilterRangeBinding2.rangeToEt;
                Intrinsics.checkNotNullExpressionValue(rangeToEt, "rangeToEt");
                value2 = rangeFilterView.getValue(rangeToEt, data.getMax());
                valuesChangeListener.invoke(valueOf, Float.valueOf(value2), Boolean.valueOf(z11));
            }
        }
    }
}
