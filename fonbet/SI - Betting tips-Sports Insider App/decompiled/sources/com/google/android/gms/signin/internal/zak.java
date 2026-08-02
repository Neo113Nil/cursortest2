package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zaaa;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new b(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f5851a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectionResult f5852b;

    /* renamed from: c, reason: collision with root package name */
    public final zaaa f5853c;

    public zak(int i5, ConnectionResult connectionResult, zaaa zaaaVar) {
        this.f5851a = i5;
        this.f5852b = connectionResult;
        this.f5853c = zaaaVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f5851a);
        h8.b.N(parcel, 2, this.f5852b, i5, false);
        h8.b.N(parcel, 3, this.f5853c, i5, false);
        h8.b.W(parcel, V);
    }
}
