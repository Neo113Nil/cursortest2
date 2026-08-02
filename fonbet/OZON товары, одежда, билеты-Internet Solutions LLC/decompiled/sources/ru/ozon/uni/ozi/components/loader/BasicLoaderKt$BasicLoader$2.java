package ru.ozon.uni.ozi.components.loader;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BasicLoaderKt$BasicLoader$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ float $innerSize;
    final /* synthetic */ e $modifier;
    final /* synthetic */ float $outerSize;
    final /* synthetic */ float $strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicLoaderKt$BasicLoader$2(e eVar, long j11, float f7, float f11, float f12, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$color = j11;
        this.$outerSize = f7;
        this.$innerSize = f11;
        this.$strokeWidth = f12;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        BasicLoaderKt.m3107BasicLoaderFandsMM(this.$modifier, this.$color, this.$outerSize, this.$innerSize, this.$strokeWidth, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
