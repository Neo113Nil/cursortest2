package xg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n extends z {
    public static final int BITMAPRESOURCE_FIELD_NUMBER = 1;
    private static final n DEFAULT_INSTANCE;
    private static volatile y0 PARSER = null;
    public static final int TOTALCAPTURETIME_FIELD_NUMBER = 2;
    public static final int WEBPRESOURCE_FIELD_NUMBER = 4;
    private int resourceCase_ = 0;
    private Object resource_;
    private double totalCaptureTime_;

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        z.n(n.class, nVar);
    }

    public static void p(n nVar, double d10) {
        nVar.totalCaptureTime_ = d10;
    }

    public static void q(n nVar, l lVar) {
        nVar.getClass();
        nVar.resource_ = lVar;
        nVar.resourceCase_ = 4;
    }

    public static m r() {
        return (m) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25474a[v.f.d(i5)]) {
            case 1:
                return new n();
            case 2:
                return new m(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002\u0000\u0004<\u0000", new Object[]{"resource_", "resourceCase_", l.class, "totalCaptureTime_", l.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (n.class) {
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
