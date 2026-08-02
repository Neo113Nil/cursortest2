package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: DataProto.java */
/* loaded from: classes12.dex */
public final class k extends GeneratedMessageLite<k, a> implements ma20 {
    private static final k DEFAULT_INSTANCE;
    private static volatile gj90<k> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private MapFieldLite<String, r> values_ = MapFieldLite.b;

    /* compiled from: DataProto.java */
    public static final class a extends GeneratedMessageLite.a<k, a> {
    }

    /* compiled from: DataProto.java */
    public static final class b {
        public static final f0<String, r> a = new f0<>(WireFormat$FieldType.STRING, WireFormat$FieldType.MESSAGE, r.t());
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        GeneratedMessageLite.r(k.class, kVar);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (i.a[methodToInvoke.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new a(DEFAULT_INSTANCE);
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"values_", b.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<k> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (k.class) {
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
