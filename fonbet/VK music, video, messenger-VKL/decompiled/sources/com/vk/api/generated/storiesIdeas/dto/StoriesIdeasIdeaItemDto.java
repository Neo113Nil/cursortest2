package com.vk.api.generated.storiesIdeas.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.vu5;

/* compiled from: StoriesIdeasIdeaItemDto.kt */
/* loaded from: classes15.dex */
public final class StoriesIdeasIdeaItemDto implements Parcelable {
    public static final Parcelable.Creator<StoriesIdeasIdeaItemDto> CREATOR = new a();

    @pmi0("expires_at")
    private final int expiresAt;

    @pmi0("idea")
    private final StoriesIdeasIdeaDto idea;

    @pmi0("storybox")
    private final String storybox;

    /* compiled from: StoriesIdeasIdeaItemDto.kt */
    public static final class a implements Parcelable.Creator<StoriesIdeasIdeaItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeaItemDto createFromParcel(Parcel parcel) {
            return new StoriesIdeasIdeaItemDto(StoriesIdeasIdeaDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeaItemDto[] newArray(int i) {
            return new StoriesIdeasIdeaItemDto[i];
        }
    }

    public StoriesIdeasIdeaItemDto(StoriesIdeasIdeaDto storiesIdeasIdeaDto, String str, int i) {
        this.idea = storiesIdeasIdeaDto;
        this.storybox = str;
        this.expiresAt = i;
    }

    public final int d() {
        return this.expiresAt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StoriesIdeasIdeaDto e() {
        return this.idea;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesIdeasIdeaItemDto)) {
            return false;
        }
        StoriesIdeasIdeaItemDto storiesIdeasIdeaItemDto = (StoriesIdeasIdeaItemDto) obj;
        return epx.f(this.idea, storiesIdeasIdeaItemDto.idea) && epx.f(this.storybox, storiesIdeasIdeaItemDto.storybox) && this.expiresAt == storiesIdeasIdeaItemDto.expiresAt;
    }

    public final String f() {
        return this.storybox;
    }

    public final int hashCode() {
        return Integer.hashCode(this.expiresAt) + urd0.a(this.idea.hashCode() * 31, 31, this.storybox);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesIdeasIdeaItemDto(idea=");
        sb.append(this.idea);
        sb.append(", storybox=");
        sb.append(this.storybox);
        sb.append(", expiresAt=");
        return vu5.b(sb, this.expiresAt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.idea.writeToParcel(parcel, i);
        parcel.writeString(this.storybox);
        parcel.writeInt(this.expiresAt);
    }
}
