package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import Ae.C;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import io.reactivex.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.video.VideoUploadRepository;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;
import ru.ozon.app.android.mediaupload.video.dto.VideoUploadingError;
import ru.ozon.app.android.mediaupload.video.dto.VideoValidationError;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;", "video", "LAe/h;", "<anonymous>", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;)LAe/h;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadVideo$2", f = "UploadingAttachmentsViewModel.kt", l = {390}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class UploadingAttachmentsViewModelImpl$uploadVideo$2 extends j implements Function2<AttachmentVO.AttachedVideoVO, d<? super InterfaceC2395h<? extends AttachmentVO.AttachedVideoVO>>, Object> {
    final /* synthetic */ AttachmentVO.AttachedVideoVO $attachment;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UploadingAttachmentsViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;", "", "error", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadVideo$2$2", f = "UploadingAttachmentsViewModel.kt", l = {427}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadVideo$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<InterfaceC2397i<? super AttachmentVO.AttachedVideoVO>, Throwable, d<? super Unit>, Object> {
        final /* synthetic */ AttachmentVO.AttachedVideoVO $attachment;
        final /* synthetic */ AttachmentVO.AttachedVideoVO $video;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ UploadingAttachmentsViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl, AttachmentVO.AttachedVideoVO attachedVideoVO, AttachmentVO.AttachedVideoVO attachedVideoVO2, d<? super AnonymousClass2> dVar) {
            super(3, dVar);
            this.this$0 = uploadingAttachmentsViewModelImpl;
            this.$attachment = attachedVideoVO;
            this.$video = attachedVideoVO2;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super AttachmentVO.AttachedVideoVO> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$attachment, this.$video, dVar);
            anonymousClass2.L$0 = interfaceC2397i;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List<AttachmentVO> attachments;
            boolean isVideoErrorAnalyticEnabled;
            AttachmentVO.AttachedVideoVO copy$default;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                UploadingAttachmentsViewModel.ViewState value = this.this$0.getAttached().getValue();
                if (value != null && (attachments = value.getAttachments()) != null) {
                    List<AttachmentVO> list = attachments;
                    AttachmentVO.AttachedVideoVO attachedVideoVO = this.$attachment;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (((AttachmentVO) it.next()).getId() == attachedVideoVO.getId()) {
                                isVideoErrorAnalyticEnabled = this.this$0.isVideoErrorAnalyticEnabled();
                                if (isVideoErrorAnalyticEnabled) {
                                    LoggerExtKt.sendNonFatal$default(null, "video_upload_custom_event_logs: " + th2.getMessage() + ". Media type = " + this.$attachment.getMediaType() + "\"", null, null, 13, null);
                                }
                                if (th2 instanceof VideoValidationError) {
                                    copy$default = AttachmentVO.AttachedVideoVO.copy$default(this.$video, null, null, null, null, 0L, null, null, null, null, null, new AttachmentVO.Status.VALIDATION_ERROR(th2.getMessage()), null, false, 3071, null);
                                } else if (th2 instanceof VideoUploadingError) {
                                    this.this$0.getSendUploadErrorEvent().postValue(Unit.f71690a);
                                    copy$default = AttachmentVO.AttachedVideoVO.copy$default(this.$video, null, null, null, null, 0L, null, null, null, null, null, AttachmentVO.Status.UPLOADING_ERROR.INSTANCE, null, ((VideoUploadingError) th2).getReuploadWithFallbackFlag(), 3071, null);
                                } else {
                                    copy$default = AttachmentVO.AttachedVideoVO.copy$default(this.$video, null, null, null, null, 0L, null, null, null, null, null, AttachmentVO.Status.UPLOADING_ERROR.INSTANCE, null, false, 3071, null);
                                }
                                this.L$0 = null;
                                this.label = 1;
                                if (interfaceC2397i.emit(copy$default, this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadVideo$2$3", f = "UploadingAttachmentsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadVideo$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<AttachmentVO.AttachedVideoVO, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.d(String.valueOf(((AttachmentVO.AttachedVideoVO) this.L$0).getUploadingProgress()), new Object[0]);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AttachmentVO.AttachedVideoVO attachedVideoVO, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(attachedVideoVO, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadingAttachmentsViewModelImpl$uploadVideo$2(UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl, AttachmentVO.AttachedVideoVO attachedVideoVO, d<? super UploadingAttachmentsViewModelImpl$uploadVideo$2> dVar) {
        super(2, dVar);
        this.this$0 = uploadingAttachmentsViewModelImpl;
        this.$attachment = attachedVideoVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UploadingAttachmentsViewModelImpl$uploadVideo$2 uploadingAttachmentsViewModelImpl$uploadVideo$2 = new UploadingAttachmentsViewModelImpl$uploadVideo$2(this.this$0, this.$attachment, dVar);
        uploadingAttachmentsViewModelImpl$uploadVideo$2.L$0 = obj;
        return uploadingAttachmentsViewModelImpl$uploadVideo$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AttachmentVO.AttachedVideoVO attachedVideoVO, d<? super InterfaceC2395h<? extends AttachmentVO.AttachedVideoVO>> dVar) {
        return invoke2(attachedVideoVO, (d<? super InterfaceC2395h<AttachmentVO.AttachedVideoVO>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VideoUploadRepository videoUploadRepository;
        UploadingAttachmentsViewModelImpl$uploadVideo$2 uploadingAttachmentsViewModelImpl$uploadVideo$2;
        final AttachmentVO.AttachedVideoVO attachedVideoVO;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AttachmentVO.AttachedVideoVO attachedVideoVO2 = (AttachmentVO.AttachedVideoVO) this.L$0;
            videoUploadRepository = this.this$0.videoUploadRepository;
            String uploadAction = attachedVideoVO2.getUploadAction();
            Uri mediaUri = attachedVideoVO2.getMediaUri();
            String uploadVideoType = attachedVideoVO2.getUploadVideoType();
            if (uploadVideoType == null) {
                uploadVideoType = "review";
            }
            boolean isFallbackUploading = attachedVideoVO2.getIsFallbackUploading();
            this.L$0 = attachedVideoVO2;
            this.label = 1;
            uploadingAttachmentsViewModelImpl$uploadVideo$2 = this;
            Object newUpload = videoUploadRepository.newUpload(uploadAction, mediaUri, uploadVideoType, isFallbackUploading, uploadingAttachmentsViewModelImpl$uploadVideo$2);
            if (newUpload == aVar) {
                return aVar;
            }
            attachedVideoVO = attachedVideoVO2;
            obj = newUpload;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attachedVideoVO = (AttachmentVO.AttachedVideoVO) this.L$0;
            s.b(obj);
            uploadingAttachmentsViewModelImpl$uploadVideo$2 = this;
        }
        final InterfaceC2395h interfaceC2395h = (InterfaceC2395h) obj;
        final UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl = uploadingAttachmentsViewModelImpl$uploadVideo$2.this$0;
        return new C2408n0(new C(new InterfaceC2395h<AttachmentVO.AttachedVideoVO>() { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadVideo$2$invokeSuspend$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadVideo$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ AttachmentVO.AttachedVideoVO $video$inlined;
                final /* synthetic */ UploadingAttachmentsViewModelImpl this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadVideo$2$invokeSuspend$$inlined$map$1$2", f = "UploadingAttachmentsViewModel.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadVideo$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl, AttachmentVO.AttachedVideoVO attachedVideoVO) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = uploadingAttachmentsViewModelImpl;
                    this.$video$inlined = attachedVideoVO;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                UploadingProgress uploadingProgress = (UploadingProgress) obj;
                                String uploadingId = uploadingProgress.getUploadingId();
                                boolean isDone = uploadingProgress.getIsDone();
                                p<Integer> component3 = uploadingProgress.component3();
                                if (isDone) {
                                    this.this$0.getSendUploadEvent().postValue(Unit.f71690a);
                                }
                                AttachmentVO.AttachedVideoVO copy$default = AttachmentVO.AttachedVideoVO.copy$default(this.$video$inlined, null, uploadingId, null, null, 0L, null, null, null, null, null, isDone ? AttachmentVO.Status.UPLOADED.INSTANCE : AttachmentVO.Status.UPLOADING.INSTANCE, component3, false, 5117, null);
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(copy$default, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super AttachmentVO.AttachedVideoVO> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, uploadingAttachmentsViewModelImpl, attachedVideoVO), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass2(uploadingAttachmentsViewModelImpl$uploadVideo$2.this$0, uploadingAttachmentsViewModelImpl$uploadVideo$2.$attachment, attachedVideoVO, null)), new AnonymousClass3(null));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AttachmentVO.AttachedVideoVO attachedVideoVO, d<? super InterfaceC2395h<AttachmentVO.AttachedVideoVO>> dVar) {
        return ((UploadingAttachmentsViewModelImpl$uploadVideo$2) create(attachedVideoVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
