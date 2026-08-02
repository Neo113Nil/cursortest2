package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\\\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b\r\u0010\"¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "reviewUuid", "", "hasSeparator", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$FooterControlDTO;", "leftButtons", "rightButtons", "isInItems", "<init>", "(JLjava/lang/String;ZLjava/util/List;Ljava/util/List;Z)V", "copy", "(JLjava/lang/String;ZLjava/util/List;Ljava/util/List;Z)Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getReviewUuid", "Z", "getHasSeparator", "()Z", "Ljava/util/List;", "getLeftButtons", "()Ljava/util/List;", "getRightButtons", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ActionsFooterVO implements c {
    private final boolean hasSeparator;
    private final long id;
    private final boolean isInItems;
    private final List<SingleReviewDTO.FooterControlDTO> leftButtons;

    @NotNull
    private final String reviewUuid;
    private final List<SingleReviewDTO.FooterControlDTO> rightButtons;

    public ActionsFooterVO(long j11, @NotNull String reviewUuid, boolean z11, List<SingleReviewDTO.FooterControlDTO> list, List<SingleReviewDTO.FooterControlDTO> list2, boolean z12) {
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        this.id = j11;
        this.reviewUuid = reviewUuid;
        this.hasSeparator = z11;
        this.leftButtons = list;
        this.rightButtons = list2;
        this.isInItems = z12;
    }

    public static /* synthetic */ ActionsFooterVO copy$default(ActionsFooterVO actionsFooterVO, long j11, String str, boolean z11, List list, List list2, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = actionsFooterVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = actionsFooterVO.reviewUuid;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z11 = actionsFooterVO.hasSeparator;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            list = actionsFooterVO.leftButtons;
        }
        List list3 = list;
        if ((i11 & 16) != 0) {
            list2 = actionsFooterVO.rightButtons;
        }
        List list4 = list2;
        if ((i11 & 32) != 0) {
            z12 = actionsFooterVO.isInItems;
        }
        return actionsFooterVO.copy(j12, str2, z13, list3, list4, z12);
    }

    @NotNull
    public final ActionsFooterVO copy(long id2, @NotNull String reviewUuid, boolean hasSeparator, List<SingleReviewDTO.FooterControlDTO> leftButtons, List<SingleReviewDTO.FooterControlDTO> rightButtons, boolean isInItems) {
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        return new ActionsFooterVO(id2, reviewUuid, hasSeparator, leftButtons, rightButtons, isInItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionsFooterVO)) {
            return false;
        }
        ActionsFooterVO actionsFooterVO = (ActionsFooterVO) other;
        return this.id == actionsFooterVO.id && Intrinsics.d(this.reviewUuid, actionsFooterVO.reviewUuid) && this.hasSeparator == actionsFooterVO.hasSeparator && Intrinsics.d(this.leftButtons, actionsFooterVO.leftButtons) && Intrinsics.d(this.rightButtons, actionsFooterVO.rightButtons) && this.isInItems == actionsFooterVO.isInItems;
    }

    public final boolean getHasSeparator() {
        return this.hasSeparator;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<SingleReviewDTO.FooterControlDTO> getLeftButtons() {
        return this.leftButtons;
    }

    @NotNull
    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    public final List<SingleReviewDTO.FooterControlDTO> getRightButtons() {
        return this.rightButtons;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(g.a(Long.hashCode(this.id) * 31, 31, this.reviewUuid), 31, this.hasSeparator);
        List<SingleReviewDTO.FooterControlDTO> list = this.leftButtons;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        List<SingleReviewDTO.FooterControlDTO> list2 = this.rightButtons;
        return Boolean.hashCode(this.isInItems) + ((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    /* renamed from: isInItems, reason: from getter */
    public final boolean getIsInItems() {
        return this.isInItems;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.reviewUuid;
        boolean z11 = this.hasSeparator;
        List<SingleReviewDTO.FooterControlDTO> list = this.leftButtons;
        List<SingleReviewDTO.FooterControlDTO> list2 = this.rightButtons;
        boolean z12 = this.isInItems;
        StringBuilder c11 = C2436a.c(j11, "ActionsFooterVO(id=", ", reviewUuid=", str);
        c11.append(", hasSeparator=");
        c11.append(z11);
        c11.append(", leftButtons=");
        c11.append(list);
        AZ.c.c(c11, ", rightButtons=", list2, ", isInItems=", z12);
        c11.append(")");
        return c11.toString();
    }
}
