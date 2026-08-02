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
public final class o3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BUTTONS_FIELD_NUMBER = 5;
    public static final int CLICK_POS_FIELD_NUMBER = 1;
    private static final o3 DEFAULT_INSTANCE;
    private static volatile Parser<o3> PARSER = null;
    public static final int SCREEN_SIZE_FIELD_NUMBER = 2;
    public static final int VIEW_POS_FIELD_NUMBER = 3;
    public static final int VIEW_SIZE_FIELD_NUMBER = 4;
    private Internal.ProtobufList<m3> buttons_ = GeneratedMessageLite.emptyProtobufList();
    private a4 clickPos_;
    private c4 screenSize_;
    private a4 viewPos_;
    private c4 viewSize_;

    static {
        o3 o3Var = new o3();
        DEFAULT_INSTANCE = o3Var;
        GeneratedMessageLite.registerDefaultInstance(o3.class, o3Var);
    }

    public static n3 i() {
        return (n3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new o3();
            case 2:
                return new n3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b", new Object[]{"clickPos_", "screenSize_", "viewPos_", "viewSize_", "buttons_", m3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<o3> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (o3.class) {
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
        Internal.ProtobufList<m3> protobufList = this.buttons_;
        if (!protobufList.isModifiable()) {
            this.buttons_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) this.buttons_);
    }

    public final void j(a4 a4Var) {
        a4Var.getClass();
        this.clickPos_ = a4Var;
    }

    public final void k(c4 c4Var) {
        this.screenSize_ = c4Var;
    }

    public final void l(a4 a4Var) {
        a4Var.getClass();
        this.viewPos_ = a4Var;
    }

    public final void m(c4 c4Var) {
        c4Var.getClass();
        this.viewSize_ = c4Var;
    }
}
