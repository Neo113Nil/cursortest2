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
public final class n2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final n2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<n2> PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 3;
    private int count_;
    private String name_ = "";
    private Internal.ProtobufList<String> tags_ = GeneratedMessageLite.emptyProtobufList();

    static {
        n2 n2Var = new n2();
        DEFAULT_INSTANCE = n2Var;
        GeneratedMessageLite.registerDefaultInstance(n2.class, n2Var);
    }

    public static m2 h() {
        return (m2) DEFAULT_INSTANCE.createBuilder();
    }

    public final void addAllTags(Iterable iterable) {
        Internal.ProtobufList<String> protobufList = this.tags_;
        if (!protobufList.isModifiable()) {
            this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) this.tags_);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (k2.a[methodToInvoke.ordinal()]) {
            case 1:
                return new n2();
            case 2:
                return new m2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u000b\u0003Ț", new Object[]{"name_", "count_", "tags_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<n2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (n2.class) {
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

    public final void i(int i) {
        this.count_ = i;
    }

    public final void j(String str) {
        str.getClass();
        this.name_ = str;
    }
}
