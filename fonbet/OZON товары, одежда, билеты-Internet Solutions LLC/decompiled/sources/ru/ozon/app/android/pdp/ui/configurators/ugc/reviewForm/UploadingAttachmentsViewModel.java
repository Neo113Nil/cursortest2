package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import Kk.C3532b;
import androidx.lifecycle.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.gallery.HandleGalleryResult;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVOKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u00014J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001a\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR4\u0010%\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\"0!j\u0002`#0\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR4\u0010)\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020&\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\"0!j\u0002`'0\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001fR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001fR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001fR\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001fR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001f¨\u00065"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel;", "Lru/ozon/app/android/domain/gallery/HandleGalleryResult;", "", "attachMedia", "()V", "", "id", "removeAttachedClick", "(J)V", "retryUploadAttachedClick", "cancelUploadingClick", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "getMedias", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "setUploadImageAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/VideoUpload;", "videoUpload", "setUploadVideoType", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/VideoUpload;)V", "medias", "", "mediaCountLimit", "bindMedia", "(Ljava/util/List;I)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel$ViewState;", "getAttached", "()Landroidx/lifecycle/P;", "attached", "Lkotlin/Pair;", "Lkotlin/reflect/d;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/IntToAttachment;", "getOpenPickScreen", "openPickScreen", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/StringToAttachment;", "getErrors", "errors", "getCommonUploadError", "commonUploadError", "getSendUploadEvent", "sendUploadEvent", "getSendUploadErrorEvent", "sendUploadErrorEvent", "", "getHasItems", "hasItems", "isMediaLimitReached", "ViewState", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface UploadingAttachmentsViewModel extends HandleGalleryResult {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB3\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel$ViewState;", "", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "attachments", "", "isShowAttachImagesButton", "isShowAttachVideosButton", "", "mediasLeft", "<init>", "(Ljava/util/List;ZZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAttachments", "()Ljava/util/List;", "Z", "()Z", "I", "getMediasLeft", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewState {

        @NotNull
        private final List<AttachmentVO> attachments;
        private final boolean isShowAttachImagesButton;
        private final boolean isShowAttachVideosButton;
        private final int mediasLeft;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel$ViewState$Companion;", "", "<init>", "()V", "newState", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel$ViewState;", "attachments", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "imagesLimit", "", "videosLimit", "mediasLimit", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ViewState newState(@NotNull List<? extends AttachmentVO> attachments, int imagesLimit, int videosLimit, int mediasLimit) {
                Intrinsics.checkNotNullParameter(attachments, "attachments");
                return new ViewState(attachments, AttachmentVOKt.images(attachments).size() < imagesLimit, AttachmentVOKt.videos(attachments).size() < videosLimit, mediasLimit - attachments.size());
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState(@NotNull List<? extends AttachmentVO> attachments, boolean z11, boolean z12, int i11) {
            Intrinsics.checkNotNullParameter(attachments, "attachments");
            this.attachments = attachments;
            this.isShowAttachImagesButton = z11;
            this.isShowAttachVideosButton = z12;
            this.mediasLeft = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.d(this.attachments, viewState.attachments) && this.isShowAttachImagesButton == viewState.isShowAttachImagesButton && this.isShowAttachVideosButton == viewState.isShowAttachVideosButton && this.mediasLeft == viewState.mediasLeft;
        }

        @NotNull
        public final List<AttachmentVO> getAttachments() {
            return this.attachments;
        }

        public final int getMediasLeft() {
            return this.mediasLeft;
        }

        public int hashCode() {
            return Integer.hashCode(this.mediasLeft) + C3532b.a(C3532b.a(this.attachments.hashCode() * 31, 31, this.isShowAttachImagesButton), 31, this.isShowAttachVideosButton);
        }

        @NotNull
        public String toString() {
            return "ViewState(attachments=" + this.attachments + ", isShowAttachImagesButton=" + this.isShowAttachImagesButton + ", isShowAttachVideosButton=" + this.isShowAttachVideosButton + ", mediasLeft=" + this.mediasLeft + ")";
        }
    }

    void attachMedia();

    void bindMedia(@NotNull List<? extends AttachmentVO> medias, int mediaCountLimit);

    void cancelUploadingClick(long id2);

    @NotNull
    P<ViewState> getAttached();

    @NotNull
    P<Unit> getCommonUploadError();

    @NotNull
    P<Pair<String, d<? extends AttachmentVO>>> getErrors();

    @NotNull
    P<Boolean> getHasItems();

    List<AttachmentVO> getMedias();

    @NotNull
    P<Pair<Integer, d<? extends AttachmentVO>>> getOpenPickScreen();

    @NotNull
    P<Unit> getSendUploadErrorEvent();

    @NotNull
    P<Unit> getSendUploadEvent();

    @NotNull
    P<Boolean> isMediaLimitReached();

    void removeAttachedClick(long id2);

    void retryUploadAttachedClick(long id2);

    void setUploadImageAction(AtomAction action);

    void setUploadVideoType(VideoUpload videoUpload);
}
