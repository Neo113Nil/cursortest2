package ru.ozon.app.android.ugc.core.widgets.singlereview.singleAspect;

import B0.C2454a;
import Gl.C3124a;
import J0.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/singleAspect/SingleReviewAspectDO;", "", "", "uuid", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "aspect", "", "aspectCount", "bottomPadding", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "I", "getAspectCount", "getBottomPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewAspectDO {

    @NotNull
    private final BadgeDTO aspect;
    private final int aspectCount;
    private final int bottomPadding;

    @NotNull
    private final String uuid;

    public SingleReviewAspectDO(@NotNull String uuid, @NotNull BadgeDTO aspect, int i11, int i12) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(aspect, "aspect");
        this.uuid = uuid;
        this.aspect = aspect;
        this.aspectCount = i11;
        this.bottomPadding = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewAspectDO)) {
            return false;
        }
        SingleReviewAspectDO singleReviewAspectDO = (SingleReviewAspectDO) other;
        return Intrinsics.d(this.uuid, singleReviewAspectDO.uuid) && Intrinsics.d(this.aspect, singleReviewAspectDO.aspect) && this.aspectCount == singleReviewAspectDO.aspectCount && this.bottomPadding == singleReviewAspectDO.bottomPadding;
    }

    @NotNull
    public final BadgeDTO getAspect() {
        return this.aspect;
    }

    public final int getAspectCount() {
        return this.aspectCount;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return Integer.hashCode(this.bottomPadding) + C2454a.a(this.aspectCount, C3124a.c(this.aspect, this.uuid.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        BadgeDTO badgeDTO = this.aspect;
        int i11 = this.aspectCount;
        int i12 = this.bottomPadding;
        StringBuilder sb2 = new StringBuilder("SingleReviewAspectDO(uuid=");
        sb2.append(str);
        sb2.append(", aspect=");
        sb2.append(badgeDTO);
        sb2.append(", aspectCount=");
        return P.a(i11, i12, ", bottomPadding=", ")", sb2);
    }
}
