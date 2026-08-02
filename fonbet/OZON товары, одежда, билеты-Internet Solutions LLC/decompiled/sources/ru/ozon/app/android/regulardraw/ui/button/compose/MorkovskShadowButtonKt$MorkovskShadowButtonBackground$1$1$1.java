package ru.ozon.app.android.regulardraw.ui.button.compose;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class MorkovskShadowButtonKt$MorkovskShadowButtonBackground$1$1$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ BlurMaskFilter $blurMaskFilter;
    final /* synthetic */ ThemeColors $colors;
    final /* synthetic */ float $cornerRadiusPx;
    final /* synthetic */ Paint $paint;
    final /* synthetic */ float $shadowOffsetPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskShadowButtonKt$MorkovskShadowButtonBackground$1$1$1(float f7, float f11, Paint paint, BlurMaskFilter blurMaskFilter, ThemeColors themeColors) {
        super(1);
        this.$cornerRadiusPx = f7;
        this.$shadowOffsetPx = f11;
        this.$paint = paint;
        this.$blurMaskFilter = blurMaskFilter;
        this.$colors = themeColors;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        MorkovskShadowButtonKt.drawMorkovskBlurButtonShadows(Canvas, C7464j.f(Canvas.i()), C7464j.d(Canvas.i()), this.$cornerRadiusPx, this.$shadowOffsetPx, this.$paint, this.$blurMaskFilter, this.$colors);
    }
}
