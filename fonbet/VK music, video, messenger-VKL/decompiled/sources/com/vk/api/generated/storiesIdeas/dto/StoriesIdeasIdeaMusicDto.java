package com.vk.api.generated.storiesIdeas.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: StoriesIdeasIdeaMusicDto.kt */
/* loaded from: classes15.dex */
public final class StoriesIdeasIdeaMusicDto implements Parcelable {
    public static final Parcelable.Creator<StoriesIdeasIdeaMusicDto> CREATOR = new a();

    @pmi0("audio_id")
    private final int audioId;

    @pmi0("audio_owner_id")
    private final UserId audioOwnerId;

    /* compiled from: StoriesIdeasIdeaMusicDto.kt */
    public static final class a implements Parcelable.Creator<StoriesIdeasIdeaMusicDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeaMusicDto createFromParcel(Parcel parcel) {
            return new StoriesIdeasIdeaMusicDto((UserId) parcel.readParcelable(StoriesIdeasIdeaMusicDto.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeaMusicDto[] newArray(int i) {
            return new StoriesIdeasIdeaMusicDto[i];
        }
    }

    public StoriesIdeasIdeaMusicDto(UserId userId, int i) {
        this.audioOwnerId = userId;
        this.audioId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesIdeasIdeaMusicDto)) {
            return false;
        }
        StoriesIdeasIdeaMusicDto storiesIdeasIdeaMusicDto = (StoriesIdeasIdeaMusicDto) obj;
        return epx.f(this.audioOwnerId, storiesIdeasIdeaMusicDto.audioOwnerId) && this.audioId == storiesIdeasIdeaMusicDto.audioId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.audioId) + (Long.hashCode(this.audioOwnerId.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesIdeasIdeaMusicDto(audioOwnerId=");
        sb.append(this.audioOwnerId);
        sb.append(", audioId=");
        return vu5.b(sb, this.audioId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.audioOwnerId, i);
        parcel.writeInt(this.audioId);
    }
}
