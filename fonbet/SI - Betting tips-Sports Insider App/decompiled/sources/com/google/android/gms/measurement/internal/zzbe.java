package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import q5.b;
import s7.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzbe extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbe> CREATOR = new b(9);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f5796a;

    public zzbe(Bundle bundle) {
        this.f5796a = bundle;
    }

    public final Object c(String str) {
        return this.f5796a.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new o(this);
    }

    public final Double l0() {
        return Double.valueOf(this.f5796a.getDouble("value"));
    }

    public final String o0() {
        return this.f5796a.getString("currency");
    }

    public final Bundle s0() {
        return new Bundle(this.f5796a);
    }

    public final String toString() {
        return this.f5796a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.F(parcel, 2, s0());
        h8.b.W(parcel, V);
    }
}
