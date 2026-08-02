package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import z9.f;

/* loaded from: classes2.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public final String f32082a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32083b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32084c;

    /* renamed from: d, reason: collision with root package name */
    public final List f32085d;

    /* renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f32086e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f32087f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f32088g;

    public AuthorizationResult(String str, String str2, String str3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent, Bundle bundle) {
        this.f32082a = str;
        this.f32083b = str2;
        this.f32084c = str3;
        this.f32085d = (List) AbstractC3191o.m(list);
        this.f32086e = googleSignInAccount;
        this.f32087f = pendingIntent;
        this.f32088g = bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return AbstractC3189m.b(this.f32082a, authorizationResult.f32082a) && AbstractC3189m.b(this.f32083b, authorizationResult.f32083b) && AbstractC3189m.b(this.f32084c, authorizationResult.f32084c) && AbstractC3189m.b(this.f32085d, authorizationResult.f32085d) && AbstractC3189m.b(this.f32087f, authorizationResult.f32087f) && AbstractC3189m.b(this.f32086e, authorizationResult.f32086e) && AbstractC3189m.b(this.f32088g, authorizationResult.f32088g);
    }

    public String g() {
        return this.f32083b;
    }

    public String getServerAuthCode() {
        return this.f32082a;
    }

    public List h() {
        return this.f32085d;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32082a, this.f32083b, this.f32084c, this.f32085d, this.f32087f, this.f32086e, this.f32088g);
    }

    public PendingIntent i() {
        return this.f32087f;
    }

    public Bundle j() {
        return this.f32088g;
    }

    public GoogleSignInAccount k() {
        return this.f32086e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, getServerAuthCode(), false);
        E9.b.F(parcel, 2, g(), false);
        E9.b.F(parcel, 3, this.f32084c, false);
        E9.b.H(parcel, 4, h(), false);
        E9.b.D(parcel, 5, k(), i10, false);
        E9.b.D(parcel, 6, i(), i10, false);
        E9.b.j(parcel, 7, j(), false);
        E9.b.b(parcel, a10);
    }
}
