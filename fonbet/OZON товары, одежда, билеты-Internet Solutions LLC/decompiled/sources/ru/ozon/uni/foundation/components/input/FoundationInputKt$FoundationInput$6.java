package ru.ozon.uni.foundation.components.input;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationInputKt$FoundationInput$6 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$changed3;
    final /* synthetic */ int $$changed4;
    final /* synthetic */ boolean $active;
    final /* synthetic */ long $activeBorderColor;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $borderColor;
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ String $caption;
    final /* synthetic */ long $captionColor;
    final /* synthetic */ int $captionLineLimit;
    final /* synthetic */ e $captionModifier;
    final /* synthetic */ T $captionTextStyle;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $clearButton;
    final /* synthetic */ long $cursorColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ M0 $keyboardActions;
    final /* synthetic */ N0 $keyboardOptions;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ e $labelModifier;
    final /* synthetic */ T $labelTextStyle;
    final /* synthetic */ float $labelTopPadding;
    final /* synthetic */ AbstractC8972b $leftContent;
    final /* synthetic */ long $leftContentIconTint;
    final /* synthetic */ e $leftContentModifier;
    final /* synthetic */ long $lockColor;
    final /* synthetic */ AbstractC8972b $lockIcon;
    final /* synthetic */ e $lockIconModifier;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function0<Unit> $onInputClick;
    final /* synthetic */ Function1<K, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ e $placeholderModifier;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $rightContent;
    final /* synthetic */ boolean $showSystemContent;
    final /* synthetic */ AbstractC8972b $systemContent;
    final /* synthetic */ long $systemContentColor;
    final /* synthetic */ e $systemContentModifier;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $systemRightContent;
    final /* synthetic */ e $textFieldModifier;
    final /* synthetic */ K $value;
    final /* synthetic */ long $valueColor;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationInputKt$FoundationInput$6(e eVar, Function1<? super K, Unit> function1, K k11, String str, String str2, String str3, int i11, AbstractC8972b abstractC8972b, AbstractC8972b abstractC8972b2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, boolean z11, boolean z12, boolean z13, boolean z14, N0 n02, M0 m02, X x11, q qVar, Function0<Unit> function0, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, T t2, T t11, T t12, float f7, r rVar, e eVar2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, e eVar3, long j22, e eVar4, e eVar5, e eVar6, e eVar7, e eVar8, AbstractC8972b abstractC8972b3, float f11, int i12, int i13, int i14, int i15, int i16) {
        super(2);
        this.$modifier = eVar;
        this.$onValueChange = function1;
        this.$value = k11;
        this.$label = str;
        this.$placeholder = str2;
        this.$caption = str3;
        this.$captionLineLimit = i11;
        this.$leftContent = abstractC8972b;
        this.$systemContent = abstractC8972b2;
        this.$rightContent = function2;
        this.$systemRightContent = function22;
        this.$readOnly = z11;
        this.$enabled = z12;
        this.$active = z13;
        this.$showSystemContent = z14;
        this.$keyboardOptions = n02;
        this.$keyboardActions = m02;
        this.$visualTransformation = x11;
        this.$interactionSource = qVar;
        this.$onInputClick = function0;
        this.$onFocusChanged = function12;
        this.$backgroundColor = j11;
        this.$cursorColor = j12;
        this.$valueColor = j13;
        this.$labelColor = j14;
        this.$placeholderColor = j15;
        this.$lockColor = j16;
        this.$captionColor = j17;
        this.$borderColor = j18;
        this.$activeBorderColor = j19;
        this.$systemContentColor = j21;
        this.$labelTextStyle = t2;
        this.$valueTextStyle = t11;
        this.$captionTextStyle = t12;
        this.$borderWidth = f7;
        this.$focusRequester = rVar;
        this.$systemContentModifier = eVar2;
        this.$clearButton = function23;
        this.$leftContentModifier = eVar3;
        this.$leftContentIconTint = j22;
        this.$captionModifier = eVar4;
        this.$textFieldModifier = eVar5;
        this.$labelModifier = eVar6;
        this.$placeholderModifier = eVar7;
        this.$lockIconModifier = eVar8;
        this.$lockIcon = abstractC8972b3;
        this.$labelTopPadding = f11;
        this.$$changed = i12;
        this.$$changed1 = i13;
        this.$$changed2 = i14;
        this.$$changed3 = i15;
        this.$$changed4 = i16;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationInputKt.m3007FoundationInputYx1CVQ(this.$modifier, this.$onValueChange, this.$value, this.$label, this.$placeholder, this.$caption, this.$captionLineLimit, this.$leftContent, this.$systemContent, this.$rightContent, this.$systemRightContent, this.$readOnly, this.$enabled, this.$active, this.$showSystemContent, this.$keyboardOptions, this.$keyboardActions, this.$visualTransformation, this.$interactionSource, this.$onInputClick, this.$onFocusChanged, this.$backgroundColor, this.$cursorColor, this.$valueColor, this.$labelColor, this.$placeholderColor, this.$lockColor, this.$captionColor, this.$borderColor, this.$activeBorderColor, this.$systemContentColor, this.$labelTextStyle, this.$valueTextStyle, this.$captionTextStyle, this.$borderWidth, this.$focusRequester, this.$systemContentModifier, this.$clearButton, this.$leftContentModifier, this.$leftContentIconTint, this.$captionModifier, this.$textFieldModifier, this.$labelModifier, this.$placeholderModifier, this.$lockIconModifier, this.$lockIcon, this.$labelTopPadding, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2), C2652m.e(this.$$changed3), C2652m.e(this.$$changed4));
    }
}
