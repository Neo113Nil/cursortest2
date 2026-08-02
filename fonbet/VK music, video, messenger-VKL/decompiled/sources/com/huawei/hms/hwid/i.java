package com.huawei.hms.hwid;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.account.result.AccountIcon;
import com.huawei.hms.support.account.result.GetChannelResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.preference.Preference;
import org.json.JSONException;
import xsna.g5o0;

/* compiled from: AccountGetChannelTaskApiCall.java */
/* loaded from: classes13.dex */
public class i extends TaskApiCall<c, AccountIcon> {
    private Context a;

    public i(String str, String str2, String str3, Context context) {
        super(str, str2, str3);
        this.a = context;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, g5o0<AccountIcon> g5o0Var) {
        if (responseErrorCode == null) {
            as.b("[AccountSDK]AccountGetChannelTaskApiCall", "response is null.", true);
            g5o0Var.a(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            as.b("[AccountSDK]AccountGetChannelTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            g5o0Var.a(new ResolvableApiException(status));
            return;
        }
        as.b("[AccountSDK]AccountGetChannelTaskApiCall", "ResponseErrorCode.status:" + responseErrorCode.getErrorCode(), true);
        AccountIcon accountIcon = new AccountIcon();
        if (TextUtils.isEmpty(str)) {
            as.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, response is null, failed", true);
            g5o0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
            return;
        }
        if ("{}".equals(str)) {
            as.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, body is null", true);
            g5o0Var.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        try {
            GetChannelResult fromJson = new GetChannelResult().fromJson(str);
            if (!fromJson.isSuccess()) {
                as.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel failed", true);
                g5o0Var.a(new ApiException(fromJson.getStatus()));
                return;
            }
            as.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel success", true);
            accountIcon.setDescription(fromJson.getDescription());
            accountIcon.setIcon(a(fromJson.getIcon()));
            g5o0Var.b(accountIcon);
            long a = ao.a();
            SharedPreferences.Editor edit = Preference.h(this.a, 0, "ACCOUNT_CHANNEL_CACHE").edit();
            edit.putLong("cache_time", a);
            edit.putString(CampaignEx.JSON_KEY_DESC, fromJson.getDescription());
            edit.putString("icon", fromJson.getIcon());
            edit.apply();
        } catch (JSONException unused) {
            as.c("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, but parser json exception", true);
            g5o0Var.a(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 10;
    }

    private Bitmap a(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            as.d("[AccountSDK]AccountGetChannelTaskApiCall", "stringToBitmap Exception is ".concat(e.getClass().getSimpleName()), true);
            return null;
        } catch (OutOfMemoryError unused) {
            as.d("[AccountSDK]AccountGetChannelTaskApiCall", "out of memory error ", true);
            return null;
        }
    }
}
