package com.socure.idplus.device;

import android.util.Log;
import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b implements SessionTokenCallback {
    @Override // com.socure.idplus.device.callback.SessionTokenCallback
    public final void onComplete(String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter("SigmaDevice", "tag");
        Intrinsics.checkNotNullParameter("onComplete", "msg");
        int ordinal = com.socure.idplus.device.internal.logger.a.f870a.ordinal();
        if (ordinal == 0) {
            Log.e("SigmaDevice", "onComplete");
        } else {
            if (ordinal != 1) {
                return;
            }
            Log.i("SigmaDevice", "onComplete");
        }
    }

    @Override // com.socure.idplus.device.callback.DeviceIntelligenceCallback
    public final void onError(SigmaDeviceError errorType, String str) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        SigmaDevice.access$reset(SigmaDevice.INSTANCE);
    }
}
