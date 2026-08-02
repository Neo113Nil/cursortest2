package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.q6i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes3.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions k;
    public static final Scope l;
    public static final Scope m;
    public static final Scope n;
    public static final q6i o;
    public final int a;
    public final ArrayList b;
    public final Account c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final ArrayList i;
    public final String j;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public static final class Builder {
        public boolean b;
        public boolean c;
        public boolean d;
        public String e;
        public Account f;
        public String g;
        public String i;
        public HashSet a = new HashSet();
        public HashMap h = new HashMap();

        public final GoogleSignInOptions a() {
            HashSet hashSet = this.a;
            if (hashSet.contains(GoogleSignInOptions.n)) {
                Scope scope = GoogleSignInOptions.m;
                if (hashSet.contains(scope)) {
                    hashSet.remove(scope);
                }
            }
            if (this.d && (this.f == null || !hashSet.isEmpty())) {
                hashSet.add(GoogleSignInOptions.l);
            }
            return new GoogleSignInOptions(3, new ArrayList(hashSet), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
        }
    }

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, NotificationCompat.CATEGORY_EMAIL);
        Scope scope2 = new Scope(1, "openid");
        l = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        m = scope3;
        n = new Scope(1, "https://www.googleapis.com/auth/games");
        Builder builder = new Builder();
        builder.a.add(scope2);
        builder.a.add(scope);
        k = builder.a();
        Builder builder2 = new Builder();
        HashSet hashSet = builder2.a;
        hashSet.add(scope3);
        hashSet.addAll(Arrays.asList(new Scope[0]));
        builder2.a();
        CREATOR = new zad();
        o = new q6i(26);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap hashMap, String str3) {
        this.a = i;
        this.b = arrayList;
        this.c = account;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str;
        this.h = str2;
        this.i = new ArrayList(hashMap.values());
        this.j = str3;
    }

    public static GoogleSignInOptions Y0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap Z0(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.b), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        String str = this.g;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.b;
            String str2 = googleSignInOptions.g;
            if (this.i.isEmpty() && googleSignInOptions.i.isEmpty()) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account = this.c;
                    Account account2 = googleSignInOptions.c;
                    if (account == null) {
                        if (account2 != null) {
                            return false;
                        }
                    } else if (!account.equals(account2)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    if (this.f == googleSignInOptions.f && this.d == googleSignInOptions.d && this.e == googleSignInOptions.e) {
                        return TextUtils.equals(this.j, googleSignInOptions.j);
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
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).b);
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.a(arrayList);
        hashAccumulator.a(this.c);
        hashAccumulator.a(this.g);
        hashAccumulator.a = (((((hashAccumulator.a * 31) + (this.f ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
        hashAccumulator.a(this.j);
        return hashAccumulator.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.q(parcel, 2, new ArrayList(this.b), false);
        SafeParcelWriter.l(parcel, 3, this.c, i, false);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        SafeParcelWriter.m(parcel, 7, this.g, false);
        SafeParcelWriter.m(parcel, 8, this.h, false);
        SafeParcelWriter.q(parcel, 9, this.i, false);
        SafeParcelWriter.m(parcel, 10, this.j, false);
        SafeParcelWriter.t(parcel, s);
    }
}
