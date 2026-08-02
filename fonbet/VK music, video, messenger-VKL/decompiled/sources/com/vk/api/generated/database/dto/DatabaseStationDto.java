package com.vk.api.generated.database.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DatabaseStationDto.kt */
/* loaded from: classes14.dex */
public final class DatabaseStationDto implements Parcelable {
    public static final Parcelable.Creator<DatabaseStationDto> CREATOR = new a();

    @pmi0("city_id")
    private final Integer cityId;

    @pmi0("color")
    private final String color;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: DatabaseStationDto.kt */
    public static final class a implements Parcelable.Creator<DatabaseStationDto> {
        @Override // android.os.Parcelable.Creator
        public final DatabaseStationDto createFromParcel(Parcel parcel) {
            return new DatabaseStationDto(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DatabaseStationDto[] newArray(int i) {
            return new DatabaseStationDto[i];
        }
    }

    public DatabaseStationDto(int i, String str, Integer num, String str2) {
        this.id = i;
        this.name = str;
        this.cityId = num;
        this.color = str2;
    }

    public final String d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseStationDto)) {
            return false;
        }
        DatabaseStationDto databaseStationDto = (DatabaseStationDto) obj;
        return this.id == databaseStationDto.id && epx.f(this.name, databaseStationDto.name) && epx.f(this.cityId, databaseStationDto.cityId) && epx.f(this.color, databaseStationDto.color);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        Integer num = this.cityId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.color;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatabaseStationDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", cityId=");
        sb.append(this.cityId);
        sb.append(", color=");
        return ho8.a(sb, this.color, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        Integer num = this.cityId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.color);
    }

    public /* synthetic */ DatabaseStationDto(int i, String str, Integer num, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str2);
    }
}
