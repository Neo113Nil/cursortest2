package ru.ozon.uni.ozi.components.inputs.presets;

import K1.C3422b;
import androidx.compose.ui.platform.I0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziInputDefaults$addToClipboard$2$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ I0 $clipboardManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziInputDefaults$addToClipboard$2$1(I0 i02, Function0<Unit> function0) {
        super(1);
        this.$clipboardManager = i02;
        this.$callback = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.$clipboardManager.c(new C3422b(6, value, null));
        this.$callback.invoke();
    }
}
