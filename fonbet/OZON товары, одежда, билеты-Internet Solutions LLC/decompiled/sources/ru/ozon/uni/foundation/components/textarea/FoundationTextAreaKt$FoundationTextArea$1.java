package ru.ozon.uni.foundation.components.textarea;

import B0.M0;
import B0.N0;
import Bl0.C2652m;
import K1.C3422b;
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

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationTextAreaKt$FoundationTextArea$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$changed3;
    final /* synthetic */ int $$changed4;
    final /* synthetic */ int $$changed5;
    final /* synthetic */ boolean $active;
    final /* synthetic */ long $activeBorderColor;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $bodyTopPadding;
    final /* synthetic */ long $borderColor;
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ C3422b $caption;
    final /* synthetic */ long $captionColor;
    final /* synthetic */ int $captionLineLimit;
    final /* synthetic */ e $captionModifier;
    final /* synthetic */ T $captionTextStyle;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $clearButton;
    final /* synthetic */ long $counterColor;
    final /* synthetic */ long $counterErrorColor;
    final /* synthetic */ e $counterModifier;
    final /* synthetic */ T $counterTextStyle;
    final /* synthetic */ long $cursorColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ boolean $hasBottomBar;
    final /* synthetic */ boolean $hasCounter;
    final /* synthetic */ float $inputCornerRadius;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isFocused;
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
    final /* synthetic */ float $maxHeight;
    final /* synthetic */ int $maxLength;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ int $minLines;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function1<K, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ e $placeholderModifier;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $rightContent;
    final /* synthetic */ AbstractC8972b $systemContent;
    final /* synthetic */ long $systemContentColor;
    final /* synthetic */ float $systemContentIconSize;
    final /* synthetic */ e $systemContentModifier;
    final /* synthetic */ e $textFieldModifier;
    final /* synthetic */ K $value;
    final /* synthetic */ long $valueColor;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationTextAreaKt$FoundationTextArea$1(e eVar, Function1<? super K, Unit> function1, K k11, String str, String str2, C3422b c3422b, int i11, AbstractC8972b abstractC8972b, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z11, boolean z12, boolean z13, boolean z14, r rVar, N0 n02, M0 m02, X x11, q qVar, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, T t2, T t11, T t12, float f7, float f11, float f12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, e eVar2, e eVar3, e eVar4, e eVar5, e eVar6, e eVar7, e eVar8, AbstractC8972b abstractC8972b2, long j21, boolean z15, boolean z16, boolean z17, int i12, long j22, long j23, T t13, int i13, int i14, float f13, float f14, float f15, float f16, int i15, int i16, int i17, int i18, int i19, int i21) {
        super(2);
        this.$modifier = eVar;
        this.$onValueChange = function1;
        this.$value = k11;
        this.$label = str;
        this.$placeholder = str2;
        this.$caption = c3422b;
        this.$captionLineLimit = i11;
        this.$systemContent = abstractC8972b;
        this.$rightContent = function2;
        this.$readOnly = z11;
        this.$enabled = z12;
        this.$active = z13;
        this.$isFocused = z14;
        this.$focusRequester = rVar;
        this.$keyboardOptions = n02;
        this.$keyboardActions = m02;
        this.$visualTransformation = x11;
        this.$interactionSource = qVar;
        this.$onFocusChanged = function12;
        this.$backgroundColor = j11;
        this.$cursorColor = j12;
        this.$valueColor = j13;
        this.$labelColor = j14;
        this.$placeholderColor = j15;
        this.$captionColor = j16;
        this.$borderColor = j17;
        this.$activeBorderColor = j18;
        this.$systemContentColor = j19;
        this.$labelTextStyle = t2;
        this.$valueTextStyle = t11;
        this.$captionTextStyle = t12;
        this.$borderWidth = f7;
        this.$minHeight = f11;
        this.$maxHeight = f12;
        this.$clearButton = function22;
        this.$textFieldModifier = eVar2;
        this.$captionModifier = eVar3;
        this.$labelModifier = eVar4;
        this.$placeholderModifier = eVar5;
        this.$lockIconModifier = eVar6;
        this.$systemContentModifier = eVar7;
        this.$counterModifier = eVar8;
        this.$lockIcon = abstractC8972b2;
        this.$lockColor = j21;
        this.$hasCounter = z15;
        this.$hasBottomBar = z16;
        this.$isLeftLockIconEnabled = z17;
        this.$maxLength = i12;
        this.$counterColor = j22;
        this.$counterErrorColor = j23;
        this.$counterTextStyle = t13;
        this.$minLines = i13;
        this.$maxLines = i14;
        this.$bodyTopPadding = f13;
        this.$systemContentIconSize = f14;
        this.$labelTopPadding = f15;
        this.$inputCornerRadius = f16;
        this.$$changed = i15;
        this.$$changed1 = i16;
        this.$$changed2 = i17;
        this.$$changed3 = i18;
        this.$$changed4 = i19;
        this.$$changed5 = i21;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationTextAreaKt.m3029FoundationTextArea63v6zQ(this.$modifier, this.$onValueChange, this.$value, this.$label, this.$placeholder, this.$caption, this.$captionLineLimit, this.$systemContent, this.$rightContent, this.$readOnly, this.$enabled, this.$active, this.$isFocused, this.$focusRequester, this.$keyboardOptions, this.$keyboardActions, this.$visualTransformation, this.$interactionSource, this.$onFocusChanged, this.$backgroundColor, this.$cursorColor, this.$valueColor, this.$labelColor, this.$placeholderColor, this.$captionColor, this.$borderColor, this.$activeBorderColor, this.$systemContentColor, this.$labelTextStyle, this.$valueTextStyle, this.$captionTextStyle, this.$borderWidth, this.$minHeight, this.$maxHeight, this.$clearButton, this.$textFieldModifier, this.$captionModifier, this.$labelModifier, this.$placeholderModifier, this.$lockIconModifier, this.$systemContentModifier, this.$counterModifier, this.$lockIcon, this.$lockColor, this.$hasCounter, this.$hasBottomBar, this.$isLeftLockIconEnabled, this.$maxLength, this.$counterColor, this.$counterErrorColor, this.$counterTextStyle, this.$minLines, this.$maxLines, this.$bodyTopPadding, this.$systemContentIconSize, this.$labelTopPadding, this.$inputCornerRadius, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2), C2652m.e(this.$$changed3), C2652m.e(this.$$changed4), C2652m.e(this.$$changed5));
    }
}
