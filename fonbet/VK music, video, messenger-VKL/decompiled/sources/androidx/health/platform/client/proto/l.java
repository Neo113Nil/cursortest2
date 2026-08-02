package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: DataProto.java */
/* loaded from: classes12.dex */
public final class l extends GeneratedMessageLite<l, a> implements ma20 {
    public static final int APPLICATION_ID_FIELD_NUMBER = 1;
    private static final l DEFAULT_INSTANCE;
    private static volatile gj90<l> PARSER;
    private String applicationId_ = "";
    private int bitField0_;

    /* compiled from: DataProto.java */
    public static final class a extends GeneratedMessageLite.a<l, a> {
        public a() {
            super(l.DEFAULT_INSTANCE);
        }
    }

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        GeneratedMessageLite.r(l.class, lVar);
    }

    public static void t(l lVar, String str) {
        lVar.getClass();
        lVar.bitField0_ |= 1;
        lVar.applicationId_ = str;
    }

    public static l v() {
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
                return new l();
            case 2:
                return new a();
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "applicationId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<l> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (l.class) {
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

    public final String u() {
        return this.applicationId_;
    }
}
