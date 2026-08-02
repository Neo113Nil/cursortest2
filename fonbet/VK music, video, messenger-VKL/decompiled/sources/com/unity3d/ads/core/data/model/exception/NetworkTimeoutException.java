package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import xsna.zcl;

/* compiled from: NetworkTimeoutException.kt */
/* loaded from: classes14.dex */
public final class NetworkTimeoutException extends UnityAdsNetworkException {
    public /* synthetic */ NetworkTimeoutException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? OperationType.UNKNOWN : operationType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str4);
    }

    public NetworkTimeoutException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4) {
        super(str, operationType, num, str2, str3, num2, str4);
    }
}
