package ru.ozon.app.android.pdp.widgets.aspectsV4.info.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.base.AspectV4InfoBaseVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/info/presentation/AspectsV4InfoVO;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/base/AspectV4InfoBaseVO;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", CommentV3DTO.EXPANDABLE_TEXT_FIELD_NAME, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "moreClickAnalytics", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;LWZ/t;)Lru/ozon/app/android/pdp/widgets/aspectsV4/info/presentation/AspectsV4InfoVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "getExpandableText", "()Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "LWZ/t;", "getMoreClickAnalytics", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectsV4InfoVO implements AspectV4InfoBaseVO {
    private final BadgeDTO badge;
    private final ExpandableTextDTO expandableText;
    private final long id;
    private final t moreClickAnalytics;

    public AspectsV4InfoVO(long j11, BadgeDTO badgeDTO, ExpandableTextDTO expandableTextDTO, t tVar) {
        this.id = j11;
        this.badge = badgeDTO;
        this.expandableText = expandableTextDTO;
        this.moreClickAnalytics = tVar;
    }

    public static /* synthetic */ AspectsV4InfoVO copy$default(AspectsV4InfoVO aspectsV4InfoVO, long j11, BadgeDTO badgeDTO, ExpandableTextDTO expandableTextDTO, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aspectsV4InfoVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            badgeDTO = aspectsV4InfoVO.badge;
        }
        BadgeDTO badgeDTO2 = badgeDTO;
        if ((i11 & 4) != 0) {
            expandableTextDTO = aspectsV4InfoVO.expandableText;
        }
        ExpandableTextDTO expandableTextDTO2 = expandableTextDTO;
        if ((i11 & 8) != 0) {
            tVar = aspectsV4InfoVO.moreClickAnalytics;
        }
        return aspectsV4InfoVO.copy(j12, badgeDTO2, expandableTextDTO2, tVar);
    }

    @NotNull
    public final AspectsV4InfoVO copy(long id2, BadgeDTO badge, ExpandableTextDTO expandableText, t moreClickAnalytics) {
        return new AspectsV4InfoVO(id2, badge, expandableText, moreClickAnalytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectsV4InfoVO)) {
            return false;
        }
        AspectsV4InfoVO aspectsV4InfoVO = (AspectsV4InfoVO) other;
        return this.id == aspectsV4InfoVO.id && Intrinsics.d(this.badge, aspectsV4InfoVO.badge) && Intrinsics.d(this.expandableText, aspectsV4InfoVO.expandableText) && Intrinsics.d(this.moreClickAnalytics, aspectsV4InfoVO.moreClickAnalytics);
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.info.base.AspectV4InfoBaseVO
    public BadgeDTO getBadge() {
        return this.badge;
    }

    public final ExpandableTextDTO getExpandableText() {
        return this.expandableText;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final t getMoreClickAnalytics() {
        return this.moreClickAnalytics;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return AspectV4InfoBaseVO.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // l20.c
    public int getViewItemKey() {
        return AspectV4InfoBaseVO.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        ExpandableTextDTO expandableTextDTO = this.expandableText;
        int hashCode3 = (hashCode2 + (expandableTextDTO == null ? 0 : expandableTextDTO.hashCode())) * 31;
        t tVar = this.moreClickAnalytics;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AspectsV4InfoVO(id=" + this.id + ", badge=" + this.badge + ", expandableText=" + this.expandableText + ", moreClickAnalytics=" + this.moreClickAnalytics + ")";
    }
}
