package com.google.android.gms.auth.api.proxy;

import B9.c;
import E9.b;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class ProxyResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f32204a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f32205b;

    @NonNull
    public final byte[] body;

    /* renamed from: c, reason: collision with root package name */
    public final int f32206c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32207d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f32208e;

    public ProxyResponse(int i10, int i11, PendingIntent pendingIntent, int i12, Bundle bundle, byte[] bArr) {
        this.f32207d = i10;
        this.f32204a = i11;
        this.f32206c = i12;
        this.f32208e = bundle;
        this.body = bArr;
        this.f32205b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f32204a);
        b.D(parcel, 2, this.f32205b, i10, false);
        b.u(parcel, 3, this.f32206c);
        b.j(parcel, 4, this.f32208e, false);
        b.l(parcel, 5, this.body, false);
        b.u(parcel, 1000, this.f32207d);
        b.b(parcel, a10);
    }
}
