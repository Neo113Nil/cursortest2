package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import Kk.C3532b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jd\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b\f\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewHeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO;", "body", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewFooter;", CommentV3DTO.FOOTER_FIELD_NAME, "", "isCollapsed", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(JLru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewHeaderVO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewFooter;ZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "copy", "(JLru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewHeaderVO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewFooter;ZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewHeaderVO;", "getHeader", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewHeaderVO;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO;", "getBody", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewFooter;", "getFooter", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewFooter;", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PinnedReviewVO implements c {
    private final AtomAction action;

    @NotNull
    private final ReviewBodyVO body;

    @NotNull
    private final CornerRadius cornerRadius;

    @NotNull
    private final PinnedReviewFooter footer;

    @NotNull
    private final ReviewHeaderVO header;
    private final long id;
    private final boolean isCollapsed;
    private final t tokenizedEvent;

    public PinnedReviewVO(long j11, @NotNull ReviewHeaderVO header, @NotNull ReviewBodyVO body, @NotNull PinnedReviewFooter footer, boolean z11, AtomAction atomAction, t tVar, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.id = j11;
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.isCollapsed = z11;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.cornerRadius = cornerRadius;
    }

    public static /* synthetic */ PinnedReviewVO copy$default(PinnedReviewVO pinnedReviewVO, long j11, ReviewHeaderVO reviewHeaderVO, ReviewBodyVO reviewBodyVO, PinnedReviewFooter pinnedReviewFooter, boolean z11, AtomAction atomAction, t tVar, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = pinnedReviewVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            reviewHeaderVO = pinnedReviewVO.header;
        }
        ReviewHeaderVO reviewHeaderVO2 = reviewHeaderVO;
        if ((i11 & 4) != 0) {
            reviewBodyVO = pinnedReviewVO.body;
        }
        ReviewBodyVO reviewBodyVO2 = reviewBodyVO;
        if ((i11 & 8) != 0) {
            pinnedReviewFooter = pinnedReviewVO.footer;
        }
        return pinnedReviewVO.copy(j12, reviewHeaderVO2, reviewBodyVO2, pinnedReviewFooter, (i11 & 16) != 0 ? pinnedReviewVO.isCollapsed : z11, (i11 & 32) != 0 ? pinnedReviewVO.action : atomAction, (i11 & 64) != 0 ? pinnedReviewVO.tokenizedEvent : tVar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? pinnedReviewVO.cornerRadius : cornerRadius);
    }

    @NotNull
    public final PinnedReviewVO copy(long id2, @NotNull ReviewHeaderVO header, @NotNull ReviewBodyVO body, @NotNull PinnedReviewFooter footer, boolean isCollapsed, AtomAction action, t tokenizedEvent, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        return new PinnedReviewVO(id2, header, body, footer, isCollapsed, action, tokenizedEvent, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinnedReviewVO)) {
            return false;
        }
        PinnedReviewVO pinnedReviewVO = (PinnedReviewVO) other;
        return this.id == pinnedReviewVO.id && Intrinsics.d(this.header, pinnedReviewVO.header) && Intrinsics.d(this.body, pinnedReviewVO.body) && Intrinsics.d(this.footer, pinnedReviewVO.footer) && this.isCollapsed == pinnedReviewVO.isCollapsed && Intrinsics.d(this.action, pinnedReviewVO.action) && Intrinsics.d(this.tokenizedEvent, pinnedReviewVO.tokenizedEvent) && this.cornerRadius == pinnedReviewVO.cornerRadius;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final ReviewBodyVO getBody() {
        return this.body;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final PinnedReviewFooter getFooter() {
        return this.footer;
    }

    @NotNull
    public final ReviewHeaderVO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a((this.footer.hashCode() + ((this.body.hashCode() + ((this.header.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31, 31, this.isCollapsed);
        AtomAction atomAction = this.action;
        int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return this.cornerRadius.hashCode() + ((hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    /* renamed from: isCollapsed, reason: from getter */
    public final boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    @NotNull
    public String toString() {
        return "PinnedReviewVO(id=" + this.id + ", header=" + this.header + ", body=" + this.body + ", footer=" + this.footer + ", isCollapsed=" + this.isCollapsed + ", action=" + this.action + ", tokenizedEvent=" + this.tokenizedEvent + ", cornerRadius=" + this.cornerRadius + ")";
    }
}
