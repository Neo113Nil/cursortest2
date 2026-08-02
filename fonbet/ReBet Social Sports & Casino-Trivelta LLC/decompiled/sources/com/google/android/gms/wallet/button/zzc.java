package com.google.android.gms.wallet.button;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fa.C4273a;

/* loaded from: classes2.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C4273a();

    /* renamed from: a, reason: collision with root package name */
    public String f34603a;

    /* renamed from: b, reason: collision with root package name */
    public int f34604b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34605c;

    /* renamed from: d, reason: collision with root package name */
    public String f34606d;

    /* renamed from: e, reason: collision with root package name */
    public String f34607e;

    /* renamed from: f, reason: collision with root package name */
    public String f34608f;

    /* renamed from: g, reason: collision with root package name */
    public String f34609g;

    /* renamed from: h, reason: collision with root package name */
    public String f34610h;

    /* renamed from: i, reason: collision with root package name */
    public String f34611i;

    public zzc(String str, int i10, boolean z10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f34603a = str;
        this.f34604b = i10;
        this.f34605c = z10;
        this.f34606d = str2;
        this.f34607e = str3;
        this.f34608f = str4;
        this.f34609g = str5;
        this.f34610h = str6;
        this.f34611i = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.f34603a, false);
        b.u(parcel, 2, this.f34604b);
        b.g(parcel, 3, this.f34605c);
        b.F(parcel, 4, this.f34606d, false);
        b.F(parcel, 5, this.f34607e, false);
        b.F(parcel, 6, this.f34608f, false);
        b.F(parcel, 7, this.f34609g, false);
        b.F(parcel, 8, this.f34610h, false);
        b.F(parcel, 9, this.f34611i, false);
        b.b(parcel, a10);
    }
}
