package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class e extends GeneratedMessageLite<e, a> implements MessageLiteOrBuilder {
    private static final e DEFAULT_INSTANCE;
    public static final int PAIRS_FIELD_NUMBER = 1;
    private static volatile Parser<e> PARSER;
    private Internal.ProtobufList<q> pairs_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<e, a> implements MessageLiteOrBuilder {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }

        public final void b(q qVar) {
            copyOnWrite();
            e.b((e) this.instance, qVar);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        GeneratedMessageLite.registerDefaultInstance(e.class, eVar);
    }

    public static void b(e eVar, q qVar) {
        eVar.getClass();
        qVar.getClass();
        Internal.ProtobufList<q> protobufList = eVar.pairs_;
        if (!protobufList.isModifiable()) {
            eVar.pairs_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        eVar.pairs_.add(qVar);
    }

    public static a d() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"pairs_", q.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<e> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (e.class) {
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
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
