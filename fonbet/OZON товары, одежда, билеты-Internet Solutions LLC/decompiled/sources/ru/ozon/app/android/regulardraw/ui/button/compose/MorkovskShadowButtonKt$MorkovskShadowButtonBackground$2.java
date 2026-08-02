package ru.ozon.app.android.regulardraw.ui.button.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.InterfaceC9893b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MorkovskShadowButtonKt$MorkovskShadowButtonBackground$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BlurMaskFilter $blurMaskFilter;
    final /* synthetic */ ThemeColors $colors;
    final /* synthetic */ float $cornerRadiusPx;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Paint $paint;
    final /* synthetic */ float $shadowOffsetPx;
    final /* synthetic */ InterfaceC9893b $this_MorkovskShadowButtonBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskShadowButtonKt$MorkovskShadowButtonBackground$2(InterfaceC9893b interfaceC9893b, float f7, float f11, Paint paint, BlurMaskFilter blurMaskFilter, ThemeColors themeColors, e eVar, int i11, int i12) {
        super(2);
        this.$this_MorkovskShadowButtonBackground = interfaceC9893b;
        this.$cornerRadiusPx = f7;
        this.$shadowOffsetPx = f11;
        this.$paint = paint;
        this.$blurMaskFilter = blurMaskFilter;
        this.$colors = themeColors;
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
        MorkovskShadowButtonKt.MorkovskShadowButtonBackground(this.$this_MorkovskShadowButtonBackground, this.$cornerRadiusPx, this.$shadowOffsetPx, this.$paint, this.$blurMaskFilter, this.$colors, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
