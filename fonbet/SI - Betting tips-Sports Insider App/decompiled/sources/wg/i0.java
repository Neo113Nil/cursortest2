package wg;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i0 extends com.logrocket.protobuf.z {
    public static final int CONFIG_FIELD_NUMBER = 1;
    private static final i0 DEFAULT_INSTANCE;
    public static final int ISCROSSDOMAINIFRAME_FIELD_NUMBER = 3;
    public static final int ISIFRAME_FIELD_NUMBER = 2;
    public static final int ISWEBVIEW_FIELD_NUMBER = 9;
    public static final int LOADTIME_FIELD_NUMBER = 7;
    public static final int LOGS_FIELD_NUMBER = 8;
    public static final int ORIGINALSTARTTIME_FIELD_NUMBER = 6;
    private static volatile y0 PARSER = null;
    public static final int SKIPPEDEXISTINGPERSISTEDDATA_FIELD_NUMBER = 4;
    public static final int STARTTIME_FIELD_NUMBER = 5;
    private boolean isCrossDomainIframe_;
    private boolean isIframe_;
    private boolean isWebView_;
    private double loadTime_;
    private double originalStartTime_;
    private boolean skippedExistingPersistedData_;
    private double startTime_;
    private String config_ = "";
    private com.logrocket.protobuf.c0 logs_ = b1.f6669d;

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        com.logrocket.protobuf.z.n(i0.class, i0Var);
    }

    public static void p(i0 i0Var, String str) {
        i0Var.getClass();
        str.getClass();
        i0Var.config_ = str;
    }

    public static void q(i0 i0Var, List list) {
        com.logrocket.protobuf.c0 c0Var = i0Var.logs_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            i0Var.logs_ = com.logrocket.protobuf.z.m(c0Var);
        }
        com.logrocket.protobuf.a.a(list, i0Var.logs_);
    }

    public static f0 r() {
        return (f0) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new i0();
            case 2:
                return new f0(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0000\u0006\u0000\u0007\u0000\b\u001b\t\u0007", new Object[]{"config_", "isIframe_", "isCrossDomainIframe_", "skippedExistingPersistedData_", "startTime_", "originalStartTime_", "loadTime_", "logs_", h0.class, "isWebView_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (i0.class) {
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
}
