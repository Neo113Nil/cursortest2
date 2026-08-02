package ru.ozon.uni.android.ds.compose.component.textarea;

import B0.M0;
import B0.N0;
import Bl0.C2652m;
import K1.C3422b;
import Q1.X;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DsTextAreaKt$DsTextArea$9 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ C3422b $caption;
    final /* synthetic */ C7807Z $captionColor;
    final /* synthetic */ boolean $hasBottomBar;
    final /* synthetic */ boolean $hasCounter;
    final /* synthetic */ boolean $hasInfoIcon;
    final /* synthetic */ String $inputText;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isCounterHasLimit;
    final /* synthetic */ M0 $keyboardActions;
    final /* synthetic */ N0 $keyboardOptions;
    final /* synthetic */ String $label;
    final /* synthetic */ int $maxLength;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClearButtonClicked;
    final /* synthetic */ Function1<String, Unit> $onCopyToClipboardClicked;
    final /* synthetic */ Function0<Unit> $onCounterReachedLimit;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function0<Unit> $onInfoButtonClicked;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ DsTextAreaStatus $status;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsTextAreaKt$DsTextArea$9(Function1<? super String, Unit> function1, String str, String str2, DsTextAreaStatus dsTextAreaStatus, e eVar, C3422b c3422b, int i11, int i12, int i13, C7807Z c7807z, boolean z11, boolean z12, boolean z13, boolean z14, N0 n02, M0 m02, X x11, q qVar, Function1<? super Boolean, Unit> function12, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super String, Unit> function13, int i14, int i15, int i16, int i17) {
        super(2);
        this.$onValueChange = function1;
        this.$inputText = str;
        this.$label = str2;
        this.$status = dsTextAreaStatus;
        this.$modifier = eVar;
        this.$caption = c3422b;
        this.$minLines = i11;
        this.$maxLines = i12;
        this.$maxLength = i13;
        this.$captionColor = c7807z;
        this.$hasInfoIcon = z11;
        this.$hasBottomBar = z12;
        this.$hasCounter = z13;
        this.$isCounterHasLimit = z14;
        this.$keyboardOptions = n02;
        this.$keyboardActions = m02;
        this.$visualTransformation = x11;
        this.$interactionSource = qVar;
        this.$onFocusChanged = function12;
        this.$onInfoButtonClicked = function0;
        this.$onClearButtonClicked = function02;
        this.$onCounterReachedLimit = function03;
        this.$onCopyToClipboardClicked = function13;
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
        DsTextAreaKt.m1820DsTextAreas9ZHXeI(this.$onValueChange, this.$inputText, this.$label, this.$status, this.$modifier, this.$caption, this.$minLines, this.$maxLines, this.$maxLength, this.$captionColor, this.$hasInfoIcon, this.$hasBottomBar, this.$hasCounter, this.$isCounterHasLimit, this.$keyboardOptions, this.$keyboardActions, this.$visualTransformation, this.$interactionSource, this.$onFocusChanged, this.$onInfoButtonClicked, this.$onClearButtonClicked, this.$onCounterReachedLimit, this.$onCopyToClipboardClicked, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2), this.$$default);
    }
}
