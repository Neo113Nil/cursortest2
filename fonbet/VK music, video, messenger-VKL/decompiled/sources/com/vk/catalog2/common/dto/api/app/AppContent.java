package com.vk.catalog2.common.dto.api.app;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.cqm0;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: AppContent.kt */
/* loaded from: classes16.dex */
public final class AppContent extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AppContent> CREATOR = new b();
    public static final a i = new a();
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AppContent> {
        @Override // xsna.aay
        public final AppContent a(JSONObject jSONObject) {
            return new AppContent(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AppContent> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AppContent a(Serializer serializer) {
            return new AppContent(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AppContent[i];
        }
    }

    public AppContent(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.Y(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppContent)) {
            return false;
        }
        AppContent appContent = (AppContent) obj;
        return epx.f(this.b, appContent.b) && this.c == appContent.c && epx.f(this.d, appContent.d) && epx.f(this.e, appContent.e) && epx.f(this.f, appContent.f) && epx.f(this.g, appContent.g) && epx.f(this.h, appContent.h);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppContent(id=");
        sb.append(this.b);
        sb.append(", appId=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", url=");
        sb.append(this.g);
        sb.append(", imageUrl=");
        return ho8.a(sb, this.h, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppContent(Serializer serializer) {
        this(r3, r4, r6, r7, r8, r0 == null ? "" : r0, serializer.H());
        String H = serializer.H();
        String str = H == null ? "" : H;
        long w = serializer.w();
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
        String str4 = H4 == null ? "" : H4;
        String H5 = serializer.H();
    }

    public AppContent(JSONObject jSONObject) {
        this(jSONObject.getString("id"), jSONObject.getLong("app_id"), jSONObject.getString("title"), jSONObject.getString("subtitle"), jSONObject.optString("track_code"), jSONObject.getString("url"), cqm0.a(jSONObject.optString("image")));
    }
}
