package ru.ozon.uni.ozi.components.navBar.addons;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.navBar.presets.OziNavBarAlignment;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NavBarPartKt$NavBarPart$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ OziNavBarAlignment $alignment;
    final /* synthetic */ String $blueprintId;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $centerContent;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $endContent;
    final /* synthetic */ NavBarFloor $floor;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $startContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavBarPartKt$NavBarPart$3(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, String str, OziNavBarAlignment oziNavBarAlignment, NavBarFloor navBarFloor, e eVar, int i11, int i12) {
        super(2);
        this.$startContent = function2;
        this.$centerContent = function22;
        this.$endContent = function23;
        this.$blueprintId = str;
        this.$alignment = oziNavBarAlignment;
        this.$floor = navBarFloor;
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
        NavBarPartKt.NavBarPart(this.$startContent, this.$centerContent, this.$endContent, this.$blueprintId, this.$alignment, this.$floor, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
