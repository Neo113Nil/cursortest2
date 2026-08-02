package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallAppPostDto.kt */
/* loaded from: classes15.dex */
public final class WallAppPostDto implements Parcelable {
    public static final Parcelable.Creator<WallAppPostDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("photo_130")
    private final String photo130;

    @pmi0("photo_604")
    private final String photo604;

    /* compiled from: WallAppPostDto.kt */
    public static final class a implements Parcelable.Creator<WallAppPostDto> {
        @Override // android.os.Parcelable.Creator
        public final WallAppPostDto createFromParcel(Parcel parcel) {
            return new WallAppPostDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallAppPostDto[] newArray(int i) {
            return new WallAppPostDto[i];
        }
    }

    public WallAppPostDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallAppPostDto)) {
            return false;
        }
        WallAppPostDto wallAppPostDto = (WallAppPostDto) obj;
        return epx.f(this.id, wallAppPostDto.id) && epx.f(this.name, wallAppPostDto.name) && epx.f(this.photo130, wallAppPostDto.photo130) && epx.f(this.photo604, wallAppPostDto.photo604);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo130;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo604;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallAppPostDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", photo130=");
        sb.append(this.photo130);
        sb.append(", photo604=");
        return ho8.a(sb, this.photo604, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.photo130);
        parcel.writeString(this.photo604);
    }

    public WallAppPostDto(Integer num, String str, String str2, String str3) {
        this.id = num;
        this.name = str;
        this.photo130 = str2;
        this.photo604 = str3;
    }

    public /* synthetic */ WallAppPostDto(Integer num, String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
