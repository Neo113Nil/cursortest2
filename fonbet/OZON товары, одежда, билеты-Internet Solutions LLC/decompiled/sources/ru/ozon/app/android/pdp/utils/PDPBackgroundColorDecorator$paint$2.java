package ru.ozon.app.android.pdp.utils;

import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PDPBackgroundColorDecorator$paint$2 extends AbstractC7737t implements Function0<Paint> {
    final /* synthetic */ PDPBackgroundColorDecorator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PDPBackgroundColorDecorator$paint$2(PDPBackgroundColorDecorator pDPBackgroundColorDecorator) {
        super(0);
        this.this$0 = pDPBackgroundColorDecorator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Paint invoke() {
        int backgroundColor;
        Paint paint = new Paint();
        backgroundColor = this.this$0.getBackgroundColor();
        paint.setColor(backgroundColor);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }
}
