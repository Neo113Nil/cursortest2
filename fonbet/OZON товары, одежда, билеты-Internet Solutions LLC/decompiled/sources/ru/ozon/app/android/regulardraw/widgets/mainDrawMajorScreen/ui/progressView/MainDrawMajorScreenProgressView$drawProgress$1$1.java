package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.progressView;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.utils.UtilKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MainDrawMajorScreenProgressView$drawProgress$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Canvas $this_with;
    final /* synthetic */ MainDrawMajorScreenProgressView this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.progressView.MainDrawMajorScreenProgressView$drawProgress$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ Canvas $this_with;
        final /* synthetic */ MainDrawMajorScreenProgressView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Canvas canvas, MainDrawMajorScreenProgressView mainDrawMajorScreenProgressView) {
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
            MainDrawMajorScreenProgressViewPalette mainDrawMajorScreenProgressViewPalette;
            MainDrawMajorScreenProgressViewPalette mainDrawMajorScreenProgressViewPalette2;
            RectF rectF2;
            MainDrawMajorScreenProgressViewPalette mainDrawMajorScreenProgressViewPalette3;
            MainDrawMajorScreenProgressViewPalette mainDrawMajorScreenProgressViewPalette4;
            MainDrawMajorScreenProgressViewPalette mainDrawMajorScreenProgressViewPalette5;
            Canvas canvas = this.$this_with;
            rectF = this.this$0.progressRightBounds;
            float f7 = rectF.left;
            mainDrawMajorScreenProgressViewPalette = this.this$0.palette;
            float shadowInnerBlurRadius = f7 - mainDrawMajorScreenProgressViewPalette.getShadowInnerBlurRadius();
            mainDrawMajorScreenProgressViewPalette2 = this.this$0.palette;
            float shadowInnerBlurRadius2 = 0.0f - mainDrawMajorScreenProgressViewPalette2.getShadowInnerBlurRadius();
            rectF2 = this.this$0.progressRightBounds;
            float f11 = rectF2.left;
            mainDrawMajorScreenProgressViewPalette3 = this.this$0.palette;
            float shadowInnerBlurRadius3 = f11 - mainDrawMajorScreenProgressViewPalette3.getShadowInnerBlurRadius();
            float measuredHeight = this.this$0.getMeasuredHeight();
            mainDrawMajorScreenProgressViewPalette4 = this.this$0.palette;
            float shadowInnerBlurRadius4 = measuredHeight + mainDrawMajorScreenProgressViewPalette4.getShadowInnerBlurRadius();
            mainDrawMajorScreenProgressViewPalette5 = this.this$0.palette;
            canvas.drawLine(shadowInnerBlurRadius, shadowInnerBlurRadius2, shadowInnerBlurRadius3, shadowInnerBlurRadius4, mainDrawMajorScreenProgressViewPalette5.getProgressShadowPaint());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainDrawMajorScreenProgressView$drawProgress$1$1(Canvas canvas, MainDrawMajorScreenProgressView mainDrawMajorScreenProgressView) {
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
        Path path;
        Canvas canvas = this.$this_with;
        path = this.this$0.bgPath;
        UtilKt.drawWithClip(canvas, path, new AnonymousClass1(this.$this_with, this.this$0));
    }
}
