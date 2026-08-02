package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.List;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    private final int zza;
    private final int zzb;
    private final String zzc;

    @Nullable
    private final String zzd;
    private final int zze;

    @Nullable
    private final String zzf;

    @Nullable
    private final zzd zzg;
    private final List zzh;

    static {
        Process.myUid();
        Process.myPid();
    }

    public zzd(int i, int i2, String str, @Nullable String str2, @Nullable String str3, int i3, List list, @Nullable zzd zzdVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = str3;
        this.zze = i3;
        this.zzh = zzds.zzj(list);
        this.zzg = zzdVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzd) {
            zzd zzdVar = (zzd) obj;
            if (this.zza == zzdVar.zza && this.zzb == zzdVar.zzb && this.zze == zzdVar.zze && this.zzc.equals(zzdVar.zzc) && zzdl.zza(this.zzd, zzdVar.zzd) && zzdl.zza(this.zzf, zzdVar.zzf) && zzdl.zza(this.zzg, zzdVar.zzg) && this.zzh.equals(zzdVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzc, this.zzd, this.zzf});
    }

    public final String toString() {
        int length = this.zzc.length() + 18;
        String str = this.zzd;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.zza);
        sb.append(DomExceptionUtils.SEPARATOR);
        sb.append(this.zzc);
        if (this.zzd != null) {
            sb.append(X3.j.d);
            if (this.zzd.startsWith(this.zzc)) {
                sb.append((CharSequence) this.zzd, this.zzc.length(), this.zzd.length());
            } else {
                sb.append(this.zzd);
            }
            sb.append(X3.j.e);
        }
        if (this.zzf != null) {
            sb.append(DomExceptionUtils.SEPARATOR);
            sb.append(Integer.toHexString(this.zzf.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.zza;
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i3);
        ozg0.q(parcel, 3, this.zzc, false);
        ozg0.q(parcel, 4, this.zzd, false);
        int i4 = this.zze;
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(i4);
        ozg0.q(parcel, 6, this.zzf, false);
        ozg0.p(parcel, 7, this.zzg, i, false);
        ozg0.u(parcel, 8, this.zzh, false);
        ozg0.x(w, parcel);
    }
}
