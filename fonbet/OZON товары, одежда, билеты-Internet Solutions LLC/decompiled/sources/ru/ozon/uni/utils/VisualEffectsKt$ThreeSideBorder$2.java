package ru.ozon.uni.utils;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class VisualEffectsKt$ThreeSideBorder$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $borderColor;
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VisualEffectsKt$ThreeSideBorder$2(float f7, long j11, float f11, e eVar, int i11) {
        super(2);
        this.$borderWidth = f7;
        this.$borderColor = j11;
        this.$cornerRadius = f11;
        this.$modifier = eVar;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VisualEffectsKt.m3267ThreeSideBordera_Az1LM(this.$borderWidth, this.$borderColor, this.$cornerRadius, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
