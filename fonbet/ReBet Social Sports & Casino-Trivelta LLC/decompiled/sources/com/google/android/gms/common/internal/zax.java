package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new Q();

    /* renamed from: a, reason: collision with root package name */
    public final int f32767a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32768b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32769c;

    @Deprecated
    private final Scope[] zad;

    public zax(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f32767a = i10;
        this.f32768b = i11;
        this.f32769c = i12;
        this.zad = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32767a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.u(parcel, 2, this.f32768b);
        E9.b.u(parcel, 3, this.f32769c);
        E9.b.I(parcel, 4, this.zad, i10, false);
        E9.b.b(parcel, a10);
    }
}
