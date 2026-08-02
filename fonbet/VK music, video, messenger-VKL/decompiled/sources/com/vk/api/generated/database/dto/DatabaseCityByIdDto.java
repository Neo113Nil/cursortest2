package com.vk.api.generated.database.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DatabaseCityByIdDto.kt */
/* loaded from: classes14.dex */
public final class DatabaseCityByIdDto implements Parcelable {
    public static final Parcelable.Creator<DatabaseCityByIdDto> CREATOR = new a();

    @pmi0("fias_guid")
    private final String fiasGuid;

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: DatabaseCityByIdDto.kt */
    public static final class a implements Parcelable.Creator<DatabaseCityByIdDto> {
        @Override // android.os.Parcelable.Creator
        public final DatabaseCityByIdDto createFromParcel(Parcel parcel) {
            return new DatabaseCityByIdDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DatabaseCityByIdDto[] newArray(int i) {
            return new DatabaseCityByIdDto[i];
        }
    }

    public DatabaseCityByIdDto(int i, String str, String str2) {
        this.id = i;
        this.title = str;
        this.fiasGuid = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseCityByIdDto)) {
            return false;
        }
        DatabaseCityByIdDto databaseCityByIdDto = (DatabaseCityByIdDto) obj;
        return this.id == databaseCityByIdDto.id && epx.f(this.title, databaseCityByIdDto.title) && epx.f(this.fiasGuid, databaseCityByIdDto.fiasGuid);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        String str = this.fiasGuid;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatabaseCityByIdDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", fiasGuid=");
        return ho8.a(sb, this.fiasGuid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.fiasGuid);
    }

    public /* synthetic */ DatabaseCityByIdDto(int i, String str, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }
}
