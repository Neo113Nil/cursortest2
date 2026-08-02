package ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.view.perfVersion;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$8 extends AbstractC7737t implements Function1<SmallButtonView, Unit> {
    public PaymentsDetailsPerfView$special$$inlined$preCreationViewPool$default$8() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SmallButtonView smallButtonView) {
        invoke(smallButtonView);
        return Unit.f71690a;
    }

    public final void invoke(SmallButtonView PreCreationViewPoolDelegate) {
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        SmallButtonView smallButtonView = PreCreationViewPoolDelegate;
        smallButtonView.setId(View.generateViewId());
        smallButtonView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        smallButtonView.setVisibility(8);
    }
}
