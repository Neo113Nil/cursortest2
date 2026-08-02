package ru.ozon.app.android.ugc.core.widgets.singlereview.singleAspect;

import D3.h;
import Gl.C3124a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/singleAspect/SingleReviewAspectVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "aspect", "", "bottomPadding", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "I", "getBottomPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewAspectVO implements c {

    @NotNull
    private final BadgeDTO aspect;
    private final int bottomPadding;
    private final long id;

    public SingleReviewAspectVO(long j11, @NotNull BadgeDTO aspect, int i11) {
        Intrinsics.checkNotNullParameter(aspect, "aspect");
        this.id = j11;
        this.aspect = aspect;
        this.bottomPadding = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewAspectVO)) {
            return false;
        }
        SingleReviewAspectVO singleReviewAspectVO = (SingleReviewAspectVO) other;
        return this.id == singleReviewAspectVO.id && Intrinsics.d(this.aspect, singleReviewAspectVO.aspect) && this.bottomPadding == singleReviewAspectVO.bottomPadding;
    }

    @NotNull
    public final BadgeDTO getAspect() {
        return this.aspect;
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
        return Integer.hashCode(this.bottomPadding) + C3124a.c(this.aspect, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        BadgeDTO badgeDTO = this.aspect;
        int i11 = this.bottomPadding;
        StringBuilder sb2 = new StringBuilder("SingleReviewAspectVO(id=");
        sb2.append(j11);
        sb2.append(", aspect=");
        sb2.append(badgeDTO);
        return h.b(sb2, ", bottomPadding=", i11, ")");
    }
}
