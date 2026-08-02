package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONException;
import xsna.g5o0;

/* compiled from: AccountSignInTaskApiCall.java */
/* loaded from: classes13.dex */
public class m extends TaskApiCall<c, AuthAccount> {
    public m(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, g5o0<AuthAccount> g5o0Var) {
        AuthAccount authAccount;
        AccountAuthResult fromJson;
        if (responseErrorCode == null) {
            as.b("[AccountSDK]AccountSignInTaskApiCall", "response is null.", true);
            g5o0Var.a(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        as.b("[AccountSDK]AccountSignInTaskApiCall", "ResponseErrorCode.status:" + responseErrorCode.getErrorCode(), true);
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            as.b("[AccountSDK]AccountSignInTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            g5o0Var.a(new ResolvableApiException(status));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            as.b("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, response is null, failed", true);
            g5o0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else {
            if ("{}".equals(str)) {
                as.b("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, body is null", true);
                g5o0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                return;
            }
            try {
                fromJson = new AccountAuthResult().fromJson(str);
                errorCode = fromJson.getStatus().getStatusCode();
            } catch (JSONException unused) {
                authAccount = null;
            }
            if (fromJson.isSuccess()) {
                as.b("[AccountSDK]AccountSignInTaskApiCall", "signIn success", true);
                new e(cVar.getContext()).a();
                authAccount = fromJson.getAccount();
                try {
                    g5o0Var.b(fromJson.getAccount());
                } catch (JSONException unused2) {
                    as.c("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, but parser json exception", true);
                    g5o0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
                    g.a().a(authAccount, (AccountAuthParams) null);
                    if (cVar != null) {
                    }
                }
                g.a().a(authAccount, (AccountAuthParams) null);
                if (cVar != null) {
                    HiAnalyticsClient.reportExit(cVar.getContext(), getUri(), getTransactionId(), ar.a(errorCode), errorCode);
                    return;
                }
                return;
            }
            as.b("[AccountSDK]AccountSignInTaskApiCall", "signIn failed", true);
            g5o0Var.a(new ApiException(fromJson.getStatus()));
        }
        authAccount = null;
        g.a().a(authAccount, (AccountAuthParams) null);
        if (cVar != null) {
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }
}
