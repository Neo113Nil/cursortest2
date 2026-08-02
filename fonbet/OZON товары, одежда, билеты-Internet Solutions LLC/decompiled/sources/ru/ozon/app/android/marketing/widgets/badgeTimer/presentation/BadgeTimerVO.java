package ru.ozon.app.android.marketing.widgets.badgeTimer.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/badgeTimer/presentation/BadgeTimerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "timestampEnd", "<init>", "(JLru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Ljava/lang/Long;", "getTimestampEnd", "()Ljava/lang/Long;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BadgeTimerVO implements c {
    public static final int $stable = Badge.$stable;

    @NotNull
    private final Badge badge;
    private final long id;
    private final Long timestampEnd;

    public BadgeTimerVO(long j11, @NotNull Badge badge, Long l11) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.id = j11;
        this.badge = badge;
        this.timestampEnd = l11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeTimerVO)) {
            return false;
        }
        BadgeTimerVO badgeTimerVO = (BadgeTimerVO) other;
        return this.id == badgeTimerVO.id && Intrinsics.d(this.badge, badgeTimerVO.badge) && Intrinsics.d(this.timestampEnd, badgeTimerVO.timestampEnd);
    }

    @NotNull
    public final Badge getBadge() {
        return this.badge;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Long getTimestampEnd() {
        return this.timestampEnd;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.badge.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        Long l11 = this.timestampEnd;
        return hashCode + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public String toString() {
        return "BadgeTimerVO(id=" + this.id + ", badge=" + this.badge + ", timestampEnd=" + this.timestampEnd + ")";
    }
}
