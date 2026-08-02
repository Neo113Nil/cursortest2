package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoriesViewersItemDto.kt */
/* loaded from: classes15.dex */
public final class StoriesViewersItemDto implements Parcelable {
    public static final Parcelable.Creator<StoriesViewersItemDto> CREATOR = new a();

    @pmi0("is_liked")
    private final boolean isLiked;

    @pmi0("reaction_id")
    private final Integer reactionId;

    @pmi0("user")
    private final UsersUserFullDto user;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: StoriesViewersItemDto.kt */
    public static final class a implements Parcelable.Creator<StoriesViewersItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesViewersItemDto createFromParcel(Parcel parcel) {
            return new StoriesViewersItemDto(parcel.readInt() != 0, (UserId) parcel.readParcelable(StoriesViewersItemDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UsersUserFullDto) parcel.readParcelable(StoriesViewersItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesViewersItemDto[] newArray(int i) {
            return new StoriesViewersItemDto[i];
        }
    }

    public StoriesViewersItemDto(boolean z, UserId userId, Integer num, UsersUserFullDto usersUserFullDto) {
        this.isLiked = z;
        this.userId = userId;
        this.reactionId = num;
        this.user = usersUserFullDto;
    }

    public final boolean J() {
        return this.isLiked;
    }

    public final Integer d() {
        return this.reactionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UsersUserFullDto e() {
        return this.user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesViewersItemDto)) {
            return false;
        }
        StoriesViewersItemDto storiesViewersItemDto = (StoriesViewersItemDto) obj;
        return this.isLiked == storiesViewersItemDto.isLiked && epx.f(this.userId, storiesViewersItemDto.userId) && epx.f(this.reactionId, storiesViewersItemDto.reactionId) && epx.f(this.user, storiesViewersItemDto.user);
    }

    public final int hashCode() {
        int a2 = bh10.a(Boolean.hashCode(this.isLiked) * 31, 31, this.userId.b);
        Integer num = this.reactionId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.user;
        return hashCode + (usersUserFullDto != null ? usersUserFullDto.hashCode() : 0);
    }

    public final String toString() {
        return "StoriesViewersItemDto(isLiked=" + this.isLiked + ", userId=" + this.userId + ", reactionId=" + this.reactionId + ", user=" + this.user + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isLiked ? 1 : 0);
        parcel.writeParcelable(this.userId, i);
        Integer num = this.reactionId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.user, i);
    }

    public /* synthetic */ StoriesViewersItemDto(boolean z, UserId userId, Integer num, UsersUserFullDto usersUserFullDto, int i, zcl zclVar) {
        this(z, userId, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : usersUserFullDto);
    }
}
