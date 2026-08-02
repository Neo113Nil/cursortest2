package ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation;

import B90.C2618u;
import N3.C3660k;
import Nh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;", "", "UploadingStateUpdated", "UploadFailed", "AttachmentsUpdated", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent$AttachmentsUpdated;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent$UploadFailed;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent$UploadingStateUpdated;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MediaPickerEvent {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent$AttachmentsUpdated;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;", "", "photoUploadKey", "videoUploadKey", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "attachments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhotoUploadKey", "getVideoUploadKey", "Ljava/util/List;", "getAttachments", "()Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AttachmentsUpdated implements MediaPickerEvent {

        @NotNull
        private final List<AttachmentVO> attachments;

        @NotNull
        private final String photoUploadKey;
        private final String videoUploadKey;

        /* JADX WARN: Multi-variable type inference failed */
        public AttachmentsUpdated(@NotNull String photoUploadKey, String str, @NotNull List<? extends AttachmentVO> attachments) {
            Intrinsics.checkNotNullParameter(photoUploadKey, "photoUploadKey");
            Intrinsics.checkNotNullParameter(attachments, "attachments");
            this.photoUploadKey = photoUploadKey;
            this.videoUploadKey = str;
            this.attachments = attachments;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttachmentsUpdated)) {
                return false;
            }
            AttachmentsUpdated attachmentsUpdated = (AttachmentsUpdated) other;
            return Intrinsics.d(this.photoUploadKey, attachmentsUpdated.photoUploadKey) && Intrinsics.d(this.videoUploadKey, attachmentsUpdated.videoUploadKey) && Intrinsics.d(this.attachments, attachmentsUpdated.attachments);
        }

        @NotNull
        public final List<AttachmentVO> getAttachments() {
            return this.attachments;
        }

        @NotNull
        public final String getPhotoUploadKey() {
            return this.photoUploadKey;
        }

        public final String getVideoUploadKey() {
            return this.videoUploadKey;
        }

        public int hashCode() {
            int hashCode = this.photoUploadKey.hashCode() * 31;
            String str = this.videoUploadKey;
            return this.attachments.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.photoUploadKey;
            String str2 = this.videoUploadKey;
            return C2618u.h(C3660k.d("AttachmentsUpdated(photoUploadKey=", str, ", videoUploadKey=", str2, ", attachments="), this.attachments, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent$UploadFailed;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadFailed implements MediaPickerEvent {
        public static final int $stable = NotificationDTO.$stable;

        @NotNull
        private final NotificationDTO notification;

        public UploadFailed(@NotNull NotificationDTO notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            this.notification = notification;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UploadFailed) && Intrinsics.d(this.notification, ((UploadFailed) other).notification);
        }

        @NotNull
        public final NotificationDTO getNotification() {
            return this.notification;
        }

        public int hashCode() {
            return this.notification.hashCode();
        }

        @NotNull
        public String toString() {
            return a.e("UploadFailed(notification=", ")", this.notification);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent$UploadingStateUpdated;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;", "", "isUploading", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadingStateUpdated implements MediaPickerEvent {
        private final boolean isUploading;

        public UploadingStateUpdated(boolean z11) {
            this.isUploading = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UploadingStateUpdated) && this.isUploading == ((UploadingStateUpdated) other).isUploading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isUploading);
        }

        /* renamed from: isUploading, reason: from getter */
        public final boolean getIsUploading() {
            return this.isUploading;
        }

        @NotNull
        public String toString() {
            return C2618u.g("UploadingStateUpdated(isUploading=", ")", this.isUploading);
        }
    }
}
