package ru.ozon.uni.foundation.components.input;

import B0.M0;
import B0.N0;
import K1.T;
import Q1.K;
import Q1.X;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.i;
import e1.InterfaceC6250b;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.foundation.components.inputCore.InputSize;
import t0.q;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class FoundationInputKt$FoundationInput$5$1$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $cursorColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ Boolean $forceEnabled;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ M0 $keyboardActions;
    final /* synthetic */ N0 $keyboardOptions;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ e $labelModifier;
    final /* synthetic */ T $labelTextStyle;
    final /* synthetic */ float $labelTopPadding;
    final /* synthetic */ AbstractC8972b $leftContent;
    final /* synthetic */ long $lockColor;
    final /* synthetic */ AbstractC8972b $lockIcon;
    final /* synthetic */ e $lockIconModifier;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function1<K, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ e $placeholderModifier;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $systemRightContent;
    final /* synthetic */ e $textFieldModifier;
    final /* synthetic */ InterfaceC9890C $this_Row;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $trailingIcon;
    final /* synthetic */ K $value;
    final /* synthetic */ long $valueColor;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationInputKt$FoundationInput$5$1$2(InterfaceC9890C interfaceC9890C, e eVar, r rVar, K k11, String str, String str2, boolean z11, boolean z12, Boolean bool, boolean z13, X x11, q qVar, N0 n02, M0 m02, Function1<? super K, Unit> function1, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, long j15, long j16, T t2, T t11, AbstractC8972b abstractC8972b, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, e eVar2, e eVar3, e eVar4, AbstractC8972b abstractC8972b2, float f7) {
        super(2);
        this.$this_Row = interfaceC9890C;
        this.$textFieldModifier = eVar;
        this.$focusRequester = rVar;
        this.$value = k11;
        this.$label = str;
        this.$placeholder = str2;
        this.$readOnly = z11;
        this.$enabled = z12;
        this.$forceEnabled = bool;
        this.$active = z13;
        this.$visualTransformation = x11;
        this.$interactionSource = qVar;
        this.$keyboardOptions = n02;
        this.$keyboardActions = m02;
        this.$onValueChange = function1;
        this.$onFocusChanged = function12;
        this.$labelColor = j11;
        this.$placeholderColor = j12;
        this.$lockColor = j13;
        this.$valueColor = j14;
        this.$cursorColor = j15;
        this.$backgroundColor = j16;
        this.$labelTextStyle = t2;
        this.$valueTextStyle = t11;
        this.$leftContent = abstractC8972b;
        this.$trailingIcon = function2;
        this.$systemRightContent = function22;
        this.$labelModifier = eVar2;
        this.$placeholderModifier = eVar3;
        this.$lockIconModifier = eVar4;
        this.$lockIcon = abstractC8972b2;
        this.$labelTopPadding = f7;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        T t2;
        float f7;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        InterfaceC9890C interfaceC9890C = this.$this_Row;
        e a11 = i.a(interfaceC9890C.b(interfaceC9890C.a(a0.b(this.$textFieldModifier, 0.0f, InputSize.INSTANCE.m3014getMinHeightD9Ej5fM(), 1), 1.0f, true), InterfaceC6250b.a.i()), this.$focusRequester);
        K k11 = this.$value;
        String str = this.$label;
        String str2 = this.$placeholder;
        boolean z11 = this.$readOnly;
        boolean z12 = this.$enabled;
        Boolean bool = this.$forceEnabled;
        boolean z13 = this.$active;
        X x11 = this.$visualTransformation;
        q qVar = this.$interactionSource;
        N0 n02 = this.$keyboardOptions;
        M0 m02 = this.$keyboardActions;
        Function1<K, Unit> function1 = this.$onValueChange;
        Function1<Boolean, Unit> function12 = this.$onFocusChanged;
        long j11 = this.$labelColor;
        long j12 = this.$placeholderColor;
        long j13 = this.$lockColor;
        long j14 = this.$valueColor;
        long j15 = this.$cursorColor;
        long j16 = this.$backgroundColor;
        T t11 = this.$labelTextStyle;
        T t12 = this.$valueTextStyle;
        if (this.$leftContent != null) {
            t2 = t12;
            f7 = 0;
        } else {
            t2 = t12;
            f7 = 16;
        }
        FoundationInputKt.m3008InputBodyGhj78x8(a11, k11, str, str2, z11, z12, bool, z13, x11, qVar, n02, m02, function1, function12, j11, j12, j13, j14, j15, j16, t11, t2, androidx.compose.foundation.layout.T.b(f7, 0.0f, (this.$trailingIcon == null || (!z12 && this.$systemRightContent == null)) ? 16 : 0, 0.0f, 10), this.$labelModifier, this.$placeholderModifier, this.$lockIconModifier, this.$lockIcon, this.$labelTopPadding, interfaceC3967k, 0, 0, 0);
    }
}
