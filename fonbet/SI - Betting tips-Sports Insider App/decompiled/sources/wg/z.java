package wg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class z extends com.logrocket.protobuf.z {
    private static final z DEFAULT_INSTANCE;
    public static final int HREF_FIELD_NUMBER = 1;
    public static final int ISLOCALHOST_FIELD_NUMBER = 9;
    public static final int LANGUAGE_FIELD_NUMBER = 3;
    private static volatile y0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 5;
    public static final int REFERRER_FIELD_NUMBER = 8;
    public static final int USERAGENT_FIELD_NUMBER = 6;
    public static final int VERSION_FIELD_NUMBER = 7;
    private boolean isLocalhost_;
    private String href_ = "";
    private String language_ = "";
    private String platform_ = "";
    private String useragent_ = "";
    private String version_ = "";
    private String referrer_ = "";

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        com.logrocket.protobuf.z.n(z.class, zVar);
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new z();
            case 2:
                return new bh.f(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\t\u0007\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\t\u0007", new Object[]{"href_", "language_", "platform_", "useragent_", "version_", "referrer_", "isLocalhost_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (z.class) {
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
