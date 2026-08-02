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

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CheckBoxView$buttonDrawable500$2 extends AbstractC7737t implements Function0<Drawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CheckBoxView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckBoxView$buttonDrawable500$2(Context context, CheckBoxView checkBoxView) {
        super(0);
        this.$context = context;
        this.this$0 = checkBoxView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        c transitionCheckedToUnchecked500;
        c transitionUncheckedToChecked500;
        c transitionIndeterminateToUnchecked500;
        c transitionUncheckedToIndeterminate500;
        c transitionCheckedToIndeterminate500;
        c transitionIndeterminateToChecked500;
        Drawable a11 = C7232a.a(this.$context, R$drawable.checkbox_selector_500);
        Drawable mutate = a11 != null ? a11.mutate() : null;
        CheckBoxView checkBoxView = this.this$0;
        if ((mutate instanceof AnimatedStateListDrawable) && CheckBoxView.INSTANCE.isAnimationsEnabled()) {
            transitionCheckedToUnchecked500 = checkBoxView.getTransitionCheckedToUnchecked500();
            if (transitionCheckedToUnchecked500 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.checked, R$id.unchecked, transitionCheckedToUnchecked500, false);
            }
            transitionUncheckedToChecked500 = checkBoxView.getTransitionUncheckedToChecked500();
            if (transitionUncheckedToChecked500 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.unchecked, R$id.checked, transitionUncheckedToChecked500, false);
            }
            transitionIndeterminateToUnchecked500 = checkBoxView.getTransitionIndeterminateToUnchecked500();
            if (transitionIndeterminateToUnchecked500 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.indeterminate, R$id.unchecked, transitionIndeterminateToUnchecked500, false);
            }
            transitionUncheckedToIndeterminate500 = checkBoxView.getTransitionUncheckedToIndeterminate500();
            if (transitionUncheckedToIndeterminate500 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.unchecked, R$id.indeterminate, transitionUncheckedToIndeterminate500, false);
            }
            transitionCheckedToIndeterminate500 = checkBoxView.getTransitionCheckedToIndeterminate500();
            if (transitionCheckedToIndeterminate500 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.checked, R$id.indeterminate, transitionCheckedToIndeterminate500, false);
            }
            transitionIndeterminateToChecked500 = checkBoxView.getTransitionIndeterminateToChecked500();
            if (transitionIndeterminateToChecked500 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.indeterminate, R$id.checked, transitionIndeterminateToChecked500, false);
            }
        }
        return mutate;
    }
}
