package dh;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g extends z {
    public static final int CAPTURELIMITTYPE_FIELD_NUMBER = 1;
    private static final g DEFAULT_INSTANCE;
    private static volatile y0 PARSER = null;
    public static final int SKIPPEDCAPTURES_FIELD_NUMBER = 2;
    private int captureLimitType_;
    private c0 skippedCaptures_ = b1.f6669d;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        z.n(g.class, gVar);
    }

    public static void p(g gVar, int i5) {
        gVar.getClass();
        if (i5 == 3) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i10 = 1;
        if (i5 == 1) {
            i10 = 0;
        } else if (i5 != 2) {
            if (i5 != 3) {
                throw null;
            }
            i10 = -1;
        }
        gVar.captureLimitType_ = i10;
    }

    public static void q(g gVar, f fVar) {
        gVar.getClass();
        c0 c0Var = gVar.skippedCaptures_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            gVar.skippedCaptures_ = z.m(c0Var);
        }
        gVar.skippedCaptures_.add(fVar);
    }

    public static void r(g gVar, ArrayList arrayList) {
        c0 c0Var = gVar.skippedCaptures_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            gVar.skippedCaptures_ = z.m(c0Var);
        }
        com.logrocket.protobuf.a.a(arrayList, gVar.skippedCaptures_);
    }

    public static d s() {
        return (d) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f8380a[v.f.d(i5)]) {
            case 1:
                return new g();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"captureLimitType_", "skippedCaptures_", f.class});
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
