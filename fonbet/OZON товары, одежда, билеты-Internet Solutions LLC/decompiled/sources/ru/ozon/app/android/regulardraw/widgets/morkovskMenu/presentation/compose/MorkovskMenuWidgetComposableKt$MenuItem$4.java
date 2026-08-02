package ru.ozon.app.android.regulardraw.widgets.morkovskMenu.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuItemVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MorkovskMenuWidgetComposableKt$MenuItem$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ MorkovskMenuItemVO $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MorkovskMenuWidgetComposableKt$MenuItem$4(MorkovskMenuItemVO morkovskMenuItemVO, Function1<? super AtomAction, Unit> function1, int i11) {
        super(2);
        this.$item = morkovskMenuItemVO;
        this.$actionHandler = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        MorkovskMenuWidgetComposableKt.MenuItem(this.$item, this.$actionHandler, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
