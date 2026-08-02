package wg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class w extends com.logrocket.protobuf.z {
    private static final w DEFAULT_INSTANCE;
    public static final int INITIALPAGELOADTIME_FIELD_NUMBER = 1;
    public static final int LARGESTCONTENTFULPAINTTIME_FIELD_NUMBER = 3;
    private static volatile y0 PARSER = null;
    public static final int TIMETOFIRSTBYTE_FIELD_NUMBER = 2;
    private int initialPageLoadTime_;
    private int largestContentfulPaintTime_;
    private int timeToFirstByte_;

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        com.logrocket.protobuf.z.n(w.class, wVar);
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new w();
            case 2:
                return new bh.f(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"initialPageLoadTime_", "timeToFirstByte_", "largestContentfulPaintTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (w.class) {
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
