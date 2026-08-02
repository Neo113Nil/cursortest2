package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.i;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.sports.insider.data.room.general.table.AccountTable;
import d6.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements b, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: k, reason: collision with root package name */
    public static final GoogleSignInOptions f4397k;

    /* renamed from: l, reason: collision with root package name */
    public static final Scope f4398l;

    /* renamed from: m, reason: collision with root package name */
    public static final Scope f4399m;

    /* renamed from: n, reason: collision with root package name */
    public static final Scope f4400n;

    /* renamed from: o, reason: collision with root package name */
    public static final Scope f4401o;

    /* renamed from: p, reason: collision with root package name */
    public static final i f4402p;

    /* renamed from: a, reason: collision with root package name */
    public final int f4403a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4404b;

    /* renamed from: c, reason: collision with root package name */
    public final Account f4405c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4406d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4407e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4408f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4409g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4410h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4411i;
    public final String j;

    static {
        Scope scope = new Scope(1, "profile");
        f4398l = new Scope(1, AccountTable.emailColumn);
        Scope scope2 = new Scope(1, "openid");
        f4399m = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f4400n = scope3;
        f4401o = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f4401o)) {
            Scope scope4 = f4400n;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f4397k = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f4401o)) {
            Scope scope5 = f4400n;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new u5.b(13);
        f4402p = new i(20);
    }

    public GoogleSignInOptions(int i5, ArrayList arrayList, Account account, boolean z5, boolean z7, boolean z10, String str, String str2, HashMap hashMap, String str3) {
        this.f4403a = i5;
        this.f4404b = arrayList;
        this.f4405c = account;
        this.f4406d = z5;
        this.f4407e = z7;
        this.f4408f = z10;
        this.f4409g = str;
        this.f4410h = str2;
        this.f4411i = new ArrayList(hashMap.values());
        this.j = str3;
    }

    public static GoogleSignInOptions c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            hashSet.add(new Scope(1, jSONArray.getString(i5)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap l0(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f4416b), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        String str = this.f4409g;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.f4404b;
            String str2 = googleSignInOptions.f4409g;
            Account account = googleSignInOptions.f4405c;
            if (this.f4411i.isEmpty() && googleSignInOptions.f4411i.isEmpty()) {
                ArrayList arrayList2 = this.f4404b;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account2 = this.f4405c;
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
                    if (this.f4408f == googleSignInOptions.f4408f && this.f4406d == googleSignInOptions.f4406d && this.f4407e == googleSignInOptions.f4407e) {
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
        ArrayList arrayList2 = this.f4404b;
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(((Scope) arrayList2.get(i5)).f4460b);
        }
        Collections.sort(arrayList);
        int hashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f4405c;
        int hashCode2 = (hashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f4409g;
        int hashCode3 = (((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f4408f ? 1 : 0)) * 31) + (this.f4406d ? 1 : 0)) * 31) + (this.f4407e ? 1 : 0)) * 31;
        String str2 = this.j;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4403a);
        h8.b.R(parcel, 2, new ArrayList(this.f4404b), false);
        h8.b.N(parcel, 3, this.f4405c, i5, false);
        h8.b.U(parcel, 4, 4);
        parcel.writeInt(this.f4406d ? 1 : 0);
        h8.b.U(parcel, 5, 4);
        parcel.writeInt(this.f4407e ? 1 : 0);
        h8.b.U(parcel, 6, 4);
        parcel.writeInt(this.f4408f ? 1 : 0);
        h8.b.O(parcel, 7, this.f4409g, false);
        h8.b.O(parcel, 8, this.f4410h, false);
        h8.b.R(parcel, 9, this.f4411i, false);
        h8.b.O(parcel, 10, this.j, false);
        h8.b.W(parcel, V);
    }
}
