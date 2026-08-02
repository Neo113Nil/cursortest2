package ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateAppComposableKt$RateAppComposable$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ e $modifier;
    final /* synthetic */ RateAppVO $state;
    final /* synthetic */ String $storeName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RateAppComposableKt$RateAppComposable$4(RateAppVO rateAppVO, String str, Function1<? super AtomAction, Unit> function1, e eVar, int i11, int i12) {
        super(2);
        this.$state = rateAppVO;
        this.$storeName = str;
        this.$actionHandler = function1;
        this.$modifier = eVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        RateAppComposableKt.RateAppComposable(this.$state, this.$storeName, this.$actionHandler, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
