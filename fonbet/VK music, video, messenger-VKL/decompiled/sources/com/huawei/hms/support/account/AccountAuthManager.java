package com.huawei.hms.support.account;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hwid.ap;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.f;
import com.huawei.hms.support.account.common.AccountAuthException;
import com.huawei.hms.support.account.request.AccountAuthExtendedParams;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.account.service.AccountAuthService;
import com.huawei.hms.support.account.service.AccountAuthServiceImpl;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;
import xsna.g5o0;

/* loaded from: classes13.dex */
public final class AccountAuthManager {
    private static Intent a(Activity activity, List<Scope> list) {
        return getService(activity, f.a(list)).getSignInIntent();
    }

    public static void addAuthScopes(Activity activity, int i, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams == null) {
            throw new NullPointerException("AccountAuthExtendedParams should not be null");
        }
        addAuthScopes(activity, i, accountAuthExtendedParams.getExtendedScopes());
    }

    public static boolean containScopes(AuthAccount authAccount, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams == null) {
            return false;
        }
        return containScopes(authAccount, accountAuthExtendedParams.getExtendedScopes());
    }

    public static AuthAccount getAuthResult() {
        return f.b();
    }

    public static AuthAccount getAuthResultWithScopes(List<Scope> list) throws AccountAuthException {
        if (ap.a(list).booleanValue()) {
            throw new AccountAuthException("ScopeList should not be empty");
        }
        AuthAccount b = f.b();
        if (b == null) {
            b = new AuthAccount();
        }
        b.requestExtraScopes(list);
        return b;
    }

    public static AuthAccount getExtendedAuthResult(AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams == null) {
            throw new NullPointerException("AccountAuthExtendedParams should not be null");
        }
        List<Scope> extendedScopes = accountAuthExtendedParams.getExtendedScopes();
        AuthAccount b = f.b();
        if (b == null) {
            b = new AuthAccount();
        }
        return b.requestExtraScopes(extendedScopes);
    }

    public static AccountAuthService getService(Context context, AccountAuthParams accountAuthParams) {
        return new AccountAuthServiceImpl(context, accountAuthParams, 60900100);
    }

    public static Task<AuthAccount> parseAuthResultFromIntent(Intent intent) {
        g5o0 g5o0Var = new g5o0();
        AccountAuthResult a = f.a(intent);
        if (a == null) {
            g5o0Var.a(new ApiException(new Status(8)));
        } else if (!a.isSuccess() || a.getAccount() == null) {
            g5o0Var.a(new ApiException(a.getStatus()));
        } else {
            g5o0Var.b(a.getAccount());
        }
        return g5o0Var.a;
    }

    public static AccountAuthService getService(Activity activity, AccountAuthParams accountAuthParams) {
        return new AccountAuthServiceImpl(activity, accountAuthParams, 60900100);
    }

    public static boolean containScopes(AuthAccount authAccount, List<Scope> list) {
        if (authAccount == null) {
            return false;
        }
        if (ap.a(list).booleanValue()) {
            return true;
        }
        return authAccount.getAuthorizedScopes().containsAll(list);
    }

    public static void addAuthScopes(Fragment fragment, int i, AccountAuthExtendedParams accountAuthExtendedParams) {
        if (accountAuthExtendedParams != null) {
            addAuthScopes(fragment, i, accountAuthExtendedParams.getExtendedScopes());
            return;
        }
        throw new NullPointerException("AccountAuthExtendedParams should not be null");
    }

    public static void addAuthScopes(Activity activity, int i, List<Scope> list) {
        if (activity == null) {
            throw new NullPointerException("Activity should not be null");
        }
        if (list != null) {
            try {
                activity.startActivityForResult(a(activity, list), i);
                return;
            } catch (Exception e) {
                as.d("AccountAuthManager", "Exception：".concat(e.getClass().getSimpleName()), true);
                return;
            }
        }
        throw new NullPointerException("ScopeList should not be null");
    }

    public static void addAuthScopes(Fragment fragment, int i, List<Scope> list) {
        if (fragment == null) {
            throw new NullPointerException("Fragment should not be null");
        }
        if (list != null) {
            try {
                fragment.startActivityForResult(a(fragment.getActivity(), list), i);
                return;
            } catch (Exception e) {
                as.d("AccountAuthManager", "Exception：".concat(e.getClass().getSimpleName()), true);
                return;
            }
        }
        throw new NullPointerException("ScopeList should not be null");
    }
}
