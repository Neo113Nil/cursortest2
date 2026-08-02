package com.google.android.gms.common;

import a3.a;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new a(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f4622a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4623b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4624c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f4625d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4626e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4627f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4628g;

    public zzp(String str, boolean z5, boolean z7, IBinder iBinder, boolean z10, boolean z11, boolean z12) {
        this.f4622a = str;
        this.f4623b = z5;
        this.f4624c = z7;
        this.f4625d = (Context) b.W(b.V(iBinder));
        this.f4626e = z10;
        this.f4627f = z11;
        this.f4628g = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f4622a, false);
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(this.f4623b ? 1 : 0);
        h8.b.U(parcel, 3, 4);
        parcel.writeInt(this.f4624c ? 1 : 0);
        h8.b.I(parcel, 4, new b(this.f4625d));
        h8.b.U(parcel, 5, 4);
        parcel.writeInt(this.f4626e ? 1 : 0);
        h8.b.U(parcel, 6, 4);
        parcel.writeInt(this.f4627f ? 1 : 0);
        h8.b.U(parcel, 8, 4);
        parcel.writeInt(this.f4628g ? 1 : 0);
        h8.b.W(parcel, V);
    }
}
