package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new l(8);

    /* renamed from: a, reason: collision with root package name */
    public final String f4774a;

    public zzaw(String str) {
        this.f4774a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaw) {
            return v.k(this.f4774a, ((zzaw) obj).f4774a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4774a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.O(parcel, 1, this.f4774a, false);
        b.W(parcel, V);
    }
}
