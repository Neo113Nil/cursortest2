package com.vk.geo.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import org.chromium.net.NetError;
import xsna.gqr;
import xsna.l370;
import xsna.sdi;
import xsna.vby;

/* compiled from: Coordinate.kt */
@vby
/* loaded from: classes2.dex */
public final class Coordinate implements Parcelable, Serializable {
    public static final Parcelable.Creator<Coordinate> CREATOR;
    public static final long b;

    @Keep
    public static final long serialVersionUID = 5000939355283064482L;
    private final long pair;

    /* compiled from: Coordinate.kt */
    public static final class a implements Parcelable.Creator<Coordinate> {
        @Override // android.os.Parcelable.Creator
        public final Coordinate createFromParcel(Parcel parcel) {
            Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
            return new Coordinate(gqr.a(parcel.readFloat(), parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final Coordinate[] newArray(int i) {
            return new Coordinate[i];
        }
    }

    static {
        gqr.a(-90, NetError.ERR_TLS13_DOWNGRADE_DETECTED);
        gqr.a(90, 180);
        b = gqr.a(Float.NaN, Float.NaN);
        CREATOR = new a();
    }

    public /* synthetic */ Coordinate(long j) {
        this.pair = j;
    }

    public static final char a(long j) {
        return e(j) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 'N' : 'S';
    }

    public static final char b(long j) {
        return f(j) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 'E' : 'W';
    }

    public static final float d(long j, long j2) {
        if (g(j) && g(j2)) {
            return gqr.b(j2, j) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) l370.p(sdi.x(e(j)), sdi.x(f(j)), sdi.x(e(j2)), sdi.x(f(j2)));
        }
        return Float.NaN;
    }

    public static final float e(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float f(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean g(long j) {
        return !gqr.b(j, b);
    }

    public static String i(long j) {
        if (gqr.b(j, b)) {
            return "Invalid";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(e(j));
        sb.append(' ');
        sb.append(a(j));
        sb.append(',');
        sb.append(f(j));
        sb.append(' ');
        sb.append(b(j));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Coordinate) && gqr.b(this.pair, ((Coordinate) obj).pair);
    }

    public final int hashCode() {
        return Long.hashCode(this.pair);
    }

    public final /* synthetic */ long j() {
        return this.pair;
    }

    public final String toString() {
        return i(this.pair);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.pair;
        parcel.writeFloat(e(j));
        parcel.writeFloat(f(j));
    }
}
