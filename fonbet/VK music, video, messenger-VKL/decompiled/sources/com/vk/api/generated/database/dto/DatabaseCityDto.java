package com.vk.api.generated.database.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DatabaseCityDto.kt */
/* loaded from: classes14.dex */
public final class DatabaseCityDto implements Parcelable {
    public static final Parcelable.Creator<DatabaseCityDto> CREATOR = new a();

    @pmi0("area")
    private final String area;

    @pmi0("country")
    private final String country;

    @pmi0("fias_guid")
    private final String fiasGuid;

    @pmi0("id")
    private final int id;

    @pmi0("important")
    private final BaseBoolIntDto important;

    @pmi0(TtmlNode.TAG_REGION)
    private final String region;

    @pmi0("title")
    private final String title;

    /* compiled from: DatabaseCityDto.kt */
    public static final class a implements Parcelable.Creator<DatabaseCityDto> {
        @Override // android.os.Parcelable.Creator
        public final DatabaseCityDto createFromParcel(Parcel parcel) {
            return new DatabaseCityDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BaseBoolIntDto) parcel.readParcelable(DatabaseCityDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DatabaseCityDto[] newArray(int i) {
            return new DatabaseCityDto[i];
        }
    }

    public DatabaseCityDto(int i, String str, String str2, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto) {
        this.id = i;
        this.title = str;
        this.area = str2;
        this.region = str3;
        this.country = str4;
        this.fiasGuid = str5;
        this.important = baseBoolIntDto;
    }

    public final String d() {
        return this.area;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.important;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseCityDto)) {
            return false;
        }
        DatabaseCityDto databaseCityDto = (DatabaseCityDto) obj;
        return this.id == databaseCityDto.id && epx.f(this.title, databaseCityDto.title) && epx.f(this.area, databaseCityDto.area) && epx.f(this.region, databaseCityDto.region) && epx.f(this.country, databaseCityDto.country) && epx.f(this.fiasGuid, databaseCityDto.fiasGuid) && this.important == databaseCityDto.important;
    }

    public final String f() {
        return this.region;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        String str = this.area;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fiasGuid;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.important;
        return hashCode4 + (baseBoolIntDto != null ? baseBoolIntDto.hashCode() : 0);
    }

    public final String toString() {
        return "DatabaseCityDto(id=" + this.id + ", title=" + this.title + ", area=" + this.area + ", region=" + this.region + ", country=" + this.country + ", fiasGuid=" + this.fiasGuid + ", important=" + this.important + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.area);
        parcel.writeString(this.region);
        parcel.writeString(this.country);
        parcel.writeString(this.fiasGuid);
        parcel.writeParcelable(this.important, i);
    }

    public /* synthetic */ DatabaseCityDto(int i, String str, String str2, String str3, String str4, String str5, BaseBoolIntDto baseBoolIntDto, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : baseBoolIntDto);
    }
}
