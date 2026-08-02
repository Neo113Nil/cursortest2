package ru.ozon.app.android.partpayment.formpage.view.vh;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddressSelectorFieldVH$adapter$1 extends AbstractC7737t implements Function1<FormPageVO.Field, Unit> {
    final /* synthetic */ AddressSelectorFieldVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressSelectorFieldVH$adapter$1(AddressSelectorFieldVH addressSelectorFieldVH) {
        super(1);
        this.this$0 = addressSelectorFieldVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FormPageVO.Field field) {
        invoke2(field);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FormPageVO.Field value) {
        InterfaceC6511n interfaceC6511n;
        Intrinsics.checkNotNullParameter(value, "value");
        interfaceC6511n = this.this$0.onFieldsChanged;
        interfaceC6511n.invoke(this.this$0, value, Boolean.TRUE);
    }
}
