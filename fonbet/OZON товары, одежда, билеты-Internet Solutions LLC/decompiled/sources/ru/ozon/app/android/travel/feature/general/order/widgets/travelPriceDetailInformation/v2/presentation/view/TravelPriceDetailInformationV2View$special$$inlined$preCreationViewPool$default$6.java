package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2View$special$$inlined$preCreationViewPool$default$6 extends AbstractC7737t implements Function1<SingleAtom, Unit> {
    final /* synthetic */ TravelPriceDetailInformationV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPriceDetailInformationV2View$special$$inlined$preCreationViewPool$default$6(TravelPriceDetailInformationV2View travelPriceDetailInformationV2View) {
        super(1);
        this.this$0 = travelPriceDetailInformationV2View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SingleAtom singleAtom) {
        invoke(singleAtom);
        return Unit.f71690a;
    }

    public final void invoke(SingleAtom PreCreationViewPoolDelegate) {
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        SingleAtom singleAtom = PreCreationViewPoolDelegate;
        singleAtom.setId(R$id.travelPriceDetailInfoButton);
        singleAtom.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.this$0.addToLayout(singleAtom);
    }
}
