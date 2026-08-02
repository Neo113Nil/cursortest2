package com.vk.stickers.views.sticker;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import com.vk.stickers.views.sticker.StickerPackBadge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.drm0;
import xsna.epx;
import xsna.qoy;
import xsna.tn;
import xsna.urd0;

/* compiled from: StickerPackPreview.kt */
/* loaded from: classes6.dex */
public final class StickerPackPreview extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerPackPreview> CREATOR = new b();
    public static final a t = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final StickerPackBadge n;
    public final StickerPackPrice o;
    public final StickerStockItemPreviewImage p;
    public final List<StickerItem> q;
    public final String r;
    public final Boolean s;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<StickerPackPreview> {
        @Override // xsna.aay
        public final StickerPackPreview a(JSONObject jSONObject) {
            return new StickerPackPreview(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickerPackPreview> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerPackPreview a(Serializer serializer) {
            return new StickerPackPreview(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerPackPreview[i];
        }
    }

    public StickerPackPreview(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, StickerPackBadge stickerPackBadge, StickerPackPrice stickerPackPrice, StickerStockItemPreviewImage stickerStockItemPreviewImage, List<StickerItem> list, String str4, Boolean bool) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = stickerPackBadge;
        this.o = stickerPackPrice;
        this.p = stickerStockItemPreviewImage;
        this.q = list;
        this.r = str4;
        this.s = bool;
    }

    public static StickerPackPreview zb(StickerPackPreview stickerPackPreview, int i) {
        int i2 = stickerPackPreview.b;
        String str = stickerPackPreview.c;
        String str2 = stickerPackPreview.d;
        String str3 = stickerPackPreview.e;
        boolean z = stickerPackPreview.f;
        boolean z2 = stickerPackPreview.g;
        boolean z3 = stickerPackPreview.h;
        boolean z4 = stickerPackPreview.i;
        boolean z5 = stickerPackPreview.j;
        boolean z6 = stickerPackPreview.k;
        boolean z7 = stickerPackPreview.l;
        boolean z8 = stickerPackPreview.m;
        StickerPackBadge stickerPackBadge = (i & 4096) != 0 ? stickerPackPreview.n : null;
        StickerPackPrice stickerPackPrice = stickerPackPreview.o;
        StickerStockItemPreviewImage stickerStockItemPreviewImage = stickerPackPreview.p;
        List<StickerItem> list = stickerPackPreview.q;
        String str4 = stickerPackPreview.r;
        Boolean bool = stickerPackPreview.s;
        stickerPackPreview.getClass();
        return new StickerPackPreview(i2, str, str2, str3, z, z2, z3, z4, z5, z6, z7, z8, stickerPackBadge, stickerPackPrice, stickerStockItemPreviewImage, list, str4, bool);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.i0(this.n);
        serializer.i0(this.o);
        serializer.i0(this.p);
        serializer.f0(this.q);
        serializer.j0(this.r);
        serializer.J(this.s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerPackPreview)) {
            return false;
        }
        StickerPackPreview stickerPackPreview = (StickerPackPreview) obj;
        return this.b == stickerPackPreview.b && epx.f(this.c, stickerPackPreview.c) && epx.f(this.d, stickerPackPreview.d) && epx.f(this.e, stickerPackPreview.e) && this.f == stickerPackPreview.f && this.g == stickerPackPreview.g && this.h == stickerPackPreview.h && this.i == stickerPackPreview.i && this.j == stickerPackPreview.j && this.k == stickerPackPreview.k && this.l == stickerPackPreview.l && this.m == stickerPackPreview.m && epx.f(this.n, stickerPackPreview.n) && epx.f(this.o, stickerPackPreview.o) && epx.f(this.p, stickerPackPreview.p) && epx.f(this.q, stickerPackPreview.q) && epx.f(this.r, stickerPackPreview.r) && epx.f(this.s, stickerPackPreview.s);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int b2 = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        StickerPackBadge stickerPackBadge = this.n;
        int hashCode2 = (b2 + (stickerPackBadge == null ? 0 : stickerPackBadge.hashCode())) * 31;
        StickerPackPrice stickerPackPrice = this.o;
        int hashCode3 = (hashCode2 + (stickerPackPrice == null ? 0 : stickerPackPrice.hashCode())) * 31;
        StickerStockItemPreviewImage stickerStockItemPreviewImage = this.p;
        int hashCode4 = (hashCode3 + (stickerStockItemPreviewImage == null ? 0 : stickerStockItemPreviewImage.hashCode())) * 31;
        List<StickerItem> list = this.q;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.r;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.s;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPackPreview(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", author=");
        sb.append(this.e);
        sb.append(", isAnimated=");
        sb.append(this.f);
        sb.append(", isPurchased=");
        sb.append(this.g);
        sb.append(", canPurchase=");
        sb.append(this.h);
        sb.append(", canPurchaseFor=");
        sb.append(this.i);
        sb.append(", canGiftTo=");
        sb.append(this.j);
        sb.append(", canGift=");
        sb.append(this.k);
        sb.append(", isActive=");
        sb.append(this.l);
        sb.append(", isStyle=");
        sb.append(this.m);
        sb.append(", badge=");
        sb.append(this.n);
        sb.append(", price=");
        sb.append(this.o);
        sb.append(", icon=");
        sb.append(this.p);
        sb.append(", stickers=");
        sb.append(this.q);
        sb.append(", trackCode=");
        sb.append(this.r);
        sb.append(", isPopup=");
        return tn.a(sb, this.s, ')');
    }

    public StickerPackPreview(Serializer serializer) {
        this(serializer.u(), serializer.H(), serializer.H(), serializer.H(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), (StickerPackBadge) serializer.G(StickerPackBadge.class.getClassLoader()), (StickerPackPrice) serializer.G(StickerPackPrice.class.getClassLoader()), (StickerStockItemPreviewImage) serializer.G(StickerStockItemPreviewImage.class.getClassLoader()), serializer.B(StickerItem.class.getClassLoader()), serializer.H(), serializer.n());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StickerPackPreview(JSONObject jSONObject) {
        this(r18, r19, r16, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r21, r4, jSONObject.optString("track_code"), Boolean.valueOf(jSONObject.optBoolean("is_popup")));
        int i;
        String str;
        String str2;
        StickerPackBadge stickerPackBadge;
        JSONObject optJSONObject;
        StickerStockItemPreviewImage stickerStockItemPreviewImage;
        JSONArray optJSONArray;
        StickerStockItemPreviewImage stickerStockItemPreviewImage2;
        ArrayList arrayList;
        int i2 = jSONObject.getInt("id");
        String string = jSONObject.getString("title");
        String optString = jSONObject.optString("description");
        String optString2 = jSONObject.optString("author");
        boolean optBoolean = jSONObject.optBoolean("is_animated");
        boolean optBoolean2 = jSONObject.optBoolean("is_purchased");
        boolean optBoolean3 = jSONObject.optBoolean("can_purchase");
        boolean optBoolean4 = jSONObject.optBoolean("can_purchase_for");
        boolean optBoolean5 = jSONObject.optBoolean("can_gift_to");
        boolean optBoolean6 = jSONObject.optBoolean("can_gift");
        boolean optBoolean7 = jSONObject.optBoolean("is_active");
        boolean optBoolean8 = jSONObject.optBoolean("is_style");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("badge");
        if (optJSONObject2 != null) {
            String optString3 = optJSONObject2.optString("subtype");
            i = i2;
            String optString4 = optJSONObject2.optString("text");
            if (optString4 != null && !drm0.N(optString4) && optString3 != null && !drm0.N(optString3)) {
                if (optString3.equals("new")) {
                    str = string;
                    str2 = optString;
                    stickerPackBadge = new StickerPackBadge.New(optString4, 0, 2, null);
                } else {
                    str = string;
                    str2 = optString;
                    if (optString3.equals("discount")) {
                        stickerPackBadge = new StickerPackBadge.Discount(optString4, 0, 2, null);
                    } else {
                        stickerPackBadge = new StickerPackBadge.Unknown(optString4, 0, 2, null);
                    }
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("price");
                StickerPackPrice stickerPackPrice = optJSONObject3 == null ? new StickerPackPrice(optJSONObject3.getInt("current"), Integer.valueOf(optJSONObject3.optInt("regular")), Integer.valueOf(optJSONObject3.optInt("discount"))) : null;
                optJSONObject = jSONObject.optJSONObject("icon");
                if (optJSONObject == null) {
                    Serializer.c<StickerStockItemPreviewImage> cVar = StickerStockItemPreviewImage.CREATOR;
                    stickerStockItemPreviewImage = StickerStockItemPreviewImage.a.a(optJSONObject);
                } else {
                    stickerStockItemPreviewImage = null;
                }
                optJSONArray = jSONObject.optJSONArray("stickers");
                if (optJSONArray == null) {
                    arrayList = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    stickerStockItemPreviewImage2 = stickerStockItemPreviewImage;
                    for (int i3 = 0; i3 < length; i3++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                        StickerItem stickerItem = StickerItem.l;
                        arrayList.add(StickerItem.a.a(jSONObject2));
                    }
                } else {
                    stickerStockItemPreviewImage2 = stickerStockItemPreviewImage;
                    arrayList = null;
                }
                StickerPackPrice stickerPackPrice2 = stickerPackPrice;
            }
        } else {
            i = i2;
        }
        str = string;
        str2 = optString;
        stickerPackBadge = null;
        JSONObject optJSONObject32 = jSONObject.optJSONObject("price");
        if (optJSONObject32 == null) {
        }
        optJSONObject = jSONObject.optJSONObject("icon");
        if (optJSONObject == null) {
        }
        optJSONArray = jSONObject.optJSONArray("stickers");
        if (optJSONArray == null) {
        }
        StickerPackPrice stickerPackPrice22 = stickerPackPrice;
    }
}
