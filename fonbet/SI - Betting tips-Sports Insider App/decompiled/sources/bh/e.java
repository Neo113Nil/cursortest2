package bh;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e extends z {
    private static final e DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int NETWORKMATCHDATA_FIELD_NUMBER = 4;
    private static volatile y0 PARSER = null;
    public static final int UUIDS_FIELD_NUMBER = 3;
    public static final int UUID_FIELD_NUMBER = 1;
    private double duration_;
    private Object matchData_;
    private int matchDataCase_ = 0;
    private String uuid_ = "";
    private c0 uuids_ = b1.f6669d;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        z.n(e.class, eVar);
    }

    public static void p(e eVar, double d10) {
        eVar.duration_ = d10;
    }

    public static void q(e eVar, ArrayList arrayList) {
        c0 c0Var = eVar.uuids_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            eVar.uuids_ = z.m(c0Var);
        }
        com.logrocket.protobuf.a.a(arrayList, eVar.uuids_);
    }

    public static d r() {
        return (d) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f3226a[v.f.d(i5)]) {
            case 1:
                return new e();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0000\u0003Ț\u0004<\u0000", new Object[]{"matchData_", "matchDataCase_", "uuid_", "duration_", "uuids_", g.class});
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
}
