package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isFocused", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WholeSaleModalComposableKt$WholeSaleInput$4$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ InterfaceC3978p0<String> $inputText$delegate;
    final /* synthetic */ Function2<String, Boolean, Unit> $onInputChanged;
    final /* synthetic */ InterfaceC3978p0<Boolean> $savedFocus$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WholeSaleModalComposableKt$WholeSaleInput$4$1(Function2<? super String, ? super Boolean, Unit> function2, InterfaceC3978p0<String> interfaceC3978p0, InterfaceC3978p0<Boolean> interfaceC3978p02) {
        super(1);
        this.$onInputChanged = function2;
        this.$inputText$delegate = interfaceC3978p0;
        this.$savedFocus$delegate = interfaceC3978p02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        String WholeSaleInput$lambda$6;
        boolean WholeSaleInput$lambda$9;
        Function2<String, Boolean, Unit> function2 = this.$onInputChanged;
        WholeSaleInput$lambda$6 = WholeSaleModalComposableKt.WholeSaleInput$lambda$6(this.$inputText$delegate);
        WholeSaleInput$lambda$9 = WholeSaleModalComposableKt.WholeSaleInput$lambda$9(this.$savedFocus$delegate);
        function2.invoke(WholeSaleInput$lambda$6, Boolean.valueOf(WholeSaleInput$lambda$9 && !z11));
        WholeSaleModalComposableKt.WholeSaleInput$lambda$10(this.$savedFocus$delegate, z11);
    }
}
