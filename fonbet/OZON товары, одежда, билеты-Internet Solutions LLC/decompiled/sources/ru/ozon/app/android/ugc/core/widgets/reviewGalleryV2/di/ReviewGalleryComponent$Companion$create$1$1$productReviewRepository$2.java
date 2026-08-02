package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ProductReviewRepository;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ProductReviewRepository;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryComponent$Companion$create$1$1$productReviewRepository$2 extends AbstractC7737t implements Function0<ProductReviewRepository> {
    final /* synthetic */ NetworkComponentApi $networkComponentApi;
    final /* synthetic */ ReviewGalleryComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryComponent$Companion$create$1$1$productReviewRepository$2(ReviewGalleryComponent$Companion$create$1$1 reviewGalleryComponent$Companion$create$1$1, NetworkComponentApi networkComponentApi) {
        super(0);
        this.this$0 = reviewGalleryComponent$Companion$create$1$1;
        this.$networkComponentApi = networkComponentApi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProductReviewRepository invoke() {
        ActionV2Repository actionV2Repository;
        actionV2Repository = this.this$0.getActionV2Repository();
        return new ProductReviewRepository(actionV2Repository, this.$networkComponentApi.getJsonDeserializer());
    }
}
