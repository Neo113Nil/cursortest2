package com.google.android.gms.fido.fido2.api.common;

import R9.C1552c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new C1552c();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32985a;

    public zzz(boolean z10) {
        this.f32985a = ((Boolean) AbstractC3191o.m(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzz) && this.f32985a == ((zzz) obj).f32985a;
    }

    public final int hashCode() {
        return AbstractC3189m.c(Boolean.valueOf(this.f32985a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.g(parcel, 1, this.f32985a);
        E9.b.b(parcel, a10);
    }
}
