package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new j(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f4518a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4519b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4520c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4521d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4522e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4523f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4524g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4525h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4526i;

    public MethodInvocation(int i5, int i10, int i11, long j, long j6, String str, String str2, int i12, int i13) {
        this.f4518a = i5;
        this.f4519b = i10;
        this.f4520c = i11;
        this.f4521d = j;
        this.f4522e = j6;
        this.f4523f = str;
        this.f4524g = str2;
        this.f4525h = i12;
        this.f4526i = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4518a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4519b);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4520c);
        b.U(parcel, 4, 8);
        parcel.writeLong(this.f4521d);
        b.U(parcel, 5, 8);
        parcel.writeLong(this.f4522e);
        b.O(parcel, 6, this.f4523f, false);
        b.O(parcel, 7, this.f4524g, false);
        b.U(parcel, 8, 4);
        parcel.writeInt(this.f4525h);
        b.U(parcel, 9, 4);
        parcel.writeInt(this.f4526i);
        b.W(parcel, V);
    }
}
