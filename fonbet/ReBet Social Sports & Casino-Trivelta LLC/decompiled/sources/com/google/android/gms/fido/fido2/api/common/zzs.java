package com.google.android.gms.fido.fido2.api.common;

import R9.H;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    public final List f32983a;

    public zzs(List list) {
        this.f32983a = (List) AbstractC3191o.m(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.f32983a.containsAll(zzsVar.f32983a) && zzsVar.f32983a.containsAll(this.f32983a);
    }

    public final int hashCode() {
        return AbstractC3189m.c(new HashSet(this.f32983a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.J(parcel, 1, this.f32983a, false);
        E9.b.b(parcel, a10);
    }
}
