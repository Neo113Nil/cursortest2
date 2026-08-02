package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import da.b;

/* loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable implements l {
    public static final Parcelable.Creator<zaa> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f34488a;

    /* renamed from: b, reason: collision with root package name */
    public int f34489b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f34490c;

    public zaa(int i10, int i11, Intent intent) {
        this.f34488a = i10;
        this.f34489b = i11;
        this.f34490c = intent;
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this.f34489b == 0 ? Status.f32275f : Status.f32279j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f34488a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.u(parcel, 2, this.f34489b);
        E9.b.D(parcel, 3, this.f34490c, i10, false);
        E9.b.b(parcel, a10);
    }
}
