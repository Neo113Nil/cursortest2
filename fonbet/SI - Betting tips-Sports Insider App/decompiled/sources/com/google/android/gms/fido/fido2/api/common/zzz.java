package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new b(22);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4784a;

    public zzz(boolean z5) {
        this.f4784a = Boolean.valueOf(z5).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzz) && this.f4784a == ((zzz) obj).f4784a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4784a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4784a ? 1 : 0);
        h8.b.W(parcel, V);
    }
}
