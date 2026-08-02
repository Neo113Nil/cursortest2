package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ShortVideoShortVideoNewsMonothemeDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoNewsMonothemeDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoNewsMonothemeDto> CREATOR = new a();

    @pmi0("header")
    private final String header;

    @pmi0("id")
    private final int id;

    @pmi0("object_id")
    private final String objectId;

    /* compiled from: ShortVideoShortVideoNewsMonothemeDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoNewsMonothemeDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoNewsMonothemeDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoNewsMonothemeDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoNewsMonothemeDto[] newArray(int i) {
            return new ShortVideoShortVideoNewsMonothemeDto[i];
        }
    }

    public ShortVideoShortVideoNewsMonothemeDto(int i, String str, String str2) {
        this.id = i;
        this.header = str;
        this.objectId = str2;
    }

    public final String d() {
        return this.header;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.objectId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoNewsMonothemeDto)) {
            return false;
        }
        ShortVideoShortVideoNewsMonothemeDto shortVideoShortVideoNewsMonothemeDto = (ShortVideoShortVideoNewsMonothemeDto) obj;
        return this.id == shortVideoShortVideoNewsMonothemeDto.id && epx.f(this.header, shortVideoShortVideoNewsMonothemeDto.header) && epx.f(this.objectId, shortVideoShortVideoNewsMonothemeDto.objectId);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.header);
        String str = this.objectId;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoNewsMonothemeDto(id=");
        sb.append(this.id);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", objectId=");
        return ho8.a(sb, this.objectId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.header);
        parcel.writeString(this.objectId);
    }

    public /* synthetic */ ShortVideoShortVideoNewsMonothemeDto(int i, String str, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }
}
