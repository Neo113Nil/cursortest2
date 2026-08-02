package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;

/* compiled from: FriendsRecBlockButtonActionDto.kt */
/* loaded from: classes14.dex */
public final class FriendsRecBlockButtonActionDto implements Parcelable {
    public static final Parcelable.Creator<FriendsRecBlockButtonActionDto> CREATOR = new a();

    @pmi0("type")
    private final FriendsRecBlockButtonActionTypeDto type;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: FriendsRecBlockButtonActionDto.kt */
    public static final class a implements Parcelable.Creator<FriendsRecBlockButtonActionDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockButtonActionDto createFromParcel(Parcel parcel) {
            return new FriendsRecBlockButtonActionDto(FriendsRecBlockButtonActionTypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(FriendsRecBlockButtonActionDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockButtonActionDto[] newArray(int i) {
            return new FriendsRecBlockButtonActionDto[i];
        }
    }

    public FriendsRecBlockButtonActionDto(FriendsRecBlockButtonActionTypeDto friendsRecBlockButtonActionTypeDto, UserId userId) {
        this.type = friendsRecBlockButtonActionTypeDto;
        this.userId = userId;
    }

    public final FriendsRecBlockButtonActionTypeDto d() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsRecBlockButtonActionDto)) {
            return false;
        }
        FriendsRecBlockButtonActionDto friendsRecBlockButtonActionDto = (FriendsRecBlockButtonActionDto) obj;
        return this.type == friendsRecBlockButtonActionDto.type && epx.f(this.userId, friendsRecBlockButtonActionDto.userId);
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        return Long.hashCode(this.userId.b) + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsRecBlockButtonActionDto(type=");
        sb.append(this.type);
        sb.append(", userId=");
        return gp.b(sb, this.userId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.userId, i);
    }
}
