package defpackage;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fsj extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final fsj DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<fsj> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private MapFieldLite<String, Long> counters_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private Internal.ProtobufList<fsj> subtraces_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<sde> perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    static {
        fsj fsjVar = new fsj();
        DEFAULT_INSTANCE = fsjVar;
        GeneratedMessageLite.registerDefaultInstance(fsj.class, fsjVar);
    }

    public static fsj p() {
        return DEFAULT_INSTANCE;
    }

    public static csj w() {
        return (csj) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (bsj.a[methodToInvoke.ordinal()]) {
            case 1:
                return new fsj();
            case 2:
                return new csj(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", dsj.a, "subtraces_", fsj.class, "customAttributes_", esj.a, "perfSessions_", sde.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<fsj> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (fsj.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final void h(Iterable iterable) {
        Internal.ProtobufList<sde> protobufList = this.perfSessions_;
        if (!protobufList.isModifiable()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll(iterable, (List) this.perfSessions_);
    }

    public final void i(ArrayList arrayList) {
        Internal.ProtobufList<fsj> protobufList = this.subtraces_;
        if (!protobufList.isModifiable()) {
            this.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        AbstractMessageLite.addAll((Iterable) arrayList, (List) this.subtraces_);
    }

    public final void j(sde sdeVar) {
        sdeVar.getClass();
        Internal.ProtobufList<sde> protobufList = this.perfSessions_;
        if (!protobufList.isModifiable()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        this.perfSessions_.add(sdeVar);
    }

    public final void k(fsj fsjVar) {
        fsjVar.getClass();
        Internal.ProtobufList<fsj> protobufList = this.subtraces_;
        if (!protobufList.isModifiable()) {
            this.subtraces_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        this.subtraces_.add(fsjVar);
    }

    public final boolean l() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int m() {
        return this.counters_.size();
    }

    public final Map n() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long q() {
        return this.durationUs_;
    }

    public final Internal.ProtobufList r() {
        return this.perfSessions_;
    }

    public final Internal.ProtobufList s() {
        return this.subtraces_;
    }

    public final void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final MapFieldLite u() {
        if (!this.counters_.isMutable()) {
            this.counters_ = this.counters_.mutableCopy();
        }
        return this.counters_;
    }

    public final MapFieldLite v() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    public final void x(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    public final void y(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }
}
