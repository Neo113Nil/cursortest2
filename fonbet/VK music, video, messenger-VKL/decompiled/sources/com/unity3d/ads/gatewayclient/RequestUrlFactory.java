package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;

/* compiled from: RequestUrlFactory.kt */
/* loaded from: classes14.dex */
public interface RequestUrlFactory {

    /* compiled from: RequestUrlFactory.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ String getRequestUrl$default(RequestUrlFactory requestUrlFactory, OperationType operationType, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequestUrl");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return requestUrlFactory.getRequestUrl(operationType, str);
        }
    }

    String getRequestUrl(OperationType operationType, String str);
}
