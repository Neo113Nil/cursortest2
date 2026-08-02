package eh;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j extends z {
    private static final j DEFAULT_INSTANCE;
    public static final int MEASUREMENTS_FIELD_NUMBER = 1;
    public static final int NUMBEROFCPUCORES_FIELD_NUMBER = 3;
    private static volatile y0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    private int numberOfCpuCores_;
    private c0 measurements_ = b1.f6669d;
    private String url_ = "";

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        z.n(j.class, jVar);
    }

    public static void p(j jVar) {
        jVar.getClass();
        jVar.measurements_ = b1.f6669d;
    }

    public static void q(j jVar, i iVar) {
        jVar.getClass();
        c0 c0Var = jVar.measurements_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            jVar.measurements_ = z.m(c0Var);
        }
        jVar.measurements_.add(iVar);
    }

    public static void r(j jVar, String str) {
        jVar.getClass();
        jVar.url_ = str;
    }

    public static void s(j jVar, int i5) {
        jVar.numberOfCpuCores_ = i5;
    }

    public static g v() {
        return (g) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f9247a[v.f.d(i5)]) {
            case 1:
                return new j();
            case 2:
                return new g(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u000b", new Object[]{"measurements_", i.class, "url_", "numberOfCpuCores_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (j.class) {
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

    public final int t() {
        return this.measurements_.size();
    }

    public final String u() {
        return this.url_;
    }
}
