package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryViewMapper$getReviewGalleryViewHolder$3 extends AbstractC7737t implements Function0<UgcCachedActionsSharedViewModel> {
    final /* synthetic */ ReviewGalleryViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryViewMapper$getReviewGalleryViewHolder$3(ReviewGalleryViewMapper reviewGalleryViewMapper) {
        super(0);
        this.this$0 = reviewGalleryViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final UgcCachedActionsSharedViewModel invoke() {
        return this.this$0.component().getUgcCachedActionsSharedViewModel().get();
    }
}
