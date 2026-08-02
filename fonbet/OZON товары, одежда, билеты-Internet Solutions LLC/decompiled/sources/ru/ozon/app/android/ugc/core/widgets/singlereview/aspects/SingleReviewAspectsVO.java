package ru.ozon.app.android.ugc.core.widgets.singlereview.aspects;

import D3.h;
import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/aspects/SingleReviewAspectsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "aspects", "", "bottomPadding", "<init>", "(JLjava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getAspects", "()Ljava/util/List;", "I", "getBottomPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewAspectsVO implements c {

    @NotNull
    private final List<BadgeDTO> aspects;
    private final int bottomPadding;
    private final long id;

    public SingleReviewAspectsVO(long j11, @NotNull List<BadgeDTO> aspects, int i11) {
        Intrinsics.checkNotNullParameter(aspects, "aspects");
        this.id = j11;
        this.aspects = aspects;
        this.bottomPadding = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewAspectsVO)) {
            return false;
        }
        SingleReviewAspectsVO singleReviewAspectsVO = (SingleReviewAspectsVO) other;
        return this.id == singleReviewAspectsVO.id && Intrinsics.d(this.aspects, singleReviewAspectsVO.aspects) && this.bottomPadding == singleReviewAspectsVO.bottomPadding;
    }

    @NotNull
    public final List<BadgeDTO> getAspects() {
        return this.aspects;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        return Integer.hashCode(this.bottomPadding) + g.b(Long.hashCode(this.id) * 31, 31, this.aspects);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<BadgeDTO> list = this.aspects;
        return h.b(b.b(j11, "SingleReviewAspectsVO(id=", ", aspects=", list), ", bottomPadding=", this.bottomPadding, ")");
    }
}
