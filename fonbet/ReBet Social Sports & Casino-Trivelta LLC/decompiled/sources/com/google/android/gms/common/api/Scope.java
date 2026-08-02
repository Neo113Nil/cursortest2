package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new z();
    final int zza;
    private final String zzb;

    public Scope(int i10, String str) {
        AbstractC3191o.h(str, "scopeUri must not be null or empty");
        this.zza = i10;
        this.zzb = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.zzb.equals(((Scope) obj).zzb);
        }
        return false;
    }

    @NonNull
    public String getScopeUri() {
        return this.zzb;
    }

    public int hashCode() {
        return this.zzb.hashCode();
    }

    @NonNull
    public String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.F(parcel, 2, getScopeUri(), false);
        E9.b.b(parcel, a10);
    }

    public Scope(@NonNull String str) {
        this(1, str);
    }
}
