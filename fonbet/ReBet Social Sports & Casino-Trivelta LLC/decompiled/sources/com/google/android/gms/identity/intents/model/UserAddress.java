package com.google.android.gms.identity.intents.model;

import U9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public String f33026a;

    /* renamed from: b, reason: collision with root package name */
    public String f33027b;

    /* renamed from: c, reason: collision with root package name */
    public String f33028c;

    /* renamed from: d, reason: collision with root package name */
    public String f33029d;

    /* renamed from: e, reason: collision with root package name */
    public String f33030e;

    /* renamed from: f, reason: collision with root package name */
    public String f33031f;

    /* renamed from: g, reason: collision with root package name */
    public String f33032g;

    /* renamed from: h, reason: collision with root package name */
    public String f33033h;

    /* renamed from: i, reason: collision with root package name */
    public String f33034i;

    /* renamed from: j, reason: collision with root package name */
    public String f33035j;

    /* renamed from: k, reason: collision with root package name */
    public String f33036k;

    /* renamed from: l, reason: collision with root package name */
    public String f33037l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33038m;

    /* renamed from: n, reason: collision with root package name */
    public String f33039n;

    /* renamed from: o, reason: collision with root package name */
    public String f33040o;

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z10, String str13, String str14) {
        this.f33026a = str;
        this.f33027b = str2;
        this.f33028c = str3;
        this.f33029d = str4;
        this.f33030e = str5;
        this.f33031f = str6;
        this.f33032g = str7;
        this.f33033h = str8;
        this.f33034i = str9;
        this.f33035j = str10;
        this.f33036k = str11;
        this.f33037l = str12;
        this.f33038m = z10;
        this.f33039n = str13;
        this.f33040o = str14;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, this.f33026a, false);
        E9.b.F(parcel, 3, this.f33027b, false);
        E9.b.F(parcel, 4, this.f33028c, false);
        E9.b.F(parcel, 5, this.f33029d, false);
        E9.b.F(parcel, 6, this.f33030e, false);
        E9.b.F(parcel, 7, this.f33031f, false);
        E9.b.F(parcel, 8, this.f33032g, false);
        E9.b.F(parcel, 9, this.f33033h, false);
        E9.b.F(parcel, 10, this.f33034i, false);
        E9.b.F(parcel, 11, this.f33035j, false);
        E9.b.F(parcel, 12, this.f33036k, false);
        E9.b.F(parcel, 13, this.f33037l, false);
        E9.b.g(parcel, 14, this.f33038m);
        E9.b.F(parcel, 15, this.f33039n, false);
        E9.b.F(parcel, 16, this.f33040o, false);
        E9.b.b(parcel, a10);
    }
}
