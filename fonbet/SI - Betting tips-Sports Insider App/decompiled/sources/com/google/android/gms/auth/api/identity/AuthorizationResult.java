package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new q5.b(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f4306a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4307b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4308c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4309d;

    /* renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f4310e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f4311f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f4312g;

    public AuthorizationResult(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent, Bundle bundle) {
        this.f4306a = str;
        this.f4307b = str2;
        this.f4308c = str3;
        v.h(arrayList);
        this.f4309d = arrayList;
        this.f4310e = googleSignInAccount;
        this.f4311f = pendingIntent;
        this.f4312g = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return v.k(this.f4306a, authorizationResult.f4306a) && v.k(this.f4307b, authorizationResult.f4307b) && v.k(this.f4308c, authorizationResult.f4308c) && v.k(this.f4309d, authorizationResult.f4309d) && v.k(this.f4311f, authorizationResult.f4311f) && v.k(this.f4310e, authorizationResult.f4310e) && v.k(this.f4312g, authorizationResult.f4312g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4306a, this.f4307b, this.f4308c, this.f4309d, this.f4311f, this.f4310e, this.f4312g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f4306a, false);
        h8.b.O(parcel, 2, this.f4307b, false);
        h8.b.O(parcel, 3, this.f4308c, false);
        h8.b.P(parcel, 4, this.f4309d);
        h8.b.N(parcel, 5, this.f4310e, i5, false);
        h8.b.N(parcel, 6, this.f4311f, i5, false);
        h8.b.F(parcel, 7, this.f4312g);
        h8.b.W(parcel, V);
    }
}
