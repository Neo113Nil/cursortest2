package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryBaseWidgetVH$getOrCreateVideoEventDelegate$1 extends AbstractC7737t implements Function0<Map<String, ? extends TokenizedTrackingInfo>> {
    final /* synthetic */ ReviewGalleryBaseWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryBaseWidgetVH$getOrCreateVideoEventDelegate$1(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        super(0);
        this.this$0 = reviewGalleryBaseWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends TokenizedTrackingInfo> invoke() {
        ReviewGalleryVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            return boundData.getTrackingInfo();
        }
        return null;
    }
}
