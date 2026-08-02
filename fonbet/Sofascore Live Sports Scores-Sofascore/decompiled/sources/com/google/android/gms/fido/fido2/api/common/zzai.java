package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhk;
import defpackage.fc6;
import defpackage.mz1;
import defpackage.xgo;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();
    public final zzgx a;
    public final zzgx b;
    public final zzgx c;
    public final int d;

    static {
        new zzhk(1L);
        new zzhk(2L);
        new zzhk(3L);
        new zzhk(4L);
    }

    public zzai(xgo xgoVar, xgo xgoVar2, xgo xgoVar3, int i) {
        this.a = xgoVar;
        this.b = xgoVar2;
        this.c = xgoVar3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return Objects.a(this.a, zzaiVar.a) && Objects.a(this.b, zzaiVar.b) && Objects.a(this.c, zzaiVar.c) && this.d == zzaiVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        zzgx zzgxVar = this.a;
        String b = Base64Utils.b(zzgxVar == null ? null : zzgxVar.s());
        zzgx zzgxVar2 = this.b;
        String b2 = Base64Utils.b(zzgxVar2 == null ? null : zzgxVar2.s());
        zzgx zzgxVar3 = this.c;
        String b3 = Base64Utils.b(zzgxVar3 != null ? zzgxVar3.s() : null);
        StringBuilder s = mz1.s("HmacSecretExtension{coseKeyAgreement=", b, ", saltEnc=", b2, ", saltAuth=");
        s.append(b3);
        s.append(", getPinUvAuthProtocol=");
        return fc6.h(this.d, "}", s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        zzgx zzgxVar = this.a;
        SafeParcelWriter.c(parcel, 1, zzgxVar == null ? null : zzgxVar.s(), false);
        zzgx zzgxVar2 = this.b;
        SafeParcelWriter.c(parcel, 2, zzgxVar2 == null ? null : zzgxVar2.s(), false);
        zzgx zzgxVar3 = this.c;
        SafeParcelWriter.c(parcel, 3, zzgxVar3 != null ? zzgxVar3.s() : null, false);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        SafeParcelWriter.t(parcel, s);
    }
}
