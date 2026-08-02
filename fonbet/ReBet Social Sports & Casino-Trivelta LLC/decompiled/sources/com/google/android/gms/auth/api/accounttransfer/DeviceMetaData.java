package com.google.android.gms.auth.api.accounttransfer;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import y9.C6865f;

/* loaded from: classes2.dex */
public class DeviceMetaData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new C6865f();

    /* renamed from: a, reason: collision with root package name */
    public final int f32022a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32023b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32024c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32025d;

    public DeviceMetaData(int i10, boolean z10, long j10, boolean z11) {
        this.f32022a = i10;
        this.f32023b = z10;
        this.f32024c = j10;
        this.f32025d = z11;
    }

    public long g() {
        return this.f32024c;
    }

    public boolean h() {
        return this.f32025d;
    }

    public boolean i() {
        return this.f32023b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f32022a);
        b.g(parcel, 2, i());
        b.y(parcel, 3, g());
        b.g(parcel, 4, h());
        b.b(parcel, a10);
    }
}
