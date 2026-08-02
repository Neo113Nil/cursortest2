package ru.ozon.uni.components.productMedia;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniProductMediaKt$Label$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ String $label;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ T $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniProductMediaKt$Label$2(String str, float f7, T t2, long j11, int i11, int i12, int i13) {
        super(2);
        this.$label = str;
        this.$horizontalPadding = f7;
        this.$textStyle = t2;
        this.$color = j11;
        this.$maxLines = i11;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniProductMediaKt.m1930LabelLyZNIlQ(this.$label, this.$horizontalPadding, this.$textStyle, this.$color, this.$maxLines, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
