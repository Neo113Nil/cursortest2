package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: DataProto.java */
/* loaded from: classes12.dex */
public final class n extends GeneratedMessageLite<n, a> implements ma20 {
    private static final n DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile gj90<n> PARSER;
    private int bitField0_;
    private String name_ = "";

    /* compiled from: DataProto.java */
    public static final class a extends GeneratedMessageLite.a<n, a> {
        public a() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        GeneratedMessageLite.r(n.class, nVar);
    }

    public static void t(n nVar, String str) {
        nVar.getClass();
        nVar.bitField0_ |= 1;
        nVar.name_ = str;
    }

    public static n u() {
        return DEFAULT_INSTANCE;
    }

    public static a w() {
        return DEFAULT_INSTANCE.h();
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (i.a[methodToInvoke.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new a();
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<n> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (n.class) {
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

    public final String v() {
        return this.name_;
    }
}
