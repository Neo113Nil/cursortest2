package ru.ozon.app.android.ugc.core.widgets.commentsListV3.data;

import B0.C2454a;
import B3.p;
import B90.C2616s;
import G.g;
import Ih.a;
import Kk.C3532b;
import N3.C3660k;
import Ns.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001:\u0001>B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J£\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001J\u0013\u0010:\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0005HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006?"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO;", "", "itemId", "", "totalCount", "", "reviewUuid", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "countText", "isCommentable", "", "emptyState", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;", "inputPlaceholder", "inputAnswerPlaceholder", "loadCommentsAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "createCommentAction", "removeCommentAction", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getItemId", "()Ljava/lang/String;", "getTotalCount", "()I", "getReviewUuid", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCountText", "()Z", "getEmptyState", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;", "getInputPlaceholder", "getInputAnswerPlaceholder", "getLoadCommentsAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getCreateCommentAction", "getRemoveCommentAction", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "EmptyStateDTO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommentsListDTO {
    public static final int $stable = 8;

    @NotNull
    private final TextDTO countText;
    private final AtomActionDTO createCommentAction;
    private final EmptyStateDTO emptyState;
    private final String inputAnswerPlaceholder;
    private final String inputPlaceholder;
    private final boolean isCommentable;

    @NotNull
    private final String itemId;

    @NotNull
    private final AtomActionDTO loadCommentsAction;
    private final AtomActionDTO removeCommentAction;

    @NotNull
    private final String reviewUuid;

    @NotNull
    private final TextDTO title;
    private final int totalCount;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyStateDTO {
        public static final int $stable = 0;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public EmptyStateDTO(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.image = image;
            this.title = title;
            this.subtitle = subtitle;
        }

        public static /* synthetic */ EmptyStateDTO copy$default(EmptyStateDTO emptyStateDTO, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = emptyStateDTO.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = emptyStateDTO.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = emptyStateDTO.subtitle;
            }
            return emptyStateDTO.copy(imageDTO, textDTO, textDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final EmptyStateDTO copy(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new EmptyStateDTO(image, title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyStateDTO)) {
                return false;
            }
            EmptyStateDTO emptyStateDTO = (EmptyStateDTO) other;
            return Intrinsics.d(this.image, emptyStateDTO.image) && Intrinsics.d(this.title, emptyStateDTO.title) && Intrinsics.d(this.subtitle, emptyStateDTO.subtitle);
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + b.a(this.title, this.image.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.title;
            return Tl.b.e(C2616s.d("EmptyStateDTO(image=", imageDTO, ", title=", textDTO, ", subtitle="), this.subtitle, ")");
        }
    }

    public CommentsListDTO(@NotNull String itemId, int i11, @NotNull String reviewUuid, @NotNull TextDTO title, @NotNull TextDTO countText, boolean z11, EmptyStateDTO emptyStateDTO, String str, String str2, @NotNull AtomActionDTO loadCommentsAction, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countText, "countText");
        Intrinsics.checkNotNullParameter(loadCommentsAction, "loadCommentsAction");
        this.itemId = itemId;
        this.totalCount = i11;
        this.reviewUuid = reviewUuid;
        this.title = title;
        this.countText = countText;
        this.isCommentable = z11;
        this.emptyState = emptyStateDTO;
        this.inputPlaceholder = str;
        this.inputAnswerPlaceholder = str2;
        this.loadCommentsAction = loadCommentsAction;
        this.createCommentAction = atomActionDTO;
        this.removeCommentAction = atomActionDTO2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CommentsListDTO copy$default(CommentsListDTO commentsListDTO, String str, int i11, String str2, TextDTO textDTO, TextDTO textDTO2, boolean z11, EmptyStateDTO emptyStateDTO, String str3, String str4, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, AtomActionDTO atomActionDTO3, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = commentsListDTO.itemId;
        }
        return commentsListDTO.copy(str, (i12 & 2) != 0 ? commentsListDTO.totalCount : i11, (i12 & 4) != 0 ? commentsListDTO.reviewUuid : str2, (i12 & 8) != 0 ? commentsListDTO.title : textDTO, (i12 & 16) != 0 ? commentsListDTO.countText : textDTO2, (i12 & 32) != 0 ? commentsListDTO.isCommentable : z11, (i12 & 64) != 0 ? commentsListDTO.emptyState : emptyStateDTO, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? commentsListDTO.inputPlaceholder : str3, (i12 & 256) != 0 ? commentsListDTO.inputAnswerPlaceholder : str4, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? commentsListDTO.loadCommentsAction : atomActionDTO, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? commentsListDTO.createCommentAction : atomActionDTO2, (i12 & 2048) != 0 ? commentsListDTO.removeCommentAction : atomActionDTO3, (i12 & 4096) != 0 ? commentsListDTO.trackingInfo : map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final AtomActionDTO getLoadCommentsAction() {
        return this.loadCommentsAction;
    }

    /* renamed from: component11, reason: from getter */
    public final AtomActionDTO getCreateCommentAction() {
        return this.createCommentAction;
    }

    /* renamed from: component12, reason: from getter */
    public final AtomActionDTO getRemoveCommentAction() {
        return this.removeCommentAction;
    }

    public final Map<String, TokenizedTrackingInfo> component13() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getCountText() {
        return this.countText;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCommentable() {
        return this.isCommentable;
    }

    /* renamed from: component7, reason: from getter */
    public final EmptyStateDTO getEmptyState() {
        return this.emptyState;
    }

    /* renamed from: component8, reason: from getter */
    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }

    /* renamed from: component9, reason: from getter */
    public final String getInputAnswerPlaceholder() {
        return this.inputAnswerPlaceholder;
    }

    @NotNull
    public final CommentsListDTO copy(@NotNull String itemId, int totalCount, @NotNull String reviewUuid, @NotNull TextDTO title, @NotNull TextDTO countText, boolean isCommentable, EmptyStateDTO emptyState, String inputPlaceholder, String inputAnswerPlaceholder, @NotNull AtomActionDTO loadCommentsAction, AtomActionDTO createCommentAction, AtomActionDTO removeCommentAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(countText, "countText");
        Intrinsics.checkNotNullParameter(loadCommentsAction, "loadCommentsAction");
        return new CommentsListDTO(itemId, totalCount, reviewUuid, title, countText, isCommentable, emptyState, inputPlaceholder, inputAnswerPlaceholder, loadCommentsAction, createCommentAction, removeCommentAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentsListDTO)) {
            return false;
        }
        CommentsListDTO commentsListDTO = (CommentsListDTO) other;
        return Intrinsics.d(this.itemId, commentsListDTO.itemId) && this.totalCount == commentsListDTO.totalCount && Intrinsics.d(this.reviewUuid, commentsListDTO.reviewUuid) && Intrinsics.d(this.title, commentsListDTO.title) && Intrinsics.d(this.countText, commentsListDTO.countText) && this.isCommentable == commentsListDTO.isCommentable && Intrinsics.d(this.emptyState, commentsListDTO.emptyState) && Intrinsics.d(this.inputPlaceholder, commentsListDTO.inputPlaceholder) && Intrinsics.d(this.inputAnswerPlaceholder, commentsListDTO.inputAnswerPlaceholder) && Intrinsics.d(this.loadCommentsAction, commentsListDTO.loadCommentsAction) && Intrinsics.d(this.createCommentAction, commentsListDTO.createCommentAction) && Intrinsics.d(this.removeCommentAction, commentsListDTO.removeCommentAction) && Intrinsics.d(this.trackingInfo, commentsListDTO.trackingInfo);
    }

    @NotNull
    public final TextDTO getCountText() {
        return this.countText;
    }

    public final AtomActionDTO getCreateCommentAction() {
        return this.createCommentAction;
    }

    public final EmptyStateDTO getEmptyState() {
        return this.emptyState;
    }

    public final String getInputAnswerPlaceholder() {
        return this.inputAnswerPlaceholder;
    }

    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    public final AtomActionDTO getLoadCommentsAction() {
        return this.loadCommentsAction;
    }

    public final AtomActionDTO getRemoveCommentAction() {
        return this.removeCommentAction;
    }

    @NotNull
    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(b.a(this.countText, b.a(this.title, g.a(C2454a.a(this.totalCount, this.itemId.hashCode() * 31, 31), 31, this.reviewUuid), 31), 31), 31, this.isCommentable);
        EmptyStateDTO emptyStateDTO = this.emptyState;
        int hashCode = (a11 + (emptyStateDTO == null ? 0 : emptyStateDTO.hashCode())) * 31;
        String str = this.inputPlaceholder;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.inputAnswerPlaceholder;
        int b11 = a.b(this.loadCommentsAction, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        AtomActionDTO atomActionDTO = this.createCommentAction;
        int hashCode3 = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.removeCommentAction;
        int hashCode4 = (hashCode3 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isCommentable() {
        return this.isCommentable;
    }

    @NotNull
    public String toString() {
        String str = this.itemId;
        int i11 = this.totalCount;
        String str2 = this.reviewUuid;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.countText;
        boolean z11 = this.isCommentable;
        EmptyStateDTO emptyStateDTO = this.emptyState;
        String str3 = this.inputPlaceholder;
        String str4 = this.inputAnswerPlaceholder;
        AtomActionDTO atomActionDTO = this.loadCommentsAction;
        AtomActionDTO atomActionDTO2 = this.createCommentAction;
        AtomActionDTO atomActionDTO3 = this.removeCommentAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = C3660k.c(i11, "CommentsListDTO(itemId=", str, ", totalCount=", ", reviewUuid=");
        c11.append(str2);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", countText=");
        c11.append(textDTO2);
        c11.append(", isCommentable=");
        c11.append(z11);
        c11.append(", emptyState=");
        c11.append(emptyStateDTO);
        c11.append(", inputPlaceholder=");
        c11.append(str3);
        c11.append(", inputAnswerPlaceholder=");
        p.c(str4, ", loadCommentsAction=", ", createCommentAction=", c11, atomActionDTO);
        c11.append(atomActionDTO2);
        c11.append(", removeCommentAction=");
        c11.append(atomActionDTO3);
        c11.append(", trackingInfo=");
        return P.f(c11, map, ")");
    }
}
