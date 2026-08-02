package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new a(11);

    /* renamed from: a, reason: collision with root package name */
    public final List f5729a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5730b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5731c;

    public LocationSettingsRequest(ArrayList arrayList, boolean z5, boolean z7) {
        this.f5729a = arrayList;
        this.f5730b = z5;
        this.f5731c = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.R(parcel, 1, DesugarCollections.unmodifiableList(this.f5729a), false);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5730b ? 1 : 0);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f5731c ? 1 : 0);
        b.W(parcel, V);
    }
}
