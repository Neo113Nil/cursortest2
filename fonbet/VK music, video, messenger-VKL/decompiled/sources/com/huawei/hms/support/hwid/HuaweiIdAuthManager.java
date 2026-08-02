package com.huawei.hms.support.hwid;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hwid.ap;
import com.huawei.hms.hwid.as;
import com.huawei.hms.hwid.x;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hwid.common.HuaweiIdAuthException;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthServiceImpl;
import java.util.List;
import xsna.g5o0;

/* loaded from: classes13.dex */
public final class HuaweiIdAuthManager {
    private static Intent a(Activity activity, List<Scope> list) {
        return getService(activity, x.a(list)).getSignInIntent();
    }

    public static void addAuthScopes(Activity activity, int i, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams == null) {
            throw new NullPointerException("HuaweiIdAuthExtendedParams should not be null");
        }
        addAuthScopes(activity, i, huaweiIdAuthExtendedParams.getExtendedScopes());
    }

    public static boolean containScopes(AuthHuaweiId authHuaweiId, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams == null) {
            return false;
        }
        return containScopes(authHuaweiId, huaweiIdAuthExtendedParams.getExtendedScopes());
    }

    public static AuthHuaweiId getAuthResult() {
        return x.b();
    }

    public static AuthHuaweiId getAuthResultWithScopes(List<Scope> list) throws HuaweiIdAuthException {
        if (ap.a(list).booleanValue()) {
            throw new HuaweiIdAuthException("ScopeList should not be empty");
        }
        AuthHuaweiId b = x.b();
        if (b == null) {
            b = new AuthHuaweiId();
        }
        b.requestExtraScopes(list);
        return b;
    }

    public static AuthHuaweiId getExtendedAuthResult(HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams == null) {
            throw new NullPointerException("HuaweiIdAuthExtendedParams should not be null");
        }
        List<Scope> extendedScopes = huaweiIdAuthExtendedParams.getExtendedScopes();
        AuthHuaweiId b = x.b();
        if (b == null) {
            b = new AuthHuaweiId();
        }
        return b.requestExtraScopes(extendedScopes);
    }

    public static HuaweiIdAuthService getService(Context context, HuaweiIdAuthParams huaweiIdAuthParams) {
        return new HuaweiIdAuthServiceImpl(context, huaweiIdAuthParams, 60900100);
    }

    public static Task<AuthHuaweiId> parseAuthResultFromIntent(Intent intent) {
        g5o0 g5o0Var = new g5o0();
        HuaweiIdAuthResult a = x.a(intent);
        if (a == null) {
            g5o0Var.a(new ApiException(new Status(8)));
        } else if (!a.isSuccess() || a.getHuaweiId() == null) {
            g5o0Var.a(new ApiException(a.getStatus()));
        } else {
            g5o0Var.b(a.getHuaweiId());
        }
        return g5o0Var.a;
    }

    public static HuaweiIdAuthService getService(Activity activity, HuaweiIdAuthParams huaweiIdAuthParams) {
        return new HuaweiIdAuthServiceImpl(activity, huaweiIdAuthParams, 60900100);
    }

    public static boolean containScopes(AuthHuaweiId authHuaweiId, List<Scope> list) {
        if (authHuaweiId == null) {
            return false;
        }
        if (ap.a(list).booleanValue()) {
            return true;
        }
        return authHuaweiId.getAuthorizedScopes().containsAll(list);
    }

    public static void addAuthScopes(Fragment fragment, int i, HuaweiIdAuthExtendedParams huaweiIdAuthExtendedParams) {
        if (huaweiIdAuthExtendedParams != null) {
            addAuthScopes(fragment, i, huaweiIdAuthExtendedParams.getExtendedScopes());
            return;
        }
        throw new NullPointerException("HuaweiIdAuthExtendedParams should not be null");
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
                as.d("HuaweiIdAuthManager", "Exception：".concat(e.getClass().getSimpleName()), true);
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
                as.d("HuaweiIdAuthManager", "Exception：".concat(e.getClass().getSimpleName()), true);
                return;
            }
        }
        throw new NullPointerException("ScopeList should not be null");
    }
}
