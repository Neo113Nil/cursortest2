package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f4243a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4244b;

    public zzc(String str, int i5) {
        this.f4243a = str;
        this.f4244b = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f4243a, false);
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(this.f4244b);
        h8.b.W(parcel, V);
    }
}
