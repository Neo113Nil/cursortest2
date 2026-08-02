package com.vk.reefton.protocol;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;
import java.util.List;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class c extends GeneratedMessageLite<c, a> implements MessageLiteOrBuilder {
    public static final int AREA_FIELD_NUMBER = 4;
    public static final int BANDWIDTH_FIELD_NUMBER = 8;
    public static final int CELLID_FIELD_NUMBER = 5;
    public static final int CONNECTIONSTATUS_FIELD_NUMBER = 14;
    private static final c DEFAULT_INSTANCE;
    public static final int ISACTIVE_FIELD_NUMBER = 9;
    public static final int ISREGISTERED_FIELD_NUMBER = 12;
    public static final int MCC_FIELD_NUMBER = 2;
    public static final int MNC_FIELD_NUMBER = 3;
    public static final int NOGUARANTEEDCELLIFO_FIELD_NUMBER = 11;
    private static volatile Parser<c> PARSER = null;
    public static final int PSCPCI_FIELD_NUMBER = 7;
    public static final int RFCN_FIELD_NUMBER = 6;
    public static final int SIGNALLIST_FIELD_NUMBER = 10;
    public static final int TIMESTAMP_FIELD_NUMBER = 13;
    public static final int TYPE_FIELD_NUMBER = 1;
    private Int32Value area_;
    private Int32Value bandwidth_;
    private Int32Value cellId_;
    private int connectionStatus_;
    private boolean isActive_;
    private boolean isRegistered_;
    private n noGuaranteedCellIfo_;
    private Int32Value pscPci_;
    private Int32Value rfcn_;
    private long timestamp_;
    private int type_;
    private String mcc_ = "";
    private String mnc_ = "";
    private Internal.ProtobufList<u> signalList_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<c, a> implements MessageLiteOrBuilder {
        public a() {
            super(c.DEFAULT_INSTANCE);
        }

        public final void b(ArrayList arrayList) {
            copyOnWrite();
            c.b((c) this.instance, arrayList);
        }

        public final void c(Int32Value int32Value) {
            copyOnWrite();
            c.c((c) this.instance, int32Value);
        }

        public final void d(Int32Value int32Value) {
            copyOnWrite();
            c.d((c) this.instance, int32Value);
        }

        public final void f(Int32Value int32Value) {
            copyOnWrite();
            c.f((c) this.instance, int32Value);
        }

        public final void g(int i) {
            copyOnWrite();
            c.g((c) this.instance, i);
        }

        public final void h(boolean z) {
            copyOnWrite();
            c.h((c) this.instance, z);
        }

        public final void m(boolean z) {
            copyOnWrite();
            c.m((c) this.instance, z);
        }

        public final void n(String str) {
            copyOnWrite();
            c.n((c) this.instance, str);
        }

        public final void o(String str) {
            copyOnWrite();
            c.o((c) this.instance, str);
        }

        public final void p(Int32Value int32Value) {
            copyOnWrite();
            c.p((c) this.instance, int32Value);
        }

        public final void q(Int32Value int32Value) {
            copyOnWrite();
            c.q((c) this.instance, int32Value);
        }

        public final void r(long j) {
            copyOnWrite();
            c.r((c) this.instance, j);
        }

        public final void s(ReefProtocol$NetworkType reefProtocol$NetworkType) {
            copyOnWrite();
            c.s((c) this.instance, reefProtocol$NetworkType);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
    }

    public static void b(c cVar, ArrayList arrayList) {
        Internal.ProtobufList<u> protobufList = cVar.signalList_;
        if (!protobufList.isModifiable()) {
            cVar.signalList_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) cVar.signalList_);
    }

    public static void c(c cVar, Int32Value int32Value) {
        cVar.getClass();
        int32Value.getClass();
        cVar.area_ = int32Value;
    }

    public static void d(c cVar, Int32Value int32Value) {
        cVar.getClass();
        int32Value.getClass();
        cVar.bandwidth_ = int32Value;
    }

    public static void f(c cVar, Int32Value int32Value) {
        cVar.getClass();
        int32Value.getClass();
        cVar.cellId_ = int32Value;
    }

    public static void g(c cVar, int i) {
        cVar.connectionStatus_ = i;
    }

    public static void h(c cVar, boolean z) {
        cVar.isActive_ = z;
    }

    public static void m(c cVar, boolean z) {
        cVar.isRegistered_ = z;
    }

    public static void n(c cVar, String str) {
        cVar.getClass();
        cVar.mcc_ = str;
    }

    public static void o(c cVar, String str) {
        cVar.getClass();
        cVar.mnc_ = str;
    }

    public static void p(c cVar, Int32Value int32Value) {
        cVar.getClass();
        int32Value.getClass();
        cVar.pscPci_ = int32Value;
    }

    public static void q(c cVar, Int32Value int32Value) {
        cVar.getClass();
        int32Value.getClass();
        cVar.rfcn_ = int32Value;
    }

    public static void r(c cVar, long j) {
        cVar.timestamp_ = j;
    }

    public static void s(c cVar, ReefProtocol$NetworkType reefProtocol$NetworkType) {
        cVar.getClass();
        cVar.type_ = reefProtocol$NetworkType.getNumber();
    }

    public static a u() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\u0007\n\u001b\u000b\t\f\u0007\r\u0002\u000e\u0004", new Object[]{"type_", "mcc_", "mnc_", "area_", "cellId_", "rfcn_", "pscPci_", "bandwidth_", "isActive_", "signalList_", u.class, "noGuaranteedCellIfo_", "isRegistered_", "timestamp_", "connectionStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<c> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (c.class) {
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
