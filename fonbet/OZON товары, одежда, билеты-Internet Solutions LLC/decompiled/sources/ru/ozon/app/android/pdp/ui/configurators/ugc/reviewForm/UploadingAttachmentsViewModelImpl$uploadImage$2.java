package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import Ae.C;
import Ae.C2399j;
import Ae.C2405m;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import He.b;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCase;
import ru.ozon.app.android.mediaupload.image.domain.UploadedImage;
import xe.C10720e0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "image", "LAe/h;", "<anonymous>", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;)LAe/h;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadImage$2", f = "UploadingAttachmentsViewModel.kt", l = {345}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class UploadingAttachmentsViewModelImpl$uploadImage$2 extends j implements Function2<AttachmentVO.AttachedImageVO, d<? super InterfaceC2395h<? extends AttachmentVO.AttachedImageVO>>, Object> {
    final /* synthetic */ AttachmentVO.AttachedImageVO $attachment;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UploadingAttachmentsViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/mediaupload/image/domain/UploadedImage;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadImage$2$1", f = "UploadingAttachmentsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadImage$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<UploadedImage, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            if (h.K(((UploadedImage) this.L$0).getUrl())) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UploadedImage uploadedImage, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(uploadedImage, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadImage$2$3", f = "UploadingAttachmentsViewModel.kt", l = {363}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadImage$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements InterfaceC6511n<InterfaceC2397i<? super AttachmentVO.AttachedImageVO>, Throwable, d<? super Unit>, Object> {
        final /* synthetic */ AttachmentVO.AttachedImageVO $attachment;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ UploadingAttachmentsViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl, AttachmentVO.AttachedImageVO attachedImageVO, d<? super AnonymousClass3> dVar) {
            super(3, dVar);
            this.this$0 = uploadingAttachmentsViewModelImpl;
            this.$attachment = attachedImageVO;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super AttachmentVO.AttachedImageVO> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$attachment, dVar);
            anonymousClass3.L$0 = interfaceC2397i;
            anonymousClass3.L$1 = th2;
            return anonymousClass3.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean isImageErrorAnalyticEnabled;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                this.this$0.getSendUploadErrorEvent().postValue(Unit.f71690a);
                isImageErrorAnalyticEnabled = this.this$0.isImageErrorAnalyticEnabled();
                if (isImageErrorAnalyticEnabled) {
                    LoggerExtKt.sendNonFatal$default(null, "ru.ozon.reviews.upload_image: " + th2.getMessage() + ". Media type = " + this.$attachment.getMediaType(), null, null, 13, null);
                }
                AttachmentVO.AttachedImageVO copy$default = AttachmentVO.AttachedImageVO.copy$default(this.$attachment, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, AttachmentVO.Status.UPLOADING_ERROR.INSTANCE, null, false, 229371, null);
                this.L$0 = null;
                this.label = 1;
                if (interfaceC2397i.emit(copy$default, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadingAttachmentsViewModelImpl$uploadImage$2(UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl, AttachmentVO.AttachedImageVO attachedImageVO, d<? super UploadingAttachmentsViewModelImpl$uploadImage$2> dVar) {
        super(2, dVar);
        this.this$0 = uploadingAttachmentsViewModelImpl;
        this.$attachment = attachedImageVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UploadingAttachmentsViewModelImpl$uploadImage$2 uploadingAttachmentsViewModelImpl$uploadImage$2 = new UploadingAttachmentsViewModelImpl$uploadImage$2(this.this$0, this.$attachment, dVar);
        uploadingAttachmentsViewModelImpl$uploadImage$2.L$0 = obj;
        return uploadingAttachmentsViewModelImpl$uploadImage$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AttachmentVO.AttachedImageVO attachedImageVO, d<? super InterfaceC2395h<? extends AttachmentVO.AttachedImageVO>> dVar) {
        return invoke2(attachedImageVO, (d<? super InterfaceC2395h<AttachmentVO.AttachedImageVO>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        UploadImageUseCase uploadImageUseCase;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AttachmentVO.AttachedImageVO attachedImageVO = (AttachmentVO.AttachedImageVO) this.L$0;
            uploadImageUseCase = this.this$0.uploadImageUseCase;
            this.label = 1;
            obj = uploadImageUseCase.invoke(attachedImageVO, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        final C2408n0 c2408n0 = new C2408n0(new C2405m(obj), new AnonymousClass1(null));
        final UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl = this.this$0;
        final AttachmentVO.AttachedImageVO attachedImageVO2 = this.$attachment;
        C c11 = new C(new InterfaceC2395h<AttachmentVO.AttachedImageVO>() { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadImage$2$invokeSuspend$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadImage$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ AttachmentVO.AttachedImageVO $attachment$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ UploadingAttachmentsViewModelImpl this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadImage$2$invokeSuspend$$inlined$map$1$2", f = "UploadingAttachmentsViewModel.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadImage$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl, AttachmentVO.AttachedImageVO attachedImageVO) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = uploadingAttachmentsViewModelImpl;
                    this.$attachment$inlined = attachedImageVO;
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
                                UploadedImage uploadedImage = (UploadedImage) obj;
                                this.this$0.getSendUploadEvent().postValue(Unit.f71690a);
                                String url = uploadedImage.getUrl();
                                String fileName = uploadedImage.getFileName();
                                if (fileName == null) {
                                    fileName = this.$attachment$inlined.getFilename();
                                }
                                String bucket = uploadedImage.getBucket();
                                AttachmentVO.Status.UPLOADED uploaded = AttachmentVO.Status.UPLOADED.INSTANCE;
                                Integer width = uploadedImage.getWidth();
                                Integer height = uploadedImage.getHeight();
                                AttachmentVO.AttachedImageVO copy$default = AttachmentVO.AttachedImageVO.copy$default(this.$attachment$inlined, null, null, url, bucket, null, width, height, null, null, 0L, null, fileName, null, null, null, uploaded, null, false, 227219, null);
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
            public Object collect(InterfaceC2397i<? super AttachmentVO.AttachedImageVO> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, uploadingAttachmentsViewModelImpl, attachedImageVO2), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass3(this.this$0, this.$attachment, null));
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C2399j.B(c11, b.f10879b);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AttachmentVO.AttachedImageVO attachedImageVO, d<? super InterfaceC2395h<AttachmentVO.AttachedImageVO>> dVar) {
        return ((UploadingAttachmentsViewModelImpl$uploadImage$2) create(attachedImageVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
