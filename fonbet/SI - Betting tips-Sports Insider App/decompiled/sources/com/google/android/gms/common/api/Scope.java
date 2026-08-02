package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d6.o;
import g6.v;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new o(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f4459a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4460b;

    public Scope(int i5, String str) {
        v.f(str, "scopeUri must not be null or empty");
        this.f4459a = i5;
        this.f4460b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f4460b.equals(((Scope) obj).f4460b);
    }

    public final int hashCode() {
        return this.f4460b.hashCode();
    }

    public final String toString() {
        return this.f4460b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4459a);
        b.O(parcel, 2, this.f4460b, false);
        b.W(parcel, V);
    }
}
