package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.D1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoVideoFilesDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoFilesDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoFilesDto> CREATOR = new a();

    @pmi0("cmaf")
    private final String cmaf;

    @pmi0("dash_hevc")
    private final String dashHevc;

    @pmi0("dash_live")
    private final String dashLive;

    @pmi0("dash_live_playback")
    private final String dashLivePlayback;

    @pmi0("dash_ondemand")
    private final String dashOndemand;

    @pmi0("dash_sep")
    private final String dashSep;

    @pmi0("dash_streams")
    private final String dashStreams;

    @pmi0("dash_uni")
    private final String dashUni;

    @pmi0("dash_webm")
    private final String dashWebm;

    @pmi0("dash_webm_av1")
    private final String dashWebmAv1;

    @pmi0(D1.e)
    private final String external;

    @pmi0("failover_host")
    private final String failoverHost;

    @pmi0("flv_320")
    private final String flv320;

    @pmi0("hls")
    private final String hls;

    @pmi0("hls_fmp4")
    private final String hlsFmp4;

    @pmi0("hls_live")
    private final String hlsLive;

    @pmi0("hls_live_ondemand")
    private final String hlsLiveOndemand;

    @pmi0("hls_live_playback")
    private final String hlsLivePlayback;

    @pmi0("hls_ondemand")
    private final String hlsOndemand;

    @pmi0("hls_streams")
    private final String hlsStreams;

    @pmi0("live")
    private final String live;

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

    @pmi0("okmp_rtmp")
    private final String okmpRtmp;

    @pmi0("rtmp")
    private final String rtmp;

    @pmi0("src")
    private final String src;

    @pmi0("united_migration_location")
    private final String unitedMigrationLocation;

    @pmi0("united_migration_size")
    private final Integer unitedMigrationSize;

    @pmi0("ws")
    private final String ws;

    /* compiled from: VideoVideoFilesDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoFilesDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoFilesDto createFromParcel(Parcel parcel) {
            return new VideoVideoFilesDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoFilesDto[] newArray(int i) {
            return new VideoVideoFilesDto[i];
        }
    }

    public VideoVideoFilesDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }

    public final String B() {
        return this.hlsOndemand;
    }

    public final String C() {
        return this.live;
    }

    public final String D() {
        return this.mp41080;
    }

    public final String F() {
        return this.mp41440;
    }

    public final String G() {
        return this.mp42160;
    }

    public final String K() {
        return this.mp4240;
    }

    public final String K5() {
        return this.failoverHost;
    }

    public final String M() {
        return this.mp4360;
    }

    public final String R() {
        return this.mp4480;
    }

    public final String T() {
        return this.mp4720;
    }

    public final String W() {
        return this.okmpRtmp;
    }

    public final String Z() {
        return this.rtmp;
    }

    public final String a0() {
        return this.src;
    }

    public final String d() {
        return this.cmaf;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.dashOndemand;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoFilesDto)) {
            return false;
        }
        VideoVideoFilesDto videoVideoFilesDto = (VideoVideoFilesDto) obj;
        return epx.f(this.external, videoVideoFilesDto.external) && epx.f(this.mp4144, videoVideoFilesDto.mp4144) && epx.f(this.mp4240, videoVideoFilesDto.mp4240) && epx.f(this.mp4360, videoVideoFilesDto.mp4360) && epx.f(this.mp4480, videoVideoFilesDto.mp4480) && epx.f(this.mp4720, videoVideoFilesDto.mp4720) && epx.f(this.mp41080, videoVideoFilesDto.mp41080) && epx.f(this.mp41440, videoVideoFilesDto.mp41440) && epx.f(this.mp42160, videoVideoFilesDto.mp42160) && epx.f(this.flv320, videoVideoFilesDto.flv320) && epx.f(this.src, videoVideoFilesDto.src) && epx.f(this.live, videoVideoFilesDto.live) && epx.f(this.hls, videoVideoFilesDto.hls) && epx.f(this.rtmp, videoVideoFilesDto.rtmp) && epx.f(this.okmpRtmp, videoVideoFilesDto.okmpRtmp) && epx.f(this.ws, videoVideoFilesDto.ws) && epx.f(this.cmaf, videoVideoFilesDto.cmaf) && epx.f(this.dashUni, videoVideoFilesDto.dashUni) && epx.f(this.dashSep, videoVideoFilesDto.dashSep) && epx.f(this.dashWebm, videoVideoFilesDto.dashWebm) && epx.f(this.dashHevc, videoVideoFilesDto.dashHevc) && epx.f(this.dashWebmAv1, videoVideoFilesDto.dashWebmAv1) && epx.f(this.dashStreams, videoVideoFilesDto.dashStreams) && epx.f(this.hlsStreams, videoVideoFilesDto.hlsStreams) && epx.f(this.hlsLive, videoVideoFilesDto.hlsLive) && epx.f(this.hlsLivePlayback, videoVideoFilesDto.hlsLivePlayback) && epx.f(this.hlsLiveOndemand, videoVideoFilesDto.hlsLiveOndemand) && epx.f(this.dashLive, videoVideoFilesDto.dashLive) && epx.f(this.dashLivePlayback, videoVideoFilesDto.dashLivePlayback) && epx.f(this.hlsOndemand, videoVideoFilesDto.hlsOndemand) && epx.f(this.dashOndemand, videoVideoFilesDto.dashOndemand) && epx.f(this.hlsFmp4, videoVideoFilesDto.hlsFmp4) && epx.f(this.failoverHost, videoVideoFilesDto.failoverHost) && epx.f(this.unitedMigrationLocation, videoVideoFilesDto.unitedMigrationLocation) && epx.f(this.unitedMigrationSize, videoVideoFilesDto.unitedMigrationSize);
    }

    public final String f() {
        return this.dashSep;
    }

    public final String g() {
        return this.dashStreams;
    }

    public final int hashCode() {
        String str = this.external;
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
        String str10 = this.flv320;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.src;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.live;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.hls;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.rtmp;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.okmpRtmp;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.ws;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.cmaf;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.dashUni;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.dashSep;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.dashWebm;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.dashHevc;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.dashWebmAv1;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.dashStreams;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.hlsStreams;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.hlsLive;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.hlsLivePlayback;
        int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.hlsLiveOndemand;
        int hashCode27 = (hashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.dashLive;
        int hashCode28 = (hashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.dashLivePlayback;
        int hashCode29 = (hashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.hlsOndemand;
        int hashCode30 = (hashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.dashOndemand;
        int hashCode31 = (hashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.hlsFmp4;
        int hashCode32 = (hashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.failoverHost;
        int hashCode33 = (hashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.unitedMigrationLocation;
        int hashCode34 = (hashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        Integer num = this.unitedMigrationSize;
        return hashCode34 + (num != null ? num.hashCode() : 0);
    }

    public final String i() {
        return this.dashWebm;
    }

    public final String j() {
        return this.dashWebmAv1;
    }

    public final String k() {
        return this.external;
    }

    public final String l() {
        return this.hls;
    }

    public final String n() {
        return this.hlsFmp4;
    }

    public final String o() {
        return this.hlsLive;
    }

    public final String p() {
        return this.hlsLiveOndemand;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoFilesDto(external=");
        sb.append(this.external);
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
        sb.append(", flv320=");
        sb.append(this.flv320);
        sb.append(", src=");
        sb.append(this.src);
        sb.append(", live=");
        sb.append(this.live);
        sb.append(", hls=");
        sb.append(this.hls);
        sb.append(", rtmp=");
        sb.append(this.rtmp);
        sb.append(", okmpRtmp=");
        sb.append(this.okmpRtmp);
        sb.append(", ws=");
        sb.append(this.ws);
        sb.append(", cmaf=");
        sb.append(this.cmaf);
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
        sb.append(", dashStreams=");
        sb.append(this.dashStreams);
        sb.append(", hlsStreams=");
        sb.append(this.hlsStreams);
        sb.append(", hlsLive=");
        sb.append(this.hlsLive);
        sb.append(", hlsLivePlayback=");
        sb.append(this.hlsLivePlayback);
        sb.append(", hlsLiveOndemand=");
        sb.append(this.hlsLiveOndemand);
        sb.append(", dashLive=");
        sb.append(this.dashLive);
        sb.append(", dashLivePlayback=");
        sb.append(this.dashLivePlayback);
        sb.append(", hlsOndemand=");
        sb.append(this.hlsOndemand);
        sb.append(", dashOndemand=");
        sb.append(this.dashOndemand);
        sb.append(", hlsFmp4=");
        sb.append(this.hlsFmp4);
        sb.append(", failoverHost=");
        sb.append(this.failoverHost);
        sb.append(", unitedMigrationLocation=");
        sb.append(this.unitedMigrationLocation);
        sb.append(", unitedMigrationSize=");
        return uqi.b(sb, this.unitedMigrationSize, ')');
    }

    public final String u() {
        return this.hlsLivePlayback;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.external);
        parcel.writeString(this.mp4144);
        parcel.writeString(this.mp4240);
        parcel.writeString(this.mp4360);
        parcel.writeString(this.mp4480);
        parcel.writeString(this.mp4720);
        parcel.writeString(this.mp41080);
        parcel.writeString(this.mp41440);
        parcel.writeString(this.mp42160);
        parcel.writeString(this.flv320);
        parcel.writeString(this.src);
        parcel.writeString(this.live);
        parcel.writeString(this.hls);
        parcel.writeString(this.rtmp);
        parcel.writeString(this.okmpRtmp);
        parcel.writeString(this.ws);
        parcel.writeString(this.cmaf);
        parcel.writeString(this.dashUni);
        parcel.writeString(this.dashSep);
        parcel.writeString(this.dashWebm);
        parcel.writeString(this.dashHevc);
        parcel.writeString(this.dashWebmAv1);
        parcel.writeString(this.dashStreams);
        parcel.writeString(this.hlsStreams);
        parcel.writeString(this.hlsLive);
        parcel.writeString(this.hlsLivePlayback);
        parcel.writeString(this.hlsLiveOndemand);
        parcel.writeString(this.dashLive);
        parcel.writeString(this.dashLivePlayback);
        parcel.writeString(this.hlsOndemand);
        parcel.writeString(this.dashOndemand);
        parcel.writeString(this.hlsFmp4);
        parcel.writeString(this.failoverHost);
        parcel.writeString(this.unitedMigrationLocation);
        Integer num = this.unitedMigrationSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public VideoVideoFilesDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, Integer num) {
        this.external = str;
        this.mp4144 = str2;
        this.mp4240 = str3;
        this.mp4360 = str4;
        this.mp4480 = str5;
        this.mp4720 = str6;
        this.mp41080 = str7;
        this.mp41440 = str8;
        this.mp42160 = str9;
        this.flv320 = str10;
        this.src = str11;
        this.live = str12;
        this.hls = str13;
        this.rtmp = str14;
        this.okmpRtmp = str15;
        this.ws = str16;
        this.cmaf = str17;
        this.dashUni = str18;
        this.dashSep = str19;
        this.dashWebm = str20;
        this.dashHevc = str21;
        this.dashWebmAv1 = str22;
        this.dashStreams = str23;
        this.hlsStreams = str24;
        this.hlsLive = str25;
        this.hlsLivePlayback = str26;
        this.hlsLiveOndemand = str27;
        this.dashLive = str28;
        this.dashLivePlayback = str29;
        this.hlsOndemand = str30;
        this.dashOndemand = str31;
        this.hlsFmp4 = str32;
        this.failoverHost = str33;
        this.unitedMigrationLocation = str34;
        this.unitedMigrationSize = num;
    }

    public /* synthetic */ VideoVideoFilesDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, Integer num, int i, int i2, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str25, (i & 33554432) != 0 ? null : str26, (i & 67108864) != 0 ? null : str27, (i & 134217728) != 0 ? null : str28, (i & 268435456) != 0 ? null : str29, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str30, (i & 1073741824) != 0 ? null : str31, (i & Integer.MIN_VALUE) != 0 ? null : str32, (i2 & 1) != 0 ? null : str33, (i2 & 2) != 0 ? null : str34, (i2 & 4) != 0 ? null : num);
    }
}
