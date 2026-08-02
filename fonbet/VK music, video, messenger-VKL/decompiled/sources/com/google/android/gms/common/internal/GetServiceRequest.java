package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.dl01;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new dl01();
    public static final Scope[] p = new Scope[0];
    public static final Feature[] q = new Feature[0];
    public final int b;
    public final int c;
    public final int d;
    public String e;

    @Nullable
    public IBinder f;
    public Scope[] g;
    public Bundle h;

    @Nullable
    public Account i;
    public Feature[] j;
    public Feature[] k;
    public final boolean l;
    public final int m;
    public boolean n;

    @Nullable
    public final String o;

    public GetServiceRequest(int i, int i2, int i3, String str, @Nullable IBinder iBinder, Scope[] scopeArr, Bundle bundle, @Nullable Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, @Nullable String str2) {
        scopeArr = scopeArr == null ? p : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = q;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.b = i;
        this.c = i2;
        this.d = i3;
        if ("com.google.android.gms".equals(str)) {
            this.e = "com.google.android.gms";
        } else {
            this.e = str;
        }
        if (i < 2) {
            this.i = iBinder != null ? a.g(b.a.f(iBinder)) : null;
        } else {
            this.f = iBinder;
            this.i = account;
        }
        this.g = scopeArr;
        this.h = bundle;
        this.j = featureArr;
        this.k = featureArr2;
        this.l = z;
        this.m = i4;
        this.n = z2;
        this.o = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        dl01.a(this, parcel, i);
    }
}
