package com.blaze.blazesdk.features.stories.models.local;

import androidx.annotation.Keep;
import defpackage.fc6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/features/stories/models/local/StoryWithPages;", "", "story", "Lcom/blaze/blazesdk/features/stories/models/local/StoryLocal;", "pages", "", "Lcom/blaze/blazesdk/features/stories/models/local/PageLocal;", "<init>", "(Lcom/blaze/blazesdk/features/stories/models/local/StoryLocal;Ljava/util/List;)V", "getStory", "()Lcom/blaze/blazesdk/features/stories/models/local/StoryLocal;", "getPages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StoryWithPages {
    public static final int $stable = 8;

    @NotNull
    private final List<PageLocal> pages;

    @NotNull
    private final StoryLocal story;

    public StoryWithPages(@NotNull StoryLocal storyLocal, @NotNull List<PageLocal> list) {
        storyLocal.getClass();
        list.getClass();
        this.story = storyLocal;
        this.pages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryWithPages copy$default(StoryWithPages storyWithPages, StoryLocal storyLocal, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            storyLocal = storyWithPages.story;
        }
        if ((i & 2) != 0) {
            list = storyWithPages.pages;
        }
        return storyWithPages.copy(storyLocal, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final StoryLocal getStory() {
        return this.story;
    }

    @NotNull
    public final List<PageLocal> component2() {
        return this.pages;
    }

    @NotNull
    public final StoryWithPages copy(@NotNull StoryLocal story, @NotNull List<PageLocal> pages) {
        story.getClass();
        pages.getClass();
        return new StoryWithPages(story, pages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryWithPages)) {
            return false;
        }
        StoryWithPages storyWithPages = (StoryWithPages) other;
        return Intrinsics.c(this.story, storyWithPages.story) && Intrinsics.c(this.pages, storyWithPages.pages);
    }

    @NotNull
    public final List<PageLocal> getPages() {
        return this.pages;
    }

    @NotNull
    public final StoryLocal getStory() {
        return this.story;
    }

    public int hashCode() {
        return this.pages.hashCode() + (this.story.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("StoryWithPages(story=");
        sb.append(this.story);
        sb.append(", pages=");
        return fc6.p(sb, this.pages, ')');
    }
}
