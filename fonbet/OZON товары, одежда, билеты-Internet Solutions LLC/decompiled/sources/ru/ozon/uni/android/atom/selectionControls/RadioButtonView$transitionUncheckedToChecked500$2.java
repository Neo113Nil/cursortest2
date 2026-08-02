package ru.ozon.uni.android.atom.selectionControls;

import androidx.vectordrawable.graphics.drawable.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$drawable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\t\u0018\u00010\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/vectordrawable/graphics/drawable/c;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "()Landroidx/vectordrawable/graphics/drawable/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class RadioButtonView$transitionUncheckedToChecked500$2 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ RadioButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RadioButtonView$transitionUncheckedToChecked500$2(RadioButtonView radioButtonView) {
        super(0);
        this.this$0 = radioButtonView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        return c.a(R$drawable.radiobutton_unchecked_to_checked_500, this.this$0.getContext());
    }
}
