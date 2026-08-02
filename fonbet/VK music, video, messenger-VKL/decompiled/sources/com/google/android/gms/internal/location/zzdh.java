package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import xsna.lhg;
import xsna.n23;
import xsna.ozg0;
import xsna.rnt;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@VisibleForTesting
/* loaded from: classes12.dex */
public final class zzdh extends AbstractSafeParcelable implements rnt {
    public static final Parcelable.Creator<zzdh> CREATOR = new zzdi();
    private final String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    public zzdh(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        }
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException(n23.a(f, "invalid radius: "));
        }
        if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        }
        int i4 = i & 7;
        if (i4 == 0) {
            throw new IllegalArgumentException(lhg.a(i, "No supported transition specified: "));
        }
        this.zzc = s;
        this.zza = str;
        this.zzd = d;
        this.zze = d2;
        this.zzf = f;
        this.zzb = j;
        this.zzg = i4;
        this.zzh = i2;
        this.zzi = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdh) {
            zzdh zzdhVar = (zzdh) obj;
            if (this.zzf == zzdhVar.zzf && this.zzd == zzdhVar.zzd && this.zze == zzdhVar.zze && this.zzc == zzdhVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final long getExpirationTime() {
        return this.zzb;
    }

    public final double getLatitude() {
        return this.zzd;
    }

    public final int getLoiteringDelay() {
        return this.zzi;
    }

    public final double getLongitude() {
        return this.zze;
    }

    public final int getNotificationResponsiveness() {
        return this.zzh;
    }

    public final float getRadius() {
        return this.zzf;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int getTransitionTypes() {
        return this.zzg;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzd);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((Float.floatToIntBits(this.zzf) + ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s = this.zzc;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s != -1 ? s != 1 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "CIRCLE" : "INVALID", this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.zza, false);
        long j = this.zzb;
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(j);
        short s = this.zzc;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(s);
        double d = this.zzd;
        ozg0.v(parcel, 4, 8);
        parcel.writeDouble(d);
        double d2 = this.zze;
        ozg0.v(parcel, 5, 8);
        parcel.writeDouble(d2);
        float f = this.zzf;
        ozg0.v(parcel, 6, 4);
        parcel.writeFloat(f);
        int i2 = this.zzg;
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(i2);
        int i3 = this.zzh;
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(i3);
        int i4 = this.zzi;
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(i4);
        ozg0.x(w, parcel);
    }
}
