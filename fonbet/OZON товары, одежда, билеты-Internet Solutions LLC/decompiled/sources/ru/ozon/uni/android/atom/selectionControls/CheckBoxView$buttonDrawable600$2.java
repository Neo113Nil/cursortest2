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
final class CheckBoxView$buttonDrawable600$2 extends AbstractC7737t implements Function0<Drawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CheckBoxView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckBoxView$buttonDrawable600$2(Context context, CheckBoxView checkBoxView) {
        super(0);
        this.$context = context;
        this.this$0 = checkBoxView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        c transitionCheckedToUnchecked600;
        c transitionUncheckedToChecked600;
        c transitionIndeterminateToUnchecked600;
        c transitionUncheckedToIndeterminate600;
        c transitionCheckedToIndeterminate600;
        c transitionIndeterminateToChecked600;
        Drawable a11 = C7232a.a(this.$context, R$drawable.checkbox_selector_600);
        Drawable mutate = a11 != null ? a11.mutate() : null;
        CheckBoxView checkBoxView = this.this$0;
        if ((mutate instanceof AnimatedStateListDrawable) && CheckBoxView.INSTANCE.isAnimationsEnabled()) {
            transitionCheckedToUnchecked600 = checkBoxView.getTransitionCheckedToUnchecked600();
            if (transitionCheckedToUnchecked600 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.checked, R$id.unchecked, transitionCheckedToUnchecked600, false);
            }
            transitionUncheckedToChecked600 = checkBoxView.getTransitionUncheckedToChecked600();
            if (transitionUncheckedToChecked600 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.unchecked, R$id.checked, transitionUncheckedToChecked600, false);
            }
            transitionIndeterminateToUnchecked600 = checkBoxView.getTransitionIndeterminateToUnchecked600();
            if (transitionIndeterminateToUnchecked600 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.indeterminate, R$id.unchecked, transitionIndeterminateToUnchecked600, false);
            }
            transitionUncheckedToIndeterminate600 = checkBoxView.getTransitionUncheckedToIndeterminate600();
            if (transitionUncheckedToIndeterminate600 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.unchecked, R$id.indeterminate, transitionUncheckedToIndeterminate600, false);
            }
            transitionCheckedToIndeterminate600 = checkBoxView.getTransitionCheckedToIndeterminate600();
            if (transitionCheckedToIndeterminate600 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.checked, R$id.indeterminate, transitionCheckedToIndeterminate600, false);
            }
            transitionIndeterminateToChecked600 = checkBoxView.getTransitionIndeterminateToChecked600();
            if (transitionIndeterminateToChecked600 != null) {
                ((AnimatedStateListDrawable) mutate).addTransition(R$id.indeterminate, R$id.checked, transitionIndeterminateToChecked600, false);
            }
        }
        return mutate;
    }
}
