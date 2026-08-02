package ru.ozon.uni.foundation.components.textarea;

import B0.M0;
import B0.N0;
import Bl0.C2652m;
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
import q1.AbstractC8972b;
import t0.q;
import u0.InterfaceC9914x;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationTextAreaKt$TextareaBody$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC9914x $contentPadding;
    final /* synthetic */ long $cursorColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ r $focusRequester;
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
    final /* synthetic */ String $placeholder;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ int $placeholderMaxLines;
    final /* synthetic */ e $placeholderModifier;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ e $textFieldModifier;
    final /* synthetic */ K $value;
    final /* synthetic */ long $valueColor;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationTextAreaKt$TextareaBody$1(K k11, String str, String str2, boolean z11, boolean z12, r rVar, X x11, q qVar, N0 n02, M0 m02, Function1<? super K, Unit> function1, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, T t2, T t11, InterfaceC9914x interfaceC9914x, e eVar, e eVar2, e eVar3, e eVar4, AbstractC8972b abstractC8972b, long j15, int i11, int i12, float f7, boolean z13, int i13, int i14, int i15, int i16, int i17) {
        super(2);
        this.$value = k11;
        this.$label = str;
        this.$placeholder = str2;
        this.$readOnly = z11;
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
        this.$contentPadding = interfaceC9914x;
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
        this.$placeholderMaxLines = i13;
        this.$$changed = i14;
        this.$$changed1 = i15;
        this.$$changed2 = i16;
        this.$$default = i17;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationTextAreaKt.m3032TextareaBodyqWYo42c(this.$value, this.$label, this.$placeholder, this.$readOnly, this.$enabled, this.$focusRequester, this.$visualTransformation, this.$interactionSource, this.$keyboardOptions, this.$keyboardActions, this.$onValueChange, this.$onFocusChanged, this.$labelColor, this.$placeholderColor, this.$valueColor, this.$cursorColor, this.$labelTextStyle, this.$valueTextStyle, this.$contentPadding, this.$textFieldModifier, this.$labelModifier, this.$placeholderModifier, this.$lockIconModifier, this.$lockIcon, this.$lockColor, this.$minLines, this.$maxLines, this.$labelTopPadding, this.$isLeftLockIconEnabled, this.$placeholderMaxLines, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2), this.$$default);
    }
}
