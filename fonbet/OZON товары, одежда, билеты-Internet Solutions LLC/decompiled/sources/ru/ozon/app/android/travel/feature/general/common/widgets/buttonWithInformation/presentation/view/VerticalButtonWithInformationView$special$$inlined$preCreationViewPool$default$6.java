package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.presentation.view;

import Ef0.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$6 extends AbstractC7737t implements Function1<TextAtomView, Unit> {
    public VerticalButtonWithInformationView$special$$inlined$preCreationViewPool$default$6() {
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
        ConstraintLayout.b b11 = c.b(textAtomView, R$id.verticalButtonWithInformationPriceLabelTextView, -2, -2);
        b11.f41616W = true;
        b11.f41617X = true;
        textAtomView.setLayoutParams(b11);
    }
}
