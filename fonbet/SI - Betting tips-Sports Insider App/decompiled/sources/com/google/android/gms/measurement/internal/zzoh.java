package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new b(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f5801a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5802b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5803c;

    public zzoh(String str, long j, int i5) {
        this.f5801a = str;
        this.f5802b = j;
        this.f5803c = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f5801a, false);
        h8.b.U(parcel, 2, 8);
        parcel.writeLong(this.f5802b);
        h8.b.U(parcel, 3, 4);
        parcel.writeInt(this.f5803c);
        h8.b.W(parcel, V);
    }
}
