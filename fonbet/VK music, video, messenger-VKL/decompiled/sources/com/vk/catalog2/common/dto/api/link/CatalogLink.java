package com.vk.catalog2.common.dto.api.link;

import com.coremedia.iso.boxes.MetaBox;
import com.vk.api.generated.catalog.dto.CatalogBackgroundDto;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.banner.Banner;
import com.vk.catalog2.common.dto.api.link.CatalogLinkImageStyle;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.NotificationImage;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.e43;
import xsna.epx;
import xsna.f370;
import xsna.fq;
import xsna.ho8;
import xsna.iah0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogLink.kt */
/* loaded from: classes16.dex */
public final class CatalogLink extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogLink> CREATOR = new b();
    public static final a o = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Image f;
    public final Meta g;
    public final CatalogBadge h;
    public final boolean i;
    public final CatalogLinkImageStyle j;
    public final String k;
    public final CatalogBackgroundDto l;
    public final String m;
    public final List<Image> n;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogLink> {
        @Override // xsna.aay
        public final CatalogLink a(JSONObject jSONObject) {
            return new CatalogLink(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogLink a(Serializer serializer) {
            return new CatalogLink(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogLink[i];
        }
    }

    public /* synthetic */ CatalogLink(String str, String str2, String str3, String str4, Image image, Meta meta, CatalogBadge catalogBadge, boolean z, CatalogLinkImageStyle catalogLinkImageStyle, String str5, CatalogBackgroundDto catalogBackgroundDto, String str6, List list, int i, zcl zclVar) {
        this(str, str2, str3, str4, image, meta, catalogBadge, z, catalogLinkImageStyle, str5, catalogBackgroundDto, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : list);
    }

    public final Meta Ab() {
        return this.g;
    }

    public final String Bb() {
        return this.d;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.i0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.j0(this.j.i());
        serializer.j0(this.k);
        serializer.e0(this.l);
        serializer.j0(this.m);
        serializer.f0(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogLink)) {
            return false;
        }
        CatalogLink catalogLink = (CatalogLink) obj;
        return epx.f(this.b, catalogLink.b) && epx.f(this.c, catalogLink.c) && epx.f(this.d, catalogLink.d) && epx.f(this.e, catalogLink.e) && epx.f(this.f, catalogLink.f) && epx.f(this.g, catalogLink.g) && epx.f(this.h, catalogLink.h) && this.i == catalogLink.i && this.j == catalogLink.j && epx.f(this.k, catalogLink.k) && epx.f(this.l, catalogLink.l) && epx.f(this.m, catalogLink.m) && epx.f(this.n, catalogLink.n);
    }

    public final Image getImage() {
        return this.f;
    }

    public final String getTitle() {
        return this.c;
    }

    public final String getUrl() {
        return this.e;
    }

    public final int hashCode() {
        int b2 = fq.b(this.f, urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31);
        Meta meta = this.g;
        int hashCode = (b2 + (meta == null ? 0 : meta.hashCode())) * 31;
        CatalogBadge catalogBadge = this.h;
        int hashCode2 = (this.j.hashCode() + qoy.b((hashCode + (catalogBadge == null ? 0 : catalogBadge.hashCode())) * 31, 31, this.i)) * 31;
        String str = this.k;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CatalogBackgroundDto catalogBackgroundDto = this.l;
        int hashCode4 = (hashCode3 + (catalogBackgroundDto == null ? 0 : catalogBackgroundDto.hashCode())) * 31;
        String str2 = this.m;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Image> list = this.n;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogLink(id=");
        sb.append(this.b);
        sb.append(": ");
        sb.append(this.c);
        sb.append(" - ");
        sb.append(this.d);
        sb.append(" - ");
        return ho8.a(sb, this.e, ')');
    }

    public final Banner zb() {
        NotificationImage.ImageInfo imageInfo;
        ImageSize Cb = this.f.Cb(iah0.f().widthPixels, true, false);
        int hashCode = this.b.hashCode();
        if (Cb != null) {
            com.vk.dto.common.im.Image image = Cb.d;
            imageInfo = new NotificationImage.ImageInfo(image.b, image.c, image.d);
        } else {
            imageInfo = null;
        }
        NotificationImage notificationImage = new NotificationImage(e43.m(imageInfo));
        Meta meta = this.g;
        return new Banner(hashCode, this.e, notificationImage, meta != null ? meta.d : null);
    }

    public CatalogLink(String str, String str2, String str3, String str4, Image image, Meta meta, CatalogBadge catalogBadge, boolean z, CatalogLinkImageStyle catalogLinkImageStyle, String str5, CatalogBackgroundDto catalogBackgroundDto, String str6, List<Image> list) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = image;
        this.g = meta;
        this.h = catalogBadge;
        this.i = z;
        this.j = catalogLinkImageStyle;
        this.k = str5;
        this.l = catalogBackgroundDto;
        this.m = str6;
        this.n = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogLink(JSONObject jSONObject) {
        this(r2, r3, r4, r5, r6, r7, r0, r9, r10, r11, r12, r13, r14);
        Meta meta;
        Object a2;
        JSONArray optJSONArray;
        Meta meta2;
        boolean z;
        CatalogLinkImageStyle catalogLinkImageStyle;
        String str;
        CatalogBackgroundDto catalogBackgroundDto;
        String str2;
        ArrayList arrayList;
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("subtitle");
        String optString4 = jSONObject.optString("url");
        Image image = new Image(jSONObject.optJSONArray("image"), null, 2, null);
        Meta.a aVar = Meta.l;
        if (jSONObject.has(MetaBox.TYPE)) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(MetaBox.TYPE);
                aVar.getClass();
                meta = new Meta(jSONObject2);
            } catch (JSONException e) {
                L.i(e);
            }
            CatalogBadge.a aVar2 = CatalogBadge.d;
            if (jSONObject.has("badge")) {
                try {
                    a2 = aVar2.a(jSONObject.getJSONObject("badge"));
                } catch (JSONException e2) {
                    L.i(e2);
                }
                CatalogBadge catalogBadge = (CatalogBadge) a2;
                boolean optBoolean = jSONObject.optBoolean("is_nft");
                CatalogLinkImageStyle.a aVar3 = CatalogLinkImageStyle.Companion;
                String optString5 = jSONObject.optString("image_style");
                aVar3.getClass();
                CatalogLinkImageStyle a3 = CatalogLinkImageStyle.a.a(optString5);
                String A = f370.A("animation_url", jSONObject);
                JSONObject optJSONObject = jSONObject.optJSONObject(L2.g);
                CatalogBackgroundDto catalogBackgroundDto2 = optJSONObject != null ? (CatalogBackgroundDto) GsonHolder.a().fromJson(optJSONObject.toString(), CatalogBackgroundDto.class) : null;
                String D = f370.D(jSONObject, "analytic_name");
                optJSONArray = jSONObject.optJSONArray("images");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    int i = 0;
                    while (i < length) {
                        arrayList2.add(new Image(optJSONArray.getJSONArray(i), null, 2, null));
                        i++;
                        optJSONArray = optJSONArray;
                        optString2 = optString2;
                        catalogBadge = catalogBadge;
                        optString = optString;
                    }
                    meta2 = meta;
                    z = optBoolean;
                    catalogLinkImageStyle = a3;
                    str = A;
                    catalogBackgroundDto = catalogBackgroundDto2;
                    str2 = D;
                    arrayList = arrayList2;
                } else {
                    meta2 = meta;
                    z = optBoolean;
                    catalogLinkImageStyle = a3;
                    str = A;
                    catalogBackgroundDto = catalogBackgroundDto2;
                    str2 = D;
                    arrayList = null;
                    optString = optString;
                }
            }
            a2 = null;
            CatalogBadge catalogBadge2 = (CatalogBadge) a2;
            boolean optBoolean2 = jSONObject.optBoolean("is_nft");
            CatalogLinkImageStyle.a aVar32 = CatalogLinkImageStyle.Companion;
            String optString52 = jSONObject.optString("image_style");
            aVar32.getClass();
            CatalogLinkImageStyle a32 = CatalogLinkImageStyle.a.a(optString52);
            String A2 = f370.A("animation_url", jSONObject);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(L2.g);
            if (optJSONObject2 != null) {
            }
            String D2 = f370.D(jSONObject, "analytic_name");
            optJSONArray = jSONObject.optJSONArray("images");
            if (optJSONArray != null) {
            }
        }
        meta = null;
        CatalogBadge.a aVar22 = CatalogBadge.d;
        if (jSONObject.has("badge")) {
        }
        a2 = null;
        CatalogBadge catalogBadge22 = (CatalogBadge) a2;
        boolean optBoolean22 = jSONObject.optBoolean("is_nft");
        CatalogLinkImageStyle.a aVar322 = CatalogLinkImageStyle.Companion;
        String optString522 = jSONObject.optString("image_style");
        aVar322.getClass();
        CatalogLinkImageStyle a322 = CatalogLinkImageStyle.a.a(optString522);
        String A22 = f370.A("animation_url", jSONObject);
        JSONObject optJSONObject22 = jSONObject.optJSONObject(L2.g);
        if (optJSONObject22 != null) {
        }
        String D22 = f370.D(jSONObject, "analytic_name");
        optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogLink(Serializer serializer) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, CatalogLinkImageStyle.a.a(r3), serializer.H(), (CatalogBackgroundDto) serializer.A(CatalogBackgroundDto.class.getClassLoader()), serializer.H(), serializer.B(Image.class.getClassLoader()));
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
        String str4 = H4 == null ? "" : H4;
        Image image = (Image) serializer.G(Image.class.getClassLoader());
        Meta meta = (Meta) serializer.G(Meta.class.getClassLoader());
        CatalogBadge catalogBadge = (CatalogBadge) serializer.G(CatalogBadge.class.getClassLoader());
        boolean m = serializer.m();
        CatalogLinkImageStyle.a aVar = CatalogLinkImageStyle.Companion;
        String H5 = serializer.H();
        aVar.getClass();
    }
}
