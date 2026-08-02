package ru.ozon.uni.ozi.components.badge;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.ozi.components.badge.presets.OziBadgeSize;
import ru.ozon.uni.ozi.components.badge.presets.OziBadgeStyle;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziBadgeKt$OziBadgeImpl$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $label;
    final /* synthetic */ e $modifier;
    final /* synthetic */ boolean $numeric;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ boolean $showChevron;
    final /* synthetic */ OziBadgeSize $size;
    final /* synthetic */ AbstractC8972b $startGraphic;
    final /* synthetic */ OziBadgeStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziBadgeKt$OziBadgeImpl$1(String str, boolean z11, Function0<Unit> function0, e eVar, AbstractC8972b abstractC8972b, OziBadgeStyle oziBadgeStyle, boolean z12, OziBadgeSize oziBadgeSize, int i11, int i12) {
        super(2);
        this.$label = str;
        this.$showChevron = z11;
        this.$onClick = function0;
        this.$modifier = eVar;
        this.$startGraphic = abstractC8972b;
        this.$style = oziBadgeStyle;
        this.$numeric = z12;
        this.$size = oziBadgeSize;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziBadgeKt.OziBadgeImpl(this.$label, this.$showChevron, this.$onClick, this.$modifier, this.$startGraphic, this.$style, this.$numeric, this.$size, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
