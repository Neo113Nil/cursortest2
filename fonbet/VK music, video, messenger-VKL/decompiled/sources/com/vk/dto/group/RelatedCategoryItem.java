package com.vk.dto.group;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.er;
import xsna.urd0;

/* compiled from: RelatedCategoryItem.kt */
/* loaded from: classes18.dex */
public final class RelatedCategoryItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<RelatedCategoryItem> CREATOR;
    public final String b;
    public final String c;
    public final String d;
    public final Image e;

    /* compiled from: RelatedCategoryItem.kt */
    public static final class a {
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<RelatedCategoryItem> {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // xsna.aay
        public final RelatedCategoryItem a(JSONObject jSONObject) {
            this.a.getClass();
            return new RelatedCategoryItem(jSONObject.optString("name"), jSONObject.optString("description"), jSONObject.optString("url"), new Image(jSONObject.optJSONArray("icons"), null, 2, null));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<RelatedCategoryItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RelatedCategoryItem a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            String H3 = serializer.H();
            return new RelatedCategoryItem(H, H2, H3 != null ? H3 : "", (Image) serializer.A(Image.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RelatedCategoryItem[i];
        }
    }

    static {
        a aVar = new a();
        CREATOR = new c();
        new b(aVar);
    }

    public RelatedCategoryItem(String str, String str2, String str3, Image image) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = image;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedCategoryItem)) {
            return false;
        }
        RelatedCategoryItem relatedCategoryItem = (RelatedCategoryItem) obj;
        return epx.f(this.b, relatedCategoryItem.b) && epx.f(this.c, relatedCategoryItem.c) && epx.f(this.d, relatedCategoryItem.d) && epx.f(this.e, relatedCategoryItem.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Image image = this.e;
        return a2 + (image == null ? 0 : image.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelatedCategoryItem(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", link=");
        sb.append(this.d);
        sb.append(", image=");
        return er.d(sb, this.e, ')');
    }
}
