package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TraceMetric.java */
/* loaded from: classes13.dex */
public final class i extends GeneratedMessageLite<i, b> implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final i DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<i> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private MapFieldLite<String, Long> counters_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private Internal.ProtobufList<i> subtraces_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<h> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: TraceMetric.java */
    public static /* synthetic */ class a {
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

    /* compiled from: TraceMetric.java */
    public static final class b extends GeneratedMessageLite.Builder<i, b> implements MessageLiteOrBuilder {
        public b() {
            super(i.DEFAULT_INSTANCE);
        }

        public final void b(List list) {
            copyOnWrite();
            i.n((i) this.instance, list);
        }

        public final void c(ArrayList arrayList) {
            copyOnWrite();
            i.g((i) this.instance, arrayList);
        }

        public final void d(h hVar) {
            copyOnWrite();
            i.m((i) this.instance, hVar);
        }

        public final void f(i iVar) {
            copyOnWrite();
            i.f((i) this.instance, iVar);
        }

        public final void g(HashMap hashMap) {
            copyOnWrite();
            i.d((i) this.instance).putAll(hashMap);
        }

        public final void h(Map map) {
            copyOnWrite();
            i.h((i) this.instance).putAll(map);
        }

        public final void m(long j, String str) {
            str.getClass();
            copyOnWrite();
            i.d((i) this.instance).put(str, Long.valueOf(j));
        }

        public final void n(long j) {
            copyOnWrite();
            i.o((i) this.instance, j);
        }

        public final void o(long j) {
            copyOnWrite();
            i.p((i) this.instance, j);
        }

        public final void p(String str) {
            copyOnWrite();
            i.c((i) this.instance, str);
        }
    }

    /* compiled from: TraceMetric.java */
    public static final class c {
        public static final MapEntryLite<String, Long> a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    /* compiled from: TraceMetric.java */
    public static final class d {
        public static final MapEntryLite<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        GeneratedMessageLite.registerDefaultInstance(i.class, iVar);
    }

    public static void c(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.bitField0_ |= 1;
        iVar.name_ = str;
    }

    public static MapFieldLite d(i iVar) {
        if (!iVar.counters_.isMutable()) {
            iVar.counters_ = iVar.counters_.mutableCopy();
        }
        return iVar.counters_;
    }

    public static void f(i iVar, i iVar2) {
        iVar.getClass();
        iVar2.getClass();
        Internal.ProtobufList<i> protobufList = iVar.subtraces_;
        if (!protobufList.isModifiable()) {
            iVar.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        iVar.subtraces_.add(iVar2);
    }

    public static void g(i iVar, ArrayList arrayList) {
        Internal.ProtobufList<i> protobufList = iVar.subtraces_;
        if (!protobufList.isModifiable()) {
            iVar.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) iVar.subtraces_);
    }

    public static MapFieldLite h(i iVar) {
        if (!iVar.customAttributes_.isMutable()) {
            iVar.customAttributes_ = iVar.customAttributes_.mutableCopy();
        }
        return iVar.customAttributes_;
    }

    public static void m(i iVar, h hVar) {
        iVar.getClass();
        hVar.getClass();
        Internal.ProtobufList<h> protobufList = iVar.perfSessions_;
        if (!protobufList.isModifiable()) {
            iVar.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        iVar.perfSessions_.add(hVar);
    }

    public static void n(i iVar, Iterable iterable) {
        Internal.ProtobufList<h> protobufList = iVar.perfSessions_;
        if (!protobufList.isModifiable()) {
            iVar.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) iVar.perfSessions_);
    }

    public static void o(i iVar, long j) {
        iVar.bitField0_ |= 4;
        iVar.clientStartTimeUs_ = j;
    }

    public static void p(i iVar, long j) {
        iVar.bitField0_ |= 8;
        iVar.durationUs_ = j;
    }

    public static i u() {
        return DEFAULT_INSTANCE;
    }

    public static b z() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.a, "subtraces_", i.class, "customAttributes_", d.a, "perfSessions_", h.class});
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

    public final String getName() {
        return this.name_;
    }

    public final boolean q() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int r() {
        return this.counters_.size();
    }

    public final Map<String, Long> s() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map<String, String> t() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long v() {
        return this.durationUs_;
    }

    public final Internal.ProtobufList w() {
        return this.perfSessions_;
    }

    public final Internal.ProtobufList x() {
        return this.subtraces_;
    }

    public final boolean y() {
        return (this.bitField0_ & 4) != 0;
    }
}
