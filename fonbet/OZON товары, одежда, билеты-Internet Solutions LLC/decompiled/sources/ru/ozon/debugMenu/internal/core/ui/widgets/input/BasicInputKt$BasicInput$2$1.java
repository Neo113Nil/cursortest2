package ru.ozon.debugMenu.internal.core.ui.widgets.input;

import B0.M0;
import B0.N0;
import K1.T;
import Q1.K;
import Q1.X;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.i;
import e1.InterfaceC6250b;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import t0.q;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class BasicInputKt$BasicInput$2$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $cursorColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ M0 $keyboardActions;
    final /* synthetic */ N0 $keyboardOptions;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ T $labelTextStyle;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function1<K, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ InterfaceC9890C $this_Row;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $trailingIcon;
    final /* synthetic */ K $value;
    final /* synthetic */ long $valueColor;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BasicInputKt$BasicInput$2$1(InterfaceC9890C interfaceC9890C, r rVar, K k11, String str, String str2, boolean z11, boolean z12, X x11, q qVar, N0 n02, M0 m02, Function1<? super K, Unit> function1, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, T t2, T t11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        super(2);
        this.$this_Row = interfaceC9890C;
        this.$focusRequester = rVar;
        this.$value = k11;
        this.$label = str;
        this.$placeholder = str2;
        this.$enabled = z11;
        this.$active = z12;
        this.$visualTransformation = x11;
        this.$interactionSource = qVar;
        this.$keyboardOptions = n02;
        this.$keyboardActions = m02;
        this.$onValueChange = function1;
        this.$onFocusChanged = function12;
        this.$labelColor = j11;
        this.$valueColor = j12;
        this.$cursorColor = j13;
        this.$backgroundColor = j14;
        this.$labelTextStyle = t2;
        this.$valueTextStyle = t11;
        this.$trailingIcon = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        InterfaceC9890C interfaceC9890C = this.$this_Row;
        e a11 = i.a(interfaceC9890C.b(interfaceC9890C.a(e.f40358c0, 1.0f, true), InterfaceC6250b.a.i()), this.$focusRequester);
        K k11 = this.$value;
        String str = this.$label;
        String str2 = this.$placeholder;
        boolean z11 = this.$enabled;
        float f7 = 16;
        BasicInputKt.m1621InputBodyzDOBpz4(a11, k11, str, str2, z11, this.$active, this.$visualTransformation, this.$interactionSource, this.$keyboardOptions, this.$keyboardActions, this.$onValueChange, this.$onFocusChanged, this.$labelColor, this.$valueColor, this.$cursorColor, this.$backgroundColor, this.$labelTextStyle, this.$valueTextStyle, androidx.compose.foundation.layout.T.b(f7, 0.0f, (this.$trailingIcon == null || !z11) ? f7 : 0, 0.0f, 10), interfaceC3967k, 0, 0);
    }
}
