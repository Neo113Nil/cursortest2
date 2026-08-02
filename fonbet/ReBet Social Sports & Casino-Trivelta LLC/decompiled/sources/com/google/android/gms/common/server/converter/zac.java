package com.google.android.gms.common.server.converter;

import E9.b;
import H9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f32792a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32793b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32794c;

    public zac(int i10, String str, int i11) {
        this.f32792a = i10;
        this.f32793b = str;
        this.f32794c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32792a;
        int a10 = b.a(parcel);
        b.u(parcel, 1, i11);
        b.F(parcel, 2, this.f32793b, false);
        b.u(parcel, 3, this.f32794c);
        b.b(parcel, a10);
    }

    public zac(String str, int i10) {
        this.f32792a = 1;
        this.f32793b = str;
        this.f32794c = i10;
    }
}
