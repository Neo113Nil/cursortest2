package com.vk.dto.common;

import android.os.Parcel;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.common.api.generated.GsonHolder;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.clips.ClipLinkModerationStatus;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vk.dto.common.clips.ClipsAdsFeaturesParams;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.clips.NewsMonotheme;
import com.vk.dto.common.clips.TrendingHashtag;
import com.vk.dto.common.id.UserId;
import com.vk.dto.compilation.Compilation;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.user.UserProfile;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.ah;
import xsna.bay;
import xsna.c5g;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.j5g;
import xsna.jgp;
import xsna.msy;
import xsna.on00;
import xsna.pn00;
import xsna.qoy;
import xsna.tsj;
import xsna.ui0;
import xsna.v11;
import xsna.wwx;
import xsna.zcl;
import xsna.zed;
import xsna.zg;

/* compiled from: ClipVideoFile.kt */
/* loaded from: classes18.dex */
public final class ClipVideoFile extends VideoFileOld {
    public static final /* synthetic */ int Y1 = 0;
    public final Object A1;
    public final Object B1;
    public final ClickableStickers C1;
    public final MusicTrack D1;
    public final List<Mask> E1;
    public final List<Compilation> F1;
    public final DuetMeta G1;
    public final ClipVideoOrigin H1;
    public final OriginalSoundStatus I1;
    public final boolean J1;
    public final ClipLinkModerationStatus K1;
    public final ClipAudioTemplate L1;
    public final List<ClipsDraftablePlaylist> M1;
    public final List<CoOwnerItem> N1;
    public final Map<AdStatPixel.Type, List<AdStatPixel>> O1;
    public final Boolean P1;
    public final List<TrendingHashtag> Q1;
    public final ClipMainTabState R1;
    public final ClipsAdsFeaturesParams S1;
    public final NewsMonotheme T1;
    public CharSequence U1;
    public CharSequence V1;
    public CharSequence W1;
    public boolean X1;

    public ClipVideoFile() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.A1 = msy.a(lazyThreadSafetyMode, new zg(this, 26));
        this.B1 = msy.a(lazyThreadSafetyMode, new ah(this, 21));
        this.X1 = zed.a(this);
        this.C1 = null;
        this.D1 = null;
        EmptyList emptyList = EmptyList.b;
        this.E1 = emptyList;
        this.F1 = emptyList;
        this.G1 = null;
        this.H1 = null;
        this.p = "short_video";
        this.I1 = OriginalSoundStatus.NONE;
        this.J1 = false;
        this.K1 = ClipLinkModerationStatus.UNDEFINED;
        this.L1 = null;
        this.M1 = emptyList;
        this.N1 = emptyList;
        this.O1 = jgp.b;
        this.x1 = null;
        this.P1 = null;
        this.Q1 = emptyList;
        this.R1 = null;
        this.S1 = null;
        this.T1 = null;
    }

    public static String Jb(ClipVideoFile clipVideoFile) {
        return super.r1() + clipVideoFile.W;
    }

    public static ClipVideoFile Kb(ClipVideoFile clipVideoFile, boolean z, String str, ArrayList arrayList, ArrayList arrayList2, Map map, ArrayList arrayList3, ClipMainTabState clipMainTabState, int i) {
        Boolean bool;
        List<TrendingHashtag> list;
        ClickableStickers clickableStickers = clipVideoFile.C1;
        MusicTrack musicTrack = clipVideoFile.D1;
        List<Mask> list2 = clipVideoFile.E1;
        List<Compilation> list3 = clipVideoFile.F1;
        DuetMeta duetMeta = clipVideoFile.G1;
        ClipVideoOrigin clipVideoOrigin = clipVideoFile.H1;
        OriginalSoundStatus originalSoundStatus = clipVideoFile.I1;
        boolean z2 = (i & 128) != 0 ? clipVideoFile.J1 : z;
        boolean z3 = clipVideoFile.X1;
        ClipLinkModerationStatus clipLinkModerationStatus = clipVideoFile.K1;
        ClipAudioTemplate clipAudioTemplate = clipVideoFile.L1;
        CharSequence charSequence = (i & 2048) != 0 ? clipVideoFile.U1 : str;
        CharSequence charSequence2 = clipVideoFile.V1;
        CharSequence charSequence3 = clipVideoFile.W1;
        List<ClipsDraftablePlaylist> list4 = (i & 16384) != 0 ? clipVideoFile.M1 : arrayList;
        List<CoOwnerItem> list5 = (i & 32768) != 0 ? clipVideoFile.N1 : arrayList2;
        Map map2 = (i & 65536) != 0 ? clipVideoFile.O1 : map;
        Integer num = clipVideoFile.x1;
        Boolean bool2 = clipVideoFile.P1;
        if ((i & 524288) != 0) {
            bool = bool2;
            list = clipVideoFile.Q1;
        } else {
            bool = bool2;
            list = arrayList3;
        }
        List<TrendingHashtag> list6 = list;
        ClipMainTabState clipMainTabState2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? clipVideoFile.R1 : clipMainTabState;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams = clipVideoFile.S1;
        NewsMonotheme newsMonotheme = clipVideoFile.T1;
        clipVideoFile.getClass();
        Parcel obtain = Parcel.obtain();
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        List<ClipsDraftablePlaylist> list7 = list4;
        Serializer.g gVar = new Serializer.g(obtain);
        clipVideoFile.O7(gVar);
        obtain.setDataPosition(0);
        gVar.H();
        ClipVideoFile clipVideoFile2 = new ClipVideoFile(gVar, clickableStickers, musicTrack, list2, list3, duetMeta, clipVideoOrigin, originalSoundStatus, Boolean.valueOf(z2), Boolean.valueOf(z3), clipLinkModerationStatus, clipAudioTemplate, list7, list5, map2, num, bool, list6, clipMainTabState2, clipsAdsFeaturesParams, newsMonotheme);
        clipVideoFile2.U1 = charSequence;
        clipVideoFile2.V1 = charSequence2;
        clipVideoFile2.W1 = charSequence3;
        obtain.recycle();
        return clipVideoFile2;
    }

    public static Map Ob(Serializer serializer) {
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        try {
            int u = serializer.u();
            if (u < 0) {
                return jgp.b;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < u; i++) {
                AdStatPixel.Type type = (AdStatPixel.Type) serializer.C();
                ArrayList k = serializer.k(AdStatPixel.class);
                if (type != null && k != null) {
                    linkedHashMap.put(type, k);
                }
            }
            return linkedHashMap;
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final String Lb() {
        return (String) this.A1.getValue();
    }

    public final ClipAudioTemplate Mb() {
        return this.L1;
    }

    public final MusicTrack Nb() {
        return this.D1;
    }

    @Override // com.vk.dto.common.VideoFileOld, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.C1);
        serializer.i0(this.D1);
        serializer.W(this.E1);
        serializer.W(this.F1);
        serializer.i0(this.G1);
        serializer.i0(this.H1);
        serializer.V(Integer.valueOf(this.I1.ordinal()));
        serializer.L(this.J1 ? (byte) 1 : (byte) 0);
        serializer.L(this.X1 ? (byte) 1 : (byte) 0);
        serializer.V(Integer.valueOf(this.K1.h()));
        serializer.i0(this.L1);
        serializer.W(this.M1);
        serializer.W(this.N1);
        Map<AdStatPixel.Type, List<AdStatPixel>> map = this.O1;
        if (map == null) {
            serializer.S(-1);
        } else {
            Iterator c = n.c(serializer, map);
            while (c.hasNext()) {
                Map.Entry entry = (Map.Entry) c.next();
                serializer.g0((AdStatPixel.Type) entry.getKey());
                serializer.W((List) entry.getValue());
            }
        }
        serializer.V(this.x1);
        serializer.J(this.P1);
        serializer.W(this.Q1);
        ClipMainTabState clipMainTabState = this.R1;
        serializer.V(clipMainTabState != null ? Integer.valueOf(clipMainTabState.h()) : null);
        serializer.i0(this.S1);
        serializer.i0(this.T1);
    }

    public final List<TrendingHashtag> R0() {
        return this.Q1;
    }

    public final void R4(CharSequence charSequence) {
        this.W1 = charSequence;
    }

    public final void ea(CharSequence charSequence) {
        this.V1 = charSequence;
    }

    @Override // com.vk.dto.common.VideoFileOld
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ClipVideoFile clipVideoFile = obj instanceof ClipVideoFile ? (ClipVideoFile) obj : null;
        return clipVideoFile != null && super.equals(obj) && epx.f(r1(), clipVideoFile.r1()) && epx.f(this.C1, clipVideoFile.C1) && epx.f(this.D1, clipVideoFile.D1) && epx.f(this.E1, clipVideoFile.E1) && epx.f(this.F1, clipVideoFile.F1) && epx.f(this.G1, clipVideoFile.G1) && epx.f(this.H1, clipVideoFile.H1) && this.I1 == clipVideoFile.I1 && this.J1 == clipVideoFile.J1 && this.K1 == clipVideoFile.K1 && epx.f(this.L1, clipVideoFile.L1) && epx.f(this.M1, clipVideoFile.M1) && this.X1 == clipVideoFile.X1 && epx.f(this.N1, clipVideoFile.N1) && epx.f(this.O1, clipVideoFile.O1) && epx.f(this.P1, clipVideoFile.P1) && epx.f(this.Q1, clipVideoFile.Q1) && this.R1 == clipVideoFile.R1 && epx.f(this.S1, clipVideoFile.S1) && epx.f(this.T1, clipVideoFile.T1);
    }

    @Override // com.vk.dto.common.VideoFileOld
    public final int hashCode() {
        int hashCode = (r1().hashCode() + (super.hashCode() * 31)) * 31;
        ClickableStickers clickableStickers = this.C1;
        int hashCode2 = (hashCode + (clickableStickers != null ? clickableStickers.hashCode() : 0)) * 31;
        MusicTrack musicTrack = this.D1;
        int a = fw3.a(fw3.a((hashCode2 + (musicTrack != null ? musicTrack.hashCode() : 0)) * 31, 31, this.E1), 31, this.F1);
        DuetMeta duetMeta = this.G1;
        int hashCode3 = (a + (duetMeta != null ? duetMeta.hashCode() : 0)) * 31;
        ClipVideoOrigin clipVideoOrigin = this.H1;
        int hashCode4 = (this.K1.hashCode() + qoy.b((this.I1.hashCode() + ((hashCode3 + (clipVideoOrigin != null ? clipVideoOrigin.hashCode() : 0)) * 31)) * 31, 31, this.J1)) * 31;
        ClipAudioTemplate clipAudioTemplate = this.L1;
        int a2 = v11.a(fw3.a(qoy.b(fw3.a((hashCode4 + (clipAudioTemplate != null ? clipAudioTemplate.b.hashCode() : 0)) * 31, 31, this.M1), 31, this.X1), 31, this.N1), 31, this.O1);
        Boolean bool = this.P1;
        int a3 = fw3.a((a2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.Q1);
        ClipMainTabState clipMainTabState = this.R1;
        int hashCode5 = (a3 + (clipMainTabState != null ? clipMainTabState.hashCode() : 0)) * 31;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams = this.S1;
        int hashCode6 = (hashCode5 + (clipsAdsFeaturesParams != null ? clipsAdsFeaturesParams.hashCode() : 0)) * 31;
        NewsMonotheme newsMonotheme = this.T1;
        return hashCode6 + (newsMonotheme != null ? newsMonotheme.hashCode() : 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.dto.common.VideoFileOld, com.vk.dto.common.VideoFile
    public final String r1() {
        return X0() != null ? Lb() : (String) this.B1.getValue();
    }

    public final void z5(CharSequence charSequence) {
        this.U1 = charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipVideoFile(ClickableStickers clickableStickers, MusicTrack musicTrack, List<Mask> list, List<Compilation> list2, DuetMeta duetMeta, ClipVideoOrigin clipVideoOrigin, OriginalSoundStatus originalSoundStatus, boolean z, ClipLinkModerationStatus clipLinkModerationStatus, ClipAudioTemplate clipAudioTemplate, List<ClipsDraftablePlaylist> list3, List<CoOwnerItem> list4, Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map, Integer num, Boolean bool, List<TrendingHashtag> list5, ClipMainTabState clipMainTabState, ClipsAdsFeaturesParams clipsAdsFeaturesParams, NewsMonotheme newsMonotheme) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.A1 = msy.a(lazyThreadSafetyMode, new zg(this, 26));
        this.B1 = msy.a(lazyThreadSafetyMode, new ah(this, 21));
        this.X1 = zed.a(this);
        this.C1 = clickableStickers;
        this.D1 = musicTrack;
        this.E1 = list;
        this.F1 = list2;
        this.G1 = duetMeta;
        this.H1 = clipVideoOrigin;
        this.p = "short_video";
        this.I1 = originalSoundStatus;
        this.J1 = z;
        this.K1 = clipLinkModerationStatus;
        this.L1 = clipAudioTemplate;
        this.M1 = list3;
        this.N1 = list4;
        this.O1 = map;
        this.x1 = num;
        this.P1 = bool;
        this.Q1 = list5;
        this.R1 = clipMainTabState;
        this.S1 = clipsAdsFeaturesParams;
        this.T1 = newsMonotheme;
    }

    public /* synthetic */ ClipVideoFile(JSONObject jSONObject, Map map, Map map2, Map map3, int i, zcl zclVar) {
        this(jSONObject, map, map2, (i & 8) != 0 ? null : map3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0277, code lost:
    
        if (r2 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ee, code lost:
    
        if (r2 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03ad, code lost:
    
        if (r5 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012d, code lost:
    
        if (r5 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0185, code lost:
    
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e0, code lost:
    
        if (r3 == null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List<com.vk.dto.common.clips.TrendingHashtag>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipVideoFile(JSONObject jSONObject, Map<UserId, ? extends UserProfile> map, Map<UserId, ? extends Group> map2, Map<UserId, Owner> map3) {
        super(jSONObject);
        ClickableStickers clickableStickers;
        ?? r11;
        JSONArray optJSONArray;
        Collection collection;
        Iterable iterable;
        List<Compilation> list;
        boolean z;
        boolean z2;
        DuetMeta duetMeta;
        OriginalSoundStatus originalSoundStatus;
        int i;
        boolean z3;
        ClipAudioTemplate clipAudioTemplate;
        List<ClipsDraftablePlaylist> list2;
        List<CoOwnerItem> list3;
        Map map4;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams;
        NewsMonotheme newsMonotheme;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray2;
        Map map5;
        Map map6;
        CoOwnerItem coOwnerItem;
        JSONArray optJSONArray3;
        ClipsDraftablePlaylist clipsDraftablePlaylist;
        JSONObject optJSONObject3;
        JSONArray optJSONArray4;
        Compilation compilation;
        JSONArray optJSONArray5;
        JSONArray optJSONArray6;
        long j;
        Group group;
        JSONArray optJSONArray7;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5;
        Map<UserId, ? extends UserProfile> map7 = map;
        Map<UserId, ? extends Group> map8 = map2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.A1 = msy.a(lazyThreadSafetyMode, new zg(this, 26));
        this.B1 = msy.a(lazyThreadSafetyMode, new ah(this, 21));
        this.X1 = zed.a(this);
        JSONObject optJSONObject6 = jSONObject.optJSONObject("short_video_info");
        long j2 = 0;
        if (optJSONObject6 == null || (optJSONObject5 = optJSONObject6.optJSONObject("clickable_stickers")) == null) {
            clickableStickers = null;
        } else {
            JSONArray optJSONArray8 = optJSONObject5.optJSONArray("items");
            if (optJSONArray8 != null) {
                int length = optJSONArray8.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject7 = optJSONArray8.optJSONObject(i2);
                    if (optJSONObject7 != null && !optJSONObject7.has("id")) {
                        optJSONObject7.put("id", 0L);
                    }
                }
                optJSONObject5.put("clickable_stickers", optJSONArray8);
            }
            Serializer.c<ClickableStickers> cVar = ClickableStickers.CREATOR;
            clickableStickers = ClickableStickers.a.a(optJSONObject5, map7, map8);
        }
        this.C1 = clickableStickers;
        this.D1 = (optJSONObject6 == null || (optJSONObject4 = optJSONObject6.optJSONObject("audio")) == null) ? null : new MusicTrack(optJSONObject4);
        if (optJSONObject6 != null && (optJSONArray7 = optJSONObject6.optJSONArray("trending_hashtags")) != null) {
            r11 = new ArrayList(optJSONArray7.length());
            int length2 = optJSONArray7.length();
            for (int i3 = 0; i3 < length2; i3++) {
                r11.add(new TrendingHashtag(optJSONArray7.getJSONObject(i3)));
            }
        } else if (optJSONObject6 != null && (optJSONArray = optJSONObject6.optJSONArray("highlighted_hashtags")) != null) {
            r11 = new ArrayList(optJSONArray.length());
            int length3 = optJSONArray.length();
            for (int i4 = 0; i4 < length3; i4++) {
                r11.add(new TrendingHashtag(optJSONArray.getString(i4), EmptyList.b));
            }
        } else {
            r11 = EmptyList.b;
        }
        this.Q1 = r11;
        if (optJSONObject6 != null && (optJSONArray6 = optJSONObject6.optJSONArray("effects")) != null) {
            ArrayList arrayList = new ArrayList(optJSONArray6.length());
            int length4 = optJSONArray6.length();
            int i5 = 0;
            while (i5 < length4) {
                JSONObject jSONObject2 = optJSONArray6.getJSONObject(i5);
                Serializer.c<Mask> cVar2 = Mask.CREATOR;
                UserProfile userProfile = map7 != null ? map7.get(new UserId(1L)) : null;
                if (map8 != null) {
                    group = map8.get(new UserId(1L));
                    j = 0;
                } else {
                    j = j2;
                    group = null;
                }
                arrayList.add(Mask.a.a(jSONObject2, userProfile, group, j));
                i5++;
                j2 = 0;
            }
            collection = j5g.O0(arrayList);
        }
        collection = EmptyList.b;
        if (optJSONObject6 != null && (optJSONArray5 = optJSONObject6.optJSONArray("masks")) != null) {
            ArrayList arrayList2 = new ArrayList(optJSONArray5.length());
            int length5 = optJSONArray5.length();
            int i6 = 0;
            while (i6 < length5) {
                JSONObject jSONObject3 = optJSONArray5.getJSONObject(i6);
                UserId userId = new UserId(jSONObject3.optLong("owner_id"));
                Serializer.c<Mask> cVar3 = Mask.CREATOR;
                arrayList2.add(Mask.a.a(jSONObject3, map7 != null ? map7.get(userId) : null, map8 != null ? map8.get(userId) : null, 0L));
                i6++;
                map7 = map;
                map8 = map2;
            }
            iterable = j5g.O0(arrayList2);
        }
        iterable = EmptyList.b;
        if (optJSONObject6 != null && (optJSONArray4 = optJSONObject6.optJSONArray("compilations")) != null) {
            ArrayList arrayList3 = new ArrayList(optJSONArray4.length());
            int length6 = optJSONArray4.length();
            for (int i7 = 0; i7 < length6; i7++) {
                JSONObject jSONObject4 = optJSONArray4.getJSONObject(i7);
                try {
                    Serializer.c<Compilation> cVar4 = Compilation.CREATOR;
                    int i8 = jSONObject4.getInt("id");
                    String string = jSONObject4.getString("name");
                    int optInt = jSONObject4.optInt("videos_count");
                    String optString = jSONObject4.optString("icon");
                    Serializer.c<NotificationImage> cVar5 = NotificationImage.CREATOR;
                    compilation = new Compilation(i8, string, optInt, optString, NotificationImage.a.a(jSONObject4.optJSONArray("image")));
                } catch (Throwable unused) {
                    compilation = null;
                }
                if (compilation != null) {
                    arrayList3.add(compilation);
                }
            }
            list = j5g.O0(arrayList3);
        }
        list = EmptyList.b;
        this.F1 = list;
        this.E1 = j5g.u0(iterable, collection);
        if (optJSONObject6 != null) {
            z = false;
            z2 = optJSONObject6.optBoolean("can_make_duet", false);
        } else {
            z = false;
            z2 = false;
        }
        Boolean valueOf = optJSONObject6 != null ? Boolean.valueOf(optJSONObject6.optBoolean("show_make_duet_tooltip", z)) : null;
        JSONObject optJSONObject8 = optJSONObject6 != null ? optJSONObject6.optJSONObject("duet") : null;
        if (optJSONObject8 != null) {
            duetMeta = new DuetMeta(Boolean.valueOf(z2), valueOf, optJSONObject8.optString("owner_id", ""), optJSONObject8.optString("video_id", ""), optJSONObject8.optString("owner_name_case_ins", ""));
        } else {
            duetMeta = new DuetMeta(Boolean.valueOf(z2), valueOf, null, null, null, 28, null);
        }
        this.G1 = duetMeta;
        JSONObject optJSONObject9 = optJSONObject6 != null ? optJSONObject6.optJSONObject("source_video") : null;
        this.H1 = optJSONObject9 != null ? new ClipVideoOrigin(optJSONObject9.optString("owner_id", ""), optJSONObject9.optString("video_id", ""), optJSONObject9.optString("description", "")) : null;
        if (optJSONObject6 != null) {
            originalSoundStatus = OriginalSoundStatus.values()[optJSONObject6.optInt("original_sound_status")];
        }
        originalSoundStatus = OriginalSoundStatus.NONE;
        this.I1 = originalSoundStatus;
        if (optJSONObject6 != null) {
            i = 0;
            z3 = optJSONObject6.optBoolean("anon_user_like_exists", false);
        } else {
            i = 0;
            z3 = false;
        }
        this.J1 = z3;
        ClipLinkModerationStatus.a aVar = ClipLinkModerationStatus.Companion;
        Integer x = optJSONObject6 != null ? f370.x(optJSONObject6, "clips_user_link_moderation") : null;
        aVar.getClass();
        this.K1 = ClipLinkModerationStatus.a.a(x);
        if (optJSONObject6 == null || (optJSONObject3 = optJSONObject6.optJSONObject("audio_template")) == null) {
            clipAudioTemplate = null;
        } else {
            ClipAudioTemplate.c.getClass();
            clipAudioTemplate = new ClipAudioTemplate(optJSONObject3);
        }
        this.L1 = clipAudioTemplate;
        if (optJSONObject6 != null && (optJSONArray3 = optJSONObject6.optJSONArray("playlists")) != null) {
            ArrayList arrayList4 = new ArrayList(optJSONArray3.length());
            int length7 = optJSONArray3.length();
            for (int i9 = i; i9 < length7; i9++) {
                JSONObject jSONObject5 = optJSONArray3.getJSONObject(i9);
                try {
                    ClipsDraftablePlaylist.f.getClass();
                    clipsDraftablePlaylist = new ClipsDraftablePlaylist(jSONObject5);
                } catch (Throwable unused2) {
                    clipsDraftablePlaylist = null;
                }
                if (clipsDraftablePlaylist != null) {
                    arrayList4.add(clipsDraftablePlaylist);
                }
            }
            list2 = j5g.O0(arrayList4);
        }
        list2 = EmptyList.b;
        this.M1 = list2;
        Map map9 = jgp.b;
        if (optJSONObject6 != null && (optJSONArray2 = optJSONObject6.optJSONArray("co_owners")) != null) {
            ArrayList arrayList5 = new ArrayList(optJSONArray2.length());
            int length8 = optJSONArray2.length();
            for (int i10 = i; i10 < length8; i10++) {
                JSONObject jSONObject6 = optJSONArray2.getJSONObject(i10);
                if (map != null) {
                    map5 = new LinkedHashMap(on00.e(map.size()));
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        map5.put(entry.getKey(), ((UserProfile) entry.getValue()).l0());
                    }
                } else {
                    map5 = null;
                }
                map5 = map5 == null ? map9 : map5;
                if (map2 != null) {
                    map6 = new LinkedHashMap(on00.e(map2.size()));
                    Iterator it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        map6.put(entry2.getKey(), tsj.a((Group) entry2.getValue()));
                    }
                } else {
                    map6 = null;
                }
                LinkedHashMap n = pn00.n(pn00.n(map5, map6 == null ? map9 : map6), map3 == null ? map9 : map3);
                try {
                    Serializer.c<CoOwnerItem> cVar6 = CoOwnerItem.CREATOR;
                    coOwnerItem = CoOwnerItem.a.a(jSONObject6, n);
                } catch (Throwable unused3) {
                    coOwnerItem = null;
                }
                if (coOwnerItem != null) {
                    arrayList5.add(coOwnerItem);
                }
            }
            list3 = j5g.O0(arrayList5);
        }
        list3 = EmptyList.b;
        this.N1 = list3;
        JSONArray optJSONArray9 = jSONObject.optJSONArray("ads_stat_pixels");
        if (optJSONArray9 != null) {
            ArrayList arrayList6 = new ArrayList();
            int length9 = optJSONArray9.length();
            for (int i11 = i; i11 < length9; i11++) {
                JSONObject optJSONObject10 = optJSONArray9.optJSONObject(i11);
                if (optJSONObject10 != null) {
                    arrayList6.add((AdsItemBlockAdStatPixelDto) GsonHolder.a().fromJson(bay.d(new wwx(optJSONObject10)), AdsItemBlockAdStatPixelDto.class));
                }
            }
            map4 = ui0.b(arrayList6);
        } else {
            map4 = null;
        }
        this.O1 = map4 != null ? map4 : map9;
        this.x1 = Integer.valueOf(jSONObject.optInt("wall_post_id"));
        this.P1 = optJSONObject6 != null ? Boolean.valueOf(optJSONObject6.optBoolean("hide_closing_ad_banner")) : null;
        ClipMainTabState.a aVar2 = ClipMainTabState.Companion;
        Integer valueOf2 = optJSONObject6 != null ? Integer.valueOf(optJSONObject6.optInt("main_tab_state", -1)) : null;
        aVar2.getClass();
        this.R1 = ClipMainTabState.a.a(valueOf2);
        if (optJSONObject6 == null || (optJSONObject2 = optJSONObject6.optJSONObject("ads_features")) == null) {
            clipsAdsFeaturesParams = null;
        } else {
            JSONArray optJSONArray10 = optJSONObject2.optJSONArray("wb_item_id");
            List O = optJSONArray10 != null ? f370.O(optJSONArray10) : null;
            O = O == null ? EmptyList.b : O;
            JSONArray optJSONArray11 = optJSONObject2.optJSONArray("ads_flags");
            Iterable J = optJSONArray11 != null ? f370.J(optJSONArray11) : null;
            Iterable iterable2 = J == null ? EmptyList.b : J;
            ArrayList arrayList7 = new ArrayList(c5g.u(iterable2, 10));
            Iterator it3 = iterable2.iterator();
            while (it3.hasNext()) {
                int intValue = ((Number) it3.next()).intValue();
                ClipsAdsFeaturesParams.AdsFlags adsFlags = ClipsAdsFeaturesParams.AdsFlags.HIDE_CLOSING_AD_BANNER;
                if (intValue != adsFlags.h()) {
                    adsFlags = ClipsAdsFeaturesParams.AdsFlags.HIDE_FULLSCREEN_AD_BANNER;
                    if (intValue != adsFlags.h()) {
                        adsFlags = ClipsAdsFeaturesParams.AdsFlags.UNKNOWN;
                    }
                }
                arrayList7.add(adsFlags);
            }
            clipsAdsFeaturesParams = new ClipsAdsFeaturesParams(O, arrayList7, f370.D(optJSONObject2, "articles"));
        }
        this.S1 = clipsAdsFeaturesParams;
        if (optJSONObject6 != null && (optJSONObject = optJSONObject6.optJSONObject("news_monotheme")) != null) {
            String optString2 = optJSONObject.optString("object_id");
            optString2 = optString2.length() <= 0 ? null : optString2;
            if (optString2 != null) {
                newsMonotheme = new NewsMonotheme(optString2, optJSONObject.optString("header"));
                this.T1 = newsMonotheme;
            }
        }
        newsMonotheme = null;
        this.T1 = newsMonotheme;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0087, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipVideoFile(Serializer serializer) {
        super(serializer);
        OriginalSoundStatus originalSoundStatus;
        ClipMainTabState clipMainTabState;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.A1 = msy.a(lazyThreadSafetyMode, new zg(this, 26));
        this.B1 = msy.a(lazyThreadSafetyMode, new ah(this, 21));
        this.X1 = zed.a(this);
        this.C1 = (ClickableStickers) serializer.G(ClickableStickers.class.getClassLoader());
        this.D1 = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
        List<Mask> k = serializer.k(Mask.class);
        this.E1 = k == null ? EmptyList.b : k;
        List<Compilation> k2 = serializer.k(Compilation.class);
        this.F1 = k2 == null ? EmptyList.b : k2;
        this.G1 = (DuetMeta) serializer.G(DuetMeta.class.getClassLoader());
        this.H1 = (ClipVideoOrigin) serializer.G(ClipVideoOrigin.class.getClassLoader());
        Integer v = serializer.v();
        if (v != null) {
            originalSoundStatus = OriginalSoundStatus.values()[v.intValue()];
        }
        originalSoundStatus = OriginalSoundStatus.NONE;
        this.I1 = originalSoundStatus;
        this.J1 = serializer.m();
        this.X1 = serializer.m();
        ClipLinkModerationStatus.a aVar = ClipLinkModerationStatus.Companion;
        Integer v2 = serializer.v();
        aVar.getClass();
        this.K1 = ClipLinkModerationStatus.a.a(v2);
        this.L1 = (ClipAudioTemplate) serializer.G(ClipAudioTemplate.class.getClassLoader());
        ArrayList k3 = serializer.k(ClipsDraftablePlaylist.class);
        this.M1 = k3 == null ? new ArrayList() : k3;
        ArrayList k4 = serializer.k(CoOwnerItem.class);
        this.N1 = k4 == null ? new ArrayList() : k4;
        this.O1 = Ob(serializer);
        this.x1 = serializer.v();
        this.P1 = serializer.n();
        ArrayList k5 = serializer.k(TrendingHashtag.class);
        this.Q1 = k5 == null ? new ArrayList() : k5;
        Integer v3 = serializer.v();
        if (v3 != null) {
            int intValue = v3.intValue();
            ClipMainTabState.a aVar2 = ClipMainTabState.Companion;
            Integer valueOf = Integer.valueOf(intValue);
            aVar2.getClass();
            clipMainTabState = ClipMainTabState.a.a(valueOf);
        } else {
            clipMainTabState = null;
        }
        this.R1 = clipMainTabState;
        this.S1 = (ClipsAdsFeaturesParams) serializer.G(ClipsAdsFeaturesParams.class.getClassLoader());
        this.T1 = (NewsMonotheme) serializer.G(NewsMonotheme.class.getClassLoader());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007f, code lost:
    
        if (r8 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipVideoFile(Serializer serializer, ClickableStickers clickableStickers, MusicTrack musicTrack, List<Mask> list, List<Compilation> list2, DuetMeta duetMeta, ClipVideoOrigin clipVideoOrigin, OriginalSoundStatus originalSoundStatus, Boolean bool, Boolean bool2, ClipLinkModerationStatus clipLinkModerationStatus, ClipAudioTemplate clipAudioTemplate, List<ClipsDraftablePlaylist> list3, List<CoOwnerItem> list4, Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map, Integer num, Boolean bool3, List<TrendingHashtag> list5, ClipMainTabState clipMainTabState, ClipsAdsFeaturesParams clipsAdsFeaturesParams, NewsMonotheme newsMonotheme) {
        super(serializer);
        OriginalSoundStatus originalSoundStatus2;
        ClipMainTabState clipMainTabState2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.A1 = msy.a(lazyThreadSafetyMode, new zg(this, 26));
        this.B1 = msy.a(lazyThreadSafetyMode, new ah(this, 21));
        this.X1 = zed.a(this);
        ClickableStickers clickableStickers2 = (ClickableStickers) serializer.G(ClickableStickers.class.getClassLoader());
        MusicTrack musicTrack2 = (MusicTrack) serializer.G(MusicTrack.class.getClassLoader());
        List<Mask> k = serializer.k(Mask.class);
        k = k == null ? EmptyList.b : k;
        List<Compilation> k2 = serializer.k(Compilation.class);
        k2 = k2 == null ? EmptyList.b : k2;
        DuetMeta duetMeta2 = (DuetMeta) serializer.G(DuetMeta.class.getClassLoader());
        ClipVideoOrigin clipVideoOrigin2 = (ClipVideoOrigin) serializer.G(ClipVideoOrigin.class.getClassLoader());
        Integer v = serializer.v();
        if (v != null) {
            originalSoundStatus2 = OriginalSoundStatus.values()[v.intValue()];
        }
        originalSoundStatus2 = OriginalSoundStatus.NONE;
        boolean m = serializer.m();
        boolean m2 = serializer.m();
        ClipLinkModerationStatus.a aVar = ClipLinkModerationStatus.Companion;
        Integer v2 = serializer.v();
        aVar.getClass();
        ClipLinkModerationStatus a = ClipLinkModerationStatus.a.a(v2);
        ClipAudioTemplate clipAudioTemplate2 = (ClipAudioTemplate) serializer.G(ClipAudioTemplate.class.getClassLoader());
        List<ClipsDraftablePlaylist> k3 = serializer.k(ClipsDraftablePlaylist.class);
        k3 = k3 == null ? EmptyList.b : k3;
        List<CoOwnerItem> k4 = serializer.k(CoOwnerItem.class);
        k4 = k4 == null ? new ArrayList<>() : k4;
        Map Ob = Ob(serializer);
        Integer v3 = serializer.v();
        Boolean n = serializer.n();
        ArrayList k5 = serializer.k(TrendingHashtag.class);
        k5 = k5 == null ? new ArrayList() : k5;
        Integer v4 = serializer.v();
        if (v4 != null) {
            int intValue = v4.intValue();
            ClipMainTabState.a aVar2 = ClipMainTabState.Companion;
            Integer valueOf = Integer.valueOf(intValue);
            aVar2.getClass();
            clipMainTabState2 = ClipMainTabState.a.a(valueOf);
        } else {
            clipMainTabState2 = null;
        }
        ArrayList arrayList = k5;
        ClipsAdsFeaturesParams clipsAdsFeaturesParams2 = (ClipsAdsFeaturesParams) serializer.G(ClipsAdsFeaturesParams.class.getClassLoader());
        NewsMonotheme newsMonotheme2 = (NewsMonotheme) serializer.G(NewsMonotheme.class.getClassLoader());
        this.D1 = musicTrack != null ? musicTrack : musicTrack2;
        this.E1 = list != null ? list : k;
        this.F1 = list2 != null ? list2 : k2;
        this.G1 = duetMeta != null ? duetMeta : duetMeta2;
        this.H1 = clipVideoOrigin != null ? clipVideoOrigin : clipVideoOrigin2;
        this.C1 = clickableStickers == null ? clickableStickers2 : clickableStickers;
        this.I1 = originalSoundStatus != null ? originalSoundStatus : originalSoundStatus2;
        this.J1 = bool != null ? bool.booleanValue() : m;
        this.X1 = bool2 != null ? bool2.booleanValue() : m2;
        this.K1 = clipLinkModerationStatus != null ? clipLinkModerationStatus : a;
        this.L1 = clipAudioTemplate != null ? clipAudioTemplate : clipAudioTemplate2;
        this.M1 = list3 != null ? list3 : k3;
        this.N1 = list4 != null ? list4 : k4;
        this.O1 = map != null ? map : Ob;
        this.x1 = num == null ? v3 : num;
        this.P1 = bool3 == null ? n : bool3;
        this.Q1 = list5 == null ? arrayList : list5;
        this.R1 = clipMainTabState == null ? clipMainTabState2 : clipMainTabState;
        this.S1 = clipsAdsFeaturesParams == null ? clipsAdsFeaturesParams2 : clipsAdsFeaturesParams;
        this.T1 = newsMonotheme != null ? newsMonotheme : newsMonotheme2;
    }
}
