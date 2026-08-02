package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import Ef0.c;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$12 extends AbstractC7737t implements Function1<TextAtomView, Unit> {
    final /* synthetic */ TravelPriceDetailInformationV2BonusView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPriceDetailInformationV2BonusView$special$$inlined$preCreationViewPool$default$12(TravelPriceDetailInformationV2BonusView travelPriceDetailInformationV2BonusView) {
        super(1);
        this.this$0 = travelPriceDetailInformationV2BonusView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextAtomView textAtomView) {
        invoke(textAtomView);
        return Unit.f71690a;
    }

    public final void invoke(TextAtomView PreCreationViewPoolDelegate) {
        int i11;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        TextAtomView textAtomView = PreCreationViewPoolDelegate;
        ConstraintLayout.b b11 = c.b(textAtomView, R$id.travelPriceDetailInfoBonusDetailsTitle, -2, -2);
        i11 = this.this$0.dp4;
        b11.setMargins(((ViewGroup.MarginLayoutParams) b11).leftMargin, i11, ((ViewGroup.MarginLayoutParams) b11).rightMargin, ((ViewGroup.MarginLayoutParams) b11).bottomMargin);
        b11.f41616W = true;
        b11.f41598E = 0.0f;
        b11.f41603J = 2;
        textAtomView.setLayoutParams(b11);
        this.this$0.addToLayout(textAtomView);
    }
}
