package com.google.android.gms.common;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import k2.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new a(16);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4629a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4631c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4632d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4633e;

    public zzr(int i5, int i10, long j, String str, boolean z5) {
        this.f4629a = z5;
        this.f4630b = str;
        this.f4631c = x.F(i5) - 1;
        this.f4632d = io.sentry.config.a.E(i10) - 1;
        this.f4633e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4629a ? 1 : 0);
        b.O(parcel, 2, this.f4630b, false);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4631c);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f4632d);
        b.U(parcel, 5, 8);
        parcel.writeLong(this.f4633e);
        b.W(parcel, V);
    }
}
