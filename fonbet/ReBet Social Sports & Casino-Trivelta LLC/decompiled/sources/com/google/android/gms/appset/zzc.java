package com.google.android.gms.appset;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import u9.e;

/* loaded from: classes2.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final String f31998a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31999b;

    public zzc(String str, int i10) {
        this.f31998a = str;
        this.f31999b = i10;
    }

    public final int g() {
        return this.f31999b;
    }

    public final String h() {
        return this.f31998a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.f31998a, false);
        b.u(parcel, 2, this.f31999b);
        b.b(parcel, a10);
    }
}
