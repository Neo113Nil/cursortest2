package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.zcl;

/* compiled from: LiveFinishedStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class LiveFinishedStoriesContainer extends StoriesContainer {
    public static final Serializer.c<LiveFinishedStoriesContainer> CREATOR = new a();
    public final String o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<LiveFinishedStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LiveFinishedStoriesContainer a(Serializer serializer) {
            return new LiveFinishedStoriesContainer(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LiveFinishedStoriesContainer[i];
        }
    }

    public LiveFinishedStoriesContainer(StoryOwner storyOwner, List<? extends StoryEntry> list, String str, boolean z) {
        super(storyOwner, list, str, z);
        this.o = "live_finished" + Ab();
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Ob() {
        return this.o;
    }

    public LiveFinishedStoriesContainer(Serializer serializer, zcl zclVar) {
        super(serializer);
        this.o = "live_finished" + Ab();
    }
}
