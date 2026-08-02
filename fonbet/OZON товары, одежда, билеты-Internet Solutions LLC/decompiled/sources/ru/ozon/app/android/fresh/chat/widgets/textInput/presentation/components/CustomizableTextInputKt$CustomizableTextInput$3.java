package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CustomizableTextInputKt$CustomizableTextInput$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ CustomizableTextInputStyle $inputStyle;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ String $placeholderText;
    final /* synthetic */ VerticalScrollbarStyle $scrollbarStyle;
    final /* synthetic */ D0.e $textState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CustomizableTextInputKt$CustomizableTextInput$3(e eVar, D0.e eVar2, String str, CustomizableTextInputStyle customizableTextInputStyle, VerticalScrollbarStyle verticalScrollbarStyle, boolean z11, r rVar, Function1<? super Boolean, Unit> function1, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$textState = eVar2;
        this.$placeholderText = str;
        this.$inputStyle = customizableTextInputStyle;
        this.$scrollbarStyle = verticalScrollbarStyle;
        this.$isEnabled = z11;
        this.$focusRequester = rVar;
        this.$onFocusChanged = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CustomizableTextInputKt.CustomizableTextInput(this.$modifier, this.$textState, this.$placeholderText, this.$inputStyle, this.$scrollbarStyle, this.$isEnabled, this.$focusRequester, this.$onFocusChanged, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
