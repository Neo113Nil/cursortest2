package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import xsna.zcl;

/* compiled from: StubAddStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class StubAddStoriesContainer extends StoriesContainer {
    public static final Serializer.c<StubAddStoriesContainer> CREATOR = new a();
    public final String o;
    public final boolean p;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StubAddStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StubAddStoriesContainer a(Serializer serializer) {
            return new StubAddStoriesContainer(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StubAddStoriesContainer[i];
        }
    }

    public StubAddStoriesContainer(StoryOwner storyOwner) {
        super(storyOwner, new ArrayList(), null, false, 12, null);
        this.o = "";
        this.p = true;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final boolean Cb() {
        return false;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final boolean Eb() {
        return this.p;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Ob() {
        return this.o;
    }

    public StubAddStoriesContainer(Serializer serializer, zcl zclVar) {
        super(serializer);
        this.o = "";
        this.p = true;
    }
}
