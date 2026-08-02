package wg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p extends com.logrocket.protobuf.z {
    public static final int CLASSNAME_FIELD_NUMBER = 5;
    public static final int COLUMNNUMBER_FIELD_NUMBER = 2;
    private static final p DEFAULT_INSTANCE;
    public static final int FILENAME_FIELD_NUMBER = 3;
    public static final int FUNCTIONNAME_FIELD_NUMBER = 4;
    public static final int LINENUMBER_FIELD_NUMBER = 1;
    private static volatile y0 PARSER = null;
    public static final int RAWSTACKFRAME_FIELD_NUMBER = 6;
    private int columnNumber_;
    private int lineNumber_;
    private String fileName_ = "";
    private String functionName_ = "";
    private String className_ = "";
    private String rawStackFrame_ = "";

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        com.logrocket.protobuf.z.n(p.class, pVar);
    }

    public static void p(p pVar, int i5) {
        pVar.lineNumber_ = i5;
    }

    public static void q(p pVar, String str) {
        pVar.getClass();
        str.getClass();
        pVar.fileName_ = str;
    }

    public static void r(p pVar, String str) {
        pVar.getClass();
        str.getClass();
        pVar.functionName_ = str;
    }

    public static void s(p pVar, String str) {
        pVar.getClass();
        str.getClass();
        pVar.className_ = str;
    }

    public static o t() {
        return (o) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new p();
            case 2:
                return new o(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"lineNumber_", "columnNumber_", "fileName_", "functionName_", "className_", "rawStackFrame_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (p.class) {
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
