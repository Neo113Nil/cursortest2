package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class MediaLoadRequestData extends AbstractSafeParcelable implements RequestData {
    public final MediaInfo a;
    public final MediaQueueData b;
    public final Boolean c;
    public final long d;
    public final double e;
    public final long[] f;
    public String g;
    public final JSONObject h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final long m;
    public static final Logger n = new Logger("MediaLoadRequestData", null);

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<MediaLoadRequestData> CREATOR = new zzbt();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes.dex */
    public static class Builder {
        public MediaQueueData a;
        public Boolean b = Boolean.TRUE;
        public long c = -1;
        public final double d = 1.0d;
    }

    public MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.a = mediaInfo;
        this.b = mediaQueueData;
        this.c = bool;
        this.d = j;
        this.e = d;
        this.f = jArr;
        this.h = jSONObject;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLoadRequestData)) {
            return false;
        }
        MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
        return JsonUtils.a(this.h, mediaLoadRequestData.h) && Objects.a(this.a, mediaLoadRequestData.a) && Objects.a(this.b, mediaLoadRequestData.b) && Objects.a(this.c, mediaLoadRequestData.c) && this.d == mediaLoadRequestData.d && this.e == mediaLoadRequestData.e && Arrays.equals(this.f, mediaLoadRequestData.f) && Objects.a(this.i, mediaLoadRequestData.i) && Objects.a(this.j, mediaLoadRequestData.j) && Objects.a(this.k, mediaLoadRequestData.k) && Objects.a(this.l, mediaLoadRequestData.l) && this.m == mediaLoadRequestData.m;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.h), this.i, this.j, this.k, this.l, Long.valueOf(this.m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.h;
        this.g = jSONObject == null ? null : jSONObject.toString();
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        SafeParcelWriter.l(parcel, 3, this.b, i, false);
        SafeParcelWriter.a(parcel, 4, this.c);
        SafeParcelWriter.r(parcel, 5, 8);
        parcel.writeLong(this.d);
        SafeParcelWriter.r(parcel, 6, 8);
        parcel.writeDouble(this.e);
        SafeParcelWriter.j(parcel, 7, this.f);
        SafeParcelWriter.m(parcel, 8, this.g, false);
        SafeParcelWriter.m(parcel, 9, this.i, false);
        SafeParcelWriter.m(parcel, 10, this.j, false);
        SafeParcelWriter.m(parcel, 11, this.k, false);
        SafeParcelWriter.m(parcel, 12, this.l, false);
        SafeParcelWriter.r(parcel, 13, 8);
        parcel.writeLong(this.m);
        SafeParcelWriter.t(parcel, s);
    }
}
