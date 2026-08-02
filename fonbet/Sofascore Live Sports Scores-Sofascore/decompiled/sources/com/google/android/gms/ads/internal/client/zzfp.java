package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzfp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfp> CREATOR = new zzfq();

    @SafeParcelable.Field
    public final String zza;

    @SafeParcelable.Field
    public final int zzb;

    @SafeParcelable.Field
    public final zzm zzc;

    @SafeParcelable.Field
    public final int zzd;

    @SafeParcelable.Field
    public final boolean zze;

    @SafeParcelable.Constructor
    public zzfp(@SafeParcelable.Param String str, @SafeParcelable.Param int i, @SafeParcelable.Param zzm zzmVar, @SafeParcelable.Param int i2, @SafeParcelable.Param boolean z) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zzmVar;
        this.zzd = i2;
        this.zze = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfp) {
            zzfp zzfpVar = (zzfp) obj;
            if (this.zza.equals(zzfpVar.zza) && this.zzb == zzfpVar.zzb && this.zzc.zza(zzfpVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, str, false);
        int i2 = this.zzb;
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.l(parcel, 3, this.zzc, i, false);
        int i3 = this.zzd;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(i3);
        boolean z = this.zze;
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }

    public final zzfp zza(int i) {
        if (i <= 0) {
            i = this.zzd;
        }
        zzm zzmVar = this.zzc;
        int i2 = this.zzb;
        return new zzfp(this.zza, i2, zzmVar, i, this.zze);
    }
}
