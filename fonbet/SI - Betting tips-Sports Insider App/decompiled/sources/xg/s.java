package xg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s extends z {
    private static final s DEFAULT_INSTANCE;
    public static final int EVENTTIME_FIELD_NUMBER = 4;
    private static volatile y0 PARSER = null;
    public static final int POINTERID_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 2;
    public static final int Y_FIELD_NUMBER = 3;
    private double eventTime_;
    private int pointerId_;
    private float x_;
    private float y_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        z.n(s.class, sVar);
    }

    public static void p(s sVar, double d10) {
        sVar.eventTime_ = d10;
    }

    public static void q(s sVar, float f6) {
        sVar.x_ = f6;
    }

    public static void r(s sVar, int i5) {
        sVar.pointerId_ = i5;
    }

    public static void s(s sVar, float f6) {
        sVar.y_ = f6;
    }

    public static r t() {
        return (r) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25474a[v.f.d(i5)]) {
            case 1:
                return new s();
            case 2:
                return new r(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u0001\u0003\u0001\u0004\u0000", new Object[]{"pointerId_", "x_", "y_", "eventTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (s.class) {
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
