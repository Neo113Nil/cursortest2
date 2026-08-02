package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BID_TOKEN_FIELD_NUMBER = 1;
    public static final int CLIENT_TOKEN_CONFIGS_FIELD_NUMBER = 3;
    private static final g DEFAULT_INSTANCE;
    private static volatile Parser<g> PARSER = null;
    public static final int PK_FIELD_NUMBER = 2;
    private f clientTokenConfigs_;
    private String bidToken_ = "";
    private String pk_ = "";

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        GeneratedMessageLite.registerDefaultInstance(g.class, gVar);
    }

    public static g l(byte[] bArr) {
        return (g) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"bidToken_", "pk_", "clientTokenConfigs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<g> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (g.class) {
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

    public final String h() {
        return this.bidToken_;
    }

    public final f i() {
        f fVar = this.clientTokenConfigs_;
        return fVar == null ? f.h() : fVar;
    }

    public final String j() {
        return this.pk_;
    }

    public final boolean k() {
        return this.clientTokenConfigs_ != null;
    }
}
