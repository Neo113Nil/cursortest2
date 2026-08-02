package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal.WholeSaleModalVI;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WholeSaleModalComposableKt$WholeSaleInput$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $inputError;
    final /* synthetic */ Function2<String, Boolean, Unit> $onInputChanged;
    final /* synthetic */ String $text;
    final /* synthetic */ WholeSaleModalVI.TextInput $textInput;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WholeSaleModalComposableKt$WholeSaleInput$5(String str, String str2, WholeSaleModalVI.TextInput textInput, Function2<? super String, ? super Boolean, Unit> function2, int i11) {
        super(2);
        this.$text = str;
        this.$inputError = str2;
        this.$textInput = textInput;
        this.$onInputChanged = function2;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        WholeSaleModalComposableKt.WholeSaleInput(this.$text, this.$inputError, this.$textInput, this.$onInputChanged, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
