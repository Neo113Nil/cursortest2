package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new v0(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f5383a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5384b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5385c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f5386d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5387e;

    public zzdd(long j, long j6, boolean z5, Bundle bundle, String str) {
        this.f5383a = j;
        this.f5384b = j6;
        this.f5385c = z5;
        this.f5386d = bundle;
        this.f5387e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 8);
        parcel.writeLong(this.f5383a);
        h8.b.U(parcel, 2, 8);
        parcel.writeLong(this.f5384b);
        h8.b.U(parcel, 3, 4);
        parcel.writeInt(this.f5385c ? 1 : 0);
        h8.b.F(parcel, 7, this.f5386d);
        h8.b.O(parcel, 8, this.f5387e, false);
        h8.b.W(parcel, V);
    }
}
