package ch;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.p0;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f extends z {
    private static final f DEFAULT_INSTANCE;
    public static final int EXTRA_FIELD_NUMBER = 3;
    public static final int MEASUREMENTS_FIELD_NUMBER = 2;
    public static final int METRICTYPE_FIELD_NUMBER = 1;
    private static volatile y0 PARSER;
    private p0 extra_ = p0.f6776b;
    private c0 measurements_ = b1.f6669d;
    private int metricType_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        z.n(f.class, fVar);
    }

    public static void p(f fVar) {
        int i5;
        fVar.getClass();
        switch (6) {
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
        fVar.metricType_ = i5;
    }

    public static void q(f fVar, c cVar) {
        fVar.getClass();
        c0 c0Var = fVar.measurements_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            fVar.measurements_ = z.m(c0Var);
        }
        fVar.measurements_.add(cVar);
    }

    public static void r(f fVar) {
        fVar.getClass();
        fVar.measurements_ = b1.f6669d;
    }

    public static p0 s(f fVar) {
        p0 p0Var = fVar.extra_;
        if (!p0Var.f6777a) {
            fVar.extra_ = p0Var.e();
        }
        return fVar.extra_;
    }

    public static d v() {
        return (d) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f3944a[v.f.d(i5)]) {
            case 1:
                return new f();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0001\u0000\u0001\f\u0002\u001b\u00032", new Object[]{"metricType_", "measurements_", c.class, "extra_", e.f3945a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (f.class) {
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

    public final Map t() {
        return DesugarCollections.unmodifiableMap(this.extra_);
    }

    public final int u() {
        return this.measurements_.size();
    }
}
