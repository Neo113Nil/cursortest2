package com.google.android.gms.location;

import Ej.b;
import Ij.C3261b;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzdj;
import spay.sdk.api.ErrorCode;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({4, 5, 1000})
/* loaded from: classes9.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzx();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 1)
    private int zza;

    @SafeParcelable.Field(defaultValue = "3600000", getter = "getIntervalMillis", id = 2)
    private long zzb;

    @SafeParcelable.Field(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", id = 3)
    private long zzc;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMaxUpdateDelayMillis", id = 8)
    private long zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 10)
    private long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", id = 6)
    private int zzf;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMinUpdateDistanceMeters", id = 7)
    private float zzg;

    @SafeParcelable.Field(defaultValue = "false", getter = "isWaitForAccurateLocation", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(defaultValueUnchecked = ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE, getter = "getMaxUpdateAgeMillis", id = 11)
    private long zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 12)
    private final int zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 13)
    private final int zzk;

    @SafeParcelable.Field(getter = "getModuleId", id = 14)
    private final String zzl;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 15)
    private final boolean zzm;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 16)
    private final WorkSource zzn;

    @SafeParcelable.Field(getter = "getImpersonation", id = 17)
    private final com.google.android.gms.internal.location.zzd zzo;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    @NonNull
    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    private static String zzf(long j11) {
        return j11 == Long.MAX_VALUE ? "∞" : zzdj.zza(j11);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzm == locationRequest.zzm && this.zzn.equals(locationRequest.zzn) && Objects.equal(this.zzl, locationRequest.zzl) && Objects.equal(this.zzo, locationRequest.zzo)))) {
                return true;
            }
        }
        return false;
    }

    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    public long getExpirationTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.zze;
        long j12 = elapsedRealtime + j11;
        if (((elapsedRealtime ^ j12) & (j11 ^ j12)) < 0) {
            return Long.MAX_VALUE;
        }
        return j12;
    }

    @Deprecated
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    public long getInterval() {
        return getIntervalMillis();
    }

    public long getIntervalMillis() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzn);
    }

    public boolean isBatched() {
        long j11 = this.zzd;
        return j11 > 0 && (j11 >> 1) >= this.zzb;
    }

    @Deprecated
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationDuration(long j11) {
        Preconditions.checkArgument(j11 > 0, "durationMillis must be greater than 0");
        this.zze = j11;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationTime(long j11) {
        this.zze = Math.max(1L, j11 - SystemClock.elapsedRealtime());
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setFastestInterval(long j11) {
        Preconditions.checkArgument(j11 >= 0, "illegal fastest interval: %d", Long.valueOf(j11));
        this.zzc = j11;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setInterval(long j11) {
        Preconditions.checkArgument(j11 >= 0, "intervalMillis must be greater than or equal to 0");
        long j12 = this.zzc;
        long j13 = this.zzb;
        if (j12 == j13 / 6) {
            this.zzc = j11 / 6;
        }
        if (this.zzi == j13) {
            this.zzi = j11;
        }
        this.zzb = j11;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setMaxWaitTime(long j11) {
        Preconditions.checkArgument(j11 >= 0, "illegal max wait time: %d", Long.valueOf(j11));
        this.zzd = j11;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setNumUpdates(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException(b.a(i11, "invalid numUpdates: "));
        }
        this.zzf = i11;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setPriority(int i11) {
        zzae.zza(i11);
        this.zza = i11;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setSmallestDisplacement(float f7) {
        if (f7 >= 0.0f) {
            this.zzg = f7;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f7);
    }

    @NonNull
    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z11) {
        this.zzh = z11;
        return this;
    }

    @NonNull
    public String toString() {
        StringBuilder e11 = C3261b.e("Request[");
        if (isPassive()) {
            e11.append(zzae.zzb(this.zza));
        } else {
            e11.append("@");
            if (isBatched()) {
                zzdj.zzb(this.zzb, e11);
                e11.append("/");
                zzdj.zzb(this.zzd, e11);
            } else {
                zzdj.zzb(this.zzb, e11);
            }
            e11.append(" ");
            e11.append(zzae.zzb(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            e11.append(", minUpdateInterval=");
            e11.append(zzf(this.zzc));
        }
        if (this.zzg > 0.0d) {
            e11.append(", minUpdateDistance=");
            e11.append(this.zzg);
        }
        if (!isPassive() ? this.zzi != this.zzb : this.zzi != Long.MAX_VALUE) {
            e11.append(", maxUpdateAge=");
            e11.append(zzf(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            e11.append(", duration=");
            zzdj.zzb(this.zze, e11);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            e11.append(", maxUpdates=");
            e11.append(this.zzf);
        }
        if (this.zzk != 0) {
            e11.append(", ");
            e11.append(zzai.zza(this.zzk));
        }
        if (this.zzj != 0) {
            e11.append(", ");
            e11.append(zzo.zzb(this.zzj));
        }
        if (this.zzh) {
            e11.append(", waitForAccurateLocation");
        }
        if (this.zzm) {
            e11.append(", bypass");
        }
        if (this.zzl != null) {
            e11.append(", moduleId=");
            e11.append(this.zzl);
        }
        if (!WorkSourceUtil.isEmpty(this.zzn)) {
            e11.append(", ");
            e11.append(this.zzn);
        }
        if (this.zzo != null) {
            e11.append(", impersonation=");
            e11.append(this.zzo);
        }
        e11.append(']');
        return e11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getPriority());
        SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        SafeParcelWriter.writeInt(parcel, 13, this.zzk);
        SafeParcelWriter.writeString(parcel, 14, this.zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzm);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzn, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzk;
    }

    @NonNull
    public final WorkSource zzb() {
        return this.zzn;
    }

    public final com.google.android.gms.internal.location.zzd zzc() {
        return this.zzo;
    }

    @Deprecated
    public final String zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzm;
    }

    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;
        private String zzl;
        private boolean zzm;
        private WorkSource zzn;
        private com.google.android.gms.internal.location.zzd zzo;

        public Builder(int i11, long j11) {
            Preconditions.checkArgument(j11 >= 0, "intervalMillis must be greater than or equal to 0");
            zzae.zza(i11);
            this.zza = i11;
            this.zzb = j11;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }

        @NonNull
        public LocationRequest build() {
            int i11 = this.zza;
            long j11 = this.zzb;
            long j12 = this.zzc;
            if (j12 == -1) {
                j12 = j11;
            } else if (i11 != 105) {
                j12 = Math.min(j12, j11);
            }
            long max = Math.max(this.zzd, this.zzb);
            long j13 = this.zze;
            int i12 = this.zzf;
            float f7 = this.zzg;
            boolean z11 = this.zzh;
            long j14 = this.zzi;
            if (j14 == -1) {
                j14 = this.zzb;
            }
            return new LocationRequest(i11, j11, j12, max, Long.MAX_VALUE, j13, i12, f7, z11, j14, this.zzj, this.zzk, this.zzl, this.zzm, new WorkSource(this.zzn), this.zzo);
        }

        @NonNull
        public Builder setDurationMillis(long j11) {
            Preconditions.checkArgument(j11 > 0, "durationMillis must be greater than 0");
            this.zze = j11;
            return this;
        }

        @NonNull
        public Builder setGranularity(int i11) {
            zzo.zza(i11);
            this.zzj = i11;
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(long j11) {
            Preconditions.checkArgument(j11 >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j11;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j11) {
            boolean z11 = true;
            if (j11 != -1 && j11 < 0) {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.zzi = j11;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(long j11) {
            Preconditions.checkArgument(j11 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.zzd = j11;
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(int i11) {
            Preconditions.checkArgument(i11 > 0, "maxUpdates must be greater than 0");
            this.zzf = i11;
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(float f7) {
            Preconditions.checkArgument(f7 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.zzg = f7;
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(long j11) {
            boolean z11 = true;
            if (j11 != -1 && j11 < 0) {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.zzc = j11;
            return this;
        }

        @NonNull
        public Builder setPriority(int i11) {
            zzae.zza(i11);
            this.zza = i11;
            return this;
        }

        @NonNull
        public Builder setWaitForAccurateLocation(boolean z11) {
            this.zzh = z11;
            return this;
        }

        @NonNull
        public final Builder zza(boolean z11) {
            this.zzm = z11;
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zzb(String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.zzl = str;
            }
            return this;
        }

        @NonNull
        public final Builder zzc(int i11) {
            int i12;
            boolean z11 = true;
            if (i11 != 0 && i11 != 1) {
                i12 = 2;
                if (i11 == 2) {
                    i11 = 2;
                    Preconditions.checkArgument(z11, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i11));
                    this.zzk = i12;
                    return this;
                }
                z11 = false;
            }
            i12 = i11;
            Preconditions.checkArgument(z11, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i11));
            this.zzk = i12;
            return this;
        }

        @NonNull
        public final Builder zzd(WorkSource workSource) {
            this.zzn = workSource;
            return this;
        }

        public Builder(long j11) {
            Preconditions.checkArgument(j11 >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j11;
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }

        public Builder(@NonNull LocationRequest locationRequest) {
            this.zza = locationRequest.getPriority();
            this.zzb = locationRequest.getIntervalMillis();
            this.zzc = locationRequest.getMinUpdateIntervalMillis();
            this.zzd = locationRequest.getMaxUpdateDelayMillis();
            this.zze = locationRequest.getDurationMillis();
            this.zzf = locationRequest.getMaxUpdates();
            this.zzg = locationRequest.getMinUpdateDistanceMeters();
            this.zzh = locationRequest.isWaitForAccurateLocation();
            this.zzi = locationRequest.getMaxUpdateAgeMillis();
            this.zzj = locationRequest.getGranularity();
            this.zzk = locationRequest.zza();
            this.zzl = locationRequest.zzd();
            this.zzm = locationRequest.zze();
            this.zzn = locationRequest.zzb();
            this.zzo = locationRequest.zzc();
        }
    }

    @SafeParcelable.Constructor
    LocationRequest(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) long j11, @SafeParcelable.Param(id = 3) long j12, @SafeParcelable.Param(id = 8) long j13, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", id = 5) long j14, @SafeParcelable.Param(id = 10) long j15, @SafeParcelable.Param(id = 6) int i12, @SafeParcelable.Param(id = 7) float f7, @SafeParcelable.Param(id = 9) boolean z11, @SafeParcelable.Param(id = 11) long j16, @SafeParcelable.Param(id = 12) int i13, @SafeParcelable.Param(id = 13) int i14, @SafeParcelable.Param(id = 14) String str, @SafeParcelable.Param(id = 15) boolean z12, @SafeParcelable.Param(id = 16) WorkSource workSource, @SafeParcelable.Param(id = 17) com.google.android.gms.internal.location.zzd zzdVar) {
        this.zza = i11;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14 == Long.MAX_VALUE ? j15 : Math.min(Math.max(1L, j14 - SystemClock.elapsedRealtime()), j15);
        this.zzf = i12;
        this.zzg = f7;
        this.zzh = z11;
        this.zzi = j16 != -1 ? j16 : j11;
        this.zzj = i13;
        this.zzk = i14;
        this.zzl = str;
        this.zzm = z12;
        this.zzn = workSource;
        this.zzo = zzdVar;
    }
}
