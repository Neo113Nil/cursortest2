package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import Ae.C;
import Ae.C2399j;
import Ae.C2405m;
import Ae.C2408n0;
import Ae.C2425z;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.Z;
import Hi.g;
import Hi.l;
import Sc.o;
import Sc.s;
import We.C;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVOKt;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.mediaupload.flags.ImageUploadAnalyticErrorEnabledFlag;
import ru.ozon.app.android.mediaupload.flags.VideoUploadAnalyticErrorEnabledFlag;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCase;
import ru.ozon.app.android.mediaupload.video.VideoUploadRepository;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10720e0;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0001zB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J%\u0010+\u001a\u00020\u000f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\u000f2\u0012\b\u0002\u0010.\u001a\f\u0012\u0006\b\u0001\u0012\u00020%\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J3\u00106\u001a\b\u0012\u0004\u0012\u00020%052\f\u00101\u001a\b\u0012\u0004\u0012\u00020%0$2\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020302H\u0003¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\u00020\u000f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020;0B2\u0006\u0010/\u001a\u00020;H\u0002¢\u0006\u0004\bC\u0010DJ\u0019\u0010F\u001a\u00020E*\b\u0012\u0004\u0012\u00020%0BH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000fH\u0002¢\u0006\u0004\bH\u0010\u0011J\u000f\u0010I\u001a\u00020\u000fH\u0002¢\u0006\u0004\bI\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010JR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010KR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010LR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010MR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010NR\"\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR:\u0010Y\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020W\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020%\u0018\u00010-0Vj\u0002`X0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R:\u0010]\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020W\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020%\u0018\u00010-0Vj\u0002`X0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010Z\u001a\u0004\b^\u0010\\R:\u0010`\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020)\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020%\u0018\u00010-0Vj\u0002`_0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010Z\u001a\u0004\ba\u0010\\R \u0010b\u001a\b\u0012\u0004\u0012\u00020\u000f0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010Z\u001a\u0004\bc\u0010\\R \u0010d\u001a\b\u0012\u0004\u0012\u00020\u000f0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010Z\u001a\u0004\be\u0010\\R \u0010f\u001a\b\u0012\u0004\u0012\u00020\u000f0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010Z\u001a\u0004\bg\u0010\\R \u0010j\u001a\b\u0012\u0004\u0012\u00020i0h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR \u0010n\u001a\b\u0012\u0004\u0012\u00020i0h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010k\u001a\u0004\bn\u0010mR\u0016\u0010o\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010pR\u0016\u0010r\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010vR\u0014\u0010w\u001a\u00020i8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020i8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010x¨\u0006{"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "pickedImagesMapper", "Lru/ozon/app/android/platform/image/ImageResizer;", "imageResizer", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;", "uploadImageUseCase", "Lru/ozon/app/android/mediaupload/video/VideoUploadRepository;", "videoUploadRepository", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;Lru/ozon/app/android/platform/image/ImageResizer;Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;Lru/ozon/app/android/mediaupload/video/VideoUploadRepository;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "attachMedia", "()V", "LHi/g;", "galleryLaunchResult", "handleGalleryResult", "(LHi/g;)V", "", "id", "removeAttachedClick", "(J)V", "retryUploadAttachedClick", "cancelUploadingClick", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "setUploadImageAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/VideoUpload;", "videoUpload", "setUploadVideoType", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/VideoUpload;)V", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "getMedias", "()Ljava/util/List;", "medias", "", "mediaCountLimit", "bindMedia", "(Ljava/util/List;I)V", "Lkotlin/reflect/d;", "type", "attach", "(Lkotlin/reflect/d;)V", "attaches", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "skipStatuses", "", "actualizeAttaches", "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;", "attachments", "uploadAttaches", "(Ljava/util/List;)V", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "attachment", "uploadImage", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;)V", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;", "uploadVideo", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;)V", "LAe/h;", "resizeImage", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;)LAe/h;", "Lxe/B0;", "launchUpload", "(LAe/h;)Lxe/B0;", "showFailedUploads", "removeValidationFailedAttachments", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "Lru/ozon/app/android/platform/image/ImageResizer;", "Lru/ozon/app/android/mediaupload/image/domain/UploadImageUseCase;", "Lru/ozon/app/android/mediaupload/video/VideoUploadRepository;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel$ViewState;", "attached", "Landroidx/lifecycle/V;", "getAttached", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lkotlin/Pair;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/StringToAttachment;", "messages", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getMessages", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "errors", "getErrors", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/IntToAttachment;", "openPickScreen", "getOpenPickScreen", "commonUploadError", "getCommonUploadError", "sendUploadEvent", "getSendUploadEvent", "sendUploadErrorEvent", "getSendUploadErrorEvent", "Landroidx/lifecycle/P;", "", "hasItems", "Landroidx/lifecycle/P;", "getHasItems", "()Landroidx/lifecycle/P;", "isMediaLimitReached", "pickImagesLimit", "I", "pickVideosLimit", "mediasLimit", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "uploadImageAction", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/VideoUpload;", "isVideoErrorAnalyticEnabled", "()Z", "isImageErrorAnalyticEnabled", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UploadingAttachmentsViewModelImpl extends w0 implements UploadingAttachmentsViewModel {

    @NotNull
    private final V<UploadingAttachmentsViewModel.ViewState> attached;

    @NotNull
    private final SingleLiveEvent<Unit> commonUploadError;

    @NotNull
    private final SingleLiveEvent<Pair<String, d<? extends AttachmentVO>>> errors;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final P<Boolean> hasItems;

    @NotNull
    private final ImageResizer imageResizer;

    @NotNull
    private final P<Boolean> isMediaLimitReached;
    private int mediasLimit;

    @NotNull
    private final SingleLiveEvent<Pair<String, d<? extends AttachmentVO>>> messages;

    @NotNull
    private final SingleLiveEvent<Pair<Integer, d<? extends AttachmentVO>>> openPickScreen;
    private int pickImagesLimit;
    private int pickVideosLimit;

    @NotNull
    private final PickedAttachmentsMapper pickedImagesMapper;

    @NotNull
    private final SingleLiveEvent<Unit> sendUploadErrorEvent;

    @NotNull
    private final SingleLiveEvent<Unit> sendUploadEvent;
    private AtomAction.ComposerAction uploadImageAction;

    @NotNull
    private final UploadImageUseCase uploadImageUseCase;
    private VideoUpload videoUpload;

    @NotNull
    private final VideoUploadRepository videoUploadRepository;
    public static final int $stable = 8;

    public UploadingAttachmentsViewModelImpl(@NotNull PickedAttachmentsMapper pickedImagesMapper, @NotNull ImageResizer imageResizer, @NotNull UploadImageUseCase uploadImageUseCase, @NotNull VideoUploadRepository videoUploadRepository, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(pickedImagesMapper, "pickedImagesMapper");
        Intrinsics.checkNotNullParameter(imageResizer, "imageResizer");
        Intrinsics.checkNotNullParameter(uploadImageUseCase, "uploadImageUseCase");
        Intrinsics.checkNotNullParameter(videoUploadRepository, "videoUploadRepository");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.pickedImagesMapper = pickedImagesMapper;
        this.imageResizer = imageResizer;
        this.uploadImageUseCase = uploadImageUseCase;
        this.videoUploadRepository = videoUploadRepository;
        this.featureChecker = featureChecker;
        this.attached = new V<>();
        this.messages = new SingleLiveEvent<>();
        this.errors = new SingleLiveEvent<>();
        this.openPickScreen = new SingleLiveEvent<>();
        this.commonUploadError = new SingleLiveEvent<>();
        this.sendUploadEvent = new SingleLiveEvent<>();
        this.sendUploadErrorEvent = new SingleLiveEvent<>();
        this.hasItems = t0.a(t0.b(getAttached(), UploadingAttachmentsViewModelImpl$hasItems$1.INSTANCE));
        this.isMediaLimitReached = t0.a(t0.b(getAttached(), UploadingAttachmentsViewModelImpl$isMediaLimitReached$1.INSTANCE));
        this.pickImagesLimit = 10;
        this.pickVideosLimit = 3;
        this.mediasLimit = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AttachmentVO> actualizeAttaches(List<? extends AttachmentVO> attaches, Set<? extends AttachmentVO.Status> skipStatuses) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : attaches) {
            linkedHashMap.put(Long.valueOf(((AttachmentVO) obj).getId()), obj);
        }
        UploadingAttachmentsViewModel.ViewState value = getAttached().getValue();
        List<AttachmentVO> attachments = value != null ? value.getAttachments() : null;
        if (attachments == null) {
            attachments = K.f71697a;
        }
        List<AttachmentVO> list = attachments;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
        for (AttachmentVO attachmentVO : list) {
            if (skipStatuses.contains(attachmentVO.getStatus())) {
                linkedHashMap.remove(Long.valueOf(attachmentVO.getId()));
            } else if (linkedHashMap.containsKey(Long.valueOf(attachmentVO.getId()))) {
                Object remove = linkedHashMap.remove(Long.valueOf(attachmentVO.getId()));
                Intrinsics.f(remove);
                attachmentVO = (AttachmentVO) remove;
                arrayList.add(attachmentVO);
            }
            arrayList2.add(attachmentVO);
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
            if (hashSet.add(((AttachmentVO) next).getMediaUri())) {
                arrayList3.add(next);
            }
        }
        getAttached().setValue(UploadingAttachmentsViewModel.ViewState.INSTANCE.newState(arrayList3, this.pickImagesLimit, this.pickVideosLimit, this.mediasLimit));
        return arrayList;
    }

    private final void attach(d<? extends AttachmentVO> type) {
        Pair pair;
        List<AttachmentVO> attachments;
        List<AttachmentVO> attachments2;
        if (Intrinsics.d(type, N.b(AttachmentVO.AttachedImageVO.class))) {
            UploadingAttachmentsViewModel.ViewState value = getAttached().getValue();
            if (value != null && (attachments2 = value.getAttachments()) != null) {
                r1 = AttachmentVOKt.images(attachments2);
            }
            if (r1 == null) {
                r1 = K.f71697a;
            }
            pair = new Pair(Integer.valueOf(r1.size()), Integer.valueOf(this.pickImagesLimit));
        } else if (Intrinsics.d(type, N.b(AttachmentVO.AttachedVideoVO.class))) {
            UploadingAttachmentsViewModel.ViewState value2 = getAttached().getValue();
            if (value2 != null && (attachments = value2.getAttachments()) != null) {
                r1 = AttachmentVOKt.videos(attachments);
            }
            if (r1 == null) {
                r1 = K.f71697a;
            }
            pair = new Pair(Integer.valueOf(r1.size()), Integer.valueOf(this.pickVideosLimit));
        } else {
            UploadingAttachmentsViewModel.ViewState value3 = getAttached().getValue();
            r1 = value3 != null ? value3.getAttachments() : null;
            if (r1 == null) {
                r1 = K.f71697a;
            }
            pair = new Pair(Integer.valueOf(r1.size()), Integer.valueOf(this.mediasLimit));
        }
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        if (intValue < intValue2) {
            getOpenPickScreen().postValue(new Pair<>(Integer.valueOf(intValue2 - intValue), type));
        } else {
            getMessages().postValue(new Pair<>(StringProvider.getString(R$string.error_reviews_picker_limit_reached), type));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void attach$default(UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl, d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = null;
        }
        uploadingAttachmentsViewModelImpl.attach(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isImageErrorAnalyticEnabled() {
        return this.featureChecker.isEnabled(ImageUploadAnalyticErrorEnabledFlag.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVideoErrorAnalyticEnabled() {
        return this.featureChecker.isEnabled(VideoUploadAnalyticErrorEnabledFlag.INSTANCE);
    }

    private final B0 launchUpload(InterfaceC2395h<? extends AttachmentVO> interfaceC2395h) {
        return C2399j.C(new C2425z(new C(new C2408n0(interfaceC2395h, new UploadingAttachmentsViewModelImpl$launchUpload$1(this, null)), new UploadingAttachmentsViewModelImpl$launchUpload$2(null)), new UploadingAttachmentsViewModelImpl$launchUpload$3(this, null)), x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeValidationFailedAttachments() {
        List<AttachmentVO> attachments;
        UploadingAttachmentsViewModel.ViewState value = getAttached().getValue();
        if (value == null || (attachments = value.getAttachments()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            if (!(((AttachmentVO) obj).getStatus() instanceof AttachmentVO.Status.VALIDATION_ERROR)) {
                arrayList.add(obj);
            }
        }
        getAttached().setValue(UploadingAttachmentsViewModel.ViewState.INSTANCE.newState(arrayList, this.pickImagesLimit, this.pickVideosLimit, this.mediasLimit));
    }

    private final InterfaceC2395h<AttachmentVO.AttachedImageVO> resizeImage(final AttachmentVO.AttachedImageVO attach) {
        final C2405m c2405m = new C2405m(new UploadingAttachmentsViewModelImpl$resizeImage$1(this, attach));
        return C2399j.B(new C(new InterfaceC2395h<AttachmentVO.AttachedImageVO>() { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$resizeImage$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$resizeImage$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ AttachmentVO.AttachedImageVO $attach$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$resizeImage$$inlined$map$1$2", f = "UploadingAttachmentsViewModel.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$resizeImage$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
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
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
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
                                String str = (String) ((Function0) obj).invoke();
                                AttachmentVO.Status.UPLOADING uploading = AttachmentVO.Status.UPLOADING.INSTANCE;
                                We.C.f33536g.getClass();
                                AttachmentVO.AttachedImageVO copy$default = AttachmentVO.AttachedImageVO.copy$default(this.$attach$inlined, null, str, null, null, null, null, null, null, null, 0L, null, null, null, null, C.a.b("image/jpeg"), uploading, null, false, 212989, null);
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
            public Object collect(InterfaceC2397i<? super AttachmentVO.AttachedImageVO> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, attach), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new UploadingAttachmentsViewModelImpl$resizeImage$3(attach, null)), C10720e0.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFailedUploads() {
        List<AttachmentVO> attachments;
        Object obj;
        UploadingAttachmentsViewModel.ViewState value = getAttached().getValue();
        if (value == null || (attachments = value.getAttachments()) == null) {
            return;
        }
        List<AttachmentVO> list = attachments;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (AttachmentVO attachmentVO : list) {
            if ((Intrinsics.d(attachmentVO.getStatus(), AttachmentVO.Status.UPLOADING_ERROR.INSTANCE) && !attachmentVO.getIsFallbackUploading()) || (attachmentVO.getStatus() instanceof AttachmentVO.Status.VALIDATION_ERROR)) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((AttachmentVO) obj).getStatus() instanceof AttachmentVO.Status.VALIDATION_ERROR) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                AttachmentVO attachmentVO2 = (AttachmentVO) obj;
                AttachmentVO.Status status = attachmentVO2 != null ? attachmentVO2.getStatus() : null;
                AttachmentVO.Status.VALIDATION_ERROR validation_error = status instanceof AttachmentVO.Status.VALIDATION_ERROR ? (AttachmentVO.Status.VALIDATION_ERROR) status : null;
                String errorMsg = validation_error != null ? validation_error.getErrorMsg() : null;
                if (errorMsg == null) {
                    getCommonUploadError().postValue(Unit.f71690a);
                    return;
                } else {
                    getErrors().postValue(new Pair<>(errorMsg, N.b(attachmentVO2.getClass())));
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadAttaches(List<? extends AttachmentVO> attachments) {
        for (AttachmentVO attachmentVO : attachments) {
            if (attachmentVO instanceof AttachmentVO.AttachedImageVO) {
                uploadImage((AttachmentVO.AttachedImageVO) attachmentVO);
            } else {
                if (!(attachmentVO instanceof AttachmentVO.AttachedVideoVO)) {
                    throw new o();
                }
                uploadVideo((AttachmentVO.AttachedVideoVO) attachmentVO);
            }
        }
    }

    private final void uploadImage(AttachmentVO.AttachedImageVO attachment) {
        InterfaceC2395h<? extends AttachmentVO> a11;
        AtomAction.ComposerAction composerAction = this.uploadImageAction;
        String actionName = composerAction != null ? composerAction.getActionName() : null;
        AtomAction.ComposerAction composerAction2 = this.uploadImageAction;
        a11 = Z.a(new C2408n0(resizeImage(AttachmentVO.AttachedImageVO.copy$default(attachment, null, null, null, null, null, null, null, actionName, composerAction2 != null ? composerAction2.getParams() : null, 0L, null, null, null, null, null, null, null, false, 261759, null)), new UploadingAttachmentsViewModelImpl$uploadImage$1(this, null)), new UploadingAttachmentsViewModelImpl$uploadImage$2(this, attachment, null));
        launchUpload(a11);
    }

    private final void uploadVideo(AttachmentVO.AttachedVideoVO attachment) {
        InterfaceC2395h<? extends AttachmentVO> a11;
        AttachmentVO.Status.UPLOADING uploading = AttachmentVO.Status.UPLOADING.INSTANCE;
        VideoUpload videoUpload = this.videoUpload;
        String actionName = videoUpload != null ? videoUpload.getActionName() : null;
        VideoUpload videoUpload2 = this.videoUpload;
        a11 = Z.a(new C2408n0(new C2405m(AttachmentVO.AttachedVideoVO.copy$default(attachment, null, null, actionName, videoUpload2 != null ? videoUpload2.getVideoType() : null, 0L, null, null, null, null, null, uploading, null, false, 7155, null)), new UploadingAttachmentsViewModelImpl$uploadVideo$1(this, null)), new UploadingAttachmentsViewModelImpl$uploadVideo$2(this, attachment, null));
        this.videoUploadRepository.saveUploadJob(attachment.getMediaUri(), launchUpload(a11));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    public void attachMedia() {
        attach$default(this, null, 1, null);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    public void bindMedia(@NotNull List<? extends AttachmentVO> medias, int mediaCountLimit) {
        Intrinsics.checkNotNullParameter(medias, "medias");
        this.mediasLimit = mediaCountLimit;
        AttachmentVO.Status[] elements = {AttachmentVO.Status.UPLOADED.INSTANCE, AttachmentVO.Status.UPLOADING.INSTANCE, AttachmentVO.Status.RESIZING.INSTANCE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        actualizeAttaches(medias, C7705l.j0(elements));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    public void cancelUploadingClick(long id2) {
        List<AttachmentVO> attachments;
        Object obj;
        UploadingAttachmentsViewModel.ViewState value = getAttached().getValue();
        if (value != null && (attachments = value.getAttachments()) != null) {
            Iterator<T> it = attachments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((AttachmentVO) obj).getId() == id2) {
                        break;
                    }
                }
            }
            AttachmentVO attachmentVO = (AttachmentVO) obj;
            if (attachmentVO != null) {
                if (attachmentVO instanceof AttachmentVO.AttachedImageVO) {
                    this.uploadImageUseCase.cancelUpload(((AttachmentVO.AttachedImageVO) attachmentVO).getId());
                } else {
                    if (!(attachmentVO instanceof AttachmentVO.AttachedVideoVO)) {
                        throw new o();
                    }
                    this.videoUploadRepository.cancel(((AttachmentVO.AttachedVideoVO) attachmentVO).getMediaUri());
                }
            }
        }
        removeAttachedClick(id2);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    @NotNull
    public P<Boolean> getHasItems() {
        return this.hasItems;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    public List<AttachmentVO> getMedias() {
        List<AttachmentVO> attachments;
        UploadingAttachmentsViewModel.ViewState value = getAttached().getValue();
        if (value == null || (attachments = value.getAttachments()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            if (Intrinsics.d(((AttachmentVO) obj).getStatus(), AttachmentVO.Status.UPLOADED.INSTANCE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public SingleLiveEvent<Pair<String, d<? extends AttachmentVO>>> getMessages() {
        return this.messages;
    }

    @Override // ru.ozon.app.android.domain.gallery.HandleGalleryResult
    public void handleGalleryResult(@NotNull g galleryLaunchResult) {
        Intrinsics.checkNotNullParameter(galleryLaunchResult, "galleryLaunchResult");
        List<l> a11 = galleryLaunchResult.a();
        PickedAttachmentsMapper pickedAttachmentsMapper = this.pickedImagesMapper;
        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(pickedAttachmentsMapper.map((l) it.next()));
        }
        AttachmentVO.Status[] elements = {AttachmentVO.Status.UPLOADED.INSTANCE, AttachmentVO.Status.UPLOADING.INSTANCE, AttachmentVO.Status.RESIZING.INSTANCE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        uploadAttaches(actualizeAttaches(arrayList, C7705l.j0(elements)));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    @NotNull
    public P<Boolean> isMediaLimitReached() {
        return this.isMediaLimitReached;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    public void removeAttachedClick(long id2) {
        List<AttachmentVO> attachments;
        UploadingAttachmentsViewModel.ViewState value = getAttached().getValue();
        if (value == null || (attachments = value.getAttachments()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            if (((AttachmentVO) obj).getId() != id2) {
                arrayList.add(obj);
            }
        }
        UploadingAttachmentsViewModel.ViewState newState = UploadingAttachmentsViewModel.ViewState.INSTANCE.newState(arrayList, this.pickImagesLimit, this.pickVideosLimit, this.mediasLimit);
        if (newState != null) {
            getAttached().postValue(newState);
        }
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    public void retryUploadAttachedClick(long id2) {
        List<AttachmentVO> attachments;
        Object obj;
        List a02;
        UploadingAttachmentsViewModel.ViewState value = getAttached().getValue();
        if (value == null || (attachments = value.getAttachments()) == null) {
            return;
        }
        Iterator<T> it = attachments.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((AttachmentVO) obj).getId() == id2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AttachmentVO attachmentVO = (AttachmentVO) obj;
        if (attachmentVO == null || (a02 = C7714v.a0(attachmentVO)) == null) {
            return;
        }
        List<AttachmentVO> list = a02;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (AttachmentVO attachmentVO2 : list) {
            arrayList.add(attachmentVO2.copyWith(attachmentVO2.getMediaUri(), attachmentVO2.getStatus(), false));
        }
        uploadAttaches(arrayList);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    public void setUploadImageAction(AtomAction action) {
        this.uploadImageAction = action instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) action : null;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    public void setUploadVideoType(VideoUpload videoUpload) {
        this.videoUpload = videoUpload;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    @NotNull
    public V<UploadingAttachmentsViewModel.ViewState> getAttached() {
        return this.attached;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    @NotNull
    public SingleLiveEvent<Unit> getCommonUploadError() {
        return this.commonUploadError;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    @NotNull
    public SingleLiveEvent<Pair<String, d<? extends AttachmentVO>>> getErrors() {
        return this.errors;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    @NotNull
    public SingleLiveEvent<Pair<Integer, d<? extends AttachmentVO>>> getOpenPickScreen() {
        return this.openPickScreen;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    @NotNull
    public SingleLiveEvent<Unit> getSendUploadErrorEvent() {
        return this.sendUploadErrorEvent;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel
    @NotNull
    public SingleLiveEvent<Unit> getSendUploadEvent() {
        return this.sendUploadEvent;
    }
}
