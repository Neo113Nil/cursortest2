package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.chromium.net.NetError;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import xsna.cq;
import xsna.y2r0;

/* loaded from: classes12.dex */
public class PlaybackException extends Exception {
    public final int errorCode;
    public final Bundle extras;
    public final long timestampMs;

    static {
        cq.h(0, 1, 2, 3, 4);
        y2r0.L(5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackException(@Nullable String str, @Nullable Throwable th, int i, long j) {
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        this.errorCode = i;
        this.extras = bundle;
        this.timestampMs = j;
    }

    public final String d() {
        int i = this.errorCode;
        if (i == -100) {
            return "ERROR_CODE_DISCONNECTED";
        }
        if (i == -6) {
            return "ERROR_CODE_NOT_SUPPORTED";
        }
        if (i == -4) {
            return "ERROR_CODE_PERMISSION_DENIED";
        }
        if (i == -3) {
            return "ERROR_CODE_BAD_VALUE";
        }
        if (i == -2) {
            return "ERROR_CODE_INVALID_STATE";
        }
        if (i == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i == 7001) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        switch (i) {
            case NetError.ERR_SSL_CLIENT_AUTH_CERT_NEEDED /* -110 */:
                return "ERROR_CODE_CONTENT_ALREADY_PLAYING";
            case NetError.ERR_ADDRESS_UNREACHABLE /* -109 */:
                return "ERROR_CODE_END_OF_PLAYLIST";
            case NetError.ERR_ADDRESS_INVALID /* -108 */:
                return "ERROR_CODE_SETUP_REQUIRED";
            case NetError.ERR_SSL_PROTOCOL_ERROR /* -107 */:
                return "ERROR_CODE_SKIP_LIMIT_REACHED";
            case NetError.ERR_INTERNET_DISCONNECTED /* -106 */:
                return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
            case NetError.ERR_NAME_NOT_RESOLVED /* -105 */:
                return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
            case NetError.ERR_CONNECTION_FAILED /* -104 */:
                return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
            case NetError.ERR_CONNECTION_ABORTED /* -103 */:
                return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
            case NetError.ERR_CONNECTION_REFUSED /* -102 */:
                return "ERROR_CODE_AUTHENTICATION_EXPIRED";
            default:
                switch (i) {
                    case 1000:
                        return "ERROR_CODE_UNSPECIFIED";
                    case 1001:
                        return "ERROR_CODE_REMOTE_ERROR";
                    case 1002:
                        return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    case 1003:
                        return "ERROR_CODE_TIMEOUT";
                    case 1004:
                        return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    default:
                        switch (i) {
                            case 2000:
                                return "ERROR_CODE_IO_UNSPECIFIED";
                            case 2001:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            case 2002:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            case 2003:
                                return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            case 2004:
                                return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            case 2005:
                                return "ERROR_CODE_IO_FILE_NOT_FOUND";
                            case 2006:
                                return "ERROR_CODE_IO_NO_PERMISSION";
                            case 2007:
                                return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            case 2008:
                                return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            default:
                                switch (i) {
                                    case 3001:
                                        return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    case 3002:
                                        return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    case BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE:
                                        return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    case 3004:
                                        return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    default:
                                        switch (i) {
                                            case 4001:
                                                return "ERROR_CODE_DECODER_INIT_FAILED";
                                            case 4002:
                                                return "ERROR_CODE_DECODER_QUERY_FAILED";
                                            case 4003:
                                                return "ERROR_CODE_DECODING_FAILED";
                                            case 4004:
                                                return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            case 4005:
                                                return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            case 4006:
                                                return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                            default:
                                                switch (i) {
                                                    case IronSourceConstants.errorCode_biddingDataException /* 5001 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                    case IronSourceConstants.errorCode_isReadyException /* 5002 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                    case IronSourceConstants.errorCode_loadInProgress /* 5003 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                    case IronSourceConstants.errorCode_showInProgress /* 5004 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                    default:
                                                        switch (i) {
                                                            case RtpSenderHelper.AUDIO_BITRATE_MIN /* 6000 */:
                                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                                            case AuthCode.StatusCode.WAITING_CONNECT /* 6001 */:
                                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                            case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                            case AuthCode.StatusCode.CERT_FINGERPRINT_ERROR /* 6003 */:
                                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                            case AuthCode.StatusCode.PERMISSION_NOT_EXIST /* 6004 */:
                                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                            case AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED /* 6005 */:
                                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                            case AuthCode.StatusCode.PERMISSION_EXPIRED /* 6006 */:
                                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                            case 6007:
                                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                            case 6008:
                                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                            default:
                                                                return i >= 1000000 ? "custom error code" : "invalid error code";
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
