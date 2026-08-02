package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import xsna.g5o0;

/* compiled from: HuaweiIdDeleteAuthInfoTaskApiCall.java */
/* loaded from: classes13.dex */
public class aa extends TaskApiCall<u, Void> {
    public aa(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, g5o0<Void> g5o0Var) {
        if (responseErrorCode == null) {
            as.b("[HUAWEIIDSDK]HuaweiIdDeleteAuthInfoTaskApiCall", "response is null.", true);
            g5o0Var.a(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        a(responseErrorCode, str);
        if (TextUtils.isEmpty(str)) {
            g5o0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else if (responseErrorCode.getErrorCode() == 0) {
            g5o0Var.b(null);
        } else {
            g5o0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40000300;
    }

    private void a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        as.b("[HUAWEIIDSDK]HuaweiIdDeleteAuthInfoTaskApiCall", sb.toString(), true);
    }
}
