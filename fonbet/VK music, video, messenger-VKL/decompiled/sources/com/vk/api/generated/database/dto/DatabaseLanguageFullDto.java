package com.vk.api.generated.database.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DatabaseLanguageFullDto.kt */
/* loaded from: classes14.dex */
public final class DatabaseLanguageFullDto implements Parcelable {
    public static final Parcelable.Creator<DatabaseLanguageFullDto> CREATOR = new a();

    @pmi0("english_name")
    private final String englishName;

    @pmi0("id")
    private final int id;

    @pmi0("native_name")
    private final String nativeName;

    @pmi0("russian_name")
    private final String russianName;

    @pmi0("version")
    private final Integer version;

    /* compiled from: DatabaseLanguageFullDto.kt */
    public static final class a implements Parcelable.Creator<DatabaseLanguageFullDto> {
        @Override // android.os.Parcelable.Creator
        public final DatabaseLanguageFullDto createFromParcel(Parcel parcel) {
            return new DatabaseLanguageFullDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final DatabaseLanguageFullDto[] newArray(int i) {
            return new DatabaseLanguageFullDto[i];
        }
    }

    public DatabaseLanguageFullDto(int i, String str, String str2, String str3, Integer num) {
        this.id = i;
        this.nativeName = str;
        this.englishName = str2;
        this.russianName = str3;
        this.version = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseLanguageFullDto)) {
            return false;
        }
        DatabaseLanguageFullDto databaseLanguageFullDto = (DatabaseLanguageFullDto) obj;
        return this.id == databaseLanguageFullDto.id && epx.f(this.nativeName, databaseLanguageFullDto.nativeName) && epx.f(this.englishName, databaseLanguageFullDto.englishName) && epx.f(this.russianName, databaseLanguageFullDto.russianName) && epx.f(this.version, databaseLanguageFullDto.version);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.nativeName);
        String str = this.englishName;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.russianName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.version;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatabaseLanguageFullDto(id=");
        sb.append(this.id);
        sb.append(", nativeName=");
        sb.append(this.nativeName);
        sb.append(", englishName=");
        sb.append(this.englishName);
        sb.append(", russianName=");
        sb.append(this.russianName);
        sb.append(", version=");
        return uqi.b(sb, this.version, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.nativeName);
        parcel.writeString(this.englishName);
        parcel.writeString(this.russianName);
        Integer num = this.version;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ DatabaseLanguageFullDto(int i, String str, String str2, String str3, Integer num, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num);
    }
}
