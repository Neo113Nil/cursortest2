package zg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.p0;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g extends z {
    public static final int BROWSERHREF_FIELD_NUMBER = 5;
    public static final int BROWSERUSERAGENT_FIELD_NUMBER = 6;
    public static final int CITY_FIELD_NUMBER = 16;
    public static final int COUNTRY_FIELD_NUMBER = 14;
    public static final int COUNT_FIELD_NUMBER = 19;
    public static final int DEBUGMODULES_FIELD_NUMBER = 22;
    private static final g DEFAULT_INSTANCE;
    public static final int ERRORTYPE_FIELD_NUMBER = 2;
    public static final int EXCEPTIONTYPE_FIELD_NUMBER = 1;
    public static final int EXTRA_FIELD_NUMBER = 12;
    public static final int FORCEINGEST_FIELD_NUMBER = 24;
    public static final int HASHCODE_FIELD_NUMBER = 20;
    public static final int IP_FIELD_NUMBER = 13;
    public static final int ISCRASH_FIELD_NUMBER = 23;
    public static final int LATITUDE_FIELD_NUMBER = 17;
    public static final int LEVEL_FIELD_NUMBER = 9;
    public static final int LOGGER_FIELD_NUMBER = 10;
    public static final int LONGITUDE_FIELD_NUMBER = 18;
    public static final int MESSAGEARGS_FIELD_NUMBER = 21;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    private static volatile y0 PARSER = null;
    public static final int REGION_FIELD_NUMBER = 15;
    public static final int RELEASE_FIELD_NUMBER = 4;
    public static final int TAGS_FIELD_NUMBER = 11;
    public static final int USEREMAIL_FIELD_NUMBER = 8;
    public static final int USERNAME_FIELD_NUMBER = 7;
    private String browserHref_;
    private String browserUseragent_;
    private String city_;
    private int count_;
    private String country_;
    private d debugModules_;
    private String errorType_;
    private int exceptionType_;
    private p0 extra_;
    private boolean forceIngest_;
    private String hashCode_;
    private String ip_;
    private boolean isCrash_;
    private float latitude_;
    private String level_;
    private String logger_;
    private float longitude_;
    private fh.c messageArgs_;
    private fh.c message_;
    private String region_;
    private String release_;
    private p0 tags_;
    private String userEmail_;
    private String userName_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        z.n(g.class, gVar);
    }

    public g() {
        p0 p0Var = p0.f6776b;
        this.tags_ = p0Var;
        this.extra_ = p0Var;
        this.errorType_ = "";
        this.release_ = "";
        this.browserHref_ = "";
        this.browserUseragent_ = "";
        this.userName_ = "";
        this.userEmail_ = "";
        this.level_ = "";
        this.logger_ = "";
        this.ip_ = "";
        this.country_ = "";
        this.region_ = "";
        this.city_ = "";
        this.hashCode_ = "";
    }

    public static void p(g gVar) {
        int i5;
        gVar.getClass();
        switch (5) {
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
                i5 = 5;
                break;
            case 7:
                i5 = -1;
                break;
            default:
                throw null;
        }
        gVar.exceptionType_ = i5;
    }

    public static void q(g gVar, fh.c cVar) {
        gVar.getClass();
        gVar.message_ = cVar;
    }

    public static void r(g gVar, String str) {
        gVar.getClass();
        gVar.errorType_ = str;
    }

    public static void s(g gVar, int i5) {
        gVar.count_ = i5;
    }

    public static void t(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.release_ = str;
    }

    public static void u(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.hashCode_ = str;
    }

    public static b v() {
        return (b) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25984a[v.f.d(i5)]) {
            case 1:
                return new g();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0018\u0000\u0000\u0001\u0018\u0018\u0002\u0000\u0000\u0001\f\u0002Ȉ\u0003\t\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000b2\f2\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011\u0001\u0012\u0001\u0013\u000b\u0014Ȉ\u0015\t\u0016\t\u0017\u0007\u0018\u0007", new Object[]{"exceptionType_", "errorType_", "message_", "release_", "browserHref_", "browserUseragent_", "userName_", "userEmail_", "level_", "logger_", "tags_", f.f25986a, "extra_", e.f25985a, "ip_", "country_", "region_", "city_", "latitude_", "longitude_", "count_", "hashCode_", "messageArgs_", "debugModules_", "isCrash_", "forceIngest_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (g.class) {
                    try {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new y();
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
}
