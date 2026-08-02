package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;
import xsna.vqz0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new vqz0();
    public final List b;

    @Nullable
    public final String c;
    public final boolean d;
    public final boolean e;

    @Nullable
    public final Account f;

    @Nullable
    public final String g;

    @Nullable
    public final String h;
    public final boolean i;

    @Nullable
    public final Bundle j;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    public static final class a {
        public List a;

        @Nullable
        public String b;
        public boolean c;
        public boolean d;

        @Nullable
        public Account e;

        @Nullable
        public String f;
        public boolean g;

        @Nullable
        public Bundle h;
    }

    public AuthorizationRequest(List list, @Nullable String str, boolean z, boolean z2, @Nullable Account account, @Nullable String str2, @Nullable String str3, boolean z3, @Nullable Bundle bundle) {
        boolean z4 = false;
        if (list != null && !list.isEmpty()) {
            z4 = true;
        }
        exc0.a("requestedScopes cannot be null or empty", z4);
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = account;
        this.g = str2;
        this.h = str3;
        this.i = z3;
        this.j = bundle;
    }

    @NonNull
    public static a b(@NonNull AuthorizationRequest authorizationRequest) {
        zbd zbdVar;
        a aVar = new a();
        List list = authorizationRequest.b;
        exc0.a("requestedScopes cannot be null or empty", (list == null || list.isEmpty()) ? false : true);
        aVar.a = list;
        Bundle bundle = authorizationRequest.j;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                zbd[] values = zbd.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        zbdVar = null;
                        break;
                    }
                    zbdVar = values[i];
                    if (zbdVar.zbc.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (string != null && zbdVar != null) {
                    if (aVar.h == null) {
                        aVar.h = new Bundle();
                    }
                    aVar.h.putString(zbdVar.zbc, string);
                }
            }
        }
        boolean z = authorizationRequest.i;
        String str2 = authorizationRequest.g;
        Account account = authorizationRequest.f;
        String str3 = authorizationRequest.c;
        if (str2 != null) {
            exc0.f(str2);
            aVar.f = str2;
        }
        if (account != null) {
            aVar.e = account;
        }
        if (authorizationRequest.e && str3 != null) {
            String str4 = aVar.b;
            exc0.a("two different server client ids provided", str4 == null || str4.equals(str3));
            aVar.b = str3;
            aVar.d = true;
        }
        if (authorizationRequest.d && str3 != null) {
            String str5 = aVar.b;
            exc0.a("two different server client ids provided", str5 == null || str5.equals(str3));
            aVar.b = str3;
            aVar.c = true;
            aVar.g = z;
        }
        return aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.b;
        if (list.size() == authorizationRequest.b.size() && list.containsAll(authorizationRequest.b)) {
            Bundle bundle = authorizationRequest.j;
            Bundle bundle2 = this.j;
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
                        if (!dq70.b(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.d == authorizationRequest.d && this.i == authorizationRequest.i && this.e == authorizationRequest.e && dq70.b(this.c, authorizationRequest.c) && dq70.b(this.f, authorizationRequest.f) && dq70.b(this.g, authorizationRequest.g) && dq70.b(this.h, authorizationRequest.h)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.i), Boolean.valueOf(this.e), this.f, this.g, this.h, this.j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ozg0.p(parcel, 5, this.f, i, false);
        ozg0.q(parcel, 6, this.g, false);
        ozg0.q(parcel, 7, this.h, false);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(this.i ? 1 : 0);
        ozg0.d(parcel, 9, this.j, false);
        ozg0.x(w, parcel);
    }
}
