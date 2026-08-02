package eh;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e extends z {
    private static final e DEFAULT_INSTANCE;
    private static volatile y0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private long timestamp_;
    private int type_;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        z.n(e.class, eVar);
    }

    public static void p(e eVar, long j) {
        eVar.timestamp_ = j;
    }

    public static void q(e eVar, d dVar) {
        eVar.getClass();
        eVar.type_ = dVar.a();
    }

    public static c t() {
        return (c) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f9247a[v.f.d(i5)]) {
            case 1:
                return new e();
            case 2:
                return new c(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"type_", "timestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (e.class) {
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

    public final long r() {
        return this.timestamp_;
    }

    public final d s() {
        d dVar;
        switch (this.type_) {
            case 0:
                dVar = d.APPLICATION_INITIALIZED;
                break;
            case 1:
                dVar = d.ACTIVITY_STARTED;
                break;
            case 2:
                dVar = d.ACTIVITY_RESUMED;
                break;
            case 3:
                dVar = d.CONTENT_PROVIDER_CREATED;
                break;
            case 4:
                dVar = d.ACTIVITY_CREATED;
                break;
            case 5:
                dVar = d.APPLICATION_RUNTIME_INITIALIZED;
                break;
            case 6:
                dVar = d.DID_FINISH_LAUNCHING;
                break;
            case 7:
                dVar = d.WINDOW_DID_BECOME_VISIBLE;
                break;
            default:
                dVar = null;
                break;
        }
        return dVar == null ? d.UNRECOGNIZED : dVar;
    }
}
