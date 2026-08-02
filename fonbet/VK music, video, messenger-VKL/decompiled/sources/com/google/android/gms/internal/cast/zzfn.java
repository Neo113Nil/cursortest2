package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.dq70;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzfn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfn> CREATOR;
    private final List zza;
    private final boolean zzb;
    private final boolean zzc;

    static {
        new zzfn(null, false, false);
        CREATOR = new zzfo();
    }

    public zzfn(@Nullable List list, boolean z, boolean z2) {
        this.zza = list == null ? new ArrayList(0) : new ArrayList(list);
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfn)) {
            return false;
        }
        zzfn zzfnVar = (zzfn) obj;
        return dq70.b(this.zza, zzfnVar.zza) && dq70.b(Boolean.valueOf(this.zzb), Boolean.valueOf(zzfnVar.zzb));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Boolean.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, new ArrayList(this.zza), false);
        boolean z = this.zzb;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
