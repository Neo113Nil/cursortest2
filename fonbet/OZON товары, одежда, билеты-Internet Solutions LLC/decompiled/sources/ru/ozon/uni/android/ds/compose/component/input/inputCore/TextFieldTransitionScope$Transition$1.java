package ru.ozon.uni.android.ds.compose.component.input.inputCore;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TextFieldTransitionScope$Transition$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC6511n<Float, InterfaceC3967k, Integer, Unit> $content;
    final /* synthetic */ InputPhase $inputState;
    final /* synthetic */ TextFieldTransitionScope $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextFieldTransitionScope$Transition$1(TextFieldTransitionScope textFieldTransitionScope, InputPhase inputPhase, InterfaceC6511n<? super Float, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, int i11) {
        super(2);
        this.$tmp0_rcvr = textFieldTransitionScope;
        this.$inputState = inputPhase;
        this.$content = interfaceC6511n;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        this.$tmp0_rcvr.Transition(this.$inputState, this.$content, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
