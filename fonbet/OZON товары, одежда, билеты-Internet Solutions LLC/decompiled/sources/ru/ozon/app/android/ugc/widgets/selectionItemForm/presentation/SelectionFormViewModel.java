package ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation;

import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Sc.o;
import Sc.s;
import Tc.d;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Content;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerEvent;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionMedia$Photo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionMedia$Video;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SingleEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 K2\u00020\u0001:\u0001KB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u001a\u0010\u0015J\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 2\u0006\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0'*\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\"\u00100\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010-R\"\u00101\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010-R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020!038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020!0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010:\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020D0F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent;", "viewIntent", "", "onViewIntent", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent;)V", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;", "event", "onMediaPickerEvent", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;)V", "observeViewIntent", "()V", "", "isAnyInputFilled", "()Z", "isRequiredFilled", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "processSubmitAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "onFailure", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "toActionV2Request", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Lru/ozon/app/android/action/v2/models/ActionV2Request;", "action", "", "", "", "buildSelectionFormParams", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Ljava/util/Map;", "getCustomTrackingInfo", "()Ljava/util/Map;", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "mapToSelectionMedia", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "uploadKeyToAnalyticsKeyMap", "Ljava/util/Map;", "", "inputData", "inputInitialData", "cellData", "cellInitialData", "", "requiredInputs", "Ljava/util/Set;", "initialMedia", "Ljava/util/List;", "media", "productIds", "isCancelSheetShowing", "Z", "selectionUuid", "Ljava/lang/String;", "Lxe/B0;", "currentJob", "Lxe/B0;", "LAe/w0;", "viewIntents", "LAe/w0;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;", "_singleEvent", "LAe/B0;", "singleEvent", "LAe/B0;", "getSingleEvent", "()LAe/B0;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormViewModel extends w0 {

    @NotNull
    private final Ae.w0<SingleEvent> _singleEvent;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private Map<String, String> cellData;

    @NotNull
    private Map<String, String> cellInitialData;
    private B0 currentJob;
    private List<Object> initialMedia;

    @NotNull
    private Map<String, String> inputData;

    @NotNull
    private Map<String, String> inputInitialData;
    private boolean isCancelSheetShowing;
    private List<Object> media;

    @NotNull
    private List<String> productIds;

    @NotNull
    private Set<String> requiredInputs;
    private String selectionUuid;

    @NotNull
    private final Ae.B0<SingleEvent> singleEvent;

    @NotNull
    private final Map<String, String> uploadKeyToAnalyticsKeyMap;

    @NotNull
    private final Ae.w0<ViewIntent> viewIntents;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel$Companion;", "", "<init>", "()V", "PARAM_CONTENT", "", "PARAM_SELECTION_UUID", "TITLE_KEY", "STATUS_KEY", "INDEX_KEY", "IS_PUBLIC_UPLOAD_KEY", "PRODUCT_IDS_KEY", "STATUS_PUBLIC", "STATUS_PRIVATE", "MEDIA_KEY", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SelectionFormViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.uploadKeyToAnalyticsKeyMap = U.j(new Pair(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME), new Pair("isPublic", "status"));
        this.inputData = new LinkedHashMap();
        this.inputInitialData = new LinkedHashMap();
        this.cellData = new LinkedHashMap();
        this.cellInitialData = new LinkedHashMap();
        this.requiredInputs = new LinkedHashSet();
        this.productIds = K.f71697a;
        this.viewIntents = E0.b(0, 0, null, 7);
        C0 b11 = E0.b(0, 0, null, 7);
        this._singleEvent = b11;
        this.singleEvent = C2399j.a(b11);
        observeViewIntent();
    }

    private final Map<String, Object> buildSelectionFormParams(AtomAction.ComposerAction action) {
        d builder = new d();
        Map<String, String> params = action.getParams();
        if (params != null) {
            builder.putAll(params);
        }
        builder.put("content", U.m(this.inputData, this.cellData));
        String str = this.selectionUuid;
        if (str != null) {
            builder.put("selectionUuid", str);
        }
        if (CollectionsExtKt.isNotNullOrEmpty(this.media)) {
            Collection collection = this.media;
            if (collection == null) {
                collection = K.f71697a;
            }
            builder.put("media", collection);
        }
        if (!this.productIds.isEmpty()) {
            builder.put("productIds", this.productIds);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> getCustomTrackingInfo() {
        d builder = new d();
        for (Map.Entry<String, String> entry : this.inputData.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str = this.uploadKeyToAnalyticsKeyMap.get(key);
            if (str != null) {
                builder.put(str, value);
            }
        }
        for (Map.Entry<String, String> entry2 : this.cellData.entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            String str2 = this.uploadKeyToAnalyticsKeyMap.get(key2);
            if (str2 != null) {
                if (str2.equals("status")) {
                    value2 = Boolean.parseBoolean(value2) ? "public" : "private";
                }
                builder.put(str2, value2);
            }
        }
        List<Object> list = this.media;
        if (list != null) {
            builder.put("index", Integer.valueOf(list.size()));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAnyInputFilled() {
        for (Map.Entry<String, String> entry : this.inputData.entrySet()) {
            if (!Intrinsics.d(this.inputInitialData.get(entry.getKey()), entry.getValue())) {
                return true;
            }
        }
        for (Map.Entry<String, String> entry2 : this.cellData.entrySet()) {
            if (!Intrinsics.d(this.cellInitialData.get(entry2.getKey()), entry2.getValue())) {
                return true;
            }
        }
        return !Intrinsics.d(this.media, this.initialMedia);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isRequiredFilled(kotlin.coroutines.d<? super Boolean> dVar) {
        SelectionFormViewModel$isRequiredFilled$1 selectionFormViewModel$isRequiredFilled$1;
        int i11;
        Iterator it;
        SelectionFormViewModel selectionFormViewModel;
        I i12;
        if (dVar instanceof SelectionFormViewModel$isRequiredFilled$1) {
            selectionFormViewModel$isRequiredFilled$1 = (SelectionFormViewModel$isRequiredFilled$1) dVar;
            int i13 = selectionFormViewModel$isRequiredFilled$1.label;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                selectionFormViewModel$isRequiredFilled$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = selectionFormViewModel$isRequiredFilled$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = selectionFormViewModel$isRequiredFilled$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    I i14 = new I();
                    i14.f71783a = true;
                    it = this.requiredInputs.iterator();
                    selectionFormViewModel = this;
                    i12 = i14;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) selectionFormViewModel$isRequiredFilled$1.L$2;
                    i12 = (I) selectionFormViewModel$isRequiredFilled$1.L$1;
                    selectionFormViewModel = (SelectionFormViewModel) selectionFormViewModel$isRequiredFilled$1.L$0;
                    s.b(obj);
                }
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = selectionFormViewModel.inputData.get(str);
                    if (str2 == null || h.K(str2)) {
                        i12.f71783a = false;
                        Ae.w0<SingleEvent> w0Var = selectionFormViewModel._singleEvent;
                        SingleEvent.ShowRequiredTextError showRequiredTextError = new SingleEvent.ShowRequiredTextError(str);
                        selectionFormViewModel$isRequiredFilled$1.L$0 = selectionFormViewModel;
                        selectionFormViewModel$isRequiredFilled$1.L$1 = i12;
                        selectionFormViewModel$isRequiredFilled$1.L$2 = it;
                        selectionFormViewModel$isRequiredFilled$1.label = 1;
                        if (w0Var.emit(showRequiredTextError, selectionFormViewModel$isRequiredFilled$1) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Boolean.valueOf(i12.f71783a);
            }
        }
        selectionFormViewModel$isRequiredFilled$1 = new SelectionFormViewModel$isRequiredFilled$1(this, dVar);
        Object obj2 = selectionFormViewModel$isRequiredFilled$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = selectionFormViewModel$isRequiredFilled$1.label;
        if (i11 != 0) {
        }
        while (it.hasNext()) {
        }
        return Boolean.valueOf(i12.f71783a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x000b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Object> mapToSelectionMedia(List<? extends AttachmentVO> list) {
        Object selectionMedia$Video;
        ArrayList arrayList = new ArrayList();
        for (AttachmentVO attachmentVO : list) {
            Object obj = null;
            if (attachmentVO instanceof AttachmentVO.AttachedImageVO) {
                AttachmentVO.AttachedImageVO attachedImageVO = (AttachmentVO.AttachedImageVO) attachmentVO;
                String url = attachedImageVO.getUrl();
                if (url != null) {
                    Integer width = attachedImageVO.getWidth();
                    String num = width != null ? width.toString() : null;
                    Integer height = attachedImageVO.getHeight();
                    selectionMedia$Video = new SelectionMedia$Photo(null, new Content.Photo(url, num, height != null ? height.toString() : null, attachedImageVO.getUuid(), attachedImageVO.getFilename(), attachedImageVO.getBucket()), 1, null);
                    obj = selectionMedia$Video;
                }
                if (obj == null) {
                    arrayList.add(obj);
                }
            } else {
                if (!(attachmentVO instanceof AttachmentVO.AttachedVideoVO)) {
                    throw new o();
                }
                AttachmentVO.AttachedVideoVO attachedVideoVO = (AttachmentVO.AttachedVideoVO) attachmentVO;
                String uploadId = attachedVideoVO.getUploadId();
                if (uploadId != null) {
                    selectionMedia$Video = new SelectionMedia$Video(null, new Content.Video(uploadId, attachedVideoVO.getUuid()), 1, null);
                    obj = selectionMedia$Video;
                }
                if (obj == null) {
                }
            }
        }
        return arrayList;
    }

    private final void observeViewIntent() {
        C2399j.C(new C2408n0(this.viewIntents, new SelectionFormViewModel$observeViewIntent$1(this, null)), x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r7.emit(r2, r0) != r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onFailure(kotlin.coroutines.d<? super Unit> dVar) {
        SelectionFormViewModel$onFailure$1 selectionFormViewModel$onFailure$1;
        int i11;
        SelectionFormViewModel selectionFormViewModel;
        if (dVar instanceof SelectionFormViewModel$onFailure$1) {
            selectionFormViewModel$onFailure$1 = (SelectionFormViewModel$onFailure$1) dVar;
            int i12 = selectionFormViewModel$onFailure$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                selectionFormViewModel$onFailure$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = selectionFormViewModel$onFailure$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = selectionFormViewModel$onFailure$1.label;
                int i13 = 1;
                if (i11 != 0) {
                    s.b(obj);
                    Ae.w0<SingleEvent> w0Var = this._singleEvent;
                    SingleEvent.UpdateLoader updateLoader = new SingleEvent.UpdateLoader(false);
                    selectionFormViewModel$onFailure$1.L$0 = this;
                    selectionFormViewModel$onFailure$1.label = 1;
                    if (w0Var.emit(updateLoader, selectionFormViewModel$onFailure$1) != aVar) {
                        selectionFormViewModel = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                selectionFormViewModel = (SelectionFormViewModel) selectionFormViewModel$onFailure$1.L$0;
                s.b(obj);
                Ae.w0<SingleEvent> w0Var2 = selectionFormViewModel._singleEvent;
                SingleEvent.ShowError showError = new SingleEvent.ShowError(null, i13, 0 == true ? 1 : 0);
                selectionFormViewModel$onFailure$1.L$0 = null;
                selectionFormViewModel$onFailure$1.label = 2;
            }
        }
        selectionFormViewModel$onFailure$1 = new SelectionFormViewModel$onFailure$1(this, dVar);
        Object obj2 = selectionFormViewModel$onFailure$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = selectionFormViewModel$onFailure$1.label;
        int i132 = 1;
        if (i11 != 0) {
        }
        Ae.w0<SingleEvent> w0Var22 = selectionFormViewModel._singleEvent;
        SingleEvent.ShowError showError2 = new SingleEvent.ShowError(null, i132, 0 == true ? 1 : 0);
        selectionFormViewModel$onFailure$1.L$0 = null;
        selectionFormViewModel$onFailure$1.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processSubmitAction(AtomAction atomAction) {
        AtomAction.ComposerAction composerAction = atomAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) atomAction : null;
        if (composerAction == null) {
            return;
        }
        B0 b02 = this.currentJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.currentJob = C10727i.c(x0.a(this), null, null, new SelectionFormViewModel$processSubmitAction$1(this, composerAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionV2Request toActionV2Request(AtomAction.ComposerAction composerAction) {
        return new ActionV2Request(buildSelectionFormParams(composerAction), composerAction.getActionName(), false, 4, null);
    }

    @NotNull
    public final Ae.B0<SingleEvent> getSingleEvent() {
        return this.singleEvent;
    }

    public final void onMediaPickerEvent(@NotNull MediaPickerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C10727i.c(x0.a(this), null, null, new SelectionFormViewModel$onMediaPickerEvent$1(event, this, null), 3);
    }

    public final void onViewIntent(@NotNull ViewIntent viewIntent) {
        Intrinsics.checkNotNullParameter(viewIntent, "viewIntent");
        C10727i.c(x0.a(this), null, null, new SelectionFormViewModel$onViewIntent$1(this, viewIntent, null), 3);
    }
}
