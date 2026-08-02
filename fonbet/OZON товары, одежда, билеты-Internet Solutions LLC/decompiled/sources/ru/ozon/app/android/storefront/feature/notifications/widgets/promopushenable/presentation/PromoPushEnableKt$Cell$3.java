package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.data.PromoPushEnableCellDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PromoPushEnableKt$Cell$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ PromoPushEnableCellDTO $model;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PromoPushEnableKt$Cell$3(e eVar, PromoPushEnableCellDTO promoPushEnableCellDTO, Function1<? super AtomAction, Unit> function1, Function0<Unit> function0, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$model = promoPushEnableCellDTO;
        this.$actionHandler = function1;
        this.$onClick = function0;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        PromoPushEnableKt.Cell(this.$modifier, this.$model, this.$actionHandler, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
