package ru.ozon.uni.ozi.components.inputs;

import B0.M0;
import B0.N0;
import Bl0.C2652m;
import Q1.X;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.ozi.components.inputs.core.OziInputRightContentScope;
import ru.ozon.uni.ozi.components.inputs.presets.OziInputStatus;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziInputKt$OziInputImpl$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ String $caption;
    final /* synthetic */ int $captionLineLimit;
    final /* synthetic */ Function1<String, Unit> $copyTextAction;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC6511n<OziInputRightContentScope, InterfaceC3967k, Integer, Unit> $endContent;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ M0 $keyboardActions;
    final /* synthetic */ N0 $keyboardOptions;
    final /* synthetic */ String $label;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClearClick;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function0<Unit> $onInputClick;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ boolean $showCopyButton;
    final /* synthetic */ boolean $showSystemContent;
    final /* synthetic */ AbstractC8972b $startContent;
    final /* synthetic */ OziInputStatus $status;
    final /* synthetic */ InterfaceC6511n<OziInputRightContentScope, InterfaceC3967k, Integer, Unit> $systemEndContent;
    final /* synthetic */ String $value;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziInputKt$OziInputImpl$4(String str, String str2, Function1<? super String, Unit> function1, e eVar, String str3, String str4, int i11, AbstractC8972b abstractC8972b, InterfaceC6511n<? super OziInputRightContentScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super OziInputRightContentScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, boolean z11, boolean z12, boolean z13, OziInputStatus oziInputStatus, X x11, N0 n02, M0 m02, q qVar, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Boolean, Unit> function12, Function1<? super String, Unit> function13, int i12, int i13, int i14) {
        super(2);
        this.$value = str;
        this.$label = str2;
        this.$onValueChange = function1;
        this.$modifier = eVar;
        this.$placeholder = str3;
        this.$caption = str4;
        this.$captionLineLimit = i11;
        this.$startContent = abstractC8972b;
        this.$endContent = interfaceC6511n;
        this.$systemEndContent = interfaceC6511n2;
        this.$enabled = z11;
        this.$showCopyButton = z12;
        this.$showSystemContent = z13;
        this.$status = oziInputStatus;
        this.$visualTransformation = x11;
        this.$keyboardOptions = n02;
        this.$keyboardActions = m02;
        this.$interactionSource = qVar;
        this.$onInputClick = function0;
        this.$onClearClick = function02;
        this.$onFocusChanged = function12;
        this.$copyTextAction = function13;
        this.$$changed = i12;
        this.$$changed1 = i13;
        this.$$changed2 = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziInputKt.OziInputImpl(this.$value, this.$label, this.$onValueChange, this.$modifier, this.$placeholder, this.$caption, this.$captionLineLimit, this.$startContent, this.$endContent, this.$systemEndContent, this.$enabled, this.$showCopyButton, this.$showSystemContent, this.$status, this.$visualTransformation, this.$keyboardOptions, this.$keyboardActions, this.$interactionSource, this.$onInputClick, this.$onClearClick, this.$onFocusChanged, this.$copyTextAction, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2));
    }
}
