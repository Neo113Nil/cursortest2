package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.tariff;

import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TariffLineView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ TariffLineView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TariffLineView$setupConstraints$1(TariffLineView tariffLineView) {
        super(1);
        this.this$0 = tariffLineView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        View view;
        View view2;
        TextAtomView tariffLineTitleTav;
        View view3;
        TextAtomView tariffLineTitleTav2;
        TextAtomView tariffLinePriceTav;
        TextAtomView tariffLineTitleTav3;
        View view4;
        TextAtomView tariffLineTitleTav4;
        View view5;
        TextAtomView tariffLinePriceTav2;
        TextAtomView tariffLineTitleTav5;
        TextAtomView tariffLinePriceTav3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        view = this.this$0.tariffLineRadioButtonView;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, view);
        view2 = this.this$0.tariffLineRadioButtonView;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, view2);
        tariffLineTitleTav = this.this$0.getTariffLineTitleTav();
        view3 = this.this$0.tariffLineRadioButtonView;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, tariffLineTitleTav, view3);
        tariffLineTitleTav2 = this.this$0.getTariffLineTitleTav();
        tariffLinePriceTav = this.this$0.getTariffLinePriceTav();
        ConstraintLayoutExtensionsKt.endToStart(updateConstraints, tariffLineTitleTav2, tariffLinePriceTav);
        tariffLineTitleTav3 = this.this$0.getTariffLineTitleTav();
        view4 = this.this$0.tariffLineRadioButtonView;
        ConstraintLayoutExtensionsKt.topToTop(updateConstraints, tariffLineTitleTav3, view4);
        tariffLineTitleTav4 = this.this$0.getTariffLineTitleTav();
        view5 = this.this$0.tariffLineRadioButtonView;
        ConstraintLayoutExtensionsKt.bottomToBottom(updateConstraints, tariffLineTitleTav4, view5);
        tariffLinePriceTav2 = this.this$0.getTariffLinePriceTav();
        tariffLineTitleTav5 = this.this$0.getTariffLineTitleTav();
        ConstraintLayoutExtensionsKt.baselineToBaseline(updateConstraints, tariffLinePriceTav2, tariffLineTitleTav5);
        tariffLinePriceTav3 = this.this$0.getTariffLinePriceTav();
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, tariffLinePriceTav3);
    }
}
