package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.MainDrawMajorScreenBg;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MainDrawMajorScreenBg$drawShadow$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Canvas $this_drawShadow;
    final /* synthetic */ MainDrawMajorScreenBg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainDrawMajorScreenBg$drawShadow$2(Canvas canvas, MainDrawMajorScreenBg mainDrawMajorScreenBg) {
        super(0);
        this.$this_drawShadow = canvas;
        this.this$0 = mainDrawMajorScreenBg;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        MainDrawMajorScreenBg.Companion companion;
        RectF rectF4;
        MainDrawMajorScreenBg.Companion companion2;
        MainDrawMajorScreenBg.Companion companion3;
        MainDrawMajorScreenBg.Companion companion4;
        MainDrawMajorScreenBgPalette mainDrawMajorScreenBgPalette;
        Canvas canvas = this.$this_drawShadow;
        rectF = this.this$0.rectF;
        float f7 = rectF.left;
        rectF2 = this.this$0.rectF;
        float f11 = rectF2.top;
        rectF3 = this.this$0.rectF;
        float f12 = rectF3.right;
        companion = MainDrawMajorScreenBg.Companion;
        float shadowOffset = f12 + companion.getShadowOffset();
        rectF4 = this.this$0.rectF;
        float f13 = rectF4.bottom;
        companion2 = MainDrawMajorScreenBg.Companion;
        float shadowOffset2 = f13 + companion2.getShadowOffset();
        companion3 = MainDrawMajorScreenBg.Companion;
        float cornerRadius = companion3.getCornerRadius();
        companion4 = MainDrawMajorScreenBg.Companion;
        float cornerRadius2 = companion4.getCornerRadius();
        mainDrawMajorScreenBgPalette = this.this$0.palette;
        canvas.drawRoundRect(f7, f11, shadowOffset, shadowOffset2, cornerRadius, cornerRadius2, mainDrawMajorScreenBgPalette.getInnerLightShadowPaint());
    }
}
