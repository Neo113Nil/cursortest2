package com.google.android.gms.appset;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import u9.d;

/* loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final String f31996a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31997b;

    public zza(String str, String str2) {
        this.f31996a = str;
        this.f31997b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.f31996a, false);
        b.F(parcel, 2, this.f31997b, false);
        b.b(parcel, a10);
    }
}
