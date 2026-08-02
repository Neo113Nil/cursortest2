package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components;

import S0.InterfaceC3972m0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import n0.d0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CustomizableTextInputKt$CustomizableTextInput$showBlur$2$1 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ CustomizableTextInputStyle $inputStyle;
    final /* synthetic */ InterfaceC3972m0 $lineCount$delegate;
    final /* synthetic */ d0 $scrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomizableTextInputKt$CustomizableTextInput$showBlur$2$1(CustomizableTextInputStyle customizableTextInputStyle, d0 d0Var, InterfaceC3972m0 interfaceC3972m0) {
        super(0);
        this.$inputStyle = customizableTextInputStyle;
        this.$scrollState = d0Var;
        this.$lineCount$delegate = interfaceC3972m0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int intValue;
        intValue = this.$lineCount$delegate.getIntValue();
        return Boolean.valueOf(intValue >= this.$inputStyle.getMaxLines() && this.$scrollState.m() != 0);
    }
}
