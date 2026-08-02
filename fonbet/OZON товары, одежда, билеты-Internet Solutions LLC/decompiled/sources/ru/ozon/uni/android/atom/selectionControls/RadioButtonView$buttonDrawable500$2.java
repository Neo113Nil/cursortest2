package ru.ozon.uni.android.atom.selectionControls;

import android.content.Context;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.c;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$id;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RadioButtonView$buttonDrawable500$2 extends AbstractC7737t implements Function0<Drawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RadioButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RadioButtonView$buttonDrawable500$2(Context context, RadioButtonView radioButtonView) {
        super(0);
        this.$context = context;
        this.this$0 = radioButtonView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        c transitionCheckedToUnchecked500;
        c transitionUncheckedToChecked500;
        Drawable a11 = C7232a.a(this.$context, R$drawable.radiobutton_selector_500);
        RadioButtonView radioButtonView = this.this$0;
        if ((a11 instanceof AnimatedStateListDrawable) && RadioButtonView.INSTANCE.isAnimationsEnabled()) {
            transitionCheckedToUnchecked500 = radioButtonView.getTransitionCheckedToUnchecked500();
            if (transitionCheckedToUnchecked500 != null) {
                ((AnimatedStateListDrawable) a11).addTransition(R$id.checked, R$id.unchecked, transitionCheckedToUnchecked500, false);
            }
            transitionUncheckedToChecked500 = radioButtonView.getTransitionUncheckedToChecked500();
            if (transitionUncheckedToChecked500 != null) {
                ((AnimatedStateListDrawable) a11).addTransition(R$id.unchecked, R$id.checked, transitionUncheckedToChecked500, false);
            }
        }
        return a11;
    }
}
