package eh;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q extends z {
    public static final int APPTOTALBYTES_FIELD_NUMBER = 4;
    private static final q DEFAULT_INSTANCE;
    public static final int DEVICEMOBILEBYTES_FIELD_NUMBER = 2;
    public static final int DEVICETOTALBYTES_FIELD_NUMBER = 3;
    private static volatile y0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long appTotalBytes_;
    private long deviceMobileBytes_;
    private long deviceTotalBytes_;
    private long timestamp_;

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        z.n(q.class, qVar);
    }

    public static void p(q qVar, long j) {
        qVar.deviceMobileBytes_ = j;
    }

    public static void q(q qVar, long j) {
        qVar.deviceTotalBytes_ = j;
    }

    public static void r(q qVar, long j) {
        qVar.appTotalBytes_ = j;
    }

    public static void s(q qVar, long j) {
        qVar.timestamp_ = j;
    }

    public static p t() {
        return (p) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f9247a[v.f.d(i5)]) {
            case 1:
                return new q();
            case 2:
                return new p(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"timestamp_", "deviceMobileBytes_", "deviceTotalBytes_", "appTotalBytes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (q.class) {
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
