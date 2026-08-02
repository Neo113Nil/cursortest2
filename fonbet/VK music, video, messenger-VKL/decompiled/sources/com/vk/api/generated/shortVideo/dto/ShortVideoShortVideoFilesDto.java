package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoShortVideoFilesDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoFilesDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoFilesDto> CREATOR = new a();

    @pmi0("dash_hevc")
    private final String dashHevc;

    @pmi0("dash_sep")
    private final String dashSep;

    @pmi0("dash_uni")
    private final String dashUni;

    @pmi0("dash_webm")
    private final String dashWebm;

    @pmi0("dash_webm_av1")
    private final String dashWebmAv1;

    @pmi0("failover_host")
    private final String failoverHost;

    @pmi0("hls")
    private final String hls;

    @pmi0("hls_fmp4")
    private final String hlsFmp4;

    @pmi0("mp4_1080")
    private final String mp41080;

    @pmi0("mp4_144")
    private final String mp4144;

    @pmi0("mp4_1440")
    private final String mp41440;

    @pmi0("mp4_2160")
    private final String mp42160;

    @pmi0("mp4_240")
    private final String mp4240;

    @pmi0("mp4_360")
    private final String mp4360;

    @pmi0("mp4_480")
    private final String mp4480;

    @pmi0("mp4_720")
    private final String mp4720;

    @pmi0("src")
    private final String src;

    /* compiled from: ShortVideoShortVideoFilesDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoFilesDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoFilesDto createFromParcel(Parcel parcel) {
            return new ShortVideoShortVideoFilesDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoFilesDto[] newArray(int i) {
            return new ShortVideoShortVideoFilesDto[i];
        }
    }

    public ShortVideoShortVideoFilesDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public final String K5() {
        return this.failoverHost;
    }

    public final String d() {
        return this.dashSep;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.dashWebm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoFilesDto)) {
            return false;
        }
        ShortVideoShortVideoFilesDto shortVideoShortVideoFilesDto = (ShortVideoShortVideoFilesDto) obj;
        return epx.f(this.src, shortVideoShortVideoFilesDto.src) && epx.f(this.mp4144, shortVideoShortVideoFilesDto.mp4144) && epx.f(this.mp4240, shortVideoShortVideoFilesDto.mp4240) && epx.f(this.mp4360, shortVideoShortVideoFilesDto.mp4360) && epx.f(this.mp4480, shortVideoShortVideoFilesDto.mp4480) && epx.f(this.mp4720, shortVideoShortVideoFilesDto.mp4720) && epx.f(this.mp41080, shortVideoShortVideoFilesDto.mp41080) && epx.f(this.mp41440, shortVideoShortVideoFilesDto.mp41440) && epx.f(this.mp42160, shortVideoShortVideoFilesDto.mp42160) && epx.f(this.hls, shortVideoShortVideoFilesDto.hls) && epx.f(this.dashUni, shortVideoShortVideoFilesDto.dashUni) && epx.f(this.dashSep, shortVideoShortVideoFilesDto.dashSep) && epx.f(this.dashWebm, shortVideoShortVideoFilesDto.dashWebm) && epx.f(this.dashHevc, shortVideoShortVideoFilesDto.dashHevc) && epx.f(this.dashWebmAv1, shortVideoShortVideoFilesDto.dashWebmAv1) && epx.f(this.hlsFmp4, shortVideoShortVideoFilesDto.hlsFmp4) && epx.f(this.failoverHost, shortVideoShortVideoFilesDto.failoverHost);
    }

    public final String f() {
        return this.dashWebmAv1;
    }

    public final String g() {
        return this.hls;
    }

    public final int hashCode() {
        String str = this.src;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mp4144;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mp4240;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mp4360;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mp4480;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mp4720;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mp41080;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.mp41440;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.mp42160;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.hls;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.dashUni;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.dashSep;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.dashWebm;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.dashHevc;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.dashWebmAv1;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.hlsFmp4;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.failoverHost;
        return hashCode16 + (str17 != null ? str17.hashCode() : 0);
    }

    public final String i() {
        return this.mp41080;
    }

    public final String j() {
        return this.mp41440;
    }

    public final String k() {
        return this.mp42160;
    }

    public final String l() {
        return this.mp4240;
    }

    public final String n() {
        return this.mp4360;
    }

    public final String o() {
        return this.mp4480;
    }

    public final String p() {
        return this.mp4720;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoFilesDto(src=");
        sb.append(this.src);
        sb.append(", mp4144=");
        sb.append(this.mp4144);
        sb.append(", mp4240=");
        sb.append(this.mp4240);
        sb.append(", mp4360=");
        sb.append(this.mp4360);
        sb.append(", mp4480=");
        sb.append(this.mp4480);
        sb.append(", mp4720=");
        sb.append(this.mp4720);
        sb.append(", mp41080=");
        sb.append(this.mp41080);
        sb.append(", mp41440=");
        sb.append(this.mp41440);
        sb.append(", mp42160=");
        sb.append(this.mp42160);
        sb.append(", hls=");
        sb.append(this.hls);
        sb.append(", dashUni=");
        sb.append(this.dashUni);
        sb.append(", dashSep=");
        sb.append(this.dashSep);
        sb.append(", dashWebm=");
        sb.append(this.dashWebm);
        sb.append(", dashHevc=");
        sb.append(this.dashHevc);
        sb.append(", dashWebmAv1=");
        sb.append(this.dashWebmAv1);
        sb.append(", hlsFmp4=");
        sb.append(this.hlsFmp4);
        sb.append(", failoverHost=");
        return ho8.a(sb, this.failoverHost, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.src);
        parcel.writeString(this.mp4144);
        parcel.writeString(this.mp4240);
        parcel.writeString(this.mp4360);
        parcel.writeString(this.mp4480);
        parcel.writeString(this.mp4720);
        parcel.writeString(this.mp41080);
        parcel.writeString(this.mp41440);
        parcel.writeString(this.mp42160);
        parcel.writeString(this.hls);
        parcel.writeString(this.dashUni);
        parcel.writeString(this.dashSep);
        parcel.writeString(this.dashWebm);
        parcel.writeString(this.dashHevc);
        parcel.writeString(this.dashWebmAv1);
        parcel.writeString(this.hlsFmp4);
        parcel.writeString(this.failoverHost);
    }

    public ShortVideoShortVideoFilesDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.src = str;
        this.mp4144 = str2;
        this.mp4240 = str3;
        this.mp4360 = str4;
        this.mp4480 = str5;
        this.mp4720 = str6;
        this.mp41080 = str7;
        this.mp41440 = str8;
        this.mp42160 = str9;
        this.hls = str10;
        this.dashUni = str11;
        this.dashSep = str12;
        this.dashWebm = str13;
        this.dashHevc = str14;
        this.dashWebmAv1 = str15;
        this.hlsFmp4 = str16;
        this.failoverHost = str17;
    }

    public /* synthetic */ ShortVideoShortVideoFilesDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17);
    }
}
