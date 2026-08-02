package com.unity3d.ads.core.extensions;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: ErrorExtensions.kt */
/* loaded from: classes14.dex */
public final class ErrorExtensionsKt {
    public static final ByteString getErrorTokenOrNull(ErrorOuterClass.Error error) {
        if (error.getErrorToken().isEmpty()) {
            return null;
        }
        return error.getErrorToken();
    }
}
