package com.google.android.gms.maps.model;

import Y9.j;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class Tile extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Tile> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public final int f33254a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33255b;
    public final byte[] data;

    public Tile(int i10, int i11, byte[] bArr) {
        this.f33254a = i10;
        this.f33255b = i11;
        this.data = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f33254a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 2, i11);
        E9.b.u(parcel, 3, this.f33255b);
        E9.b.l(parcel, 4, this.data, false);
        E9.b.b(parcel, a10);
    }
}
