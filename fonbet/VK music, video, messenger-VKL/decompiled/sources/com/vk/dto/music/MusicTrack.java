package com.vk.dto.music;

import android.os.Bundle;
import android.os.Parcel;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.C4583ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Episode;
import com.vk.dto.music.NftAudio;
import com.vk.dto.music.article.ArticleTtsInfo;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.chart.ChartInfo;
import com.vk.dto.music.moosic.MoosicAudio;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bpn0;
import xsna.bxx;
import xsna.d370;
import xsna.da50;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.nly;
import xsna.p010;
import xsna.r11;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MusicTrack.kt */
/* loaded from: classes18.dex */
public final class MusicTrack extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<MusicTrack> CREATOR = new c();
    public static final b e0 = new b();
    public int A;
    public boolean B;
    public final long C;
    public final ChartInfo D;
    public final boolean E;
    public boolean F;
    public final boolean G;
    public final ExternalAudio H;
    public AssistantData I;
    public final DownloadingState J;
    public final String K;
    public boolean L;
    public boolean M;
    public int N;
    public final AudioBookChapter O;
    public boolean P;
    public int Q;
    public boolean R;
    public final String S;
    public final Thumb T;
    public boolean U;
    public final int V;
    public MoosicAudio W;
    public final boolean X;
    public final MusicPreviewUrl Y;
    public final String Z;
    public final AudioLoudness a0;
    public int b;
    public final bpn0 b0;
    public UserId c;
    public final int c0;
    public String d;
    public Integer d0;
    public String e;
    public int f;
    public int g;
    public String h;
    public String i;
    public final List<AudioStream> j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public String o;
    public final boolean p;
    public final AlbumLink q;
    public String r;
    public boolean s;
    public final List<Artist> t;
    public final List<Artist> u;
    public Bundle v;
    public Episode w;
    public NftAudio x;
    public String y;
    public long z;

    /* compiled from: MusicTrack.kt */
    public static final class AssistantData implements Serializer.StreamParcelable {
        public static final Serializer.c<AssistantData> CREATOR = new b();
        public final List<List<Float>> b;
        public final Long c;
        public final String d;
        public final String e;

        /* compiled from: MusicTrack.kt */
        public static final class a {
            public static AssistantData a(JSONObject jSONObject) {
                ArrayList arrayList;
                JSONArray optJSONArray = jSONObject.optJSONArray("kws_skip");
                if (optJSONArray != null) {
                    arrayList = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONArray jSONArray = optJSONArray.getJSONArray(i);
                        ArrayList arrayList2 = new ArrayList(jSONArray.length());
                        int length2 = jSONArray.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            arrayList2.add(Float.valueOf((float) jSONArray.getDouble(i2)));
                        }
                        arrayList.add(arrayList2);
                    }
                } else {
                    arrayList = null;
                }
                Long z = f370.z(jSONObject, "track_id");
                String optString = jSONObject.optString("flags");
                JSONObject optJSONObject = jSONObject.optJSONObject("source");
                return new AssistantData(arrayList, z, optString, optJSONObject != null ? optJSONObject.toString() : null);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<AssistantData> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.vk.core.serialize.Serializer.c
            public final AssistantData a(Serializer serializer) {
                ArrayList arrayList;
                ArrayList arrayList2 = null;
                Object[] objArr = 0;
                try {
                    int u = serializer.u();
                    if (u >= 0) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i = 0; i < u; i++) {
                            try {
                                int u2 = serializer.u();
                                if (u2 >= 0) {
                                    arrayList = new ArrayList();
                                    for (int i2 = 0; i2 < u2; i2++) {
                                        arrayList.add(Float.valueOf(serializer.s()));
                                    }
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    arrayList3.add(arrayList);
                                }
                            } catch (Throwable th) {
                                if (th instanceof Serializer.DeserializationError) {
                                    throw th;
                                }
                                throw new Serializer.DeserializationError(null, th);
                            }
                        }
                        arrayList2 = arrayList3;
                    }
                    return new AssistantData(arrayList2, serializer.x(), serializer.H(), serializer.H());
                } finally {
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssistantData[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AssistantData(List<? extends List<Float>> list, Long l, String str, String str2) {
            this.b = list;
            this.c = l;
            this.d = str;
            this.e = str2;
            new bpn0(new da50(this, 0));
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            List<List<Float>> list = this.b;
            if (list == null) {
                serializer.S(-1);
            } else {
                serializer.S(list.size());
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    serializer.Q((List) it.next());
                }
            }
            serializer.b0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssistantData)) {
                return false;
            }
            AssistantData assistantData = (AssistantData) obj;
            return epx.f(this.b, assistantData.b) && epx.f(this.c, assistantData.c) && epx.f(this.d, assistantData.d) && epx.f(this.e, assistantData.e);
        }

        public final int hashCode() {
            List<List<Float>> list = this.b;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Long l = this.c;
            int a2 = urd0.a((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.d);
            String str = this.e;
            return a2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AssistantData(kwsSkip=");
            sb.append(this.b);
            sb.append(", trackId=");
            sb.append(this.c);
            sb.append(", flags=");
            sb.append(this.d);
            sb.append(", sourceJson=");
            return ho8.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: MusicTrack.kt */
    public static final class a {
        public static String a(int i, UserId userId) {
            return r11.b(new StringBuilder(), userId.b, '_', i);
        }

        public static String b(int i, UserId userId, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(userId.b);
            sb.append('_');
            sb.append(i);
            sb.append(str != null ? BundleUtil.UNDERLINE_TAG.concat(str) : "");
            return sb.toString();
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<MusicTrack> {
        @Override // xsna.aay
        public final MusicTrack a(JSONObject jSONObject) {
            return new MusicTrack(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<MusicTrack> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicTrack a(Serializer serializer) {
            return new MusicTrack(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicTrack[i];
        }
    }

    public MusicTrack() {
        this(0, null, null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -1, 1048575, null);
    }

    public static int Cb(List list) {
        int i = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Artist) it.next()).Cb()) {
                    i++;
                }
            }
        }
        return i;
    }

    public static MusicTrack zb(MusicTrack musicTrack, int i, UserId userId, int i2, int i3, String str, boolean z, Episode episode, DownloadingState downloadingState, boolean z2, boolean z3, Thumb thumb, MoosicAudio moosicAudio, AudioLoudness audioLoudness, int i4, int i5) {
        int i6 = (i4 & 1) != 0 ? musicTrack.b : i;
        UserId userId2 = (i4 & 2) != 0 ? musicTrack.c : userId;
        String str2 = musicTrack.d;
        String str3 = musicTrack.e;
        int i7 = (i4 & 16) != 0 ? musicTrack.f : i2;
        int i8 = (i4 & 32) != 0 ? musicTrack.g : i3;
        String str4 = musicTrack.h;
        String str5 = (i4 & 128) != 0 ? musicTrack.i : str;
        List<AudioStream> list = musicTrack.j;
        int i9 = musicTrack.k;
        boolean z4 = (i4 & 1024) != 0 ? musicTrack.l : z;
        boolean z5 = musicTrack.m;
        int i10 = musicTrack.n;
        String str6 = musicTrack.o;
        boolean z6 = musicTrack.p;
        AlbumLink albumLink = musicTrack.q;
        String str7 = musicTrack.r;
        boolean z7 = musicTrack.s;
        List<Artist> list2 = musicTrack.t;
        List<Artist> list3 = musicTrack.u;
        Bundle bundle = musicTrack.v;
        Episode episode2 = (i4 & 2097152) != 0 ? musicTrack.w : episode;
        NftAudio nftAudio = musicTrack.x;
        String str8 = musicTrack.y;
        long j = musicTrack.z;
        int i11 = musicTrack.A;
        boolean z8 = musicTrack.B;
        long j2 = musicTrack.C;
        ChartInfo chartInfo = musicTrack.D;
        boolean z9 = musicTrack.E;
        boolean z10 = musicTrack.F;
        boolean z11 = musicTrack.G;
        ExternalAudio externalAudio = musicTrack.H;
        AssistantData assistantData = musicTrack.I;
        DownloadingState downloadingState2 = (i5 & 4) != 0 ? musicTrack.J : downloadingState;
        String str9 = musicTrack.K;
        boolean z12 = musicTrack.L;
        boolean z13 = (i5 & 32) != 0 ? musicTrack.M : z2;
        int i12 = musicTrack.N;
        AudioBookChapter audioBookChapter = musicTrack.O;
        boolean z14 = (i5 & 256) != 0 ? musicTrack.P : z3;
        int i13 = musicTrack.Q;
        boolean z15 = musicTrack.R;
        String str10 = musicTrack.S;
        Thumb thumb2 = (i5 & 4096) != 0 ? musicTrack.T : thumb;
        boolean z16 = musicTrack.U;
        int i14 = musicTrack.V;
        MoosicAudio moosicAudio2 = (i5 & 32768) != 0 ? musicTrack.W : moosicAudio;
        boolean z17 = musicTrack.X;
        MusicPreviewUrl musicPreviewUrl = musicTrack.Y;
        String str11 = (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? musicTrack.Z : null;
        AudioLoudness audioLoudness2 = (524288 & i5) != 0 ? musicTrack.a0 : audioLoudness;
        musicTrack.getClass();
        return new MusicTrack(i6, userId2, str2, str3, i7, i8, str4, str5, list, i9, z4, z5, i10, str6, z6, albumLink, str7, z7, list2, list3, bundle, episode2, nftAudio, str8, j, i11, z8, j2, chartInfo, z9, z10, z11, externalAudio, assistantData, downloadingState2, str9, z12, z13, i12, audioBookChapter, z14, i13, z15, str10, thumb2, z16, i14, moosicAudio2, z17, musicPreviewUrl, str11, audioLoudness2);
    }

    public final MusicTrack Ab() {
        return zb(this, 0, null, 0, 0, null, false, null, null, false, false, null, null, null, -1, 1048575);
    }

    public final boolean B() {
        return this.g != 0;
    }

    public final int Bb() {
        return Cb(this.u) + Cb(this.t);
    }

    public final int Db() {
        return this.g;
    }

    public final int Eb() {
        return this.c0;
    }

    public final String Fb() {
        return a.a(this.b, this.c);
    }

    public final long Gb() {
        return (this.c.b << 32) | (this.b & 268435455);
    }

    public final String Hb() {
        String string;
        UserId userId = this.c;
        int i = this.b;
        Bundle bundle = this.v;
        return (bundle == null || (string = bundle.getString("contentId")) == null) ? a.a(i, userId) : string;
    }

    public final String Ib() {
        return a.b(this.b, this.c, this.r);
    }

    public final Thumb Jb() {
        Image image;
        Image image2;
        NftAudio nftAudio = this.x;
        if (nftAudio != null && (image2 = nftAudio.c) != null) {
            return new Thumb(image2);
        }
        Episode episode = this.w;
        if (episode != null && (image = episode.f) != null) {
            return new Thumb(image);
        }
        AlbumLink albumLink = this.q;
        Thumb thumb = albumLink != null ? albumLink.f : null;
        return thumb == null ? this.T : thumb;
    }

    public final String Kb(int i) {
        NftAudio nftAudio;
        Image image;
        Thumb thumb;
        if (Vb()) {
            Episode episode = this.w;
            if (episode != null) {
                image = episode.f;
            }
            image = null;
        } else {
            if (Ub() && (nftAudio = this.x) != null) {
                image = nftAudio.c;
            }
            image = null;
        }
        if (image != null) {
            ImageSize Cb = image.Cb(i, true, false);
            if (Cb != null) {
                return Cb.d.d;
            }
        } else {
            AlbumLink albumLink = this.q;
            if (albumLink != null && (thumb = albumLink.f) != null) {
                Serializer.c<Thumb> cVar = Thumb.CREATOR;
                String Ab = thumb.Ab(i, false);
                if (Ab != null) {
                    return Ab;
                }
            }
            Thumb thumb2 = this.T;
            if (thumb2 != null) {
                Serializer.c<Thumb> cVar2 = Thumb.CREATOR;
                return thumb2.Ab(i, false);
            }
        }
        return null;
    }

    public final boolean Lb() {
        int i = this.Q;
        return ((i & 2) == 0 && (i & 4) == 0) ? false : true;
    }

    public final boolean Mb() {
        return this.O != null;
    }

    public final boolean Nb() {
        ArticleTtsInfo articleTtsInfo;
        ExternalAudio externalAudio = this.H;
        return (externalAudio == null || (articleTtsInfo = externalAudio.c) == null || !articleTtsInfo.f) ? false : true;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.S(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.W(this.j);
        serializer.S(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.S(this.n);
        serializer.j0(this.o);
        serializer.i0(this.q);
        serializer.j0(this.r);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.W(this.t);
        serializer.W(this.u);
        serializer.K(this.v);
        serializer.i0(this.w);
        serializer.i0(this.x);
        serializer.j0(this.y);
        serializer.Y(this.z);
        serializer.S(this.A);
        serializer.L(this.B ? (byte) 1 : (byte) 0);
        serializer.Y(this.C);
        serializer.i0(this.D);
        serializer.L(this.E ? (byte) 1 : (byte) 0);
        serializer.L(this.F ? (byte) 1 : (byte) 0);
        serializer.L(this.G ? (byte) 1 : (byte) 0);
        serializer.i0(this.H);
        serializer.i0(this.I);
        serializer.i0(this.J);
        serializer.j0(this.K);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.L ? (byte) 1 : (byte) 0);
        serializer.L(this.M ? (byte) 1 : (byte) 0);
        serializer.S(this.N);
        serializer.i0(this.O);
        serializer.L(this.P ? (byte) 1 : (byte) 0);
        serializer.S(this.Q);
        serializer.L(this.R ? (byte) 1 : (byte) 0);
        serializer.j0(this.S);
        serializer.i0(this.T);
        serializer.L(this.U ? (byte) 1 : (byte) 0);
        serializer.S(this.V);
        serializer.i0(this.W);
        serializer.L(this.X ? (byte) 1 : (byte) 0);
        serializer.i0(this.Y);
        serializer.j0(this.Z);
        serializer.i0(this.a0);
    }

    public final boolean Ob() {
        return this.H != null;
    }

    public final boolean Pb() {
        return epx.f(this.J, DownloadingState.Corrupted.b);
    }

    public final boolean Qb() {
        return this.H != null;
    }

    public final boolean Rb() {
        return this.W != null && this.b < 0;
    }

    public final boolean S4() {
        return epx.f(this.J, DownloadingState.Downloaded.b);
    }

    public final boolean Sb() {
        return this.W != null;
    }

    public final boolean Tb() {
        if (Vb() || Qb() || Nb()) {
            return false;
        }
        ExternalAudio externalAudio = this.H;
        return ((externalAudio != null && externalAudio.e == 4) || Wb() || Mb() || Ub()) ? false : true;
    }

    public final boolean Ub() {
        return this.x != null;
    }

    public final boolean Vb() {
        return this.w != null;
    }

    public final boolean Wb() {
        ExternalAudio externalAudio = this.H;
        return externalAudio != null && externalAudio.e == 2;
    }

    public final boolean Xb() {
        return this.C != -1;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new p010(this, 13));
    }

    public final boolean equals(Object obj) {
        MusicTrack musicTrack = obj instanceof MusicTrack ? (MusicTrack) obj : null;
        if (musicTrack != null && epx.f(musicTrack.c, this.c) && musicTrack.b == this.b) {
            ExternalAudio externalAudio = musicTrack.H;
            String str = externalAudio != null ? externalAudio.b : null;
            ExternalAudio externalAudio2 = this.H;
            if (epx.f(str, externalAudio2 != null ? externalAudio2.b : null)) {
                NftAudio nftAudio = musicTrack.x;
                String str2 = nftAudio != null ? nftAudio.b : null;
                NftAudio nftAudio2 = this.x;
                if (epx.f(str2, nftAudio2 != null ? nftAudio2.b : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        NftAudio nftAudio = this.x;
        if (nftAudio != null) {
            return nftAudio.hashCode();
        }
        return Long.hashCode(this.c.b) + (this.b * 31);
    }

    public final String toString() {
        return this.h + " - " + this.d;
    }

    public MusicTrack(int i, UserId userId) {
        this(i, userId, null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -4, 1048575, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MusicTrack(int i, UserId userId, String str, String str2, int i2, int i3, String str3, String str4, List list, int i4, boolean z, boolean z2, int i5, String str5, boolean z3, AlbumLink albumLink, String str6, boolean z4, List list2, List list3, Bundle bundle, Episode episode, NftAudio nftAudio, String str7, long j, int i6, boolean z5, long j2, ChartInfo chartInfo, boolean z6, boolean z7, boolean z8, ExternalAudio externalAudio, AssistantData assistantData, DownloadingState downloadingState, String str8, boolean z9, boolean z10, int i7, AudioBookChapter audioBookChapter, boolean z11, int i8, boolean z12, String str9, Thumb thumb, boolean z13, int i9, MoosicAudio moosicAudio, boolean z14, MusicPreviewUrl musicPreviewUrl, String str10, AudioLoudness audioLoudness, int i10, int i11, zcl zclVar) {
        this(r2, (i10 & 2) != 0 ? UserId.d : userId, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? 0 : i2, (i10 & 32) != 0 ? 0 : i3, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : list, (i10 & 512) != 0 ? 19 : i4, (i10 & 1024) != 0 ? false : z, (i10 & 2048) != 0 ? false : z2, (i10 & 4096) != 0 ? 0 : i5, (i10 & 8192) != 0 ? null : str5, (i10 & 16384) != 0 ? false : z3, (i10 & 32768) != 0 ? null : albumLink, (i10 & 65536) != 0 ? null : str6, (i10 & 131072) != 0 ? false : z4, (i10 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list2, (i10 & 524288) != 0 ? null : list3, (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bundle, (i10 & 2097152) != 0 ? null : episode, (i10 & 4194304) != 0 ? null : nftAudio, (i10 & 8388608) != 0 ? null : str7, (i10 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? 0L : j, (i10 & 33554432) != 0 ? -1 : i6, (i10 & 67108864) != 0 ? false : z5, (i10 & 134217728) != 0 ? -1L : j2, (i10 & 268435456) != 0 ? null : chartInfo, (i10 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? false : z6, (i10 & 1073741824) != 0 ? false : z7, (i10 & Integer.MIN_VALUE) != 0 ? false : z8, (i11 & 1) != 0 ? null : externalAudio, (i11 & 2) != 0 ? null : assistantData, (i11 & 4) != 0 ? DownloadingState.NotLoaded.b : downloadingState, (i11 & 8) != 0 ? null : str8, (i11 & 16) != 0 ? false : z9, (i11 & 32) != 0 ? false : z10, (i11 & 64) != 0 ? 0 : i7, (i11 & 128) != 0 ? null : audioBookChapter, (i11 & 256) != 0 ? false : z11, (i11 & 512) != 0 ? 0 : i8, (i11 & 1024) != 0 ? false : z12, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? null : thumb, (i11 & 8192) != 0 ? false : z13, (i11 & 16384) != 0 ? 0 : i9, (i11 & 32768) != 0 ? null : moosicAudio, (i11 & 65536) != 0 ? false : z14, (i11 & 131072) != 0 ? null : musicPreviewUrl, (i11 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str10, (i11 & 524288) != 0 ? null : audioLoudness);
        int i12 = (i10 & 1) != 0 ? 0 : i;
    }

    public MusicTrack(int i, UserId userId, String str, String str2, int i2, int i3, String str3, String str4, List<AudioStream> list, int i4, boolean z, boolean z2, int i5, String str5, boolean z3, AlbumLink albumLink, String str6, boolean z4, List<Artist> list2, List<Artist> list3, Bundle bundle, Episode episode, NftAudio nftAudio, String str7, long j, int i6, boolean z5, long j2, ChartInfo chartInfo, boolean z6, boolean z7, boolean z8, ExternalAudio externalAudio, AssistantData assistantData, DownloadingState downloadingState, String str8, boolean z9, boolean z10, int i7, AudioBookChapter audioBookChapter, boolean z11, int i8, boolean z12, String str9, Thumb thumb, boolean z13, int i9, MoosicAudio moosicAudio, boolean z14, MusicPreviewUrl musicPreviewUrl, String str10, AudioLoudness audioLoudness) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = str2;
        this.f = i2;
        this.g = i3;
        this.h = str3;
        this.i = str4;
        this.j = list;
        this.k = i4;
        this.l = z;
        this.m = z2;
        this.n = i5;
        this.o = str5;
        this.p = z3;
        this.q = albumLink;
        this.r = str6;
        this.s = z4;
        this.t = list2;
        this.u = list3;
        this.v = bundle;
        this.w = episode;
        this.x = nftAudio;
        this.y = str7;
        this.z = j;
        this.A = i6;
        this.B = z5;
        this.C = j2;
        this.D = chartInfo;
        this.E = z6;
        this.F = z7;
        this.G = z8;
        this.H = externalAudio;
        this.I = assistantData;
        this.J = downloadingState;
        this.K = str8;
        this.L = z9;
        this.M = z10;
        this.N = i7;
        this.O = audioBookChapter;
        this.P = z11;
        this.Q = i8;
        this.R = z12;
        this.S = str9;
        this.T = thumb;
        this.U = z13;
        this.V = i9;
        this.W = moosicAudio;
        this.X = z14;
        this.Y = musicPreviewUrl;
        this.Z = str10;
        this.a0 = audioLoudness;
        this.b0 = new bpn0(new nly(this, 13));
        this.c0 = i2 * 1000;
    }

    public MusicTrack(Serializer serializer) {
        this(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H(), serializer.u(), serializer.u(), serializer.H(), serializer.H(), serializer.l(AudioStream.class.getClassLoader()), serializer.u(), serializer.m(), serializer.m(), serializer.u(), serializer.H(), serializer.m(), (AlbumLink) serializer.G(AlbumLink.class.getClassLoader()), serializer.H(), serializer.m(), serializer.l(Artist.class.getClassLoader()), serializer.l(Artist.class.getClassLoader()), serializer.o(Bundle.class.getClassLoader()), (Episode) serializer.G(Episode.class.getClassLoader()), (NftAudio) serializer.G(NftAudio.class.getClassLoader()), serializer.H(), serializer.w(), serializer.u(), serializer.m(), serializer.w(), (ChartInfo) serializer.G(ChartInfo.class.getClassLoader()), serializer.m(), serializer.m(), serializer.m(), (ExternalAudio) serializer.G(ExternalAudio.class.getClassLoader()), (AssistantData) serializer.G(AssistantData.class.getClassLoader()), (DownloadingState) serializer.G(DownloadingState.class.getClassLoader()), serializer.H(), serializer.m(), serializer.m(), serializer.u(), (AudioBookChapter) serializer.G(AudioBookChapter.class.getClassLoader()), serializer.m(), serializer.u(), serializer.m(), serializer.H(), (Thumb) serializer.G(Thumb.class.getClassLoader()), serializer.m(), serializer.u(), (MoosicAudio) serializer.G(MoosicAudio.class.getClassLoader()), serializer.m(), (MusicPreviewUrl) serializer.G(MusicPreviewUrl.class.getClassLoader()), serializer.H(), (AudioLoudness) serializer.G(AudioLoudness.class.getClassLoader()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicTrack(JSONObject jSONObject) {
        this(r24, r5, r6, r7, r8, r9, r10, r11, r12, r13, false, false, r16, null, r17, r19, r20, r21, r22, r23, r14, r25, r26, r27, r28, r30, r31, -1L, r34, r35, r36, r37, r38, r39, r0, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57);
        Bundle bundle;
        AssistantData assistantData;
        boolean z;
        int i;
        MusicPreviewUrl musicPreviewUrl;
        DownloadingState downloadingState;
        int optInt = jSONObject.optInt("id", jSONObject.optInt(C4583ua.b));
        UserId userId = new UserId(jSONObject.getLong("owner_id"));
        String string = jSONObject.getString("title");
        String optString = jSONObject.optString("subtitle");
        int i2 = jSONObject.getInt("duration");
        int optInt2 = jSONObject.optInt("content_restricted", 0);
        String string2 = jSONObject.getString("artist");
        String string3 = jSONObject.getString("url");
        ArrayList a2 = aay.a.a(jSONObject, "audio_streams", AudioStream.e);
        int optInt3 = jSONObject.optInt("track_genre_id", 19);
        int optInt4 = jSONObject.optInt("lyrics_id");
        AlbumLink albumLink = jSONObject.has("album") ? new AlbumLink(jSONObject.optJSONObject("album")) : null;
        String optString2 = jSONObject.optString("access_key");
        boolean optBoolean = jSONObject.optBoolean("is_explicit");
        Artist.a aVar = Artist.o;
        ArrayList a3 = aay.a.a(jSONObject, "main_artists", aVar);
        ArrayList a4 = aay.a.a(jSONObject, "featured_artists", aVar);
        if (!jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS) || jSONObject.isNull(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
            bundle = null;
        } else {
            bundle = new Bundle();
            JSONObject jSONObject2 = jSONObject.getJSONObject(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject2.getString(next));
            }
        }
        Serializer.c<Episode> cVar = Episode.CREATOR;
        Episode a5 = Episode.a.a(jSONObject.optJSONObject("podcast_info"));
        Serializer.c<NftAudio> cVar2 = NftAudio.CREATOR;
        NftAudio a6 = NftAudio.a.a(jSONObject.optJSONObject("nft_info"));
        String optString3 = jSONObject.optString("track_code", null);
        long optLong = jSONObject.optLong("date");
        int optInt5 = jSONObject.optInt("album_part_number", -1);
        boolean optBoolean2 = jSONObject.optBoolean("is_focus_track", false);
        ChartInfo chartInfo = jSONObject.has("audio_chart_info") ? new ChartInfo(jSONObject.getJSONObject("audio_chart_info")) : null;
        boolean optBoolean3 = jSONObject.optBoolean("stories_allowed", false);
        boolean optBoolean4 = jSONObject.optBoolean("short_videos_allowed", false);
        boolean optBoolean5 = jSONObject.optBoolean("stories_cover_allowed", false);
        JSONObject optJSONObject = jSONObject.optJSONObject("audio_voice_assistant");
        if (optJSONObject != null) {
            Serializer.c<AssistantData> cVar3 = AssistantData.CREATOR;
            assistantData = AssistantData.a.a(optJSONObject);
        } else {
            assistantData = null;
        }
        String D = f370.D(jSONObject, "original_sound_video_id");
        boolean optBoolean6 = jSONObject.optBoolean("has_lyrics");
        boolean optBoolean7 = jSONObject.optBoolean("in_clips_favorite_allowed", false);
        boolean optBoolean8 = jSONObject.optBoolean("in_clips_favorite", false);
        ExternalAudio externalAudio = jSONObject.has("external_audio") ? new ExternalAudio(jSONObject.getJSONObject("external_audio")) : null;
        int optInt6 = jSONObject.optInt("special_project_id", 0);
        AudioBookChapter audioBookChapter = jSONObject.has("audiobook_chapter") ? new AudioBookChapter(jSONObject.getJSONObject("audiobook_chapter")) : null;
        boolean optBoolean9 = jSONObject.optBoolean("dislike");
        int optInt7 = jSONObject.optInt("legal_notices_type", 0);
        boolean optBoolean10 = jSONObject.optBoolean("can_download_short_video");
        String optString4 = jSONObject.optString("main_color");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("thumb");
        Thumb thumb = optJSONObject2 != null ? (Thumb) Thumb.f.a(optJSONObject2) : null;
        boolean optBoolean11 = jSONObject.optBoolean("like");
        int optInt8 = jSONObject.optInt("flags_context");
        MoosicAudio moosicAudio = jSONObject.has("moosic_audio") ? new MoosicAudio(jSONObject.getJSONObject("moosic_audio")) : null;
        boolean optBoolean12 = jSONObject.optBoolean("trending");
        if (jSONObject.has("preview_url")) {
            Serializer.c<MusicPreviewUrl> cVar4 = MusicPreviewUrl.CREATOR;
            JSONObject jSONObject3 = jSONObject.getJSONObject("preview_url");
            z = optBoolean6;
            i = optInt;
            musicPreviewUrl = new MusicPreviewUrl(jSONObject3.optString("url"), jSONObject3.optInt("clip_from"), jSONObject3.optInt("clip_to"));
        } else {
            z = optBoolean6;
            i = optInt;
            musicPreviewUrl = null;
        }
        String D2 = f370.D(jSONObject, "release_audio_id");
        AudioLoudness audioLoudness = jSONObject.has("audio_loudness") ? new AudioLoudness(jSONObject.getJSONObject("audio_loudness")) : null;
        if (jSONObject.has("downloading_state")) {
            int i3 = jSONObject.getInt("downloading_state");
            if (i3 == 0) {
                downloadingState = DownloadingState.NotLoaded.b;
            } else if (i3 == 1) {
                downloadingState = DownloadingState.Downloaded.b;
            } else if (i3 == 2) {
                downloadingState = DownloadingState.PendingDownload.b;
            } else if (i3 == 3) {
                downloadingState = DownloadingState.PartlyDownloaded.b;
            } else if (i3 == 4) {
                downloadingState = DownloadingState.Corrupted.b;
            } else {
                throw new IllegalStateException("Incorrect download state value");
            }
        } else {
            downloadingState = DownloadingState.NotLoaded.b;
        }
    }
}
