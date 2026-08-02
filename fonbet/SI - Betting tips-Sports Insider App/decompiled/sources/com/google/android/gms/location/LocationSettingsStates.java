package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new a(13);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5734a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5735b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5736c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5737d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5738e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5739f;

    public LocationSettingsStates(boolean z5, boolean z7, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f5734a = z5;
        this.f5735b = z7;
        this.f5736c = z10;
        this.f5737d = z11;
        this.f5738e = z12;
        this.f5739f = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f5734a ? 1 : 0);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5735b ? 1 : 0);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f5736c ? 1 : 0);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f5737d ? 1 : 0);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f5738e ? 1 : 0);
        b.U(parcel, 6, 4);
        parcel.writeInt(this.f5739f ? 1 : 0);
        b.W(parcel, V);
    }
}
