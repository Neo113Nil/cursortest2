package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhp;
import java.util.Arrays;
import xsna.bxz0;
import xsna.dq70;
import xsna.h5s;
import xsna.k46;
import xsna.ozg0;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new bxz0();

    @Nullable
    public final zzgx b;

    @Nullable
    public final zzgx c;

    @Nullable
    public final zzgx d;
    public final int e;

    static {
        zzhp.zzg(1L);
        zzhp.zzg(2L);
        zzhp.zzg(3L);
        zzhp.zzg(4L);
    }

    public zzai(@Nullable zzgx zzgxVar, @Nullable zzgx zzgxVar2, @Nullable zzgx zzgxVar3, int i) {
        this.b = zzgxVar;
        this.c = zzgxVar2;
        this.d = zzgxVar3;
        this.e = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return dq70.b(this.b, zzaiVar.b) && dq70.b(this.c, zzaiVar.c) && dq70.b(this.d, zzaiVar.d) && this.e == zzaiVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Integer.valueOf(this.e)});
    }

    public final String toString() {
        zzgx zzgxVar = this.b;
        String c = k46.c(zzgxVar == null ? null : zzgxVar.zzm());
        zzgx zzgxVar2 = this.c;
        String c2 = k46.c(zzgxVar2 == null ? null : zzgxVar2.zzm());
        zzgx zzgxVar3 = this.d;
        String c3 = k46.c(zzgxVar3 != null ? zzgxVar3.zzm() : null);
        StringBuilder a = xe9.a("HmacSecretExtension{coseKeyAgreement=", c, ", saltEnc=", c2, ", saltAuth=");
        a.append(c3);
        a.append(", getPinUvAuthProtocol=");
        return h5s.c(this.e, "}", a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        zzgx zzgxVar = this.b;
        ozg0.e(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.c;
        ozg0.e(parcel, 2, zzgxVar2 == null ? null : zzgxVar2.zzm(), false);
        zzgx zzgxVar3 = this.d;
        ozg0.e(parcel, 3, zzgxVar3 != null ? zzgxVar3.zzm() : null, false);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e);
        ozg0.x(w, parcel);
    }
}
