package ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation;

import Ae.w0;
import Sc.o;
import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Content;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerEvent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.SingleEvent;
import ru.ozon.uni.android.haptic.HapticToken;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel$onMediaPickerEvent$1", f = "ReviewFormViewModel.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormViewModel$onMediaPickerEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ MediaPickerEvent $event;
    int label;
    final /* synthetic */ ReviewFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormViewModel$onMediaPickerEvent$1(MediaPickerEvent mediaPickerEvent, ReviewFormViewModel reviewFormViewModel, d<? super ReviewFormViewModel$onMediaPickerEvent$1> dVar) {
        super(2, dVar);
        this.$event = mediaPickerEvent;
        this.this$0 = reviewFormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormViewModel$onMediaPickerEvent$1(this.$event, this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReviewFormData reviewFormData;
        ReviewFormRepository reviewFormRepository;
        ReviewFormData.CachedMedia cachedMedia;
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            MediaPickerEvent mediaPickerEvent = this.$event;
            if (mediaPickerEvent instanceof MediaPickerEvent.UploadingStateUpdated) {
                this.this$0.setMediaLoading(((MediaPickerEvent.UploadingStateUpdated) mediaPickerEvent).getIsUploading());
            } else if (mediaPickerEvent instanceof MediaPickerEvent.UploadFailed) {
                w0Var = this.this$0._singleEvent;
                SingleEvent.ShowError showError = new SingleEvent.ShowError(((MediaPickerEvent.UploadFailed) this.$event).getNotification(), HapticToken.ERROR);
                this.label = 1;
                if (w0Var.emit(showError, this) == aVar) {
                    return aVar;
                }
            } else {
                if (!(mediaPickerEvent instanceof MediaPickerEvent.AttachmentsUpdated)) {
                    throw new o();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                List<AttachmentVO> attachments = ((MediaPickerEvent.AttachmentsUpdated) this.$event).getAttachments();
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = attachments.iterator();
                while (true) {
                    r6 = null;
                    ReviewFormData.CachedMedia cachedMedia2 = null;
                    if (it.hasNext()) {
                        AttachmentVO attachmentVO = (AttachmentVO) it.next();
                        if (attachmentVO instanceof AttachmentVO.AttachedImageVO) {
                            AttachmentVO.AttachedImageVO attachedImageVO = (AttachmentVO.AttachedImageVO) attachmentVO;
                            String uri = attachedImageVO.getMediaUri().toString();
                            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                            String url = attachedImageVO.getUrl();
                            if (url != null) {
                                Integer width = attachedImageVO.getWidth();
                                String num = width != null ? width.toString() : null;
                                Integer height = attachedImageVO.getHeight();
                                Content.Photo photo = new Content.Photo(url, num, height != null ? height.toString() : null, attachedImageVO.getUuid(), attachedImageVO.getFilename(), attachedImageVO.getBucket());
                                arrayList.add(photo);
                                cachedMedia = new ReviewFormData.CachedMedia(uri, photo, null, 4, null);
                                cachedMedia2 = cachedMedia;
                            }
                            if (cachedMedia2 == null) {
                                arrayList3.add(cachedMedia2);
                            }
                        } else {
                            if (!(attachmentVO instanceof AttachmentVO.AttachedVideoVO)) {
                                throw new o();
                            }
                            AttachmentVO.AttachedVideoVO attachedVideoVO = (AttachmentVO.AttachedVideoVO) attachmentVO;
                            String uri2 = attachedVideoVO.getMediaUri().toString();
                            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                            String uploadId = attachedVideoVO.getUploadId();
                            if (uploadId != null) {
                                Content.Video video = new Content.Video(uploadId, attachedVideoVO.getUuid());
                                arrayList2.add(video);
                                Unit unit = Unit.f71690a;
                                cachedMedia = new ReviewFormData.CachedMedia(uri2, null, video, 2, null);
                                cachedMedia2 = cachedMedia;
                            }
                            if (cachedMedia2 == null) {
                            }
                        }
                    } else {
                        ReviewFormViewModel reviewFormViewModel = this.this$0;
                        reviewFormData = reviewFormViewModel.formData;
                        Pair pair = new Pair(((MediaPickerEvent.AttachmentsUpdated) this.$event).getPhotoUploadKey(), arrayList);
                        String videoUploadKey = ((MediaPickerEvent.AttachmentsUpdated) this.$event).getVideoUploadKey();
                        reviewFormViewModel.formData = ReviewFormData.copy$default(reviewFormData, null, null, null, null, pair, videoUploadKey != null ? new Pair(videoUploadKey, arrayList2) : null, null, null, null, null, null, 1999, null);
                        reviewFormRepository = this.this$0.reviewFormRepository;
                        reviewFormRepository.saveMedias(arrayList3);
                        this.this$0.updatePoints();
                        this.this$0.updateSubmitCachedReviewAction();
                    }
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormViewModel$onMediaPickerEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
