package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: ShortVideoSourceVideoDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoSourceVideoDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoSourceVideoDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("end_screen_title")
    private final String endScreenTitle;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("video_id")
    private final int videoId;

    /* compiled from: ShortVideoSourceVideoDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoSourceVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoSourceVideoDto createFromParcel(Parcel parcel) {
            return new ShortVideoSourceVideoDto((UserId) parcel.readParcelable(ShortVideoSourceVideoDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoSourceVideoDto[] newArray(int i) {
            return new ShortVideoSourceVideoDto[i];
        }
    }

    public ShortVideoSourceVideoDto(UserId userId, int i, String str, String str2) {
        this.ownerId = userId;
        this.videoId = i;
        this.description = str;
        this.endScreenTitle = str2;
    }

    public final int d() {
        return this.videoId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoSourceVideoDto)) {
            return false;
        }
        ShortVideoSourceVideoDto shortVideoSourceVideoDto = (ShortVideoSourceVideoDto) obj;
        return epx.f(this.ownerId, shortVideoSourceVideoDto.ownerId) && this.videoId == shortVideoSourceVideoDto.videoId && epx.f(this.description, shortVideoSourceVideoDto.description) && epx.f(this.endScreenTitle, shortVideoSourceVideoDto.endScreenTitle);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        return this.endScreenTitle.hashCode() + urd0.a(shy.a(this.videoId, Long.hashCode(this.ownerId.b) * 31, 31), 31, this.description);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoSourceVideoDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", endScreenTitle=");
        return ho8.a(sb, this.endScreenTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.videoId);
        parcel.writeString(this.description);
        parcel.writeString(this.endScreenTitle);
    }
}
