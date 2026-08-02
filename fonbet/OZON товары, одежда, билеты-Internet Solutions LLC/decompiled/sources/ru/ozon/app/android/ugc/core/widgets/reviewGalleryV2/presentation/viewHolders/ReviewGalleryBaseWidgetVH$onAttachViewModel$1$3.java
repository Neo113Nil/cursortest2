package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.VideoEventDelegate;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryBaseWidgetVH$onAttachViewModel$1$3 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ ReviewGalleryBaseWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryBaseWidgetVH$onAttachViewModel$1$3(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        super(1);
        this.this$0 = reviewGalleryBaseWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        VideoEventDelegate videoEventDelegate = this.this$0.videoEventDelegate;
        if (videoEventDelegate != null) {
            videoEventDelegate.logAutoscroll();
        }
        RecyclerView composerRecycler = this.this$0.getComposerRecycler();
        if (composerRecycler != null) {
            Intrinsics.f(num);
            composerRecycler.smoothScrollToPosition(num.intValue());
        }
    }
}
