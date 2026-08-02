package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC3184h;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new k0();
    static final Scope[] zza = new Scope[0];
    static final Feature[] zzb = new Feature[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f32639a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32640b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32641c;

    /* renamed from: d, reason: collision with root package name */
    public String f32642d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f32643e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f32644f;

    /* renamed from: g, reason: collision with root package name */
    public Account f32645g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f32646h;

    /* renamed from: i, reason: collision with root package name */
    public final int f32647i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32648j;

    /* renamed from: k, reason: collision with root package name */
    public final String f32649k;
    Scope[] zzh;
    Feature[] zzk;
    Feature[] zzl;

    public GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? zza : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? zzb : featureArr;
        featureArr2 = featureArr2 == null ? zzb : featureArr2;
        this.f32639a = i10;
        this.f32640b = i11;
        this.f32641c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f32642d = "com.google.android.gms";
        } else {
            this.f32642d = str;
        }
        if (i10 < 2) {
            this.f32645g = iBinder != null ? AbstractBinderC3177a.g(InterfaceC3184h.a.c(iBinder)) : null;
        } else {
            this.f32643e = iBinder;
            this.f32645g = account;
        }
        this.zzh = scopeArr;
        this.f32644f = bundle;
        this.zzk = featureArr;
        this.zzl = featureArr2;
        this.f32646h = z10;
        this.f32647i = i13;
        this.f32648j = z11;
        this.f32649k = str2;
    }

    public String g() {
        return this.f32649k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        k0.a(this, parcel, i10);
    }
}
