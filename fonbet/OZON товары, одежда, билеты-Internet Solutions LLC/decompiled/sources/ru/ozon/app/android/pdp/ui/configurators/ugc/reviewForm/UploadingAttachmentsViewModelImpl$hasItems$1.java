package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel$ViewState;", "it", "", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel$ViewState;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class UploadingAttachmentsViewModelImpl$hasItems$1 extends AbstractC7737t implements Function1<UploadingAttachmentsViewModel.ViewState, Boolean> {
    public static final UploadingAttachmentsViewModelImpl$hasItems$1 INSTANCE = new UploadingAttachmentsViewModelImpl$hasItems$1();

    UploadingAttachmentsViewModelImpl$hasItems$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UploadingAttachmentsViewModel.ViewState viewState) {
        List<AttachmentVO> attachments;
        boolean z11 = false;
        if (viewState != null && (attachments = viewState.getAttachments()) != null && (!attachments.isEmpty())) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
