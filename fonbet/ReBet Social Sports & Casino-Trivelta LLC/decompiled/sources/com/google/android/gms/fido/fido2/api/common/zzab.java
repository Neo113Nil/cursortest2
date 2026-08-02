package com.google.android.gms.fido.fido2.api.common;

import R9.C1553d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C1553d();

    /* renamed from: a, reason: collision with root package name */
    public final long f32973a;

    public zzab(long j10) {
        this.f32973a = ((Long) AbstractC3191o.m(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzab) && this.f32973a == ((zzab) obj).f32973a;
    }

    public final int hashCode() {
        return AbstractC3189m.c(Long.valueOf(this.f32973a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.y(parcel, 1, this.f32973a);
        E9.b.b(parcel, a10);
    }
}
