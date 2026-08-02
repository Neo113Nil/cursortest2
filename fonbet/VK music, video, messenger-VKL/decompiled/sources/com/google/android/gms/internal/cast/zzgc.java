package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzgc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgc> CREATOR = new zzgd();
    private final int zza;
    private final boolean zzb;
    private final List zzc;
    private final int zzd;

    @Nullable
    private final String zze;
    private final boolean zzf;

    public zzgc(int i, boolean z, List list, int i2, @Nullable String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.zzc = arrayList;
        this.zza = i;
        this.zzb = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.zzd = i2;
        this.zze = str;
        this.zzf = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.zza;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.zzb;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.s(parcel, this.zzc, 4);
        int i3 = this.zzd;
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(i3);
        ozg0.q(parcel, 6, this.zze, false);
        boolean z2 = this.zzf;
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ozg0.x(w, parcel);
    }

    public final int zza() {
        return this.zza;
    }
}
