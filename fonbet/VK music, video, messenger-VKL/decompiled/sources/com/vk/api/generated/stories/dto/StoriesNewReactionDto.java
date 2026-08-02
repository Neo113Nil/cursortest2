package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoriesNewReactionDto.kt */
/* loaded from: classes15.dex */
public final class StoriesNewReactionDto implements Parcelable {
    public static final Parcelable.Creator<StoriesNewReactionDto> CREATOR = new a();

    @pmi0("reaction_id")
    private final Integer reactionId;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: StoriesNewReactionDto.kt */
    public static final class a implements Parcelable.Creator<StoriesNewReactionDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesNewReactionDto createFromParcel(Parcel parcel) {
            return new StoriesNewReactionDto((UserId) parcel.readParcelable(StoriesNewReactionDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesNewReactionDto[] newArray(int i) {
            return new StoriesNewReactionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoriesNewReactionDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesNewReactionDto)) {
            return false;
        }
        StoriesNewReactionDto storiesNewReactionDto = (StoriesNewReactionDto) obj;
        return epx.f(this.userId, storiesNewReactionDto.userId) && epx.f(this.reactionId, storiesNewReactionDto.reactionId);
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        UserId userId = this.userId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Integer num = this.reactionId;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesNewReactionDto(userId=");
        sb.append(this.userId);
        sb.append(", reactionId=");
        return uqi.b(sb, this.reactionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        Integer num = this.reactionId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public StoriesNewReactionDto(UserId userId, Integer num) {
        this.userId = userId;
        this.reactionId = num;
    }

    public /* synthetic */ StoriesNewReactionDto(UserId userId, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : num);
    }
}
