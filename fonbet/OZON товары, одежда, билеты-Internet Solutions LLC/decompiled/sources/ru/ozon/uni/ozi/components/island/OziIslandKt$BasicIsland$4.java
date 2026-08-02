package ru.ozon.uni.ozi.components.island;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.island.presets.OziIslandCorners;
import ru.ozon.uni.ozi.components.island.presets.OziIslandStyle;
import t0.q;
import u0.InterfaceC9914x;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziIslandKt$BasicIsland$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $content;
    final /* synthetic */ InterfaceC9914x $contentPadding;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Set<OziIslandCorners> $roundedCorners;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ OziIslandStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziIslandKt$BasicIsland$4(e eVar, boolean z11, Function0<Unit> function0, OziIslandStyle oziIslandStyle, float f7, Set<? extends OziIslandCorners> set, InterfaceC9914x interfaceC9914x, q qVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$selected = z11;
        this.$onClick = function0;
        this.$style = oziIslandStyle;
        this.$cornerRadius = f7;
        this.$roundedCorners = set;
        this.$contentPadding = interfaceC9914x;
        this.$interactionSource = qVar;
        this.$content = function2;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziIslandKt.m3102BasicIslandGHTll3U(this.$modifier, this.$selected, this.$onClick, this.$style, this.$cornerRadius, this.$roundedCorners, this.$contentPadding, this.$interactionSource, this.$content, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
