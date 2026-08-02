package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetInsurancePanelBinding;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newHeight", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class InsurancePanelWidgetViewHolder$1$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ InsurancePanelWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsurancePanelWidgetViewHolder$1$1(InsurancePanelWidgetViewHolder insurancePanelWidgetViewHolder) {
        super(1);
        this.this$0 = insurancePanelWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        WidgetInsurancePanelBinding widgetInsurancePanelBinding;
        widgetInsurancePanelBinding = this.this$0.binding;
        RecyclerView insurancesRV = widgetInsurancePanelBinding.insurancesRV;
        Intrinsics.checkNotNullExpressionValue(insurancesRV, "insurancesRV");
        ViewGroup.LayoutParams layoutParams = insurancesRV.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        insurancesRV.setLayoutParams(layoutParams);
    }
}
