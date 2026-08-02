package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.platform.image.ImageResizer;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class UploadingAttachmentsViewModelImpl$resizeImage$1 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ AttachmentVO.AttachedImageVO $attach;
    final /* synthetic */ UploadingAttachmentsViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadingAttachmentsViewModelImpl$resizeImage$1(UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl, AttachmentVO.AttachedImageVO attachedImageVO) {
        super(0);
        this.this$0 = uploadingAttachmentsViewModelImpl;
        this.$attach = attachedImageVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ImageResizer imageResizer;
        imageResizer = this.this$0.imageResizer;
        return imageResizer.resize(this.$attach.getMediaUri(), 1200.0f);
    }
}
