package com.google.android.gms.internal.auth;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new a(21);

    /* renamed from: a, reason: collision with root package name */
    public final String f4853a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4854b;

    public zzav(String str, int i5) {
        v.h(str);
        this.f4853a = str;
        this.f4854b = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(1);
        b.O(parcel, 2, this.f4853a, false);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4854b);
        b.W(parcel, V);
    }
}
