package com.vk.dto.common;

import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.InstreamAd;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.StatPixel;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.TitleAction;
import com.vk.dto.common.VideoAccessInfo;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.donut.VideoDonut;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.interactive.InteractiveInfo;
import com.vk.dto.common.live.LivePlayBackSettings;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.log.L;
import com.vk.toggle.features.VideoFeatures;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.brm0;
import xsna.bss0;
import xsna.c6z;
import xsna.d230;
import xsna.dl70;
import xsna.dpe0;
import xsna.e630;
import xsna.epe0;
import xsna.epx;
import xsna.fkq0;
import xsna.h330;
import xsna.l140;
import xsna.myc0;
import xsna.nsk0;
import xsna.p4g;
import xsna.r11;
import xsna.s3q0;
import xsna.wx30;
import xsna.xus;
import xsna.xy9;
import xsna.z230;

/* loaded from: classes18.dex */
public class VideoFileOld extends Serializer.StreamParcelableAdapter implements VideoFile {
    public VideoAccessInfo A;
    public long A0;
    public boolean B;
    public Counters B0;
    public boolean C;
    public boolean C0;
    public boolean D;
    public int D0;
    public boolean E;
    public final String E0;
    public boolean F;
    public final String F0;
    public boolean G;
    public final String G0;
    public boolean H;
    public final int H0;
    public boolean I;

    @NonNull
    public Image I0;
    public boolean J;

    @NonNull
    public Image J0;
    public boolean K;
    public TimelineThumbs K0;
    public VideoCanDownload L;
    public transient String L0;
    public VideoDownloadDto M;
    public transient String M0;
    public VideoDonut N;
    public String N0;
    public boolean O;
    public VideoRestriction O0;
    public boolean P;
    public String P0;

    @Deprecated
    public boolean Q;
    public boolean Q0;
    public boolean R;
    public float R0;
    public boolean S;
    public Map<StatPixel.a, nsk0> S0;
    public boolean T;
    public LivePlayBackSettings T0;
    public boolean U;
    public long U0;
    public String V;
    public Boolean V0;
    public String W;
    public boolean W0;
    public String X;

    @NonNull
    public final ServerEffect X0;
    public ActionLink Y;
    public final String Y0;
    public boolean Z;
    public final boolean Z0;
    public InstreamAd a0;
    public List<VideoEpisode> a1;
    public UserId b;
    public boolean b0;
    public List<VideoFile> b1;
    public int c;
    public VideoAdInfo c0;
    public TitleAction c1;
    public UserId d;
    public OrdAdInfo d0;
    public boolean d1;
    public int e;
    public boolean e0;
    public boolean e1;
    public VideoUrlStorage f;

    @NonNull
    public dpe0 f0;
    public Boolean f1;
    public final VideoUrlStorage g;
    public InteractiveInfo g0;
    public Boolean g1;
    public Long h;
    public Boolean h0;
    public boolean h1;
    public Long i;
    public boolean i0;
    public String i1;
    public String j;
    public boolean j0;
    public Integer j1;
    public String k;
    public boolean k0;
    public Long k1;
    public String l;
    public boolean l0;
    public Integer l1;
    public String m;
    public int m0;
    public Integer m1;
    public String n;
    public int n0;
    public Long n1;
    public String o;
    public VerifyInfo o0;
    public final Boolean o1;
    public String p;
    public String p0;
    public Integer p1;
    public int q;
    public String q0;
    public boolean q1;
    public int r;
    public String r0;
    public String r1;
    public int s;
    public boolean s0;
    public String s1;
    public int t;
    public boolean t0;
    public String t1;
    public int u;
    public VideoNotificationsStatus u0;

    @NonNull
    public OfferVkVideo u1;
    public int v;
    public Owner v0;
    public int v1;
    public int w;
    public int w0;
    public VideoSkippablePart w1;
    public boolean x;
    public List<PrivacySetting.PrivacyRule> x0;
    public Integer x1;
    public boolean y;
    public List<PrivacySetting.PrivacyRule> y0;
    public final c y1;
    public boolean z;

    @Deprecated
    public final long z0;
    public static final a z1 = new a();
    public static final Serializer.c<VideoFile> CREATOR = new b();

    public class a extends aay<VideoFile> {
        @Override // xsna.aay
        public final VideoFile a(@NonNull JSONObject jSONObject) throws JSONException {
            return com.vk.dto.common.c.b(jSONObject);
        }
    }

    public class b extends Serializer.c<VideoFile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoFile a(@NonNull Serializer serializer) {
            return com.vk.dto.common.c.a(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoFileOld[i];
        }
    }

    public class c implements bss0 {
        public c() {
        }

        @Override // xsna.c6z
        public final int E1() {
            return VideoFileOld.this.v;
        }

        @Override // xsna.grj0
        public final boolean J() {
            return VideoFileOld.this.x;
        }

        @Override // xsna.c6z
        public final void M2(@NonNull c6z c6zVar) {
            int E1 = c6zVar.E1();
            VideoFileOld videoFileOld = VideoFileOld.this;
            videoFileOld.v = E1;
            videoFileOld.B = c6zVar.l0();
            videoFileOld.u = c6zVar.T9();
            videoFileOld.w = c6zVar.i7();
            videoFileOld.s = c6zVar.fa();
            videoFileOld.x = c6zVar.J();
        }

        @Override // xsna.grj0
        public final int T9() {
            return VideoFileOld.this.u;
        }

        @Override // xsna.c6z
        public final void U8(int i) {
            VideoFileOld.this.w = i;
        }

        @Override // xsna.c6z
        public final void W2() {
            VideoFileOld.this.y = true;
        }

        @Override // xsna.c6z
        public final boolean b9() {
            return VideoFileOld.this.H;
        }

        @Override // xsna.grj0
        public final void f(int i) {
            VideoFileOld.this.u = i;
        }

        @Override // xsna.grj0
        public final void f0(boolean z) {
            VideoFileOld.this.x = z;
        }

        @Override // xsna.c6z
        public final int fa() {
            return VideoFileOld.this.s;
        }

        @Override // xsna.c6z
        public final int i7() {
            return VideoFileOld.this.w;
        }

        @Override // xsna.c6z
        public final boolean l0() {
            return VideoFileOld.this.B;
        }

        @Override // xsna.c6z
        public final boolean qa() {
            VideoFileOld videoFileOld = VideoFileOld.this;
            return videoFileOld.v > 0 || videoFileOld.B;
        }

        @Override // xsna.c6z
        public final String r() {
            return VideoFileOld.this.W;
        }

        @Override // xsna.c6z
        public final void r0(boolean z) {
            VideoFileOld.this.B = z;
        }

        @Override // xsna.c6z
        public final void sb(int i) {
            VideoFileOld.this.s = i;
        }

        @Override // xsna.bss0
        @NonNull
        public final VideoFileOld t() {
            return VideoFileOld.this;
        }

        @Override // xsna.c6z
        public final void v6(int i) {
            VideoFileOld.this.v = i;
        }

        @Override // xsna.c6z
        public final int w0() {
            return VideoFileOld.this.s;
        }

        @Override // xsna.c6z
        public final boolean x1() {
            return VideoFileOld.this.y;
        }
    }

    public VideoFileOld() {
        UserId userId = UserId.d;
        this.b = userId;
        this.d = userId;
        this.f = new VideoUrlStorage();
        this.k = "";
        this.n = "";
        this.L = VideoCanDownload.NO;
        this.f0 = new dpe0();
        this.o0 = new VerifyInfo();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        Image image = Image.d;
        this.I0 = image;
        this.J0 = image;
        this.R0 = 1.0f;
        this.S0 = Collections.EMPTY_MAP;
        this.U0 = -1L;
        this.V0 = null;
        this.X0 = ServerEffect.NONE;
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.u1 = OfferVkVideo.NONE;
        this.y1 = new c();
    }

    public static Map Eb(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                StatPixel statPixel = new StatPixel(optJSONObject);
                StatPixel.a aVar = statPixel.b;
                if (!hashMap.containsKey(aVar)) {
                    hashMap.put(aVar, new nsk0(new ArrayList()));
                }
                ((nsk0) hashMap.get(aVar)).a.add(statPixel);
            }
        }
        return hashMap;
    }

    @NonNull
    public static Map Fb(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_MAP;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
            if (jSONObject != null) {
                try {
                    Integer valueOf = Integer.valueOf(jSONObject.optInt("quality"));
                    JSONArray optJSONArray = jSONObject.optJSONArray("params");
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    int length2 = optJSONArray.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        String string = optJSONArray.getString(i2);
                        if (string.equalsIgnoreCase("neurohd")) {
                            string = "neuroHD";
                        }
                        arrayList.add(string);
                    }
                    Pair pair = new Pair(valueOf, arrayList);
                    linkedHashMap.put(pair.d(), pair.g());
                } catch (Throwable unused) {
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        }
        p4g.a aVar = p4g.a;
        return Collections.unmodifiableMap(linkedHashMap);
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean A0() {
        return this.U;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean A1() {
        return q0() && this.W0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final VideoSkippablePart A2() {
        return this.w1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int A7() {
        return this.D0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Boolean Aa() {
        return this.f1;
    }

    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject put = jSONObject.put("video_id", this.c).put("owner_id", this.b.b).put("ov_id", this.P0);
            Owner owner = this.v0;
            JSONObject put2 = put.put("owner", owner != null ? owner.e5() : null).put("user_id", this.d).put("title", this.l).put("duration", this.e).put("image", this.I0.Gb()).put("first_frame", this.J0.Gb()).put("width", this.m0).put("height", this.n0).put("date", this.q).put("published_at", this.r).put("is_fave", this.i0).put("is_video_subscription_hidden", this.h0).put("platform", this.o).put("content_restricted_message", this.N0).put("volume_multiplier", this.R0).put("can_repost", this.H ? 1 : 0).put("can_comment", this.B ? 1 : 0).put("can_like", this.C ? 1 : 0).put("can_dislike", this.D ? 1 : 0).put("can_remove_from_recommendations", this.E ? 1 : 0).put("can_download", this.L.i()).put("comments", this.v).put("viewed_duration", this.h).put("viewed_duration_timestamp", this.i).put("partner_text", this.Y0);
            TimelineThumbs timelineThumbs = this.K0;
            JSONObject put3 = put2.put("timeline_thumbs", timelineThumbs != null ? timelineThumbs.e5() : null).put("can_play_in_background", this.K ? 1 : 0).put("is_spherical", this.Z0).put("episodes", !this.a1.isEmpty() ? zb() : null).put("is_archival_content", this.d1).put("need_mute", this.Q0 ? 1 : 0);
            VideoRestriction videoRestriction = this.O0;
            JSONObject put4 = put3.put("restriction", videoRestriction != null ? videoRestriction.e5() : null).put("can_edit_privacy", this.e1).put("is_from_message", this.h1);
            InteractiveInfo interactiveInfo = this.g0;
            JSONObject put5 = put4.put("interactive_info", interactiveInfo != null ? interactiveInfo.e5() : null).put("type", this.p).put("access_key", this.r0).put("views", this.s).put("description", this.m).put("share_url", this.n);
            Long l = this.k1;
            put5.put("archival_content_published_date", l != null ? Long.valueOf(l.longValue() / 1000) : null).put("playlist_mark_album_id", this.m1).put("playlist_mark_album_owner_id", this.n1).put("has_market_items", this.o1).put("market_items_count", this.p1).put("is_draft", this.q1 ? 1 : 0).put("vk_live_channel_url", this.r1).put("vk_live_channel_name", this.s1).put("vk_live_slot_url", this.t1).put("offer_vkvideo", this.u1).put("uma_track_id", this.v1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("count", this.u);
            jSONObject2.put("user_likes", this.x ? 1 : 0);
            jSONObject.put("likes", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("count", this.w);
            jSONObject3.put("user_reposted", this.y ? 1 : 0);
            jSONObject.put("reposts", jSONObject3);
            VideoUrlStorage videoUrlStorage = this.g;
            if (videoUrlStorage != null) {
                JSONObject jSONObject4 = new JSONObject();
                videoUrlStorage.zb(null, jSONObject4);
                jSONObject.put("trailer", jSONObject4);
            }
            VideoDownloadDto videoDownloadDto = this.M;
            if (videoDownloadDto != null) {
                jSONObject.put("download", videoDownloadDto.e5());
            }
            VideoDonut videoDonut = this.N;
            if (videoDonut != null) {
                jSONObject.put("donut", videoDonut.e5());
            }
            return jSONObject;
        } catch (JSONException e) {
            L.i(e);
            return jSONObject;
        }
    }

    @Override // com.vk.dto.common.VideoFile
    public final TimelineThumbs B0() {
        return this.K0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int B4() {
        return this.t;
    }

    public final boolean Bb() {
        Collection<VideoUrlInfo> values = this.f.b.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        for (VideoUrlInfo videoUrlInfo : values) {
            if (videoUrlInfo.b == -4 && !videoUrlInfo.g) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void C0(int i) {
        this.e = i;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String C1() {
        return this.r0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean C2() {
        return this instanceof ClipVideoFile;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String C3() {
        return this.G0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean C5() {
        return this.e0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void C7(@NonNull Map<StatPixel.a, nsk0> map) {
        this.S0 = map;
    }

    public final boolean Cb() {
        Collection<VideoUrlInfo> values = this.f.b.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        for (VideoUrlInfo videoUrlInfo : values) {
            if (videoUrlInfo.b == -2 && !videoUrlInfo.g) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean D5() {
        return this.D;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void D9(@NonNull Image image) {
        this.I0 = image;
    }

    public final boolean Db() {
        List list;
        Collection<VideoUrlInfo> values = this.f.b.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        for (VideoUrlInfo videoUrlInfo : values) {
            VideoUrl.Companion.getClass();
            list = VideoUrl.MP4_URLS;
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((VideoUrl) it.next()).m() == videoUrlInfo.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void E(@NonNull String str) {
        this.r0 = str;
    }

    @Override // com.vk.dto.common.VideoFile
    public final float E0() {
        com.vk.dto.common.im.Image image;
        int i;
        int i2;
        int i3;
        int i4 = this.m0;
        if (i4 > 0 && (i3 = this.n0) > 0) {
            return (i4 * 1.0f) / i3;
        }
        Image w2 = w2();
        if (w2 == null) {
            return -1.0f;
        }
        ArrayList arrayList = w2.c;
        ImageSize imageSize = !arrayList.isEmpty() ? (ImageSize) xy9.b(1, arrayList) : null;
        if (imageSize == null || (i = (image = imageSize.d).b) == 0 || (i2 = image.c) == 0) {
            return -1.0f;
        }
        return i / i2;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void E4(@NonNull String str) {
        this.k = str;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final VideoCanDownload F4() {
        VideoDownloadDto videoDownloadDto;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_DOWNLOAD_RESTRICTION_SPLITTING;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures) || (videoDownloadDto = this.M) == null) {
            return this.L;
        }
        boolean z = videoDownloadDto.c;
        boolean z2 = videoDownloadDto.b;
        return (z2 && z) ? VideoCanDownload.CACHE_AND_FILE : z2 ? VideoCanDownload.CACHE : z ? VideoCanDownload.FILE : VideoCanDownload.NO;
    }

    @Override // com.vk.dto.common.VideoFile
    public final String F5() {
        return this.i1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void F8(@NonNull List<VideoEpisode> list) {
        this.a1 = list;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void F9(String str) {
        this.q0 = str;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean Fa() {
        return this.H;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void G5(int i) {
        this.n0 = i;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean G7() {
        return this.R;
    }

    @Override // com.vk.dto.common.VideoFile
    public final VideoAccessInfo G9() {
        return this.A;
    }

    public final void Gb(@NonNull Image image) {
        this.J0 = image;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final Counters H() {
        if (this.B0 == null) {
            this.B0 = new Counters();
        }
        return this.B0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Long H1() {
        return this.n1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean H3() {
        return this.E;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean H6() {
        Object obj;
        Iterator<T> it = this.f.b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            VideoUrlInfo videoUrlInfo = (VideoUrlInfo) obj;
            if (videoUrlInfo.f && brm0.B(videoUrlInfo.c, "file://", false)) {
                break;
            }
        }
        return obj != null;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final TitleAction Ha() {
        return this.c1;
    }

    public final void Hb(String str) {
        this.P0 = str;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final UserId I0() {
        return this.b;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean I1() {
        return this.k0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean I6() {
        return this.K;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean Ia() {
        return this.h1;
    }

    public final void Ib(@NonNull String str) {
        this.p = str;
    }

    @Override // com.vk.dto.common.VideoFile
    public final String J1() {
        return this.N0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void J6(VideoNotificationsStatus videoNotificationsStatus) {
        this.u0 = videoNotificationsStatus;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean J8() {
        return this.J;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void J9(LivePlayBackSettings livePlayBackSettings) {
        this.T0 = livePlayBackSettings;
    }

    @Override // com.vk.dto.common.VideoFile
    public final LivePlayBackSettings K1() {
        return this.T0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Integer K2() {
        return this.p1;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String K5() {
        return this.j;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Integer L3() {
        return this.j1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final VideoUrlStorage L7() {
        return this.g;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int L8() {
        return this.s;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean L9() {
        return this.s0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final String M0() {
        return this.q0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final String M4() {
        return this.X;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean M5() {
        return this.z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean N() {
        String str = this.p;
        return str != null && str.equals("story");
    }

    @Override // com.vk.dto.common.VideoFile
    public final VideoDownloadDto N5() {
        return this.M;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void N6(boolean z) {
        this.I = z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void N8(String str) {
        this.p0 = str;
    }

    @Override // com.vk.dto.common.VideoFile
    public final long Na() {
        return this.U0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final VideoRestriction O() {
        return this.O0;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final ServerEffect O5() {
        return this.X0;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(@NonNull Serializer serializer) {
        String str;
        if (this instanceof MusicVideoFile) {
            str = "music_video";
        } else if (this instanceof ClipVideoFile) {
            str = "short_video";
        } else if (this instanceof InteractiveVideoFile) {
            str = "interactive";
        } else {
            String str2 = "video_message";
            if (!epx.f(this.p, "video_message")) {
                str2 = "story";
                if (!epx.f(this.p, "story")) {
                    str = "video";
                }
            }
            str = str2;
        }
        serializer.j0(str);
        serializer.e0(this.b);
        serializer.S(this.c);
        serializer.S(this.e);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.o);
        serializer.S(this.q);
        serializer.S(this.s);
        serializer.i0(this.v0);
        serializer.j0(this.r0);
        serializer.S(this.u);
        serializer.S(this.v);
        serializer.S(this.w);
        serializer.S(this.x ? 1 : 0);
        serializer.S(this.y ? 1 : 0);
        serializer.S(this.z ? 1 : 0);
        serializer.i0(this.A);
        serializer.S(this.B ? 1 : 0);
        serializer.S(this.C ? 1 : 0);
        serializer.S(this.D ? 1 : 0);
        serializer.S(this.E ? 1 : 0);
        serializer.S(this.F ? 1 : 0);
        serializer.S(this.G ? 1 : 0);
        serializer.S(this.H ? 1 : 0);
        serializer.S(this.I ? 1 : 0);
        serializer.S(this.R ? 1 : 0);
        serializer.S(this.Q ? 1 : 0);
        serializer.S(this.O ? 1 : 0);
        serializer.S(this.m0);
        serializer.S(this.n0);
        serializer.S(this.w0);
        h330.d(serializer, this.x0);
        h330.d(serializer, this.y0);
        serializer.Y(this.z0);
        serializer.S(this.t);
        serializer.S(this.D0);
        serializer.S(this.C0 ? 1 : 0);
        serializer.j0(this.E0);
        serializer.j0(this.G0);
        serializer.S(this.H0);
        serializer.Y(this.A0);
        serializer.L(this.S ? (byte) 1 : (byte) 0);
        serializer.L(this.T ? (byte) 1 : (byte) 0);
        serializer.L(this.t0 ? (byte) 1 : (byte) 0);
        serializer.e0(this.d);
        serializer.L(this.U ? (byte) 1 : (byte) 0);
        serializer.j0(this.V);
        serializer.j0(this.W);
        serializer.j0(this.X);
        serializer.L(this.i0 ? (byte) 1 : (byte) 0);
        serializer.J(this.h0);
        serializer.i0(this.Y);
        serializer.i0(this.I0);
        serializer.i0(this.J0);
        serializer.i0(this.K0);
        serializer.J(this.f1);
        serializer.J(this.g1);
        serializer.S(this.P ? 1 : 0);
        serializer.j0(this.N0);
        serializer.i0(this.a0);
        serializer.L(this.Z ? (byte) 1 : (byte) 0);
        serializer.i0(this.O0);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.P0);
        serializer.L(this.Q0 ? (byte) 1 : (byte) 0);
        serializer.P(this.R0);
        Map<StatPixel.a, nsk0> map = this.S0;
        if (map == null) {
            serializer.S(-1);
        } else {
            Iterator c2 = n.c(serializer, map);
            while (c2.hasNext()) {
                Map.Entry entry = (Map.Entry) c2.next();
                serializer.j0(((StatPixel.a) entry.getKey()).a());
                s3q0 s3q0Var = s3q0.a;
                serializer.f0(((nsk0) entry.getValue()).a);
            }
        }
        serializer.L(this.b0 ? (byte) 1 : (byte) 0);
        serializer.i0(this.c0);
        serializer.i0(this.d0);
        serializer.i0(this.T0);
        serializer.L(this.e0 ? (byte) 1 : (byte) 0);
        serializer.i0(this.B0);
        serializer.L(this.J ? (byte) 1 : (byte) 0);
        serializer.Y(this.U0);
        serializer.J(this.V0);
        serializer.b0(this.h);
        serializer.b0(this.i);
        serializer.L(this.W0 ? (byte) 1 : (byte) 0);
        LinkedHashMap a2 = this.f0.a();
        serializer.S(a2.size());
        for (Map.Entry entry2 : a2.entrySet()) {
            serializer.S(((Integer) entry2.getKey()).intValue());
            s3q0 s3q0Var2 = s3q0.a;
            serializer.l0((List) entry2.getValue());
        }
        VideoCanDownload videoCanDownload = this.L;
        serializer.S(videoCanDownload != null ? videoCanDownload.i() : 0);
        serializer.j0(this.F0);
        serializer.j0(this.X0.h());
        serializer.S(this.r);
        serializer.j0(this.Y0);
        serializer.L(this.l0 ? (byte) 1 : (byte) 0);
        serializer.L(this.Z0 ? (byte) 1 : (byte) 0);
        serializer.L(this.K ? (byte) 1 : (byte) 0);
        h330.d(serializer, this.a1);
        serializer.e0(this.c1);
        serializer.L(this.d1 ? (byte) 1 : (byte) 0);
        serializer.L(this.e1 ? (byte) 1 : (byte) 0);
        serializer.L(this.h1 ? (byte) 1 : (byte) 0);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.i0(this.g0);
        VideoNotificationsStatus videoNotificationsStatus = this.u0;
        if (videoNotificationsStatus != null) {
            serializer.j0(videoNotificationsStatus.name());
        } else {
            serializer.j0(null);
        }
        serializer.j0(this.p);
        h330.d(serializer, this.b1);
        serializer.m0(this.i1);
        serializer.V(this.j1);
        serializer.b0(this.k1);
        serializer.V(this.l1);
        serializer.b0(this.n1);
        serializer.V(this.m1);
        serializer.J(this.o1);
        serializer.m0(this.r1);
        serializer.m0(this.s1);
        serializer.m0(this.t1);
        serializer.m0(this.u1.i());
        serializer.V(this.p1);
        serializer.L(this.q1 ? (byte) 1 : (byte) 0);
        serializer.S(this.v1);
        serializer.i0(this.w1);
        serializer.i0(this.M);
        serializer.i0(this.N);
        serializer.V(this.x1);
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean O9() {
        return this.x;
    }

    @Override // com.vk.dto.common.VideoFile
    public final String P() {
        return this.p0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void P2(int i) {
        this.v = i;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void P6(OrdAdInfo ordAdInfo) {
        this.d0 = ordAdInfo;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Boolean P8() {
        return this.V0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final bss0 Pa() {
        return this.y1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Boolean Q() {
        return this.g1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean Q0() {
        return this.O;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void Q4(int i) {
        this.q = i;
    }

    @Override // com.vk.dto.common.VideoFile
    public final InteractiveInfo R7() {
        return this.g0;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String S3() {
        return this.Y0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void S5(int i) {
        this.w = i;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean Sa() {
        return this.l0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean T1() {
        return (!q0() || this.W0 || this.s1 == null) ? false : true;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean T3() {
        if (Db() || Cb()) {
            return true;
        }
        return (Bb() && !z0()) || (this instanceof ClipVideoFile);
    }

    @Override // com.vk.dto.common.VideoFile
    public final String T7() {
        return this.f.T7();
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean U() {
        return this.t0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final VideoDonut U3() {
        return this.N;
    }

    @Override // com.vk.dto.common.VideoFile
    public final InstreamAd U7() {
        return this.a0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void V9(@NonNull UserId userId) {
        this.b = userId;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int W7() {
        return this.w;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void W8(int i) {
        this.u = i;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean W9() {
        return Objects.equals(this.p, "interactive");
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean X() {
        return this.i0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final VideoAdInfo X0() {
        return this.c0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean X2() {
        int i = this.w0;
        return i == 3 || i == 6;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void Xa(boolean z) {
        this.S = z;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final VerifyInfo Y() {
        return this.o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.dto.common.VideoFile
    public final void Y2(@NonNull List<? extends PrivacySetting.PrivacyRule> list) {
        this.y0 = list;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final List<VideoEpisode> Y3() {
        return this.a1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final String Y6() {
        return this.P0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean Z1() {
        return this.q1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void Z7() {
        this.l0 = true;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean Z9() {
        return this.Q;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String a1() {
        int i;
        String str = this.M0;
        if (str != null) {
            return str;
        }
        UserId userId = this.b;
        if (userId == UserId.d || (i = this.c) == 0) {
            return r11.b(new StringBuilder(), userId.b, '_', this.c);
        }
        String b2 = r11.b(new StringBuilder(), userId.b, '_', i);
        this.M0 = b2;
        return b2;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void a2(int i) {
        this.D0 = i;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Integer a6() {
        return Integer.valueOf(this.v1);
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean aa() {
        return this.C0;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final OfferVkVideo ab() {
        return this.u1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int b0() {
        return this.q;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void b2(@NonNull VideoCanDownload videoCanDownload) {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_DOWNLOAD_RESTRICTION_SPLITTING;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            this.M = null;
        }
        this.L = videoCanDownload;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final List<VideoFile> b7() {
        return this.b1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void bb() {
        this.C0 = true;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean c0() {
        return this.B;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int c1() {
        return this.v;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final VideoFileOld copy() {
        Parcel obtain = Parcel.obtain();
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Serializer.g gVar = new Serializer.g(obtain);
        O7(gVar);
        obtain.setDataPosition(0);
        VideoFileOld a2 = com.vk.dto.common.c.a(gVar);
        obtain.recycle();
        return a2;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String d7() {
        return this.E0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean d8() {
        return (Db() || Cb() || Bb() || v()) && !this.R && !z0() && TextUtils.isEmpty(this.o);
    }

    @Override // com.vk.dto.common.VideoFile
    public final Map<StatPixel.a, nsk0> e0() {
        return this.S0;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final Image e1() {
        return this.J0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean e2() {
        return this.m0 < this.n0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void e4(Boolean bool) {
        this.g1 = bool;
    }

    public JSONObject e5() {
        JSONObject Ab = Ab();
        this.f.zb(null, Ab);
        return Ab;
    }

    @Override // com.vk.dto.common.VideoFile
    public final JSONObject e8(String str) {
        JSONObject Ab = Ab();
        this.f.zb(str, Ab);
        return Ab;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void eb(VideoSkippablePart videoSkippablePart) {
        this.w1 = videoSkippablePart;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VideoFileOld videoFileOld = (VideoFileOld) obj;
            if (Objects.equals(this.b, videoFileOld.b) && this.c == videoFileOld.c && this.w0 == videoFileOld.w0 && this.O == videoFileOld.O && Objects.equals(this.Y, videoFileOld.Y) && Objects.equals(this.r0, videoFileOld.r0) && this.f.equals(videoFileOld.f) && Objects.equals(this.g, videoFileOld.g) && this.U0 == videoFileOld.U0 && Objects.equals(this.V0, videoFileOld.V0) && this.t0 == videoFileOld.t0 && Objects.equals(this.l, videoFileOld.l) && Objects.equals(this.m, videoFileOld.m) && this.x == videoFileOld.x && this.u == videoFileOld.u && this.v == videoFileOld.v && Objects.equals(this.x0, videoFileOld.x0) && Objects.equals(this.y0, videoFileOld.y0) && Objects.equals(this.L, videoFileOld.L) && this.r == videoFileOld.r && this.i0 == videoFileOld.i0 && Objects.equals(this.h0, videoFileOld.h0) && this.X0 == videoFileOld.X0 && Objects.equals(this.Y0, videoFileOld.Y0) && Boolean.valueOf(this.Z0).equals(Boolean.valueOf(videoFileOld.Z0)) && Objects.equals(this.c1, videoFileOld.c1) && Boolean.valueOf(this.K).equals(Boolean.valueOf(videoFileOld.K)) && this.d1 == videoFileOld.d1 && this.e1 == videoFileOld.e1 && Objects.equals(this.g0, videoFileOld.g0) && Objects.equals(this.d0, videoFileOld.d0) && Objects.equals(this.u0, videoFileOld.u0) && Objects.equals(this.f1, videoFileOld.f1) && Objects.equals(this.g1, videoFileOld.g1) && Objects.equals(this.I0, videoFileOld.I0) && Objects.equals(this.i1, videoFileOld.i1) && Objects.equals(this.j1, videoFileOld.j1) && Objects.equals(this.k1, videoFileOld.k1) && Objects.equals(this.l1, videoFileOld.l1) && Objects.equals(this.m1, videoFileOld.m1) && Objects.equals(this.n1, videoFileOld.n1) && Objects.equals(this.o1, videoFileOld.o1) && Objects.equals(this.p1, videoFileOld.p1) && Boolean.valueOf(this.q1).equals(Boolean.valueOf(videoFileOld.q1)) && Objects.equals(this.r1, videoFileOld.r1) && Objects.equals(this.s1, videoFileOld.s1) && Objects.equals(this.t1, videoFileOld.t1) && this.u1 == videoFileOld.u1 && Integer.valueOf(this.v1).equals(Integer.valueOf(videoFileOld.v1)) && Objects.equals(this.X, videoFileOld.X) && Objects.equals(this.w1, videoFileOld.w1) && Objects.equals(this.M, videoFileOld.M) && Objects.equals(this.N, videoFileOld.N) && Objects.equals(this.x1, videoFileOld.x1)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void f0(boolean z) {
        this.x = z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void f1(Owner owner) {
        this.v0 = owner;
        if (owner == null) {
            return;
        }
        this.p0 = owner.c;
        this.q0 = owner.e;
        this.s0 = owner.i(8);
        this.t0 = owner.i(4);
        VerifyInfo verifyInfo = owner.f;
        if (verifyInfo != null) {
            this.o0 = verifyInfo;
        }
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String f2() {
        return this.F0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void f8(int i) {
        this.w0 = i;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean g1() {
        return this.G;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Boolean g4() {
        return this.o1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int getDuration() {
        return this.e;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int getHeight() {
        return this.n0;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final Image getImage() {
        return this.I0;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String getPlatform() {
        return this.o;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final List<PrivacySetting.PrivacyRule> getPrivacy() {
        return this.x0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final long getTimestamp() {
        return this.A0;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String getTitle() {
        return this.l;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String getType() {
        return this.p;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final UserId getUid() {
        return this.d;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int getWidth() {
        return this.m0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean h1() {
        return this.T;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void h2(boolean z) {
        this.H = z;
    }

    public int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.c), Integer.valueOf(this.w0), Boolean.valueOf(this.O), this.Y, this.r0, this.f, this.g, Long.valueOf(this.U0), this.V0, Boolean.valueOf(this.t0), this.l, this.m, Boolean.valueOf(this.x), Integer.valueOf(this.u), Integer.valueOf(this.v), this.x0, this.y0, this.L, Integer.valueOf(this.r), Boolean.valueOf(this.i0), this.h0, this.X0, this.Y0, Boolean.valueOf(this.Z0), this.c1, Boolean.valueOf(this.K), Boolean.valueOf(this.d1), Boolean.valueOf(this.e1), this.g0, this.d0, this.u0, this.f1, this.g1, this.I0, this.i1, this.j1, this.k1, this.l1, this.m1, this.n1, this.o1, this.p1, Boolean.valueOf(this.q1), this.r1, this.s1, this.t1, this.u1, Integer.valueOf(this.v1), this.X, this.w1, this.M, this.N, this.x1);
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean i0() {
        return this.C;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final List<PrivacySetting.PrivacyRule> i6() {
        return this.y0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean i9() {
        return this.I;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean isEmpty() {
        return this.f.b.isEmpty();
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean isExternal() {
        Map<String, VideoUrlInfo> map = this.f.b;
        Collection<VideoUrlInfo> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((VideoUrlInfo) obj).f) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == map.size();
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean isHorizontal() {
        return this.m0 > this.n0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean j0() {
        return this.S;
    }

    @Override // com.vk.dto.common.VideoFile
    public final String j1() {
        return this.m;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Integer j2() {
        return this.l1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Long j5() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.dto.common.VideoFile
    public final void jb(@NonNull List<? extends VideoFile> list) {
        this.b1 = list;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean k0() {
        return this.Q0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int k1() {
        return this.r;
    }

    @Override // com.vk.dto.common.VideoFile
    public final String k2() {
        return this.f.toString();
    }

    @Override // com.vk.dto.common.VideoFile
    public final void k3(boolean z) {
        this.t0 = z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void k4(boolean z) {
        this.Z = z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void k6(boolean z) {
        this.F = z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int l1() {
        return this.u;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int l6() {
        return this.w0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void l8(int i) {
        this.m0 = i;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void la(int i) {
        this.r = i;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void m(@NonNull String str) {
        this.l = str;
    }

    @Override // com.vk.dto.common.VideoFile
    public final ActionLink m1() {
        return this.Y;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Boolean m3() {
        return this.h0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void m6(long j) {
        this.U0 = j;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void m8(String str) {
        this.X = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.dto.common.VideoFile
    public final void n2(@NonNull List<? extends PrivacySetting.PrivacyRule> list) {
        this.x0 = list;
    }

    @Override // com.vk.dto.common.VideoFile
    public final float n5() {
        return this.R0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void n8(boolean z) {
        this.b0 = z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final int o0() {
        return this.c;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void o5(Integer num) {
        this.l1 = num;
    }

    @Override // com.vk.dto.common.VideoFile
    public final VideoNotificationsStatus o8() {
        return this.u0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean p0() {
        return this.b0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final OrdAdInfo p1() {
        return this.d0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean p2() {
        return this.d1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void p5(Boolean bool) {
        this.V0 = bool;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void pb(boolean z) {
        this.C = z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean q0() {
        return x0() || z0();
    }

    @Override // com.vk.dto.common.VideoFile
    public final void q6(Boolean bool) {
        this.h0 = bool;
    }

    @Override // com.vk.dto.common.VideoFile
    public final String r() {
        return this.W;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void r0(boolean z) {
        this.B = z;
    }

    public String r1() {
        if (this.L0 == null) {
            if (this.c != 0 && fkq0.c(this.b)) {
                this.L0 = "" + this.b + BundleUtil.UNDERLINE_TAG + this.c;
            } else if (!TextUtils.isEmpty(this.P0)) {
                this.L0 = this.P0;
            } else if (TextUtils.isEmpty(this.f.Cb())) {
                this.L0 = UUID.randomUUID().toString();
            } else {
                this.L0 = this.f.Cb();
            }
        }
        return this.L0;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String ra() {
        return this.n;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void rb(VideoAdInfo videoAdInfo) {
        this.c0 = videoAdInfo;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Owner s() {
        return this.v0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void s0(boolean z) {
        this.i0 = z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void s2(String str) {
        this.m = str;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean s5() {
        return this.P;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void s9(boolean z) {
        this.y = z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void setCover(boolean z) {
        this.k0 = true;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void setTimestamp(long j) {
        this.A0 = j;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void setTrackCode(String str) {
        this.W = str;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean t0() {
        return this.F;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean t2() {
        return this.p.equals("music_video") || this.p.equals("ugc_music_video");
    }

    @Override // com.vk.dto.common.VideoFile
    public final Integer t9() {
        return this.m1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void ta(int i) {
        this.s = i;
    }

    @NonNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("video");
        sb.append(this.b);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(this.c);
        if (myc0.f(this.r0)) {
            str = BundleUtil.UNDERLINE_TAG + this.r0;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.vk.dto.common.VideoFile
    public final void u7(ActionLink actionLink) {
        this.Y = actionLink;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void u9(boolean z) {
        this.J = z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void ua(@NonNull VideoUrlStorage videoUrlStorage) {
        this.f = videoUrlStorage;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean v() {
        return this.w0 > 0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean v2() {
        return this.y;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Long v4() {
        return this.h;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Image w2() {
        Image Eb = this.J0.Eb();
        return Eb == null ? this.I0.Eb() : Eb;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final dpe0 w4() {
        return this.f0;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void w5(VideoDonut videoDonut) {
        this.N = videoDonut;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean w8() {
        return "YouTube".equalsIgnoreCase(this.o);
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final VideoUrlStorage w9() {
        return this.f;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean x0() {
        int i = this.w0;
        return i == 2 || i == 4 || i == 1;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean x5() {
        return this.j0;
    }

    @Override // com.vk.dto.common.VideoFile
    @NonNull
    public final String x8() {
        return this.k;
    }

    @Override // com.vk.dto.common.VideoFile
    public final void y7(int i) {
        this.c = i;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean yb() {
        return this.Z;
    }

    @Override // com.vk.dto.common.VideoFile
    public final boolean z0() {
        return this.w0 == 5;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.vk.dto.common.VideoFile
    public final DownloadRestrictionReason z2() {
        VideoDownloadDto videoDownloadDto = this.M;
        if (videoDownloadDto == null) {
            return DownloadRestrictionReason.UNKNOWN;
        }
        String str = videoDownloadDto.d;
        switch (str.hashCode()) {
            case -1874815190:
                if (str.equals("download_processing")) {
                    return DownloadRestrictionReason.PROCESSING;
                }
                break;
            case 606546354:
                if (str.equals("download_restricted_by_content_owner")) {
                    return DownloadRestrictionReason.LICENCE;
                }
                break;
            case 2125047288:
                if (str.equals("download_restricted_by_owner")) {
                    return DownloadRestrictionReason.AUTHOR;
                }
                break;
            case 2125630540:
                if (str.equals("download_restricted_by_place")) {
                    return DownloadRestrictionReason.TECHNICAL;
                }
                break;
        }
        return DownloadRestrictionReason.UNKNOWN;
    }

    @Override // com.vk.dto.common.VideoFile
    public final Long z7() {
        return this.k1;
    }

    public final JSONArray zb() {
        JSONArray jSONArray = new JSONArray();
        for (VideoEpisode videoEpisode : this.a1) {
            videoEpisode.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", videoEpisode.b);
            jSONObject.put("text", videoEpisode.c);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public VideoFileOld(Serializer serializer) {
        UserId userId = UserId.d;
        this.b = userId;
        this.d = userId;
        this.f = new VideoUrlStorage();
        this.k = "";
        this.n = "";
        this.L = VideoCanDownload.NO;
        this.f0 = new dpe0();
        this.o0 = new VerifyInfo();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        Image image = Image.d;
        this.I0 = image;
        this.J0 = image;
        this.R0 = 1.0f;
        this.S0 = Collections.EMPTY_MAP;
        this.U0 = -1L;
        Object obj = null;
        this.V0 = null;
        this.X0 = ServerEffect.NONE;
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.u1 = OfferVkVideo.NONE;
        this.y1 = new c();
        this.b = (UserId) serializer.A(UserId.class.getClassLoader());
        this.c = serializer.u();
        this.e = serializer.u();
        this.l = serializer.H();
        this.m = serializer.H();
        this.n = serializer.H();
        this.o = serializer.H();
        this.q = serializer.u();
        this.s = serializer.u();
        f1((Owner) serializer.G(Owner.class.getClassLoader()));
        this.r0 = serializer.H();
        this.u = serializer.u();
        this.v = serializer.u();
        this.w = serializer.u();
        this.x = serializer.u() == 1;
        this.y = serializer.u() == 1;
        this.z = serializer.u() == 1;
        this.A = (VideoAccessInfo) serializer.G(VideoAccessInfo.class.getClassLoader());
        this.B = serializer.u() == 1;
        this.C = serializer.u() == 1;
        this.D = serializer.u() == 1;
        this.E = serializer.u() == 1;
        this.F = serializer.u() == 1;
        this.G = serializer.u() == 1;
        this.H = serializer.u() == 1;
        this.I = serializer.u() == 1;
        this.R = serializer.u() == 1;
        this.Q = serializer.u() == 1;
        this.O = serializer.u() == 1;
        this.m0 = serializer.u();
        this.n0 = serializer.u();
        this.w0 = serializer.u();
        h330.b(serializer, this.x0, PrivacySetting.PrivacyRule.class);
        h330.b(serializer, this.y0, PrivacySetting.PrivacyRule.class);
        this.z0 = serializer.w();
        this.t = serializer.u();
        this.D0 = serializer.u();
        this.C0 = serializer.u() == 1;
        this.E0 = serializer.H();
        this.G0 = serializer.H();
        this.H0 = serializer.u();
        this.A0 = serializer.w();
        this.S = serializer.m();
        this.T = serializer.m();
        this.t0 = serializer.m();
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        this.U = serializer.m();
        this.V = serializer.H();
        this.W = serializer.H();
        this.X = serializer.H();
        this.i0 = serializer.m();
        this.h0 = serializer.n();
        this.Y = (ActionLink) serializer.G(ActionLink.class.getClassLoader());
        this.I0 = (Image) serializer.G(Image.class.getClassLoader());
        this.J0 = (Image) serializer.G(Image.class.getClassLoader());
        this.K0 = (TimelineThumbs) serializer.G(TimelineThumbs.class.getClassLoader());
        this.f1 = serializer.n();
        this.g1 = serializer.n();
        this.P = serializer.u() == 1;
        this.N0 = serializer.H();
        this.a0 = (InstreamAd) serializer.G(InstreamAd.class.getClassLoader());
        this.Z = serializer.m();
        this.O0 = (VideoRestriction) serializer.G(VideoRestriction.class.getClassLoader());
        this.j = serializer.H();
        this.k = serializer.H();
        this.P0 = serializer.H();
        this.Q0 = serializer.m();
        this.R0 = serializer.s();
        this.S0 = serializer.z(new d230(22), new dl70(25));
        this.b0 = serializer.m();
        this.c0 = (VideoAdInfo) serializer.G(VideoAdInfo.class.getClassLoader());
        this.d0 = (OrdAdInfo) serializer.G(OrdAdInfo.class.getClassLoader());
        this.T0 = (LivePlayBackSettings) serializer.G(LivePlayBackSettings.class.getClassLoader());
        this.e0 = serializer.m();
        this.B0 = (Counters) serializer.G(Counters.class.getClassLoader());
        this.J = serializer.m();
        this.U0 = serializer.w();
        this.V0 = serializer.n();
        this.h = serializer.x();
        this.i = serializer.x();
        this.W0 = serializer.m();
        this.f0 = epe0.a(serializer.z(new wx30(21), new l140(27)));
        VideoCanDownload.a aVar = VideoCanDownload.Companion;
        int u = serializer.u();
        aVar.getClass();
        this.L = VideoCanDownload.a.a(u);
        this.F0 = serializer.H();
        this.X0 = ServerEffect.a(serializer.H());
        this.r = serializer.u();
        this.Y0 = serializer.H();
        this.l0 = serializer.m();
        this.Z0 = serializer.m();
        this.K = serializer.m();
        h330.b(serializer, this.a1, VideoEpisode.class);
        this.c1 = (TitleAction) serializer.A(TitleAction.class.getClassLoader());
        this.d1 = serializer.m();
        this.e1 = serializer.m();
        this.h1 = serializer.m();
        this.f = (VideoUrlStorage) serializer.G(VideoUrlStorage.class.getClassLoader());
        this.g = (VideoUrlStorage) serializer.G(VideoUrlStorage.class.getClassLoader());
        this.g0 = (InteractiveInfo) serializer.G(InteractiveInfo.class.getClassLoader());
        String H = serializer.H();
        if (H != null) {
            VideoNotificationsStatus.Companion.getClass();
            this.u0 = VideoNotificationsStatus.a.a(H);
        } else {
            this.u0 = null;
        }
        this.p = serializer.H();
        h330.b(serializer, this.b1, VideoFile.class);
        this.i1 = serializer.I();
        this.j1 = serializer.v();
        this.k1 = serializer.x();
        this.l1 = serializer.v();
        this.n1 = serializer.x();
        this.m1 = serializer.v();
        this.o1 = serializer.n();
        this.r1 = serializer.I();
        this.s1 = serializer.I();
        this.t1 = serializer.I();
        String I = serializer.I();
        OfferVkVideo.Companion.getClass();
        Iterator<E> it = OfferVkVideo.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((OfferVkVideo) next).i(), I)) {
                obj = next;
                break;
            }
        }
        OfferVkVideo offerVkVideo = (OfferVkVideo) obj;
        this.u1 = offerVkVideo == null ? OfferVkVideo.NONE : offerVkVideo;
        this.p1 = serializer.v();
        this.q1 = serializer.m();
        this.v1 = serializer.u();
        this.w1 = (VideoSkippablePart) serializer.G(VideoSkippablePart.class.getClassLoader());
        this.M = (VideoDownloadDto) serializer.G(VideoDownloadDto.class.getClassLoader());
        this.N = (VideoDonut) serializer.G(VideoDonut.class.getClassLoader());
        this.x1 = serializer.v();
    }

    public VideoFileOld(JSONObject jSONObject) {
        String str;
        boolean z;
        UserId userId = UserId.d;
        this.b = userId;
        this.d = userId;
        this.f = new VideoUrlStorage();
        this.k = "";
        this.n = "";
        this.L = VideoCanDownload.NO;
        this.f0 = new dpe0();
        this.o0 = new VerifyInfo();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        Image image = Image.d;
        this.I0 = image;
        this.J0 = image;
        this.R0 = 1.0f;
        this.S0 = Collections.EMPTY_MAP;
        this.U0 = -1L;
        this.V0 = null;
        this.X0 = ServerEffect.NONE;
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.u1 = OfferVkVideo.NONE;
        this.y1 = new c();
        try {
            this.c = jSONObject.optInt("video_id", jSONObject.optInt("id", jSONObject.optInt("vid")));
            this.b = new UserId(jSONObject.optLong("owner_id"));
            this.d = new UserId(jSONObject.optLong("user_id"));
            this.l = jSONObject.optString("title");
            this.m = jSONObject.optString("description");
            this.n = jSONObject.optString("share_url");
            this.e = jSONObject.optInt("duration");
            long optLong = jSONObject.optLong("viewed_duration", -1L);
            if (optLong > 0) {
                this.h = Long.valueOf(optLong);
            } else {
                this.h = null;
            }
            long optLong2 = jSONObject.optLong("viewed_duration_timestamp", -1L);
            if (optLong2 != -1) {
                this.i = Long.valueOf(optLong2);
            } else if (this.h != null) {
                this.i = Long.valueOf(System.currentTimeMillis());
            } else {
                this.i = null;
            }
            this.m0 = jSONObject.optInt("width");
            this.n0 = jSONObject.optInt("height");
            this.Q = jSONObject.optInt("content_restricted", 0) == 1;
            this.I0 = new Image(jSONObject.optJSONArray("image"));
            this.J0 = new Image(jSONObject.optJSONArray("first_frame"));
            this.q = jSONObject.optInt("date");
            this.r = jSONObject.optInt("published_at");
            this.s = jSONObject.optInt("views");
            this.t = jSONObject.optInt("spectators");
            this.k = jSONObject.optString("uv_stats_place");
            JSONObject optJSONObject = jSONObject.optJSONObject("ads_info");
            if (optJSONObject != null) {
                Serializer.c<VideoAdInfo> cVar = VideoAdInfo.CREATOR;
                this.c0 = (VideoAdInfo) VideoAdInfo.a.a().a(optJSONObject);
            }
            this.b0 = this.c0 != null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("ord_info");
            if (optJSONObject2 != null) {
                Serializer.c<OrdAdInfo> cVar2 = OrdAdInfo.CREATOR;
                this.d0 = (OrdAdInfo) OrdAdInfo.a.a().a(optJSONObject2);
            }
            this.e0 = jSONObject.optBoolean("need_my_tracker");
            JSONObject optJSONObject3 = jSONObject.optJSONObject(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
            if (optJSONObject3 != null) {
                Serializer.c<InstreamAd> cVar3 = InstreamAd.CREATOR;
                this.a0 = (InstreamAd) InstreamAd.a.a().a(optJSONObject3);
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("restriction");
            if (optJSONObject4 != null) {
                if (optJSONObject4.has("offer_vkvideo")) {
                    this.u1 = OfferVkVideo.LISTING;
                } else {
                    this.O0 = (VideoRestriction) VideoRestriction.k.a(optJSONObject4);
                }
            }
            String optString = jSONObject.optString("ov_id");
            if (!TextUtils.isEmpty(optString)) {
                this.P0 = optString;
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("files");
            JSONObject optJSONObject6 = jSONObject.optJSONObject("interactive_info");
            if (optJSONObject6 != null) {
                Serializer.c<InteractiveInfo> cVar4 = InteractiveInfo.CREATOR;
                InteractiveInfo a2 = InteractiveInfo.a.a(this.P0, optJSONObject6);
                this.g0 = a2;
                if (a2 != null) {
                    optJSONObject5 = optJSONObject6.optJSONObject("current_video").optJSONObject("files");
                    String str2 = this.g0.c;
                    this.P0 = str2 == null ? this.P0 : str2;
                }
            }
            this.f = VideoUrlStorage.d.a(jSONObject, optJSONObject5);
            if (optJSONObject5 != null) {
                this.j = optJSONObject5.optString("failover_host");
            }
            JSONObject optJSONObject7 = jSONObject.optJSONObject("trailer");
            if (optJSONObject7 != null) {
                this.g = VideoUrlStorage.d.a(jSONObject, optJSONObject7);
            }
            this.o = jSONObject.optString("platform");
            this.p = jSONObject.optString("type", "video");
            if (jSONObject.has("likes")) {
                this.u = jSONObject.getJSONObject("likes").optInt("count");
                this.x = jSONObject.getJSONObject("likes").optInt("user_likes") == 1;
            }
            if (jSONObject.has("reposts")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("reposts");
                this.w = jSONObject2.optInt("count");
                this.y = jSONObject2.optInt("user_reposted") == 1;
            }
            Serializer.c<Counters> cVar5 = Counters.CREATOR;
            this.B0 = Counters.a.a(jSONObject);
            this.v = jSONObject.optInt("comments");
            this.z = jSONObject.optInt("repeat") == 1;
            this.r0 = jSONObject.optString("access_key");
            JSONObject optJSONObject8 = jSONObject.optJSONObject("privacy_view");
            if (optJSONObject8 != null) {
                List<PrivacySetting.PrivacyRule> list = this.x0;
                Serializer.c<PrivacySetting> cVar6 = PrivacySetting.CREATOR;
                list.addAll(z230.b.a(optJSONObject8));
            }
            JSONObject optJSONObject9 = jSONObject.optJSONObject("privacy_comment");
            if (optJSONObject9 != null) {
                List<PrivacySetting.PrivacyRule> list2 = this.y0;
                Serializer.c<PrivacySetting> cVar7 = PrivacySetting.CREATOR;
                list2.addAll(z230.b.a(optJSONObject9));
            }
            JSONObject optJSONObject10 = jSONObject.optJSONObject("access_info");
            if (optJSONObject10 != null) {
                Serializer.c<VideoAccessInfo> cVar8 = VideoAccessInfo.CREATOR;
                this.A = (VideoAccessInfo) VideoAccessInfo.a.a().a(optJSONObject10);
            }
            this.B = jSONObject.optInt("can_comment") == 1;
            this.C = jSONObject.optInt("can_like", 1) == 1;
            this.D = jSONObject.optInt("can_dislike", 0) == 1;
            this.E = jSONObject.optInt("can_remove_from_recommendations", 0) == 1;
            this.F = jSONObject.optInt("can_edit") == 1;
            this.G = jSONObject.optInt("can_delete") == 1;
            this.H = jSONObject.optInt("can_repost") == 1;
            this.I = jSONObject.optInt("is_private") == 0 && jSONObject.optInt("can_add") == 1;
            this.J = jSONObject.optInt("can_add_to_faves") == 1;
            VideoCanDownload.a aVar = VideoCanDownload.Companion;
            int optInt = jSONObject.optInt("can_download");
            aVar.getClass();
            this.L = VideoCanDownload.a.a(optInt);
            this.O = jSONObject.optInt("processing") == 1;
            this.P = jSONObject.optInt("converting") == 1;
            this.R = jSONObject.optInt("no_autoplay") == 1;
            Integer v = xus.v(jSONObject.optString("live_status"));
            if (v != null) {
                this.w0 = v.intValue();
            }
            this.D0 = jSONObject.optInt("balance");
            this.C0 = jSONObject.has("balance");
            if (jSONObject.has("stream")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("stream");
                this.E0 = jSONObject3.optString("url");
                this.F0 = jSONObject3.optString("okmp_url");
                this.G0 = jSONObject3.optString("key");
                this.H0 = jSONObject3.optInt("post_id");
            }
            this.S = jSONObject.optInt("added") == 1;
            this.T = jSONObject.optInt("can_subscribe") == 1;
            this.t0 = jSONObject.optInt("is_subscribed") == 1;
            this.U = jSONObject.optInt("has_subtitles") == 1;
            this.V = jSONObject.optString("force_subtitles");
            this.W = jSONObject.optString("track_code");
            JSONObject optJSONObject11 = jSONObject.optJSONObject("owner");
            if (optJSONObject11 != null) {
                Serializer.c<Owner> cVar9 = Owner.CREATOR;
                f1(Owner.a.b(optJSONObject11));
            }
            this.A0 = SystemClock.elapsedRealtime();
            this.i0 = jSONObject.optBoolean("is_favorite");
            this.h0 = Boolean.valueOf(jSONObject.optBoolean("is_video_subscription_hidden"));
            if (jSONObject.has("action_button")) {
                this.Y = new ActionLink(jSONObject.getJSONObject("action_button"));
            }
            this.Z = jSONObject.optInt("can_attach_link") == 1;
            if (jSONObject.has("timeline_thumbs")) {
                Serializer.c<TimelineThumbs> cVar10 = TimelineThumbs.CREATOR;
                this.K0 = (TimelineThumbs) TimelineThumbs.a.a().a(jSONObject.getJSONObject("timeline_thumbs"));
            }
            if (jSONObject.has("can_be_pinned")) {
                this.f1 = Boolean.valueOf(jSONObject.optBoolean("can_be_pinned"));
            }
            if (jSONObject.has("is_pinned")) {
                this.g1 = Boolean.valueOf(jSONObject.optBoolean("is_pinned"));
            }
            this.Q0 = jSONObject.optInt("need_mute", 0) == 1;
            this.N0 = jSONObject.optString("content_restricted_message");
            if (jSONObject.has("volume_multiplier")) {
                this.R0 = BigDecimal.valueOf(jSONObject.optDouble("volume_multiplier", 1.0d)).floatValue();
            } else {
                this.R0 = 1.0f;
            }
            this.S0 = Eb(jSONObject.optJSONArray("stats_pixels"));
            JSONObject optJSONObject12 = jSONObject.optJSONObject("live_settings");
            if (optJSONObject12 != null) {
                this.T0 = new LivePlayBackSettings(optJSONObject12);
            }
            this.U0 = jSONObject.optLong("live_start_time");
            if (jSONObject.has("live_notify")) {
                this.V0 = Boolean.valueOf(jSONObject.optInt("live_notify") == 1);
            }
            if (jSONObject.has("is_mobile_live")) {
                this.W0 = jSONObject.optBoolean("is_mobile_live");
            }
            JSONObject optJSONObject13 = jSONObject.optJSONObject("tracking_info");
            if (optJSONObject13 != null) {
                this.X = optJSONObject13.toString();
            }
            this.f0 = epe0.a(Fb(jSONObject.optJSONArray("qualities_info")));
            this.X0 = ServerEffect.a(jSONObject.optString("server_effect"));
            this.Y0 = jSONObject.optString("partner_text");
            this.Z0 = jSONObject.optBoolean("is_spherical");
            this.K = jSONObject.optInt("can_play_in_background") == 1;
            JSONArray optJSONArray = jSONObject.optJSONArray("episodes");
            if (optJSONArray != null) {
                Serializer.c<VideoEpisode> cVar11 = VideoEpisode.CREATOR;
                ArrayList arrayList = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject14 = optJSONArray.optJSONObject(i);
                    if (optJSONObject14 != null) {
                        arrayList.add(new VideoEpisode(optJSONObject14.optInt("time"), optJSONObject14.optString("text")));
                    }
                }
                this.a1 = arrayList;
            }
            JSONObject optJSONObject15 = jSONObject.optJSONObject("title_action");
            if (optJSONObject15 != null) {
                this.c1 = TitleAction.a.a(optJSONObject15);
            }
            this.d1 = jSONObject.optBoolean("is_archival_content");
            this.e1 = jSONObject.optInt("can_edit_privacy") == 1;
            this.h1 = jSONObject.optInt("is_from_message") == 1;
            JSONArray optJSONArray2 = jSONObject.optJSONArray("attached_short_videos");
            if (optJSONArray2 != null) {
                ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
                int length2 = optJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject optJSONObject16 = optJSONArray2.optJSONObject(i2);
                    if (optJSONObject16 != null) {
                        arrayList2.add(com.vk.dto.common.c.b(optJSONObject16));
                    }
                }
                this.b1 = arrayList2;
            }
            this.i1 = jSONObject.optString("thumb_hash");
            this.j1 = Integer.valueOf(jSONObject.optInt("attached_short_videos_counter"));
            if (jSONObject.has("archival_content_published_date")) {
                this.k1 = Long.valueOf(jSONObject.optLong("archival_content_published_date") * 1000);
            }
            if (jSONObject.has("donut_level_id")) {
                this.l1 = Integer.valueOf(jSONObject.optInt("donut_level_id"));
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("linked_to_playlist_marks");
            JSONObject optJSONObject17 = optJSONArray3 != null ? optJSONArray3.optJSONObject(0) : null;
            if (optJSONObject17 == null) {
                str = "";
            } else {
                str = optJSONObject17.optString("playlist_id");
            }
            if (!e630.d(str)) {
                int indexOf = str.indexOf(95);
                if (indexOf != -1) {
                    z = false;
                    try {
                        this.n1 = Long.valueOf(str.substring(0, indexOf));
                        this.m1 = Integer.valueOf(str.substring(indexOf + 1));
                    } catch (NumberFormatException e) {
                        L.i(e);
                        this.n1 = null;
                        this.m1 = null;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
                if (jSONObject.has("playlist_mark_album_owner_id")) {
                    this.n1 = Long.valueOf(jSONObject.optLong("playlist_mark_album_owner_id"));
                }
                if (jSONObject.has("playlist_mark_album_id")) {
                    this.m1 = Integer.valueOf(jSONObject.optInt("playlist_mark_album_id"));
                }
            }
            this.o1 = Boolean.valueOf(jSONObject.optBoolean("has_market_items"));
            if (jSONObject.has("vk_live_channel_url")) {
                this.r1 = jSONObject.optString("vk_live_channel_url");
            }
            if (jSONObject.has("vk_live_channel_name")) {
                this.s1 = jSONObject.optString("vk_live_channel_name");
            }
            if (jSONObject.has("vk_live_slot_url")) {
                this.t1 = jSONObject.optString("vk_live_slot_url");
            }
            this.p1 = Integer.valueOf(jSONObject.optInt("market_items_count"));
            this.q1 = jSONObject.optInt("is_draft") == 1 ? true : z;
            if (jSONObject.has("uma_track_id")) {
                this.v1 = jSONObject.optInt("uma_track_id");
            }
            if (jSONObject.has("download")) {
                this.M = (VideoDownloadDto) VideoDownloadDto.e.a(jSONObject.getJSONObject("download"));
            }
            if (jSONObject.has("donut")) {
                this.N = (VideoDonut) VideoDonut.f.a(jSONObject.getJSONObject("donut"));
            }
            this.x1 = Integer.valueOf(jSONObject.optInt("wall_post_id"));
        } catch (Exception e2) {
            L.C("vk", e2);
        }
    }
}
