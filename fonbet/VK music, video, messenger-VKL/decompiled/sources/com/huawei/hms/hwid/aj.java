package com.huawei.hms.hwid;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.szy0;

/* compiled from: ReadSmsService.java */
/* loaded from: classes13.dex */
public class aj extends HuaweiApi<Api.ApiOptions.NoOptions> {
    public aj(Activity activity, Api<Api.ApiOptions.NoOptions> api, Api.ApiOptions.NoOptions noOptions, AbstractClientBuilder abstractClientBuilder) {
        super(activity, api, noOptions, abstractClientBuilder);
    }

    private af b() {
        return new af(getContext().getPackageName());
    }

    public Task<Void> a() {
        String a = b().a();
        if (!TextUtils.isEmpty(a)) {
            return doWrite(new ak(CommonNaming.startSmsRetriever, a, HiAnalyticsClient.reportEntry(getContext(), CommonNaming.startSmsRetriever, 60900100)));
        }
        szy0 szy0Var = new szy0();
        ApiException apiException = new ApiException(new Status(2020, CommonConstant.RETCODE.SMS_PARAM_ERROR));
        synchronized (szy0Var.a) {
            try {
                if (!szy0Var.b) {
                    szy0Var.b = true;
                    szy0Var.d = apiException;
                    szy0Var.a.notifyAll();
                    szy0Var.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return szy0Var;
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 1;
    }

    public aj(Context context, Api<Api.ApiOptions.NoOptions> api, Api.ApiOptions.NoOptions noOptions, AbstractClientBuilder abstractClientBuilder) {
        super(context, api, noOptions, abstractClientBuilder);
    }

    public Task<Void> a(String str) {
        as.b("ReadSmsService", "startConsent enter", true);
        if (str != null && str.length() > 120) {
            szy0 szy0Var = new szy0();
            ApiException apiException = new ApiException(new Status(2020, CommonConstant.RETCODE.SMS_PARAM_ERROR));
            synchronized (szy0Var.a) {
                try {
                    if (!szy0Var.b) {
                        szy0Var.b = true;
                        szy0Var.d = apiException;
                        szy0Var.a.notifyAll();
                        szy0Var.h();
                    }
                } finally {
                }
            }
            return szy0Var;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageName", getContext().getPackageName());
            jSONObject.put("phoneNumber", str);
        } catch (JSONException unused) {
            as.d("ReadSmsService", "toJson failed", true);
        }
        if (TextUtils.isEmpty(jSONObject.toString())) {
            szy0 szy0Var2 = new szy0();
            ApiException apiException2 = new ApiException(new Status(2020, CommonConstant.RETCODE.SMS_PARAM_ERROR));
            synchronized (szy0Var2.a) {
                try {
                    if (!szy0Var2.b) {
                        szy0Var2.b = true;
                        szy0Var2.d = apiException2;
                        szy0Var2.a.notifyAll();
                        szy0Var2.h();
                    }
                } finally {
                }
            }
            return szy0Var2;
        }
        return doWrite(new al(CommonNaming.startConsent, jSONObject.toString(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.startConsent, 60900100)));
    }
}
