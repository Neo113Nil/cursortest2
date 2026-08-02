package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: WallPostIdDto.kt */
/* loaded from: classes15.dex */
public final class WallPostIdDto implements Parcelable {
    public static final Parcelable.Creator<WallPostIdDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("post_id")
    private final int postId;

    /* compiled from: WallPostIdDto.kt */
    public static final class a implements Parcelable.Creator<WallPostIdDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostIdDto createFromParcel(Parcel parcel) {
            return new WallPostIdDto((UserId) parcel.readParcelable(WallPostIdDto.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostIdDto[] newArray(int i) {
            return new WallPostIdDto[i];
        }
    }

    public WallPostIdDto(UserId userId, int i) {
        this.ownerId = userId;
        this.postId = i;
    }

    public final int d() {
        return this.postId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostIdDto)) {
            return false;
        }
        WallPostIdDto wallPostIdDto = (WallPostIdDto) obj;
        return epx.f(this.ownerId, wallPostIdDto.ownerId) && this.postId == wallPostIdDto.postId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.postId) + (Long.hashCode(this.ownerId.b) * 31);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostIdDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", postId=");
        return vu5.b(sb, this.postId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.postId);
    }
}
