package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new q5.b(22);

    /* renamed from: a, reason: collision with root package name */
    public final List f4296a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4297b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4298c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4299d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f4300e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4301f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4302g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4303h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f4304i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4305k;

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z5, boolean z7, Account account, String str2, String str3, boolean z10, Bundle bundle, boolean z11, int i5) {
        boolean z12 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z12 = true;
        }
        v.a("requestedScopes cannot be null or empty", z12);
        this.f4296a = arrayList;
        this.f4297b = str;
        this.f4298c = z5;
        this.f4299d = z7;
        this.f4300e = account;
        this.f4301f = str2;
        this.f4302g = str3;
        this.f4303h = z10;
        this.f4304i = bundle;
        this.j = z11;
        this.f4305k = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.f4296a;
        int size = list.size();
        List list2 = authorizationRequest.f4296a;
        if (size == list2.size() && list.containsAll(list2)) {
            Bundle bundle = authorizationRequest.f4304i;
            Bundle bundle2 = this.f4304i;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!v.k(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f4298c == authorizationRequest.f4298c && this.f4303h == authorizationRequest.f4303h && this.f4299d == authorizationRequest.f4299d && this.j == authorizationRequest.j && this.f4305k == authorizationRequest.f4305k && v.k(this.f4297b, authorizationRequest.f4297b) && v.k(this.f4300e, authorizationRequest.f4300e) && v.k(this.f4301f, authorizationRequest.f4301f) && v.k(this.f4302g, authorizationRequest.f4302g)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4296a, this.f4297b, Boolean.valueOf(this.f4298c), Boolean.valueOf(this.f4303h), Boolean.valueOf(this.f4299d), this.f4300e, this.f4301f, this.f4302g, this.f4304i, Boolean.valueOf(this.j), Integer.valueOf(this.f4305k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.R(parcel, 1, this.f4296a, false);
        h8.b.O(parcel, 2, this.f4297b, false);
        h8.b.U(parcel, 3, 4);
        parcel.writeInt(this.f4298c ? 1 : 0);
        h8.b.U(parcel, 4, 4);
        parcel.writeInt(this.f4299d ? 1 : 0);
        h8.b.N(parcel, 5, this.f4300e, i5, false);
        h8.b.O(parcel, 6, this.f4301f, false);
        h8.b.O(parcel, 7, this.f4302g, false);
        h8.b.U(parcel, 8, 4);
        parcel.writeInt(this.f4303h ? 1 : 0);
        h8.b.F(parcel, 9, this.f4304i);
        h8.b.U(parcel, 10, 4);
        parcel.writeInt(this.j ? 1 : 0);
        h8.b.U(parcel, 11, 4);
        parcel.writeInt(this.f4305k);
        h8.b.W(parcel, V);
    }
}
