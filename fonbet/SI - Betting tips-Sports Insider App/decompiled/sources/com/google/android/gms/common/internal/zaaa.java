package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.a;
import g6.g;
import g6.i0;
import g6.j;
import g6.v;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zaaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaaa> CREATOR = new j(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f4534a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f4535b;

    /* renamed from: c, reason: collision with root package name */
    public final ConnectionResult f4536c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4537d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4538e;

    public zaaa(int i5, IBinder iBinder, ConnectionResult connectionResult, boolean z5, boolean z7) {
        this.f4534a = i5;
        this.f4535b = iBinder;
        this.f4536c = connectionResult;
        this.f4537d = z5;
        this.f4538e = z7;
    }

    public final boolean equals(Object obj) {
        Object i0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaaa)) {
            return false;
        }
        zaaa zaaaVar = (zaaa) obj;
        if (!this.f4536c.equals(zaaaVar.f4536c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f4535b;
        if (iBinder == null) {
            i0Var = null;
        } else {
            int i5 = a.f9794f;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            i0Var = queryLocalInterface instanceof g ? (g) queryLocalInterface : new i0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 4);
        }
        IBinder iBinder2 = zaaaVar.f4535b;
        if (iBinder2 != null) {
            int i10 = a.f9794f;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof g ? (g) queryLocalInterface2 : new i0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 4);
        }
        return v.k(i0Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4534a);
        b.I(parcel, 2, this.f4535b);
        b.N(parcel, 3, this.f4536c, i5, false);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f4537d ? 1 : 0);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f4538e ? 1 : 0);
        b.W(parcel, V);
    }
}
