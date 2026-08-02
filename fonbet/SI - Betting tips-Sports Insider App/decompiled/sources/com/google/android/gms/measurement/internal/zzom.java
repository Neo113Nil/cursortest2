package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new b(12);

    /* renamed from: a, reason: collision with root package name */
    public final long f5804a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5805b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5806c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f5807d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5808e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5809f;

    /* renamed from: g, reason: collision with root package name */
    public String f5810g;

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i5, long j6, String str2) {
        this.f5804a = j;
        this.f5805b = bArr;
        this.f5806c = str;
        this.f5807d = bundle;
        this.f5808e = i5;
        this.f5809f = j6;
        this.f5810g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 8);
        parcel.writeLong(this.f5804a);
        h8.b.G(parcel, 2, this.f5805b, false);
        h8.b.O(parcel, 3, this.f5806c, false);
        h8.b.F(parcel, 4, this.f5807d);
        h8.b.U(parcel, 5, 4);
        parcel.writeInt(this.f5808e);
        h8.b.U(parcel, 6, 8);
        parcel.writeLong(this.f5809f);
        h8.b.O(parcel, 7, this.f5810g, false);
        h8.b.W(parcel, V);
    }
}
