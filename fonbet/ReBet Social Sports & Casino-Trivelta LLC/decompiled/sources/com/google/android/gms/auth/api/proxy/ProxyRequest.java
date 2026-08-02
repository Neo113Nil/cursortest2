package com.google.android.gms.auth.api.proxy;

import B9.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class ProxyRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    public static final int f32190f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f32191g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f32192h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f32193i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f32194j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f32195k = 5;

    /* renamed from: l, reason: collision with root package name */
    public static final int f32196l = 6;

    /* renamed from: m, reason: collision with root package name */
    public static final int f32197m = 7;

    /* renamed from: n, reason: collision with root package name */
    public static final int f32198n = 7;

    /* renamed from: a, reason: collision with root package name */
    public final String f32199a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32200b;

    @NonNull
    public final byte[] body;

    /* renamed from: c, reason: collision with root package name */
    public final long f32201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32202d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f32203e;

    public ProxyRequest(int i10, String str, int i11, long j10, byte[] bArr, Bundle bundle) {
        this.f32202d = i10;
        this.f32199a = str;
        this.f32200b = i11;
        this.f32201c = j10;
        this.body = bArr;
        this.f32203e = bundle;
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.f32199a + ", method: " + this.f32200b + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f32199a, false);
        E9.b.u(parcel, 2, this.f32200b);
        E9.b.y(parcel, 3, this.f32201c);
        E9.b.l(parcel, 4, this.body, false);
        E9.b.j(parcel, 5, this.f32203e, false);
        E9.b.u(parcel, 1000, this.f32202d);
        E9.b.b(parcel, a10);
    }
}
