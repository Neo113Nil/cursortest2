package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.a;
import g6.g;
import g6.i0;
import g6.j;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new j(12);

    /* renamed from: o, reason: collision with root package name */
    public static final Scope[] f4503o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Feature[] f4504p = new Feature[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f4505a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4506b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4507c;

    /* renamed from: d, reason: collision with root package name */
    public String f4508d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f4509e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f4510f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f4511g;

    /* renamed from: h, reason: collision with root package name */
    public Account f4512h;

    /* renamed from: i, reason: collision with root package name */
    public Feature[] f4513i;
    public Feature[] j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4514k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4515l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4516m;

    /* renamed from: n, reason: collision with root package name */
    public final String f4517n;

    public GetServiceRequest(int i5, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z5, int i12, boolean z7, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f4503o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = f4504p;
        Feature[] featureArr4 = featureArr == null ? featureArr3 : featureArr;
        featureArr3 = featureArr2 != null ? featureArr2 : featureArr3;
        this.f4505a = i5;
        this.f4506b = i10;
        this.f4507c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f4508d = "com.google.android.gms";
        } else {
            this.f4508d = str;
        }
        if (i5 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f9794f;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface i0Var = queryLocalInterface instanceof g ? (g) queryLocalInterface : new i0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 4);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        i0 i0Var2 = (i0) i0Var;
                        Parcel f6 = i0Var2.f(i0Var2.O(), 2);
                        Account account3 = (Account) j7.g.a(f6, Account.CREATOR);
                        f6.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        w0.m("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th2;
                }
            }
            this.f4512h = account2;
        } else {
            this.f4509e = iBinder;
            this.f4512h = account;
        }
        this.f4510f = scopeArr2;
        this.f4511g = bundle2;
        this.f4513i = featureArr4;
        this.j = featureArr3;
        this.f4514k = z5;
        this.f4515l = i12;
        this.f4516m = z7;
        this.f4517n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        j.a(this, parcel, i5);
    }
}
