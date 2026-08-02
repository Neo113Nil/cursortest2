package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class aw3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final aw3 DEFAULT_INSTANCE;
    private static volatile Parser<aw3> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        aw3 aw3Var = new aw3();
        DEFAULT_INSTANCE = aw3Var;
        GeneratedMessageLite.registerDefaultInstance(aw3.class, aw3Var);
    }

    public static zv3 h() {
        return (zv3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (yv3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new aw3();
            case 2:
                return new zv3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<aw3> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (aw3.class) {
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

    public final void i(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    public final void j(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    public final void k(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }
}
