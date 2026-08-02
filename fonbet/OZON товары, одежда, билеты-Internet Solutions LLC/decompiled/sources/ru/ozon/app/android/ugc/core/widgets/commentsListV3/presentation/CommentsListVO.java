package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Ak.C2436a;
import B0.C2454a;
import G.g;
import Ve.C4598rp;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0084\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "itemId", "", "totalCount", "reviewUuid", "Lru/ozon/uni/atoms/af/AtomAction;", "loadCommentsAction", "createCommentAction", "removeCommentAction", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;", "emptyState", "LWZ/t;", "tokenizedEvent", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "cachedComments", "<init>", "(JLjava/lang/String;ILjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;LWZ/t;Ljava/util/List;)V", "copy", "(JLjava/lang/String;ILjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;LWZ/t;Ljava/util/List;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getItemId", "I", "getTotalCount", "getReviewUuid", "Lru/ozon/uni/atoms/af/AtomAction;", "getLoadCommentsAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getCreateCommentAction", "getRemoveCommentAction", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;", "getEmptyState", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/util/List;", "getCachedComments", "()Ljava/util/List;", "setCachedComments", "(Ljava/util/List;)V", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommentsListVO implements c {
    private List<? extends CommentsAdapterVO> cachedComments;
    private final AtomAction createCommentAction;
    private final CommentsListDTO.EmptyStateDTO emptyState;
    private final long id;

    @NotNull
    private final String itemId;

    @NotNull
    private final AtomAction loadCommentsAction;
    private final AtomAction removeCommentAction;

    @NotNull
    private final String reviewUuid;
    private final t tokenizedEvent;
    private final int totalCount;

    public CommentsListVO(long j11, @NotNull String itemId, int i11, @NotNull String reviewUuid, @NotNull AtomAction loadCommentsAction, AtomAction atomAction, AtomAction atomAction2, CommentsListDTO.EmptyStateDTO emptyStateDTO, t tVar, List<? extends CommentsAdapterVO> list) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        Intrinsics.checkNotNullParameter(loadCommentsAction, "loadCommentsAction");
        this.id = j11;
        this.itemId = itemId;
        this.totalCount = i11;
        this.reviewUuid = reviewUuid;
        this.loadCommentsAction = loadCommentsAction;
        this.createCommentAction = atomAction;
        this.removeCommentAction = atomAction2;
        this.emptyState = emptyStateDTO;
        this.tokenizedEvent = tVar;
        this.cachedComments = list;
    }

    public static /* synthetic */ CommentsListVO copy$default(CommentsListVO commentsListVO, long j11, String str, int i11, String str2, AtomAction atomAction, AtomAction atomAction2, AtomAction atomAction3, CommentsListDTO.EmptyStateDTO emptyStateDTO, t tVar, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = commentsListVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            str = commentsListVO.itemId;
        }
        return commentsListVO.copy(j12, str, (i12 & 4) != 0 ? commentsListVO.totalCount : i11, (i12 & 8) != 0 ? commentsListVO.reviewUuid : str2, (i12 & 16) != 0 ? commentsListVO.loadCommentsAction : atomAction, (i12 & 32) != 0 ? commentsListVO.createCommentAction : atomAction2, (i12 & 64) != 0 ? commentsListVO.removeCommentAction : atomAction3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? commentsListVO.emptyState : emptyStateDTO, (i12 & 256) != 0 ? commentsListVO.tokenizedEvent : tVar, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? commentsListVO.cachedComments : list);
    }

    @NotNull
    public final CommentsListVO copy(long id2, @NotNull String itemId, int totalCount, @NotNull String reviewUuid, @NotNull AtomAction loadCommentsAction, AtomAction createCommentAction, AtomAction removeCommentAction, CommentsListDTO.EmptyStateDTO emptyState, t tokenizedEvent, List<? extends CommentsAdapterVO> cachedComments) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        Intrinsics.checkNotNullParameter(loadCommentsAction, "loadCommentsAction");
        return new CommentsListVO(id2, itemId, totalCount, reviewUuid, loadCommentsAction, createCommentAction, removeCommentAction, emptyState, tokenizedEvent, cachedComments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentsListVO)) {
            return false;
        }
        CommentsListVO commentsListVO = (CommentsListVO) other;
        return this.id == commentsListVO.id && Intrinsics.d(this.itemId, commentsListVO.itemId) && this.totalCount == commentsListVO.totalCount && Intrinsics.d(this.reviewUuid, commentsListVO.reviewUuid) && Intrinsics.d(this.loadCommentsAction, commentsListVO.loadCommentsAction) && Intrinsics.d(this.createCommentAction, commentsListVO.createCommentAction) && Intrinsics.d(this.removeCommentAction, commentsListVO.removeCommentAction) && Intrinsics.d(this.emptyState, commentsListVO.emptyState) && Intrinsics.d(this.tokenizedEvent, commentsListVO.tokenizedEvent) && Intrinsics.d(this.cachedComments, commentsListVO.cachedComments);
    }

    public final List<CommentsAdapterVO> getCachedComments() {
        return this.cachedComments;
    }

    public final AtomAction getCreateCommentAction() {
        return this.createCommentAction;
    }

    public final CommentsListDTO.EmptyStateDTO getEmptyState() {
        return this.emptyState;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    @NotNull
    public final AtomAction getLoadCommentsAction() {
        return this.loadCommentsAction;
    }

    public final AtomAction getRemoveCommentAction() {
        return this.removeCommentAction;
    }

    @NotNull
    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C4598rp.a(this.loadCommentsAction, g.a(C2454a.a(this.totalCount, g.a(Long.hashCode(this.id) * 31, 31, this.itemId), 31), 31, this.reviewUuid), 31);
        AtomAction atomAction = this.createCommentAction;
        int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        AtomAction atomAction2 = this.removeCommentAction;
        int hashCode2 = (hashCode + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
        CommentsListDTO.EmptyStateDTO emptyStateDTO = this.emptyState;
        int hashCode3 = (hashCode2 + (emptyStateDTO == null ? 0 : emptyStateDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List<? extends CommentsAdapterVO> list = this.cachedComments;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final void setCachedComments(List<? extends CommentsAdapterVO> list) {
        this.cachedComments = list;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.itemId;
        int i11 = this.totalCount;
        String str2 = this.reviewUuid;
        AtomAction atomAction = this.loadCommentsAction;
        AtomAction atomAction2 = this.createCommentAction;
        AtomAction atomAction3 = this.removeCommentAction;
        CommentsListDTO.EmptyStateDTO emptyStateDTO = this.emptyState;
        t tVar = this.tokenizedEvent;
        List<? extends CommentsAdapterVO> list = this.cachedComments;
        StringBuilder c11 = C2436a.c(j11, "CommentsListVO(id=", ", itemId=", str);
        c11.append(", totalCount=");
        c11.append(i11);
        c11.append(", reviewUuid=");
        c11.append(str2);
        c11.append(", loadCommentsAction=");
        c11.append(atomAction);
        c11.append(", createCommentAction=");
        c11.append(atomAction2);
        c11.append(", removeCommentAction=");
        c11.append(atomAction3);
        c11.append(", emptyState=");
        c11.append(emptyStateDTO);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", cachedComments=");
        c11.append(list);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ CommentsListVO(long j11, String str, int i11, String str2, AtomAction atomAction, AtomAction atomAction2, AtomAction atomAction3, CommentsListDTO.EmptyStateDTO emptyStateDTO, t tVar, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, i11, str2, atomAction, atomAction2, atomAction3, emptyStateDTO, tVar, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : list);
    }
}
