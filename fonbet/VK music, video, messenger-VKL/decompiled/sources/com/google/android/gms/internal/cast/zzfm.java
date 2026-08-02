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
public final class zzfm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfm> CREATOR = new zzfl();
    private final String zza;
    private final byte[] zzb;
    private final List zzc;

    public zzfm(String str, byte[] bArr, @Nullable List list) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfm)) {
            return false;
        }
        zzfm zzfmVar = (zzfm) obj;
        return dq70.b(this.zza, zzfmVar.zza) && dq70.b(this.zzb, zzfmVar.zzb) && dq70.b(this.zzc, zzfmVar.zzc);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, str, false);
        ozg0.e(parcel, 2, this.zzb, false);
        ozg0.j(parcel, new ArrayList(this.zzc), 3);
        ozg0.x(w, parcel);
    }
}
