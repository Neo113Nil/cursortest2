package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ShortVideoShortVideoIdDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoIdDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoIdDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("video_id")
    private final int videoId;

    /* compiled from: ShortVideoShortVideoIdDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoIdDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoIdDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoIdDto((UserId) parcel.readParcelable(ShortVideoShortVideoIdDto.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoIdDto[] newArray(int i) {
            return new ShortVideoShortVideoIdDto[i];
        }
    }

    public ShortVideoShortVideoIdDto(UserId userId, int i) {
        this.ownerId = userId;
        this.videoId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoIdDto)) {
            return false;
        }
        ShortVideoShortVideoIdDto shortVideoShortVideoIdDto = (ShortVideoShortVideoIdDto) obj;
        return epx.f(this.ownerId, shortVideoShortVideoIdDto.ownerId) && this.videoId == shortVideoShortVideoIdDto.videoId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.videoId) + (Long.hashCode(this.ownerId.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoIdDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", videoId=");
        return vu5.b(sb, this.videoId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.videoId);
    }
}
