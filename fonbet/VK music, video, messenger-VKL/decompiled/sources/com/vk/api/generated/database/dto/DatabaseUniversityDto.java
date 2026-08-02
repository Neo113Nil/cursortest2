package com.vk.api.generated.database.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DatabaseUniversityDto.kt */
/* loaded from: classes14.dex */
public final class DatabaseUniversityDto implements Parcelable {
    public static final Parcelable.Creator<DatabaseUniversityDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("title")
    private final String title;

    /* compiled from: DatabaseUniversityDto.kt */
    public static final class a implements Parcelable.Creator<DatabaseUniversityDto> {
        @Override // android.os.Parcelable.Creator
        public final DatabaseUniversityDto createFromParcel(Parcel parcel) {
            return new DatabaseUniversityDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DatabaseUniversityDto[] newArray(int i) {
            return new DatabaseUniversityDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseUniversityDto() {
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
        if (!(obj instanceof DatabaseUniversityDto)) {
            return false;
        }
        DatabaseUniversityDto databaseUniversityDto = (DatabaseUniversityDto) obj;
        return epx.f(this.id, databaseUniversityDto.id) && epx.f(this.title, databaseUniversityDto.title);
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
        StringBuilder sb = new StringBuilder("DatabaseUniversityDto(id=");
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

    public DatabaseUniversityDto(Integer num, String str) {
        this.id = num;
        this.title = str;
    }

    public /* synthetic */ DatabaseUniversityDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
