package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class PriceRowView$special$$inlined$preCreationViewPool$default$2 extends AbstractC7737t implements Function1<IconView, Unit> {
    final /* synthetic */ PriceRowView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRowView$special$$inlined$preCreationViewPool$default$2(PriceRowView priceRowView) {
        super(1);
        this.this$0 = priceRowView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IconView iconView) {
        invoke(iconView);
        return Unit.f71690a;
    }

    public final void invoke(IconView PreCreationViewPoolDelegate) {
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        IconView iconView = PreCreationViewPoolDelegate;
        iconView.setId(R$id.travelPriceDetailInfoPriceRowIcon);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.this$0.addView(iconView);
    }
}
