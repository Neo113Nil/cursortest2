package com.vk.reefton.protocol;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;
import java.util.List;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class g extends GeneratedMessageLite<g, a> implements MessageLiteOrBuilder {
    private static final g DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 1;
    private static volatile Parser<g> PARSER;
    private Internal.ProtobufList<ReefProtocol$Event> events_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<g, a> implements MessageLiteOrBuilder {
        public a() {
            super(g.DEFAULT_INSTANCE);
        }

        public final void b(ArrayList arrayList) {
            copyOnWrite();
            g.b((g) this.instance, arrayList);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        GeneratedMessageLite.registerDefaultInstance(g.class, gVar);
    }

    public static void b(g gVar, ArrayList arrayList) {
        Internal.ProtobufList<ReefProtocol$Event> protobufList = gVar.events_;
        if (!protobufList.isModifiable()) {
            gVar.events_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) gVar.events_);
    }

    public static a d() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"events_", ReefProtocol$Event.class});
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
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
