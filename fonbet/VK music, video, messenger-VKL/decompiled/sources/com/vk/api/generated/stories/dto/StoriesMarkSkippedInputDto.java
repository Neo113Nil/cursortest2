package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesMarkSkippedInputDto.kt */
/* loaded from: classes15.dex */
public final class StoriesMarkSkippedInputDto implements Parcelable {
    public static final Parcelable.Creator<StoriesMarkSkippedInputDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("story_id")
    private final Integer storyId;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: StoriesMarkSkippedInputDto.kt */
    public static final class a implements Parcelable.Creator<StoriesMarkSkippedInputDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesMarkSkippedInputDto createFromParcel(Parcel parcel) {
            return new StoriesMarkSkippedInputDto((UserId) parcel.readParcelable(StoriesMarkSkippedInputDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesMarkSkippedInputDto[] newArray(int i) {
            return new StoriesMarkSkippedInputDto[i];
        }
    }

    public StoriesMarkSkippedInputDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesMarkSkippedInputDto)) {
            return false;
        }
        StoriesMarkSkippedInputDto storiesMarkSkippedInputDto = (StoriesMarkSkippedInputDto) obj;
        return epx.f(this.ownerId, storiesMarkSkippedInputDto.ownerId) && epx.f(this.storyId, storiesMarkSkippedInputDto.storyId) && epx.f(this.trackCode, storiesMarkSkippedInputDto.trackCode);
    }

    public final int hashCode() {
        UserId userId = this.ownerId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Integer num = this.storyId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.trackCode;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesMarkSkippedInputDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", storyId=");
        sb.append(this.storyId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        Integer num = this.storyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.trackCode);
    }

    public StoriesMarkSkippedInputDto(UserId userId, Integer num, String str) {
        this.ownerId = userId;
        this.storyId = num;
        this.trackCode = str;
    }

    public /* synthetic */ StoriesMarkSkippedInputDto(UserId userId, Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }
}
