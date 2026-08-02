package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final int f32665a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32666b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32667c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32668d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32669e;

    public RootTelemetryConfiguration(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f32665a = i10;
        this.f32666b = z10;
        this.f32667c = z11;
        this.f32668d = i11;
        this.f32669e = i12;
    }

    public int g() {
        return this.f32668d;
    }

    public int h() {
        return this.f32669e;
    }

    public boolean i() {
        return this.f32666b;
    }

    public boolean j() {
        return this.f32667c;
    }

    public int k() {
        return this.f32665a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, k());
        E9.b.g(parcel, 2, i());
        E9.b.g(parcel, 3, j());
        E9.b.u(parcel, 4, g());
        E9.b.u(parcel, 5, h());
        E9.b.b(parcel, a10);
    }
}
