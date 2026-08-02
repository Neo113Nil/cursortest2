package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.presentation.ReviewGalleryPreviewVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewGalleryPreviewWidgetVH$bind$view$4 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ ReviewGalleryPreviewVO.MediaContentVO $media;
    final /* synthetic */ ReviewGalleryPreviewWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryPreviewWidgetVH$bind$view$4(ReviewGalleryPreviewVO.MediaContentVO mediaContentVO, ReviewGalleryPreviewWidgetVH reviewGalleryPreviewWidgetVH) {
        super(1);
        this.$media = mediaContentVO;
        this.this$0 = reviewGalleryPreviewWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        AtomAction atomAction;
        Function1 function1;
        AtomActionDTO action = ((ReviewGalleryPreviewVO.MediaContentVO.ImageVO) this.$media).getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, null)) == null) {
            return;
        }
        function1 = this.this$0.onAction;
        function1.invoke(atomAction);
    }
}
