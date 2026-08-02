package ru.ozon.app.android.pdpvideomolecule.presentation.view.controlpanel;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/graphics/Canvas;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class VideoMoleculeTimeBar$onDraw$1 extends AbstractC7737t implements Function1<Canvas, Unit> {
    final /* synthetic */ VideoMoleculeTimeBar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoMoleculeTimeBar$onDraw$1(VideoMoleculeTimeBar videoMoleculeTimeBar) {
        super(1);
        this.this$0 = videoMoleculeTimeBar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
        invoke2(canvas);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Canvas withCornersClippingIfNeeded) {
        Intrinsics.checkNotNullParameter(withCornersClippingIfNeeded, "$this$withCornersClippingIfNeeded");
        this.this$0.drawTimeBar(withCornersClippingIfNeeded);
        this.this$0.drawPlayhead(withCornersClippingIfNeeded);
    }
}
