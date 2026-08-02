package com.socure.idplus.device.callback;

import com.socure.idplus.device.error.SigmaDeviceError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/socure/idplus/device/callback/DeviceIntelligenceCallback;", "", "onError", "", "errorType", "Lcom/socure/idplus/device/error/SigmaDeviceError;", "errorMessage", "", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DeviceIntelligenceCallback {
    void onError(SigmaDeviceError errorType, String errorMessage);
}
