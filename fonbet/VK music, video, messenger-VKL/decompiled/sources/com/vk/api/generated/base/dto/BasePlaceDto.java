package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BasePlaceDto.kt */
/* loaded from: classes14.dex */
public final class BasePlaceDto implements Parcelable {
    public static final Parcelable.Creator<BasePlaceDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("checkins")
    private final Integer checkins;

    @pmi0("city")
    private final String city;

    @pmi0("country")
    private final String country;

    @pmi0("created")
    private final Integer created;

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final Integer id;

    @pmi0("latitude")
    private final Float latitude;

    @pmi0("longitude")
    private final Float longitude;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* compiled from: BasePlaceDto.kt */
    public static final class a implements Parcelable.Creator<BasePlaceDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final BasePlaceDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Float f;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                f = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                f = null;
            }
            String readString2 = parcel.readString();
            Float f2 = f;
            String readString3 = parcel.readString();
            Object valueOf2 = parcel.readInt() == 0 ? f2 : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            Object valueOf3 = parcel.readInt() == 0 ? f2 : Integer.valueOf(parcel.readInt());
            Float valueOf4 = parcel.readInt() == 0 ? f2 : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() != 0) {
                f2 = Float.valueOf(parcel.readFloat());
            }
            return new BasePlaceDto(readString, valueOf, readString2, readString3, valueOf2, readString4, valueOf3, valueOf4, f2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BasePlaceDto[] newArray(int i) {
            return new BasePlaceDto[i];
        }
    }

    public BasePlaceDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasePlaceDto)) {
            return false;
        }
        BasePlaceDto basePlaceDto = (BasePlaceDto) obj;
        return epx.f(this.address, basePlaceDto.address) && epx.f(this.checkins, basePlaceDto.checkins) && epx.f(this.city, basePlaceDto.city) && epx.f(this.country, basePlaceDto.country) && epx.f(this.created, basePlaceDto.created) && epx.f(this.icon, basePlaceDto.icon) && epx.f(this.id, basePlaceDto.id) && epx.f(this.latitude, basePlaceDto.latitude) && epx.f(this.longitude, basePlaceDto.longitude) && epx.f(this.title, basePlaceDto.title) && epx.f(this.type, basePlaceDto.type);
    }

    public final int hashCode() {
        String str = this.address;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.checkins;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.city;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.created;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.icon;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.id;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.latitude;
        int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.longitude;
        int hashCode9 = (hashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str5 = this.title;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        return hashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BasePlaceDto(address=");
        sb.append(this.address);
        sb.append(", checkins=");
        sb.append(this.checkins);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", created=");
        sb.append(this.created);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.address);
        Integer num = this.checkins;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        Integer num2 = this.created;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.icon);
        Integer num3 = this.id;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Float f = this.latitude;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.longitude;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.type);
    }

    public BasePlaceDto(String str, Integer num, String str2, String str3, Integer num2, String str4, Integer num3, Float f, Float f2, String str5, String str6) {
        this.address = str;
        this.checkins = num;
        this.city = str2;
        this.country = str3;
        this.created = num2;
        this.icon = str4;
        this.id = num3;
        this.latitude = f;
        this.longitude = f2;
        this.title = str5;
        this.type = str6;
    }

    public /* synthetic */ BasePlaceDto(String str, Integer num, String str2, String str3, Integer num2, String str4, Integer num3, Float f, Float f2, String str5, String str6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : f2, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6);
    }
}
