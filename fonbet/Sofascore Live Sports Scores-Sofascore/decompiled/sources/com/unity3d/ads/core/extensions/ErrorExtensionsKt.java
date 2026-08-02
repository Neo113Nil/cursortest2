package com.unity3d.ads.core.extensions;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getErrorTokenOrNull", "Lcom/google/protobuf/ByteString;", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ErrorExtensionsKt {
    @Nullable
    public static final ByteString getErrorTokenOrNull(@NotNull ErrorOuterClass.Error error) {
        error.getClass();
        if (error.getErrorToken().isEmpty()) {
            return null;
        }
        return error.getErrorToken();
    }
}
