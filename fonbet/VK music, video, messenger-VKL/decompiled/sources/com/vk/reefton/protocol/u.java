package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.vk.reefton.protocol.v;
import com.vk.reefton.protocol.w;
import xsna.lof0;

/* compiled from: ReefProtocol.java */
/* loaded from: classes5.dex */
public final class u extends GeneratedMessageLite<u, a> implements MessageLiteOrBuilder {
    public static final int ASULEVEL_FIELD_NUMBER = 1;
    public static final int DBM_FIELD_NUMBER = 3;
    private static final u DEFAULT_INSTANCE;
    public static final int GSMDETAILS_FIELD_NUMBER = 5;
    public static final int LEVEL_FIELD_NUMBER = 2;
    public static final int LTEDETAILS_FIELD_NUMBER = 6;
    public static final int NOGUARANTEEDSIGNALINFO_FIELD_NUMBER = 4;
    private static volatile Parser<u> PARSER;
    private int asuLevel_;
    private int dbm_;
    private int detailsCase_ = 0;
    private Object details_;
    private int level_;
    private p noGuaranteedSignalInfo_;

    /* compiled from: ReefProtocol.java */
    public static final class a extends GeneratedMessageLite.Builder<u, a> implements MessageLiteOrBuilder {
        public a() {
            super(u.DEFAULT_INSTANCE);
        }

        public final void b(int i) {
            copyOnWrite();
            u.b((u) this.instance, i);
        }

        public final void c(int i) {
            copyOnWrite();
            u.c((u) this.instance, i);
        }

        public final void d(v.a aVar) {
            copyOnWrite();
            u.d((u) this.instance, aVar.build());
        }

        public final void f(int i) {
            copyOnWrite();
            u.f((u) this.instance, i);
        }

        public final void g(w.a aVar) {
            copyOnWrite();
            u.g((u) this.instance, aVar.build());
        }

        public final void h(p pVar) {
            copyOnWrite();
            u.h((u) this.instance, pVar);
        }
    }

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        GeneratedMessageLite.registerDefaultInstance(u.class, uVar);
    }

    public static void b(u uVar, int i) {
        uVar.asuLevel_ = i;
    }

    public static void c(u uVar, int i) {
        uVar.dbm_ = i;
    }

    public static void d(u uVar, v vVar) {
        uVar.getClass();
        vVar.getClass();
        uVar.details_ = vVar;
        uVar.detailsCase_ = 5;
    }

    public static void f(u uVar, int i) {
        uVar.level_ = i;
    }

    public static void g(u uVar, w wVar) {
        uVar.getClass();
        wVar.getClass();
        uVar.details_ = wVar;
        uVar.detailsCase_ = 6;
    }

    public static void h(u uVar, p pVar) {
        uVar.getClass();
        uVar.noGuaranteedSignalInfo_ = pVar;
    }

    public static a n() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new u();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\t\u0005<\u0000\u0006<\u0000", new Object[]{"details_", "detailsCase_", "asuLevel_", "level_", "dbm_", "noGuaranteedSignalInfo_", v.class, w.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<u> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (u.class) {
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
