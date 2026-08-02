package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes2.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new z9.e();

    /* renamed from: a, reason: collision with root package name */
    public final List f32053a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32054b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32055c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32056d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f32057e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32058f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32059g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f32060h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f32061i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f32062j;

    /* renamed from: k, reason: collision with root package name */
    public final int f32063k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public List f32064a;

        /* renamed from: b, reason: collision with root package name */
        public String f32065b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f32066c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f32067d;

        /* renamed from: e, reason: collision with root package name */
        public Account f32068e;

        /* renamed from: f, reason: collision with root package name */
        public String f32069f;

        /* renamed from: g, reason: collision with root package name */
        public String f32070g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f32071h;

        /* renamed from: i, reason: collision with root package name */
        public Bundle f32072i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f32073j;

        /* renamed from: k, reason: collision with root package name */
        public int f32074k = 0;

        public a a(b bVar, String str) {
            AbstractC3191o.n(bVar, "Resource parameter cannot be null");
            AbstractC3191o.n(str, "Resource parameter value cannot be null");
            if (this.f32072i == null) {
                this.f32072i = new Bundle();
            }
            this.f32072i.putString(bVar.f32081a, str);
            return this;
        }

        public AuthorizationRequest b() {
            return new AuthorizationRequest(this.f32064a, this.f32065b, this.f32066c, this.f32067d, this.f32068e, this.f32069f, this.f32070g, this.f32071h, this.f32072i, this.f32073j, this.f32074k);
        }

        public a c(String str) {
            this.f32069f = AbstractC3191o.g(str);
            return this;
        }

        public a d(String str, boolean z10) {
            k(str);
            this.f32065b = str;
            this.f32066c = true;
            this.f32071h = z10;
            if (z10) {
                g(1 | this.f32074k);
            }
            return this;
        }

        public a e(Account account) {
            this.f32068e = (Account) AbstractC3191o.m(account);
            return this;
        }

        public a f(boolean z10) {
            this.f32073j = z10;
            return this;
        }

        public a g(int i10) {
            this.f32074k = i10;
            return this;
        }

        public a h(List list) {
            boolean z10 = false;
            if (list != null && !list.isEmpty()) {
                z10 = true;
            }
            AbstractC3191o.b(z10, "requestedScopes cannot be null or empty");
            this.f32064a = list;
            return this;
        }

        public final a i(String str) {
            k(str);
            this.f32065b = str;
            this.f32067d = true;
            return this;
        }

        public final a j(String str) {
            this.f32070g = str;
            return this;
        }

        public final String k(String str) {
            AbstractC3191o.m(str);
            String str2 = this.f32065b;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            AbstractC3191o.b(z10, "two different server client ids provided");
            return str;
        }
    }

    public enum b {
        ACCOUNT_SELECTION_TOKEN("account_selection_token"),
        ACCOUNT_SELECTION_STATE("account_selection_state"),
        PICKER_ALLOW_MULTIPLE("allow_multiple"),
        PICKER_MIMETYPES("mimetypes"),
        PICKER_FILE_IDS("file_ids"),
        PICKER_OAUTH_TRIGGER("trigger_onepick");


        /* renamed from: a, reason: collision with root package name */
        public final String f32081a;

        b(String str) {
            this.f32081a = str;
        }
    }

    public AuthorizationRequest(List list, String str, boolean z10, boolean z11, Account account, String str2, String str3, boolean z12, Bundle bundle, boolean z13, int i10) {
        boolean z14 = false;
        if (list != null && !list.isEmpty()) {
            z14 = true;
        }
        AbstractC3191o.b(z14, "requestedScopes cannot be null or empty");
        this.f32053a = list;
        this.f32054b = str;
        this.f32055c = z10;
        this.f32056d = z11;
        this.f32057e = account;
        this.f32058f = str2;
        this.f32059g = str3;
        this.f32060h = z12;
        this.f32061i = bundle;
        this.f32062j = z13;
        this.f32063k = i10;
    }

    public static a N(AuthorizationRequest authorizationRequest) {
        b bVar;
        AbstractC3191o.m(authorizationRequest);
        a g10 = g();
        g10.h(authorizationRequest.k());
        Bundle l10 = authorizationRequest.l();
        if (l10 != null) {
            for (String str : l10.keySet()) {
                String string = l10.getString(str);
                b[] values = b.values();
                int length = values.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = values[i10];
                    if (bVar.f32081a.equals(str)) {
                        break;
                    }
                    i10++;
                }
                if (string != null && bVar != null) {
                    g10.a(bVar, string);
                }
            }
        }
        boolean isForceCodeForRefreshToken = authorizationRequest.isForceCodeForRefreshToken();
        String str2 = authorizationRequest.f32059g;
        String h10 = authorizationRequest.h();
        Account account = authorizationRequest.getAccount();
        String serverClientId = authorizationRequest.getServerClientId();
        if (str2 != null) {
            g10.j(str2);
        }
        if (h10 != null) {
            g10.c(h10);
        }
        if (account != null) {
            g10.e(account);
        }
        if (authorizationRequest.f32056d && serverClientId != null) {
            g10.i(serverClientId);
        }
        if (authorizationRequest.m() && serverClientId != null) {
            g10.d(serverClientId, isForceCodeForRefreshToken);
        }
        g10.f(authorizationRequest.f32062j);
        g10.g(authorizationRequest.j());
        return g10;
    }

    public static a g() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.f32053a;
        int size = list.size();
        List list2 = authorizationRequest.f32053a;
        if (size == list2.size() && list.containsAll(list2)) {
            Bundle bundle = authorizationRequest.f32061i;
            Bundle bundle2 = this.f32061i;
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
                        if (!AbstractC3189m.b(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f32055c == authorizationRequest.f32055c && this.f32060h == authorizationRequest.f32060h && this.f32056d == authorizationRequest.f32056d && this.f32062j == authorizationRequest.f32062j && this.f32063k == authorizationRequest.f32063k && AbstractC3189m.b(this.f32054b, authorizationRequest.f32054b) && AbstractC3189m.b(this.f32057e, authorizationRequest.f32057e) && AbstractC3189m.b(this.f32058f, authorizationRequest.f32058f) && AbstractC3189m.b(this.f32059g, authorizationRequest.f32059g)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Account getAccount() {
        return this.f32057e;
    }

    public String getServerClientId() {
        return this.f32054b;
    }

    public String h() {
        return this.f32058f;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32053a, this.f32054b, Boolean.valueOf(this.f32055c), Boolean.valueOf(this.f32060h), Boolean.valueOf(this.f32056d), this.f32057e, this.f32058f, this.f32059g, this.f32061i, Boolean.valueOf(this.f32062j), Integer.valueOf(this.f32063k));
    }

    public boolean i() {
        return this.f32062j;
    }

    public boolean isForceCodeForRefreshToken() {
        return this.f32060h;
    }

    public int j() {
        return this.f32063k;
    }

    public List k() {
        return this.f32053a;
    }

    public Bundle l() {
        return this.f32061i;
    }

    public boolean m() {
        return this.f32055c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.J(parcel, 1, k(), false);
        E9.b.F(parcel, 2, getServerClientId(), false);
        E9.b.g(parcel, 3, m());
        E9.b.g(parcel, 4, this.f32056d);
        E9.b.D(parcel, 5, getAccount(), i10, false);
        E9.b.F(parcel, 6, h(), false);
        E9.b.F(parcel, 7, this.f32059g, false);
        E9.b.g(parcel, 8, isForceCodeForRefreshToken());
        E9.b.j(parcel, 9, l(), false);
        E9.b.g(parcel, 10, i());
        E9.b.u(parcel, 11, j());
        E9.b.b(parcel, a10);
    }
}
