package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int COUNTS_FIELD_NUMBER = 1;
    private static final q2 DEFAULT_INSTANCE;
    public static final int DURATIONS_FIELD_NUMBER = 2;
    private static volatile Parser<q2> PARSER;
    private Internal.ProtobufList<n2> counts_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<p2> durations_ = GeneratedMessageLite.emptyProtobufList();

    static {
        q2 q2Var = new q2();
        DEFAULT_INSTANCE = q2Var;
        GeneratedMessageLite.registerDefaultInstance(q2.class, q2Var);
    }

    public static l2 j() {
        return (l2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (k2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new q2();
            case 2:
                return new l2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"counts_", n2.class, "durations_", p2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<q2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (q2.class) {
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

    public final void h(ArrayList arrayList) {
        Internal.ProtobufList<n2> protobufList = this.counts_;
        if (!protobufList.isModifiable()) {
            this.counts_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) this.counts_);
    }

    public final void i(ArrayList arrayList) {
        Internal.ProtobufList<p2> protobufList = this.durations_;
        if (!protobufList.isModifiable()) {
            this.durations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) this.durations_);
    }
}
