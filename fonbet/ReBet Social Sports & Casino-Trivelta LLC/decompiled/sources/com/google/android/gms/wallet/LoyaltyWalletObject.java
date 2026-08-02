package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new D();

    /* renamed from: a, reason: collision with root package name */
    public String f34538a;

    /* renamed from: b, reason: collision with root package name */
    public String f34539b;

    /* renamed from: c, reason: collision with root package name */
    public String f34540c;

    /* renamed from: d, reason: collision with root package name */
    public String f34541d;

    /* renamed from: e, reason: collision with root package name */
    public String f34542e;

    /* renamed from: f, reason: collision with root package name */
    public String f34543f;

    /* renamed from: g, reason: collision with root package name */
    public String f34544g;

    /* renamed from: h, reason: collision with root package name */
    public String f34545h;

    /* renamed from: i, reason: collision with root package name */
    public String f34546i;

    /* renamed from: j, reason: collision with root package name */
    public String f34547j;

    /* renamed from: k, reason: collision with root package name */
    public int f34548k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f34549l;

    /* renamed from: m, reason: collision with root package name */
    public TimeInterval f34550m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f34551n;

    /* renamed from: o, reason: collision with root package name */
    public String f34552o;

    /* renamed from: p, reason: collision with root package name */
    public String f34553p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f34554q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34555r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f34556s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f34557t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f34558u;

    /* renamed from: v, reason: collision with root package name */
    public LoyaltyPoints f34559v;

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z10, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.f34538a = str;
        this.f34539b = str2;
        this.f34540c = str3;
        this.f34541d = str4;
        this.f34542e = str5;
        this.f34543f = str6;
        this.f34544g = str7;
        this.f34545h = str8;
        this.f34546i = str9;
        this.f34547j = str10;
        this.f34548k = i10;
        this.f34549l = arrayList;
        this.f34550m = timeInterval;
        this.f34551n = arrayList2;
        this.f34552o = str11;
        this.f34553p = str12;
        this.f34554q = arrayList3;
        this.f34555r = z10;
        this.f34556s = arrayList4;
        this.f34557t = arrayList5;
        this.f34558u = arrayList6;
        this.f34559v = loyaltyPoints;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, this.f34538a, false);
        E9.b.F(parcel, 3, this.f34539b, false);
        E9.b.F(parcel, 4, this.f34540c, false);
        E9.b.F(parcel, 5, this.f34541d, false);
        E9.b.F(parcel, 6, this.f34542e, false);
        E9.b.F(parcel, 7, this.f34543f, false);
        E9.b.F(parcel, 8, this.f34544g, false);
        E9.b.F(parcel, 9, this.f34545h, false);
        E9.b.F(parcel, 10, this.f34546i, false);
        E9.b.F(parcel, 11, this.f34547j, false);
        E9.b.u(parcel, 12, this.f34548k);
        E9.b.J(parcel, 13, this.f34549l, false);
        E9.b.D(parcel, 14, this.f34550m, i10, false);
        E9.b.J(parcel, 15, this.f34551n, false);
        E9.b.F(parcel, 16, this.f34552o, false);
        E9.b.F(parcel, 17, this.f34553p, false);
        E9.b.J(parcel, 18, this.f34554q, false);
        E9.b.g(parcel, 19, this.f34555r);
        E9.b.J(parcel, 20, this.f34556s, false);
        E9.b.J(parcel, 21, this.f34557t, false);
        E9.b.J(parcel, 22, this.f34558u, false);
        E9.b.D(parcel, 23, this.f34559v, i10, false);
        E9.b.b(parcel, a10);
    }
}
