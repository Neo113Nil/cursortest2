package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import java.util.List;
import xsna.j5g;
import xsna.zcl;

/* compiled from: SimpleStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class SimpleStoriesContainer extends StoriesContainer {
    public static final Serializer.c<StoriesContainer> CREATOR = new a();

    /* compiled from: SimpleStoriesContainer.kt */
    public static final class a extends Serializer.c<StoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoriesContainer a(Serializer serializer) {
            return new SimpleStoriesContainer(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoriesContainer[i];
        }
    }

    public /* synthetic */ SimpleStoriesContainer(StoryOwner storyOwner, List list, String str, boolean z, int i, zcl zclVar) {
        this(storyOwner, list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z);
    }

    public SimpleStoriesContainer(StoryOwner storyOwner, List<? extends StoryEntry> list, String str, boolean z) {
        super(storyOwner, list, str, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SimpleStoriesContainer(UserProfile userProfile, List<? extends StoryEntry> list) {
        super(new StoryOwner.User(userProfile, r0 != null ? r0.t : null), list, null, false, 12, null);
        StoryEntry storyEntry = (StoryEntry) j5g.a0(list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SimpleStoriesContainer(Group group, List<? extends StoryEntry> list) {
        super(new StoryOwner.Community(group, r0 != null ? r0.t : null), list, null, false, 12, null);
        StoryEntry storyEntry = (StoryEntry) j5g.a0(list);
    }

    public SimpleStoriesContainer(Serializer serializer, zcl zclVar) {
        super(serializer);
    }
}
