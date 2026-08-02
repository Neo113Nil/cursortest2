package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final m DEFAULT_INSTANCE;
    public static final int DNT_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<m> PARSER;
    private int bitField0_;
    private boolean dnt_;
    private String id_ = "";

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        GeneratedMessageLite.registerDefaultInstance(m.class, mVar);
    }

    public static l h() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new l(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "id_", "dnt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<m> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (m.class) {
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

    public final void i(boolean z) {
        this.bitField0_ |= 2;
        this.dnt_ = z;
    }

    public final void j(String str) {
        this.bitField0_ |= 1;
        this.id_ = str;
    }
}
