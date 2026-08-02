package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoAdsType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import org.json.JSONObject;
import xsna.aay;
import xsna.cqm0;
import xsna.epx;
import xsna.qoy;

/* compiled from: VideoAdInfo.kt */
/* loaded from: classes18.dex */
public final class VideoAdInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoAdInfo> CREATOR = new c();
    public static final b o = new b();
    public final String b;
    public final String c;
    public final String d;
    public final UserId e;
    public final Owner f;
    public final String g;
    public final VideoAdsType h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final Image m;
    public final AdsChoices n;

    /* compiled from: VideoAdInfo.kt */
    public static final class a {
        public static b a() {
            return VideoAdInfo.o;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<VideoAdInfo> {
        /* JADX WARN: Removed duplicated region for block: B:16:0x009f A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:3:0x0003, B:7:0x0035, B:8:0x0040, B:10:0x0056, B:14:0x0067, B:16:0x009f, B:17:0x00ac, B:22:0x0064), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
        @Override // xsna.aay
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final VideoAdInfo a(JSONObject jSONObject) {
            VideoAdsType videoAdsType;
            try {
                String a = cqm0.a(jSONObject.optString("title"));
                String a2 = cqm0.a(jSONObject.optString("disclaimer"));
                String a3 = cqm0.a(jSONObject.optString("age_restrictions"));
                long optLong = jSONObject.optLong("target_owner_id");
                Long valueOf = Long.valueOf(optLong);
                if (optLong == 0) {
                    valueOf = null;
                }
                UserId userId = valueOf != null ? new UserId(valueOf.longValue()) : null;
                String a4 = cqm0.a(jSONObject.optString("owner_title"));
                String a5 = cqm0.a(jSONObject.optString("type"));
                if (a5 != null) {
                    VideoAdsType.Companion.getClass();
                    videoAdsType = VideoAdsType.a.a(a5);
                    if (videoAdsType == null) {
                    }
                    VideoAdsType videoAdsType2 = videoAdsType;
                    boolean optBoolean = jSONObject.optBoolean("has_cta_button");
                    String a6 = cqm0.a(jSONObject.optString("advertiser_info_url"));
                    String a7 = cqm0.a(jSONObject.optString("ad_marker"));
                    String a8 = cqm0.a(jSONObject.optString("pattern"));
                    Image image = new Image(jSONObject.optJSONArray("photo_icon"), null, 2, null);
                    JSONObject optJSONObject = jSONObject.optJSONObject("ad_choices");
                    return new VideoAdInfo(a, a2, a3, userId, null, a4, videoAdsType2, optBoolean, a6, a7, a8, image, optJSONObject == null ? (AdsChoices) AdsChoices.g.a(optJSONObject) : null);
                }
                videoAdsType = VideoAdsType.UNKNOWN;
                VideoAdsType videoAdsType22 = videoAdsType;
                boolean optBoolean2 = jSONObject.optBoolean("has_cta_button");
                String a62 = cqm0.a(jSONObject.optString("advertiser_info_url"));
                String a72 = cqm0.a(jSONObject.optString("ad_marker"));
                String a82 = cqm0.a(jSONObject.optString("pattern"));
                Image image2 = new Image(jSONObject.optJSONArray("photo_icon"), null, 2, null);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("ad_choices");
                return new VideoAdInfo(a, a2, a3, userId, null, a4, videoAdsType22, optBoolean2, a62, a72, a82, image2, optJSONObject2 == null ? (AdsChoices) AdsChoices.g.a(optJSONObject2) : null);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<VideoAdInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoAdInfo a(Serializer serializer) {
            String H = serializer.H();
            String H2 = serializer.H();
            String H3 = serializer.H();
            Long x = serializer.x();
            UserId userId = x != null ? new UserId(x.longValue()) : null;
            Owner owner = (Owner) serializer.G(Owner.class.getClassLoader());
            String H4 = serializer.H();
            VideoAdsType.a aVar = VideoAdsType.Companion;
            String H5 = serializer.H();
            aVar.getClass();
            return new VideoAdInfo(H, H2, H3, userId, owner, H4, VideoAdsType.a.a(H5), serializer.m(), serializer.H(), serializer.H(), serializer.H(), (Image) serializer.A(Image.class.getClassLoader()), (AdsChoices) serializer.G(AdsChoices.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoAdInfo[i];
        }
    }

    public VideoAdInfo(String str, String str2, String str3, UserId userId, Owner owner, String str4, VideoAdsType videoAdsType, boolean z, String str5, String str6, String str7, Image image, AdsChoices adsChoices) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = userId;
        this.f = owner;
        this.g = str4;
        this.h = videoAdsType;
        this.i = z;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = image;
        this.n = adsChoices;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        UserId userId = this.e;
        serializer.b0(userId != null ? Long.valueOf(userId.b) : null);
        serializer.i0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h.i());
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.e0(this.m);
        serializer.i0(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdInfo)) {
            return false;
        }
        VideoAdInfo videoAdInfo = (VideoAdInfo) obj;
        return epx.f(this.b, videoAdInfo.b) && epx.f(this.c, videoAdInfo.c) && epx.f(this.d, videoAdInfo.d) && epx.f(this.e, videoAdInfo.e) && epx.f(this.f, videoAdInfo.f) && epx.f(this.g, videoAdInfo.g) && this.h == videoAdInfo.h && this.i == videoAdInfo.i && epx.f(this.j, videoAdInfo.j) && epx.f(this.k, videoAdInfo.k) && epx.f(this.l, videoAdInfo.l) && epx.f(this.m, videoAdInfo.m) && epx.f(this.n, videoAdInfo.n);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId = this.e;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Owner owner = this.f;
        int hashCode5 = (hashCode4 + (owner == null ? 0 : owner.hashCode())) * 31;
        String str4 = this.g;
        int b2 = qoy.b((this.h.hashCode() + ((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.i);
        String str5 = this.j;
        int hashCode6 = (b2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.l;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Image image = this.m;
        int hashCode9 = (hashCode8 + (image == null ? 0 : image.hashCode())) * 31;
        AdsChoices adsChoices = this.n;
        return hashCode9 + (adsChoices != null ? adsChoices.hashCode() : 0);
    }

    public final String toString() {
        return "VideoAdInfo(title=" + this.b + ", disclaimer=" + this.c + ", ageRestrictions=" + this.d + ", ownerId=" + this.e + ", owner=" + this.f + ", ownerTitle=" + this.g + ", adsType=" + this.h + ", hasCtaButton=" + this.i + ", advertiserInfoUrl=" + this.j + ", adMarker=" + this.k + ", pattern=" + this.l + ", photoIcon=" + this.m + ", adsChoices=" + this.n + ')';
    }
}
