package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: OperatorEnMethod.java */
/* loaded from: classes13.dex */
public class g {
    private int[] a = {99, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 123, 242, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 111, 197, 48, 1, 103, 43, 254, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 171, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 202, 130, 201, 125, 250, 89, 71, PsExtractor.VIDEO_STREAM_MASK, 173, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 162, 175, 156, 164, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, PsExtractor.AUDIO_STREAM, 183, 253, 147, 38, 54, 63, 247, 204, 52, 165, 229, 241, 113, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 39, 178, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 9, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 44, 26, 27, 110, 90, 160, 82, 59, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 179, 41, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 47, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 83, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 0, 237, 32, 252, 177, 91, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, 203, 190, 57, 74, 76, 88, 207, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 239, 170, 251, 67, 77, 51, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 69, 249, 2, 127, 80, 60, 159, 168, 81, 163, 64, 143, 146, 157, 56, 245, 188, 182, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 33, 16, 255, 243, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 205, 12, 19, 236, 95, 151, 68, 23, 196, 167, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 61, 100, 93, 25, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 96, 129, 79, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 34, 42, 144, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 70, 238, 184, 20, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 94, 11, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 224, 50, 58, 10, 73, 6, 36, 92, 194, 211, 172, 98, 145, 149, 228, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 231, 200, 55, 109, 141, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 78, 169, 108, 86, 244, 234, 101, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 174, 8, 186, 120, 37, 46, 28, 166, 180, 198, 232, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 116, 31, 75, PsExtractor.PRIVATE_STREAM_1, 139, 138, 112, 62, 181, 102, 72, 3, 246, 14, 97, 53, 87, 185, 134, 193, 29, 158, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 248, 152, 17, 105, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 142, 148, 155, 30, 135, 233, 206, 85, 40, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, VersionConstants.PRODUCT_MAJOR_VERSION, 161, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 13, 191, 230, 66, 104, 65, 153, 45, 15, 176, 84, 187, 22};
    private byte[][] b;

    public g(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("886"))) {
            return a(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("887"))) {
            return f(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("888"))) {
            return e(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("889"))) {
            return h(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("890"))) {
            return b(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("891"))) {
            return c(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("892"))) {
            return i(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("893"))) {
            return g(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("894"))) {
            return d(obj, list);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] decode = Base64.decode(obj.toString(), 10);
        if (decode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (decode.length > 16) {
            decode = Arrays.copyOf(decode, 16);
        }
        int parseInt = Integer.parseInt(list.get(0).toString()) % 8;
        for (int i = 0; i < 16; i++) {
            int i2 = decode[i] & 255;
            decode[i] = (byte) ((i2 >>> (8 - parseInt)) | (i2 << parseInt));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(decode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] decode = Base64.decode(obj.toString(), 10);
        if (decode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (decode.length > 16) {
            decode = Arrays.copyOf(decode, 16);
        }
        int parseInt = ((Integer.parseInt(list.get(0).toString()) % 128) * 2) + 1;
        for (int i = 0; i < 16; i++) {
            decode[i] = (byte) (decode[i] * parseInt);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(decode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] decode = Base64.decode(obj.toString(), 10);
        if (decode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (decode.length > 16) {
            decode = Arrays.copyOf(decode, 16);
        }
        int parseInt = Integer.parseInt(list.get(0).toString()) % 16;
        if (parseInt > 0) {
            byte[] copyOf = Arrays.copyOf(decode, 16);
            for (int i = 0; i < 16; i++) {
                decode[i] = copyOf[(i + parseInt) % 16];
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(decode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] decode = Base64.decode(obj.toString(), 10);
        if (decode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (decode.length > 16) {
            decode = Arrays.copyOf(decode, 16);
        }
        for (int i = 0; i < 16; i++) {
            decode[i] = (byte) this.a[decode[i] & 255];
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(decode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null) {
            if (list.size() == 1) {
                byte[] decode = Base64.decode(obj.toString(), 10);
                if (decode.length < 16) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
                }
                if (decode.length > 16) {
                    decode = Arrays.copyOf(decode, 16);
                }
                int parseInt = Integer.parseInt(list.get(0).toString()) % 16;
                int i = parseInt != 0 ? parseInt : 1;
                for (int i2 = 0; i2 < 16; i2 += 2) {
                    int i3 = (i2 + i) % 16;
                    byte b = decode[i2];
                    decode[i2] = decode[i3];
                    decode[i3] = b;
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(decode, 10));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] decode = Base64.decode(obj.toString(), 10);
        if (decode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (decode.length > 16) {
            decode = Arrays.copyOf(decode, 16);
        }
        for (int i = 0; i < 16; i++) {
            decode[i] = (byte) (decode[i] ^ ((byte) Integer.parseInt(list.get(0).toString())));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(decode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a i(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] decode = Base64.decode(obj.toString(), 10);
        if (decode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (decode.length > 16) {
            decode = Arrays.copyOf(decode, 16);
        }
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            decode[i] = (byte) (decode[i] ^ decode[i2 % 16]);
            i = i2;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(decode, 10));
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : b(str) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private void a(String str) {
        this.b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 16, 16);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i = 0; i < 16; i++) {
                System.arraycopy(messageDigest.digest((str + "_round_" + i).getBytes(StandardCharsets.UTF_8)), 0, this.b[i], 0, 16);
            }
        } catch (Exception e) {
            q0.b("OperatorEnMethod", e.getMessage());
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null && list.size() == 1) {
            String obj2 = obj.toString();
            byte[] decode = Base64.decode(obj2, 10);
            if (decode.length < 16) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            if (decode.length > 16) {
                decode = Arrays.copyOf(decode, 16);
            }
            a(obj2);
            byte[] bArr = this.b[Integer.parseInt(list.get(0).toString()) % 16];
            for (int i = 0; i < 16; i++) {
                decode[i] = (byte) (decode[i] ^ bArr[i]);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(decode, 10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null && list.size() == 1) {
            byte[] decode = Base64.decode(obj.toString(), 10);
            if (decode.length < 16) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            if (decode.length > 16) {
                decode = Arrays.copyOf(decode, 16);
            }
            for (int i = 0; i < 16; i++) {
                decode[i] = (byte) (Integer.parseInt(list.get(0).toString()) + decode[i]);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(decode, 10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private boolean b(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("886")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("887")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("888")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("889")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("890")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("891")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("892")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("893")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("894"));
    }
}
