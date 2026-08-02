package com.vk.catalog2.common.dto.api;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.banner.BannerLocalImage;
import com.vk.catalog2.common.dto.api.banner.BannerStyle;
import com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.dhr0;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.j5g;
import xsna.s3q0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogStateInfo.kt */
/* loaded from: classes16.dex */
public final class CatalogStateInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogStateInfo> CREATOR = new b();
    public static final a s = new a();
    public final String b;
    public final String c;
    public final Image d;
    public final String e;
    public final String f;
    public final List<CatalogButton> g;
    public final CatalogButton h;
    public final CatalogBannerImageMode i;
    public final int j;
    public final Image k;
    public final String l;
    public final String m;
    public final String n;
    public final Image o;
    public final BannerStyle p;
    public final TitleIcon q;
    public final BannerLocalImage r;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogStateInfo> {
        @Override // xsna.aay
        public final CatalogStateInfo a(JSONObject jSONObject) {
            return new CatalogStateInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogStateInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogStateInfo a(Serializer serializer) {
            return new CatalogStateInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogStateInfo[i];
        }
    }

    public /* synthetic */ CatalogStateInfo(String str, String str2, Image image, String str3, String str4, List list, CatalogButton catalogButton, CatalogBannerImageMode catalogBannerImageMode, int i, Image image2, String str5, String str6, String str7, Image image3, BannerStyle bannerStyle, TitleIcon titleIcon, BannerLocalImage bannerLocalImage, int i2, zcl zclVar) {
        this(str, str2, image, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, list, catalogButton, catalogBannerImageMode, i, image2, str5, (i2 & 2048) != 0 ? null : str6, (i2 & 4096) != 0 ? null : str7, (i2 & 8192) != 0 ? null : image3, (i2 & 16384) != 0 ? null : bannerStyle, (32768 & i2) != 0 ? null : titleIcon, (i2 & 65536) != 0 ? null : bannerLocalImage);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.W(this.g);
        serializer.i0(this.h);
        CatalogBannerImageMode catalogBannerImageMode = this.i;
        serializer.j0(catalogBannerImageMode != null ? catalogBannerImageMode.name() : null);
        serializer.S(this.j);
        serializer.i0(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.i0(this.o);
        BannerStyle bannerStyle = this.p;
        serializer.j0(bannerStyle != null ? bannerStyle.h() : null);
        serializer.i0(this.q);
        serializer.i0(this.r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogStateInfo)) {
            return false;
        }
        CatalogStateInfo catalogStateInfo = (CatalogStateInfo) obj;
        return epx.f(this.b, catalogStateInfo.b) && epx.f(this.c, catalogStateInfo.c) && epx.f(this.d, catalogStateInfo.d) && epx.f(this.e, catalogStateInfo.e) && epx.f(this.f, catalogStateInfo.f) && epx.f(this.g, catalogStateInfo.g) && epx.f(this.h, catalogStateInfo.h) && this.i == catalogStateInfo.i && this.j == catalogStateInfo.j && epx.f(this.k, catalogStateInfo.k) && epx.f(this.l, catalogStateInfo.l) && epx.f(this.m, catalogStateInfo.m) && epx.f(this.n, catalogStateInfo.n) && epx.f(this.o, catalogStateInfo.o) && this.p == catalogStateInfo.p && epx.f(this.q, catalogStateInfo.q) && epx.f(this.r, catalogStateInfo.r);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        Image image = this.d;
        int hashCode = (a2 + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int a3 = fw3.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        CatalogButton catalogButton = this.h;
        int hashCode3 = (a3 + (catalogButton == null ? 0 : catalogButton.hashCode())) * 31;
        CatalogBannerImageMode catalogBannerImageMode = this.i;
        int a4 = shy.a(this.j, (hashCode3 + (catalogBannerImageMode == null ? 0 : catalogBannerImageMode.hashCode())) * 31, 31);
        Image image2 = this.k;
        int hashCode4 = (a4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Image image3 = this.o;
        int hashCode8 = (hashCode7 + (image3 == null ? 0 : image3.hashCode())) * 31;
        BannerStyle bannerStyle = this.p;
        int hashCode9 = (hashCode8 + (bannerStyle == null ? 0 : bannerStyle.hashCode())) * 31;
        TitleIcon titleIcon = this.q;
        int hashCode10 = (hashCode9 + (titleIcon == null ? 0 : titleIcon.hashCode())) * 31;
        BannerLocalImage bannerLocalImage = this.r;
        return hashCode10 + (bannerLocalImage != null ? bannerLocalImage.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogStateInfo(id=" + this.b + ", title=" + this.c + ", image=" + this.d + ", content=" + this.e + ", text=" + this.f + ", buttons=" + this.g + ", blockButton=" + this.h + ", bannerImageMode=" + this.i + ", backgroundColor=" + this.j + ", backgroundImage=" + this.k + ", trackCode=" + this.l + ", subtext=" + this.m + ", emojiIcons=" + this.n + ", coverImage=" + this.o + ", bannerStyle=" + this.p + ", titleIcon=" + this.q + ", localImage=" + this.r + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogStateInfo(String str, String str2, Image image, String str3, String str4, List<? extends CatalogButton> list, CatalogButton catalogButton, CatalogBannerImageMode catalogBannerImageMode, int i, Image image2, String str5, String str6, String str7, Image image3, BannerStyle bannerStyle, TitleIcon titleIcon, BannerLocalImage bannerLocalImage) {
        this.b = str;
        this.c = str2;
        this.d = image;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = catalogButton;
        this.i = catalogBannerImageMode;
        this.j = i;
        this.k = image2;
        this.l = str5;
        this.m = str6;
        this.n = str7;
        this.o = image3;
        this.p = bannerStyle;
        this.q = titleIcon;
        this.r = bannerLocalImage;
    }

    public CatalogStateInfo(CatalogStateInfo catalogStateInfo) {
        this(catalogStateInfo.b, catalogStateInfo.c, catalogStateInfo.d, catalogStateInfo.e, catalogStateInfo.f, catalogStateInfo.g, catalogStateInfo.h, catalogStateInfo.i, catalogStateInfo.j, catalogStateInfo.k, catalogStateInfo.l, catalogStateInfo.m, catalogStateInfo.n, catalogStateInfo.o, catalogStateInfo.p, catalogStateInfo.q, catalogStateInfo.r);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogStateInfo(Serializer serializer) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, BannerStyle.a.a(r2), (TitleIcon) serializer.G(TitleIcon.class.getClassLoader()), (BannerLocalImage) serializer.G(BannerLocalImage.class.getClassLoader()));
        CatalogBannerImageMode catalogBannerImageMode;
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        Image image = (Image) serializer.G(Image.class.getClassLoader());
        String H3 = serializer.H();
        String H4 = serializer.H();
        List k = serializer.k(CatalogButton.class);
        List list = k == null ? EmptyList.b : k;
        CatalogButton catalogButton = (CatalogButton) serializer.G(CatalogButton.class.getClassLoader());
        String H5 = serializer.H();
        if (H5 != null) {
            CatalogBannerImageMode.Companion.getClass();
            catalogBannerImageMode = CatalogBannerImageMode.a.a(H5);
        } else {
            catalogBannerImageMode = null;
        }
        CatalogBannerImageMode catalogBannerImageMode2 = catalogBannerImageMode;
        int u = serializer.u();
        Image image2 = (Image) serializer.G(Image.class.getClassLoader());
        String H6 = serializer.H();
        String H7 = serializer.H();
        String H8 = serializer.H();
        Image image3 = (Image) serializer.G(Image.class.getClassLoader());
        BannerStyle.a aVar = BannerStyle.Companion;
        String H9 = serializer.H();
        aVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogStateInfo(JSONObject jSONObject) {
        this(new CatalogStateInfo(r18, r19, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r2, r16, r0 != null ? new TitleIcon(r0) : r15, null, 65536, null));
        Image image;
        CatalogBannerImageMode catalogBannerImageMode;
        String str;
        String str2;
        List list;
        CatalogButton catalogButton;
        TitleIcon titleIcon;
        Image image2;
        ArrayList arrayList;
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("text");
        String optString4 = jSONObject.optString("text");
        String optString5 = jSONObject.optString("track_code");
        String optString6 = jSONObject.optString("subtext");
        String D = f370.D(jSONObject, "emoji_icons");
        if (jSONObject.has("icons")) {
            image = new Image(jSONObject.getJSONArray("icons"), null, 2, null);
        } else {
            image = jSONObject.has("images") ? new Image(jSONObject.getJSONArray("images"), null, 2, null) : null;
        }
        Object opt = jSONObject.opt("image_mode");
        String str3 = opt instanceof String ? (String) opt : null;
        if (str3 != null) {
            CatalogBannerImageMode.Companion.getClass();
            catalogBannerImageMode = CatalogBannerImageMode.a.b(str3);
        } else {
            catalogBannerImageMode = null;
        }
        String optString7 = jSONObject.optString("background_color");
        int r = optString7.length() > 0 ? f370.r(optString7) : dhr0.t.c(R.attr.vk_ui_field_background);
        Image image3 = jSONObject.has(L2.g) ? new Image(jSONObject.getJSONArray(L2.g), null, 2, null) : null;
        if (jSONObject.has("buttons")) {
            CatalogButton.b bVar = CatalogButton.b;
            JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                str = optString;
                arrayList = new ArrayList(length);
                str2 = optString2;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        try {
                            Object a2 = bVar.a(optJSONObject);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        } catch (Exception e) {
                            L.i(e);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                }
            } else {
                str = optString;
                str2 = optString2;
                arrayList = null;
            }
            list = j5g.O0(arrayList == null ? new ArrayList() : arrayList);
        } else {
            str = optString;
            str2 = optString2;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("button");
            if (optJSONObject2 != null && (catalogButton = (CatalogButton) CatalogButton.b.a(optJSONObject2)) != null) {
                list = Collections.singletonList(catalogButton);
            } else {
                list = EmptyList.b;
            }
        }
        List list2 = list;
        CatalogButton.b bVar2 = CatalogButton.b;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("click_action");
        CatalogButton catalogButton2 = (CatalogButton) bVar2.a(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        if (jSONObject.has("foreground_image")) {
            titleIcon = null;
            image2 = new Image(jSONObject.getJSONArray("foreground_image"), null, 2, null);
        } else {
            titleIcon = null;
            image2 = null;
        }
        BannerStyle.a aVar = BannerStyle.Companion;
        String optString8 = jSONObject.optString(TtmlNode.TAG_STYLE);
        aVar.getClass();
        BannerStyle a3 = BannerStyle.a.a(optString8);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("title_icon");
    }
}
