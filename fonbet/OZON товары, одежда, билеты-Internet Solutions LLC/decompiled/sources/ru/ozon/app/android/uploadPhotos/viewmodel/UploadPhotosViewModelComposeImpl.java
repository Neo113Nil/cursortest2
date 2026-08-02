package ru.ozon.app.android.uploadPhotos.viewmodel;

import Ae.C;
import Ae.C2399j;
import Ae.C2401k;
import Ae.C2405m;
import Ae.C2408n0;
import Ae.C2425z;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.Z;
import Ae.x0;
import He.b;
import Hi.g;
import Hi.l;
import Sc.s;
import Wc.a;
import We.C;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.gallery.HandleGalleryResult;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCase;
import ru.ozon.app.android.mediaupload.image.domain.UploadedImage;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.uploadPhotos.model.UploadPhotoEffect;
import ru.ozon.app.android.uploadPhotos.model.ViewState;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0017\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\rJ3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u0006\u0010\u001f\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\"\u0010\u001aJ\u0017\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010%R \u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010@\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/uploadPhotos/viewmodel/UploadPhotosViewModelComposeImpl;", "Landroidx/lifecycle/w0;", "", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "pickedImagesMapper", "Lru/ozon/app/android/platform/image/ImageResizer;", "imageResizer", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;", "uploadImageUseCase", "", "pickImagesLimit", "<init>", "(Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;Lru/ozon/app/android/platform/image/ImageResizer;Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;I)V", "(Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;Lru/ozon/app/android/platform/image/ImageResizer;Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;)V", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "attaches", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "skipStatuses", "", "actualizeAttaches", "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;", "attachments", "", "uploadAttachments", "(Ljava/util/List;)V", "attach", "LAe/h;", "resizeImage", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;)LAe/h;", "attachment", "uploadAttachment", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "showFailedUploads", "limit", "setImagesLimit", "(I)V", "attachImage", "()V", "LHi/g;", "galleryLaunchResult", "handleGalleryResult", "(LHi/g;)V", "", "id", "removeAttachedClick", "(J)V", "retryUploadAttachedClick", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "Lru/ozon/app/android/platform/image/ImageResizer;", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;", "I", "getPickImagesLimit", "()I", "setPickImagesLimit", "LAe/x0;", "Lru/ozon/app/android/uploadPhotos/model/ViewState;", "state", "LAe/x0;", "getState", "()LAe/x0;", "LAe/w0;", "Lru/ozon/app/android/uploadPhotos/model/UploadPhotoEffect;", "effects", "LAe/w0;", "getEffects", "()LAe/w0;", "Companion", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadPhotosViewModelComposeImpl extends w0 implements HandleGalleryResult {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Ae.w0<UploadPhotoEffect> effects;

    @NotNull
    private final ImageResizer imageResizer;
    private int pickImagesLimit;

    @NotNull
    private final PickedAttachmentsMapper pickedImagesMapper;

    @NotNull
    private final x0<ViewState> state;

    @NotNull
    private final UploadImageUseCase uploadImageUseCase;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/uploadPhotos/viewmodel/UploadPhotosViewModelComposeImpl$Companion;", "", "<init>", "()V", "ATTACH_IMAGE_SIZE_LIMIT", "", "PICK_IMAGES_DEFAULT_LIMIT", "", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UploadPhotosViewModelComposeImpl(@NotNull PickedAttachmentsMapper pickedImagesMapper, @NotNull ImageResizer imageResizer, @NotNull UploadImageUseCase uploadImageUseCase, int i11) {
        Intrinsics.checkNotNullParameter(pickedImagesMapper, "pickedImagesMapper");
        Intrinsics.checkNotNullParameter(imageResizer, "imageResizer");
        Intrinsics.checkNotNullParameter(uploadImageUseCase, "uploadImageUseCase");
        this.pickedImagesMapper = pickedImagesMapper;
        this.imageResizer = imageResizer;
        this.uploadImageUseCase = uploadImageUseCase;
        this.pickImagesLimit = i11;
        this.state = O0.a(new ViewState(null, false, 3, null));
        this.effects = E0.b(0, 0, null, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AttachmentVO.AttachedImageVO> actualizeAttaches(List<AttachmentVO.AttachedImageVO> attaches, Set<? extends AttachmentVO.Status> skipStatuses) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : attaches) {
            linkedHashMap.put(Long.valueOf(((AttachmentVO.AttachedImageVO) obj).getId()), obj);
        }
        List<AttachmentVO.AttachedImageVO> attachments = getState().getValue().getAttachments();
        ArrayList arrayList2 = new ArrayList(C7714v.z(attachments, 10));
        for (AttachmentVO.AttachedImageVO attachedImageVO : attachments) {
            if (skipStatuses.contains(attachedImageVO.getStatus())) {
                linkedHashMap.remove(Long.valueOf(attachedImageVO.getId()));
            } else if (linkedHashMap.containsKey(Long.valueOf(attachedImageVO.getId()))) {
                Object remove = linkedHashMap.remove(Long.valueOf(attachedImageVO.getId()));
                Intrinsics.f(remove);
                attachedImageVO = (AttachmentVO.AttachedImageVO) remove;
                arrayList.add(attachedImageVO);
            }
            arrayList2.add(attachedImageVO);
        }
        Collection values = linkedHashMap.values();
        Intrinsics.f(values);
        arrayList.addAll(values);
        Intrinsics.checkNotNullExpressionValue(values, "also(...)");
        ArrayList p02 = C7714v.p0(values, arrayList2);
        x0<ViewState> state = getState();
        while (!state.b(state.getValue(), new ViewState(p02, ViewState.INSTANCE.isShowAttachImagesButton(p02.size(), getPickImagesLimit())))) {
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2395h<AttachmentVO.AttachedImageVO> resizeImage(final AttachmentVO.AttachedImageVO attach) {
        final C2405m c2405m = new C2405m(this.imageResizer.resize(attach.getMediaUri(), 1200.0f));
        return C2399j.B(new C(new InterfaceC2395h<AttachmentVO.AttachedImageVO>() { // from class: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$resizeImage$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$resizeImage$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ AttachmentVO.AttachedImageVO $attach$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$resizeImage$$inlined$map$1$2", f = "UploadPhotosViewModelComposeImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$resizeImage$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, AttachmentVO.AttachedImageVO attachedImageVO) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$attach$inlined = attachedImageVO;
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
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                AttachmentVO.Status.UPLOADING uploading = AttachmentVO.Status.UPLOADING.INSTANCE;
                                We.C.f33536g.getClass();
                                We.C b11 = C.a.b("image/jpeg");
                                AttachmentVO.AttachedImageVO copy$default = AttachmentVO.AttachedImageVO.copy$default(this.$attach$inlined, null, (String) obj, null, null, null, null, null, null, null, 0L, null, null, null, null, b11, uploading, null, false, 212989, null);
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
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super AttachmentVO.AttachedImageVO> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, attach), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new UploadPhotosViewModelComposeImpl$resizeImage$2(attach, null)), C10720e0.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFailedUploads(List<AttachmentVO.AttachedImageVO> attachments) {
        List<AttachmentVO.AttachedImageVO> attachments2;
        int i11;
        ViewState value = getState().getValue();
        if (value == null || (attachments2 = value.getAttachments()) == null) {
            return;
        }
        int i12 = 0;
        for (AttachmentVO.AttachedImageVO attachedImageVO : attachments) {
            List<AttachmentVO.AttachedImageVO> list = attachments2;
            if ((list instanceof Collection) && list.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 0;
                for (AttachmentVO.AttachedImageVO attachedImageVO2 : list) {
                    if (attachedImageVO2.getId() == attachedImageVO.getId() && Intrinsics.d(attachedImageVO2.getStatus(), AttachmentVO.Status.UPLOADING_ERROR.INSTANCE) && (i11 = i11 + 1) < 0) {
                        C7714v.N0();
                        throw null;
                    }
                }
            }
            i12 += i11;
        }
        if (i12 > 0) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new UploadPhotosViewModelComposeImpl$showFailedUploads$1(this, i12, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadAttachment(final AttachmentVO.AttachedImageVO attachedImageVO, d<? super InterfaceC2395h<AttachmentVO.AttachedImageVO>> dVar) {
        UploadPhotosViewModelComposeImpl$uploadAttachment$1 uploadPhotosViewModelComposeImpl$uploadAttachment$1;
        int i11;
        if (dVar instanceof UploadPhotosViewModelComposeImpl$uploadAttachment$1) {
            uploadPhotosViewModelComposeImpl$uploadAttachment$1 = (UploadPhotosViewModelComposeImpl$uploadAttachment$1) dVar;
            int i12 = uploadPhotosViewModelComposeImpl$uploadAttachment$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                uploadPhotosViewModelComposeImpl$uploadAttachment$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = uploadPhotosViewModelComposeImpl$uploadAttachment$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = uploadPhotosViewModelComposeImpl$uploadAttachment$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    UploadImageUseCase uploadImageUseCase = this.uploadImageUseCase;
                    uploadPhotosViewModelComposeImpl$uploadAttachment$1.L$0 = attachedImageVO;
                    uploadPhotosViewModelComposeImpl$uploadAttachment$1.label = 1;
                    obj = uploadImageUseCase.invoke(attachedImageVO, uploadPhotosViewModelComposeImpl$uploadAttachment$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    attachedImageVO = (AttachmentVO.AttachedImageVO) uploadPhotosViewModelComposeImpl$uploadAttachment$1.L$0;
                    s.b(obj);
                }
                final C2408n0 c2408n0 = new C2408n0(new C2405m(obj), new UploadPhotosViewModelComposeImpl$uploadAttachment$2(null));
                C2408n0 c2408n02 = new C2408n0(new Ae.C(new InterfaceC2395h<AttachmentVO.AttachedImageVO>() { // from class: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachment$$inlined$map$1

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachment$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC2397i {
                        final /* synthetic */ AttachmentVO.AttachedImageVO $attachment$inlined;
                        final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachment$$inlined$map$1$2", f = "UploadPhotosViewModelComposeImpl.kt", l = {50}, m = "emit")
                        /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachment$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(InterfaceC2397i interfaceC2397i, AttachmentVO.AttachedImageVO attachedImageVO) {
                            this.$this_unsafeFlow = interfaceC2397i;
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
                                    a aVar = a.COROUTINE_SUSPENDED;
                                    i11 = anonymousClass1.label;
                                    if (i11 != 0) {
                                        s.b(obj2);
                                        InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                        UploadedImage uploadedImage = (UploadedImage) obj;
                                        String url = uploadedImage.getUrl();
                                        AttachmentVO.Status.UPLOADED uploaded = AttachmentVO.Status.UPLOADED.INSTANCE;
                                        AttachmentVO.AttachedImageVO copy$default = AttachmentVO.AttachedImageVO.copy$default(this.$attachment$inlined, null, null, url, uploadedImage.getBucket(), uploadedImage.getKey(), null, null, null, null, 0L, null, null, null, null, null, uploaded, null, false, 229347, null);
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
                            a aVar2 = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                            }
                            return Unit.f71690a;
                        }
                    }

                    @Override // Ae.InterfaceC2395h
                    public Object collect(InterfaceC2397i<? super AttachmentVO.AttachedImageVO> interfaceC2397i, d dVar2) {
                        Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, attachedImageVO), dVar2);
                        return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                    }
                }, new UploadPhotosViewModelComposeImpl$uploadAttachment$4(attachedImageVO, null)), new UploadPhotosViewModelComposeImpl$uploadAttachment$5(null));
                C10720e0 c10720e0 = C10720e0.f105451a;
                return C2399j.B(c2408n02, b.f10879b);
            }
        }
        uploadPhotosViewModelComposeImpl$uploadAttachment$1 = new UploadPhotosViewModelComposeImpl$uploadAttachment$1(this, dVar);
        Object obj2 = uploadPhotosViewModelComposeImpl$uploadAttachment$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = uploadPhotosViewModelComposeImpl$uploadAttachment$1.label;
        if (i11 != 0) {
        }
        final InterfaceC2395h c2408n03 = new C2408n0(new C2405m(obj2), new UploadPhotosViewModelComposeImpl$uploadAttachment$2(null));
        C2408n0 c2408n022 = new C2408n0(new Ae.C(new InterfaceC2395h<AttachmentVO.AttachedImageVO>() { // from class: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachment$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachment$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ AttachmentVO.AttachedImageVO $attachment$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachment$$inlined$map$1$2", f = "UploadPhotosViewModelComposeImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachment$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, AttachmentVO.AttachedImageVO attachedImageVO) {
                    this.$this_unsafeFlow = interfaceC2397i;
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
                            Object obj22 = anonymousClass1.result;
                            a aVar2 = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj22);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                UploadedImage uploadedImage = (UploadedImage) obj;
                                String url = uploadedImage.getUrl();
                                AttachmentVO.Status.UPLOADED uploaded = AttachmentVO.Status.UPLOADED.INSTANCE;
                                AttachmentVO.AttachedImageVO copy$default = AttachmentVO.AttachedImageVO.copy$default(this.$attachment$inlined, null, null, url, uploadedImage.getBucket(), uploadedImage.getKey(), null, null, null, null, 0L, null, null, null, null, null, uploaded, null, false, 229347, null);
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(copy$default, anonymousClass1) == aVar2) {
                                    return aVar2;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj22);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj222 = anonymousClass1.result;
                    a aVar22 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super AttachmentVO.AttachedImageVO> interfaceC2397i, d dVar2) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, attachedImageVO), dVar2);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new UploadPhotosViewModelComposeImpl$uploadAttachment$4(attachedImageVO, null)), new UploadPhotosViewModelComposeImpl$uploadAttachment$5(null));
        C10720e0 c10720e02 = C10720e0.f105451a;
        return C2399j.B(c2408n022, b.f10879b);
    }

    private final void uploadAttachments(List<AttachmentVO.AttachedImageVO> attachments) {
        InterfaceC2395h a11;
        a11 = Z.a(C2399j.y(new C2401k(attachments), new UploadPhotosViewModelComposeImpl$uploadAttachments$1(this, null)), new UploadPhotosViewModelComposeImpl$uploadAttachments$2(this, null));
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2399j.C(new Ae.C(new C2408n0(new C2425z(C2399j.B(a11, De.s.f6650a), new UploadPhotosViewModelComposeImpl$uploadAttachments$3(this, attachments, null)), new UploadPhotosViewModelComposeImpl$uploadAttachments$4(this, null)), new UploadPhotosViewModelComposeImpl$uploadAttachments$5(null)), androidx.lifecycle.x0.a(this));
    }

    public void attachImage() {
        int size = getState().getValue().getAttachments().size();
        int pickImagesLimit = getPickImagesLimit();
        if (size < pickImagesLimit) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new UploadPhotosViewModelComposeImpl$attachImage$1(this, pickImagesLimit, size, null), 3);
        } else {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new UploadPhotosViewModelComposeImpl$attachImage$2(this, null), 3);
        }
    }

    @NotNull
    public Ae.w0<UploadPhotoEffect> getEffects() {
        return this.effects;
    }

    public int getPickImagesLimit() {
        return this.pickImagesLimit;
    }

    @NotNull
    public x0<ViewState> getState() {
        return this.state;
    }

    @Override // ru.ozon.app.android.domain.gallery.HandleGalleryResult
    public void handleGalleryResult(@NotNull g galleryLaunchResult) {
        Intrinsics.checkNotNullParameter(galleryLaunchResult, "galleryLaunchResult");
        List<l> a11 = galleryLaunchResult.a();
        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(this.pickedImagesMapper.map((l) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof AttachmentVO.AttachedImageVO) {
                arrayList2.add(obj);
            }
        }
        AttachmentVO.Status[] elements = {AttachmentVO.Status.UPLOADED.INSTANCE, AttachmentVO.Status.UPLOADING.INSTANCE, AttachmentVO.Status.RESIZING.INSTANCE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        uploadAttachments(actualizeAttaches(arrayList2, C7705l.j0(elements)));
    }

    public void removeAttachedClick(long id2) {
        ViewState value;
        ArrayList arrayList;
        x0<ViewState> state = getState();
        do {
            value = state.getValue();
            List<AttachmentVO.AttachedImageVO> attachments = value.getAttachments();
            arrayList = new ArrayList();
            for (Object obj : attachments) {
                if (((AttachmentVO.AttachedImageVO) obj).getId() != id2) {
                    arrayList.add(obj);
                }
            }
        } while (!state.b(value, new ViewState(arrayList, ViewState.INSTANCE.isShowAttachImagesButton(arrayList.size(), getPickImagesLimit()))));
    }

    public void retryUploadAttachedClick(long id2) {
        Object obj;
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        ViewState value2 = getState().getValue();
        if (value2 != null) {
            Iterator<T> it = value2.getAttachments().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((AttachmentVO.AttachedImageVO) obj).getId() == id2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AttachmentVO.AttachedImageVO attachedImageVO = (AttachmentVO.AttachedImageVO) obj;
            if (attachedImageVO != null) {
                uploadAttachments(C7714v.a0(attachedImageVO));
                x0<ViewState> state = getState();
                do {
                    value = state.getValue();
                    viewState = value;
                    List<AttachmentVO.AttachedImageVO> attachments = viewState.getAttachments();
                    arrayList = new ArrayList(C7714v.z(attachments, 10));
                    for (AttachmentVO.AttachedImageVO attachedImageVO2 : attachments) {
                        if (attachedImageVO2.getId() == id2) {
                            attachedImageVO2 = AttachmentVO.AttachedImageVO.copy$default(attachedImageVO2, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, AttachmentVO.Status.UPLOADING.INSTANCE, null, false, 229375, null);
                        }
                        arrayList.add(attachedImageVO2);
                    }
                } while (!state.b(value, new ViewState(arrayList, viewState.getIsShowAttachImagesButton())));
            }
        }
    }

    public void setImagesLimit(int limit) {
        ViewState value;
        ViewState viewState;
        setPickImagesLimit(limit);
        x0<ViewState> state = getState();
        do {
            value = state.getValue();
            viewState = value;
        } while (!state.b(value, ViewState.copy$default(viewState, null, ViewState.INSTANCE.isShowAttachImagesButton(viewState.getAttachments().size(), limit), 1, null)));
    }

    public void setPickImagesLimit(int i11) {
        this.pickImagesLimit = i11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadPhotosViewModelComposeImpl(@NotNull PickedAttachmentsMapper pickedImagesMapper, @NotNull ImageResizer imageResizer, @NotNull UploadImageUseCase uploadImageUseCase) {
        this(pickedImagesMapper, imageResizer, uploadImageUseCase, 10);
        Intrinsics.checkNotNullParameter(pickedImagesMapper, "pickedImagesMapper");
        Intrinsics.checkNotNullParameter(imageResizer, "imageResizer");
        Intrinsics.checkNotNullParameter(uploadImageUseCase, "uploadImageUseCase");
    }
}
