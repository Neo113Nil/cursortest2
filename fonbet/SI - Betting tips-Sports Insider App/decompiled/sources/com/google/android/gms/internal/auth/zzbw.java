package com.google.android.gms.internal.auth;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new a(25);

    /* renamed from: a, reason: collision with root package name */
    public final int f4860a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4861b;

    public zzbw(int i5, String str) {
        this.f4860a = i5;
        this.f4861b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4860a);
        b.O(parcel, 2, this.f4861b, false);
        b.W(parcel, V);
    }
}
