package ru.ozon.app.android.storefront.stories.playstoriesv3.data;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/ViewedStoryModel;", "", "", "currentStoryId", "", "viewedStoriesIds", "<init>", "(JLjava/util/Set;)V", "copy", "(JLjava/util/Set;)Lru/ozon/app/android/storefront/stories/playstoriesv3/data/ViewedStoryModel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCurrentStoryId", "()J", "Ljava/util/Set;", "getViewedStoriesIds", "()Ljava/util/Set;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ViewedStoryModel {
    private final long currentStoryId;

    @NotNull
    private final Set<Long> viewedStoriesIds;

    public ViewedStoryModel(long j11, @NotNull Set<Long> viewedStoriesIds) {
        Intrinsics.checkNotNullParameter(viewedStoriesIds, "viewedStoriesIds");
        this.currentStoryId = j11;
        this.viewedStoriesIds = viewedStoriesIds;
    }

    @NotNull
    public final ViewedStoryModel copy(long currentStoryId, @NotNull Set<Long> viewedStoriesIds) {
        Intrinsics.checkNotNullParameter(viewedStoriesIds, "viewedStoriesIds");
        return new ViewedStoryModel(currentStoryId, viewedStoriesIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewedStoryModel)) {
            return false;
        }
        ViewedStoryModel viewedStoryModel = (ViewedStoryModel) other;
        return this.currentStoryId == viewedStoryModel.currentStoryId && Intrinsics.d(this.viewedStoriesIds, viewedStoryModel.viewedStoriesIds);
    }

    public final long getCurrentStoryId() {
        return this.currentStoryId;
    }

    @NotNull
    public final Set<Long> getViewedStoriesIds() {
        return this.viewedStoriesIds;
    }

    public int hashCode() {
        return this.viewedStoriesIds.hashCode() + (Long.hashCode(this.currentStoryId) * 31);
    }

    @NotNull
    public String toString() {
        return "ViewedStoryModel(currentStoryId=" + this.currentStoryId + ", viewedStoriesIds=" + this.viewedStoriesIds + ")";
    }
}
