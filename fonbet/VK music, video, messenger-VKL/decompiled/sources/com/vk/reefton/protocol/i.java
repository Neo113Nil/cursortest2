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
public final class i extends GeneratedMessageLite<i, a> implements MessageLiteOrBuilder {
    private static final i DEFAULT_INSTANCE;
    public static final int LASTREQUESTS_FIELD_NUMBER = 1;
    private static volatile Parser<i> PARSER;
    private Internal.ProtobufList<h> lastRequests_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<i, a> implements MessageLiteOrBuilder {
        public a() {
            super(i.DEFAULT_INSTANCE);
        }

        public final void b(ArrayList arrayList) {
            copyOnWrite();
            i.b((i) this.instance, arrayList);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        GeneratedMessageLite.registerDefaultInstance(i.class, iVar);
    }

    public static void b(i iVar, ArrayList arrayList) {
        Internal.ProtobufList<h> protobufList = iVar.lastRequests_;
        if (!protobufList.isModifiable()) {
            iVar.lastRequests_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) iVar.lastRequests_);
    }

    public static a d() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"lastRequests_", h.class});
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
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
