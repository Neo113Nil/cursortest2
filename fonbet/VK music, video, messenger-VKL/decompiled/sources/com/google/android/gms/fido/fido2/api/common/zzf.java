package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.rc01;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new rc01();

    @Nullable
    public final zzgx b;

    @Nullable
    public final zzgx c;

    public zzf(@Nullable zzgx zzgxVar, @Nullable zzgx zzgxVar2) {
        this.b = zzgxVar;
        this.c = zzgxVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return dq70.b(this.b, zzfVar.b) && dq70.b(this.c, zzfVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        zzgx zzgxVar = this.b;
        ozg0.e(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.c;
        ozg0.e(parcel, 2, zzgxVar2 != null ? zzgxVar2.zzm() : null, false);
        ozg0.x(w, parcel);
    }
}
