package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wy7 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final wy7 DEFAULT_INSTANCE;
    public static final int EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile Parser<wy7> PARSER;
    private long expirationEpochTimestampMillis_;
    private Internal.ProtobufList<yi2> messages_ = GeneratedMessageLite.emptyProtobufList();

    static {
        wy7 wy7Var = new wy7();
        DEFAULT_INSTANCE = wy7Var;
        GeneratedMessageLite.registerDefaultInstance(wy7.class, wy7Var);
    }

    public static wy7 h() {
        return DEFAULT_INSTANCE;
    }

    public static vy7 k() {
        return (vy7) DEFAULT_INSTANCE.createBuilder();
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (uy7.a[methodToInvoke.ordinal()]) {
            case 1:
                return new wy7();
            case 2:
                return new vy7(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"messages_", yi2.class, "expirationEpochTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<wy7> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (wy7.class) {
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

    public final long i() {
        return this.expirationEpochTimestampMillis_;
    }

    public final Internal.ProtobufList j() {
        return this.messages_;
    }

    public final void l(long j) {
        this.expirationEpochTimestampMillis_ = j;
    }
}
