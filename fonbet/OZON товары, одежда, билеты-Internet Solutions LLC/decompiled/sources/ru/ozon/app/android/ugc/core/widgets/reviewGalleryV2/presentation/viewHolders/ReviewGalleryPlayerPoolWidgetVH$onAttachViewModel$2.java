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
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "releasedForPosition", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$2", f = "ReviewGalleryPlayerPoolWidgetVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$2 extends j implements Function2<Integer, d<? super Unit>, Object> {
    final /* synthetic */ ReviewGalleryVO $item;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ ReviewGalleryPlayerPoolWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$2(ReviewGalleryPlayerPoolWidgetVH reviewGalleryPlayerPoolWidgetVH, ReviewGalleryVO reviewGalleryVO, d<? super ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$2> dVar) {
        super(2, dVar);
        this.this$0 = reviewGalleryPlayerPoolWidgetVH;
        this.$item = reviewGalleryVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$2 reviewGalleryPlayerPoolWidgetVH$onAttachViewModel$2 = new ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$2(this.this$0, this.$item, dVar);
        reviewGalleryPlayerPoolWidgetVH$onAttachViewModel$2.I$0 = ((Number) obj).intValue();
        return reviewGalleryPlayerPoolWidgetVH$onAttachViewModel$2;
    }

    public final Object invoke(int i11, d<? super Unit> dVar) {
        return ((ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$2) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VideoMolecule video;
        ReviewGalleryV2MainViewModel reviewGalleryV2MainViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (this.this$0.getAdapterPosition() == this.I$0 && (video = this.$item.getContent().getVideo()) != null) {
            ReviewGalleryPlayerPoolWidgetVH reviewGalleryPlayerPoolWidgetVH = this.this$0;
            reviewGalleryPlayerPoolWidgetVH.buildVideo(video, this.$item.getIsCompactControls());
            VideoMoleculeViewHolder videoHolder = reviewGalleryPlayerPoolWidgetVH.getVideoHolder();
            if (videoHolder != null) {
                reviewGalleryV2MainViewModel = reviewGalleryPlayerPoolWidgetVH.mainViewModel;
                reviewGalleryPlayerPoolWidgetVH.setSoundState(videoHolder, reviewGalleryV2MainViewModel.isMuted());
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
        return invoke(num.intValue(), dVar);
    }
}
