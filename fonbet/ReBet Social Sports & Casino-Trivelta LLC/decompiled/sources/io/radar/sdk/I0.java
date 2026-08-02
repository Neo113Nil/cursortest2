package io.radar.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class I0 {

    /* renamed from: g, reason: collision with root package name */
    public static final a f49679g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f49680a;

    /* renamed from: b, reason: collision with root package name */
    public final String f49681b;

    /* renamed from: c, reason: collision with root package name */
    public final String f49682c;

    /* renamed from: d, reason: collision with root package name */
    public final String f49683d;

    /* renamed from: e, reason: collision with root package name */
    public final String f49684e;

    /* renamed from: f, reason: collision with root package name */
    public final String f49685f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final I0 a(JSONObject obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return new I0(obj.isNull("iconString") ? null : obj.optString("iconString"), obj.isNull("iconColor") ? null : obj.optString("iconColor"), obj.isNull("foregroundServiceIconString") ? null : obj.optString("foregroundServiceIconString"), obj.isNull("foregroundServiceIconColor") ? null : obj.optString("foregroundServiceIconColor"), obj.isNull("eventIconString") ? null : obj.optString("eventIconString"), obj.isNull("eventIconColor") ? null : obj.optString("eventIconColor"));
        }

        public a() {
        }
    }

    public I0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f49680a = str;
        this.f49681b = str2;
        this.f49682c = str3;
        this.f49683d = str4;
        this.f49684e = str5;
        this.f49685f = str6;
    }

    public static final I0 a(JSONObject jSONObject) {
        return f49679g.a(jSONObject);
    }

    public final String b() {
        String str = this.f49685f;
        return str == null ? this.f49681b : str;
    }

    public final String c() {
        String str = this.f49684e;
        return str == null ? this.f49680a : str;
    }

    public final String d() {
        String str = this.f49683d;
        return str == null ? this.f49681b : str;
    }

    public final String e() {
        String str = this.f49682c;
        return str == null ? this.f49680a : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        return Intrinsics.areEqual(this.f49680a, i02.f49680a) && Intrinsics.areEqual(this.f49681b, i02.f49681b) && Intrinsics.areEqual(this.f49682c, i02.f49682c) && Intrinsics.areEqual(this.f49683d, i02.f49683d) && Intrinsics.areEqual(this.f49684e, i02.f49684e) && Intrinsics.areEqual(this.f49685f, i02.f49685f);
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("iconString", this.f49680a);
        jSONObject.put("iconColor", this.f49681b);
        jSONObject.put("foregroundServiceIconString", this.f49682c);
        jSONObject.put("foregroundServiceIconColor", this.f49683d);
        jSONObject.put("eventIconString", this.f49684e);
        jSONObject.put("eventIconColor", this.f49685f);
        return jSONObject;
    }

    public int hashCode() {
        String str = this.f49680a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f49681b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f49682c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f49683d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f49684e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f49685f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "RadarNotificationOptions(iconString=" + this.f49680a + ", iconColor=" + this.f49681b + ", foregroundServiceIconString=" + this.f49682c + ", foregroundServiceIconColor=" + this.f49683d + ", eventIconString=" + this.f49684e + ", eventIconColor=" + this.f49685f + ')';
    }
}
