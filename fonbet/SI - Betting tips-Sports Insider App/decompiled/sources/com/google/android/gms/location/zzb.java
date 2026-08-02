package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new a(19);

    /* renamed from: a, reason: collision with root package name */
    public final long f5766a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5767b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkSource f5768c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5769d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f5770e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5771f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5772g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5773h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5774i;

    public zzb(long j, boolean z5, WorkSource workSource, String str, int[] iArr, boolean z7, String str2, long j6, String str3) {
        this.f5766a = j;
        this.f5767b = z5;
        this.f5768c = workSource;
        this.f5769d = str;
        this.f5770e = iArr;
        this.f5771f = z7;
        this.f5772g = str2;
        this.f5773h = j6;
        this.f5774i = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        v.h(parcel);
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 8);
        parcel.writeLong(this.f5766a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5767b ? 1 : 0);
        b.N(parcel, 3, this.f5768c, i5, false);
        b.O(parcel, 4, this.f5769d, false);
        b.J(parcel, 5, this.f5770e);
        b.U(parcel, 6, 4);
        parcel.writeInt(this.f5771f ? 1 : 0);
        b.O(parcel, 7, this.f5772g, false);
        b.U(parcel, 8, 8);
        parcel.writeLong(this.f5773h);
        b.O(parcel, 9, this.f5774i, false);
        b.W(parcel, V);
    }
}
