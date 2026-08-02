package com.google.android.gms.auth.api.signin.internal;

import G9.a;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C3130g;
import com.google.android.gms.common.api.internal.C3148p;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zbm {
    private static final a zba = new a("GoogleSignInCommon", new String[0]);

    public static Intent zba(Context context, GoogleSignInOptions googleSignInOptions) {
        zba.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static Intent zbb(Context context, GoogleSignInOptions googleSignInOptions) {
        zba.a("getFallbackSignInIntent()", new Object[0]);
        Intent zba2 = zba(context, googleSignInOptions);
        zba2.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return zba2;
    }

    public static Intent zbc(Context context, GoogleSignInOptions googleSignInOptions) {
        zba.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent zba2 = zba(context, googleSignInOptions);
        zba2.setAction("com.google.android.gms.auth.NO_IMPL");
        return zba2;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g zbd(f fVar, Context context, GoogleSignInOptions googleSignInOptions, boolean z10) {
        GoogleSignInAccount zbd;
        GoogleSignInResult googleSignInResult;
        a aVar = zba;
        aVar.a("silentSignIn()", new Object[0]);
        aVar.a("getEligibleSavedSignInResult()", new Object[0]);
        AbstractC3191o.m(googleSignInOptions);
        GoogleSignInOptions zbe = zbn.zba(context).zbe();
        if (zbe != null) {
            Account account = zbe.getAccount();
            Account account2 = googleSignInOptions.getAccount();
            if (account != null ? account.equals(account2) : account2 == null) {
                if (!googleSignInOptions.isServerAuthCodeRequested() && ((!googleSignInOptions.isIdTokenRequested() || (zbe.isIdTokenRequested() && AbstractC3189m.b(googleSignInOptions.getServerClientId(), zbe.getServerClientId()))) && new HashSet(zbe.getScopes()).containsAll(new HashSet(googleSignInOptions.getScopes())) && (zbd = zbn.zba(context).zbd()) != null && !zbd.isExpired())) {
                    googleSignInResult = new GoogleSignInResult(zbd, Status.f32275f);
                    if (googleSignInResult == null) {
                        aVar.a("Eligible saved sign in result found", new Object[0]);
                        return i.b(googleSignInResult, fVar);
                    }
                    if (z10) {
                        return i.b(new GoogleSignInResult(null, new Status(4)), fVar);
                    }
                    aVar.a("trySilentSignIn()", new Object[0]);
                    return new C3148p(fVar.g(new zbg(fVar, context, googleSignInOptions)));
                }
            }
        }
        googleSignInResult = null;
        if (googleSignInResult == null) {
        }
    }

    public static h zbe(f fVar, Context context, boolean z10) {
        zba.a("Signing out", new Object[0]);
        zbh(context);
        return z10 ? i.c(Status.f32275f, fVar) : fVar.h(new zbi(fVar));
    }

    public static h zbf(f fVar, Context context, boolean z10) {
        zba.a("Revoking access", new Object[0]);
        String savedRefreshToken = Storage.getInstance(context).getSavedRefreshToken();
        zbh(context);
        return z10 ? zbb.zba(savedRefreshToken) : fVar.h(new zbk(fVar));
    }

    public static GoogleSignInResult zbg(Intent intent) {
        if (intent == null) {
            return new GoogleSignInResult(null, Status.f32277h);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new GoogleSignInResult(googleSignInAccount, Status.f32275f);
        }
        if (status == null) {
            status = Status.f32277h;
        }
        return new GoogleSignInResult(null, status);
    }

    private static void zbh(Context context) {
        zbn.zba(context).zbb();
        Iterator it = f.i().iterator();
        while (it.hasNext()) {
            ((f) it.next()).o();
        }
        C3130g.a();
    }
}
