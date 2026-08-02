package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: RequestProto.java */
/* loaded from: classes12.dex */
public final class q0 extends GeneratedMessageLite<q0, a> implements ma20 {
    public static final int AGGREGATION_TYPE_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_NAME_FIELD_NUMBER = 1;
    private static final q0 DEFAULT_INSTANCE;
    public static final int FIELD_NAME_FIELD_NUMBER = 3;
    private static volatile gj90<q0> PARSER;
    private int bitField0_;
    private String dataTypeName_ = "";
    private String aggregationType_ = "";
    private String fieldName_ = "";

    /* compiled from: RequestProto.java */
    public static final class a extends GeneratedMessageLite.a<q0, a> {
        public a() {
            super(q0.DEFAULT_INSTANCE);
        }
    }

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        GeneratedMessageLite.r(q0.class, q0Var);
    }

    public static void s(q0 q0Var, String str) {
        q0Var.getClass();
        str.getClass();
        q0Var.bitField0_ |= 2;
        q0Var.aggregationType_ = str;
    }

    public static void t(q0 q0Var, String str) {
        q0Var.getClass();
        str.getClass();
        q0Var.bitField0_ |= 4;
        q0Var.fieldName_ = str;
    }

    public static void v(q0 q0Var, String str) {
        q0Var.getClass();
        q0Var.bitField0_ |= 1;
        q0Var.dataTypeName_ = str;
    }

    public static a w() {
        return DEFAULT_INSTANCE.h();
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (o0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new q0();
            case 2:
                return new a();
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "dataTypeName_", "aggregationType_", "fieldName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<q0> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (q0.class) {
                    try {
                        gj90Var = PARSER;
                        if (gj90Var == null) {
                            gj90Var = new GeneratedMessageLite.b();
                            PARSER = gj90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gj90Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
