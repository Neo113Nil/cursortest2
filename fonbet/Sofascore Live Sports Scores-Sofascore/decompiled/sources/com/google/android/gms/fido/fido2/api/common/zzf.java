package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.xgo;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    public final zzgx a;
    public final zzgx b;

    public zzf(xgo xgoVar, xgo xgoVar2) {
        this.a = xgoVar;
        this.b = xgoVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return Objects.a(this.a, zzfVar.a) && Objects.a(this.b, zzfVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        zzgx zzgxVar = this.a;
        SafeParcelWriter.c(parcel, 1, zzgxVar == null ? null : zzgxVar.s(), false);
        zzgx zzgxVar2 = this.b;
        SafeParcelWriter.c(parcel, 2, zzgxVar2 != null ? zzgxVar2.s() : null, false);
        SafeParcelWriter.t(parcel, s);
    }
}
