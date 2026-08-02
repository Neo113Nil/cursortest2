package x5;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.sports.insider.data.room.general.table.AccountTable;
import g6.v;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f25388c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f25389d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f25390a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f25391b;

    public a(Context context) {
        this.f25391b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        v.h(context);
        ReentrantLock reentrantLock = f25388c;
        reentrantLock.lock();
        try {
            if (f25389d == null) {
                f25389d = new a(context.getApplicationContext());
            }
            a aVar = f25389d;
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String f(String str, String str2) {
        return d9.e.m(new StringBuilder(String.valueOf(str2).length() + 20), str, StringUtils.PROCESS_POSTFIX_DELIMITER, str2);
    }

    public final GoogleSignInAccount b() {
        String e7;
        String e9 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e9) && (e7 = e(f("googleSignInAccount", e9))) != null) {
            try {
                return GoogleSignInAccount.c(e7);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        v.h(googleSignInAccount);
        v.h(googleSignInOptions);
        String str = googleSignInAccount.f4393h;
        d("defaultGoogleSignInAccount", str);
        String f6 = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f4386a;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f4387b;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f4388c;
            if (str4 != null) {
                jSONObject.put(AccountTable.emailColumn, str4);
            }
            String str5 = googleSignInAccount.f4389d;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.j;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f4395k;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f4390e;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f4391f;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f4392g);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f4394i;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, androidx.coordinatorlayout.widget.i.f1247c);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f4460b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            d(f6, jSONObject.toString());
            String f10 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f4410h;
            String str10 = googleSignInOptions.f4409g;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = googleSignInOptions.f4404b;
                Collections.sort(arrayList, GoogleSignInOptions.f4402p);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f4460b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f4405c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f4406d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f4408f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f4407e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                d(f10, jSONObject2.toString());
            } catch (JSONException e7) {
                throw new RuntimeException(e7);
            }
        } catch (JSONException e9) {
            throw new RuntimeException(e9);
        }
    }

    public final void d(String str, String str2) {
        ReentrantLock reentrantLock = this.f25390a;
        reentrantLock.lock();
        try {
            this.f25391b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f25390a;
        reentrantLock.lock();
        try {
            return this.f25391b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
