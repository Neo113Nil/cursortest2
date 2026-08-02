package ru.ozon.uni.ozi.components.icon;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import q1.AbstractC8972b;
import ru.ozon.uni.ozi.components.icon.presets.IconContent;
import ru.ozon.uni.ozi.components.icon.presets.OziIconBorder;
import ru.ozon.uni.ozi.components.icon.presets.OziIconShape;
import ru.ozon.uni.ozi.components.icon.presets.OziIconSize;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziIconKt$OziIconImpl$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C7807Z $backgroundColor;
    final /* synthetic */ AbstractC8972b $backgroundImage;
    final /* synthetic */ IconContent $content;
    final /* synthetic */ boolean $hasParanja;
    final /* synthetic */ e $modifier;
    final /* synthetic */ OziIconShape $shape;
    final /* synthetic */ OziIconSize $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziIconKt$OziIconImpl$1(e eVar, IconContent iconContent, AbstractC8972b abstractC8972b, OziIconShape oziIconShape, OziIconBorder oziIconBorder, boolean z11, C7807Z c7807z, OziIconSize oziIconSize, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$content = iconContent;
        this.$backgroundImage = abstractC8972b;
        this.$shape = oziIconShape;
        this.$hasParanja = z11;
        this.$backgroundColor = c7807z;
        this.$size = oziIconSize;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziIconKt.m3085OziIconImplPIknLig(this.$modifier, this.$content, this.$backgroundImage, this.$shape, null, this.$hasParanja, this.$backgroundColor, this.$size, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
