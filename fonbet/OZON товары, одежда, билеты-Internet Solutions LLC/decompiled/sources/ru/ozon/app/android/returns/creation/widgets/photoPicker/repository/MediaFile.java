package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "", "", "id", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "attachment", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "signedLink", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState;", "uploadingState", "<init>", "(JLru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "copy", "(JLru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "", "toString", "()Ljava/lang/String;", "J", "getId", "()J", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "getAttachment", "()Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "getSignedLink", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState;", "getUploadingState", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadingState;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MediaFile {
    private final AttachmentVO.AttachedImageVO attachment;
    private final long id;
    private final SignedLink signedLink;

    @NotNull
    private final UploadingState uploadingState;

    public MediaFile(long j11, AttachmentVO.AttachedImageVO attachedImageVO, SignedLink signedLink, @NotNull UploadingState uploadingState) {
        Intrinsics.checkNotNullParameter(uploadingState, "uploadingState");
        this.id = j11;
        this.attachment = attachedImageVO;
        this.signedLink = signedLink;
        this.uploadingState = uploadingState;
    }

    public static /* synthetic */ MediaFile copy$default(MediaFile mediaFile, long j11, AttachmentVO.AttachedImageVO attachedImageVO, SignedLink signedLink, UploadingState uploadingState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = mediaFile.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            attachedImageVO = mediaFile.attachment;
        }
        AttachmentVO.AttachedImageVO attachedImageVO2 = attachedImageVO;
        if ((i11 & 4) != 0) {
            signedLink = mediaFile.signedLink;
        }
        SignedLink signedLink2 = signedLink;
        if ((i11 & 8) != 0) {
            uploadingState = mediaFile.uploadingState;
        }
        return mediaFile.copy(j12, attachedImageVO2, signedLink2, uploadingState);
    }

    @NotNull
    public final MediaFile copy(long id2, AttachmentVO.AttachedImageVO attachment, SignedLink signedLink, @NotNull UploadingState uploadingState) {
        Intrinsics.checkNotNullParameter(uploadingState, "uploadingState");
        return new MediaFile(id2, attachment, signedLink, uploadingState);
    }

    public boolean equals(Object other) {
        MediaFile mediaFile = other instanceof MediaFile ? (MediaFile) other : null;
        if (mediaFile != null && mediaFile.id == this.id && Intrinsics.d(mediaFile.attachment, this.attachment)) {
            SignedLink signedLink = mediaFile.signedLink;
            SignedLinkDTO.ImageLocation imageLocation = signedLink != null ? signedLink.getImageLocation() : null;
            SignedLink signedLink2 = this.signedLink;
            if (Intrinsics.d(imageLocation, signedLink2 != null ? signedLink2.getImageLocation() : null) && Intrinsics.d(mediaFile.uploadingState, this.uploadingState)) {
                return true;
            }
        }
        return false;
    }

    public final AttachmentVO.AttachedImageVO getAttachment() {
        return this.attachment;
    }

    public final long getId() {
        return this.id;
    }

    public final SignedLink getSignedLink() {
        return this.signedLink;
    }

    @NotNull
    public final UploadingState getUploadingState() {
        return this.uploadingState;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id);
        int i11 = hashCode * 31;
        AttachmentVO.AttachedImageVO attachedImageVO = this.attachment;
        int hashCode2 = i11 + (attachedImageVO != null ? attachedImageVO.hashCode() : 0) + hashCode;
        int i12 = hashCode2 * 31;
        SignedLink signedLink = this.signedLink;
        SignedLinkDTO.ImageLocation imageLocation = signedLink != null ? signedLink.getImageLocation() : null;
        int hashCode3 = i12 + (imageLocation != null ? imageLocation.hashCode() : 0) + hashCode2;
        return this.uploadingState.hashCode() + (hashCode3 * 31) + hashCode3;
    }

    @NotNull
    public String toString() {
        return "MediaFile(id=" + this.id + ", attachment=" + this.attachment + ", signedLink=" + this.signedLink + ", uploadingState=" + this.uploadingState + ")";
    }

    public /* synthetic */ MediaFile(long j11, AttachmentVO.AttachedImageVO attachedImageVO, SignedLink signedLink, UploadingState uploadingState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? null : attachedImageVO, signedLink, uploadingState);
    }
}
