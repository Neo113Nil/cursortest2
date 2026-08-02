package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal.WholeSaleModalVI;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "text", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WholeSaleModalComposableKt$WholeSaleInput$3$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ InterfaceC3978p0<String> $inputText$delegate;
    final /* synthetic */ Function2<String, Boolean, Unit> $onInputChanged;
    final /* synthetic */ WholeSaleModalVI.TextInput $textInput;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WholeSaleModalComposableKt$WholeSaleInput$3$1(WholeSaleModalVI.TextInput textInput, Function2<? super String, ? super Boolean, Unit> function2, InterfaceC3978p0<String> interfaceC3978p0) {
        super(1);
        this.$textInput = textInput;
        this.$onInputChanged = function2;
        this.$inputText$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() <= this.$textInput.getMaxLength()) {
            this.$inputText$delegate.setValue(text);
            this.$onInputChanged.invoke(text, Boolean.FALSE);
        }
    }
}
