package com.vk.dto.music;

import com.coremedia.iso.boxes.MetaBox;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.Ad;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.audio.dto.AudioPlaylistTypeDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.chart.ChartInfo;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.proto.PublisherConfiguration;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.drm0;
import xsna.epx;
import xsna.gp;
import xsna.lw20;
import xsna.r11;
import xsna.rl3;
import xsna.xc1;
import xsna.zcl;

/* compiled from: Playlist.kt */
/* loaded from: classes18.dex */
public final class Playlist extends Serializer.StreamParcelableAdapter implements bxx {
    public final PlaylistMeta A;
    public PlaylistPermissions B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final String F;
    public ChartInfo G;
    public DownloadingState H;
    public final int I;
    public final boolean J;
    public final Integer K;
    public final List<PlaylistAction> L;
    public final boolean M;
    public final String N;
    public int O;
    public int b;
    public UserId c;
    public final int d;
    public final String e;
    public PlaylistLink f;
    public PlaylistLink g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final int l;
    public Thumb m;
    public final List<Genre> n;
    public final String o;
    public List<Thumb> p;
    public PlaylistOwner q;
    public final List<Artist> r;
    public final List<Artist> s;
    public boolean t;
    public final int u;
    public final int v;
    public final long w;
    public String x;
    public List<MusicTrack> y;
    public final MusicDynamicRestriction z;
    public static final Set<Integer> P = rl3.y0(new Integer[]{0, 1, 2, 3, 4, 5});
    public static final Serializer.c<Playlist> CREATOR = new c();
    public static final b Q = new b();

    /* compiled from: Playlist.kt */
    public static final class a {
        public static String a(int i, UserId userId) {
            return r11.b(new StringBuilder(), userId.b, '_', i);
        }

        public static String b(int i, UserId userId, String str) {
            if (str == null || str.length() == 0) {
                return a(i, userId);
            }
            return userId.b + '_' + i + '_' + str;
        }

        public static Triple c(String str) {
            List c0 = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
            int size = c0.size();
            if (size == 2) {
                return new Triple(new UserId(Long.parseLong((String) c0.get(0))), Integer.valueOf(Integer.parseInt((String) c0.get(1))), null);
            }
            if (size == 3) {
                return new Triple(new UserId(Long.parseLong((String) c0.get(0))), Integer.valueOf(Integer.parseInt((String) c0.get(1))), c0.get(2));
            }
            throw new IllegalArgumentException("Invalid secure pid: ".concat(str));
        }
    }

    /* compiled from: Playlist.kt */
    public static final class b extends aay<Playlist> {
        @Override // xsna.aay
        public final Playlist a(JSONObject jSONObject) {
            return new Playlist(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<Playlist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Playlist a(Serializer serializer) {
            return new Playlist(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Playlist[i];
        }
    }

    public Playlist() {
        this(0, null, 0, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, false, 0, 0, 0L, null, null, null, null, null, false, false, false, null, null, null, 0, false, null, null, false, null, 0, -1, 255, null);
    }

    public static Playlist zb(Playlist playlist, Thumb thumb, PlaylistOwner playlistOwner, List list, DownloadingState downloadingState, int i, int i2) {
        ChartInfo chartInfo;
        DownloadingState downloadingState2;
        int i3 = playlist.b;
        UserId userId = playlist.c;
        int i4 = playlist.d;
        String str = playlist.e;
        PlaylistLink playlistLink = playlist.f;
        PlaylistLink playlistLink2 = playlist.g;
        String str2 = playlist.h;
        String str3 = playlist.i;
        String str4 = playlist.j;
        boolean z = playlist.k;
        int i5 = playlist.l;
        Thumb thumb2 = (i & 2048) != 0 ? playlist.m : thumb;
        List<Genre> list2 = playlist.n;
        Thumb thumb3 = thumb2;
        String str5 = playlist.o;
        List<Thumb> list3 = playlist.p;
        PlaylistOwner playlistOwner2 = (i & 32768) != 0 ? playlist.q : playlistOwner;
        List<Artist> list4 = playlist.r;
        List<Artist> list5 = playlist.s;
        boolean z2 = playlist.t;
        int i6 = playlist.u;
        int i7 = playlist.v;
        long j = playlist.w;
        String str6 = playlist.x;
        List list6 = (i & 8388608) != 0 ? playlist.y : list;
        MusicDynamicRestriction musicDynamicRestriction = playlist.z;
        PlaylistMeta playlistMeta = playlist.A;
        PlaylistPermissions playlistPermissions = playlist.B;
        boolean z3 = playlist.C;
        boolean z4 = playlist.D;
        boolean z5 = playlist.E;
        String str7 = playlist.F;
        ChartInfo chartInfo2 = playlist.G;
        if ((i2 & 1) != 0) {
            chartInfo = chartInfo2;
            downloadingState2 = playlist.H;
        } else {
            chartInfo = chartInfo2;
            downloadingState2 = downloadingState;
        }
        int i8 = playlist.I;
        boolean z6 = playlist.J;
        Integer num = playlist.K;
        List<PlaylistAction> list7 = playlist.L;
        boolean z7 = playlist.M;
        String str8 = playlist.N;
        int i9 = playlist.O;
        playlist.getClass();
        return new Playlist(i3, userId, i4, str, playlistLink, playlistLink2, str2, str3, str4, z, i5, thumb3, list2, str5, list3, playlistOwner2, list4, list5, z2, i6, i7, j, str6, list6, musicDynamicRestriction, playlistMeta, playlistPermissions, z3, z4, z5, str7, chartInfo, downloadingState2, i8, z6, num, list7, z7, str8, i9);
    }

    public final Playlist Ab() {
        if (this.g == null) {
            return this;
        }
        Playlist playlist = new Playlist(this);
        PlaylistLink playlistLink = this.g;
        if (playlistLink != null) {
            playlist.b = playlistLink.b;
            playlist.c = playlistLink.c;
            playlist.x = playlistLink.d;
            playlist.f = new PlaylistLink(this.b, this.c, this.x);
        }
        return playlist;
    }

    public final boolean B() {
        return this.I != 0;
    }

    public final Playlist Bb(UserId userId) {
        if (this.f == null) {
            return this;
        }
        Playlist playlist = new Playlist(this);
        PlaylistLink playlistLink = this.f;
        if (playlistLink != null) {
            playlist.b = playlistLink.b;
            playlist.c = playlistLink.c;
            playlist.x = playlistLink.d;
            playlist.f = null;
            if (userId.equals(this.c)) {
                playlist.t = true;
                playlist.g = new PlaylistLink(this.b, this.c, null, 4, null);
            }
        }
        return playlist;
    }

    public final List<Thumb> Cb() {
        Thumb thumb = this.m;
        if (thumb != null) {
            return Collections.singletonList(thumb);
        }
        List<Thumb> list = this.p;
        return list == null ? EmptyList.b : list;
    }

    public final long Db() {
        return (this.c.b << 32) | (this.b & PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK);
    }

    public final boolean Eb() {
        int i = this.d;
        return i == 1 || i == 2 || i == 4 || i == 3;
    }

    public final boolean Fb() {
        PlaylistPermissions playlistPermissions = this.B;
        return (playlistPermissions == null || playlistPermissions.b) ? false : true;
    }

    public final boolean Gb() {
        int i = this.d;
        return i == 0 || i == 5;
    }

    public final String Hb() {
        PlaylistLink playlistLink = this.f;
        return playlistLink == null ? Ib() : a.a(playlistLink.b, playlistLink.c);
    }

    public final String Ib() {
        return a.a(this.b, this.c);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.e);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L((byte) this.d);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.S(this.l);
        serializer.i0(this.m);
        serializer.o0(this.n);
        serializer.j0(this.o);
        serializer.o0(this.p);
        serializer.o0(this.r);
        serializer.o0(this.s);
        serializer.L(this.t ? (byte) 1 : (byte) 0);
        serializer.S(this.u);
        serializer.S(this.v);
        serializer.Y(this.w);
        serializer.j0(this.x);
        serializer.i0(this.q);
        serializer.o0(this.y);
        serializer.i0(this.z);
        serializer.i0(this.A);
        serializer.i0(this.B);
        serializer.L(this.C ? (byte) 1 : (byte) 0);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
        serializer.L(this.E ? (byte) 1 : (byte) 0);
        serializer.j0(this.F);
        serializer.i0(this.G);
        serializer.i0(this.H);
        serializer.S(this.I);
        serializer.L(this.J ? (byte) 1 : (byte) 0);
        serializer.V(this.K);
        serializer.o0(this.L);
        serializer.L(this.M ? (byte) 1 : (byte) 0);
        serializer.j0(this.N);
        serializer.S(this.O);
    }

    public final boolean S4() {
        return !epx.f(this.H, DownloadingState.NotLoaded.b);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new lw20(this, 17));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Playlist.class.equals(obj.getClass())) {
            return false;
        }
        return epx.f(Hb(), ((Playlist) obj).Hb());
    }

    public final int hashCode() {
        return Objects.hash(Hb());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Playlist{id=");
        sb.append(this.b);
        sb.append(", title='");
        sb.append(this.h);
        sb.append("', audioCount=");
        sb.append(this.v);
        sb.append(", ownerId=");
        return gp.b(sb, this.c, '}');
    }

    public Playlist(int i, UserId userId, int i2, String str, PlaylistLink playlistLink, PlaylistLink playlistLink2, String str2, String str3, String str4, boolean z, int i3, Thumb thumb, List list, String str5, List list2, PlaylistOwner playlistOwner, List list3, List list4, boolean z2, int i4, int i5, long j, String str6, List list5, MusicDynamicRestriction musicDynamicRestriction, PlaylistMeta playlistMeta, PlaylistPermissions playlistPermissions, boolean z3, boolean z4, boolean z5, String str7, ChartInfo chartInfo, DownloadingState downloadingState, int i6, boolean z6, Integer num, List list6, boolean z7, String str8, int i7, int i8, int i9, zcl zclVar) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? UserId.d : userId, (i8 & 4) != 0 ? 0 : i2, (i8 & 8) != 0 ? "collection" : str, (i8 & 16) != 0 ? null : playlistLink, (i8 & 32) != 0 ? null : playlistLink2, (i8 & 64) != 0 ? null : str2, (i8 & 128) != 0 ? null : str3, (i8 & 256) != 0 ? null : str4, (i8 & 512) != 0 ? false : z, (i8 & 1024) != 0 ? 0 : i3, (i8 & 2048) != 0 ? null : thumb, (i8 & 4096) != 0 ? null : list, (i8 & 8192) != 0 ? null : str5, (i8 & 16384) != 0 ? null : list2, (i8 & 32768) != 0 ? null : playlistOwner, (i8 & 65536) != 0 ? null : list3, (i8 & 131072) != 0 ? null : list4, (i8 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? false : z2, (i8 & 524288) != 0 ? 0 : i4, (i8 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? 0 : i5, (i8 & 2097152) != 0 ? 0L : j, (i8 & 4194304) != 0 ? null : str6, (i8 & 8388608) != 0 ? EmptyList.b : list5, (i8 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : musicDynamicRestriction, (i8 & 33554432) != 0 ? null : playlistMeta, (i8 & 67108864) != 0 ? null : playlistPermissions, (i8 & 134217728) != 0 ? false : z3, (i8 & 268435456) != 0 ? false : z4, (i8 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? true : z5, (i8 & 1073741824) != 0 ? "" : str7, (i8 & Integer.MIN_VALUE) != 0 ? null : chartInfo, (i9 & 1) != 0 ? DownloadingState.NotLoaded.b : downloadingState, (i9 & 2) != 0 ? 0 : i6, (i9 & 4) != 0 ? false : z6, (i9 & 8) != 0 ? null : num, (i9 & 16) != 0 ? EmptyList.b : list6, (i9 & 32) != 0 ? false : z7, (i9 & 64) != 0 ? null : str8, (i9 & 128) != 0 ? 0 : i7);
    }

    public Playlist(int i, UserId userId, int i2, String str, PlaylistLink playlistLink, PlaylistLink playlistLink2, String str2, String str3, String str4, boolean z, int i3, Thumb thumb, List<Genre> list, String str5, List<Thumb> list2, PlaylistOwner playlistOwner, List<Artist> list3, List<Artist> list4, boolean z2, int i4, int i5, long j, String str6, List<MusicTrack> list5, MusicDynamicRestriction musicDynamicRestriction, PlaylistMeta playlistMeta, PlaylistPermissions playlistPermissions, boolean z3, boolean z4, boolean z5, String str7, ChartInfo chartInfo, DownloadingState downloadingState, int i6, boolean z6, Integer num, List<PlaylistAction> list6, boolean z7, String str8, int i7) {
        this.b = i;
        this.c = userId;
        this.d = i2;
        this.e = str;
        this.f = playlistLink;
        this.g = playlistLink2;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = z;
        this.l = i3;
        this.m = thumb;
        this.n = list;
        this.o = str5;
        this.p = list2;
        this.q = playlistOwner;
        this.r = list3;
        this.s = list4;
        this.t = z2;
        this.u = i4;
        this.v = i5;
        this.w = j;
        this.x = str6;
        this.y = list5;
        this.z = musicDynamicRestriction;
        this.A = playlistMeta;
        this.B = playlistPermissions;
        this.C = z3;
        this.D = z4;
        this.E = z5;
        this.F = str7;
        this.G = chartInfo;
        this.H = downloadingState;
        this.I = i6;
        this.J = z6;
        this.K = num;
        this.L = list6;
        this.M = z7;
        this.N = str8;
        this.O = i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r1.equals("playlist") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r1.equals("main_only") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r1.equals("main_feat") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r1.equals("collection") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c8, code lost:
    
        if (r2 != null) goto L110;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Playlist(JSONObject jSONObject) {
        this(r21, r4, r5, r19, r6, r8, r9, r10, r20, r12, r14, r7, r15, r27, r3, r29, r1, r11, r13, r22, r23, r24, r26, r28, r30, r31, r32, r35, r1, r1, r34, r16, null, 0, r38, r39, r1 == null ? EmptyList.b : r1, jSONObject.optBoolean("exclusive"), jSONObject.optString("icon"), jSONObject.optInt("flags_context"), 0, 3, null);
        int i;
        String str;
        String str2;
        int i2;
        ArrayList arrayList;
        JSONArray optJSONArray;
        String str3;
        ArrayList arrayList2;
        PlaylistOwner playlistOwner;
        MusicDynamicRestriction musicDynamicRestriction;
        MusicDynamicRestriction musicDynamicRestriction2;
        PlaylistMeta playlistMeta;
        PlaylistMeta playlistMeta2;
        PlaylistPermissions playlistPermissions;
        boolean z;
        ChartInfo chartInfo;
        JSONArray optJSONArray2;
        ArrayList arrayList3;
        int optInt = jSONObject.optInt("id");
        UserId userId = new UserId(jSONObject.optLong("owner_id"));
        String optString = jSONObject.optString("album_type", "unknown");
        if (epx.f(optString, "unknown")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("album");
            xc1 xc1Var = optJSONObject != null ? new xc1(optJSONObject) : null;
            optString = xc1Var != null ? xc1Var.b : null;
            if (optString != null) {
                switch (optString.hashCode()) {
                    case -1741312354:
                        break;
                    case -251444232:
                        break;
                    case -251167118:
                        break;
                    case 1879474642:
                        break;
                }
            }
            optString = "collection";
        }
        boolean optBoolean = jSONObject.optBoolean("is_explicit");
        int optInt2 = jSONObject.optInt("type", -1);
        if (!P.contains(Integer.valueOf(optInt2))) {
            if (optInt2 == -1) {
                String optString2 = jSONObject.optString("type");
                if (!epx.f(optString2, AudioPlaylistTypeDto.GENERATED.i()) && !epx.f(optString2, AudioPlaylistTypeDto.UGC.i())) {
                    if (epx.f(optString2, AudioPlaylistTypeDto.CHAT.i())) {
                        optInt2 = 5;
                    } else if (epx.f(optString2, AudioPlaylistTypeDto.ALBUM.i())) {
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("album");
                        xc1 xc1Var2 = optJSONObject2 != null ? new xc1(optJSONObject2) : null;
                        String str4 = xc1Var2 != null ? xc1Var2.a : null;
                        if (str4 != null) {
                            int hashCode = str4.hashCode();
                            if (hashCode != -1741312354) {
                                if (hashCode != -902265784) {
                                    if (hashCode != 3243) {
                                        if (hashCode == 92896879) {
                                            str4.equals("album");
                                        }
                                    } else if (str4.equals("ep")) {
                                        optInt2 = 2;
                                    }
                                } else if (str4.equals(Ad.d)) {
                                    optInt2 = 4;
                                }
                            } else if (str4.equals("collection")) {
                                optInt2 = 3;
                            }
                            PlaylistLink playlistLink = !jSONObject.has("original") ? new PlaylistLink(jSONObject.optJSONObject("original")) : null;
                            PlaylistLink playlistLink2 = !jSONObject.has("followed") ? new PlaylistLink(jSONObject.optJSONObject("followed")) : null;
                            String optString3 = jSONObject.optString("title");
                            String optString4 = jSONObject.optString("subtitle");
                            String optString5 = jSONObject.optString("description");
                            int optInt3 = jSONObject.optInt("year");
                            JSONObject optJSONObject3 = jSONObject.optJSONObject("photo");
                            Thumb thumb = optJSONObject3 == null ? (Thumb) Thumb.f.a(optJSONObject3) : null;
                            if (jSONObject.has("genres")) {
                                str = optString;
                                str2 = optString5;
                                i2 = optInt;
                                arrayList = null;
                            } else {
                                JSONArray optJSONArray3 = jSONObject.optJSONArray("genres");
                                int length = optJSONArray3.length();
                                if (length > 0) {
                                    arrayList3 = new ArrayList(length);
                                    str = optString;
                                    int i3 = 0;
                                    while (i3 < length) {
                                        arrayList3.add(new Genre(optJSONArray3.optJSONObject(i3)));
                                        i3++;
                                        optString5 = optString5;
                                        optInt = optInt;
                                    }
                                } else {
                                    str = optString;
                                    arrayList3 = null;
                                }
                                str2 = optString5;
                                i2 = optInt;
                                arrayList = arrayList3;
                            }
                            optJSONArray = jSONObject.optJSONArray("main_artists");
                            if (optJSONArray != null) {
                                optJSONArray = optJSONArray.length() <= 0 ? null : optJSONArray;
                                if (optJSONArray != null) {
                                    JSONObject jSONObject2 = optJSONArray.getJSONObject(0);
                                    if (jSONObject2 != null) {
                                        str3 = jSONObject2.getString("name");
                                    }
                                }
                            }
                            str3 = "";
                            if (str3.length() == 0 && jSONObject.has("artists")) {
                                optJSONArray2 = jSONObject.optJSONArray("artists");
                                if (optJSONArray2.length() > 0) {
                                    str3 = optJSONArray2.optJSONObject(0).optString("name");
                                }
                            }
                            if (jSONObject.has("thumbs")) {
                                arrayList2 = null;
                            } else {
                                Serializer.c<Thumb> cVar = Thumb.CREATOR;
                                arrayList2 = Thumb.a.a(jSONObject.optJSONArray("thumbs"));
                            }
                            Artist.a aVar = Artist.o;
                            ArrayList a2 = aay.a.a(jSONObject, "main_artists", aVar);
                            ArrayList a3 = aay.a.a(jSONObject, "featured_artists", aVar);
                            boolean optBoolean2 = jSONObject.optBoolean("is_following");
                            int optInt4 = jSONObject.optInt("plays");
                            int optInt5 = jSONObject.optInt("count");
                            long optLong = jSONObject.optLong("update_time");
                            String optString6 = jSONObject.optString("access_key");
                            String str5 = str3;
                            List a4 = aay.a.a(jSONObject, "audios", MusicTrack.e0);
                            List list = a4 == null ? EmptyList.b : a4;
                            PlaylistOwner playlistOwner2 = (PlaylistOwner) aay.a.c(jSONObject, "owner_item", PlaylistOwner.i);
                            if (jSONObject.has("restriction")) {
                                playlistOwner = playlistOwner2;
                                musicDynamicRestriction = null;
                            } else {
                                playlistOwner = playlistOwner2;
                                musicDynamicRestriction = new MusicDynamicRestriction(jSONObject.getJSONObject("restriction"));
                            }
                            if (jSONObject.has(MetaBox.TYPE)) {
                                musicDynamicRestriction2 = musicDynamicRestriction;
                                playlistMeta = null;
                            } else {
                                musicDynamicRestriction2 = musicDynamicRestriction;
                                playlistMeta = new PlaylistMeta(jSONObject.getJSONObject(MetaBox.TYPE));
                            }
                            if (jSONObject.has(SignalingProtocol.KEY_PERMISSIONS)) {
                                playlistMeta2 = playlistMeta;
                                playlistPermissions = null;
                            } else {
                                playlistMeta2 = playlistMeta;
                                playlistPermissions = new PlaylistPermissions(jSONObject.getJSONObject(SignalingProtocol.KEY_PERMISSIONS));
                            }
                            boolean optBoolean3 = jSONObject.optBoolean("subtitle_badge");
                            PlaylistPermissions playlistPermissions2 = playlistPermissions;
                            boolean optBoolean4 = jSONObject.optBoolean("play_button");
                            boolean z2 = !jSONObject.optBoolean("no_discover");
                            String optString7 = jSONObject.optString("track_code");
                            if (jSONObject.has("audio_chart_info")) {
                                z = optBoolean3;
                                chartInfo = null;
                            } else {
                                z = optBoolean3;
                                chartInfo = new ChartInfo(jSONObject.getJSONObject("audio_chart_info"));
                            }
                            boolean optBoolean5 = jSONObject.optBoolean("is_curator");
                            Integer valueOf = !jSONObject.has("match_score") ? Integer.valueOf(jSONObject.getInt("match_score")) : null;
                            ChartInfo chartInfo2 = chartInfo;
                            List a5 = aay.a.a(jSONObject, "actions", PlaylistAction.d);
                        }
                        i = 1;
                        if (!jSONObject.has("original")) {
                        }
                        if (!jSONObject.has("followed")) {
                        }
                        String optString32 = jSONObject.optString("title");
                        String optString42 = jSONObject.optString("subtitle");
                        String optString52 = jSONObject.optString("description");
                        int optInt32 = jSONObject.optInt("year");
                        JSONObject optJSONObject32 = jSONObject.optJSONObject("photo");
                        if (optJSONObject32 == null) {
                        }
                        if (jSONObject.has("genres")) {
                        }
                        optJSONArray = jSONObject.optJSONArray("main_artists");
                        if (optJSONArray != null) {
                        }
                        str3 = "";
                        if (str3.length() == 0) {
                            optJSONArray2 = jSONObject.optJSONArray("artists");
                            if (optJSONArray2.length() > 0) {
                            }
                        }
                        if (jSONObject.has("thumbs")) {
                        }
                        Artist.a aVar2 = Artist.o;
                        ArrayList a22 = aay.a.a(jSONObject, "main_artists", aVar2);
                        ArrayList a32 = aay.a.a(jSONObject, "featured_artists", aVar2);
                        boolean optBoolean22 = jSONObject.optBoolean("is_following");
                        int optInt42 = jSONObject.optInt("plays");
                        int optInt52 = jSONObject.optInt("count");
                        long optLong2 = jSONObject.optLong("update_time");
                        String optString62 = jSONObject.optString("access_key");
                        String str52 = str3;
                        List a42 = aay.a.a(jSONObject, "audios", MusicTrack.e0);
                        List list2 = a42 == null ? EmptyList.b : a42;
                        PlaylistOwner playlistOwner22 = (PlaylistOwner) aay.a.c(jSONObject, "owner_item", PlaylistOwner.i);
                        if (jSONObject.has("restriction")) {
                        }
                        if (jSONObject.has(MetaBox.TYPE)) {
                        }
                        if (jSONObject.has(SignalingProtocol.KEY_PERMISSIONS)) {
                        }
                        boolean optBoolean32 = jSONObject.optBoolean("subtitle_badge");
                        PlaylistPermissions playlistPermissions22 = playlistPermissions;
                        boolean optBoolean42 = jSONObject.optBoolean("play_button");
                        boolean z22 = !jSONObject.optBoolean("no_discover");
                        String optString72 = jSONObject.optString("track_code");
                        if (jSONObject.has("audio_chart_info")) {
                        }
                        boolean optBoolean52 = jSONObject.optBoolean("is_curator");
                        if (!jSONObject.has("match_score")) {
                        }
                        ChartInfo chartInfo22 = chartInfo;
                        List a52 = aay.a.a(jSONObject, "actions", PlaylistAction.d);
                    }
                }
            }
            i = 0;
            if (!jSONObject.has("original")) {
            }
            if (!jSONObject.has("followed")) {
            }
            String optString322 = jSONObject.optString("title");
            String optString422 = jSONObject.optString("subtitle");
            String optString522 = jSONObject.optString("description");
            int optInt322 = jSONObject.optInt("year");
            JSONObject optJSONObject322 = jSONObject.optJSONObject("photo");
            if (optJSONObject322 == null) {
            }
            if (jSONObject.has("genres")) {
            }
            optJSONArray = jSONObject.optJSONArray("main_artists");
            if (optJSONArray != null) {
            }
            str3 = "";
            if (str3.length() == 0) {
            }
            if (jSONObject.has("thumbs")) {
            }
            Artist.a aVar22 = Artist.o;
            ArrayList a222 = aay.a.a(jSONObject, "main_artists", aVar22);
            ArrayList a322 = aay.a.a(jSONObject, "featured_artists", aVar22);
            boolean optBoolean222 = jSONObject.optBoolean("is_following");
            int optInt422 = jSONObject.optInt("plays");
            int optInt522 = jSONObject.optInt("count");
            long optLong22 = jSONObject.optLong("update_time");
            String optString622 = jSONObject.optString("access_key");
            String str522 = str3;
            List a422 = aay.a.a(jSONObject, "audios", MusicTrack.e0);
            List list22 = a422 == null ? EmptyList.b : a422;
            PlaylistOwner playlistOwner222 = (PlaylistOwner) aay.a.c(jSONObject, "owner_item", PlaylistOwner.i);
            if (jSONObject.has("restriction")) {
            }
            if (jSONObject.has(MetaBox.TYPE)) {
            }
            if (jSONObject.has(SignalingProtocol.KEY_PERMISSIONS)) {
            }
            boolean optBoolean322 = jSONObject.optBoolean("subtitle_badge");
            PlaylistPermissions playlistPermissions222 = playlistPermissions;
            boolean optBoolean422 = jSONObject.optBoolean("play_button");
            boolean z222 = !jSONObject.optBoolean("no_discover");
            String optString722 = jSONObject.optString("track_code");
            if (jSONObject.has("audio_chart_info")) {
            }
            boolean optBoolean522 = jSONObject.optBoolean("is_curator");
            if (!jSONObject.has("match_score")) {
            }
            ChartInfo chartInfo222 = chartInfo;
            List a522 = aay.a.a(jSONObject, "actions", PlaylistAction.d);
        }
        i = optInt2;
        if (!jSONObject.has("original")) {
        }
        if (!jSONObject.has("followed")) {
        }
        String optString3222 = jSONObject.optString("title");
        String optString4222 = jSONObject.optString("subtitle");
        String optString5222 = jSONObject.optString("description");
        int optInt3222 = jSONObject.optInt("year");
        JSONObject optJSONObject3222 = jSONObject.optJSONObject("photo");
        if (optJSONObject3222 == null) {
        }
        if (jSONObject.has("genres")) {
        }
        optJSONArray = jSONObject.optJSONArray("main_artists");
        if (optJSONArray != null) {
        }
        str3 = "";
        if (str3.length() == 0) {
        }
        if (jSONObject.has("thumbs")) {
        }
        Artist.a aVar222 = Artist.o;
        ArrayList a2222 = aay.a.a(jSONObject, "main_artists", aVar222);
        ArrayList a3222 = aay.a.a(jSONObject, "featured_artists", aVar222);
        boolean optBoolean2222 = jSONObject.optBoolean("is_following");
        int optInt4222 = jSONObject.optInt("plays");
        int optInt5222 = jSONObject.optInt("count");
        long optLong222 = jSONObject.optLong("update_time");
        String optString6222 = jSONObject.optString("access_key");
        String str5222 = str3;
        List a4222 = aay.a.a(jSONObject, "audios", MusicTrack.e0);
        List list222 = a4222 == null ? EmptyList.b : a4222;
        PlaylistOwner playlistOwner2222 = (PlaylistOwner) aay.a.c(jSONObject, "owner_item", PlaylistOwner.i);
        if (jSONObject.has("restriction")) {
        }
        if (jSONObject.has(MetaBox.TYPE)) {
        }
        if (jSONObject.has(SignalingProtocol.KEY_PERMISSIONS)) {
        }
        boolean optBoolean3222 = jSONObject.optBoolean("subtitle_badge");
        PlaylistPermissions playlistPermissions2222 = playlistPermissions;
        boolean optBoolean4222 = jSONObject.optBoolean("play_button");
        boolean z2222 = !jSONObject.optBoolean("no_discover");
        String optString7222 = jSONObject.optString("track_code");
        if (jSONObject.has("audio_chart_info")) {
        }
        boolean optBoolean5222 = jSONObject.optBoolean("is_curator");
        if (!jSONObject.has("match_score")) {
        }
        ChartInfo chartInfo2222 = chartInfo;
        List a5222 = aay.a.a(jSONObject, "actions", PlaylistAction.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Playlist(Serializer serializer, zcl zclVar) {
        this(r1, r2, r3, r4, r6, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r1 == null ? EmptyList.b : r1, serializer.m(), serializer.H(), serializer.u());
        int u = serializer.u();
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        String H = serializer.H();
        String str = H == null ? "collection" : H;
        boolean m = serializer.m();
        byte p = serializer.p();
        p = P.contains(Integer.valueOf(p)) ? p : (byte) 0;
        PlaylistLink playlistLink = (PlaylistLink) serializer.G(PlaylistLink.class.getClassLoader());
        PlaylistLink playlistLink2 = (PlaylistLink) serializer.G(PlaylistLink.class.getClassLoader());
        String H2 = serializer.H();
        String H3 = serializer.H();
        String H4 = serializer.H();
        int u2 = serializer.u();
        Thumb thumb = (Thumb) serializer.G(Thumb.class.getClassLoader());
        ArrayList j = serializer.j(Genre.CREATOR);
        String H5 = serializer.H();
        ArrayList j2 = serializer.j(Thumb.CREATOR);
        Serializer.c<Artist> cVar = Artist.CREATOR;
        ArrayList j3 = serializer.j(cVar);
        ArrayList j4 = serializer.j(cVar);
        boolean m2 = serializer.m();
        int u3 = serializer.u();
        int u4 = serializer.u();
        long w = serializer.w();
        String H6 = serializer.H();
        PlaylistOwner playlistOwner = (PlaylistOwner) serializer.G(PlaylistOwner.class.getClassLoader());
        List j5 = serializer.j(MusicTrack.CREATOR);
        List list = j5 == null ? EmptyList.b : j5;
        MusicDynamicRestriction musicDynamicRestriction = (MusicDynamicRestriction) serializer.G(MusicDynamicRestriction.class.getClassLoader());
        PlaylistMeta playlistMeta = (PlaylistMeta) serializer.G(PlaylistMeta.class.getClassLoader());
        PlaylistPermissions playlistPermissions = (PlaylistPermissions) serializer.G(PlaylistPermissions.class.getClassLoader());
        boolean m3 = serializer.m();
        boolean m4 = serializer.m();
        boolean m5 = serializer.m();
        String H7 = serializer.H();
        String str2 = H7 == null ? "" : H7;
        ChartInfo chartInfo = (ChartInfo) serializer.G(ChartInfo.class.getClassLoader());
        DownloadingState downloadingState = (DownloadingState) serializer.G(DownloadingState.class.getClassLoader());
        int u5 = serializer.u();
        boolean m6 = serializer.m();
        Integer v = serializer.v();
        List j6 = serializer.j(PlaylistAction.CREATOR);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Playlist(Playlist playlist) {
        this(r1, r2, r35, r36, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r1, r1, r1, r1, r1, r1, r1, r1, r1, r1, r1, r1, r1, r1, r1, r4, playlist.H, 0, playlist.J, playlist.K, playlist.L, playlist.M, playlist.N, playlist.O, 0, 2, null);
        int i;
        String str;
        ChartInfo chartInfo;
        int i2 = playlist.b;
        UserId userId = playlist.c;
        String str2 = playlist.e;
        boolean z = playlist.k;
        int i3 = playlist.d;
        PlaylistLink playlistLink = playlist.f;
        PlaylistLink playlistLink2 = playlist.g;
        String str3 = playlist.h;
        String str4 = playlist.i;
        String str5 = playlist.j;
        int i4 = playlist.l;
        Thumb thumb = playlist.m;
        List<Genre> list = playlist.n;
        String str6 = playlist.o;
        List<Thumb> list2 = playlist.p;
        List<Artist> list3 = playlist.r;
        List<Artist> list4 = playlist.s;
        boolean z2 = playlist.t;
        int i5 = playlist.u;
        int i6 = playlist.v;
        long j = playlist.w;
        String str7 = playlist.x;
        PlaylistOwner playlistOwner = playlist.q;
        List<MusicTrack> list5 = playlist.y;
        MusicDynamicRestriction musicDynamicRestriction = playlist.z;
        PlaylistMeta playlistMeta = playlist.A;
        PlaylistPermissions playlistPermissions = playlist.B;
        boolean z3 = playlist.C;
        boolean z4 = playlist.D;
        boolean z5 = playlist.E;
        String str8 = playlist.F;
        ChartInfo chartInfo2 = playlist.G;
        if (chartInfo2 != null) {
            i = i3;
            str = str2;
            chartInfo = new ChartInfo(chartInfo2.b, chartInfo2.c, chartInfo2.d);
        } else {
            i = i3;
            str = str2;
            chartInfo = null;
        }
    }
}
