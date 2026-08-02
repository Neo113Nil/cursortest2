package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new J();

    /* renamed from: a, reason: collision with root package name */
    public final int f32656a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32658c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32659d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32660e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32661f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32662g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32663h;

    /* renamed from: i, reason: collision with root package name */
    public final int f32664i;

    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f32656a = i10;
        this.f32657b = i11;
        this.f32658c = i12;
        this.f32659d = j10;
        this.f32660e = j11;
        this.f32661f = str;
        this.f32662g = str2;
        this.f32663h = i13;
        this.f32664i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32656a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.u(parcel, 2, this.f32657b);
        E9.b.u(parcel, 3, this.f32658c);
        E9.b.y(parcel, 4, this.f32659d);
        E9.b.y(parcel, 5, this.f32660e);
        E9.b.F(parcel, 6, this.f32661f, false);
        E9.b.F(parcel, 7, this.f32662g, false);
        E9.b.u(parcel, 8, this.f32663h);
        E9.b.u(parcel, 9, this.f32664i);
        E9.b.b(parcel, a10);
    }
}
