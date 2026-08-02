package ru.ozon.app.android.regulardraw.ui.button.compose;

import S0.InterfaceC3967k;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import n0.C8392m;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class MorkovskShadowButtonKt$MorkovskShadowButtonBackground$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ BlurMaskFilter $blurMaskFilter;
    final /* synthetic */ ThemeColors $colors;
    final /* synthetic */ float $cornerRadiusPx;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Paint $paint;
    final /* synthetic */ float $shadowOffsetPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskShadowButtonKt$MorkovskShadowButtonBackground$1(e eVar, float f7, float f11, Paint paint, BlurMaskFilter blurMaskFilter, ThemeColors themeColors) {
        super(2);
        this.$modifier = eVar;
        this.$cornerRadiusPx = f7;
        this.$shadowOffsetPx = f11;
        this.$paint = paint;
        this.$blurMaskFilter = blurMaskFilter;
        this.$colors = themeColors;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e d11 = a0.d(this.$modifier);
        interfaceC3967k.o(-1235344501);
        boolean q11 = interfaceC3967k.q(this.$cornerRadiusPx) | interfaceC3967k.q(this.$shadowOffsetPx) | interfaceC3967k.F(this.$paint) | interfaceC3967k.F(this.$blurMaskFilter) | interfaceC3967k.n(this.$colors);
        float f7 = this.$cornerRadiusPx;
        float f11 = this.$shadowOffsetPx;
        Paint paint = this.$paint;
        BlurMaskFilter blurMaskFilter = this.$blurMaskFilter;
        ThemeColors themeColors = this.$colors;
        Object C11 = interfaceC3967k.C();
        if (q11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new MorkovskShadowButtonKt$MorkovskShadowButtonBackground$1$1$1(f7, f11, paint, blurMaskFilter, themeColors);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        C8392m.a(d11, (Function1) C11, interfaceC3967k, 0);
    }
}
