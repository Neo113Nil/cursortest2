package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class B2bFormContentKt$B2bFormContent$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ Map<String, String> $inputErrors;
    final /* synthetic */ Map<String, DsInputStatus> $inputStatuses;
    final /* synthetic */ Map<String, String> $inputValues;
    final /* synthetic */ Function1<String, Unit> $onClearError;
    final /* synthetic */ Function2<String, String, Unit> $onValueChange;
    final /* synthetic */ B2bFormVI $state;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B2bFormContentKt$B2bFormContent$3(B2bFormVI b2bFormVI, Function1<? super AtomAction, Unit> function1, l lVar, Map<String, String> map, Map<String, ? extends DsInputStatus> map2, Map<String, String> map3, Function2<? super String, ? super String, Unit> function2, Function1<? super String, Unit> function12, int i11) {
        super(2);
        this.$state = b2bFormVI;
        this.$actionHandler = function1;
        this.$tokenizedAnalytics = lVar;
        this.$inputValues = map;
        this.$inputStatuses = map2;
        this.$inputErrors = map3;
        this.$onValueChange = function2;
        this.$onClearError = function12;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        B2bFormContentKt.B2bFormContent(this.$state, this.$actionHandler, this.$tokenizedAnalytics, this.$inputValues, this.$inputStatuses, this.$inputErrors, this.$onValueChange, this.$onClearError, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
