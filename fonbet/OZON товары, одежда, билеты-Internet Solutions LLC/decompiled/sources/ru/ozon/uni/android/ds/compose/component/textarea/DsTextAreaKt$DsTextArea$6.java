package ru.ozon.uni.android.ds.compose.component.textarea;

import Q1.K;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class DsTextAreaKt$DsTextArea$6 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ DsTextAreaState $currentState;
    final /* synthetic */ DsTextAreaStyle $currentStyle;
    final /* synthetic */ boolean $hasBottomBar;
    final /* synthetic */ boolean $hasInfoIcon;
    final /* synthetic */ boolean $isTextEmpty;
    final /* synthetic */ Function1<String, Unit> $onCopyToClipboardClicked;
    final /* synthetic */ Function0<Unit> $onInfoButtonClicked;
    final /* synthetic */ K $textFieldValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsTextAreaKt$DsTextArea$6(DsTextAreaStyle dsTextAreaStyle, DsTextAreaState dsTextAreaState, boolean z11, boolean z12, boolean z13, K k11, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        super(2);
        this.$currentStyle = dsTextAreaStyle;
        this.$currentState = dsTextAreaState;
        this.$hasInfoIcon = z11;
        this.$isTextEmpty = z12;
        this.$hasBottomBar = z13;
        this.$textFieldValue = k11;
        this.$onInfoButtonClicked = function0;
        this.$onCopyToClipboardClicked = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            DsTextAreaKt.RightContent(this.$currentStyle, this.$currentState, this.$hasInfoIcon, this.$isTextEmpty, this.$hasBottomBar, this.$textFieldValue.f(), this.$onInfoButtonClicked, this.$onCopyToClipboardClicked, interfaceC3967k, 0);
        }
    }
}
