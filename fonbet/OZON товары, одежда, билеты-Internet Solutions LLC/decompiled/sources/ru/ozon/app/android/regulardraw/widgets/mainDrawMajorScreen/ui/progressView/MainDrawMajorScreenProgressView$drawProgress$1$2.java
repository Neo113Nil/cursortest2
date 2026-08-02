package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.progressView;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MainDrawMajorScreenProgressView$drawProgress$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Canvas $canvas;
    final /* synthetic */ MainDrawMajorScreenProgressView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainDrawMajorScreenProgressView$drawProgress$1$2(MainDrawMajorScreenProgressView mainDrawMajorScreenProgressView, Canvas canvas) {
        super(0);
        this.this$0 = mainDrawMajorScreenProgressView;
        this.$canvas = canvas;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MainDrawMajorScreenProgressViewPalette mainDrawMajorScreenProgressViewPalette;
        mainDrawMajorScreenProgressViewPalette = this.this$0.palette;
        mainDrawMajorScreenProgressViewPalette.getGradientProgress().draw(this.$canvas);
    }
}
