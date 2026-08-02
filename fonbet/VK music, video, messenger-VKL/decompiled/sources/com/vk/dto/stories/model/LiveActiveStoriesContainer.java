package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.zcl;

/* compiled from: LiveActiveStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class LiveActiveStoriesContainer extends StoriesContainer {
    public static final Serializer.c<LiveActiveStoriesContainer> CREATOR = new a();
    public final String o;
    public final boolean p;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<LiveActiveStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LiveActiveStoriesContainer a(Serializer serializer) {
            return new LiveActiveStoriesContainer(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LiveActiveStoriesContainer[i];
        }
    }

    public LiveActiveStoriesContainer(StoryOwner storyOwner, List<? extends StoryEntry> list, String str, boolean z) {
        super(storyOwner, list, str, z);
        this.o = "live" + Ab();
        this.p = true;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final boolean Cb() {
        return this.p;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Ob() {
        return this.o;
    }

    public LiveActiveStoriesContainer(Serializer serializer, zcl zclVar) {
        super(serializer);
        this.o = "live" + Ab();
        this.p = true;
    }
}
