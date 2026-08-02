package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes2.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    public final String f34690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34691b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34692c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34693d;

    public zzaj(String str, String str2, int i10, int i11) {
        this.f34690a = str;
        this.f34691b = str2;
        this.f34692c = i10;
        this.f34693d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f34690a;
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, str, false);
        E9.b.F(parcel, 3, this.f34691b, false);
        E9.b.u(parcel, 4, this.f34692c);
        E9.b.u(parcel, 5, this.f34693d);
        E9.b.b(parcel, a10);
    }
}
