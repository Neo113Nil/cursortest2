package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;
import xsna.dq70;
import xsna.l401;
import xsna.nby;
import xsna.o100;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class MediaLoadRequestData extends AbstractSafeParcelable {

    @Nullable
    public final MediaInfo b;

    @Nullable
    public final MediaQueueData c;

    @Nullable
    public final Boolean d;
    public final long e;
    public final double f;

    @Nullable
    public final long[] g;

    @Nullable
    public String h;

    @Nullable
    public final JSONObject i;

    @Nullable
    public final String j;

    @Nullable
    public final String k;

    @Nullable
    public final String l;

    @Nullable
    public final String m;
    public final long n;
    public static final o100 o = new o100("MediaLoadRequestData", null);

    @NonNull
    public static final Parcelable.Creator<MediaLoadRequestData> CREATOR = new l401();

    public MediaLoadRequestData(@Nullable MediaInfo mediaInfo, @Nullable MediaQueueData mediaQueueData, @Nullable Boolean bool, long j, double d, @Nullable long[] jArr, @Nullable JSONObject jSONObject, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j2) {
        this.b = mediaInfo;
        this.c = mediaQueueData;
        this.d = bool;
        this.e = j;
        this.f = d;
        this.g = jArr;
        this.i = jSONObject;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLoadRequestData)) {
            return false;
        }
        MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
        return nby.a(this.i, mediaLoadRequestData.i) && dq70.b(this.b, mediaLoadRequestData.b) && dq70.b(this.c, mediaLoadRequestData.c) && dq70.b(this.d, mediaLoadRequestData.d) && this.e == mediaLoadRequestData.e && this.f == mediaLoadRequestData.f && Arrays.equals(this.g, mediaLoadRequestData.g) && dq70.b(this.j, mediaLoadRequestData.j) && dq70.b(this.k, mediaLoadRequestData.k) && dq70.b(this.l, mediaLoadRequestData.l) && dq70.b(this.m, mediaLoadRequestData.m) && this.n == mediaLoadRequestData.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Long.valueOf(this.e), Double.valueOf(this.f), this.g, String.valueOf(this.i), this.j, this.k, this.l, this.m, Long.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.p(parcel, 3, this.c, i, false);
        ozg0.c(parcel, 4, this.d);
        ozg0.v(parcel, 5, 8);
        parcel.writeLong(this.e);
        ozg0.v(parcel, 6, 8);
        parcel.writeDouble(this.f);
        ozg0.m(parcel, 7, this.g, false);
        ozg0.q(parcel, 8, this.h, false);
        ozg0.q(parcel, 9, this.j, false);
        ozg0.q(parcel, 10, this.k, false);
        ozg0.q(parcel, 11, this.l, false);
        ozg0.q(parcel, 12, this.m, false);
        ozg0.v(parcel, 13, 8);
        parcel.writeLong(this.n);
        ozg0.x(w, parcel);
    }
}
