package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.view;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class PaymentsDetailsView$special$$inlined$preCreationViewPool$default$4 extends AbstractC7737t implements Function1<TextAtomView, Unit> {
    public PaymentsDetailsView$special$$inlined$preCreationViewPool$default$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextAtomView textAtomView) {
        invoke(textAtomView);
        return Unit.f71690a;
    }

    public final void invoke(TextAtomView PreCreationViewPoolDelegate) {
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        TextAtomView textAtomView = PreCreationViewPoolDelegate;
        textAtomView.setId(View.generateViewId());
        textAtomView.setLayoutParams(new ConstraintLayout.b(0, -2));
    }
}
