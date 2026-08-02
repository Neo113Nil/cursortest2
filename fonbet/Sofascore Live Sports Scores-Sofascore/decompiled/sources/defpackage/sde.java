package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sde extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final sde DEFAULT_INSTANCE;
    private static volatile Parser<sde> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final Internal.ListAdapter.Converter<Integer, u8h> sessionVerbosity_converter_ = new pde();
    private int bitField0_;
    private String sessionId_ = "";
    private Internal.IntList sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    static {
        sde sdeVar = new sde();
        DEFAULT_INSTANCE = sdeVar;
        GeneratedMessageLite.registerDefaultInstance(sde.class, sdeVar);
    }

    public static rde k() {
        return (rde) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (qde.a[methodToInvoke.ordinal()]) {
            case 1:
                return new sde();
            case 2:
                return new rde(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", t8h.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<sde> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (sde.class) {
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

    public final void h() {
        Internal.IntList intList = this.sessionVerbosity_;
        if (!intList.isModifiable()) {
            this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(intList);
        }
        this.sessionVerbosity_.addInt(1);
    }

    public final u8h i() {
        u8h a = u8h.a(this.sessionVerbosity_.getInt(0));
        return a == null ? u8h.SESSION_VERBOSITY_NONE : a;
    }

    public final int j() {
        return this.sessionVerbosity_.size();
    }

    public final void l(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}
