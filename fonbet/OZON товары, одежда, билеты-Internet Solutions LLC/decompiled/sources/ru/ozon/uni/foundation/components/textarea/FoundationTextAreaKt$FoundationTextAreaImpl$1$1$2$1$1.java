package ru.ozon.uni.foundation.components.textarea;

import B0.M0;
import B0.N0;
import K1.T;
import Q1.K;
import Q1.X;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.reflect.h;
import q1.AbstractC8972b;
import t0.q;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class FoundationTextAreaKt$FoundationTextAreaImpl$1$1$2$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $clearButton;
    final /* synthetic */ long $cursorColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $finalReadOnly;
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ boolean $hasBottomBar;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isLeftLockIconEnabled;
    final /* synthetic */ M0 $keyboardActions;
    final /* synthetic */ N0 $keyboardOptions;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ e $labelModifier;
    final /* synthetic */ T $labelTextStyle;
    final /* synthetic */ float $labelTopPadding;
    final /* synthetic */ long $lockColor;
    final /* synthetic */ AbstractC8972b $lockIcon;
    final /* synthetic */ e $lockIconModifier;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function1<K, Unit> $onValueChange;
    final /* synthetic */ int $placeHolderMaxLines;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ e $placeholderModifier;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $rightContent;
    final /* synthetic */ AbstractC8972b $systemContent;
    final /* synthetic */ long $systemContentColor;
    final /* synthetic */ float $systemContentIconSize;
    final /* synthetic */ e $systemContentModifier;
    final /* synthetic */ e $textFieldModifier;
    final /* synthetic */ K $textFieldValue;
    final /* synthetic */ InterfaceC9890C $this_Row;
    final /* synthetic */ K $value;
    final /* synthetic */ long $valueColor;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationTextAreaKt$FoundationTextAreaImpl$1$1$2$1$1(K k11, String str, String str2, boolean z11, boolean z12, r rVar, X x11, q qVar, N0 n02, M0 m02, Function1<? super K, Unit> function1, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, T t2, T t11, InterfaceC9890C interfaceC9890C, e eVar, e eVar2, e eVar3, e eVar4, AbstractC8972b abstractC8972b, long j15, int i11, int i12, float f7, boolean z13, int i13, boolean z14, e eVar5, AbstractC8972b abstractC8972b2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, boolean z15, K k12, long j16, float f11) {
        super(2);
        this.$textFieldValue = k11;
        this.$label = str;
        this.$placeholder = str2;
        this.$finalReadOnly = z11;
        this.$enabled = z12;
        this.$focusRequester = rVar;
        this.$visualTransformation = x11;
        this.$interactionSource = qVar;
        this.$keyboardOptions = n02;
        this.$keyboardActions = m02;
        this.$onValueChange = function1;
        this.$onFocusChanged = function12;
        this.$labelColor = j11;
        this.$placeholderColor = j12;
        this.$valueColor = j13;
        this.$cursorColor = j14;
        this.$labelTextStyle = t2;
        this.$valueTextStyle = t11;
        this.$this_Row = interfaceC9890C;
        this.$textFieldModifier = eVar;
        this.$labelModifier = eVar2;
        this.$placeholderModifier = eVar3;
        this.$lockIconModifier = eVar4;
        this.$lockIcon = abstractC8972b;
        this.$lockColor = j15;
        this.$minLines = i11;
        this.$maxLines = i12;
        this.$labelTopPadding = f7;
        this.$isLeftLockIconEnabled = z13;
        this.$placeHolderMaxLines = i13;
        this.$hasBottomBar = z14;
        this.$systemContentModifier = eVar5;
        this.$systemContent = abstractC8972b2;
        this.$clearButton = function2;
        this.$rightContent = function22;
        this.$active = z15;
        this.$value = k12;
        this.$systemContentColor = j16;
        this.$systemContentIconSize = f11;
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
        K k11 = this.$textFieldValue;
        String str = this.$label;
        String str2 = this.$placeholder;
        boolean z11 = this.$finalReadOnly;
        boolean z12 = this.$enabled;
        r rVar = this.$focusRequester;
        X x11 = this.$visualTransformation;
        q qVar = this.$interactionSource;
        N0 n02 = this.$keyboardOptions;
        M0 m02 = this.$keyboardActions;
        Function1<K, Unit> function1 = this.$onValueChange;
        interfaceC3967k.o(-1054648067);
        boolean n11 = interfaceC3967k.n(function1);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new FoundationTextAreaKt$FoundationTextAreaImpl$1$1$2$1$1$1$1(function1);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        FoundationTextAreaKt.m3032TextareaBodyqWYo42c(k11, str, str2, z11, z12, rVar, x11, qVar, n02, m02, (Function1) ((h) C11), this.$onFocusChanged, this.$labelColor, this.$placeholderColor, this.$valueColor, this.$cursorColor, this.$labelTextStyle, this.$valueTextStyle, androidx.compose.foundation.layout.T.a(16, 2, 0.0f), this.$this_Row.a(this.$textFieldModifier, 1.0f, true), this.$labelModifier, this.$placeholderModifier, this.$lockIconModifier, this.$lockIcon, this.$lockColor, this.$minLines, this.$maxLines, this.$labelTopPadding, this.$isLeftLockIconEnabled, this.$placeHolderMaxLines, interfaceC3967k, 0, 100663296, 0, 0);
        if (this.$hasBottomBar) {
            return;
        }
        FoundationTextAreaKt.m3033TrailingIconGi_pv64(e.f40358c0, this.$systemContentModifier, this.$systemContent, this.$clearButton, this.$rightContent, this.$enabled, this.$active, this.$finalReadOnly, this.$value.f().length() == 0, this.$systemContentColor, this.$lockIcon, this.$systemContentIconSize, this.$isLeftLockIconEnabled, interfaceC3967k, 6, 0, 0);
    }
}
