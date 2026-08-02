package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.exc0;
import xsna.ozg0;
import xsna.wlz0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
@Deprecated
/* loaded from: classes12.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new wlz0();

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final Uri f;

    @Nullable
    public String g;
    public final long h;
    public final String i;
    public final List j;

    @Nullable
    public final String k;

    @Nullable
    public final String l;
    public final HashSet m = new HashSet();

    public GoogleSignInAccount(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Uri uri, @Nullable String str5, long j, String str6, ArrayList arrayList, @Nullable String str7, @Nullable String str8) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = j;
        this.i = str6;
        this.j = arrayList;
        this.k = str7;
        this.l = str8;
    }

    @Nullable
    public static GoogleSignInAccount k(@Nullable String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(CommonConstant.KEY_GRANTED_SCOPES);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has(CommonConstant.KEY_DISPLAY_NAME) ? jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME) : null;
        String optString6 = jSONObject.has(CommonConstant.KEY_GIVEN_NAME) ? jSONObject.optString(CommonConstant.KEY_GIVEN_NAME) : null;
        String optString7 = jSONObject.has(CommonConstant.KEY_FAMILY_NAME) ? jSONObject.optString(CommonConstant.KEY_FAMILY_NAME) : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        exc0.f(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.g = jSONObject.has(CommonConstant.KEY_SERVER_AUTH_CODE) ? jSONObject.optString(CommonConstant.KEY_SERVER_AUTH_CODE) : null;
        return googleSignInAccount;
    }

    public final boolean equals(@Nullable Object obj) {
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
        return googleSignInAccount.i.equals(this.i) && googleSignInAccount.j().equals(j());
    }

    public final int hashCode() {
        return ((this.i.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + j().hashCode();
    }

    @Nullable
    public final Account i() {
        String str = this.d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    @NonNull
    public final HashSet j() {
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.m);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.p(parcel, 6, this.f, i, false);
        ozg0.q(parcel, 7, this.g, false);
        ozg0.v(parcel, 8, 8);
        parcel.writeLong(this.h);
        ozg0.q(parcel, 9, this.i, false);
        ozg0.u(parcel, 10, this.j, false);
        ozg0.q(parcel, 11, this.k, false);
        ozg0.q(parcel, 12, this.l, false);
        ozg0.x(w, parcel);
    }
}
