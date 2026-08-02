package com.huawei.hms.health;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.hihealth.HiHealthKitClient;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.hihealth.activity.HealthKitMainActivity;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import xsna.g5o0;

/* loaded from: classes13.dex */
public class aabm extends TaskApiCall<aabh, aabp> {
    public aabm(String str, String str2) {
        super(str, str2);
    }

    private void aab(ResponseErrorCode responseErrorCode, g5o0<aabp> g5o0Var, Context context) {
        Parcelable parcelable = responseErrorCode.getParcelable();
        if (parcelable instanceof PendingIntent) {
            aabz.aabb("HealthHmsTaskApiCall", "parcelable is instanceof PendingIntent");
            PendingIntent pendingIntent = (PendingIntent) parcelable;
            try {
                if (UIUtil.isBackground(context)) {
                    g5o0Var.a(new ResolvableApiException(responseErrorCode));
                } else {
                    aacs.aaba(pendingIntent.getCreatorPackage(), HMSPackageManager.getInstance(context).getHMSPackageName());
                    pendingIntent.send();
                }
            } catch (PendingIntent.CanceledException e) {
                StringBuilder aab = aab.aab("Failed to resolve, ");
                aab.append(e.getMessage());
                aabz.aab("HealthHmsTaskApiCall", aab.toString());
                g5o0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        if (parcelable instanceof Intent) {
            aabz.aabb("HealthHmsTaskApiCall", "parcelable is instanceof Intent");
            Intent intent = (Intent) parcelable;
            aacs.aab(intent, HMSPackageManager.getInstance(context).getHMSPackageName());
            intent.setFlags(268435456);
            if (UIUtil.isBackground(context) && !"10414141".equals(Util.getAppId(context))) {
                throw new SecurityException(String.valueOf(HiHealthStatusCodes.INVALID_CONTEXT));
            }
            aabz.aabb("HealthHmsTaskApiCall", "application is not background or calling app is health app");
            context.startActivity(intent);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(aabh aabhVar, ResponseErrorCode responseErrorCode, String str, g5o0<aabp> g5o0Var) {
        String str2;
        aabh aabhVar2 = aabhVar;
        if (responseErrorCode == null) {
            aabz.aab("HealthHmsTaskApiCall", "FrameworkTestTaskApiCall header is null");
            return;
        }
        aab.aab("FrameworkTestTaskApiCall header code : ").append(responseErrorCode.getErrorCode());
        if (responseErrorCode.getErrorCode() == 0) {
            aabp aabpVar = new aabp(null);
            if (responseErrorCode.getParcelable() == null || !(responseErrorCode.getParcelable() instanceof Intent)) {
                g5o0Var.b(aabpVar);
                return;
            } else {
                g5o0Var.b(new aabp((Intent) responseErrorCode.getParcelable()));
                return;
            }
        }
        if (!responseErrorCode.hasResolution()) {
            StringBuilder aab = aab.aab("update healthKit fail, hasResolution is ");
            aab.append(responseErrorCode.getResolution());
            aabz.aabb("HealthHmsTaskApiCall", aab.toString());
            if (responseErrorCode.getErrorCode() == 1212) {
                aabz.aab("HealthHmsTaskApiCall", "parcelable is null, update kit failed, invalid context, errorCode is 50049");
            }
            g5o0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        if (responseErrorCode.getErrorCode() == -11) {
            aabz.aab("HealthHmsTaskApiCall", "this phone not install hms core");
            throw new SecurityException(String.valueOf(HiHealthStatusCodes.HMS_CORE_VER_NOT_MATCH));
        }
        StringBuilder aab2 = aab.aab("update healthKit fail, hasResolution is ");
        aab2.append(responseErrorCode.getResolution());
        aabz.aab("HealthHmsTaskApiCall", aab2.toString());
        HiHealthKitClient.getInstance().countDownChange();
        if (responseErrorCode.getErrorCode() != 1212) {
            if (new AvailableAdapter(40002300).checkHuaweiMobileServicesForUpdate(aabhVar2.getContext()) == 0) {
                StringBuilder aab3 = aab.aab("connect to hms core fail, errorCode is ");
                aab3.append(responseErrorCode.getErrorCode());
                aabz.aab("HealthHmsTaskApiCall", aab3.toString());
                return;
            }
        }
        try {
            aab(responseErrorCode, g5o0Var, aabhVar2.getContext());
        } catch (SecurityException e) {
            aabz.aab("HealthHmsTaskApiCall", "openHmsUpdateActivity catch SecurityException");
            if (String.valueOf(HiHealthStatusCodes.INVALID_CONTEXT).equals(e.getMessage())) {
                Context context = aabhVar2.getContext();
                Context context2 = HiHealthKitClient.getInstance().getContext();
                if (context2 == null) {
                    aabz.aab("HealthHmsTaskApiCall", "update kit failed, HiHealthKitClient context is null");
                } else {
                    context = context2;
                }
                if (context != null) {
                    Intent intent = new Intent(context, (Class<?>) HealthKitMainActivity.class);
                    intent.addFlags(268435456);
                    intent.putExtra(HealthKitMainActivity.HEALTH_FRAGMENT_CODE, 1);
                    try {
                        context.startActivity(intent);
                        return;
                    } catch (AndroidRuntimeException unused) {
                        str2 = "update kit failed, catch AndroidRuntimeException";
                        aabz.aab("HealthHmsTaskApiCall", str2);
                    } catch (Exception unused2) {
                        str2 = "update kit failed, catch basic Exception";
                        aabz.aab("HealthHmsTaskApiCall", str2);
                    }
                }
                str2 = "update kit failed, context from hmsFrameWork is null";
                aabz.aab("HealthHmsTaskApiCall", str2);
            }
        } catch (Throwable unused3) {
            aabz.aab("HealthHmsTaskApiCall", "openHmsUpdateActivity catch basic exception");
        }
    }
}
