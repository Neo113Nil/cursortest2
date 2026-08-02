package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: ShortVideoChangeVideoPositionDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoChangeVideoPositionDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoChangeVideoPositionDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0(X3.i.L)
    private final int position;

    @pmi0("video_id")
    private final int videoId;

    /* compiled from: ShortVideoChangeVideoPositionDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoChangeVideoPositionDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoChangeVideoPositionDto createFromParcel(Parcel parcel) {
            return new ShortVideoChangeVideoPositionDto((UserId) parcel.readParcelable(ShortVideoChangeVideoPositionDto.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoChangeVideoPositionDto[] newArray(int i) {
            return new ShortVideoChangeVideoPositionDto[i];
        }
    }

    public ShortVideoChangeVideoPositionDto(UserId userId, int i, int i2) {
        this.ownerId = userId;
        this.videoId = i;
        this.position = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoChangeVideoPositionDto)) {
            return false;
        }
        ShortVideoChangeVideoPositionDto shortVideoChangeVideoPositionDto = (ShortVideoChangeVideoPositionDto) obj;
        return epx.f(this.ownerId, shortVideoChangeVideoPositionDto.ownerId) && this.videoId == shortVideoChangeVideoPositionDto.videoId && this.position == shortVideoChangeVideoPositionDto.position;
    }

    public final int hashCode() {
        return Integer.hashCode(this.position) + shy.a(this.videoId, Long.hashCode(this.ownerId.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoChangeVideoPositionDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(", position=");
        return vu5.b(sb, this.position, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.videoId);
        parcel.writeInt(this.position);
    }
}
