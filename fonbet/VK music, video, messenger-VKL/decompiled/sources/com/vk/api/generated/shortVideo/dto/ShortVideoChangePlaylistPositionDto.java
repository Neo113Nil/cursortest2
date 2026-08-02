package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ShortVideoChangePlaylistPositionDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoChangePlaylistPositionDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoChangePlaylistPositionDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0(X3.i.L)
    private final int position;

    /* compiled from: ShortVideoChangePlaylistPositionDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoChangePlaylistPositionDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoChangePlaylistPositionDto createFromParcel(Parcel parcel) {
            return new ShortVideoChangePlaylistPositionDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoChangePlaylistPositionDto[] newArray(int i) {
            return new ShortVideoChangePlaylistPositionDto[i];
        }
    }

    public ShortVideoChangePlaylistPositionDto(int i, int i2) {
        this.id = i;
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
        if (!(obj instanceof ShortVideoChangePlaylistPositionDto)) {
            return false;
        }
        ShortVideoChangePlaylistPositionDto shortVideoChangePlaylistPositionDto = (ShortVideoChangePlaylistPositionDto) obj;
        return this.id == shortVideoChangePlaylistPositionDto.id && this.position == shortVideoChangePlaylistPositionDto.position;
    }

    public final int hashCode() {
        return Integer.hashCode(this.position) + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoChangePlaylistPositionDto(id=");
        sb.append(this.id);
        sb.append(", position=");
        return vu5.b(sb, this.position, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.position);
    }
}
