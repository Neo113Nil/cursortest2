package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new j(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f4577a;

    /* renamed from: b, reason: collision with root package name */
    public final StringToIntConverter f4578b;

    public zaa(int i5, StringToIntConverter stringToIntConverter) {
        this.f4577a = i5;
        this.f4578b = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4577a);
        b.N(parcel, 2, this.f4578b, i5, false);
        b.W(parcel, V);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f4577a = 1;
        this.f4578b = stringToIntConverter;
    }
}
