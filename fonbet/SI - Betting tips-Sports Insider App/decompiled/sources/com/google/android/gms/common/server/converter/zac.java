package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4579a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4580b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4581c;

    public zac(int i5, String str, int i10) {
        this.f4579a = i5;
        this.f4580b = str;
        this.f4581c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4579a);
        b.O(parcel, 2, this.f4580b, false);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4581c);
        b.W(parcel, V);
    }

    public zac(String str, int i5) {
        this.f4579a = 1;
        this.f4580b = str;
        this.f4581c = i5;
    }
}
