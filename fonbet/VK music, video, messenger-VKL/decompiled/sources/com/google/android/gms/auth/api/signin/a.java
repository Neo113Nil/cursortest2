package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import xsna.dy2;
import xsna.exc0;
import xsna.grz0;
import xsna.hau;
import xsna.hrz0;
import xsna.iau;
import xsna.l15;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes12.dex */
public final class a {
    @NonNull
    public static GoogleSignInAccount a(@NonNull Context context, @NonNull iau iauVar) {
        GoogleSignInAccount googleSignInAccount;
        exc0.j(context, "please provide a valid Context object");
        exc0.j(iauVar, "please provide valid GoogleSignInOptionsExtension");
        hrz0 a = hrz0.a(context);
        synchronized (a) {
            googleSignInAccount = a.b;
        }
        if (googleSignInAccount == null) {
            Account account = new Account("<<default account>>", "com.google");
            HashSet hashSet = new HashSet();
            String str = account.name;
            exc0.f(str);
            googleSignInAccount = new GoogleSignInAccount(null, null, str, null, null, null, 0L, str, new ArrayList(hashSet), null, null);
        }
        Scope[] c = c(iauVar.a());
        if (c != null) {
            Collections.addAll(googleSignInAccount.m, c);
        }
        return googleSignInAccount;
    }

    @NonNull
    public static Intent b(@NonNull Activity activity, @Nullable GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        Account account;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        if (scopeArr.length > 0) {
            hashSet.add(scopeArr[0]);
            hashSet.addAll(Arrays.asList(scopeArr));
        }
        String str = googleSignInAccount.d;
        if (TextUtils.isEmpty(str)) {
            account = null;
        } else {
            exc0.i(str);
            exc0.f(str);
            account = new Account(str, "com.google");
        }
        if (hashSet.contains(GoogleSignInOptions.p)) {
            Scope scope = GoogleSignInOptions.o;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        hau hauVar = new hau(activity, l15.a, new GoogleSignInOptions(3, new ArrayList(hashSet), account, false, false, false, null, null, hashMap, null), new dy2());
        Context applicationContext = hauVar.getApplicationContext();
        int a = hauVar.a();
        int i = a - 1;
        if (a == 0) {
            throw null;
        }
        if (i == 2) {
            GoogleSignInOptions apiOptions = hauVar.getApiOptions();
            grz0.a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a2 = grz0.a(applicationContext, apiOptions);
            a2.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a2;
        }
        if (i == 3) {
            return grz0.a(applicationContext, hauVar.getApiOptions());
        }
        GoogleSignInOptions apiOptions2 = hauVar.getApiOptions();
        grz0.a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a3 = grz0.a(applicationContext, apiOptions2);
        a3.setAction("com.google.android.gms.auth.NO_IMPL");
        return a3;
    }

    @NonNull
    public static Scope[] c(@Nullable List list) {
        return list == null ? new Scope[0] : (Scope[]) list.toArray(new Scope[list.size()]);
    }
}
