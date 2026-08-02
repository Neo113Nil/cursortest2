package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.sports.insider.data.room.general.table.AccountTable;
import g6.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f4386a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4387b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4388c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4389d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f4390e;

    /* renamed from: f, reason: collision with root package name */
    public String f4391f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4392g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4393h;

    /* renamed from: i, reason: collision with root package name */
    public final List f4394i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f4395k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f4396l = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f4386a = str;
        this.f4387b = str2;
        this.f4388c = str3;
        this.f4389d = str4;
        this.f4390e = uri;
        this.f4391f = str5;
        this.f4392g = j;
        this.f4393h = str6;
        this.f4394i = arrayList;
        this.j = str7;
        this.f4395k = str8;
    }

    public static GoogleSignInAccount c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            hashSet.add(new Scope(1, jSONArray.getString(i5)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has(AccountTable.emailColumn) ? jSONObject.optString(AccountTable.emailColumn) : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        v.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f4391f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f4393h.equals(this.f4393h)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f4394i);
        hashSet.addAll(googleSignInAccount.f4396l);
        HashSet hashSet2 = new HashSet(this.f4394i);
        hashSet2.addAll(this.f4396l);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.f4393h.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f4394i);
        hashSet.addAll(this.f4396l);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 2, this.f4386a, false);
        h8.b.O(parcel, 3, this.f4387b, false);
        h8.b.O(parcel, 4, this.f4388c, false);
        h8.b.O(parcel, 5, this.f4389d, false);
        h8.b.N(parcel, 6, this.f4390e, i5, false);
        h8.b.O(parcel, 7, this.f4391f, false);
        h8.b.U(parcel, 8, 8);
        parcel.writeLong(this.f4392g);
        h8.b.O(parcel, 9, this.f4393h, false);
        h8.b.R(parcel, 10, this.f4394i, false);
        h8.b.O(parcel, 11, this.j, false);
        h8.b.O(parcel, 12, this.f4395k, false);
        h8.b.W(parcel, V);
    }
}
