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
public final class k extends GeneratedMessageLite<k, a> implements MessageLiteOrBuilder {
    private static final k DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 1;
    private static volatile Parser<k> PARSER;
    private Internal.ProtobufList<j> events_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<k, a> implements MessageLiteOrBuilder {
        public a() {
            super(k.DEFAULT_INSTANCE);
        }

        public final void b(ArrayList arrayList) {
            copyOnWrite();
            k.b((k) this.instance, arrayList);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        GeneratedMessageLite.registerDefaultInstance(k.class, kVar);
    }

    public static void b(k kVar, ArrayList arrayList) {
        Internal.ProtobufList<j> protobufList = kVar.events_;
        if (!protobufList.isModifiable()) {
            kVar.events_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) kVar.events_);
    }

    public static a d() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"events_", j.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<k> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (k.class) {
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
