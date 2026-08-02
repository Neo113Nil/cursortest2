package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import z9.h;

/* loaded from: classes2.dex */
public final class zbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbf> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final String f32188a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32189b;

    public zbf(String str, boolean z10) {
        this.f32188a = str;
        this.f32189b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zbf) {
            zbf zbfVar = (zbf) obj;
            if (this.f32188a.equals(zbfVar.f32188a) && this.f32189b == zbfVar.f32189b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3189m.c(this.f32188a, Boolean.valueOf(this.f32189b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f32188a;
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, str, false);
        E9.b.g(parcel, 2, this.f32189b);
        E9.b.b(parcel, a10);
    }
}
