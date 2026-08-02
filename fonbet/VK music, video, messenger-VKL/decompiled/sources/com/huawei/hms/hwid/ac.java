package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.utils.Util;
import org.json.JSONException;
import xsna.g5o0;

/* compiled from: HuaweiIdSignInTaskApiCall.java */
/* loaded from: classes13.dex */
public class ac extends TaskApiCall<u, AuthHuaweiId> {
    public ac(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c8  */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, g5o0<AuthHuaweiId> g5o0Var) {
        AuthHuaweiId authHuaweiId;
        int i;
        if (responseErrorCode == null) {
            as.b("[HUAWEIIDSDK]SignInTaskApiCall", "response is null.", true);
            g5o0Var.a(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        as.b("[HUAWEIIDSDK]SignInTaskApiCall", "ResponseErrorCode.status:" + responseErrorCode.getErrorCode(), true);
        int errorCode = responseErrorCode.getErrorCode();
        if (TextUtils.isEmpty(str)) {
            as.b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn complete, response is null, failed", true);
            g5o0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            i = errorCode;
            authHuaweiId = null;
        } else {
            try {
                HuaweiIdAuthResult fromJson = new HuaweiIdAuthResult().fromJson(str);
                errorCode = fromJson.getStatus().getStatusCode();
                if (fromJson.isSuccess()) {
                    as.b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn success", true);
                    new w(uVar.getContext()).a();
                    authHuaweiId = fromJson.getHuaweiId();
                    try {
                        g5o0Var.b(fromJson.getHuaweiId());
                    } catch (JSONException unused) {
                        as.c("[HUAWEIIDSDK]SignInTaskApiCall", "signIn complete, but parser json exception", true);
                        g5o0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                        i = errorCode;
                        y.a().a(authHuaweiId, (HuaweiIdAuthParams) null);
                        if (uVar != null) {
                        }
                        as.b("[HUAWEIIDSDK]SignInTaskApiCall", "report: api=hwid.silentSignInversion=61100301", true);
                    }
                } else {
                    as.b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn failed", true);
                    g5o0Var.a(new ApiException(fromJson.getStatus()));
                    authHuaweiId = null;
                }
            } catch (JSONException unused2) {
                authHuaweiId = null;
            }
            i = errorCode;
        }
        y.a().a(authHuaweiId, (HuaweiIdAuthParams) null);
        if (uVar != null) {
            HiAnalyticsClient.reportExit(uVar.getContext(), CommonNaming.silentSignIn, getTransactionId(), Util.getAppId(uVar.getContext()), ar.a(i), i, 61100301);
        }
        as.b("[HUAWEIIDSDK]SignInTaskApiCall", "report: api=hwid.silentSignInversion=61100301", true);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }
}
