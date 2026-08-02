package com.vk.catalog2.common.dto.api;

import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogFilterData.kt */
/* loaded from: classes16.dex */
public final class CatalogFilterData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogFilterData> CREATOR = new b();
    public static final a k = new a();
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Image f;
    public final CatalogBadge g;
    public final String h;
    public final String i;
    public final FromType j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogFilterData.kt */
    public static final class FromType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FromType[] $VALUES;
        public static final FromType BACKEND;
        public static final FromType CUSTOM;

        static {
            FromType fromType = new FromType("BACKEND", 0);
            BACKEND = fromType;
            FromType fromType2 = new FromType("CUSTOM", 1);
            CUSTOM = fromType2;
            FromType[] fromTypeArr = {fromType, fromType2};
            $VALUES = fromTypeArr;
            $ENTRIES = new asp(fromTypeArr);
        }

        public FromType() {
            throw null;
        }

        public static FromType valueOf(String str) {
            return (FromType) Enum.valueOf(FromType.class, str);
        }

        public static FromType[] values() {
            return (FromType[]) $VALUES.clone();
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogFilterData> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.aay
        public final CatalogFilterData a(JSONObject jSONObject) {
            Image image;
            Serializer.c<Image> cVar = Image.CREATOR;
            String optString = jSONObject.optString("replacement_id");
            String optString2 = jSONObject.optString("text");
            String optString3 = jSONObject.optString("icon");
            boolean z = jSONObject.optInt("selected") == 1;
            JSONArray optJSONArray = jSONObject.optJSONArray("icon_sizes");
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(new ImageSize(optJSONArray.getJSONObject(i), (String) (objArr2 == true ? 1 : 0), 2, (zcl) (objArr == true ? 1 : 0)));
                }
                image = new Image(arrayList);
            } else {
                image = null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("badge");
            return new CatalogFilterData(optString, optString2, optString3, z, image, optJSONObject != null ? new CatalogBadge(optJSONObject) : null, null, jSONObject.optString("subtitle"), null, 320, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogFilterData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogFilterData a(Serializer serializer) {
            FromType fromType;
            String H = serializer.H();
            String str = H == null ? "" : H;
            String H2 = serializer.H();
            String str2 = H2 == null ? "" : H2;
            String H3 = serializer.H();
            String str3 = H3 == null ? "" : H3;
            boolean m = serializer.m();
            Image image = (Image) serializer.G(Image.class.getClassLoader());
            CatalogBadge catalogBadge = (CatalogBadge) serializer.G(CatalogBadge.class.getClassLoader());
            String H4 = serializer.H();
            String H5 = serializer.H();
            String H6 = serializer.H();
            if (H6 == null || (fromType = FromType.valueOf(H6)) == null) {
                fromType = FromType.BACKEND;
            }
            return new CatalogFilterData(str, str2, str3, m, image, catalogBadge, H4, H5, fromType);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogFilterData[i];
        }
    }

    public /* synthetic */ CatalogFilterData(String str, String str2, String str3, boolean z, Image image, CatalogBadge catalogBadge, String str4, String str5, FromType fromType, int i, zcl zclVar) {
        this(str, str2, str3, z, image, (i & 32) != 0 ? null : catalogBadge, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? FromType.BACKEND : fromType);
    }

    public static CatalogFilterData zb(CatalogFilterData catalogFilterData, String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = catalogFilterData.b;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = catalogFilterData.c;
        }
        String str4 = str2;
        String str5 = catalogFilterData.d;
        if ((i & 8) != 0) {
            z = catalogFilterData.e;
        }
        Image image = catalogFilterData.f;
        CatalogBadge catalogBadge = catalogFilterData.g;
        String str6 = catalogFilterData.h;
        String str7 = catalogFilterData.i;
        FromType fromType = catalogFilterData.j;
        catalogFilterData.getClass();
        return new CatalogFilterData(str3, str4, str5, z, image, catalogBadge, str6, str7, fromType);
    }

    public final String Ab() {
        return this.b;
    }

    public final boolean Bb() {
        return this.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j.name());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogFilterData)) {
            return false;
        }
        CatalogFilterData catalogFilterData = (CatalogFilterData) obj;
        return epx.f(this.b, catalogFilterData.b) && epx.f(this.c, catalogFilterData.c) && epx.f(this.d, catalogFilterData.d) && this.e == catalogFilterData.e && epx.f(this.f, catalogFilterData.f) && epx.f(this.g, catalogFilterData.g) && epx.f(this.h, catalogFilterData.h) && epx.f(this.i, catalogFilterData.i) && this.j == catalogFilterData.j;
    }

    public final String getText() {
        return this.c;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int b2 = qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Image image = this.f;
        int hashCode = (b2 + (image == null ? 0 : image.hashCode())) * 31;
        CatalogBadge catalogBadge = this.g;
        int hashCode2 = (hashCode + (catalogBadge == null ? 0 : catalogBadge.hashCode())) * 31;
        String str2 = this.h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return this.j.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        sb.append(this.c);
        sb.append("> ");
        return ho8.a(sb, this.e ? "+" : "", ' ');
    }

    public CatalogFilterData(String str, String str2, String str3, boolean z, Image image, CatalogBadge catalogBadge, String str4, String str5, FromType fromType) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = image;
        this.g = catalogBadge;
        this.h = str4;
        this.i = str5;
        this.j = fromType;
    }
}
