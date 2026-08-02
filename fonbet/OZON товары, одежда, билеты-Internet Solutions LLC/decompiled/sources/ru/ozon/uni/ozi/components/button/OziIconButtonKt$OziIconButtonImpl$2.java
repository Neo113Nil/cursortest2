package ru.ozon.uni.ozi.components.button;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.ozi.components.button.presets.OziIconButtonShape;
import ru.ozon.uni.ozi.components.button.presets.size.OziIconButtonSize;
import ru.ozon.uni.ozi.components.button.presets.style.OziIconButtonStyle;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziIconButtonKt$OziIconButtonImpl$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ OziIconButtonShape $shape;
    final /* synthetic */ OziIconButtonSize $size;
    final /* synthetic */ OziIconButtonStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziIconButtonKt$OziIconButtonImpl$2(e eVar, AbstractC8972b abstractC8972b, boolean z11, boolean z12, OziIconButtonShape oziIconButtonShape, OziIconButtonStyle oziIconButtonStyle, OziIconButtonSize oziIconButtonSize, q qVar, Function0<Unit> function0, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$icon = abstractC8972b;
        this.$isLoading = z11;
        this.$enabled = z12;
        this.$shape = oziIconButtonShape;
        this.$style = oziIconButtonStyle;
        this.$size = oziIconButtonSize;
        this.$interactionSource = qVar;
        this.$onClick = function0;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziIconButtonKt.OziIconButtonImpl(this.$modifier, this.$icon, this.$isLoading, this.$enabled, this.$shape, this.$style, this.$size, this.$interactionSource, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
