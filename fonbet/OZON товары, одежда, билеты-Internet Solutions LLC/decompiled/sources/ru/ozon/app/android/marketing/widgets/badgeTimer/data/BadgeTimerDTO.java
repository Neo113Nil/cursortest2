package ru.ozon.app.android.marketing.widgets.badgeTimer.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.data.badge.Badge;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/badgeTimer/data/BadgeTimerDTO;", "", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/marketing/widgets/badgeTimer/data/Timer;", "<init>", "(Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/marketing/widgets/badgeTimer/data/Timer;)V", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getTimer", "()Lru/ozon/app/android/marketing/widgets/badgeTimer/data/Timer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BadgeTimerDTO {
    public static final int $stable = Badge.$stable;

    @NotNull
    private final Badge badge;
    private final Timer timer;

    public BadgeTimerDTO(@NotNull Badge badge, Timer timer) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.badge = badge;
        this.timer = timer;
    }

    public static /* synthetic */ BadgeTimerDTO copy$default(BadgeTimerDTO badgeTimerDTO, Badge badge, Timer timer, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badge = badgeTimerDTO.badge;
        }
        if ((i11 & 2) != 0) {
            timer = badgeTimerDTO.timer;
        }
        return badgeTimerDTO.copy(badge, timer);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    /* renamed from: component2, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @NotNull
    public final BadgeTimerDTO copy(@NotNull Badge badge, Timer timer) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        return new BadgeTimerDTO(badge, timer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeTimerDTO)) {
            return false;
        }
        BadgeTimerDTO badgeTimerDTO = (BadgeTimerDTO) other;
        return Intrinsics.d(this.badge, badgeTimerDTO.badge) && Intrinsics.d(this.timer, badgeTimerDTO.timer);
    }

    @NotNull
    public final Badge getBadge() {
        return this.badge;
    }

    public final Timer getTimer() {
        return this.timer;
    }

    public int hashCode() {
        int hashCode = this.badge.hashCode() * 31;
        Timer timer = this.timer;
        return hashCode + (timer == null ? 0 : timer.hashCode());
    }

    @NotNull
    public String toString() {
        return "BadgeTimerDTO(badge=" + this.badge + ", timer=" + this.timer + ")";
    }
}
