package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new t();

    /* renamed from: a, reason: collision with root package name */
    public String f34679a;

    /* renamed from: b, reason: collision with root package name */
    public String f34680b;

    /* renamed from: c, reason: collision with root package name */
    public String f34681c;

    /* renamed from: d, reason: collision with root package name */
    public String f34682d;

    /* renamed from: e, reason: collision with root package name */
    public String f34683e;

    /* renamed from: f, reason: collision with root package name */
    public String f34684f;

    /* renamed from: g, reason: collision with root package name */
    public String f34685g;

    /* renamed from: h, reason: collision with root package name */
    public String f34686h;

    /* renamed from: i, reason: collision with root package name */
    public String f34687i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f34688j;

    /* renamed from: k, reason: collision with root package name */
    public String f34689k;

    public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10) {
        this.f34679a = str;
        this.f34680b = str2;
        this.f34681c = str3;
        this.f34682d = str4;
        this.f34683e = str5;
        this.f34684f = str6;
        this.f34685g = str7;
        this.f34686h = str8;
        this.f34687i = str9;
        this.f34688j = z10;
        this.f34689k = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, this.f34679a, false);
        E9.b.F(parcel, 3, this.f34680b, false);
        E9.b.F(parcel, 4, this.f34681c, false);
        E9.b.F(parcel, 5, this.f34682d, false);
        E9.b.F(parcel, 6, this.f34683e, false);
        E9.b.F(parcel, 7, this.f34684f, false);
        E9.b.F(parcel, 8, this.f34685g, false);
        E9.b.F(parcel, 9, this.f34686h, false);
        E9.b.F(parcel, 10, this.f34687i, false);
        E9.b.g(parcel, 11, this.f34688j);
        E9.b.F(parcel, 12, this.f34689k, false);
        E9.b.b(parcel, a10);
    }
}
