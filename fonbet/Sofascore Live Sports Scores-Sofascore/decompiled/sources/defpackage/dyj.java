package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dyj extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final dyj DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile Parser<dyj> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static {
        dyj dyjVar = new dyj();
        DEFAULT_INSTANCE = dyjVar;
        GeneratedMessageLite.registerDefaultInstance(dyj.class, dyjVar);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (zxj.a[methodToInvoke.ordinal()]) {
            case 1:
                return new dyj();
            case 2:
                return new ayj(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", byj.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<dyj> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (dyj.class) {
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
}
