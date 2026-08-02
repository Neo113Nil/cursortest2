package xg;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class t extends z {
    private static final t DEFAULT_INSTANCE;
    public static final int EVENTTIME_FIELD_NUMBER = 5;
    public static final int ISRAGECLICK_FIELD_NUMBER = 9;
    public static final int MOVES_FIELD_NUMBER = 4;
    public static final int NODEPATH_FIELD_NUMBER = 6;
    private static volatile y0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 7;
    public static final int X_FIELD_NUMBER = 2;
    public static final int Y_FIELD_NUMBER = 3;
    private double eventTime_;
    private boolean isRageClick_;
    private c0 moves_;
    private c0 nodePath_;
    private String text_;
    private int type_;
    private String url_;
    private float x_;
    private float y_;

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        z.n(t.class, tVar);
    }

    public t() {
        b1 b1Var = b1.f6669d;
        this.moves_ = b1Var;
        this.nodePath_ = b1Var;
        this.url_ = "";
        this.text_ = "";
    }

    public static q E() {
        return (q) DEFAULT_INSTANCE.f();
    }

    public static void p(t tVar) {
        tVar.isRageClick_ = true;
    }

    public static void q(t tVar, double d10) {
        tVar.eventTime_ = d10;
    }

    public static void r(t tVar, float f6) {
        tVar.x_ = f6;
    }

    public static void s(t tVar, int i5) {
        tVar.getClass();
        if (i5 == 4) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i10 = 1;
        if (i5 == 1) {
            i10 = 0;
        } else if (i5 != 2) {
            if (i5 == 3) {
                i10 = 2;
            } else {
                if (i5 != 4) {
                    throw null;
                }
                i10 = -1;
            }
        }
        tVar.type_ = i10;
    }

    public static void t(t tVar, String str) {
        tVar.getClass();
        str.getClass();
        tVar.url_ = str;
    }

    public static void u(t tVar, s sVar) {
        tVar.getClass();
        c0 c0Var = tVar.moves_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            tVar.moves_ = z.m(c0Var);
        }
        tVar.moves_.add(sVar);
    }

    public static void v(t tVar, float f6) {
        tVar.y_ = f6;
    }

    public static void w(t tVar, String str) {
        tVar.getClass();
        str.getClass();
        tVar.text_ = str;
    }

    public static void x(t tVar, ArrayList arrayList) {
        c0 c0Var = tVar.nodePath_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            tVar.nodePath_ = z.m(c0Var);
        }
        com.logrocket.protobuf.a.a(arrayList, tVar.nodePath_);
    }

    public final String A() {
        return this.text_;
    }

    public final int B() {
        int i5 = this.type_;
        int i10 = i5 != 0 ? i5 != 1 ? i5 != 2 ? 0 : 3 : 2 : 1;
        if (i10 == 0) {
            return 4;
        }
        return i10;
    }

    public final float C() {
        return this.x_;
    }

    public final float D() {
        return this.y_;
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25474a[v.f.d(i5)]) {
            case 1:
                return new t();
            case 2:
                return new q(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0002\u0000\u0001\f\u0002\u0001\u0003\u0001\u0004\u001b\u0005\u0000\u0006\u001b\u0007Ȉ\bȈ\t\u0007", new Object[]{"type_", "x_", "y_", "moves_", s.class, "eventTime_", "nodePath_", p.class, "url_", "text_", "isRageClick_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (t.class) {
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

    public final double y() {
        return this.eventTime_;
    }

    public final List z() {
        return this.nodePath_;
    }
}
