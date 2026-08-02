package wg;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.p0;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h extends com.logrocket.protobuf.z {
    private static final h DEFAULT_INSTANCE;
    public static final int EVENTCOUNT_FIELD_NUMBER = 1;
    public static final int HREFACTIVITYCOUNTS_FIELD_NUMBER = 2;
    private static volatile y0 PARSER = null;
    public static final int SCROLLABLENODES_FIELD_NUMBER = 5;
    public static final int USERID_FIELD_NUMBER = 3;
    private int eventCount_;
    private p0 hrefActivityCounts_ = p0.f6776b;
    private String userID_ = "";
    private com.logrocket.protobuf.c0 scrollableNodes_ = b1.f6669d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        com.logrocket.protobuf.z.n(h.class, hVar);
    }

    public static void p(h hVar, int i5) {
        hVar.eventCount_ = i5;
    }

    public static void q(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.userID_ = str;
    }

    public static p0 r(h hVar) {
        p0 p0Var = hVar.hrefActivityCounts_;
        if (!p0Var.f6777a) {
            hVar.hrefActivityCounts_ = p0Var.e();
        }
        return hVar.hrefActivityCounts_;
    }

    public static d s() {
        return (d) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new h();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0001\u0001\u0000\u0001\u000b\u00022\u0003Ȉ\u0005\u001b", new Object[]{"eventCount_", "hrefActivityCounts_", e.f25262a, "userID_", "scrollableNodes_", f.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (h.class) {
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
