package com.playtika.pras.e;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.playtika.pras.sdk.network.models.DeviceInfo;
import com.playtika.pras.sdk.network.models.PrasSdkRequestParams;

/* loaded from: classes4.dex */
public abstract class m {
    public static Intent a(Context context, Class cls, PrasSdkRequestParams prasSdkRequestParams, String str, DeviceInfo deviceInfo) {
        Intent intent = new Intent(context, (Class<?>) cls);
        Bundle bundle = new Bundle();
        bundle.putParcelable("widget_params_purchase_request_extra_params", prasSdkRequestParams);
        intent.putExtra("widget_params_purchase_request_extra_params_bundle", bundle);
        intent.putExtra("widget_params_stage_name", str);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("widget_params_device_info", deviceInfo);
        intent.putExtra("widget_params_device_info_bundle", bundle2);
        return intent;
    }
}
