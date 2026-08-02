package ru.ozon.app.android.ugc.widgets.reviewsPreview.video;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import kotlin.random.d;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewsPreviewVideoVH$onViewInOverlapBounds$1$2 extends AbstractC7737t implements Function0<Integer> {
    public static final ReviewsPreviewVideoVH$onViewInOverlapBounds$1$2 INSTANCE = new ReviewsPreviewVideoVH$onViewInOverlapBounds$1$2();

    ReviewsPreviewVideoVH$onViewInOverlapBounds$1$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        IntRange intRange = new IntRange(0, 1, 1);
        c.Companion random = c.INSTANCE;
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return Integer.valueOf(d.b(random, intRange));
        } catch (IllegalArgumentException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }
}
