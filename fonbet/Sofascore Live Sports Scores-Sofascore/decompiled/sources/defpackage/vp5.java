package defpackage;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class vp5 {
    public static final int[] a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    public static final int[][] b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, ModuleDescriptor.MODULE_VERSION, 166, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 248, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, 255, 110, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 97, 178, 100, 242}, new int[]{156, 97, PsExtractor.AUDIO_STREAM, 252, 95, 9, 157, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 138, 45, 18, 186, 83, ModuleDescriptor.MODULE_VERSION}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 109, 129, 94, 254, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 155, 21, 5, 172, 254, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 17, 138, 110, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 141, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 120, 151, 233, 168, 93, 255}, new int[]{245, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 242, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 130, 250, 162, 181, 102, 120, 84, 179, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 95, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 44, 175, 184, 59, 25, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 98, 81, 112}, new int[]{77, 193, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 31, 19, 38, 22, 153, 247, 105, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 2, 245, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 242, 8, 175, 95, 100, 9, 167, 105, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 111, 57, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 5, 9, 5}, new int[]{245, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 172, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 96, 32, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 22, 238, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 23, 37, 90, 170, 205, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 92, 253, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 19}, new int[]{175, 9, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 238, 12, 17, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 100, 29, 175, 170, 230, PsExtractor.AUDIO_STREAM, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 235, 150, 159, 36, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 38, 200, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 54, 228, 146, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 234, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 203, 29, 232, 144, 238, 22, 150, 201, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 62, 207, 164, 13, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 245, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 39, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 202, 188, 201, PsExtractor.PRIVATE_STREAM_1, 143, 108, 196, 37, ModuleDescriptor.MODULE_VERSION, 112, 134, 230, 245, 63, 197, 190, 250, 106, ModuleDescriptor.MODULE_VERSION, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 175, 64, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 71, 161, 44, 147, 6, 27, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 86, 47, 11, 204}, new int[]{Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 228, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 248, 180, 234, 197, 158, 177, 68, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 93, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 15, 160, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 236, 66, 139, 153, ModuleDescriptor.MODULE_VERSION, 202, 167, 179, 25, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 232, 96, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 231, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, PsExtractor.PRIVATE_STREAM_1, 64, 54, 108, 153, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 63, 96, 103, 82, 186}};
    public static final int[] c = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    public static final int[] d = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            d[i2] = i;
            c[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
            }
        }
    }

    public static String a(int i, String str) {
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= 16) {
                i4 = -1;
                break;
            }
            if (a[i4] == i) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            a70.p("Illegal number of error correction codewords specified: ".concat(String.valueOf(i)));
            return null;
        }
        int[] iArr3 = b[i4];
        char[] cArr = new char[i];
        for (int i5 = 0; i5 < i; i5++) {
            cArr[i5] = 0;
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = i - 1;
            int charAt = cArr[i7] ^ str.charAt(i6);
            while (true) {
                iArr = c;
                iArr2 = d;
                if (i7 <= 0) {
                    break;
                }
                if (charAt == 0 || (i3 = iArr3[i7]) == 0) {
                    cArr[i7] = cArr[i7 - 1];
                } else {
                    cArr[i7] = (char) (iArr2[(iArr[charAt] + iArr[i3]) % 255] ^ cArr[i7 - 1]);
                }
                i7--;
            }
            if (charAt == 0 || (i2 = iArr3[0]) == 0) {
                cArr[0] = 0;
            } else {
                cArr[0] = (char) iArr2[(iArr[charAt] + iArr[i2]) % 255];
            }
        }
        char[] cArr2 = new char[i];
        for (int i8 = 0; i8 < i; i8++) {
            cArr2[i8] = cArr[(i - i8) - 1];
        }
        return String.valueOf(cArr2);
    }
}
