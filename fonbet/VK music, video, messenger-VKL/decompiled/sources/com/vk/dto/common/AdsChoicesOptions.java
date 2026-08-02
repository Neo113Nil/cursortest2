package com.vk.dto.common;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.cqm0;
import xsna.epx;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AdsChoicesOptions.kt */
/* loaded from: classes18.dex */
public final class AdsChoicesOptions implements Serializer.StreamParcelable {
    public static final Serializer.c<AdsChoicesOptions> CREATOR = new b();
    public static final a i = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final String g;
    public final Integer h;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AdsChoicesOptions> {
        @Override // xsna.aay
        public final AdsChoicesOptions a(JSONObject jSONObject) {
            try {
                return new AdsChoicesOptions(cqm0.a(jSONObject.optString("alias")), cqm0.a(jSONObject.optString("type")), cqm0.a(jSONObject.optString("name")), cqm0.a(jSONObject.optString("click_link")), Boolean.valueOf(jSONObject.optBoolean("should_close_ad", false)), cqm0.a(jSONObject.optString("copy_text")), Integer.valueOf(jSONObject.optInt("id", 0)));
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AdsChoicesOptions> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AdsChoicesOptions a(Serializer serializer) {
            return new AdsChoicesOptions(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.n(), serializer.H(), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdsChoicesOptions[i];
        }
    }

    public AdsChoicesOptions() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.J(this.f);
        serializer.j0(this.g);
        serializer.V(this.h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsChoicesOptions)) {
            return false;
        }
        AdsChoicesOptions adsChoicesOptions = (AdsChoicesOptions) obj;
        return epx.f(this.b, adsChoicesOptions.b) && epx.f(this.c, adsChoicesOptions.c) && epx.f(this.d, adsChoicesOptions.d) && epx.f(this.e, adsChoicesOptions.e) && epx.f(this.f, adsChoicesOptions.f) && epx.f(this.g, adsChoicesOptions.g) && epx.f(this.h, adsChoicesOptions.h);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.h;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsChoicesOptions(alias=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", clickLink=");
        sb.append(this.e);
        sb.append(", shouldCloseAd=");
        sb.append(this.f);
        sb.append(", copyText=");
        sb.append(this.g);
        sb.append(", id=");
        return uqi.b(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public AdsChoicesOptions(String str, String str2, String str3, String str4, Boolean bool, String str5, Integer num) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = bool;
        this.g = str5;
        this.h = num;
    }

    public /* synthetic */ AdsChoicesOptions(String str, String str2, String str3, String str4, Boolean bool, String str5, Integer num, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : num);
    }
}
