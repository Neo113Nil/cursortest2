package ru.ozon.uni.android.ds.compose.component.input;

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
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import t0.q;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsInputBaseImplKt$DsInputBaseImpl$2$1$1$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ DsInputState $currentState;
    final /* synthetic */ long $cursorColor;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $finalEndContent;
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ M0 $keyboardActions;
    final /* synthetic */ N0 $keyboardOptions;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ DsInputLabelPosition $labelPosition;
    final /* synthetic */ T $labelTextStyle;
    final /* synthetic */ DsInputBaseLocator $locators;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function1<K, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ DsInputSize $size;
    final /* synthetic */ DsInputState $state;
    final /* synthetic */ DsInputStatus $status;
    final /* synthetic */ InterfaceC9890C $this_Row;
    final /* synthetic */ K $value;
    final /* synthetic */ long $valueColor;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsInputBaseImplKt$DsInputBaseImpl$2$1$1$1(InterfaceC9890C interfaceC9890C, DsInputSize dsInputSize, r rVar, K k11, DsInputLabelPosition dsInputLabelPosition, DsInputState dsInputState, String str, String str2, DsInputStatus dsInputStatus, DsInputState dsInputState2, X x11, q qVar, N0 n02, M0 m02, Function1<? super K, Unit> function1, Function1<? super Boolean, Unit> function12, long j11, long j12, long j13, long j14, long j15, T t2, T t11, DsInputBaseLocator dsInputBaseLocator, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        super(2);
        this.$this_Row = interfaceC9890C;
        this.$size = dsInputSize;
        this.$focusRequester = rVar;
        this.$value = k11;
        this.$labelPosition = dsInputLabelPosition;
        this.$state = dsInputState;
        this.$label = str;
        this.$placeholder = str2;
        this.$status = dsInputStatus;
        this.$currentState = dsInputState2;
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
        this.$backgroundColor = j15;
        this.$labelTextStyle = t2;
        this.$valueTextStyle = t11;
        this.$locators = dsInputBaseLocator;
        this.$finalEndContent = function2;
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
        e.a aVar = e.f40358c0;
        e a11 = i.a(interfaceC9890C.b(interfaceC9890C.a(a0.b(aVar, 0.0f, this.$size.getMinHeight(), 1), 1.0f, true), InterfaceC6250b.a.i()), this.$focusRequester);
        K k11 = this.$value;
        String str = (this.$size == DsInputSize.SIZE_500 && this.$labelPosition == DsInputLabelPosition.INSIDE_TOP && (k11.f().length() > 0 || this.$state.isActive$uni_release())) ? null : this.$label;
        DsInputLabelPosition dsInputLabelPosition = this.$labelPosition;
        String str2 = this.$placeholder;
        boolean z11 = this.$status == DsInputStatus.READ_ONLY;
        boolean z12 = !this.$currentState.isDisabled$uni_release();
        boolean isActive$uni_release = this.$currentState.isActive$uni_release();
        X x11 = this.$visualTransformation;
        q qVar = this.$interactionSource;
        N0 n02 = this.$keyboardOptions;
        M0 m02 = this.$keyboardActions;
        Function1<K, Unit> function1 = this.$onValueChange;
        Function1<Boolean, Unit> function12 = this.$onFocusChanged;
        long j11 = this.$labelColor;
        long j12 = this.$placeholderColor;
        long j13 = this.$valueColor;
        long j14 = this.$cursorColor;
        long j15 = this.$backgroundColor;
        T t2 = this.$labelTextStyle;
        T t11 = this.$valueTextStyle;
        e testTag = AtomLocatorKt.testTag(aVar, this.$locators.getTextField().invoke());
        e testTag2 = AtomLocatorKt.testTag(aVar, this.$locators.getLabel().invoke());
        e testTag3 = AtomLocatorKt.testTag(aVar, this.$locators.getPlaceholder().invoke());
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        DsInputBaseImplKt.m1738InputBodyhYDyX_4(a11, k11, str, dsInputLabelPosition, str2, z11, z12, isActive$uni_release, x11, qVar, n02, m02, function1, function12, j11, j12, j13, j14, j15, t2, t11, testTag, testTag2, testTag3, androidx.compose.foundation.layout.T.b(dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, this.$finalEndContent != null ? dsSpacings.m1838getDp0D9Ej5fM() : dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, 10), interfaceC3967k, 0, 0, 0);
    }
}
