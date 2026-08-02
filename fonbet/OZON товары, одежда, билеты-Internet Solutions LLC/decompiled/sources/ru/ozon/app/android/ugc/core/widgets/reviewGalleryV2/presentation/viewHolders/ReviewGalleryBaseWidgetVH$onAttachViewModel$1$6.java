package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryHasAudioUpdateKey;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "hasAudio", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryBaseWidgetVH$onAttachViewModel$1$6 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ ReviewGalleryBaseWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryBaseWidgetVH$onAttachViewModel$1$6(ReviewGalleryBaseWidgetVH reviewGalleryBaseWidgetVH) {
        super(1);
        this.this$0 = reviewGalleryBaseWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        boolean z11;
        ReviewGalleryVO boundData;
        ComposerReferences composerReferences;
        z11 = this.this$0.isSkippedFirst;
        if ((z11 || bool.booleanValue()) && (boundData = this.this$0.getBoundData()) != null) {
            long id2 = boundData.getId();
            composerReferences = this.this$0.refs;
            InterfaceC7851b controller = composerReferences.getController();
            Intrinsics.f(bool);
            controller.update(new ReviewGalleryHasAudioUpdateKey(id2, bool.booleanValue()));
        }
        this.this$0.isSkippedFirst = true;
    }
}
