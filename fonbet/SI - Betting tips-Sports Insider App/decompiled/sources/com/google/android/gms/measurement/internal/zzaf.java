package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new b(6);

    /* renamed from: a, reason: collision with root package name */
    public final long f5782a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5783b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5784c;

    public zzaf(long j, long j6, int i5) {
        this.f5782a = j;
        this.f5783b = i5;
        this.f5784c = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 8);
        parcel.writeLong(this.f5782a);
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(this.f5783b);
        h8.b.U(parcel, 3, 8);
        parcel.writeLong(this.f5784c);
        h8.b.W(parcel, V);
    }
}
