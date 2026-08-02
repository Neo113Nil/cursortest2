package ru.ozon.uni.components.productMedia;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniProductMediaKt$Icon$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AbstractC8972b $graphic;
    final /* synthetic */ long $graphicColor;
    final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniProductMediaKt$Icon$1(AbstractC8972b abstractC8972b, long j11, float f7, int i11) {
        super(2);
        this.$graphic = abstractC8972b;
        this.$graphicColor = j11;
        this.$size = f7;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniProductMediaKt.m1929IconRFCenO8(this.$graphic, this.$graphicColor, this.$size, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
