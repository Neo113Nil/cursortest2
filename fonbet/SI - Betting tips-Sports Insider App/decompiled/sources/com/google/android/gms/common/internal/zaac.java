package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zaac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaac> CREATOR = new j(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f4539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4541c;

    /* renamed from: d, reason: collision with root package name */
    public final Scope[] f4542d;

    public zaac(int i5, int i10, int i11, Scope[] scopeArr) {
        this.f4539a = i5;
        this.f4540b = i10;
        this.f4541c = i11;
        this.f4542d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4539a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4540b);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4541c);
        b.Q(parcel, 4, this.f4542d, i5);
        b.W(parcel, V);
    }
}
