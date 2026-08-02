package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.hwid.SignOutResult;
import org.json.JSONException;
import xsna.g5o0;

/* compiled from: AccountSignOutTaskApiCall.java */
/* loaded from: classes13.dex */
public class n extends TaskApiCall<c, Void> {
    public n(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, g5o0<Void> g5o0Var) {
        if (responseErrorCode == null) {
            as.b("[AccountSDK]AccountSignOutTaskApiCall", "response is null.", true);
            g5o0Var.a(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        a(responseErrorCode, str);
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            as.b("[AccountSDK]AccountSignOutTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            g5o0Var.a(new ResolvableApiException(status));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            g5o0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
            return;
        }
        if ("{}".equals(str)) {
            as.b("[AccountSDK]AccountSignOutTaskApiCall", "SignOut complete, body is null", true);
            g5o0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
            return;
        }
        try {
            SignOutResult fromJson = new SignOutResult().fromJson(str);
            if (fromJson.isSuccess()) {
                g5o0Var.b(null);
            } else {
                g5o0Var.a(new ApiException(fromJson.getStatus()));
            }
        } catch (JSONException e) {
            as.b("[AccountSDK]AccountSignOutTaskApiCall", "JSONException:".concat(e.getClass().getSimpleName()), true);
            g5o0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    private void a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        as.b("[AccountSDK]AccountSignOutTaskApiCall", sb.toString(), true);
    }
}
