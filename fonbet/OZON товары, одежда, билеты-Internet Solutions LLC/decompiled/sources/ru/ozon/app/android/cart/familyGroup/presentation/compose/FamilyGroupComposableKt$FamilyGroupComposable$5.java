package ru.ozon.app.android.cart.familyGroup.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import Tg.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.familyGroup.presentation.FamilyGroupVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FamilyGroupComposableKt$FamilyGroupComposable$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ FamilyGroupVO $item;
    final /* synthetic */ Function2<FamilyGroupVO, t, Unit> $onView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FamilyGroupComposableKt$FamilyGroupComposable$5(FamilyGroupVO familyGroupVO, Function2<? super FamilyGroupVO, ? super t, Unit> function2, Function1<? super b, Unit> function1, int i11, int i12) {
        super(2);
        this.$item = familyGroupVO;
        this.$onView = function2;
        this.$actionHandler = function1;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FamilyGroupComposableKt.FamilyGroupComposable(this.$item, this.$onView, this.$actionHandler, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
