package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.ozg0;
import xsna.tbb0;
import xsna.unz0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
@Deprecated
/* loaded from: classes12.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements a.d, a.d.InterfaceC0113d, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    @NonNull
    public static final GoogleSignInOptions m;

    @NonNull
    public static final Scope n;

    @NonNull
    public static final Scope o;

    @NonNull
    public static final Scope p;
    public static final tbb0 q;
    public final int b;
    public final ArrayList c;

    @Nullable
    public final Account d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    @Nullable
    public final String h;

    @Nullable
    public final String i;
    public final ArrayList j;

    @Nullable
    public final String k;
    public final Map l;

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    @Deprecated
    public static final class a {
        public HashSet a;
        public boolean b;
        public boolean c;
        public boolean d;

        @Nullable
        public String e;

        @Nullable
        public Account f;

        @Nullable
        public String g;
        public HashMap h;

        @Nullable
        public String i;
    }

    static {
        Scope scope = new Scope(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        new Scope("email");
        Scope scope2 = new Scope(CommonConstant.SCOPE.SCOPE_ACCOUNT_OPENID);
        n = scope2;
        Scope scope3 = new Scope("https://www.googleapis.com/auth/games_lite");
        o = scope3;
        p = new Scope("https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(p)) {
            Scope scope4 = o;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        m = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(p)) {
            Scope scope5 = o;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new unz0();
        q = new tbb0(4);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, @Nullable Account account, boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable String str2, HashMap hashMap, @Nullable String str3) {
        this.b = i;
        this.c = arrayList;
        this.d = account;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str;
        this.i = str2;
        this.j = new ArrayList(hashMap.values());
        this.l = hashMap;
        this.k = str3;
    }

    @Nullable
    public static GoogleSignInOptions b(@Nullable String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(SharedKt.PARAM_SCOPES);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap i(@Nullable ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.c), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    public final boolean equals(@Nullable Object obj) {
        String str = this.h;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.c;
            String str2 = googleSignInOptions.h;
            Account account = googleSignInOptions.d;
            if (this.j.isEmpty() && googleSignInOptions.j.isEmpty()) {
                ArrayList arrayList2 = this.c;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account2 = this.d;
                    if (account2 == null) {
                        if (account != null) {
                            return false;
                        }
                    } else if (!account2.equals(account)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    if (this.g == googleSignInOptions.g && this.e == googleSignInOptions.e && this.f == googleSignInOptions.f) {
                        return TextUtils.equals(this.k, googleSignInOptions.k);
                    }
                    return false;
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).c);
        }
        Collections.sort(arrayList);
        int hashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.d;
        int hashCode2 = (hashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.h;
        int hashCode3 = (((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.g ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        String str2 = this.k;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.u(parcel, 2, new ArrayList(this.c), false);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.g ? 1 : 0);
        ozg0.q(parcel, 7, this.h, false);
        ozg0.q(parcel, 8, this.i, false);
        ozg0.u(parcel, 9, this.j, false);
        ozg0.q(parcel, 10, this.k, false);
        ozg0.x(w, parcel);
    }
}
