package ru.ozon.uni.foundation.components.image;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationImageKt$FoundationLoadingImage$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ float $gradientWidth;
    final /* synthetic */ e $modifier;
    final /* synthetic */ float $ratio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationImageKt$FoundationLoadingImage$2(e eVar, float f7, long j11, float f11, float f12, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$ratio = f7;
        this.$backgroundColor = j11;
        this.$cornerRadius = f11;
        this.$gradientWidth = f12;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationImageKt.m3000FoundationLoadingImageWqkqGGM(this.$modifier, this.$ratio, this.$backgroundColor, this.$cornerRadius, this.$gradientWidth, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
