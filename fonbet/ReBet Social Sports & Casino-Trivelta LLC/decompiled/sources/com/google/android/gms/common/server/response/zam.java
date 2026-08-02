package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes2.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f32816a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32817b;

    /* renamed from: c, reason: collision with root package name */
    public final FastJsonResponse.Field f32818c;

    public zam(int i10, String str, FastJsonResponse.Field field) {
        this.f32816a = i10;
        this.f32817b = str;
        this.f32818c = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32816a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.F(parcel, 2, this.f32817b, false);
        E9.b.D(parcel, 3, this.f32818c, i10, false);
        E9.b.b(parcel, a10);
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.f32816a = 1;
        this.f32817b = str;
        this.f32818c = field;
    }
}
