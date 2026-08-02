package com.vk.dto.video;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.cqm0;
import xsna.drm0;
import xsna.epx;
import xsna.fq;
import xsna.fw3;
import xsna.ho8;
import xsna.izs;
import xsna.j5g;
import xsna.myc0;
import xsna.qoy;
import xsna.shy;
import xsna.z230;
import xsna.zcl;

/* compiled from: VideoAlbum.kt */
/* loaded from: classes18.dex */
public final class VideoAlbum extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoAlbum> CREATOR = new c();
    public final int b;
    public final UserId c;
    public String d;
    public final String e;
    public final int f;
    public final int g;
    public final Image h;
    public final boolean i;
    public List<? extends PrivacySetting.PrivacyRule> j;
    public final boolean k;
    public boolean l;
    public final int m;
    public final String n;
    public final VideoRestriction o;
    public final boolean p;
    public final List<VideoSeason> q;
    public final VideoAlbumType r;
    public final String s;
    public final VideoAlbumExtendedInfo t;

    /* compiled from: VideoAlbum.kt */
    public static final class a {
        public static String a(int i, UserId userId) {
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            sb.append('_');
            sb.append(i);
            return sb.toString();
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<VideoAlbum> {
        @Override // xsna.aay
        public final VideoAlbum a(JSONObject jSONObject) {
            return new VideoAlbum(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<VideoAlbum> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoAlbum a(Serializer serializer) {
            return new VideoAlbum(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoAlbum[i];
        }
    }

    static {
        new b();
    }

    public VideoAlbum(int i, UserId userId, String str, String str2, int i2, int i3, Image image, boolean z, List list, boolean z2, boolean z3, int i4, String str3, VideoRestriction videoRestriction, boolean z4, List list2, VideoAlbumType videoAlbumType, String str4, int i5, zcl zclVar) {
        this(i, userId, str, (i5 & 8) != 0 ? null : str2, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? new Image(EmptyList.b) : image, (i5 & 128) != 0 ? false : z, (i5 & 256) != 0 ? EmptyList.b : list, (i5 & 512) != 0 ? false : z2, (i5 & 1024) != 0 ? false : z3, (i5 & 2048) != 0 ? 0 : i4, (i5 & 4096) != 0 ? null : str3, (i5 & 8192) != 0 ? null : videoRestriction, (i5 & 16384) != 0 ? false : z4, (32768 & i5) != 0 ? EmptyList.b : list2, (65536 & i5) != 0 ? VideoAlbumType.SimplePlaylist : videoAlbumType, (i5 & 131072) != 0 ? null : str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VideoAlbum Ab(VideoAlbum videoAlbum, boolean z, ArrayList arrayList, int i) {
        int i2 = videoAlbum.b;
        UserId userId = videoAlbum.c;
        String str = videoAlbum.d;
        String str2 = videoAlbum.e;
        int i3 = videoAlbum.f;
        int i4 = videoAlbum.g;
        Image image = videoAlbum.h;
        boolean z2 = videoAlbum.i;
        List<? extends PrivacySetting.PrivacyRule> list = videoAlbum.j;
        boolean z3 = videoAlbum.k;
        boolean z4 = (i & 1024) != 0 ? videoAlbum.l : z;
        int i5 = videoAlbum.m;
        boolean z5 = z4;
        String str3 = videoAlbum.n;
        VideoRestriction videoRestriction = videoAlbum.o;
        boolean z6 = videoAlbum.p;
        List list2 = (i & 32768) != 0 ? videoAlbum.q : arrayList;
        VideoAlbumType videoAlbumType = videoAlbum.r;
        String str4 = videoAlbum.s;
        videoAlbum.getClass();
        return new VideoAlbum(i2, userId, str, str2, i3, i4, image, z2, list, z3, z5, i5, str3, videoRestriction, z6, list2, videoAlbumType, str4);
    }

    public final int Bb() {
        return this.m;
    }

    public final boolean Cb() {
        return this.i;
    }

    public final List<VideoSeason> Db() {
        return this.q;
    }

    public final String Eb() {
        String str;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_PLAYLIST_SHARING_LINK;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures) && (str = this.e) != null && myc0.f(str)) {
            return str;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(HttpRequest.DEFAULT_SCHEME).authority("vkvideo.ru");
        builder.appendPath("video").appendPath("playlist").appendPath(zb());
        return builder.build().toString();
    }

    public final int Fb() {
        return this.g;
    }

    public final boolean Gb() {
        PrivacySetting.PrivacyRule privacyRule;
        List<? extends PrivacySetting.PrivacyRule> list = this.j;
        if (list == null || !list.isEmpty()) {
            List<? extends PrivacySetting.PrivacyRule> list2 = this.j;
            if (!epx.f((list2 == null || (privacyRule = (PrivacySetting.PrivacyRule) j5g.Y(list2)) == null) ? null : (String) j5g.a0(privacyRule.zb()), "all")) {
                return false;
            }
        }
        return this.p;
    }

    public final boolean Hb() {
        return this.k;
    }

    public final VideoRestriction O() {
        return this.o;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.S(this.g);
        serializer.i0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.W(this.j);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.S(this.m);
        serializer.j0(this.n);
        serializer.i0(this.o);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.W(this.q);
        serializer.g0(this.r);
        serializer.j0(this.s);
        serializer.e0(this.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAlbum)) {
            return false;
        }
        VideoAlbum videoAlbum = (VideoAlbum) obj;
        return this.b == videoAlbum.b && epx.f(this.c, videoAlbum.c) && epx.f(this.d, videoAlbum.d) && epx.f(this.e, videoAlbum.e) && this.f == videoAlbum.f && this.g == videoAlbum.g && epx.f(this.h, videoAlbum.h) && this.i == videoAlbum.i && epx.f(this.j, videoAlbum.j) && this.k == videoAlbum.k && this.l == videoAlbum.l && this.m == videoAlbum.m && epx.f(this.n, videoAlbum.n) && epx.f(this.o, videoAlbum.o) && this.p == videoAlbum.p && epx.f(this.q, videoAlbum.q) && this.r == videoAlbum.r && epx.f(this.s, videoAlbum.s);
    }

    public final int getCount() {
        return this.f;
    }

    public final int getId() {
        return this.b;
    }

    public final Image getImage() {
        return this.h;
    }

    public final List<PrivacySetting.PrivacyRule> getPrivacy() {
        return this.j;
    }

    public final String getTitle() {
        return this.d;
    }

    public final int hashCode() {
        int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int b2 = qoy.b(fq.b(this.h, shy.a(this.g, shy.a(this.f, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31, this.i);
        List<? extends PrivacySetting.PrivacyRule> list = this.j;
        int a3 = shy.a(this.m, qoy.b(qoy.b((b2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.k), 31, this.l), 31);
        String str3 = this.n;
        int hashCode2 = (a3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        VideoRestriction videoRestriction = this.o;
        int hashCode3 = (this.r.hashCode() + fw3.a(qoy.b((hashCode2 + (videoRestriction == null ? 0 : videoRestriction.hashCode())) * 31, 31, this.p), 31, this.q)) * 31;
        String str4 = this.s;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final UserId q() {
        return this.c;
    }

    public final String r() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAlbum(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", shareUrl=");
        sb.append(this.e);
        sb.append(", count=");
        sb.append(this.f);
        sb.append(", updatedTime=");
        sb.append(this.g);
        sb.append(", image=");
        sb.append(this.h);
        sb.append(", imageBlur=");
        sb.append(this.i);
        sb.append(", privacy=");
        sb.append(this.j);
        sb.append(", isSystem=");
        sb.append(this.k);
        sb.append(", isSubscribed=");
        sb.append(this.l);
        sb.append(", followersCount=");
        sb.append(this.m);
        sb.append(", trackCode=");
        sb.append(this.n);
        sb.append(", restriction=");
        sb.append(this.o);
        sb.append(", canView=");
        sb.append(this.p);
        sb.append(", seasons=");
        sb.append(this.q);
        sb.append(", type=");
        sb.append(this.r);
        sb.append(", thumbHash=");
        return ho8.a(sb, this.s, ')');
    }

    public final String zb() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.b);
        sb.append('_');
        sb.append(this.b);
        return sb.toString();
    }

    public VideoAlbum(int i, UserId userId, String str, String str2, int i2, int i3, Image image, boolean z, List<? extends PrivacySetting.PrivacyRule> list, boolean z2, boolean z3, int i4, String str3, VideoRestriction videoRestriction, boolean z4, List<VideoSeason> list2, VideoAlbumType videoAlbumType, String str4) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = str2;
        this.f = i2;
        this.g = i3;
        this.h = image;
        this.i = z;
        this.j = list;
        this.k = z2;
        this.l = z3;
        this.m = i4;
        this.n = str3;
        this.o = videoRestriction;
        this.p = z4;
        this.q = list2;
        this.r = videoAlbumType;
        this.s = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoAlbum(JSONObject jSONObject) {
        this(r3, r4, r23, r24, r15, r9, r9, r10, r11, r12, r13, r14, r3, r22, r17, r4, r3, !drm0.N(r0) ? r0 : null);
        int i;
        boolean z;
        List list;
        int i2;
        List list2;
        boolean z2;
        String str;
        String str2;
        List list3;
        Object obj;
        JSONArray optJSONArray;
        String str3;
        String str4;
        JSONArray jSONArray;
        int i3;
        String str5;
        String str6 = "id";
        int i4 = jSONObject.getInt("id");
        UserId userId = new UserId(jSONObject.getLong("owner_id"));
        String str7 = "title";
        String optString = jSONObject.optString("title");
        String optString2 = jSONObject.optString("share_url");
        String str8 = "count";
        int optInt = jSONObject.optInt("count");
        int optInt2 = jSONObject.optInt("updated_time");
        Image image = new Image(jSONObject.optJSONArray("image"), null, 2, 0 == true ? 1 : 0);
        if (jSONObject.optInt("image_blur", 0) == 1) {
            i = optInt;
            z = true;
        } else {
            i = optInt;
            z = false;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("privacy");
        if (optJSONObject != null) {
            Serializer.c<PrivacySetting> cVar = PrivacySetting.CREATOR;
            list = z230.b.a(optJSONObject);
        } else {
            list = EmptyList.b;
        }
        if (jSONObject.optInt("is_system") == 1) {
            i2 = i;
            list2 = list;
            z2 = true;
        } else {
            i2 = i;
            list2 = list;
            z2 = false;
        }
        boolean optBoolean = jSONObject.optBoolean("is_subscribed");
        int optInt3 = jSONObject.optInt("followers_count");
        String a2 = cqm0.a(jSONObject.optString("track_code"));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("cover_video_restriction");
        VideoRestriction videoRestriction = optJSONObject2 != null ? (VideoRestriction) VideoRestriction.k.a(optJSONObject2) : null;
        boolean z3 = jSONObject.optInt("can_view") == 1;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("series_object");
        if (optJSONObject3 != null && (optJSONArray = optJSONObject3.optJSONArray("seasons")) != null) {
            str = optString;
            list3 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            str2 = optString2;
            int i5 = 0;
            while (i5 < length) {
                int i6 = length;
                JSONObject optJSONObject4 = optJSONArray.optJSONObject(i5);
                if (optJSONObject4 != null) {
                    jSONArray = optJSONArray;
                    i3 = i5;
                    str3 = str6;
                    str4 = str7;
                    str5 = str8;
                    list3.add(new VideoSeason(optJSONObject4.optInt(str6), optJSONObject4.optString(str7), optJSONObject4.optInt(str8), optJSONObject4.optBoolean("is_contains_focus_video")));
                } else {
                    str3 = str6;
                    str4 = str7;
                    jSONArray = optJSONArray;
                    i3 = i5;
                    str5 = str8;
                }
                i5 = i3 + 1;
                length = i6;
                optJSONArray = jSONArray;
                str6 = str3;
                str7 = str4;
                str8 = str5;
            }
        } else {
            str = optString;
            str2 = optString2;
            list3 = EmptyList.b;
        }
        int optInt4 = jSONObject.optInt("type");
        VideoAlbumType.Companion.getClass();
        Iterator it = VideoAlbumType.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (optInt4 == ((VideoAlbumType) obj).i()) {
                    break;
                }
            }
        }
        VideoAlbumType videoAlbumType = (VideoAlbumType) obj;
        videoAlbumType = videoAlbumType == null ? VideoAlbumType.SimplePlaylist : videoAlbumType;
        String optString3 = jSONObject.optString("thumb_hash");
    }

    public VideoAlbum(JSONObject jSONObject, izs<? super String, VideoAlbumExtendedInfo> izsVar) {
        this(jSONObject);
        this.t = izsVar.invoke(zb());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoAlbum(Serializer serializer) {
        this(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r1 == null ? EmptyList.b : r1, (VideoAlbumType) serializer.C(), serializer.H());
        int u = serializer.u();
        UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
        String H = serializer.H();
        String H2 = serializer.H();
        int u2 = serializer.u();
        int u3 = serializer.u();
        Image image = (Image) serializer.G(Image.class.getClassLoader());
        boolean m = serializer.m();
        ArrayList l = serializer.l(PrivacySetting.PrivacyRule.class.getClassLoader());
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        int u4 = serializer.u();
        String H3 = serializer.H();
        VideoRestriction videoRestriction = (VideoRestriction) serializer.G(VideoRestriction.class.getClassLoader());
        boolean m4 = serializer.m();
        List k = serializer.k(VideoSeason.class);
        this.t = (VideoAlbumExtendedInfo) serializer.A(VideoAlbumExtendedInfo.class.getClassLoader());
    }
}
