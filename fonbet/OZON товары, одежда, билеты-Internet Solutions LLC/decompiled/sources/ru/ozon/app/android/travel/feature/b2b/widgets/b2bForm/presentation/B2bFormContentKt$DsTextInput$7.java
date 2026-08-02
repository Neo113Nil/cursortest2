package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class B2bFormContentKt$DsTextInput$7 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ String $error;
    final /* synthetic */ Integer $gap;
    final /* synthetic */ CommonInputV2VO.TextInputV2 $input;
    final /* synthetic */ Function0<Unit> $onClearError;
    final /* synthetic */ Function0<Unit> $onHideKeyboard;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ DsInputStatus $status;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B2bFormContentKt$DsTextInput$7(CommonInputV2VO.TextInputV2 textInputV2, String str, DsInputStatus dsInputStatus, String str2, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, l lVar, Function1<? super AtomAction, Unit> function12, Integer num, int i11) {
        super(2);
        this.$input = textInputV2;
        this.$value = str;
        this.$status = dsInputStatus;
        this.$error = str2;
        this.$onValueChange = function1;
        this.$onClearError = function0;
        this.$onHideKeyboard = function02;
        this.$tokenizedAnalytics = lVar;
        this.$actionHandler = function12;
        this.$gap = num;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        B2bFormContentKt.DsTextInput(this.$input, this.$value, this.$status, this.$error, this.$onValueChange, this.$onClearError, this.$onHideKeyboard, this.$tokenizedAnalytics, this.$actionHandler, this.$gap, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
