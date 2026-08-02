package ru.ozon.debugMenu.internal.core.ui.widgets.input;

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
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BasicInputKt$BasicInput$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $active;
    final /* synthetic */ long $activeBorderColor;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $borderColor;
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ long $cursorColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ M0 $keyboardActions;
    final /* synthetic */ N0 $keyboardOptions;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ T $labelTextStyle;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClearClick;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function1<K, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $rightContent;
    final /* synthetic */ boolean $showSystemContent;
    final /* synthetic */ K $value;
    final /* synthetic */ long $valueColor;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BasicInputKt$BasicInput$3(e eVar, Function1<? super K, Unit> function1, K k11, String str, String str2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z11, boolean z12, boolean z13, N0 n02, M0 m02, X x11, q qVar, Function0<Unit> function0, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, long j15, long j16, T t2, T t11, float f7, r rVar, int i11, int i12, int i13, int i14) {
        super(2);
        this.$modifier = eVar;
        this.$onValueChange = function1;
        this.$value = k11;
        this.$label = str;
        this.$placeholder = str2;
        this.$rightContent = function2;
        this.$enabled = z11;
        this.$active = z12;
        this.$showSystemContent = z13;
        this.$keyboardOptions = n02;
        this.$keyboardActions = m02;
        this.$visualTransformation = x11;
        this.$interactionSource = qVar;
        this.$onClearClick = function0;
        this.$onFocusChanged = function12;
        this.$backgroundColor = j11;
        this.$cursorColor = j12;
        this.$valueColor = j13;
        this.$labelColor = j14;
        this.$borderColor = j15;
        this.$activeBorderColor = j16;
        this.$labelTextStyle = t2;
        this.$valueTextStyle = t11;
        this.$borderWidth = f7;
        this.$focusRequester = rVar;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$changed2 = i13;
        this.$$default = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        BasicInputKt.m1620BasicInputqDwmbCE(this.$modifier, this.$onValueChange, this.$value, this.$label, this.$placeholder, this.$rightContent, this.$enabled, this.$active, this.$showSystemContent, this.$keyboardOptions, this.$keyboardActions, this.$visualTransformation, this.$interactionSource, this.$onClearClick, this.$onFocusChanged, this.$backgroundColor, this.$cursorColor, this.$valueColor, this.$labelColor, this.$borderColor, this.$activeBorderColor, this.$labelTextStyle, this.$valueTextStyle, this.$borderWidth, this.$focusRequester, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2), this.$$default);
    }
}
