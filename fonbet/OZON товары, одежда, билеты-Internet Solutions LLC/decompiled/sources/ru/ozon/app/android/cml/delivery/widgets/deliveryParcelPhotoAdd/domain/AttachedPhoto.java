package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import N3.C3660k;
import We.C;
import Xc.a;
import Xc.b;
import android.net.Uri;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001:\u00011Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011Jv\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b)\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b0\u0010/¨\u00062"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "", "", "photoKey", "cdnUrl", "remoteId", "Landroid/net/Uri;", "mediaUri", "LWe/C;", "mediaType", "resizedFilePath", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto$Status;", "status", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "uploadPhotoAction", "deletePhotoAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;LWe/C;Ljava/lang/String;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto$Status;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;LWe/C;Ljava/lang/String;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto$Status;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhotoKey", "getCdnUrl", "getRemoteId", "Landroid/net/Uri;", "getMediaUri", "()Landroid/net/Uri;", "setMediaUri", "(Landroid/net/Uri;)V", "LWe/C;", "getMediaType", "()LWe/C;", "getResizedFilePath", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto$Status;", "getStatus", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto$Status;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getUploadPhotoAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getDeletePhotoAction", "Status", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AttachedPhoto {
    private final String cdnUrl;
    private final AtomAction.ComposerAction deletePhotoAction;
    private final C mediaType;

    @NotNull
    private Uri mediaUri;

    @NotNull
    private final String photoKey;
    private final String remoteId;
    private final String resizedFilePath;

    @NotNull
    private final Status status;
    private final AtomAction.ComposerAction uploadPhotoAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto$Status;", "", "isShowRemover", "", "isShowOverlay", "isShowLoader", "isShowRetry", "<init>", "(Ljava/lang/String;IZZZZ)V", "()Z", "RESIZING", "UPLOADING", "DELETING", "UPLOADED", "DELETED", "RESIZING_ERROR", "UPLOADING_ERROR", "DELETING_ERROR", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private final boolean isShowLoader;
        private final boolean isShowOverlay;
        private final boolean isShowRemover;
        private final boolean isShowRetry;
        public static final Status RESIZING = new Status("RESIZING", 0, false, false, true, false);
        public static final Status UPLOADING = new Status("UPLOADING", 1, false, false, true, false);
        public static final Status DELETING = new Status("DELETING", 2, false, true, false, false);
        public static final Status UPLOADED = new Status("UPLOADED", 3, true, false, false, false);
        public static final Status DELETED = new Status("DELETED", 4, false, false, false, false);
        public static final Status RESIZING_ERROR = new Status("RESIZING_ERROR", 5, true, false, false, true);
        public static final Status UPLOADING_ERROR = new Status("UPLOADING_ERROR", 6, true, false, false, true);
        public static final Status DELETING_ERROR = new Status("DELETING_ERROR", 7, true, false, false, false);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{RESIZING, UPLOADING, DELETING, UPLOADED, DELETED, RESIZING_ERROR, UPLOADING_ERROR, DELETING_ERROR};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Status(String str, int i11, boolean z11, boolean z12, boolean z13, boolean z14) {
            this.isShowRemover = z11;
            this.isShowOverlay = z12;
            this.isShowLoader = z13;
            this.isShowRetry = z14;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        /* renamed from: isShowLoader, reason: from getter */
        public final boolean getIsShowLoader() {
            return this.isShowLoader;
        }

        /* renamed from: isShowOverlay, reason: from getter */
        public final boolean getIsShowOverlay() {
            return this.isShowOverlay;
        }

        /* renamed from: isShowRemover, reason: from getter */
        public final boolean getIsShowRemover() {
            return this.isShowRemover;
        }

        /* renamed from: isShowRetry, reason: from getter */
        public final boolean getIsShowRetry() {
            return this.isShowRetry;
        }
    }

    public AttachedPhoto(@NotNull String photoKey, String str, String str2, @NotNull Uri mediaUri, C c11, String str3, @NotNull Status status, AtomAction.ComposerAction composerAction, AtomAction.ComposerAction composerAction2) {
        Intrinsics.checkNotNullParameter(photoKey, "photoKey");
        Intrinsics.checkNotNullParameter(mediaUri, "mediaUri");
        Intrinsics.checkNotNullParameter(status, "status");
        this.photoKey = photoKey;
        this.cdnUrl = str;
        this.remoteId = str2;
        this.mediaUri = mediaUri;
        this.mediaType = c11;
        this.resizedFilePath = str3;
        this.status = status;
        this.uploadPhotoAction = composerAction;
        this.deletePhotoAction = composerAction2;
    }

    public static /* synthetic */ AttachedPhoto copy$default(AttachedPhoto attachedPhoto, String str, String str2, String str3, Uri uri, C c11, String str4, Status status, AtomAction.ComposerAction composerAction, AtomAction.ComposerAction composerAction2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = attachedPhoto.photoKey;
        }
        if ((i11 & 2) != 0) {
            str2 = attachedPhoto.cdnUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = attachedPhoto.remoteId;
        }
        if ((i11 & 8) != 0) {
            uri = attachedPhoto.mediaUri;
        }
        if ((i11 & 16) != 0) {
            c11 = attachedPhoto.mediaType;
        }
        if ((i11 & 32) != 0) {
            str4 = attachedPhoto.resizedFilePath;
        }
        if ((i11 & 64) != 0) {
            status = attachedPhoto.status;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            composerAction = attachedPhoto.uploadPhotoAction;
        }
        if ((i11 & 256) != 0) {
            composerAction2 = attachedPhoto.deletePhotoAction;
        }
        AtomAction.ComposerAction composerAction3 = composerAction;
        AtomAction.ComposerAction composerAction4 = composerAction2;
        String str5 = str4;
        Status status2 = status;
        C c12 = c11;
        String str6 = str3;
        return attachedPhoto.copy(str, str2, str6, uri, c12, str5, status2, composerAction3, composerAction4);
    }

    @NotNull
    public final AttachedPhoto copy(@NotNull String photoKey, String cdnUrl, String remoteId, @NotNull Uri mediaUri, C mediaType, String resizedFilePath, @NotNull Status status, AtomAction.ComposerAction uploadPhotoAction, AtomAction.ComposerAction deletePhotoAction) {
        Intrinsics.checkNotNullParameter(photoKey, "photoKey");
        Intrinsics.checkNotNullParameter(mediaUri, "mediaUri");
        Intrinsics.checkNotNullParameter(status, "status");
        return new AttachedPhoto(photoKey, cdnUrl, remoteId, mediaUri, mediaType, resizedFilePath, status, uploadPhotoAction, deletePhotoAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachedPhoto)) {
            return false;
        }
        AttachedPhoto attachedPhoto = (AttachedPhoto) other;
        return Intrinsics.d(this.photoKey, attachedPhoto.photoKey) && Intrinsics.d(this.cdnUrl, attachedPhoto.cdnUrl) && Intrinsics.d(this.remoteId, attachedPhoto.remoteId) && Intrinsics.d(this.mediaUri, attachedPhoto.mediaUri) && Intrinsics.d(this.mediaType, attachedPhoto.mediaType) && Intrinsics.d(this.resizedFilePath, attachedPhoto.resizedFilePath) && this.status == attachedPhoto.status && Intrinsics.d(this.uploadPhotoAction, attachedPhoto.uploadPhotoAction) && Intrinsics.d(this.deletePhotoAction, attachedPhoto.deletePhotoAction);
    }

    public final String getCdnUrl() {
        return this.cdnUrl;
    }

    public final AtomAction.ComposerAction getDeletePhotoAction() {
        return this.deletePhotoAction;
    }

    public final C getMediaType() {
        return this.mediaType;
    }

    @NotNull
    public final Uri getMediaUri() {
        return this.mediaUri;
    }

    @NotNull
    public final String getPhotoKey() {
        return this.photoKey;
    }

    public final String getRemoteId() {
        return this.remoteId;
    }

    public final String getResizedFilePath() {
        return this.resizedFilePath;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public final AtomAction.ComposerAction getUploadPhotoAction() {
        return this.uploadPhotoAction;
    }

    public int hashCode() {
        int hashCode = this.photoKey.hashCode() * 31;
        String str = this.cdnUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remoteId;
        int hashCode3 = (this.mediaUri.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        C c11 = this.mediaType;
        int hashCode4 = (hashCode3 + (c11 == null ? 0 : c11.hashCode())) * 31;
        String str3 = this.resizedFilePath;
        int hashCode5 = (this.status.hashCode() + ((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        AtomAction.ComposerAction composerAction = this.uploadPhotoAction;
        int hashCode6 = (hashCode5 + (composerAction == null ? 0 : composerAction.hashCode())) * 31;
        AtomAction.ComposerAction composerAction2 = this.deletePhotoAction;
        return hashCode6 + (composerAction2 != null ? composerAction2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.photoKey;
        String str2 = this.cdnUrl;
        String str3 = this.remoteId;
        Uri uri = this.mediaUri;
        C c11 = this.mediaType;
        String str4 = this.resizedFilePath;
        Status status = this.status;
        AtomAction.ComposerAction composerAction = this.uploadPhotoAction;
        AtomAction.ComposerAction composerAction2 = this.deletePhotoAction;
        StringBuilder d11 = C3660k.d("AttachedPhoto(photoKey=", str, ", cdnUrl=", str2, ", remoteId=");
        d11.append(str3);
        d11.append(", mediaUri=");
        d11.append(uri);
        d11.append(", mediaType=");
        d11.append(c11);
        d11.append(", resizedFilePath=");
        d11.append(str4);
        d11.append(", status=");
        d11.append(status);
        d11.append(", uploadPhotoAction=");
        d11.append(composerAction);
        d11.append(", deletePhotoAction=");
        d11.append(composerAction2);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ AttachedPhoto(String str, String str2, String str3, Uri uri, C c11, String str4, Status status, AtomAction.ComposerAction composerAction, AtomAction.ComposerAction composerAction2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, uri, c11, str4, status, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : composerAction, (i11 & 256) != 0 ? null : composerAction2);
    }
}
