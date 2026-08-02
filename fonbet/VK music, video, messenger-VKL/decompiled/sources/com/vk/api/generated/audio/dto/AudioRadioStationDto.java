package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AudioRadioStationDto.kt */
/* loaded from: classes14.dex */
public final class AudioRadioStationDto implements Parcelable {
    public static final Parcelable.Creator<AudioRadioStationDto> CREATOR = new a();

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("id")
    private final int id;

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    @pmi0("is_followed")
    private final Boolean isFollowed;

    @pmi0("logo_png_url")
    private final String logoPngUrl;

    @pmi0("logo_url")
    private final String logoUrl;

    @pmi0("name")
    private final String name;

    @pmi0("stream_url")
    private final String streamUrl;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: AudioRadioStationDto.kt */
    public static final class a implements Parcelable.Creator<AudioRadioStationDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioRadioStationDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioRadioStationDto(readInt, readString, readString2, readString3, readString4, valueOf, readString5, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioRadioStationDto[] newArray(int i) {
            return new AudioRadioStationDto[i];
        }
    }

    public AudioRadioStationDto(int i, String str, String str2, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6) {
        this.id = i;
        this.name = str;
        this.logoUrl = str2;
        this.logoPngUrl = str3;
        this.backgroundColor = str4;
        this.isFollowed = bool;
        this.streamUrl = str5;
        this.isEnabled = bool2;
        this.trackCode = str6;
    }

    public final String d() {
        return this.backgroundColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.logoPngUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioRadioStationDto)) {
            return false;
        }
        AudioRadioStationDto audioRadioStationDto = (AudioRadioStationDto) obj;
        return this.id == audioRadioStationDto.id && epx.f(this.name, audioRadioStationDto.name) && epx.f(this.logoUrl, audioRadioStationDto.logoUrl) && epx.f(this.logoPngUrl, audioRadioStationDto.logoPngUrl) && epx.f(this.backgroundColor, audioRadioStationDto.backgroundColor) && epx.f(this.isFollowed, audioRadioStationDto.isFollowed) && epx.f(this.streamUrl, audioRadioStationDto.streamUrl) && epx.f(this.isEnabled, audioRadioStationDto.isEnabled) && epx.f(this.trackCode, audioRadioStationDto.trackCode);
    }

    public final String f() {
        return this.name;
    }

    public final String g() {
        return this.streamUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        String str = this.logoUrl;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logoPngUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isFollowed;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.streamUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.isEnabled;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.trackCode;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isEnabled;
    }

    public final Boolean j() {
        return this.isFollowed;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioRadioStationDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", logoUrl=");
        sb.append(this.logoUrl);
        sb.append(", logoPngUrl=");
        sb.append(this.logoPngUrl);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", isFollowed=");
        sb.append(this.isFollowed);
        sb.append(", streamUrl=");
        sb.append(this.streamUrl);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.logoPngUrl);
        parcel.writeString(this.backgroundColor);
        Boolean bool = this.isFollowed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.streamUrl);
        Boolean bool2 = this.isEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ AudioRadioStationDto(int i, String str, String str2, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : str6);
    }
}
