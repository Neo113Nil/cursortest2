package ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.listAdapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "inputId", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CheckboxInputViewHolder$bind$1 extends AbstractC7737t implements Function2<Long, Boolean, Unit> {
    final /* synthetic */ CheckboxInputViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckboxInputViewHolder$bind$1(CheckboxInputViewHolder checkboxInputViewHolder) {
        super(2);
        this.this$0 = checkboxInputViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Long l11, Boolean bool) {
        invoke(l11.longValue(), bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11, boolean z11) {
        Function2 function2;
        function2 = this.this$0.onCheckboxChanged;
        if (function2 != null) {
            function2.invoke(Long.valueOf(j11), Boolean.valueOf(z11));
        }
    }
}
