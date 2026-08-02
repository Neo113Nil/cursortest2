package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.auth.api.signin.internal.zbn;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC3178b;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public final class GoogleSignIn {
    private GoogleSignIn() {
    }

    @NonNull
    public static GoogleSignInAccount getAccountForExtension(@NonNull Context context, @NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        AbstractC3191o.n(context, "please provide a valid Context object");
        AbstractC3191o.n(googleSignInOptionsExtension, "please provide valid GoogleSignInOptionsExtension");
        GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = GoogleSignInAccount.createDefault();
        }
        return lastSignedInAccount.requestExtraScopes(zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    @NonNull
    public static GoogleSignInAccount getAccountForScopes(@NonNull Context context, @NonNull Scope scope, @NonNull Scope... scopeArr) {
        AbstractC3191o.n(context, "please provide a valid Context object");
        AbstractC3191o.n(scope, "please provide at least one valid scope");
        GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = GoogleSignInAccount.createDefault();
        }
        lastSignedInAccount.requestExtraScopes(scope);
        lastSignedInAccount.requestExtraScopes(scopeArr);
        return lastSignedInAccount;
    }

    @NonNull
    public static GoogleSignInClient getClient(@NonNull Activity activity, @NonNull GoogleSignInOptions googleSignInOptions) {
        return new GoogleSignInClient(activity, (GoogleSignInOptions) AbstractC3191o.m(googleSignInOptions));
    }

    public static GoogleSignInAccount getLastSignedInAccount(@NonNull Context context) {
        return zbn.zba(context).zbd();
    }

    @NonNull
    public static Task<GoogleSignInAccount> getSignedInAccountFromIntent(Intent intent) {
        GoogleSignInResult zbg = zbm.zbg(intent);
        GoogleSignInAccount signInAccount = zbg.getSignInAccount();
        return (!zbg.getStatus().l() || signInAccount == null) ? Tasks.forException(AbstractC3178b.a(zbg.getStatus())) : Tasks.forResult(signInAccount);
    }

    public static boolean hasPermissions(GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        AbstractC3191o.n(googleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
        return hasPermissions(googleSignInAccount, zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    public static void requestPermissions(@NonNull Activity activity, int i10, GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        AbstractC3191o.n(activity, "Please provide a non-null Activity");
        AbstractC3191o.n(googleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(activity, i10, googleSignInAccount, zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    @NonNull
    private static Intent zba(@NonNull Activity activity, GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder();
        if (scopeArr.length > 0) {
            builder.requestScopes(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.getEmail())) {
            builder.setAccountName((String) AbstractC3191o.m(googleSignInAccount.getEmail()));
        }
        return new GoogleSignInClient(activity, builder.build()).getSignInIntent();
    }

    @NonNull
    private static Scope[] zbb(List list) {
        return list == null ? new Scope[0] : (Scope[]) list.toArray(new Scope[list.size()]);
    }

    @NonNull
    public static GoogleSignInClient getClient(@NonNull Context context, @NonNull GoogleSignInOptions googleSignInOptions) {
        return new GoogleSignInClient(context, (GoogleSignInOptions) AbstractC3191o.m(googleSignInOptions));
    }

    public static boolean hasPermissions(GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.getGrantedScopes().containsAll(hashSet);
    }

    public static void requestPermissions(@NonNull Activity activity, int i10, GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        AbstractC3191o.n(activity, "Please provide a non-null Activity");
        AbstractC3191o.n(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(zba(activity, googleSignInAccount, scopeArr), i10);
    }

    public static void requestPermissions(@NonNull Fragment fragment, int i10, GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        AbstractC3191o.n(fragment, "Please provide a non-null Fragment");
        AbstractC3191o.n(googleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(fragment, i10, googleSignInAccount, zbb(googleSignInOptionsExtension.getImpliedScopes()));
    }

    public static void requestPermissions(@NonNull Fragment fragment, int i10, GoogleSignInAccount googleSignInAccount, @NonNull Scope... scopeArr) {
        AbstractC3191o.n(fragment, "Please provide a non-null Fragment");
        AbstractC3191o.n(scopeArr, "Please provide at least one scope");
        fragment.startActivityForResult(zba(fragment.getActivity(), googleSignInAccount, scopeArr), i10);
    }
}
