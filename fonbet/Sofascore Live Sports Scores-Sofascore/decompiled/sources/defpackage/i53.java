package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i53 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final i53 DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
    private static volatile Parser<i53> PARSER;
    private int conditionCase_ = 0;
    private Object condition_;

    static {
        i53 i53Var = new i53();
        DEFAULT_INSTANCE = i53Var;
        GeneratedMessageLite.registerDefaultInstance(i53.class, i53Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (z43.a[methodToInvoke.ordinal()]) {
            case 1:
                return new i53();
            case 2:
                return new h53(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", b53.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<i53> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (i53.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            default:
                a70.i();
            case 7:
                return null;
        }
    }

    public final b53 h() {
        return this.conditionCase_ == 2 ? (b53) this.condition_ : b53.h();
    }

    public final e53 i() {
        int i = this.conditionCase_;
        e53 e53Var = e53.UNKNOWN_TRIGGER;
        if (i == 1) {
            int intValue = ((Integer) this.condition_).intValue();
            if (intValue != 0) {
                e53Var = intValue != 1 ? intValue != 2 ? null : e53.ON_FOREGROUND : e53.APP_LAUNCH;
            }
            if (e53Var == null) {
                return e53.UNRECOGNIZED;
            }
        }
        return e53Var;
    }
}
