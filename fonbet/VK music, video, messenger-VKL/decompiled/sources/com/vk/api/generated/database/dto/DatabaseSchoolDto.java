package com.vk.api.generated.database.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DatabaseSchoolDto.kt */
/* loaded from: classes14.dex */
public final class DatabaseSchoolDto implements Parcelable {
    public static final Parcelable.Creator<DatabaseSchoolDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("title")
    private final String title;

    /* compiled from: DatabaseSchoolDto.kt */
    public static final class a implements Parcelable.Creator<DatabaseSchoolDto> {
        @Override // android.os.Parcelable.Creator
        public final DatabaseSchoolDto createFromParcel(Parcel parcel) {
            return new DatabaseSchoolDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DatabaseSchoolDto[] newArray(int i) {
            return new DatabaseSchoolDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseSchoolDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseSchoolDto)) {
            return false;
        }
        DatabaseSchoolDto databaseSchoolDto = (DatabaseSchoolDto) obj;
        return epx.f(this.id, databaseSchoolDto.id) && epx.f(this.title, databaseSchoolDto.title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatabaseSchoolDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.title);
    }

    public DatabaseSchoolDto(Integer num, String str) {
        this.id = num;
        this.title = str;
    }

    public /* synthetic */ DatabaseSchoolDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
