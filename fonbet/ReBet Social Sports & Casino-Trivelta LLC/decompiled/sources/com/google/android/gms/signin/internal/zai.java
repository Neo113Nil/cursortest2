package com.google.android.gms.signin.internal;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import da.h;

/* loaded from: classes2.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final int f34493a;

    /* renamed from: b, reason: collision with root package name */
    public final zat f34494b;

    public zai(int i10, zat zatVar) {
        this.f34493a = i10;
        this.f34494b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f34493a);
        b.D(parcel, 2, this.f34494b, i10, false);
        b.b(parcel, a10);
    }
}
