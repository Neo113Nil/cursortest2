package com.google.android.gms.fido.fido2.api.common;

import R9.C1556g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new C1556g();

    /* renamed from: a, reason: collision with root package name */
    public final String f32975a;

    public zzag(String str) {
        this.f32975a = (String) AbstractC3191o.m(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.f32975a.equals(((zzag) obj).f32975a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3189m.c(this.f32975a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f32975a, false);
        E9.b.b(parcel, a10);
    }
}
