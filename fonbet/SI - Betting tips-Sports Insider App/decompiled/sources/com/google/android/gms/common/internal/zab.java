package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new j(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f4543a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4544b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4545c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4546d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4547e;

    public zab(int i5, int i10, long j, String str, boolean z5) {
        this.f4543a = i5;
        this.f4544b = str;
        this.f4545c = j;
        this.f4546d = i10;
        this.f4547e = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4543a);
        b.O(parcel, 2, this.f4544b, false);
        b.U(parcel, 3, 8);
        parcel.writeLong(this.f4545c);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f4546d);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f4547e ? 1 : 0);
        b.W(parcel, V);
    }
}
