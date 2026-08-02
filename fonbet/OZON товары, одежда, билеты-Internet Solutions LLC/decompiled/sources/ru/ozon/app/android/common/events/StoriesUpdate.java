package ru.ozon.app.android.common.events;

import A00.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/common/events/StoriesUpdate;", "LA00/a$J$a;", "", "closeScreenStoryPosition", "", "", "viewedStoriesIds", "<init>", "(ILjava/util/List;)V", "id", "", "isStoryViewed", "(Ljava/lang/Long;)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCloseScreenStoryPosition", "Ljava/util/List;", "getViewedStoriesIds", "()Ljava/util/List;", "events_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StoriesUpdate implements a.J.InterfaceC0007a {
    private final int closeScreenStoryPosition;

    @NotNull
    private final List<Long> viewedStoriesIds;

    public StoriesUpdate(int i11, @NotNull List<Long> viewedStoriesIds) {
        Intrinsics.checkNotNullParameter(viewedStoriesIds, "viewedStoriesIds");
        this.closeScreenStoryPosition = i11;
        this.viewedStoriesIds = viewedStoriesIds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoriesUpdate)) {
            return false;
        }
        StoriesUpdate storiesUpdate = (StoriesUpdate) other;
        return this.closeScreenStoryPosition == storiesUpdate.closeScreenStoryPosition && Intrinsics.d(this.viewedStoriesIds, storiesUpdate.viewedStoriesIds);
    }

    public final int getCloseScreenStoryPosition() {
        return this.closeScreenStoryPosition;
    }

    public int hashCode() {
        return this.viewedStoriesIds.hashCode() + (Integer.hashCode(this.closeScreenStoryPosition) * 31);
    }

    public final boolean isStoryViewed(Long id2) {
        if (id2 == null) {
            return false;
        }
        return this.viewedStoriesIds.contains(Long.valueOf(id2.longValue()));
    }

    @NotNull
    public String toString() {
        return "StoriesUpdate(closeScreenStoryPosition=" + this.closeScreenStoryPosition + ", viewedStoriesIds=" + this.viewedStoriesIds + ")";
    }
}
