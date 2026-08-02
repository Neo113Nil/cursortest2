package wg;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.p0;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q extends com.logrocket.protobuf.z {
    public static final int CANSKIPASSETCACHE_FIELD_NUMBER = 13;
    public static final int CAUSALSEQIDS_FIELD_NUMBER = 14;
    public static final int DATA_FIELD_NUMBER = 3;
    private static final q DEFAULT_INSTANCE;
    public static final int FILEMAP_FIELD_NUMBER = 9;
    private static volatile y0 PARSER = null;
    public static final int PLATFORMTYPE_FIELD_NUMBER = 12;
    public static final int SEQID_FIELD_NUMBER = 5;
    public static final int SESSIONID_FIELD_NUMBER = 10;
    public static final int STACKTRACE_FIELD_NUMBER = 6;
    public static final int THREADID_FIELD_NUMBER = 4;
    public static final int TIMEOFFSET_FIELD_NUMBER = 11;
    public static final int TIME_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private boolean canSkipAssetCache_;
    private int platformType_;
    private int seqID_;
    private int sessionID_;
    private int threadID_;
    private double timeOffset_;
    private double time_;
    private p0 fileMap_ = p0.f6776b;
    private int causalSeqIDsMemoizedSerializedSize = -1;
    private String type_ = "";
    private com.logrocket.protobuf.j data_ = com.logrocket.protobuf.j.f6736b;
    private com.logrocket.protobuf.c0 stackTrace_ = b1.f6669d;
    private com.logrocket.protobuf.b0 causalSeqIDs_ = com.logrocket.protobuf.a0.f6661d;

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        com.logrocket.protobuf.z.n(q.class, qVar);
    }

    public static void A(q qVar) {
        qVar.getClass();
        qVar.stackTrace_ = b1.f6669d;
    }

    public static m C() {
        return (m) DEFAULT_INSTANCE.f();
    }

    public static void p(q qVar) {
        qVar.threadID_ = 0;
    }

    public static void q(q qVar, double d10) {
        qVar.time_ = d10;
    }

    public static void r(q qVar, String str) {
        qVar.getClass();
        qVar.type_ = str;
    }

    public static void s(q qVar, p pVar) {
        qVar.getClass();
        com.logrocket.protobuf.c0 c0Var = qVar.stackTrace_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            qVar.stackTrace_ = com.logrocket.protobuf.z.m(c0Var);
        }
        qVar.stackTrace_.add(pVar);
    }

    public static void t(q qVar) {
        qVar.getClass();
        qVar.platformType_ = 2;
    }

    public static void u(q qVar) {
        qVar.getClass();
        qVar.type_ = DEFAULT_INSTANCE.type_;
    }

    public static void v(q qVar, double d10) {
        qVar.timeOffset_ = d10;
    }

    public static void w(q qVar, int i5) {
        qVar.seqID_ = i5;
    }

    public static void x(q qVar, com.logrocket.protobuf.j jVar) {
        qVar.getClass();
        qVar.data_ = jVar;
    }

    public static void y(q qVar) {
        qVar.getClass();
        qVar.data_ = DEFAULT_INSTANCE.data_;
    }

    public static void z(q qVar, int i5) {
        qVar.sessionID_ = i5;
    }

    public final String B() {
        return this.type_;
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new q();
            case 2:
                return new m(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\u000e\f\u0001\u0002\u0000\u0001\u0000\u0002Ȉ\u0003\n\u0004\u000b\u0005\u000b\u0006\u001b\t2\n\u000b\u000b\u0000\f\f\r\u0007\u000e+", new Object[]{"time_", "type_", "data_", "threadID_", "seqID_", "stackTrace_", p.class, "fileMap_", n.f25263a, "sessionID_", "timeOffset_", "platformType_", "canSkipAssetCache_", "causalSeqIDs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (q.class) {
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
