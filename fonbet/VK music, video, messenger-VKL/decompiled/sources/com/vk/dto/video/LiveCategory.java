package com.vk.dto.video;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.vu5;

/* compiled from: LiveCategory.kt */
/* loaded from: classes18.dex */
public final class LiveCategory extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<LiveCategory> CREATOR = new b();
    public static final a g = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<LiveCategory> {
        @Override // xsna.aay
        public final LiveCategory a(JSONObject jSONObject) {
            return new LiveCategory(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<LiveCategory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LiveCategory a(Serializer serializer) {
            return new LiveCategory(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LiveCategory[i];
        }
    }

    public LiveCategory(String str, String str2, String str3, String str4, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveCategory)) {
            return false;
        }
        LiveCategory liveCategory = (LiveCategory) obj;
        return epx.f(this.b, liveCategory.b) && epx.f(this.c, liveCategory.c) && epx.f(this.d, liveCategory.d) && epx.f(this.e, liveCategory.e) && this.f == liveCategory.f;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return Integer.hashCode(this.f) + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveCategory(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", coverUrl=");
        sb.append(this.d);
        sb.append(", categoryType=");
        sb.append(this.e);
        sb.append(", viewers=");
        return vu5.b(sb, this.f, ')');
    }

    public LiveCategory(JSONObject jSONObject) {
        this(jSONObject.getString("id"), jSONObject.optString("title"), jSONObject.optString("cover_url"), jSONObject.optString("type"), jSONObject.optInt("viewers"));
    }

    public LiveCategory(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.u());
    }
}
