package com.vk.dto.clips.upload;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.ao;
import xsna.bh10;
import xsna.bxx;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.s3q0;
import xsna.sn;
import xsna.tn;
import xsna.vu5;
import xsna.w9y;
import xsna.zcl;

/* compiled from: ClipTemplateInfo.kt */
/* loaded from: classes18.dex */
public final class ClipTemplateInfo implements Parcelable, bxx {
    public static final Parcelable.Creator<ClipTemplateInfo> CREATOR = new a();
    public final List<VideoFragment> b;
    public final List<AudioFragment> c;
    public final Boolean d;

    /* compiled from: ClipTemplateInfo.kt */
    public static final class AudioFragment implements Parcelable, bxx {
        public static final Parcelable.Creator<AudioFragment> CREATOR = new a();
        public final long b;
        public final long c;
        public final long d;
        public final String e;

        /* compiled from: ClipTemplateInfo.kt */
        public static final class a implements Parcelable.Creator<AudioFragment> {
            @Override // android.os.Parcelable.Creator
            public final AudioFragment createFromParcel(Parcel parcel) {
                return new AudioFragment(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AudioFragment[] newArray(int i) {
                return new AudioFragment[i];
            }
        }

        public AudioFragment(long j, long j2, long j3, String str) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            w9y w9yVar = new w9y();
            w9yVar.d(Long.valueOf(this.b), "start");
            w9yVar.d(Long.valueOf(this.c), TtmlNode.END);
            w9yVar.d(Long.valueOf(this.d), "audio_offset");
            w9yVar.e(this.e, "audio_raw_id");
            s3q0 s3q0Var = s3q0.a;
            return w9yVar.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFragment)) {
                return false;
            }
            AudioFragment audioFragment = (AudioFragment) obj;
            return this.b == audioFragment.b && this.c == audioFragment.c && this.d == audioFragment.d && epx.f(this.e, audioFragment.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + bh10.a(bh10.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFragment(startMs=");
            sb.append(this.b);
            sb.append(", endMs=");
            sb.append(this.c);
            sb.append(", audioOffset=");
            sb.append(this.d);
            sb.append(", audioId=");
            return ho8.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(this.d);
            parcel.writeString(this.e);
        }
    }

    /* compiled from: ClipTemplateInfo.kt */
    public static final class VideoFragment implements Parcelable, bxx {
        public static final Parcelable.Creator<VideoFragment> CREATOR = new a();
        public final long b;
        public final long c;

        /* compiled from: ClipTemplateInfo.kt */
        public static final class a implements Parcelable.Creator<VideoFragment> {
            @Override // android.os.Parcelable.Creator
            public final VideoFragment createFromParcel(Parcel parcel) {
                return new VideoFragment(parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final VideoFragment[] newArray(int i) {
                return new VideoFragment[i];
            }
        }

        public VideoFragment(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            w9y w9yVar = new w9y();
            w9yVar.d(Long.valueOf(this.b), "start");
            w9yVar.d(Long.valueOf(this.c), TtmlNode.END);
            s3q0 s3q0Var = s3q0.a;
            return w9yVar.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoFragment)) {
                return false;
            }
            VideoFragment videoFragment = (VideoFragment) obj;
            return this.b == videoFragment.b && this.c == videoFragment.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoFragment(startMs=");
            sb.append(this.b);
            sb.append(", endMs=");
            return vu5.a(')', this.c, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }
    }

    /* compiled from: ClipTemplateInfo.kt */
    public static final class a implements Parcelable.Creator<ClipTemplateInfo> {
        @Override // android.os.Parcelable.Creator
        public final ClipTemplateInfo createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoFragment.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(AudioFragment.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ClipTemplateInfo(arrayList, arrayList2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipTemplateInfo[] newArray(int i) {
            return new ClipTemplateInfo[i];
        }
    }

    public ClipTemplateInfo(List<VideoFragment> list, List<AudioFragment> list2, Boolean bool) {
        this.b = list;
        this.c = list2;
        this.d = bool;
    }

    public static ClipTemplateInfo a(ClipTemplateInfo clipTemplateInfo, Boolean bool) {
        return new ClipTemplateInfo(clipTemplateInfo.b, clipTemplateInfo.c, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.c, "audio_fragments");
        w9yVar.e(this.b, "video_fragments");
        w9yVar.b(this.d, "user_agreement");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipTemplateInfo)) {
            return false;
        }
        ClipTemplateInfo clipTemplateInfo = (ClipTemplateInfo) obj;
        return epx.f(this.b, clipTemplateInfo.b) && epx.f(this.c, clipTemplateInfo.c) && epx.f(this.d, clipTemplateInfo.d);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.b.hashCode() * 31, 31, this.c);
        Boolean bool = this.d;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipTemplateInfo(videoFragments=");
        sb.append(this.b);
        sb.append(", audioFragments=");
        sb.append(this.c);
        sb.append(", userAgreement=");
        return tn.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((VideoFragment) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.c);
        while (a3.hasNext()) {
            ((AudioFragment) a3.next()).writeToParcel(parcel, i);
        }
        Boolean bool = this.d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ ClipTemplateInfo(List list, List list2, Boolean bool, int i, zcl zclVar) {
        this(list, list2, (i & 4) != 0 ? null : bool);
    }
}
