package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final i DEFAULT_INSTANCE;
    public static final int ES_FIELD_NUMBER = 1;
    private static volatile Parser<i> PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private ByteString es_;
    private ByteString payload_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        GeneratedMessageLite.registerDefaultInstance(i.class, iVar);
    }

    public i() {
        ByteString byteString = ByteString.EMPTY;
        this.es_ = byteString;
        this.payload_ = byteString;
    }

    public static h h() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new h(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"es_", "payload_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<i> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (i.class) {
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

    public final void i(ByteString byteString) {
        byteString.getClass();
        this.es_ = byteString;
    }

    public final void j(ByteString byteString) {
        byteString.getClass();
        this.payload_ = byteString;
    }
}
