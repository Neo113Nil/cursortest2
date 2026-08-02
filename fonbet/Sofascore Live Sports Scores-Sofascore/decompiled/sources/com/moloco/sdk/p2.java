package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final p2 DEFAULT_INSTANCE;
    public static final int ELAPSED_TIME_MILLIS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<p2> PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 3;
    private long elapsedTimeMillis_;
    private String name_ = "";
    private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

    static {
        p2 p2Var = new p2();
        DEFAULT_INSTANCE = p2Var;
        GeneratedMessageLite.registerDefaultInstance(p2.class, p2Var);
    }

    public static o2 i() {
        return (o2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (k2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new p2();
            case 2:
                return new o2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0003\u0003Ț", new Object[]{"name_", "elapsedTimeMillis_", "tags_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<p2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (p2.class) {
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

    public final void h(Iterable iterable) {
        Internal.ProtobufList<String> protobufList = this.tags_;
        if (!protobufList.isModifiable()) {
            this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) this.tags_);
    }

    public final void j(long j) {
        this.elapsedTimeMillis_ = j;
    }

    public final void k(String str) {
        str.getClass();
        this.name_ = str;
    }
}
