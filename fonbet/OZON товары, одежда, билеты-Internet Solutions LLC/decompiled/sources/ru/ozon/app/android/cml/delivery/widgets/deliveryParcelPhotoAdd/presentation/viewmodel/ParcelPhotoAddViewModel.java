package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Hi.g;
import Hi.l;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhoto;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhotoResizer;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlDeletePhotoUseCase;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlUploadPhotoUseCase;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.PickedPhotosMapper;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddVO;
import ru.ozon.app.android.domain.gallery.HandleGalleryResult;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001\\B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u000fJ\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ3\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0003¢\u0006\u0004\b%\u0010&J)\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010'\u001a\u00020 2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0003¢\u0006\u0004\b%\u0010(J\u0014\u0010)\u001a\u00020\r*\u00020 H\u0082@¢\u0006\u0004\b)\u0010*J\u0014\u0010+\u001a\u00020\r*\u00020 H\u0082@¢\u0006\u0004\b+\u0010*J\u0013\u0010,\u001a\u00020 *\u00020 H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b.\u0010\u001cJ\u000f\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b/\u0010\u000fJ\u0014\u00100\u001a\u00020\r*\u00020 H\u0082@¢\u0006\u0004\b0\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\"\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020@0?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020@0?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u001c\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u0002080H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00190H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010JR\u001f\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u0002080S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00190S8\u0006¢\u0006\f\n\u0004\bX\u0010U\u001a\u0004\bY\u0010WR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020L0S8\u0006¢\u0006\f\n\u0004\bZ\u0010U\u001a\u0004\b[\u0010W¨\u0006]"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/viewmodel/ParcelPhotoAddViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/domain/gallery/HandleGalleryResult;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/PickedPhotosMapper;", "pickedPhotosMapper", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhotoResizer;", "attachedPhotoResizer", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlUploadPhotoUseCase;", "uploadPhotoUseCase", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlDeletePhotoUseCase;", "deletePhotoUseCase", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/PickedPhotosMapper;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhotoResizer;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlUploadPhotoUseCase;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlDeletePhotoUseCase;)V", "", "onCleared", "()V", "LHi/g;", "galleryLaunchResult", "handleGalleryResult", "(LHi/g;)V", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO;", "vo", "bindData", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/ParcelPhotoAddVO;)V", "attachPhoto", "", "photoKey", "cancelUploading", "(Ljava/lang/String;)V", "retryAfterError", "deletePhoto", "", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "newAttaches", "", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto$Status;", "skipStatuses", "updateAttaches", "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;", "newAttach", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;Ljava/util/Set;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "resizeAndUpload", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deleteAndUpdate", "addActions", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "deleteFromAttached", "showFailedDeletes", "sendAnalyticsEvent", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/PickedPhotosMapper;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhotoResizer;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlUploadPhotoUseCase;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/CmlDeletePhotoUseCase;", "deliveryNumber", "Ljava/lang/String;", "postingNumber", "", "pickPhotosLimit", "I", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "uploadPhotoAction", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "deletePhotoAction", "", "Lxe/B0;", "uploadingJobs", "Ljava/util/Map;", "deletingJobs", "LAe/x0;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/viewmodel/ParcelPhotoAddViewModel$Companion$ViewState;", "_attached", "LAe/x0;", "Lze/h;", "_openPickScreen", "Lze/h;", "_errors", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/viewmodel/ParcelPhotoAddViewModel$Companion$AnalyticsEvent;", "_analyticsEvents", "LAe/M0;", "attached", "LAe/M0;", "getAttached", "()LAe/M0;", "LAe/h;", "openPickScreen", "LAe/h;", "getOpenPickScreen", "()LAe/h;", "errors", "getErrors", "analyticsEvents", "getAnalyticsEvents", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParcelPhotoAddViewModel extends w0 implements HandleGalleryResult {

    @NotNull
    private final h<Companion.AnalyticsEvent> _analyticsEvents;

    @NotNull
    private final x0<Companion.ViewState> _attached;

    @NotNull
    private final h<String> _errors;

    @NotNull
    private final h<Integer> _openPickScreen;

    @NotNull
    private final InterfaceC2395h<Companion.AnalyticsEvent> analyticsEvents;

    @NotNull
    private final M0<Companion.ViewState> attached;

    @NotNull
    private final AttachedPhotoResizer attachedPhotoResizer;
    private AtomAction.ComposerAction deletePhotoAction;

    @NotNull
    private final CmlDeletePhotoUseCase deletePhotoUseCase;

    @NotNull
    private Map<String, B0> deletingJobs;
    private String deliveryNumber;

    @NotNull
    private final InterfaceC2395h<String> errors;

    @NotNull
    private final InterfaceC2395h<Integer> openPickScreen;
    private int pickPhotosLimit;

    @NotNull
    private final PickedPhotosMapper pickedPhotosMapper;
    private String postingNumber;
    private AtomAction.ComposerAction uploadPhotoAction;

    @NotNull
    private final CmlUploadPhotoUseCase uploadPhotoUseCase;

    @NotNull
    private Map<String, B0> uploadingJobs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachedPhoto.Status.values().length];
            try {
                iArr[AttachedPhoto.Status.UPLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachedPhoto.Status.DELETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachedPhoto.Status.UPLOADING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ParcelPhotoAddViewModel(@NotNull PickedPhotosMapper pickedPhotosMapper, @NotNull AttachedPhotoResizer attachedPhotoResizer, @NotNull CmlUploadPhotoUseCase uploadPhotoUseCase, @NotNull CmlDeletePhotoUseCase deletePhotoUseCase) {
        Intrinsics.checkNotNullParameter(pickedPhotosMapper, "pickedPhotosMapper");
        Intrinsics.checkNotNullParameter(attachedPhotoResizer, "attachedPhotoResizer");
        Intrinsics.checkNotNullParameter(uploadPhotoUseCase, "uploadPhotoUseCase");
        Intrinsics.checkNotNullParameter(deletePhotoUseCase, "deletePhotoUseCase");
        this.pickedPhotosMapper = pickedPhotosMapper;
        this.attachedPhotoResizer = attachedPhotoResizer;
        this.uploadPhotoUseCase = uploadPhotoUseCase;
        this.deletePhotoUseCase = deletePhotoUseCase;
        this.pickPhotosLimit = 3;
        this.uploadingJobs = new HashMap();
        this.deletingJobs = new HashMap();
        x0<Companion.ViewState> a11 = O0.a(null);
        this._attached = a11;
        C11115c a12 = k.a(0, 7, null);
        this._openPickScreen = a12;
        C11115c a13 = k.a(0, 7, null);
        this._errors = a13;
        C11115c a14 = k.a(0, 7, null);
        this._analyticsEvents = a14;
        this.attached = C2399j.b(a11);
        this.openPickScreen = C2399j.H(a12);
        this.errors = C2399j.H(a13);
        this.analyticsEvents = C2399j.H(a14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AttachedPhoto addActions(AttachedPhoto attachedPhoto) {
        return AttachedPhoto.copy$default(attachedPhoto, null, null, null, null, null, null, null, this.uploadPhotoAction, this.deletePhotoAction, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteAndUpdate(AttachedPhoto attachedPhoto, d<? super Unit> dVar) {
        ParcelPhotoAddViewModel$deleteAndUpdate$1 parcelPhotoAddViewModel$deleteAndUpdate$1;
        a aVar;
        int i11;
        ParcelPhotoAddViewModel parcelPhotoAddViewModel;
        AttachedPhoto attachedPhoto2;
        ParcelPhotoAddViewModel parcelPhotoAddViewModel2;
        AttachedPhoto attachedPhoto3;
        if (dVar instanceof ParcelPhotoAddViewModel$deleteAndUpdate$1) {
            parcelPhotoAddViewModel$deleteAndUpdate$1 = (ParcelPhotoAddViewModel$deleteAndUpdate$1) dVar;
            int i12 = parcelPhotoAddViewModel$deleteAndUpdate$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                parcelPhotoAddViewModel$deleteAndUpdate$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = parcelPhotoAddViewModel$deleteAndUpdate$1.result;
                aVar = a.COROUTINE_SUSPENDED;
                i11 = parcelPhotoAddViewModel$deleteAndUpdate$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    CmlDeletePhotoUseCase cmlDeletePhotoUseCase = this.deletePhotoUseCase;
                    parcelPhotoAddViewModel$deleteAndUpdate$1.L$0 = this;
                    parcelPhotoAddViewModel$deleteAndUpdate$1.label = 1;
                    obj = cmlDeletePhotoUseCase.invoke(attachedPhoto, parcelPhotoAddViewModel$deleteAndUpdate$1);
                    if (obj != aVar) {
                        parcelPhotoAddViewModel = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    attachedPhoto3 = (AttachedPhoto) parcelPhotoAddViewModel$deleteAndUpdate$1.L$1;
                    parcelPhotoAddViewModel2 = (ParcelPhotoAddViewModel) parcelPhotoAddViewModel$deleteAndUpdate$1.L$0;
                    s.b(obj);
                    if (attachedPhoto3.getStatus() != AttachedPhoto.Status.DELETED) {
                        parcelPhotoAddViewModel2.deleteFromAttached(attachedPhoto3.getPhotoKey());
                    } else if (attachedPhoto3.getStatus() == AttachedPhoto.Status.DELETING_ERROR) {
                        updateAttaches$default(parcelPhotoAddViewModel2, attachedPhoto3, null, 2, null);
                        parcelPhotoAddViewModel2.showFailedDeletes();
                    }
                    return Unit.f71690a;
                }
                parcelPhotoAddViewModel = (ParcelPhotoAddViewModel) parcelPhotoAddViewModel$deleteAndUpdate$1.L$0;
                s.b(obj);
                attachedPhoto2 = (AttachedPhoto) obj;
                parcelPhotoAddViewModel$deleteAndUpdate$1.L$0 = parcelPhotoAddViewModel;
                parcelPhotoAddViewModel$deleteAndUpdate$1.L$1 = attachedPhoto2;
                parcelPhotoAddViewModel$deleteAndUpdate$1.label = 2;
                if (parcelPhotoAddViewModel.sendAnalyticsEvent(attachedPhoto2, parcelPhotoAddViewModel$deleteAndUpdate$1) != aVar) {
                    parcelPhotoAddViewModel2 = parcelPhotoAddViewModel;
                    attachedPhoto3 = attachedPhoto2;
                    if (attachedPhoto3.getStatus() != AttachedPhoto.Status.DELETED) {
                    }
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        parcelPhotoAddViewModel$deleteAndUpdate$1 = new ParcelPhotoAddViewModel$deleteAndUpdate$1(this, dVar);
        Object obj2 = parcelPhotoAddViewModel$deleteAndUpdate$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = parcelPhotoAddViewModel$deleteAndUpdate$1.label;
        if (i11 != 0) {
        }
        attachedPhoto2 = (AttachedPhoto) obj2;
        parcelPhotoAddViewModel$deleteAndUpdate$1.L$0 = parcelPhotoAddViewModel;
        parcelPhotoAddViewModel$deleteAndUpdate$1.L$1 = attachedPhoto2;
        parcelPhotoAddViewModel$deleteAndUpdate$1.label = 2;
        if (parcelPhotoAddViewModel.sendAnalyticsEvent(attachedPhoto2, parcelPhotoAddViewModel$deleteAndUpdate$1) != aVar) {
        }
        return aVar;
    }

    private final void deleteFromAttached(String photoKey) {
        Companion.ViewState value = this.attached.getValue();
        List attachments = value != null ? value.getAttachments() : null;
        if (attachments != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : attachments) {
                if (!Intrinsics.d(((AttachedPhoto) obj).getPhotoKey(), photoKey)) {
                    arrayList.add(obj);
                }
            }
            this._attached.setValue(Companion.ViewState.m599boximpl(Companion.ViewState.m600constructorimpl(arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resizeAndUpload(AttachedPhoto attachedPhoto, d<? super Unit> dVar) {
        ParcelPhotoAddViewModel$resizeAndUpload$1 parcelPhotoAddViewModel$resizeAndUpload$1;
        int i11;
        ParcelPhotoAddViewModel parcelPhotoAddViewModel;
        AttachedPhoto attachedPhoto2;
        ParcelPhotoAddViewModel parcelPhotoAddViewModel2;
        AttachedPhoto attachedPhoto3;
        if (dVar instanceof ParcelPhotoAddViewModel$resizeAndUpload$1) {
            parcelPhotoAddViewModel$resizeAndUpload$1 = (ParcelPhotoAddViewModel$resizeAndUpload$1) dVar;
            int i12 = parcelPhotoAddViewModel$resizeAndUpload$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                parcelPhotoAddViewModel$resizeAndUpload$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = parcelPhotoAddViewModel$resizeAndUpload$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = parcelPhotoAddViewModel$resizeAndUpload$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    AttachedPhotoResizer attachedPhotoResizer = this.attachedPhotoResizer;
                    parcelPhotoAddViewModel$resizeAndUpload$1.L$0 = this;
                    parcelPhotoAddViewModel$resizeAndUpload$1.label = 1;
                    obj = attachedPhotoResizer.resize(attachedPhoto, parcelPhotoAddViewModel$resizeAndUpload$1);
                    if (obj != aVar) {
                        parcelPhotoAddViewModel = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        attachedPhoto3 = (AttachedPhoto) parcelPhotoAddViewModel$resizeAndUpload$1.L$1;
                        parcelPhotoAddViewModel2 = (ParcelPhotoAddViewModel) parcelPhotoAddViewModel$resizeAndUpload$1.L$0;
                        s.b(obj);
                        updateAttaches$default(parcelPhotoAddViewModel2, attachedPhoto3, null, 2, null);
                        return Unit.f71690a;
                    }
                    parcelPhotoAddViewModel = (ParcelPhotoAddViewModel) parcelPhotoAddViewModel$resizeAndUpload$1.L$0;
                    s.b(obj);
                    AttachedPhoto attachedPhoto4 = (AttachedPhoto) obj;
                    parcelPhotoAddViewModel$resizeAndUpload$1.L$0 = parcelPhotoAddViewModel;
                    parcelPhotoAddViewModel$resizeAndUpload$1.L$1 = attachedPhoto4;
                    parcelPhotoAddViewModel$resizeAndUpload$1.label = 3;
                    if (parcelPhotoAddViewModel.sendAnalyticsEvent(attachedPhoto4, parcelPhotoAddViewModel$resizeAndUpload$1) != aVar) {
                        parcelPhotoAddViewModel2 = parcelPhotoAddViewModel;
                        attachedPhoto3 = attachedPhoto4;
                        updateAttaches$default(parcelPhotoAddViewModel2, attachedPhoto3, null, 2, null);
                        return Unit.f71690a;
                    }
                    return aVar;
                }
                parcelPhotoAddViewModel = (ParcelPhotoAddViewModel) parcelPhotoAddViewModel$resizeAndUpload$1.L$0;
                s.b(obj);
                attachedPhoto2 = (AttachedPhoto) obj;
                AttachedPhoto.Status[] elements = {AttachedPhoto.Status.UPLOADED, AttachedPhoto.Status.UPLOADING, AttachedPhoto.Status.DELETING, AttachedPhoto.Status.DELETING_ERROR};
                Intrinsics.checkNotNullParameter(elements, "elements");
                parcelPhotoAddViewModel.updateAttaches(attachedPhoto2, C7705l.j0(elements));
                if (attachedPhoto2.getStatus() != AttachedPhoto.Status.RESIZING_ERROR) {
                    CmlUploadPhotoUseCase cmlUploadPhotoUseCase = parcelPhotoAddViewModel.uploadPhotoUseCase;
                    String str = parcelPhotoAddViewModel.deliveryNumber;
                    String str2 = parcelPhotoAddViewModel.postingNumber;
                    parcelPhotoAddViewModel$resizeAndUpload$1.L$0 = parcelPhotoAddViewModel;
                    parcelPhotoAddViewModel$resizeAndUpload$1.label = 2;
                    obj = cmlUploadPhotoUseCase.invoke(attachedPhoto2, str, str2, parcelPhotoAddViewModel$resizeAndUpload$1);
                }
                return Unit.f71690a;
            }
        }
        parcelPhotoAddViewModel$resizeAndUpload$1 = new ParcelPhotoAddViewModel$resizeAndUpload$1(this, dVar);
        Object obj2 = parcelPhotoAddViewModel$resizeAndUpload$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = parcelPhotoAddViewModel$resizeAndUpload$1.label;
        if (i11 != 0) {
        }
        attachedPhoto2 = (AttachedPhoto) obj2;
        AttachedPhoto.Status[] elements2 = {AttachedPhoto.Status.UPLOADED, AttachedPhoto.Status.UPLOADING, AttachedPhoto.Status.DELETING, AttachedPhoto.Status.DELETING_ERROR};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        parcelPhotoAddViewModel.updateAttaches(attachedPhoto2, C7705l.j0(elements2));
        if (attachedPhoto2.getStatus() != AttachedPhoto.Status.RESIZING_ERROR) {
        }
        return Unit.f71690a;
    }

    private final Object sendAnalyticsEvent(AttachedPhoto attachedPhoto, d<? super Unit> dVar) {
        Object n11;
        int i11 = WhenMappings.$EnumSwitchMapping$0[attachedPhoto.getStatus().ordinal()];
        Companion.AnalyticsEvent analyticsEvent = i11 != 1 ? i11 != 2 ? i11 != 3 ? null : Companion.AnalyticsEvent.UPLOAD_ERROR : Companion.AnalyticsEvent.DELETE_SUCCESS : Companion.AnalyticsEvent.UPLOAD_SUCCESS;
        return (analyticsEvent == null || (n11 = this._analyticsEvents.n(analyticsEvent, dVar)) != a.COROUTINE_SUSPENDED) ? Unit.f71690a : n11;
    }

    private final void showFailedDeletes() {
        Companion.ViewState value = this.attached.getValue();
        List attachments = value != null ? value.getAttachments() : null;
        if (attachments != null) {
            List list = attachments;
            boolean z11 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((AttachedPhoto) it.next()).getStatus() == AttachedPhoto.Status.DELETING_ERROR) {
                        z11 = true;
                        break;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z11);
            if (!z11) {
                valueOf = null;
            }
            if (valueOf != null) {
                C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ParcelPhotoAddViewModel$showFailedDeletes$3$1(this, null), 3);
            }
        }
    }

    private final List<AttachedPhoto> updateAttaches(List<AttachedPhoto> newAttaches, Set<? extends AttachedPhoto.Status> skipStatuses) {
        ArrayList arrayList = new ArrayList();
        Companion.ViewState value = this.attached.getValue();
        List attachments = value != null ? value.getAttachments() : null;
        List list = attachments != null ? attachments : null;
        if (list == null) {
            list = K.f71697a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : newAttaches) {
            linkedHashMap.put(((AttachedPhoto) obj).getPhotoKey(), obj);
        }
        List<AttachedPhoto> list2 = list;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
        for (AttachedPhoto attachedPhoto : list2) {
            if (skipStatuses.contains(attachedPhoto.getStatus())) {
                linkedHashMap.remove(attachedPhoto.getPhotoKey());
            } else {
                AttachedPhoto attachedPhoto2 = (AttachedPhoto) linkedHashMap.remove(attachedPhoto.getPhotoKey());
                if (attachedPhoto2 != null) {
                    arrayList.add(attachedPhoto2);
                    attachedPhoto = attachedPhoto2;
                }
            }
            arrayList2.add(attachedPhoto);
        }
        Collection values = linkedHashMap.values();
        Intrinsics.f(values);
        arrayList.addAll(values);
        Intrinsics.checkNotNullExpressionValue(values, "also(...)");
        ArrayList p02 = C7714v.p0(values, arrayList2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((AttachedPhoto) next).getMediaUri())) {
                arrayList3.add(next);
            }
        }
        this._attached.setValue(Companion.ViewState.m599boximpl(Companion.ViewState.m600constructorimpl(arrayList3)));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static AttachedPhoto updateAttaches$default(ParcelPhotoAddViewModel parcelPhotoAddViewModel, AttachedPhoto attachedPhoto, Set set, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            set = M.f71699a;
        }
        return parcelPhotoAddViewModel.updateAttaches(attachedPhoto, (Set<? extends AttachedPhoto.Status>) set);
    }

    public final void attachPhoto() {
        Companion.ViewState value = this.attached.getValue();
        List attachments = value != null ? value.getAttachments() : null;
        if (attachments == null) {
            attachments = null;
        }
        if (attachments == null) {
            attachments = K.f71697a;
        }
        Pair pair = new Pair(Integer.valueOf(attachments.size()), Integer.valueOf(this.pickPhotosLimit));
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ParcelPhotoAddViewModel$attachPhoto$1$1(((Number) pair.a()).intValue(), ((Number) pair.b()).intValue(), this, null), 3);
    }

    public final void bindData(@NotNull ParcelPhotoAddVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.deliveryNumber = vo.getDeliveryNumber();
        this.postingNumber = vo.getPostingNumber();
        this.pickPhotosLimit = vo.getMaxItemsCount();
        this.uploadPhotoAction = vo.getPhotoConfig().getUploadPhotoAction();
        this.deletePhotoAction = vo.getPhotoConfig().getDeletePhotoAction();
        List K02 = C7714v.K0(vo.getPhotos(), this.pickPhotosLimit);
        ArrayList arrayList = new ArrayList(C7714v.z(K02, 10));
        Iterator it = K02.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParcelPhotoAddVO.PhotoVO) it.next()).getPhoto());
        }
        this._attached.setValue(Companion.ViewState.m599boximpl(Companion.ViewState.m600constructorimpl(arrayList)));
    }

    public final void cancelUploading(@NotNull String photoKey) {
        Object obj;
        Intrinsics.checkNotNullParameter(photoKey, "photoKey");
        Companion.ViewState value = this.attached.getValue();
        List attachments = value != null ? value.getAttachments() : null;
        if (attachments != null) {
            Iterator it = attachments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((AttachedPhoto) obj).getPhotoKey(), photoKey)) {
                        break;
                    }
                }
            }
            AttachedPhoto attachedPhoto = (AttachedPhoto) obj;
            if (attachedPhoto != null) {
                this.uploadPhotoUseCase.cancelUpload(attachedPhoto.getPhotoKey());
            }
        }
        B0 remove = this.uploadingJobs.remove(photoKey);
        if (remove != null) {
            remove.j(null);
        }
        deleteFromAttached(photoKey);
    }

    public final void deletePhoto(@NotNull String photoKey) {
        Object obj;
        Intrinsics.checkNotNullParameter(photoKey, "photoKey");
        Companion.ViewState value = this.attached.getValue();
        List attachments = value != null ? value.getAttachments() : null;
        if (attachments != null) {
            Iterator it = attachments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((AttachedPhoto) obj).getPhotoKey(), photoKey)) {
                        break;
                    }
                }
            }
            AttachedPhoto attachedPhoto = (AttachedPhoto) obj;
            if (attachedPhoto != null) {
                if (attachedPhoto.getStatus() == AttachedPhoto.Status.RESIZING || attachedPhoto.getStatus() == AttachedPhoto.Status.UPLOADING_ERROR) {
                    deleteFromAttached(photoKey);
                    return;
                }
                AttachedPhoto copy$default = AttachedPhoto.copy$default(attachedPhoto, null, null, null, null, null, null, AttachedPhoto.Status.DELETING, null, null, 447, null);
                updateAttaches$default(this, copy$default, null, 2, null);
                C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ParcelPhotoAddViewModel$deletePhoto$2$1(this, copy$default, null), 3);
            }
        }
    }

    @NotNull
    public final InterfaceC2395h<Companion.AnalyticsEvent> getAnalyticsEvents() {
        return this.analyticsEvents;
    }

    @NotNull
    public final M0<Companion.ViewState> getAttached() {
        return this.attached;
    }

    @NotNull
    public final InterfaceC2395h<String> getErrors() {
        return this.errors;
    }

    @NotNull
    public final InterfaceC2395h<Integer> getOpenPickScreen() {
        return this.openPickScreen;
    }

    @Override // ru.ozon.app.android.domain.gallery.HandleGalleryResult
    public void handleGalleryResult(@NotNull g galleryLaunchResult) {
        Intrinsics.checkNotNullParameter(galleryLaunchResult, "galleryLaunchResult");
        List<l> a11 = galleryLaunchResult.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a11) {
            if (obj instanceof l.a) {
                arrayList.add(obj);
            }
        }
        PickedPhotosMapper pickedPhotosMapper = this.pickedPhotosMapper;
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(pickedPhotosMapper.map((l.a) it.next()));
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ParcelPhotoAddViewModel$handleGalleryResult$2$1(this, null), 3);
        AttachedPhoto.Status[] elements = {AttachedPhoto.Status.UPLOADED, AttachedPhoto.Status.UPLOADING, AttachedPhoto.Status.DELETING, AttachedPhoto.Status.DELETING_ERROR, AttachedPhoto.Status.RESIZING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<T> it2 = updateAttaches(arrayList2, C7705l.j0(elements)).iterator();
        while (it2.hasNext()) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ParcelPhotoAddViewModel$handleGalleryResult$3$1(this, (AttachedPhoto) it2.next(), null), 3);
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        Iterator<Map.Entry<String, B0>> it = this.uploadingJobs.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().j(null);
        }
        Unit unit = Unit.f71690a;
        this.uploadingJobs.clear();
        Iterator<Map.Entry<String, B0>> it2 = this.deletingJobs.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().j(null);
        }
        Unit unit2 = Unit.f71690a;
        this.deletingJobs.clear();
    }

    public final void retryAfterError(@NotNull String photoKey) {
        Object obj;
        Intrinsics.checkNotNullParameter(photoKey, "photoKey");
        Companion.ViewState value = this.attached.getValue();
        List attachments = value != null ? value.getAttachments() : null;
        if (attachments != null) {
            Iterator it = attachments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((AttachedPhoto) obj).getPhotoKey(), photoKey)) {
                        break;
                    }
                }
            }
            AttachedPhoto attachedPhoto = (AttachedPhoto) obj;
            if (attachedPhoto != null) {
                C10727i.c(androidx.lifecycle.x0.a(this), null, null, new ParcelPhotoAddViewModel$retryAfterError$2$1(this, attachedPhoto, null), 3);
            }
        }
    }

    private final AttachedPhoto updateAttaches(AttachedPhoto newAttach, Set<? extends AttachedPhoto.Status> skipStatuses) {
        Object obj;
        ArrayList p02;
        Companion.ViewState value = this.attached.getValue();
        List attachments = value != null ? value.getAttachments() : null;
        if (attachments == null) {
            attachments = null;
        }
        if (attachments == null) {
            attachments = K.f71697a;
        }
        List<AttachedPhoto> list = attachments;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((AttachedPhoto) obj).getPhotoKey(), newAttach.getPhotoKey())) {
                break;
            }
        }
        AttachedPhoto attachedPhoto = (AttachedPhoto) obj;
        if (C7714v.A(skipStatuses, attachedPhoto != null ? attachedPhoto.getStatus() : null)) {
            return null;
        }
        if (attachedPhoto != null) {
            p02 = new ArrayList(C7714v.z(list, 10));
            for (AttachedPhoto attachedPhoto2 : list) {
                if (Intrinsics.d(attachedPhoto2.getPhotoKey(), newAttach.getPhotoKey())) {
                    attachedPhoto2 = newAttach;
                }
                p02.add(attachedPhoto2);
            }
        } else {
            p02 = C7714v.p0(C7714v.a0(newAttach), attachments);
        }
        this._attached.setValue(Companion.ViewState.m599boximpl(Companion.ViewState.m600constructorimpl(p02)));
        return newAttach;
    }
}
