package com.google.firebase.auth.internal;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zze;
import java.util.List;
import lb.y0;

/* loaded from: classes3.dex */
public final class zzz implements AuthResult {
    public static final Parcelable.Creator<zzz> CREATOR = new y0();

    /* renamed from: a, reason: collision with root package name */
    public zzaf f37705a;

    /* renamed from: b, reason: collision with root package name */
    public zzx f37706b;

    /* renamed from: c, reason: collision with root package name */
    public zze f37707c;

    public zzz(zzaf zzafVar) {
        zzaf zzafVar2 = (zzaf) AbstractC3191o.m(zzafVar);
        this.f37705a = zzafVar2;
        List C02 = zzafVar2.C0();
        this.f37706b = null;
        for (int i10 = 0; i10 < C02.size(); i10++) {
            if (!TextUtils.isEmpty(((zzab) C02.get(i10)).zza())) {
                this.f37706b = new zzx(((zzab) C02.get(i10)).n(), ((zzab) C02.get(i10)).zza(), zzafVar.D0());
            }
        }
        if (this.f37706b == null) {
            this.f37706b = new zzx(zzafVar.D0());
        }
        this.f37707c = zzafVar.A0();
    }

    @Override // com.google.firebase.auth.AuthResult
    public final AdditionalUserInfo Q() {
        return this.f37706b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final FirebaseUser getUser() {
        return this.f37705a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.D(parcel, 1, getUser(), i10, false);
        b.D(parcel, 2, Q(), i10, false);
        b.D(parcel, 3, this.f37707c, i10, false);
        b.b(parcel, a10);
    }

    public zzz(zzaf zzafVar, zzx zzxVar, zze zzeVar) {
        this.f37705a = zzafVar;
        this.f37706b = zzxVar;
        this.f37707c = zzeVar;
    }
}
