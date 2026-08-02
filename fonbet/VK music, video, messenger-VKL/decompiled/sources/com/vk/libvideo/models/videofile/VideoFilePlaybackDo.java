package com.vk.libvideo.models.videofile;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.v11;

/* compiled from: VideoFilePlaybackDo.kt */
/* loaded from: classes3.dex */
public final class VideoFilePlaybackDo implements Parcelable {
    public static final Parcelable.Creator<VideoFilePlaybackDo> CREATOR = new a();
    public final VideoTypeDo b;
    public final boolean c;
    public final LivePlayBackSettingsDo d;
    public final String e;
    public final VideoUrlStorageDo f;
    public final VideoUrlStorageDo g;
    public final boolean h;
    public final float i;
    public final long j;
    public final int k;
    public final int l;
    public final boolean m;
    public final long n;
    public final int o;
    public final String p;
    public final String q;
    public final String r;
    public final Map<PixelEventDo, StatPixelListDo> s;
    public final boolean t;
    public final String u;
    public final TimelineThumbsDo v;

    /* compiled from: VideoFilePlaybackDo.kt */
    public static final class a implements Parcelable.Creator<VideoFilePlaybackDo> {
        @Override // android.os.Parcelable.Creator
        public final VideoFilePlaybackDo createFromParcel(Parcel parcel) {
            boolean z;
            TimelineThumbsDo timelineThumbsDo;
            VideoUrlStorageDo videoUrlStorageDo;
            boolean z2;
            TimelineThumbsDo timelineThumbsDo2;
            boolean z3;
            VideoTypeDo valueOf = VideoTypeDo.valueOf(parcel.readString());
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z4 = false;
            }
            LivePlayBackSettingsDo createFromParcel = parcel.readInt() == 0 ? null : LivePlayBackSettingsDo.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            Parcelable.Creator<VideoUrlStorageDo> creator = VideoUrlStorageDo.CREATOR;
            VideoUrlStorageDo createFromParcel2 = creator.createFromParcel(parcel);
            VideoUrlStorageDo createFromParcel3 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                timelineThumbsDo = null;
                videoUrlStorageDo = createFromParcel2;
                z2 = z;
            } else {
                timelineThumbsDo = null;
                videoUrlStorageDo = createFromParcel2;
                z2 = false;
            }
            float readFloat = parcel.readFloat();
            TimelineThumbsDo timelineThumbsDo3 = timelineThumbsDo;
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                timelineThumbsDo2 = timelineThumbsDo3;
                z3 = z;
            } else {
                timelineThumbsDo2 = timelineThumbsDo3;
                z3 = false;
            }
            long readLong2 = parcel.readLong();
            TimelineThumbsDo timelineThumbsDo4 = timelineThumbsDo2;
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt4 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt4);
            int i = 0;
            while (i != readInt4) {
                linkedHashMap.put(PixelEventDo.CREATOR.createFromParcel(parcel), StatPixelListDo.CREATOR.createFromParcel(parcel));
                i++;
                readInt4 = readInt4;
            }
            return new VideoFilePlaybackDo(valueOf, z4, createFromParcel, readString, videoUrlStorageDo, createFromParcel3, z2, readFloat, readLong, readInt, readInt2, z3, readLong2, readInt3, readString2, readString3, readString4, linkedHashMap, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? timelineThumbsDo4 : TimelineThumbsDo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoFilePlaybackDo[] newArray(int i) {
            return new VideoFilePlaybackDo[i];
        }
    }

    public VideoFilePlaybackDo(VideoTypeDo videoTypeDo, boolean z, LivePlayBackSettingsDo livePlayBackSettingsDo, String str, VideoUrlStorageDo videoUrlStorageDo, VideoUrlStorageDo videoUrlStorageDo2, boolean z2, float f, long j, int i, int i2, boolean z3, long j2, int i3, String str2, String str3, String str4, Map<PixelEventDo, StatPixelListDo> map, boolean z4, String str5, TimelineThumbsDo timelineThumbsDo) {
        this.b = videoTypeDo;
        this.c = z;
        this.d = livePlayBackSettingsDo;
        this.e = str;
        this.f = videoUrlStorageDo;
        this.g = videoUrlStorageDo2;
        this.h = z2;
        this.i = f;
        this.j = j;
        this.k = i;
        this.l = i2;
        this.m = z3;
        this.n = j2;
        this.o = i3;
        this.p = str2;
        this.q = str3;
        this.r = str4;
        this.s = map;
        this.t = z4;
        this.u = str5;
        this.v = timelineThumbsDo;
    }

    public final boolean A1() {
        return this.c;
    }

    public final String K5() {
        return this.r;
    }

    public final boolean M5() {
        return this.m;
    }

    public final boolean Sa() {
        return this.h;
    }

    public final String Y6() {
        return this.p;
    }

    public final long d() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final LivePlayBackSettingsDo e() {
        return this.d;
    }

    public final Map<PixelEventDo, StatPixelListDo> e0() {
        return this.s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoFilePlaybackDo)) {
            return false;
        }
        VideoFilePlaybackDo videoFilePlaybackDo = (VideoFilePlaybackDo) obj;
        return this.b == videoFilePlaybackDo.b && this.c == videoFilePlaybackDo.c && epx.f(this.d, videoFilePlaybackDo.d) && epx.f(this.e, videoFilePlaybackDo.e) && epx.f(this.f, videoFilePlaybackDo.f) && epx.f(this.g, videoFilePlaybackDo.g) && this.h == videoFilePlaybackDo.h && Float.compare(this.i, videoFilePlaybackDo.i) == 0 && this.j == videoFilePlaybackDo.j && this.k == videoFilePlaybackDo.k && this.l == videoFilePlaybackDo.l && this.m == videoFilePlaybackDo.m && this.n == videoFilePlaybackDo.n && this.o == videoFilePlaybackDo.o && epx.f(this.p, videoFilePlaybackDo.p) && epx.f(this.q, videoFilePlaybackDo.q) && epx.f(this.r, videoFilePlaybackDo.r) && epx.f(this.s, videoFilePlaybackDo.s) && this.t == videoFilePlaybackDo.t && epx.f(this.u, videoFilePlaybackDo.u) && epx.f(this.v, videoFilePlaybackDo.v);
    }

    public final long f() {
        return this.n;
    }

    public final String g() {
        return this.e;
    }

    public final int getHeight() {
        return this.l;
    }

    public final int getWidth() {
        return this.k;
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        LivePlayBackSettingsDo livePlayBackSettingsDo = this.d;
        int a2 = v11.a(urd0.a((b + (livePlayBackSettingsDo == null ? 0 : livePlayBackSettingsDo.hashCode())) * 31, 31, this.e), 31, this.f.b);
        VideoUrlStorageDo videoUrlStorageDo = this.g;
        int a3 = shy.a(this.o, bh10.a(qoy.b(shy.a(this.l, shy.a(this.k, bh10.a(b.a(this.i, qoy.b((a2 + (videoUrlStorageDo == null ? 0 : videoUrlStorageDo.b.hashCode())) * 31, 31, this.h), 31), 31, this.j), 31), 31), 31, this.m), 31, this.n), 31);
        String str = this.p;
        int a4 = urd0.a((a3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.q);
        String str2 = this.r;
        int b2 = qoy.b(v11.a((a4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.s), 31, this.t);
        String str3 = this.u;
        int hashCode = (b2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TimelineThumbsDo timelineThumbsDo = this.v;
        return hashCode + (timelineThumbsDo != null ? timelineThumbsDo.hashCode() : 0);
    }

    public final VideoTypeDo i() {
        return this.b;
    }

    public final VideoUrlStorageDo j() {
        return this.f;
    }

    public final float n5() {
        return this.i;
    }

    public final int o0() {
        return this.o;
    }

    public final String r() {
        return this.u;
    }

    public final String toString() {
        return "VideoFilePlaybackDo(videoType=" + this.b + ", isMobileLive=" + this.c + ", liveOutBackSettings=" + this.d + ", uniqueKey=" + this.e + ", videoUrlStorage=" + this.f + ", trailerUrlStorage=" + this.g + ", isMessage=" + this.h + ", volumeMultiplier=" + this.i + ", durationMs=" + this.j + ", width=" + this.k + ", height=" + this.l + ", repeat=" + this.m + ", oid=" + this.n + ", vid=" + this.o + ", ovid=" + this.p + ", statsPlace=" + this.q + ", failoverHost=" + this.r + ", pixels=" + this.s + ", ads=" + this.t + ", trackCode=" + this.u + ", timelineThumbs=" + this.v + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
        LivePlayBackSettingsDo livePlayBackSettingsDo = this.d;
        if (livePlayBackSettingsDo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            livePlayBackSettingsDo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.e);
        this.f.writeToParcel(parcel, i);
        VideoUrlStorageDo videoUrlStorageDo = this.g;
        if (videoUrlStorageDo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoUrlStorageDo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeFloat(this.i);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeLong(this.n);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        Map<PixelEventDo, StatPixelListDo> map = this.s;
        parcel.writeInt(map.size());
        for (Map.Entry<PixelEventDo, StatPixelListDo> entry : map.entrySet()) {
            parcel.writeString(entry.getKey().b);
            entry.getValue().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.u);
        TimelineThumbsDo timelineThumbsDo = this.v;
        if (timelineThumbsDo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timelineThumbsDo.writeToParcel(parcel, i);
        }
    }

    public final String x8() {
        return this.q;
    }
}
