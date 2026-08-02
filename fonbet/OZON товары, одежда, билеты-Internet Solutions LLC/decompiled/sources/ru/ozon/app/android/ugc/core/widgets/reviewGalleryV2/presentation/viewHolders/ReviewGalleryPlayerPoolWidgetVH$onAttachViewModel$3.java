package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "renderedVideoPosition", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$3", f = "ReviewGalleryPlayerPoolWidgetVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$3 extends j implements Function2<Integer, d<? super Unit>, Object> {
    final /* synthetic */ ReviewGalleryVO $item;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ ReviewGalleryPlayerPoolWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$3(ReviewGalleryPlayerPoolWidgetVH reviewGalleryPlayerPoolWidgetVH, ReviewGalleryVO reviewGalleryVO, d<? super ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$3> dVar) {
        super(2, dVar);
        this.this$0 = reviewGalleryPlayerPoolWidgetVH;
        this.$item = reviewGalleryVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$3 reviewGalleryPlayerPoolWidgetVH$onAttachViewModel$3 = new ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$3(this.this$0, this.$item, dVar);
        reviewGalleryPlayerPoolWidgetVH$onAttachViewModel$3.I$0 = ((Number) obj).intValue();
        return reviewGalleryPlayerPoolWidgetVH$onAttachViewModel$3;
    }

    public final Object invoke(int i11, d<? super Unit> dVar) {
        return ((ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$3) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VideoMolecule video;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        int i11 = this.I$0;
        int adapterPosition = this.this$0.getAdapterPosition();
        if (adapterPosition >= 0 && Math.abs(i11 - adapterPosition) == 1 && this.this$0.getVideoHolder() == null && (video = this.$item.getContent().getVideo()) != null) {
            ReviewGalleryPlayerPoolWidgetVH reviewGalleryPlayerPoolWidgetVH = this.this$0;
            ReviewGalleryVO reviewGalleryVO = this.$item;
            if (reviewGalleryPlayerPoolWidgetVH.playerPoolViewModel.shouldAskHoldersToReleasePlayer()) {
                reviewGalleryPlayerPoolWidgetVH.playerPoolViewModel.onPositionForPlayerRequested(adapterPosition);
            } else {
                reviewGalleryPlayerPoolWidgetVH.buildVideo(video, reviewGalleryVO.getIsCompactControls());
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
        return invoke(num.intValue(), dVar);
    }
}
