package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import B0.C2454a;
import H3.c;
import HY.b;
import Hi.l;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItemViewState;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.SignedLink;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.UploadingState;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 62\u00020\u0001:\u000267B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u0002*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001b0\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001b0 2\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020#0 ¢\u0006\u0004\b$\u0010%J+\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010'\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0012¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0012¢\u0006\u0004\b.\u0010-J!\u00101\u001a\u0002002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b1\u00102R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel;", "Landroidx/lifecycle/w0;", "", "", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/repository/ReturnCreationPhotoPickerRepository;", "repositories", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "attachmentsMapper", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "returnCreationEventManager", "<init>", "(Ljava/util/Map;Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;)V", "LHi/l;", "attachment", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "mapToMedia", "(LHi/l;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "mediaFile", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "mapToPhoto", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "mapLink", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;", "mapState", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItemViewState;", "", "", "getLoadParamsForAction", "(Ljava/util/Map;)Ljava/util/Map;", "groupId", "LAe/h;", "observeMedia", "(I)LAe/h;", "", "observeError", "()LAe/h;", "mediaList", "actionName", "Lxe/B0;", "attachPhotos", "(ILjava/util/List;Ljava/lang/String;)Lxe/B0;", "photo", "removePhoto", "(ILru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;)Lxe/B0;", "retry", "minCounts", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult;", "validate", "(Ljava/util/Map;)Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult;", "Ljava/util/Map;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "Companion", "ValidationResult", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PickerViewModel extends w0 {

    @NotNull
    private final PickedAttachmentsMapper attachmentsMapper;

    @NotNull
    private final Map<Integer, ReturnCreationPhotoPickerRepository> repositories;

    @NotNull
    private final ReturnCreationEventManager returnCreationEventManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$Companion;", "", "<init>", "()V", "IMAGE_LOCATIONS_JSON_PARAM", "", "ARG_BUCKET", "ARG_KEY", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult;", "", "Loading", "Success", "RequiredMinimalCount", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult$Loading;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult$RequiredMinimalCount;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult$Success;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ValidationResult {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult$Loading;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading implements ValidationResult {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 667140156;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult$RequiredMinimalCount;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult;", "", "", "groupIds", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getGroupIds", "()Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RequiredMinimalCount implements ValidationResult {

            @NotNull
            private final List<Integer> groupIds;

            public RequiredMinimalCount(@NotNull List<Integer> groupIds) {
                Intrinsics.checkNotNullParameter(groupIds, "groupIds");
                this.groupIds = groupIds;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RequiredMinimalCount) && Intrinsics.d(this.groupIds, ((RequiredMinimalCount) other).groupIds);
            }

            @NotNull
            public final List<Integer> getGroupIds() {
                return this.groupIds;
            }

            public int hashCode() {
                return this.groupIds.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("RequiredMinimalCount(groupIds=", ")", this.groupIds);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult$Success;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/PickerViewModel$ValidationResult;", "", "", "params", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements ValidationResult {

            @NotNull
            private final Map<String, String> params;

            public Success(@NotNull Map<String, String> params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.params, ((Success) other).params);
            }

            @NotNull
            public final Map<String, String> getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @NotNull
            public String toString() {
                return b.b("Success(params=", ")", this.params);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PickerViewModel(@NotNull Map<Integer, ? extends ReturnCreationPhotoPickerRepository> repositories, @NotNull PickedAttachmentsMapper attachmentsMapper, @NotNull ReturnCreationEventManager returnCreationEventManager) {
        Intrinsics.checkNotNullParameter(repositories, "repositories");
        Intrinsics.checkNotNullParameter(attachmentsMapper, "attachmentsMapper");
        Intrinsics.checkNotNullParameter(returnCreationEventManager, "returnCreationEventManager");
        this.repositories = repositories;
        this.attachmentsMapper = attachmentsMapper;
        this.returnCreationEventManager = returnCreationEventManager;
    }

    private final Map<String, String> getLoadParamsForAction(Map<Integer, ? extends List<MediaFile>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.h(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                SignedLink signedLink = ((MediaFile) it2.next()).getSignedLink();
                SignedLinkDTO.ImageLocation imageLocation = signedLink != null ? signedLink.getImageLocation() : null;
                if (imageLocation != null) {
                    arrayList.add(imageLocation);
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(U.h(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Iterable<SignedLinkDTO.ImageLocation> iterable2 = (Iterable) entry2.getValue();
            ArrayList arrayList2 = new ArrayList(C7714v.z(iterable2, 10));
            for (SignedLinkDTO.ImageLocation imageLocation2 : iterable2) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bucket", imageLocation2.getBucket());
                jSONObject.put("key", imageLocation2.getKey());
                arrayList2.add(jSONObject);
            }
            linkedHashMap2.put(key2, arrayList2);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            jSONObject2.put(String.valueOf(((Number) entry3.getKey()).intValue()), new JSONArray((Collection) entry3.getValue()));
        }
        return C2454a.b("imageLocations", jSONObject2.toString());
    }

    private final SignedLink mapLink(MediaFile mediaFile) {
        SignedLink signedLink = mediaFile.getSignedLink();
        if (signedLink == null) {
            AttachmentVO.AttachedImageVO attachment = mediaFile.getAttachment();
            signedLink = new SignedLink(null, String.valueOf(attachment != null ? attachment.getMediaUri() : null));
        }
        return signedLink;
    }

    private final PhotoItemViewState mapState(MediaFile mediaFile) {
        UploadingState uploadingState = mediaFile.getUploadingState();
        if (!(uploadingState instanceof UploadingState.Pending) && !(uploadingState instanceof UploadingState.Loading)) {
            if (uploadingState instanceof UploadingState.Uploaded) {
                return PhotoItemViewState.Success.INSTANCE;
            }
            if (uploadingState instanceof UploadingState.Error) {
                return PhotoItemViewState.Error.INSTANCE;
            }
            throw new o();
        }
        return PhotoItemViewState.Loading.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaFile mapToMedia(l attachment) {
        AttachmentVO map = this.attachmentsMapper.map(attachment);
        AttachmentVO.AttachedImageVO attachedImageVO = map instanceof AttachmentVO.AttachedImageVO ? (AttachmentVO.AttachedImageVO) map : null;
        if (attachedImageVO == null) {
            return null;
        }
        return new MediaFile(attachment.getId(), attachedImageVO, null, UploadingState.Pending.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhotoItem mapToPhoto(MediaFile mediaFile) {
        return new PhotoItem(mediaFile.getId(), mapLink(mediaFile), PhotoItem.INSTANCE.getDeleteButton(), mapState(mediaFile));
    }

    @NotNull
    public final B0 attachPhotos(int groupId, @NotNull List<? extends l> mediaList, @NotNull String actionName) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        return C10727i.c(x0.a(this), null, null, new PickerViewModel$attachPhotos$1(this, groupId, mediaList, actionName, null), 3);
    }

    @NotNull
    public final InterfaceC2395h<Unit> observeError() {
        Collection<ReturnCreationPhotoPickerRepository> values = this.repositories.values();
        ArrayList arrayList = new ArrayList(C7714v.z(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((ReturnCreationPhotoPickerRepository) it.next()).getError());
        }
        return C2399j.E(arrayList);
    }

    @NotNull
    public final InterfaceC2395h<List<PhotoItem>> observeMedia(int groupId) {
        final M0<Set<MediaFile>> media;
        ReturnCreationPhotoPickerRepository returnCreationPhotoPickerRepository = this.repositories.get(Integer.valueOf(groupId));
        return (returnCreationPhotoPickerRepository == null || (media = returnCreationPhotoPickerRepository.getMedia()) == null) ? O0.a(K.f71697a) : new InterfaceC2395h<List<? extends PhotoItem>>() { // from class: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.PickerViewModel$observeMedia$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.PickerViewModel$observeMedia$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ PickerViewModel this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.PickerViewModel$observeMedia$$inlined$map$1$2", f = "PickerViewModel.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.PickerViewModel$observeMedia$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, PickerViewModel pickerViewModel) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = pickerViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    PhotoItem mapToPhoto;
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
                                Set set = (Set) obj;
                                ArrayList arrayList = new ArrayList(C7714v.z(set, 10));
                                Iterator<T> it = set.iterator();
                                while (it.hasNext()) {
                                    mapToPhoto = this.this$0.mapToPhoto((MediaFile) it.next());
                                    arrayList.add(mapToPhoto);
                                }
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(arrayList, anonymousClass1) == aVar) {
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
            public Object collect(InterfaceC2397i<? super List<? extends PhotoItem>> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    @NotNull
    public final B0 removePhoto(int groupId, @NotNull PhotoItem photo) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        return C10727i.c(x0.a(this), null, null, new PickerViewModel$removePhoto$1(this, groupId, photo, null), 3);
    }

    @NotNull
    public final B0 retry(int groupId, @NotNull PhotoItem photo) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        return C10727i.c(x0.a(this), null, null, new PickerViewModel$retry$1(this, groupId, photo, null), 3);
    }

    @NotNull
    public final ValidationResult validate(@NotNull Map<Integer, Integer> minCounts) {
        Intrinsics.checkNotNullParameter(minCounts, "minCounts");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, ReturnCreationPhotoPickerRepository> entry : this.repositories.entrySet()) {
            int intValue = entry.getKey().intValue();
            ReturnCreationPhotoPickerRepository value = entry.getValue();
            Set<MediaFile> value2 = value.getMedia().getValue();
            if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                Iterator<T> it = value2.iterator();
                while (it.hasNext()) {
                    if (!Intrinsics.d(((MediaFile) it.next()).getUploadingState(), UploadingState.Uploaded.INSTANCE)) {
                        return ValidationResult.Loading.INSTANCE;
                    }
                }
            }
            int size = value.getMedia().getValue().size();
            Integer num = minCounts.get(Integer.valueOf(intValue));
            if (size < (num != null ? num.intValue() : 0)) {
                arrayList.add(Integer.valueOf(intValue));
            }
        }
        if (!arrayList.isEmpty()) {
            return new ValidationResult.RequiredMinimalCount(arrayList);
        }
        Map<Integer, ReturnCreationPhotoPickerRepository> map = this.repositories;
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.h(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap.put(entry2.getKey(), C7714v.U0(((ReturnCreationPhotoPickerRepository) entry2.getValue()).getMedia().getValue()));
        }
        return new ValidationResult.Success(getLoadParamsForAction(linkedHashMap));
    }
}
