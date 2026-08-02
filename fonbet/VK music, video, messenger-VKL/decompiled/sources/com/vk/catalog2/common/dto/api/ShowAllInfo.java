package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;

/* compiled from: ShowAllInfo.kt */
/* loaded from: classes16.dex */
public final class ShowAllInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ShowAllInfo> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ShowAllInfo> {
        @Override // xsna.aay
        public final ShowAllInfo a(JSONObject jSONObject) {
            return new ShowAllInfo(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ShowAllInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ShowAllInfo a(Serializer serializer) {
            return new ShowAllInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShowAllInfo[i];
        }
    }

    public ShowAllInfo(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public static ShowAllInfo zb(ShowAllInfo showAllInfo) {
        String str = showAllInfo.b;
        String str2 = showAllInfo.c;
        showAllInfo.getClass();
        return new ShowAllInfo(str, str2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("title", this.b);
        jSONObject.put("section_id", this.c);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowAllInfo)) {
            return false;
        }
        ShowAllInfo showAllInfo = (ShowAllInfo) obj;
        return epx.f(this.b, showAllInfo.b) && epx.f(this.c, showAllInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowAllInfo(title=");
        sb.append(this.b);
        sb.append(", sectionId=");
        return ho8.a(sb, this.c, ')');
    }

    public ShowAllInfo(JSONObject jSONObject) {
        this(jSONObject.optString("title"), jSONObject.optString("section_id"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShowAllInfo(Serializer serializer) {
        this(r0, r3 != null ? r3 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
    }
}
