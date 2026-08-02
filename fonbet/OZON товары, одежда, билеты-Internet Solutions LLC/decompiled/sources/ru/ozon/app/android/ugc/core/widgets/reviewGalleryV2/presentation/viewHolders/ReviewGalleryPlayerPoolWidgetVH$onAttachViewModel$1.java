package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isFirstFrameRendered", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ ReviewGalleryPlayerPoolWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPlayerPoolWidgetVH$onAttachViewModel$1(ReviewGalleryPlayerPoolWidgetVH reviewGalleryPlayerPoolWidgetVH) {
        super(1);
        this.this$0 = reviewGalleryPlayerPoolWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        VideoMoleculePlayerDelegate videoMoleculePlayerDelegate;
        ReviewGalleryV2MainViewModel reviewGalleryV2MainViewModel;
        if (bool.booleanValue()) {
            videoMoleculePlayerDelegate = this.this$0.playerDelegate;
            videoMoleculePlayerDelegate.setWasVideoRendered(true);
            int adapterPosition = this.this$0.getAdapterPosition();
            reviewGalleryV2MainViewModel = this.this$0.mainViewModel;
            Integer value = reviewGalleryV2MainViewModel.getCurrentItemPosition().getValue();
            if (value != null && adapterPosition == value.intValue()) {
                this.this$0.playerPoolViewModel.onVideoRenderedForPosition(adapterPosition);
            }
        }
    }
}
