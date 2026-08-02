package ru.ozon.app.android.rfbs.deliverycomplain.presentation;

import B0.C2454a;
import android.text.Editable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cs_orders.databinding.WidgetDeliveryComplainBinding;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.models.SendComplainParams;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DeliveryComplainWidgetHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ ComplainViewModel $viewModel;
    final /* synthetic */ DeliveryComplainWidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryComplainWidgetHolder$actionHandler$1(DeliveryComplainWidgetHolder deliveryComplainWidgetHolder, ComplainViewModel complainViewModel) {
        super(1);
        this.this$0 = deliveryComplainWidgetHolder;
        this.$viewModel = complainViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        WidgetDeliveryComplainBinding widgetDeliveryComplainBinding;
        String str;
        Map b11;
        Intrinsics.checkNotNullParameter(it, "it");
        widgetDeliveryComplainBinding = this.this$0.binding;
        Editable text = widgetDeliveryComplainBinding.enterStateInclude.complainInput.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        Map<String, String> params = it.getParams();
        if (params != null) {
            b11 = U.u(params);
            b11.put("complain", str);
        } else {
            b11 = C2454a.b("complain", str);
        }
        this.$viewModel.sendComplain(new SendComplainParams(it.getActionName(), b11));
    }
}
