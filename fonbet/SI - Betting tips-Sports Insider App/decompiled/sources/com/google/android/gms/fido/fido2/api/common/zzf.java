package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;
import k7.r0;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new l(18);

    /* renamed from: a, reason: collision with root package name */
    public final r0 f4775a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f4776b;

    public zzf(r0 r0Var, r0 r0Var2) {
        this.f4775a = r0Var;
        this.f4776b = r0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return v.k(this.f4775a, zzfVar.f4775a) && v.k(this.f4776b, zzfVar.f4776b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4775a, this.f4776b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        r0 r0Var = this.f4775a;
        b.G(parcel, 1, r0Var == null ? null : r0Var.i(), false);
        r0 r0Var2 = this.f4776b;
        b.G(parcel, 2, r0Var2 != null ? r0Var2.i() : null, false);
        b.W(parcel, V);
    }
}
