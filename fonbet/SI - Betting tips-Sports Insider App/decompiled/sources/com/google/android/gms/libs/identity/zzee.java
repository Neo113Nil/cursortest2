package com.google.android.gms.libs.identity;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new j(19);

    /* renamed from: a, reason: collision with root package name */
    public final int f4868a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f4869b;

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f4870c;

    /* renamed from: d, reason: collision with root package name */
    public final PendingIntent f4871d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4872e;

    public zzee(int i5, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f4868a = i5;
        this.f4869b = iBinder;
        this.f4870c = iBinder2;
        this.f4871d = pendingIntent;
        this.f4872e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4868a);
        b.I(parcel, 2, this.f4869b);
        b.I(parcel, 3, this.f4870c);
        b.N(parcel, 4, this.f4871d, i5, false);
        b.O(parcel, 6, this.f4872e, false);
        b.W(parcel, V);
    }
}
