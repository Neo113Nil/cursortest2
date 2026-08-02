package com.inmobi.media;

import android.util.SparseArray;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.kp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3489i6 {
    public static final C3437g6 b;
    public static final SparseArray c;
    public static final EnumC3489i6 d;
    public static final EnumC3489i6 e;
    public static final EnumC3489i6 f;
    public static final EnumC3489i6 g;
    public static final EnumC3489i6 h;
    public static final EnumC3489i6 i;
    public static final EnumC3489i6 j;
    public static final EnumC3489i6 k;
    public static final EnumC3489i6 l;
    public static final EnumC3489i6 m;
    public static final EnumC3489i6 n;
    public static final EnumC3489i6 o;
    public static final EnumC3489i6 p;
    public static final EnumC3489i6 q;
    public static final EnumC3489i6 r;
    public static final EnumC3489i6 s;
    public static final EnumC3489i6 t;
    public static final /* synthetic */ EnumC3489i6[] u;
    public final int a;

    static {
        EnumC3489i6 enumC3489i6 = new EnumC3489i6(0, 0, "NETWORK_UNAVAILABLE_ERROR");
        EnumC3489i6 enumC3489i62 = new EnumC3489i6(1, 199, "UNKNOWN_ERROR");
        d = enumC3489i62;
        EnumC3489i6 enumC3489i63 = new EnumC3489i6(2, 198, "NETWORK_IO_ERROR");
        e = enumC3489i63;
        EnumC3489i6 enumC3489i64 = new EnumC3489i6(3, 197, "OUT_OF_MEMORY_ERROR");
        EnumC3489i6 enumC3489i65 = new EnumC3489i6(4, 196, "INVALID_ENCRYPTED_RESPONSE_RECEIVED");
        EnumC3489i6 enumC3489i66 = new EnumC3489i6(5, 195, "RESPONSE_EXCEEDS_SPECIFIED_SIZE_LIMIT");
        EnumC3489i6 enumC3489i67 = new EnumC3489i6(6, 194, "GZIP_DECOMPRESSION_FAILED");
        EnumC3489i6 enumC3489i68 = new EnumC3489i6(7, 193, "BAD_REQUEST");
        f = enumC3489i68;
        EnumC3489i6 enumC3489i69 = new EnumC3489i6(8, PsExtractor.AUDIO_STREAM, "GDPR_COMPLIANCE_ENFORCED");
        EnumC3489i6 enumC3489i610 = new EnumC3489i6(9, 191, "GENERIC_HTTP_2XX");
        g = enumC3489i610;
        EnumC3489i6 enumC3489i611 = new EnumC3489i6(10, 190, "RESPONSE_PARSING_ERROR");
        EnumC3489i6 enumC3489i612 = new EnumC3489i6(11, PsExtractor.PRIVATE_STREAM_1, "RETRY_ATTEMPTED");
        EnumC3489i6 enumC3489i613 = new EnumC3489i6(12, 188, "NETWORK_UNAVAILABLE_CONTEXT_LOSS");
        h = enumC3489i613;
        EnumC3489i6 enumC3489i614 = new EnumC3489i6(13, 187, "NETWORK_UNAVAILABLE_IDLE_MODE");
        i = enumC3489i614;
        EnumC3489i6 enumC3489i615 = new EnumC3489i6(14, 186, "NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE");
        j = enumC3489i615;
        EnumC3489i6 enumC3489i616 = new EnumC3489i6(15, ModuleDescriptor.MODULE_VERSION, "NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M");
        k = enumC3489i616;
        EnumC3489i6 enumC3489i617 = new EnumC3489i6(16, 184, "NETWORK_UNAVAILABLE_EXCEPTION");
        l = enumC3489i617;
        EnumC3489i6 enumC3489i618 = new EnumC3489i6(17, 183, "NETWORK_PREPARE_FAIL");
        m = enumC3489i618;
        EnumC3489i6 enumC3489i619 = new EnumC3489i6(18, 181, "NETWORK_REQUEST_GENERIC_DROPPED_BY_INTERCEPTOR");
        EnumC3489i6 enumC3489i620 = new EnumC3489i6(19, 180, "NETWORK_REQUEST_CANCELLED");
        n = enumC3489i620;
        EnumC3489i6 enumC3489i621 = new EnumC3489i6(20, 179, "NETWORK_REQUEST_EXCEPTION");
        EnumC3489i6 enumC3489i622 = new EnumC3489i6(21, 182, "NETWORK_UNAVAILABLE_CUSTOM_VALIDATOR");
        o = enumC3489i622;
        EnumC3489i6 enumC3489i623 = new EnumC3489i6(22, 178, "NETWORK_REDIRECT_MALFORMED");
        p = enumC3489i623;
        EnumC3489i6 enumC3489i624 = new EnumC3489i6(23, 177, "NO_SUCH_ELEMENT_EXCEPTION");
        q = enumC3489i624;
        EnumC3489i6 enumC3489i625 = new EnumC3489i6(24, 176, "COROUTINE_TIMEOUT");
        r = enumC3489i625;
        EnumC3489i6 enumC3489i626 = new EnumC3489i6(25, 175, "INVALID_URL");
        s = enumC3489i626;
        EnumC3489i6 enumC3489i627 = new EnumC3489i6(26, 204, "HTTP_NO_CONTENT");
        EnumC3489i6 enumC3489i628 = new EnumC3489i6(27, Sdk.SDKError.Reason.AD_EXPIRED_VALUE, "HTTP_NOT_MODIFIED");
        EnumC3489i6 enumC3489i629 = new EnumC3489i6(28, 303, "HTTP_SEE_OTHER");
        EnumC3489i6 enumC3489i630 = new EnumC3489i6(29, 404, "HTTP_SERVER_NOT_FOUND");
        EnumC3489i6 enumC3489i631 = new EnumC3489i6(30, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, "HTTP_MOVED_TEMP");
        EnumC3489i6 enumC3489i632 = new EnumC3489i6(31, 500, "HTTP_INTERNAL_SERVER_ERROR");
        EnumC3489i6 enumC3489i633 = new EnumC3489i6(32, 501, "HTTP_NOT_IMPLEMENTED");
        EnumC3489i6 enumC3489i634 = new EnumC3489i6(33, 502, "HTTP_BAD_GATEWAY");
        EnumC3489i6 enumC3489i635 = new EnumC3489i6(34, PglCryptUtils.COMPRESS_FAILED, "HTTP_SERVER_NOT_AVAILABLE");
        EnumC3489i6 enumC3489i636 = new EnumC3489i6(35, PglCryptUtils.BASE64_FAILED, "HTTP_GATEWAY_TIMEOUT");
        t = enumC3489i636;
        EnumC3489i6[] enumC3489i6Arr = {enumC3489i6, enumC3489i62, enumC3489i63, enumC3489i64, enumC3489i65, enumC3489i66, enumC3489i67, enumC3489i68, enumC3489i69, enumC3489i610, enumC3489i611, enumC3489i612, enumC3489i613, enumC3489i614, enumC3489i615, enumC3489i616, enumC3489i617, enumC3489i618, enumC3489i619, enumC3489i620, enumC3489i621, enumC3489i622, enumC3489i623, enumC3489i624, enumC3489i625, enumC3489i626, enumC3489i627, enumC3489i628, enumC3489i629, enumC3489i630, enumC3489i631, enumC3489i632, enumC3489i633, enumC3489i634, enumC3489i635, enumC3489i636, new EnumC3489i6(36, 505, "HTTP_VERSION_NOT_SUPPORTED"), new EnumC3489i6(37, 401, "HTTP_UNAUTHORISED"), new EnumC3489i6(38, CommonGatewayClient.CODE_599, "SERVER_ERROR_END_CODE")};
        u = enumC3489i6Arr;
        kp5<EnumC3489i6> kp5Var = new kp5(enumC3489i6Arr);
        b = new C3437g6();
        c = new SparseArray();
        for (EnumC3489i6 enumC3489i637 : kp5Var) {
            c.put(enumC3489i637.a, enumC3489i637);
        }
    }

    public EnumC3489i6(int i2, int i3, String str) {
        this.a = i3;
    }

    public static EnumC3489i6 valueOf(String str) {
        return (EnumC3489i6) Enum.valueOf(EnumC3489i6.class, str);
    }

    public static EnumC3489i6[] values() {
        return (EnumC3489i6[]) u.clone();
    }
}
