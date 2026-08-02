package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.X3;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.nby;
import xsna.o0a;
import xsna.ozg0;
import xsna.s401;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class MediaQueueItem extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaQueueItem> CREATOR = new s401();

    @Nullable
    public MediaInfo b;
    public int c;
    public boolean d;
    public double e;
    public double f;
    public double g;

    @Nullable
    public long[] h;

    @Nullable
    public String i;

    @Nullable
    public JSONObject j;

    public MediaQueueItem(@Nullable MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, @Nullable long[] jArr, @Nullable String str) {
        this.b = mediaInfo;
        this.c = i;
        this.d = z;
        this.e = d;
        this.f = d2;
        this.g = d3;
        this.h = jArr;
        this.i = str;
        if (str == null) {
            this.j = null;
            return;
        }
        try {
            this.j = new JSONObject(this.i);
        } catch (JSONException unused) {
            this.j = null;
            this.i = null;
        }
    }

    public final boolean b(@NonNull JSONObject jSONObject) throws JSONException {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has(X3.i.I0)) {
            this.b = new MediaInfo(jSONObject.getJSONObject(X3.i.I0));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.c != (i = jSONObject.getInt("itemId"))) {
            this.c = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.d != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.d = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.e) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.e) > 1.0E-7d)) {
            this.e = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f) > 1.0E-7d) {
                this.f = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.g) > 1.0E-7d) {
                this.g = d2;
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
            long[] jArr2 = this.h;
            if (jArr2 != null && jArr2.length == length) {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.h[i3] == jArr[i3]) {
                    }
                }
            }
            z3 = true;
            break;
        } else {
            jArr = null;
        }
        if (z3) {
            this.h = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.j = jSONObject.getJSONObject("customData");
        return true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        JSONObject jSONObject = this.j;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaQueueItem.j;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || nby.a(jSONObject, jSONObject2)) && o0a.c(this.b, mediaQueueItem.b) && this.c == mediaQueueItem.c && this.d == mediaQueueItem.d && ((Double.isNaN(this.e) && Double.isNaN(mediaQueueItem.e)) || this.e == mediaQueueItem.e) && this.f == mediaQueueItem.f && this.g == mediaQueueItem.g && Arrays.equals(this.h, mediaQueueItem.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Boolean.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f), Double.valueOf(this.g), Integer.valueOf(Arrays.hashCode(this.h)), String.valueOf(this.j)});
    }

    @NonNull
    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.b;
            if (mediaInfo != null) {
                jSONObject.put(X3.i.I0, mediaInfo.k());
            }
            int i = this.c;
            if (i != 0) {
                jSONObject.put("itemId", i);
            }
            jSONObject.put("autoplay", this.d);
            if (!Double.isNaN(this.e)) {
                jSONObject.put("startTime", this.e);
            }
            double d = this.f;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.g);
            if (this.h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j : this.h) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.j;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.j;
        this.i = jSONObject == null ? null : jSONObject.toString();
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        int i2 = this.c;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i2);
        boolean z = this.d;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.e;
        ozg0.v(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.f;
        ozg0.v(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d3 = this.g;
        ozg0.v(parcel, 7, 8);
        parcel.writeDouble(d3);
        ozg0.m(parcel, 8, this.h, false);
        ozg0.q(parcel, 9, this.i, false);
        ozg0.x(w, parcel);
    }

    public MediaQueueItem(@NonNull JSONObject jSONObject) throws JSONException {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, null);
        b(jSONObject);
    }

    /* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
    public static class a {
        public final MediaQueueItem a;

        public a(@NonNull MediaInfo mediaInfo) throws IllegalArgumentException {
            MediaQueueItem mediaQueueItem = new MediaQueueItem(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, null);
            if (mediaInfo == null) {
                throw new IllegalArgumentException("media cannot be null.");
            }
            this.a = mediaQueueItem;
        }

        @NonNull
        public final MediaQueueItem a() {
            MediaQueueItem mediaQueueItem = this.a;
            if (mediaQueueItem.b == null) {
                throw new IllegalArgumentException("media cannot be null.");
            }
            if (!Double.isNaN(mediaQueueItem.e) && mediaQueueItem.e < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (Double.isNaN(mediaQueueItem.f)) {
                throw new IllegalArgumentException("playbackDuration cannot be NaN.");
            }
            if (Double.isNaN(mediaQueueItem.g) || mediaQueueItem.g < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            return mediaQueueItem;
        }

        public a(@NonNull JSONObject jSONObject) throws JSONException {
            this.a = new MediaQueueItem(jSONObject);
        }
    }
}
