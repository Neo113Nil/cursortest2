package ru.ozon.app.android.uploadPhotos.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u0006\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/uploadPhotos/model/ViewState;", "", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "attachments", "", "isShowAttachImagesButton", "<init>", "(Ljava/util/List;Z)V", "", "imagesLimit", "(Ljava/util/List;I)V", "copy", "(Ljava/util/List;Z)Lru/ozon/app/android/uploadPhotos/model/ViewState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAttachments", "()Ljava/util/List;", "Z", "()Z", "Companion", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<AttachmentVO.AttachedImageVO> attachments;
    private final boolean isShowAttachImagesButton;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/uploadPhotos/model/ViewState$Companion;", "", "<init>", "()V", "isShowAttachImagesButton", "", "attachmentsCount", "", "attachmentsLimit", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isShowAttachImagesButton(int attachmentsCount, int attachmentsLimit) {
            return attachmentsCount < attachmentsLimit;
        }

        private Companion() {
        }
    }

    public ViewState() {
        this(null, false, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewState copy$default(ViewState viewState, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = viewState.attachments;
        }
        if ((i11 & 2) != 0) {
            z11 = viewState.isShowAttachImagesButton;
        }
        return viewState.copy(list, z11);
    }

    @NotNull
    public final ViewState copy(@NotNull List<AttachmentVO.AttachedImageVO> attachments, boolean isShowAttachImagesButton) {
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        return new ViewState(attachments, isShowAttachImagesButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewState)) {
            return false;
        }
        ViewState viewState = (ViewState) other;
        return Intrinsics.d(this.attachments, viewState.attachments) && this.isShowAttachImagesButton == viewState.isShowAttachImagesButton;
    }

    @NotNull
    public final List<AttachmentVO.AttachedImageVO> getAttachments() {
        return this.attachments;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isShowAttachImagesButton) + (this.attachments.hashCode() * 31);
    }

    /* renamed from: isShowAttachImagesButton, reason: from getter */
    public final boolean getIsShowAttachImagesButton() {
        return this.isShowAttachImagesButton;
    }

    @NotNull
    public String toString() {
        return "ViewState(attachments=" + this.attachments + ", isShowAttachImagesButton=" + this.isShowAttachImagesButton + ")";
    }

    public ViewState(@NotNull List<AttachmentVO.AttachedImageVO> attachments, boolean z11) {
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        this.attachments = attachments;
        this.isShowAttachImagesButton = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewState(@NotNull List<AttachmentVO.AttachedImageVO> attachments, int i11) {
        this(attachments, INSTANCE.isShowAttachImagesButton(attachments.size(), i11));
        Intrinsics.checkNotNullParameter(attachments, "attachments");
    }

    public ViewState(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<AttachmentVO.AttachedImageVO>) ((i11 & 1) != 0 ? K.f71697a : list), (i11 & 2) != 0 ? false : z11);
    }
}
