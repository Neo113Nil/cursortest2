package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view;

import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PinnedReviewDecorator$paint$2 extends AbstractC7737t implements Function0<Paint> {
    final /* synthetic */ PinnedReviewDecorator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PinnedReviewDecorator$paint$2(PinnedReviewDecorator pinnedReviewDecorator) {
        super(0);
        this.this$0 = pinnedReviewDecorator;
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
