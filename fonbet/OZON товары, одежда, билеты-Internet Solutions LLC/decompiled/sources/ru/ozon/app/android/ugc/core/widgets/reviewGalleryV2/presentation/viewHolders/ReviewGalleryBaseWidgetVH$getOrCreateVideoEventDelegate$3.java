package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryBaseWidgetVH$getOrCreateVideoEventDelegate$3 extends AbstractC7737t implements Function0<Long> {
    final /* synthetic */ ReviewGalleryBaseWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryBaseWidgetVH$getOrCreateVideoEventDelegate$3(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        super(0);
        this.this$0 = reviewGalleryBaseWidgetVH;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        P<Long> videoDuration;
        VideoMoleculeViewHolder videoHolder = this.this$0.getVideoHolder();
        if (videoHolder == null || (videoDuration = videoHolder.getVideoDuration()) == null) {
            return null;
        }
        return videoDuration.getValue();
    }
}
