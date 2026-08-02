package com.vk.dto.stories.model;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import java.util.Map;
import java.util.Objects;
import xsna.fkq0;

/* loaded from: classes18.dex */
public class StoryEntryExtended extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryEntryExtended> CREATOR = new a();
    public final StoryEntry b;
    public final StoryOwner c;
    public final boolean d;

    public class a extends Serializer.c<StoryEntryExtended> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryEntryExtended a(@NonNull Serializer serializer) {
            return new StoryEntryExtended(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryEntryExtended[i];
        }
    }

    public StoryEntryExtended(StoryEntry storyEntry, Map<UserId, UserProfile> map, Map<UserId, Group> map2) {
        this.b = storyEntry;
        if (storyEntry.d.b > 0) {
            this.c = new StoryOwner.User(map.get(storyEntry.d), storyEntry.t);
        } else {
            this.c = new StoryOwner.Community(map2.get(fkq0.e(storyEntry.d)), storyEntry.t);
        }
        this.d = false;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEntryExtended)) {
            return false;
        }
        StoryEntryExtended storyEntryExtended = (StoryEntryExtended) obj;
        return this.d == storyEntryExtended.d && Objects.equals(this.b, storyEntryExtended.b) && Objects.equals(this.c, storyEntryExtended.c);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, Boolean.valueOf(this.d));
    }

    public final StoryEntry zb() {
        return this.b;
    }

    public StoryEntryExtended(StoryEntry storyEntry, StoryOwner storyOwner) {
        this(storyEntry, storyOwner, false);
    }

    public StoryEntryExtended(StoryEntry storyEntry, StoryOwner storyOwner, boolean z) {
        this.b = storyEntry;
        this.c = storyOwner;
        this.d = z;
    }

    public StoryEntryExtended(Serializer serializer) {
        this.b = (StoryEntry) serializer.G(StoryEntry.class.getClassLoader());
        this.c = (StoryOwner) serializer.G(StoryOwner.class.getClassLoader());
        this.d = serializer.m();
    }
}
