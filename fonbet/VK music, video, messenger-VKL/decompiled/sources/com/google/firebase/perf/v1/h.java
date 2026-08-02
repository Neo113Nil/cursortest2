package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.SessionVerbosity;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: PerfSession.java */
/* loaded from: classes13.dex */
public final class h extends GeneratedMessageLite<h, c> implements MessageLiteOrBuilder {
    private static final h DEFAULT_INSTANCE;
    private static volatile Parser<h> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final Internal.ListAdapter.Converter<Integer, SessionVerbosity> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private Internal.IntList sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    /* compiled from: PerfSession.java */
    public class a implements Internal.ListAdapter.Converter<Integer, SessionVerbosity> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public final SessionVerbosity convert(Integer num) {
            int intValue = num.intValue();
            SessionVerbosity sessionVerbosity = intValue != 0 ? intValue != 1 ? null : SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS : SessionVerbosity.SESSION_VERBOSITY_NONE;
            return sessionVerbosity == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : sessionVerbosity;
        }
    }

    /* compiled from: PerfSession.java */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: PerfSession.java */
    public static final class c extends GeneratedMessageLite.Builder<h, c> implements MessageLiteOrBuilder {
        public c() {
            super(h.DEFAULT_INSTANCE);
        }

        public final void b(SessionVerbosity sessionVerbosity) {
            copyOnWrite();
            h.d((h) this.instance, sessionVerbosity);
        }

        public final void c(String str) {
            copyOnWrite();
            h.c((h) this.instance, str);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        GeneratedMessageLite.registerDefaultInstance(h.class, hVar);
    }

    public static void c(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.bitField0_ |= 1;
        hVar.sessionId_ = str;
    }

    public static void d(h hVar, SessionVerbosity sessionVerbosity) {
        hVar.getClass();
        sessionVerbosity.getClass();
        Internal.IntList intList = hVar.sessionVerbosity_;
        if (!intList.isModifiable()) {
            hVar.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(intList);
        }
        hVar.sessionVerbosity_.addInt(sessionVerbosity.getNumber());
    }

    public static c h() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (b.a[methodToInvoke.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new c();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", SessionVerbosity.b.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<h> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (h.class) {
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

    public final SessionVerbosity f() {
        return sessionVerbosity_converter_.convert(Integer.valueOf(this.sessionVerbosity_.getInt(0)));
    }

    public final int g() {
        return this.sessionVerbosity_.size();
    }
}
