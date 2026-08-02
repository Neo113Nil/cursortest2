package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zk9 implements Comparable {
    public static final zk9 c;
    public static final zk9 d;
    public static final zk9 e;
    public static final zk9 f;
    public static final zk9 g;
    public static final zk9 h;
    public static final zk9 i;
    public static final zk9 j;
    public static final zk9 k;
    public static final zk9 l;
    public static final zk9 m;
    public static final zk9 n;
    public static final List o;
    public static final LinkedHashMap p;
    public final int a;
    public final String b;

    static {
        zk9 zk9Var = new zk9(100, "Continue");
        zk9 zk9Var2 = new zk9(101, "Switching Protocols");
        zk9 zk9Var3 = new zk9(102, "Processing");
        zk9 zk9Var4 = new zk9(200, Payload.RESPONSE_OK);
        c = zk9Var4;
        zk9 zk9Var5 = new zk9(201, "Created");
        zk9 zk9Var6 = new zk9(202, "Accepted");
        zk9 zk9Var7 = new zk9(203, "Non-Authoritative Information");
        zk9 zk9Var8 = new zk9(204, "No Content");
        d = zk9Var8;
        zk9 zk9Var9 = new zk9(205, "Reset Content");
        zk9 zk9Var10 = new zk9(206, "Partial Content");
        zk9 zk9Var11 = new zk9(207, "Multi-Status");
        zk9 zk9Var12 = new zk9(300, "Multiple Choices");
        zk9 zk9Var13 = new zk9(Sdk.SDKError.Reason.MRAID_ERROR_VALUE, "Moved Permanently");
        e = zk9Var13;
        zk9 zk9Var14 = new zk9(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, "Found");
        f = zk9Var14;
        zk9 zk9Var15 = new zk9(303, "See Other");
        g = zk9Var15;
        zk9 zk9Var16 = new zk9(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, "Not Modified");
        h = zk9Var16;
        zk9 zk9Var17 = new zk9(Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, "Use Proxy");
        zk9 zk9Var18 = new zk9(306, "Switch Proxy");
        zk9 zk9Var19 = new zk9(Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE, "Temporary Redirect");
        i = zk9Var19;
        zk9 zk9Var20 = new zk9(Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, "Permanent Redirect");
        j = zk9Var20;
        zk9 zk9Var21 = new zk9(400, "Bad Request");
        k = zk9Var21;
        zk9 zk9Var22 = new zk9(401, "Unauthorized");
        zk9 zk9Var23 = new zk9(TTAdConstant.AD_ID_IS_NULL_CODE, "Payment Required");
        zk9 zk9Var24 = new zk9(403, "Forbidden");
        zk9 zk9Var25 = new zk9(404, "Not Found");
        l = zk9Var25;
        zk9 zk9Var26 = new zk9(405, "Method Not Allowed");
        zk9 zk9Var27 = new zk9(406, "Not Acceptable");
        zk9 zk9Var28 = new zk9(407, "Proxy Authentication Required");
        zk9 zk9Var29 = new zk9(408, "Request Timeout");
        m = zk9Var29;
        zk9 zk9Var30 = new zk9(409, "Conflict");
        zk9 zk9Var31 = new zk9(410, "Gone");
        zk9 zk9Var32 = new zk9(411, "Length Required");
        zk9 zk9Var33 = new zk9(TTAdConstant.IMAGE_URL_CODE, "Precondition Failed");
        zk9 zk9Var34 = new zk9(TTAdConstant.VIDEO_INFO_CODE, "Payload Too Large");
        zk9 zk9Var35 = new zk9(TTAdConstant.VIDEO_URL_CODE, "Request-URI Too Long");
        zk9 zk9Var36 = new zk9(TTAdConstant.VIDEO_COVER_URL_CODE, "Unsupported Media Type");
        zk9 zk9Var37 = new zk9(TTAdConstant.PACKAGE_NAME_CODE, "Requested Range Not Satisfiable");
        zk9 zk9Var38 = new zk9(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, "Expectation Failed");
        zk9 zk9Var39 = new zk9(422, "Unprocessable Entity");
        zk9 zk9Var40 = new zk9(423, "Locked");
        zk9 zk9Var41 = new zk9(424, "Failed Dependency");
        zk9 zk9Var42 = new zk9(425, "Too Early");
        zk9 zk9Var43 = new zk9(426, "Upgrade Required");
        zk9 zk9Var44 = new zk9(CommonGatewayClient.CODE_TOO_MANY_REQUESTS, "Too Many Requests");
        n = zk9Var44;
        List j2 = b.j(zk9Var, zk9Var2, zk9Var3, zk9Var4, zk9Var5, zk9Var6, zk9Var7, zk9Var8, zk9Var9, zk9Var10, zk9Var11, zk9Var12, zk9Var13, zk9Var14, zk9Var15, zk9Var16, zk9Var17, zk9Var18, zk9Var19, zk9Var20, zk9Var21, zk9Var22, zk9Var23, zk9Var24, zk9Var25, zk9Var26, zk9Var27, zk9Var28, zk9Var29, zk9Var30, zk9Var31, zk9Var32, zk9Var33, zk9Var34, zk9Var35, zk9Var36, zk9Var37, zk9Var38, zk9Var39, zk9Var40, zk9Var41, zk9Var42, zk9Var43, zk9Var44, new zk9(431, "Request Header Fields Too Large"), new zk9(500, "Internal Server Error"), new zk9(501, "Not Implemented"), new zk9(502, "Bad Gateway"), new zk9(PglCryptUtils.COMPRESS_FAILED, "Service Unavailable"), new zk9(PglCryptUtils.BASE64_FAILED, "Gateway Timeout"), new zk9(505, "HTTP Version Not Supported"), new zk9(506, "Variant Also Negotiates"), new zk9(PglCryptUtils.UNKNOWN_ERR, "Insufficient Storage"));
        o = j2;
        int c2 = sub.c(k13.r(j2, 10));
        if (c2 < 16) {
            c2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
        for (Object obj : j2) {
            linkedHashMap.put(Integer.valueOf(((zk9) obj).a), obj);
        }
        p = linkedHashMap;
    }

    public zk9(int i2, String str) {
        this.a = i2;
        this.b = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zk9 zk9Var = (zk9) obj;
        zk9Var.getClass();
        return this.a - zk9Var.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zk9) && ((zk9) obj).a == this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return this.a + ' ' + this.b;
    }
}
