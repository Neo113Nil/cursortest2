package com.google.android.gms.internal.auth;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new a(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f4856a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4857b;

    public zzaz(String str, byte[] bArr) {
        v.h(str);
        this.f4856a = str;
        v.h(bArr);
        this.f4857b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(1);
        b.O(parcel, 2, this.f4856a, false);
        b.G(parcel, 3, this.f4857b, false);
        b.W(parcel, V);
    }
}
