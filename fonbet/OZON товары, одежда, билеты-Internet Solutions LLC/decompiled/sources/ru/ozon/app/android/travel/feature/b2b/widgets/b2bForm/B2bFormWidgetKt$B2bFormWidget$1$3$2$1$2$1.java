package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.di.B2bFormComponent;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "key", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class B2bFormWidgetKt$B2bFormWidget$1$3$2$1$2$1 extends AbstractC7737t implements Function2<String, String, Unit> {
    final /* synthetic */ B2bFormComponent $component;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bFormWidgetKt$B2bFormWidget$1$3$2$1$2$1(B2bFormComponent b2bFormComponent) {
        super(2);
        this.$component = b2bFormComponent;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.$component.getFormStateHolder().updateValue(key, value);
    }
}
