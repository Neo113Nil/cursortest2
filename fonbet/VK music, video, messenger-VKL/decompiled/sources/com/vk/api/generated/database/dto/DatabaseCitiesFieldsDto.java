package com.vk.api.generated.database.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DatabaseCitiesFieldsDto.kt */
/* loaded from: classes14.dex */
public final class DatabaseCitiesFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DatabaseCitiesFieldsDto[] $VALUES;
    public static final Parcelable.Creator<DatabaseCitiesFieldsDto> CREATOR;

    @pmi0("fias_guid")
    public static final DatabaseCitiesFieldsDto FIAS_GUID;
    private final String value;

    /* compiled from: DatabaseCitiesFieldsDto.kt */
    public static final class a implements Parcelable.Creator<DatabaseCitiesFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final DatabaseCitiesFieldsDto createFromParcel(Parcel parcel) {
            return DatabaseCitiesFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DatabaseCitiesFieldsDto[] newArray(int i) {
            return new DatabaseCitiesFieldsDto[i];
        }
    }

    static {
        DatabaseCitiesFieldsDto databaseCitiesFieldsDto = new DatabaseCitiesFieldsDto("FIAS_GUID", 0, "fias_guid");
        FIAS_GUID = databaseCitiesFieldsDto;
        DatabaseCitiesFieldsDto[] databaseCitiesFieldsDtoArr = {databaseCitiesFieldsDto};
        $VALUES = databaseCitiesFieldsDtoArr;
        $ENTRIES = new asp(databaseCitiesFieldsDtoArr);
        CREATOR = new a();
    }

    private DatabaseCitiesFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DatabaseCitiesFieldsDto valueOf(String str) {
        return (DatabaseCitiesFieldsDto) Enum.valueOf(DatabaseCitiesFieldsDto.class, str);
    }

    public static DatabaseCitiesFieldsDto[] values() {
        return (DatabaseCitiesFieldsDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
