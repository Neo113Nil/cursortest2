package com.vk.catalog2.common.dto.api.music;

import android.graphics.Color;
import android.net.Uri;
import android.util.SparseArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Thumb;
import org.json.JSONObject;
import xsna.aay;
import xsna.drm0;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.u4q0;
import xsna.urd0;
import xsna.zik0;

/* compiled from: RadioStation.kt */
/* loaded from: classes16.dex */
public final class RadioStation extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<RadioStation> CREATOR = new c();
    public static final b j = new b();
    public final int b;
    public final Thumb c;
    public final Integer d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;

    /* compiled from: RadioStation.kt */
    public static final class a {
        public static Thumb a(String str) {
            if (str == null || drm0.N(str)) {
                return null;
            }
            Uri parse = Uri.parse(str);
            u4q0 u4q0Var = zik0.a;
            SparseArray sparseArray = new SparseArray(1);
            sparseArray.put(72, parse);
            return new Thumb((SparseArray<Uri>) sparseArray);
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<RadioStation> {
        @Override // xsna.aay
        public final RadioStation a(JSONObject jSONObject) {
            return new RadioStation(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<RadioStation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RadioStation a(Serializer serializer) {
            return new RadioStation(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RadioStation[i];
        }
    }

    public RadioStation(int i, Thumb thumb, Integer num, String str, String str2, boolean z, boolean z2, String str3) {
        this.b = i;
        this.c = thumb;
        this.d = num;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = str3;
    }

    public static RadioStation zb(RadioStation radioStation, boolean z, int i) {
        int i2 = radioStation.b;
        Thumb thumb = radioStation.c;
        Integer num = radioStation.d;
        String str = radioStation.e;
        String str2 = radioStation.f;
        if ((i & 32) != 0) {
            z = radioStation.g;
        }
        boolean z2 = radioStation.h;
        String str3 = radioStation.i;
        radioStation.getClass();
        return new RadioStation(i2, thumb, num, str, str2, z, z2, str3);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.i0(this.c);
        serializer.V(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioStation)) {
            return false;
        }
        RadioStation radioStation = (RadioStation) obj;
        return this.b == radioStation.b && epx.f(this.c, radioStation.c) && epx.f(this.d, radioStation.d) && epx.f(this.e, radioStation.e) && epx.f(this.f, radioStation.f) && this.g == radioStation.g && this.h == radioStation.h && epx.f(this.i, radioStation.i);
    }

    public final int getId() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Thumb thumb = this.c;
        int hashCode2 = (hashCode + (thumb == null ? 0 : thumb.hashCode())) * 31;
        Integer num = this.d;
        return this.i.hashCode() + qoy.b(qoy.b(urd0.a(urd0.a((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RadioStation(id=");
        sb.append(this.b);
        sb.append(", name=");
        return ho8.a(sb, this.e, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RadioStation(JSONObject jSONObject) {
        this(r2, r3, r0, jSONObject.optString("name"), jSONObject.optString("stream_url"), jSONObject.optBoolean("is_followed"), jSONObject.optBoolean("is_enabled"), jSONObject.optString("track_code"));
        Integer num;
        int optInt = jSONObject.optInt("id");
        Thumb a2 = a.a(jSONObject.optString("logo_png_url"));
        String optString = jSONObject.optString("background_color");
        if (optString != null && !drm0.N(optString)) {
            try {
                num = Integer.valueOf(Color.parseColor(optString));
            } catch (Exception unused) {
            }
        }
        num = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RadioStation(Serializer serializer) {
        this(r1, r2, r3, r0, r5, r6, r7, r10 == null ? "" : r10);
        int u = serializer.u();
        Thumb thumb = (Thumb) serializer.G(Thumb.class.getClassLoader());
        Integer v = serializer.v();
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        boolean m = serializer.m();
        boolean m2 = serializer.m();
        String H3 = serializer.H();
    }
}
