package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<MediaTrack> CREATOR = new zzca();
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List h;
    public String i;
    public final JSONObject j;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        public String a;
        public String b;
        public int c;
    }

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, JSONObject jSONObject) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i2;
        this.h = list;
        this.j = jSONObject;
    }

    public final JSONObject Y0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.a);
            int i = this.b;
            if (i == 1) {
                jSONObject.put("type", "TEXT");
            } else if (i == 2) {
                jSONObject.put("type", "AUDIO");
            } else if (i == 3) {
                jSONObject.put("type", "VIDEO");
            }
            String str = this.c;
            if (str != null) {
                jSONObject.put("trackContentId", str);
            }
            String str2 = this.d;
            if (str2 != null) {
                jSONObject.put("trackContentType", str2);
            }
            String str3 = this.e;
            if (str3 != null) {
                jSONObject.put("name", str3);
            }
            String str4 = this.f;
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("language", str4);
            }
            int i2 = this.g;
            if (i2 == 1) {
                jSONObject.put("subtype", "SUBTITLES");
            } else if (i2 == 2) {
                jSONObject.put("subtype", "CAPTIONS");
            } else if (i2 == 3) {
                jSONObject.put("subtype", "DESCRIPTIONS");
            } else if (i2 == 4) {
                jSONObject.put("subtype", "CHAPTERS");
            } else if (i2 == 5) {
                jSONObject.put("subtype", "METADATA");
            }
            List list = this.h;
            if (list != null) {
                jSONObject.put("roles", new JSONArray((Collection) list));
            }
            JSONObject jSONObject2 = this.j;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.j;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.j;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || JsonUtils.a(jSONObject, jSONObject2)) && this.a == mediaTrack.a && this.b == mediaTrack.b && CastUtils.c(this.c, mediaTrack.c) && CastUtils.c(this.d, mediaTrack.d) && CastUtils.c(this.e, mediaTrack.e) && CastUtils.c(this.f, mediaTrack.f) && this.g == mediaTrack.g && CastUtils.c(this.h, mediaTrack.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g), this.h, String.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.j;
        this.i = jSONObject == null ? null : jSONObject.toString();
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(this.a);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.m(parcel, 5, this.d, false);
        SafeParcelWriter.m(parcel, 6, this.e, false);
        SafeParcelWriter.m(parcel, 7, this.f, false);
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(this.g);
        SafeParcelWriter.o(parcel, 9, this.h);
        SafeParcelWriter.m(parcel, 10, this.i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
