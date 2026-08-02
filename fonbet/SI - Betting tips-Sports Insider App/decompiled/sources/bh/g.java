package bh;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g extends z {
    private static final g DEFAULT_INSTANCE;
    public static final int HREF_FIELD_NUMBER = 1;
    private static volatile y0 PARSER = null;
    public static final int REQUESTBODY_FIELD_NUMBER = 2;
    public static final int RESPONSEBODY_FIELD_NUMBER = 3;
    private String href_ = "";
    private String requestBody_ = "";
    private String responseBody_ = "";

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        z.n(g.class, gVar);
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f3226a[v.f.d(i5)]) {
            case 1:
                return new g();
            case 2:
                return new f(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"href_", "requestBody_", "responseBody_"});
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
