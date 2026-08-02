package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.Arrays;
import k7.r0;
import r4.k;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new b(27);

    /* renamed from: a, reason: collision with root package name */
    public final r0 f4768a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f4769b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f4770c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4771d;

    public zzai(r0 r0Var, r0 r0Var2, r0 r0Var3, int i5) {
        this.f4768a = r0Var;
        this.f4769b = r0Var2;
        this.f4770c = r0Var3;
        this.f4771d = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        return v.k(this.f4768a, zzaiVar.f4768a) && v.k(this.f4769b, zzaiVar.f4769b) && v.k(this.f4770c, zzaiVar.f4770c) && this.f4771d == zzaiVar.f4771d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4768a, this.f4769b, this.f4770c, Integer.valueOf(this.f4771d)});
    }

    public final String toString() {
        r0 r0Var = this.f4768a;
        String c2 = q6.b.c(r0Var == null ? null : r0Var.i());
        r0 r0Var2 = this.f4769b;
        String c8 = q6.b.c(r0Var2 == null ? null : r0Var2.i());
        r0 r0Var3 = this.f4770c;
        String c10 = q6.b.c(r0Var3 != null ? r0Var3.i() : null);
        StringBuilder q = k.q("HmacSecretExtension{coseKeyAgreement=", c2, ", saltEnc=", c8, ", saltAuth=");
        q.append(c10);
        q.append(", getPinUvAuthProtocol=");
        return k.n(q, this.f4771d, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        r0 r0Var = this.f4768a;
        h8.b.G(parcel, 1, r0Var == null ? null : r0Var.i(), false);
        r0 r0Var2 = this.f4769b;
        h8.b.G(parcel, 2, r0Var2 == null ? null : r0Var2.i(), false);
        r0 r0Var3 = this.f4770c;
        h8.b.G(parcel, 3, r0Var3 != null ? r0Var3.i() : null, false);
        h8.b.U(parcel, 4, 4);
        parcel.writeInt(this.f4771d);
        h8.b.W(parcel, V);
    }
}
