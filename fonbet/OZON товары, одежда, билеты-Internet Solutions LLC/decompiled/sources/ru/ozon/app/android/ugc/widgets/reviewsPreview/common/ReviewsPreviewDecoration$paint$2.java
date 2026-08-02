package ru.ozon.app.android.ugc.widgets.reviewsPreview.common;

import Pk0.h;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewsPreviewDecoration$paint$2 extends AbstractC7737t implements Function0<Paint> {
    public static final ReviewsPreviewDecoration$paint$2 INSTANCE = new ReviewsPreviewDecoration$paint$2();

    ReviewsPreviewDecoration$paint$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Paint invoke() {
        Paint a11 = h.a(true);
        a11.setStyle(Paint.Style.FILL);
        return a11;
    }
}
