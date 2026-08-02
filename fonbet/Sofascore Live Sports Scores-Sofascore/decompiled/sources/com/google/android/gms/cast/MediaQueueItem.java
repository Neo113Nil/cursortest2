package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import com.ironsource.U3;
import defpackage.a70;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class MediaQueueItem extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<MediaQueueItem> CREATOR = new zzby();
    public MediaInfo a;
    public int b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public long[] g;
    public String h;
    public JSONObject i;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public class Writer {
    }

    public MediaQueueItem(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.a = mediaInfo;
        this.b = i;
        this.c = z;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = jArr;
        this.h = str;
        if (str == null) {
            this.i = null;
            return;
        }
        try {
            this.i = new JSONObject(this.h);
        } catch (JSONException unused) {
            this.i = null;
            this.h = null;
        }
    }

    public final boolean Y0(JSONObject jSONObject) {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has(U3.i.I0)) {
            this.a = new MediaInfo(jSONObject.getJSONObject(U3.i.I0));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.b != (i = jSONObject.getInt("itemId"))) {
            this.b = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.c != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.c = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.d) > 1.0E-7d)) {
            this.d = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.e) > 1.0E-7d) {
                this.e = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f) > 1.0E-7d) {
                this.f = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.g;
            if (jArr2 != null && jArr2.length == length) {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.g[i3] == jArr[i3]) {
                    }
                }
            }
            z3 = true;
            break;
        } else {
            jArr = null;
        }
        if (z3) {
            this.g = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.i = jSONObject.getJSONObject("customData");
        return true;
    }

    public final JSONObject Z0() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.a;
            if (mediaInfo != null) {
                jSONObject.put(U3.i.I0, mediaInfo.Z0());
            }
            int i = this.b;
            if (i != 0) {
                jSONObject.put("itemId", i);
            }
            jSONObject.put("autoplay", this.c);
            if (!Double.isNaN(this.d)) {
                jSONObject.put("startTime", this.d);
            }
            double d = this.e;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f);
            if (this.g != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j : this.g) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.i;
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
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        JSONObject jSONObject = this.i;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaQueueItem.i;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || JsonUtils.a(jSONObject, jSONObject2)) && CastUtils.c(this.a, mediaQueueItem.a) && this.b == mediaQueueItem.b && this.c == mediaQueueItem.c && ((Double.isNaN(this.d) && Double.isNaN(mediaQueueItem.d)) || this.d == mediaQueueItem.d) && this.e == mediaQueueItem.e && this.f == mediaQueueItem.f && Arrays.equals(this.g, mediaQueueItem.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.g)), String.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        int i2 = this.b;
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(i2);
        boolean z = this.c;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.d;
        SafeParcelWriter.r(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.e;
        SafeParcelWriter.r(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d3 = this.f;
        SafeParcelWriter.r(parcel, 7, 8);
        parcel.writeDouble(d3);
        SafeParcelWriter.j(parcel, 8, this.g);
        SafeParcelWriter.m(parcel, 9, this.h, false);
        SafeParcelWriter.t(parcel, s);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        public final MediaQueueItem a;

        public Builder(MediaInfo mediaInfo) {
            MediaQueueItem mediaQueueItem = new MediaQueueItem(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
            if (mediaInfo != null) {
                this.a = mediaQueueItem;
            } else {
                a70.p("media cannot be null.");
                throw null;
            }
        }

        public final MediaQueueItem a() {
            MediaQueueItem mediaQueueItem = this.a;
            if (mediaQueueItem.a == null) {
                a70.p("media cannot be null.");
                return null;
            }
            if (!Double.isNaN(mediaQueueItem.d) && mediaQueueItem.d < 0.0d) {
                a70.p("startTime cannot be negative or NaN.");
                return null;
            }
            if (Double.isNaN(mediaQueueItem.e)) {
                a70.p("playbackDuration cannot be NaN.");
                return null;
            }
            if (!Double.isNaN(mediaQueueItem.f) && mediaQueueItem.f >= 0.0d) {
                return mediaQueueItem;
            }
            a70.p("preloadTime cannot be negative or Nan.");
            return null;
        }

        public Builder(JSONObject jSONObject) {
            this.a = new MediaQueueItem(jSONObject);
        }
    }

    public MediaQueueItem(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        Y0(jSONObject);
    }
}
