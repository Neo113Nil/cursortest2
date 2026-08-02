package ru.ozon.app.android.storefront.domain.events;

import A00.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/domain/events/UpdateStoryViewed;", "LA00/a$J$a;", "", "closeStoryId", "", "viewedStorySet", "<init>", "(JLjava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCloseStoryId", "()J", "Ljava/util/Set;", "getViewedStorySet", "()Ljava/util/Set;", "events_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateStoryViewed implements a.J.InterfaceC0007a {
    private final long closeStoryId;

    @NotNull
    private final Set<Long> viewedStorySet;

    public UpdateStoryViewed(long j11, @NotNull Set<Long> viewedStorySet) {
        Intrinsics.checkNotNullParameter(viewedStorySet, "viewedStorySet");
        this.closeStoryId = j11;
        this.viewedStorySet = viewedStorySet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateStoryViewed)) {
            return false;
        }
        UpdateStoryViewed updateStoryViewed = (UpdateStoryViewed) other;
        return this.closeStoryId == updateStoryViewed.closeStoryId && Intrinsics.d(this.viewedStorySet, updateStoryViewed.viewedStorySet);
    }

    public final long getCloseStoryId() {
        return this.closeStoryId;
    }

    @NotNull
    public final Set<Long> getViewedStorySet() {
        return this.viewedStorySet;
    }

    public int hashCode() {
        return this.viewedStorySet.hashCode() + (Long.hashCode(this.closeStoryId) * 31);
    }

    @NotNull
    public String toString() {
        return "UpdateStoryViewed(closeStoryId=" + this.closeStoryId + ", viewedStorySet=" + this.viewedStorySet + ")";
    }
}
