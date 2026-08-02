package ru.ozon.app.android.uploadPhotos.viewmodel;

import Ae.C;
import Ae.C2399j;
import Ae.C2401k;
import Ae.C2405m;
import Ae.C2408n0;
import Ae.C2425z;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.Z;
import He.b;
import Hi.g;
import Hi.l;
import Sc.s;
import Wc.a;
import We.C;
import android.net.Uri;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
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
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCase;
import ru.ozon.app.android.mediaupload.image.domain.UploadedImage;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uploadPhotos.model.ViewState;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10720e0;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J%\u0010\u001e\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010&\u001a\b\u0012\u0004\u0012\u00020 0%2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00192\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0003¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020 0\u0019H\u0002¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020 0,2\u0006\u0010+\u001a\u00020 H\u0002¢\u0006\u0004\b-\u0010.J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020 0,2\u0006\u0010/\u001a\u00020 H\u0082@¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020 0\u0019H\u0002¢\u0006\u0004\b2\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010B\u001a\b\u0012\u0004\u0012\u00020\t0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010F\u001a\b\u0012\u0004\u0012\u00020\u001a0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER \u0010H\u001a\b\u0012\u0004\u0012\u00020\u001a0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010E¨\u0006K"}, d2 = {"Lru/ozon/app/android/uploadPhotos/viewmodel/UploadPhotosViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/uploadPhotos/viewmodel/UploadPhotosViewModel;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "pickedImagesMapper", "Lru/ozon/app/android/platform/image/ImageResizer;", "imageResizer", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;", "uploadImageUseCase", "", "pickImagesLimit", "<init>", "(Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;Lru/ozon/app/android/platform/image/ImageResizer;Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;I)V", "", "attachImage", "()V", "LHi/g;", "galleryLaunchResult", "handleGalleryResult", "(LHi/g;)V", "", "id", "removeAttachedClick", "(J)V", "retryUploadAttachedClick", "", "", "paths", "", "disabled", "setImages", "(Ljava/util/List;Z)V", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "attaches", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "skipStatuses", "", "actualizeAttaches", "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;", "attachments", "uploadAttachments", "(Ljava/util/List;)V", "attach", "LAe/h;", "resizeImage", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;)LAe/h;", "attachment", "uploadAttachment", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "showFailedUploads", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "Lru/ozon/app/android/platform/image/ImageResizer;", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;", "I", "getPickImagesLimit", "()I", "setPickImagesLimit", "(I)V", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/uploadPhotos/model/ViewState;", "state", "Landroidx/lifecycle/V;", "getState", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "openPickScreenEvent", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getOpenPickScreenEvent", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "showMessageEvent", "getShowMessageEvent", "showErrorEvent", "getShowErrorEvent", "Companion", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UploadPhotosViewModelImpl extends w0 implements UploadPhotosViewModel {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ImageResizer imageResizer;

    @NotNull
    private final SingleLiveEvent<Integer> openPickScreenEvent;
    private int pickImagesLimit;

    @NotNull
    private final PickedAttachmentsMapper pickedImagesMapper;

    @NotNull
    private final SingleLiveEvent<String> showErrorEvent;

    @NotNull
    private final SingleLiveEvent<String> showMessageEvent;

    @NotNull
    private final V<ViewState> state;

    @NotNull
    private final UploadImageUseCase uploadImageUseCase;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/uploadPhotos/viewmodel/UploadPhotosViewModelImpl$Companion;", "", "<init>", "()V", "ATTACH_IMAGE_SIZE_LIMIT", "", "PICK_IMAGES_DEFAULT_LIMIT", "", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UploadPhotosViewModelImpl(@NotNull PickedAttachmentsMapper pickedImagesMapper, @NotNull ImageResizer imageResizer, @NotNull UploadImageUseCase uploadImageUseCase, int i11) {
        Intrinsics.checkNotNullParameter(pickedImagesMapper, "pickedImagesMapper");
        Intrinsics.checkNotNullParameter(imageResizer, "imageResizer");
        Intrinsics.checkNotNullParameter(uploadImageUseCase, "uploadImageUseCase");
        this.pickedImagesMapper = pickedImagesMapper;
        this.imageResizer = imageResizer;
        this.uploadImageUseCase = uploadImageUseCase;
        this.pickImagesLimit = i11;
        this.state = new V<>();
        this.openPickScreenEvent = new SingleLiveEvent<>();
        this.showMessageEvent = new SingleLiveEvent<>();
        this.showErrorEvent = new SingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AttachmentVO.AttachedImageVO> actualizeAttaches(List<AttachmentVO.AttachedImageVO> attaches, Set<? extends AttachmentVO.Status> skipStatuses) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : attaches) {
            linkedHashMap.put(Long.valueOf(((AttachmentVO.AttachedImageVO) obj).getId()), obj);
        }
        ViewState value = getState().getValue();
        List<AttachmentVO.AttachedImageVO> attachments = value != null ? value.getAttachments() : null;
        if (attachments == null) {
            attachments = K.f71697a;
        }
        List<AttachmentVO.AttachedImageVO> list = attachments;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
        for (AttachmentVO.AttachedImageVO attachedImageVO : list) {
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
        getState().setValue(new ViewState(C7714v.p0(values, arrayList2), getPickImagesLimit()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2395h<AttachmentVO.AttachedImageVO> resizeImage(final AttachmentVO.AttachedImageVO attach) {
        final C2405m c2405m = new C2405m(this.imageResizer.resize(attach.getMediaUri(), 1200.0f));
        return C2399j.B(new C(new InterfaceC2395h<AttachmentVO.AttachedImageVO>() { // from class: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$resizeImage$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$resizeImage$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ AttachmentVO.AttachedImageVO $attach$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$resizeImage$$inlined$map$1$2", f = "UploadPhotosViewModelImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$resizeImage$$inlined$map$1$2$1, reason: invalid class name */
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
        }, new UploadPhotosViewModelImpl$resizeImage$2(attach, null)), C10720e0.a());
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
            getShowErrorEvent().postValue(StringProvider.getString(R$string.error_reviews_picker_images_load_error, Integer.valueOf(i12)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadAttachment(final AttachmentVO.AttachedImageVO attachedImageVO, d<? super InterfaceC2395h<AttachmentVO.AttachedImageVO>> dVar) {
        UploadPhotosViewModelImpl$uploadAttachment$1 uploadPhotosViewModelImpl$uploadAttachment$1;
        int i11;
        if (dVar instanceof UploadPhotosViewModelImpl$uploadAttachment$1) {
            uploadPhotosViewModelImpl$uploadAttachment$1 = (UploadPhotosViewModelImpl$uploadAttachment$1) dVar;
            int i12 = uploadPhotosViewModelImpl$uploadAttachment$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                uploadPhotosViewModelImpl$uploadAttachment$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = uploadPhotosViewModelImpl$uploadAttachment$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = uploadPhotosViewModelImpl$uploadAttachment$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    UploadImageUseCase uploadImageUseCase = this.uploadImageUseCase;
                    uploadPhotosViewModelImpl$uploadAttachment$1.L$0 = attachedImageVO;
                    uploadPhotosViewModelImpl$uploadAttachment$1.label = 1;
                    obj = uploadImageUseCase.invoke(attachedImageVO, uploadPhotosViewModelImpl$uploadAttachment$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    attachedImageVO = (AttachmentVO.AttachedImageVO) uploadPhotosViewModelImpl$uploadAttachment$1.L$0;
                    s.b(obj);
                }
                final C2408n0 c2408n0 = new C2408n0(new C2405m(obj), new UploadPhotosViewModelImpl$uploadAttachment$2(null));
                C2408n0 c2408n02 = new C2408n0(new Ae.C(new InterfaceC2395h<AttachmentVO.AttachedImageVO>() { // from class: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$uploadAttachment$$inlined$map$1

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$uploadAttachment$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC2397i {
                        final /* synthetic */ AttachmentVO.AttachedImageVO $attachment$inlined;
                        final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$uploadAttachment$$inlined$map$1$2", f = "UploadPhotosViewModelImpl.kt", l = {50}, m = "emit")
                        /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$uploadAttachment$$inlined$map$1$2$1, reason: invalid class name */
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
                                        AttachmentVO.AttachedImageVO copy$default = AttachmentVO.AttachedImageVO.copy$default(this.$attachment$inlined, null, null, ((UploadedImage) obj).getUrl(), null, null, null, null, null, null, 0L, null, null, null, null, null, AttachmentVO.Status.UPLOADED.INSTANCE, null, false, 229371, null);
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
                }, new UploadPhotosViewModelImpl$uploadAttachment$4(attachedImageVO, null)), new UploadPhotosViewModelImpl$uploadAttachment$5(null));
                C10720e0 c10720e0 = C10720e0.f105451a;
                return C2399j.B(c2408n02, b.f10879b);
            }
        }
        uploadPhotosViewModelImpl$uploadAttachment$1 = new UploadPhotosViewModelImpl$uploadAttachment$1(this, dVar);
        Object obj2 = uploadPhotosViewModelImpl$uploadAttachment$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = uploadPhotosViewModelImpl$uploadAttachment$1.label;
        if (i11 != 0) {
        }
        final InterfaceC2395h c2408n03 = new C2408n0(new C2405m(obj2), new UploadPhotosViewModelImpl$uploadAttachment$2(null));
        C2408n0 c2408n022 = new C2408n0(new Ae.C(new InterfaceC2395h<AttachmentVO.AttachedImageVO>() { // from class: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$uploadAttachment$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$uploadAttachment$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ AttachmentVO.AttachedImageVO $attachment$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$uploadAttachment$$inlined$map$1$2", f = "UploadPhotosViewModelImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$uploadAttachment$$inlined$map$1$2$1, reason: invalid class name */
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
                                AttachmentVO.AttachedImageVO copy$default = AttachmentVO.AttachedImageVO.copy$default(this.$attachment$inlined, null, null, ((UploadedImage) obj).getUrl(), null, null, null, null, null, null, 0L, null, null, null, null, null, AttachmentVO.Status.UPLOADED.INSTANCE, null, false, 229371, null);
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
        }, new UploadPhotosViewModelImpl$uploadAttachment$4(attachedImageVO, null)), new UploadPhotosViewModelImpl$uploadAttachment$5(null));
        C10720e0 c10720e02 = C10720e0.f105451a;
        return C2399j.B(c2408n022, b.f10879b);
    }

    private final void uploadAttachments(List<AttachmentVO.AttachedImageVO> attachments) {
        InterfaceC2395h a11;
        a11 = Z.a(C2399j.y(new C2401k(attachments), new UploadPhotosViewModelImpl$uploadAttachments$1(this, null)), new UploadPhotosViewModelImpl$uploadAttachments$2(this, null));
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2399j.C(new Ae.C(new C2408n0(new C2425z(C2399j.B(a11, De.s.f6650a), new UploadPhotosViewModelImpl$uploadAttachments$3(this, attachments, null)), new UploadPhotosViewModelImpl$uploadAttachments$4(this, null)), new UploadPhotosViewModelImpl$uploadAttachments$5(null)), x0.a(this));
    }

    @Override // ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel
    public void attachImage() {
        ViewState value = getState().getValue();
        List<AttachmentVO.AttachedImageVO> attachments = value != null ? value.getAttachments() : null;
        if (attachments == null) {
            attachments = K.f71697a;
        }
        int size = attachments.size();
        int pickImagesLimit = getPickImagesLimit();
        if (size < pickImagesLimit) {
            getOpenPickScreenEvent().postValue(Integer.valueOf(pickImagesLimit - size));
        } else {
            getShowMessageEvent().postValue(StringProvider.getString(R$string.error_reviews_picker_limit_reached));
        }
    }

    @Override // ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel
    public int getPickImagesLimit() {
        return this.pickImagesLimit;
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

    @Override // ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel
    public void removeAttachedClick(long id2) {
        ViewState value = getState().getValue();
        if (value == null) {
            return;
        }
        List<AttachmentVO.AttachedImageVO> attachments = value.getAttachments();
        V<ViewState> state = getState();
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            if (((AttachmentVO.AttachedImageVO) obj).getId() != id2) {
                arrayList.add(obj);
            }
        }
        state.setValue(new ViewState(arrayList, getPickImagesLimit()));
    }

    @Override // ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel
    public void retryUploadAttachedClick(long id2) {
        Object obj;
        ViewState value = getState().getValue();
        if (value == null) {
            return;
        }
        Iterator<T> it = value.getAttachments().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((AttachmentVO.AttachedImageVO) obj).getId() == id2) {
                    break;
                }
            }
        }
        AttachmentVO.AttachedImageVO attachedImageVO = (AttachmentVO.AttachedImageVO) obj;
        if (attachedImageVO == null) {
            return;
        }
        uploadAttachments(C7714v.a0(attachedImageVO));
    }

    @Override // ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel
    public void setImages(@NotNull List<String> paths, boolean disabled) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        ArrayList arrayList = new ArrayList();
        for (String str : paths) {
            AttachmentVO map = this.pickedImagesMapper.map(str);
            AttachmentVO.AttachedImageVO attachedImageVO = null;
            AttachmentVO.AttachedImageVO attachedImageVO2 = map instanceof AttachmentVO.AttachedImageVO ? (AttachmentVO.AttachedImageVO) map : null;
            if (attachedImageVO2 != null) {
                Uri parse = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                attachedImageVO = AttachmentVO.AttachedImageVO.copy$default(attachedImageVO2, null, null, null, null, null, null, null, null, null, 0L, null, null, null, parse, null, AttachmentVO.Status.ONLY_SHOW.INSTANCE, null, false, 221183, null);
            }
            if (attachedImageVO != null) {
                arrayList.add(attachedImageVO);
            }
        }
        getState().setValue(new ViewState(arrayList, !disabled));
    }

    @Override // ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel
    @NotNull
    public SingleLiveEvent<Integer> getOpenPickScreenEvent() {
        return this.openPickScreenEvent;
    }

    @Override // ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel
    @NotNull
    public SingleLiveEvent<String> getShowErrorEvent() {
        return this.showErrorEvent;
    }

    @Override // ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel
    @NotNull
    public SingleLiveEvent<String> getShowMessageEvent() {
        return this.showMessageEvent;
    }

    @Override // ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel
    @NotNull
    public V<ViewState> getState() {
        return this.state;
    }
}
