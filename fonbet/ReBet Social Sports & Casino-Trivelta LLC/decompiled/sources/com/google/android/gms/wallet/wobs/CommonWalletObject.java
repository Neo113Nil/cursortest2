package com.google.android.gms.wallet.wobs;

import K9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ha.c;
import ha.d;
import java.util.ArrayList;

@KeepName
/* loaded from: classes2.dex */
public class CommonWalletObject extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public String f34627a;

    /* renamed from: b, reason: collision with root package name */
    public String f34628b;

    /* renamed from: c, reason: collision with root package name */
    public String f34629c;

    /* renamed from: d, reason: collision with root package name */
    public String f34630d;

    /* renamed from: e, reason: collision with root package name */
    public String f34631e;

    /* renamed from: f, reason: collision with root package name */
    public String f34632f;

    /* renamed from: g, reason: collision with root package name */
    public String f34633g;

    /* renamed from: h, reason: collision with root package name */
    public String f34634h;

    /* renamed from: i, reason: collision with root package name */
    public int f34635i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f34636j;

    /* renamed from: k, reason: collision with root package name */
    public TimeInterval f34637k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f34638l;

    /* renamed from: m, reason: collision with root package name */
    public String f34639m;

    /* renamed from: n, reason: collision with root package name */
    public String f34640n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f34641o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f34642p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f34643q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f34644r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f34645s;

    public CommonWalletObject() {
        this.f34636j = b.c();
        this.f34638l = b.c();
        this.f34641o = b.c();
        this.f34643q = b.c();
        this.f34644r = b.c();
        this.f34645s = b.c();
    }

    public static c g() {
        return new c(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, this.f34627a, false);
        E9.b.F(parcel, 3, this.f34628b, false);
        E9.b.F(parcel, 4, this.f34629c, false);
        E9.b.F(parcel, 5, this.f34630d, false);
        E9.b.F(parcel, 6, this.f34631e, false);
        E9.b.F(parcel, 7, this.f34632f, false);
        E9.b.F(parcel, 8, this.f34633g, false);
        E9.b.F(parcel, 9, this.f34634h, false);
        E9.b.u(parcel, 10, this.f34635i);
        E9.b.J(parcel, 11, this.f34636j, false);
        E9.b.D(parcel, 12, this.f34637k, i10, false);
        E9.b.J(parcel, 13, this.f34638l, false);
        E9.b.F(parcel, 14, this.f34639m, false);
        E9.b.F(parcel, 15, this.f34640n, false);
        E9.b.J(parcel, 16, this.f34641o, false);
        E9.b.g(parcel, 17, this.f34642p);
        E9.b.J(parcel, 18, this.f34643q, false);
        E9.b.J(parcel, 19, this.f34644r, false);
        E9.b.J(parcel, 20, this.f34645s, false);
        E9.b.b(parcel, a10);
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z10, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f34627a = str;
        this.f34628b = str2;
        this.f34629c = str3;
        this.f34630d = str4;
        this.f34631e = str5;
        this.f34632f = str6;
        this.f34633g = str7;
        this.f34634h = str8;
        this.f34635i = i10;
        this.f34636j = arrayList;
        this.f34637k = timeInterval;
        this.f34638l = arrayList2;
        this.f34639m = str9;
        this.f34640n = str10;
        this.f34641o = arrayList3;
        this.f34642p = z10;
        this.f34643q = arrayList4;
        this.f34644r = arrayList5;
        this.f34645s = arrayList6;
    }
}
