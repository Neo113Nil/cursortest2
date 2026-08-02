package com.google.android.gms.common;

import N9.b;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    public final String f32823a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32824b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32825c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f32826d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f32827e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f32828f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f32829g;

    public zzp(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f32823a = str;
        this.f32824b = z10;
        this.f32825c = z11;
        this.f32826d = (Context) N9.d.g(b.a.c(iBinder));
        this.f32827e = z12;
        this.f32828f = z13;
        this.f32829g = z14;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [N9.b, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f32823a;
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, str, false);
        E9.b.g(parcel, 2, this.f32824b);
        E9.b.g(parcel, 3, this.f32825c);
        E9.b.t(parcel, 4, N9.d.i(this.f32826d), false);
        E9.b.g(parcel, 5, this.f32827e);
        E9.b.g(parcel, 6, this.f32828f);
        E9.b.g(parcel, 8, this.f32829g);
        E9.b.b(parcel, a10);
    }
}
