package wg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class l0 extends com.logrocket.protobuf.z {
    private static final l0 DEFAULT_INSTANCE;
    private static volatile y0 PARSER = null;
    public static final int RECORDINGID_FIELD_NUMBER = 1;
    public static final int SESSIONID_FIELD_NUMBER = 2;
    private String recordingID_ = "";
    private int sessionID_;

    static {
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        com.logrocket.protobuf.z.n(l0.class, l0Var);
    }

    public static void p(l0 l0Var, int i5) {
        l0Var.sessionID_ = i5;
    }

    public static void q(l0 l0Var, String str) {
        l0Var.getClass();
        str.getClass();
        l0Var.recordingID_ = str;
    }

    public static k0 r() {
        return (k0) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new l0();
            case 2:
                return new k0(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u000b", new Object[]{"recordingID_", "sessionID_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (l0.class) {
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
