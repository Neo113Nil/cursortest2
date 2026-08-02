package ru.ozon.fintech.features.finwebview.domain.badge;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"ru/ozon/fintech/features/finwebview/domain/badge/ExternalBadgeCallback$BadgeState", "", "", "isActive", "", "count", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "Lru/ozon/fintech/features/finwebview/domain/badge/ExternalBadgeCallback$BadgeState;", "copy", "(ZLjava/lang/String;)Lru/ozon/fintech/features/finwebview/domain/badge/ExternalBadgeCallback$BadgeState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getCount", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ExternalBadgeCallback$BadgeState {

    @NotNull
    private final String count;
    private final boolean isActive;

    public ExternalBadgeCallback$BadgeState(boolean z11, @NotNull String count) {
        Intrinsics.checkNotNullParameter(count, "count");
        this.isActive = z11;
        this.count = count;
    }

    public static /* synthetic */ ExternalBadgeCallback$BadgeState copy$default(ExternalBadgeCallback$BadgeState externalBadgeCallback$BadgeState, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = externalBadgeCallback$BadgeState.isActive;
        }
        if ((i11 & 2) != 0) {
            str = externalBadgeCallback$BadgeState.count;
        }
        return externalBadgeCallback$BadgeState.copy(z11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    @NotNull
    public final ExternalBadgeCallback$BadgeState copy(boolean isActive, @NotNull String count) {
        Intrinsics.checkNotNullParameter(count, "count");
        return new ExternalBadgeCallback$BadgeState(isActive, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalBadgeCallback$BadgeState)) {
            return false;
        }
        ExternalBadgeCallback$BadgeState externalBadgeCallback$BadgeState = (ExternalBadgeCallback$BadgeState) other;
        return this.isActive == externalBadgeCallback$BadgeState.isActive && Intrinsics.d(this.count, externalBadgeCallback$BadgeState.count);
    }

    @NotNull
    public final String getCount() {
        return this.count;
    }

    public int hashCode() {
        return this.count.hashCode() + (Boolean.hashCode(this.isActive) * 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        return "BadgeState(isActive=" + this.isActive + ", count=" + this.count + ")";
    }
}
