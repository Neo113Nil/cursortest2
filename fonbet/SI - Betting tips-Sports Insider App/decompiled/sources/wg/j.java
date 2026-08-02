package wg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j extends com.logrocket.protobuf.z {
    private static final j DEFAULT_INSTANCE;
    private static volatile y0 PARSER = null;
    public static final int RECORDINGCONDITIONID_FIELD_NUMBER = 1;
    private String recordingConditionID_ = "";

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        com.logrocket.protobuf.z.n(j.class, jVar);
    }

    public static void p(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        jVar.recordingConditionID_ = str;
    }

    public static i q() {
        return (i) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new j();
            case 2:
                return new i(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"recordingConditionID_"});
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
