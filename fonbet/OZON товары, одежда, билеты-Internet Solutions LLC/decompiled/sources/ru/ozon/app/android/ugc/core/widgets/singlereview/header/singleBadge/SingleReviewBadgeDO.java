package ru.ozon.app.android.ugc.core.widgets.singlereview.header.singleBadge;

import Gl.C3124a;
import K00.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/singleBadge/SingleReviewBadgeDO;", "", "", "uuid", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "badgeCount", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "I", "getBadgeCount", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleReviewBadgeDO {

    @NotNull
    private final BadgeDTO badge;
    private final int badgeCount;

    @NotNull
    private final String uuid;

    public SingleReviewBadgeDO(@NotNull String uuid, @NotNull BadgeDTO badge, int i11) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.uuid = uuid;
        this.badge = badge;
        this.badgeCount = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleReviewBadgeDO)) {
            return false;
        }
        SingleReviewBadgeDO singleReviewBadgeDO = (SingleReviewBadgeDO) other;
        return Intrinsics.d(this.uuid, singleReviewBadgeDO.uuid) && Intrinsics.d(this.badge, singleReviewBadgeDO.badge) && this.badgeCount == singleReviewBadgeDO.badgeCount;
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final int getBadgeCount() {
        return this.badgeCount;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return Integer.hashCode(this.badgeCount) + C3124a.c(this.badge, this.uuid.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        BadgeDTO badgeDTO = this.badge;
        int i11 = this.badgeCount;
        StringBuilder sb2 = new StringBuilder("SingleReviewBadgeDO(uuid=");
        sb2.append(str);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", badgeCount=");
        return b.e(i11, ")", sb2);
    }
}
