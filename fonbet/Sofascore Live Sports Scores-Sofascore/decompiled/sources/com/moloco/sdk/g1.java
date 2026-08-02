package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.ironsource.U3;
import defpackage.a70;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final g1 DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int EVENTS_FIELD_NUMBER = 6;
    public static final int IDFV_FIELD_NUMBER = 2;
    public static final int OS_FIELD_NUMBER = 3;
    private static volatile Parser<g1> PARSER = null;
    public static final int PUBLISHER_APP_ID_FIELD_NUMBER = 5;
    public static final int PUBLISHER_ID_FIELD_NUMBER = 4;
    private String deviceId_ = "";
    private String idfv_ = "";
    private String os_ = "";
    private String publisherId_ = "";
    private String publisherAppId_ = "";
    private Internal.ProtobufList<e1> events_ = GeneratedMessageLite.emptyProtobufList();

    static {
        g1 g1Var = new g1();
        DEFAULT_INSTANCE = g1Var;
        GeneratedMessageLite.registerDefaultInstance(g1.class, g1Var);
    }

    public static f1 j() {
        return (f1) DEFAULT_INSTANCE.createBuilder();
    }

    public static g1 k(byte[] bArr) {
        return (g1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (c1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new g1();
            case 2:
                return new f1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"deviceId_", "idfv_", "os_", "publisherId_", "publisherAppId_", "events_", e1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<g1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (g1.class) {
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
        Internal.ProtobufList<e1> protobufList = this.events_;
        if (!protobufList.isModifiable()) {
            this.events_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) this.events_);
    }

    public final Internal.ProtobufList i() {
        return this.events_;
    }

    public final void l(String str) {
        this.deviceId_ = str;
    }

    public final void m() {
        this.os_ = U3.d;
    }

    public final void n(String str) {
        str.getClass();
        this.publisherAppId_ = str;
    }

    public final void o(String str) {
        str.getClass();
        this.publisherId_ = str;
    }
}
