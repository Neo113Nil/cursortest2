package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/ViewedStories;", "", "", "currentStoryPosition", "", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "newItems", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCurrentStoryPosition", "Ljava/util/List;", "getNewItems", "()Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ViewedStories {
    private final int currentStoryPosition;

    @NotNull
    private final List<StoryCommonMolecule> newItems;

    public ViewedStories(int i11, @NotNull List<StoryCommonMolecule> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.currentStoryPosition = i11;
        this.newItems = newItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewedStories)) {
            return false;
        }
        ViewedStories viewedStories = (ViewedStories) other;
        return this.currentStoryPosition == viewedStories.currentStoryPosition && Intrinsics.d(this.newItems, viewedStories.newItems);
    }

    public final int getCurrentStoryPosition() {
        return this.currentStoryPosition;
    }

    @NotNull
    public final List<StoryCommonMolecule> getNewItems() {
        return this.newItems;
    }

    public int hashCode() {
        return this.newItems.hashCode() + (Integer.hashCode(this.currentStoryPosition) * 31);
    }

    @NotNull
    public String toString() {
        return "ViewedStories(currentStoryPosition=" + this.currentStoryPosition + ", newItems=" + this.newItems + ")";
    }
}
