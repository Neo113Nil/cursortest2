package com.vk.catalog2.common.dto.api.video;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONObject;
import xsna.aay;
import xsna.cqm0;
import xsna.epx;
import xsna.er;
import xsna.urd0;

/* compiled from: ShowcaseListItem.kt */
/* loaded from: classes16.dex */
public final class ShowcaseListItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ShowcaseListItem> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Image f;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ShowcaseListItem> {
        @Override // xsna.aay
        public final ShowcaseListItem a(JSONObject jSONObject) {
            return new ShowcaseListItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ShowcaseListItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ShowcaseListItem a(Serializer serializer) {
            return new ShowcaseListItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShowcaseListItem[i];
        }
    }

    static {
        new a();
    }

    public ShowcaseListItem(String str, String str2, String str3, String str4, Image image) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = image;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowcaseListItem)) {
            return false;
        }
        ShowcaseListItem showcaseListItem = (ShowcaseListItem) obj;
        return epx.f(this.b, showcaseListItem.b) && epx.f(this.c, showcaseListItem.c) && epx.f(this.d, showcaseListItem.d) && epx.f(this.e, showcaseListItem.e) && epx.f(this.f, showcaseListItem.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowcaseListItem(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", badge=");
        sb.append(this.e);
        sb.append(", image=");
        return er.d(sb, this.f, ')');
    }

    public ShowcaseListItem(JSONObject jSONObject) {
        this(jSONObject.getString("id"), jSONObject.getString("title"), cqm0.a(jSONObject.optString("subtitle")), cqm0.a(jSONObject.optString("badge")), new Image(jSONObject.getJSONArray("image"), null, 2, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShowcaseListItem(Serializer serializer) {
        this(r3, r4, r5, r6, r9 == null ? Image.d : r9);
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String H4 = serializer.H();
        Image image = (Image) serializer.G(Image.class.getClassLoader());
    }
}
