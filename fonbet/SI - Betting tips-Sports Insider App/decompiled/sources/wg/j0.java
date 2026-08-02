package wg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j0 extends com.logrocket.protobuf.z {
    public static final int APPINFO_FIELD_NUMBER = 18;
    public static final int BROWSERINFO_FIELD_NUMBER = 3;
    public static final int CITY_FIELD_NUMBER = 8;
    public static final int COUNTRY_FIELD_NUMBER = 6;
    private static final j0 DEFAULT_INSTANCE;
    public static final int DEVICEINFO_FIELD_NUMBER = 16;
    public static final int INITIALPAGELOADMETRICS_FIELD_NUMBER = 15;
    public static final int IP_FIELD_NUMBER = 11;
    public static final int ISINACTIVE_FIELD_NUMBER = 12;
    public static final int LATITUDE_FIELD_NUMBER = 9;
    public static final int LONGITUDE_FIELD_NUMBER = 10;
    public static final int OUTSIDEINTEGRATIONS_FIELD_NUMBER = 13;
    private static volatile y0 PARSER = null;
    public static final int REGION_FIELD_NUMBER = 7;
    public static final int RELEASE_FIELD_NUMBER = 1;
    public static final int REPLAYTYPE_FIELD_NUMBER = 19;
    public static final int SCRIPTSRC_FIELD_NUMBER = 17;
    public static final int SCRIPTVERSION_FIELD_NUMBER = 5;
    public static final int SDKOPTIONS_FIELD_NUMBER = 20;
    public static final int SDKSTATE_FIELD_NUMBER = 21;
    public static final int SDKVERSION_FIELD_NUMBER = 4;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private y appInfo_;
    private w initialPageLoadMetrics_;
    private boolean isInactive_;
    private float latitude_;
    private float longitude_;
    private d0 outsideIntegrations_;
    private Object platform_;
    private int replayType_;
    private e0 sdkOptions_;
    private i0 sdkState_;
    private int platformCase_ = 0;
    private String release_ = "";
    private String username_ = "";
    private String sdkVersion_ = "";
    private String scriptVersion_ = "";
    private String country_ = "";
    private String region_ = "";
    private String city_ = "";
    private String ip_ = "";
    private String scriptSrc_ = "";

    static {
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        com.logrocket.protobuf.z.n(j0.class, j0Var);
    }

    public static void p(j0 j0Var) {
        int i5;
        j0Var.getClass();
        switch (3) {
            case 1:
                i5 = 0;
                break;
            case 2:
                i5 = 1;
                break;
            case 3:
                i5 = 2;
                break;
            case 4:
                i5 = 3;
                break;
            case 5:
                i5 = 4;
                break;
            case 6:
                i5 = -1;
                break;
            default:
                throw null;
        }
        j0Var.replayType_ = i5;
    }

    public static void q(j0 j0Var, String str) {
        j0Var.getClass();
        str.getClass();
        j0Var.release_ = str;
    }

    public static void r(j0 j0Var, y yVar) {
        j0Var.getClass();
        j0Var.appInfo_ = yVar;
    }

    public static void s(j0 j0Var, c0 c0Var) {
        j0Var.getClass();
        j0Var.platform_ = c0Var;
        j0Var.platformCase_ = 16;
    }

    public static void t(j0 j0Var, i0 i0Var) {
        j0Var.getClass();
        j0Var.sdkState_ = i0Var;
    }

    public static void u(j0 j0Var) {
        j0Var.getClass();
        j0Var.sdkVersion_ = "1.57.4";
    }

    public static a0 w() {
        return (a0) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new j0();
            case 2:
                return new a0(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0000\u0001\u0015\u0014\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\t\u0001\n\u0001\u000bȈ\f\u0007\r\t\u000f\t\u0010<\u0000\u0011Ȉ\u0012\t\u0013\f\u0014\t\u0015\t", new Object[]{"platform_", "platformCase_", "release_", "username_", z.class, "sdkVersion_", "scriptVersion_", "country_", "region_", "city_", "latitude_", "longitude_", "ip_", "isInactive_", "outsideIntegrations_", "initialPageLoadMetrics_", c0.class, "scriptSrc_", "appInfo_", "replayType_", "sdkOptions_", "sdkState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (j0.class) {
                    try {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new com.logrocket.protobuf.y();
                            PARSER = y0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return y0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String v() {
        return this.release_;
    }
}
