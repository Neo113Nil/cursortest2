package ru.ozon.uni.android.ds.compose.component.input;

import B0.M0;
import B0.N0;
import Bl0.C2652m;
import Q1.K;
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
import ru.ozon.uni.core.models.UniIconToken;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsInputBaseImplKt$DsInputBaseImpl$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ String $caption;
    final /* synthetic */ C7807Z $captionColor;
    final /* synthetic */ Function1<String, Unit> $copyTextAction;
    final /* synthetic */ UniIconToken $firstIcon;
    final /* synthetic */ boolean $hasClearButton;
    final /* synthetic */ boolean $hasCopyButton;
    final /* synthetic */ boolean $hasErrorIcon;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ M0 $keyboardActions;
    final /* synthetic */ N0 $keyboardOptions;
    final /* synthetic */ String $label;
    final /* synthetic */ DsInputLabelPosition $labelPosition;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClearClick;
    final /* synthetic */ Function0<Unit> $onFirstIconClick;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function0<Unit> $onSecondIconClick;
    final /* synthetic */ Function1<DsInputStatus, Unit> $onStatusChanged;
    final /* synthetic */ Function1<K, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ UniIconToken $secondIcon;
    final /* synthetic */ DsInputSize $size;
    final /* synthetic */ DsInputState $state;
    final /* synthetic */ DsInputStatus $status;
    final /* synthetic */ DsInputTheme $theme;
    final /* synthetic */ DsInputType $type;
    final /* synthetic */ K $value;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsInputBaseImplKt$DsInputBaseImpl$3(e eVar, K k11, Function1<? super K, Unit> function1, DsInputSize dsInputSize, DsInputType dsInputType, DsInputTheme dsInputTheme, DsInputState dsInputState, boolean z11, DsInputStatus dsInputStatus, String str, String str2, DsInputLabelPosition dsInputLabelPosition, String str3, C7807Z c7807z, boolean z12, boolean z13, boolean z14, UniIconToken uniIconToken, UniIconToken uniIconToken2, Function0<Unit> function0, Function0<Unit> function02, N0 n02, M0 m02, X x11, q qVar, Function0<Unit> function03, Function1<? super DsInputStatus, Unit> function12, Function1<? super Boolean, Unit> function13, Function1<? super String, Unit> function14, int i11, int i12, int i13) {
        super(2);
        this.$modifier = eVar;
        this.$value = k11;
        this.$onValueChange = function1;
        this.$size = dsInputSize;
        this.$type = dsInputType;
        this.$theme = dsInputTheme;
        this.$state = dsInputState;
        this.$loading = z11;
        this.$status = dsInputStatus;
        this.$placeholder = str;
        this.$label = str2;
        this.$labelPosition = dsInputLabelPosition;
        this.$caption = str3;
        this.$captionColor = c7807z;
        this.$hasClearButton = z12;
        this.$hasErrorIcon = z13;
        this.$hasCopyButton = z14;
        this.$firstIcon = uniIconToken;
        this.$secondIcon = uniIconToken2;
        this.$onFirstIconClick = function0;
        this.$onSecondIconClick = function02;
        this.$keyboardOptions = n02;
        this.$keyboardActions = m02;
        this.$visualTransformation = x11;
        this.$interactionSource = qVar;
        this.$onClearClick = function03;
        this.$onStatusChanged = function12;
        this.$onFocusChanged = function13;
        this.$copyTextAction = function14;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$changed2 = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsInputBaseImplKt.m1736DsInputBaseImploiW5flc(this.$modifier, this.$value, this.$onValueChange, this.$size, this.$type, this.$theme, this.$state, this.$loading, this.$status, this.$placeholder, this.$label, this.$labelPosition, this.$caption, this.$captionColor, this.$hasClearButton, this.$hasErrorIcon, this.$hasCopyButton, this.$firstIcon, this.$secondIcon, this.$onFirstIconClick, this.$onSecondIconClick, this.$keyboardOptions, this.$keyboardActions, this.$visualTransformation, this.$interactionSource, this.$onClearClick, this.$onStatusChanged, this.$onFocusChanged, this.$copyTextAction, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2));
    }
}
