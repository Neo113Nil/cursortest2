package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes2.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<FullWallet> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    public String f34511a;

    /* renamed from: b, reason: collision with root package name */
    public String f34512b;

    /* renamed from: c, reason: collision with root package name */
    public zzaj f34513c;

    /* renamed from: d, reason: collision with root package name */
    public String f34514d;

    /* renamed from: e, reason: collision with root package name */
    public zza f34515e;

    /* renamed from: f, reason: collision with root package name */
    public zza f34516f;

    /* renamed from: g, reason: collision with root package name */
    public UserAddress f34517g;

    /* renamed from: h, reason: collision with root package name */
    public UserAddress f34518h;

    /* renamed from: i, reason: collision with root package name */
    public PaymentMethodToken f34519i;
    String[] zzg;
    InstrumentInfo[] zzj;

    public FullWallet(String str, String str2, zzaj zzajVar, String str3, zza zzaVar, zza zzaVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.f34511a = str;
        this.f34512b = str2;
        this.f34513c = zzajVar;
        this.f34514d = str3;
        this.f34515e = zzaVar;
        this.f34516f = zzaVar2;
        this.zzg = strArr;
        this.f34517g = userAddress;
        this.f34518h = userAddress2;
        this.zzj = instrumentInfoArr;
        this.f34519i = paymentMethodToken;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, this.f34511a, false);
        E9.b.F(parcel, 3, this.f34512b, false);
        E9.b.D(parcel, 4, this.f34513c, i10, false);
        E9.b.F(parcel, 5, this.f34514d, false);
        E9.b.D(parcel, 6, this.f34515e, i10, false);
        E9.b.D(parcel, 7, this.f34516f, i10, false);
        E9.b.G(parcel, 8, this.zzg, false);
        E9.b.D(parcel, 9, this.f34517g, i10, false);
        E9.b.D(parcel, 10, this.f34518h, i10, false);
        E9.b.I(parcel, 11, this.zzj, i10, false);
        E9.b.D(parcel, 12, this.f34519i, i10, false);
        E9.b.b(parcel, a10);
    }
}
