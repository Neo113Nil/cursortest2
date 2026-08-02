package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryMapper;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryComponent$Companion$create$1$1$reviewGalleryMapper$2 extends AbstractC7737t implements Function0<ReviewGalleryMapper> {
    final /* synthetic */ AppType $appType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryComponent$Companion$create$1$1$reviewGalleryMapper$2(AppType appType) {
        super(0);
        this.$appType = appType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ReviewGalleryMapper invoke() {
        return new ReviewGalleryMapper(this.$appType);
    }
}
