package com.vk.profile.core.avatar;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.model.StoriesContainer;
import xsna.zcl;

/* compiled from: AvatarlessStoriesContainer.kt */
/* loaded from: classes5.dex */
public final class AvatarlessStoriesContainer extends StoriesContainer {
    public static final Serializer.c<AvatarlessStoriesContainer> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AvatarlessStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AvatarlessStoriesContainer a(Serializer serializer) {
            return new AvatarlessStoriesContainer(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AvatarlessStoriesContainer[i];
        }
    }

    public AvatarlessStoriesContainer(StoriesContainer storiesContainer) {
        super(storiesContainer.b, storiesContainer.g, storiesContainer.f, storiesContainer.e);
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Hb(int i) {
        return null;
    }

    public AvatarlessStoriesContainer(Serializer serializer, zcl zclVar) {
        super(serializer);
    }
}
