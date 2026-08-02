package com.unity3d.ads.core.extensions;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.adplayer.model.ErrorReason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"webResourceToErrorReason", "Lcom/unity3d/ads/adplayer/model/ErrorReason;", "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntExtensionKt {
    @NotNull
    public static final ErrorReason webResourceToErrorReason(int i) {
        switch (i) {
            case -16:
                return ErrorReason.REASON_WEB_ERROR_UNSAFE_RESOURCE;
            case -15:
                return ErrorReason.REASON_WEB_ERROR_TOO_MANY_REQUESTS;
            case -14:
                return ErrorReason.REASON_WEB_ERROR_FILE_NOT_FOUND;
            case -13:
                return ErrorReason.REASON_WEB_ERROR_FILE;
            case -12:
                return ErrorReason.REASON_WEB_ERROR_BAD_URL;
            case -11:
                return ErrorReason.REASON_WEB_ERROR_FAILED_SSL_HANDSHAKE;
            case -10:
                return ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_SCHEME;
            case -9:
                return ErrorReason.REASON_WEB_ERROR_REDIRECT_LOOP;
            case -8:
                return ErrorReason.REASON_WEB_ERROR_TIMEOUT;
            case -7:
                return ErrorReason.REASON_WEB_ERROR_IO;
            case -6:
                return ErrorReason.REASON_WEB_ERROR_CONNECT;
            case C.RESULT_FORMAT_READ /* -5 */:
                return ErrorReason.REASON_WEB_ERROR_PROXY_AUTHENTICATION;
            case C.RESULT_BUFFER_READ /* -4 */:
                return ErrorReason.REASON_WEB_ERROR_AUTHENTICATION;
            case -3:
                return ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_AUTH_SCHEME;
            case -2:
                return ErrorReason.REASON_WEB_ERROR_HOST_LOOKUP;
            case -1:
                return ErrorReason.REASON_WEB_ERROR_UNKNOWN;
            default:
                return ErrorReason.REASON_UNKNOWN;
        }
    }
}
