package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.progressView;

import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MainDrawMajorScreenProgressView$drawBackground$1$3 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Canvas $this_with;
    final /* synthetic */ MainDrawMajorScreenProgressView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainDrawMajorScreenProgressView$drawBackground$1$3(Canvas canvas, MainDrawMajorScreenProgressView mainDrawMajorScreenProgressView) {
        super(0);
        this.$this_with = canvas;
        this.this$0 = mainDrawMajorScreenProgressView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        RectF rectF;
        int i11;
        RectF rectF2;
        int i12;
        RectF rectF3;
        int i13;
        RectF rectF4;
        int i14;
        MainDrawMajorScreenProgressViewPalette mainDrawMajorScreenProgressViewPalette;
        MainDrawMajorScreenProgressViewPalette mainDrawMajorScreenProgressViewPalette2;
        MainDrawMajorScreenProgressViewPalette mainDrawMajorScreenProgressViewPalette3;
        Canvas canvas = this.$this_with;
        rectF = this.this$0.bgRectBounds;
        float f7 = rectF.left;
        i11 = MainDrawMajorScreenProgressView.shadowPadding;
        float f11 = f7 + i11;
        rectF2 = this.this$0.bgRectBounds;
        float f12 = rectF2.top;
        i12 = MainDrawMajorScreenProgressView.shadowPadding;
        float f13 = f12 + (i12 * 2);
        rectF3 = this.this$0.bgRectBounds;
        float f14 = rectF3.right;
        i13 = MainDrawMajorScreenProgressView.shadowPadding;
        float f15 = f14 + (i13 / 3);
        rectF4 = this.this$0.bgRectBounds;
        float f16 = rectF4.bottom;
        i14 = MainDrawMajorScreenProgressView.shadowPadding;
        float f17 = f16 + (i14 / 2);
        mainDrawMajorScreenProgressViewPalette = this.this$0.palette;
        float cornerRadius = mainDrawMajorScreenProgressViewPalette.getCornerRadius();
        mainDrawMajorScreenProgressViewPalette2 = this.this$0.palette;
        float cornerRadius2 = mainDrawMajorScreenProgressViewPalette2.getCornerRadius();
        mainDrawMajorScreenProgressViewPalette3 = this.this$0.palette;
        canvas.drawRoundRect(f11, f13, f15, f17, cornerRadius, cornerRadius2, mainDrawMajorScreenProgressViewPalette3.getOuterShadowPaint());
    }
}
