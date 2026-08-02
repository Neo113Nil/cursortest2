package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rmf extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final rmf DEFAULT_INSTANCE;
    private static volatile Parser<rmf> PARSER = null;
    public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long startTimeEpoch_;
    private long value_;

    static {
        rmf rmfVar = new rmf();
        DEFAULT_INSTANCE = rmfVar;
        GeneratedMessageLite.registerDefaultInstance(rmf.class, rmfVar);
    }

    public static rmf h() {
        return DEFAULT_INSTANCE;
    }

    public static qmf j() {
        return (qmf) DEFAULT_INSTANCE.createBuilder();
    }

    public static qmf k(rmf rmfVar) {
        return (qmf) DEFAULT_INSTANCE.createBuilder(rmfVar);
    }

    public final void clearValue() {
        this.value_ = 0L;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (pmf.a[methodToInvoke.ordinal()]) {
            case 1:
                return new rmf();
            case 2:
                return new qmf(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<rmf> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (rmf.class) {
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

    public final long getValue() {
        return this.value_;
    }

    public final long i() {
        return this.startTimeEpoch_;
    }

    public final void l(long j) {
        this.startTimeEpoch_ = j;
    }

    public final void setValue(long j) {
        this.value_ = j;
    }
}
