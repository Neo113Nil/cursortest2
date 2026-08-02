package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class umf extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final umf DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 1;
    private static volatile Parser<umf> PARSER;
    private MapFieldLite<String, rmf> limits_ = MapFieldLite.emptyMapField();

    static {
        umf umfVar = new umf();
        DEFAULT_INSTANCE = umfVar;
        GeneratedMessageLite.registerDefaultInstance(umf.class, umfVar);
    }

    public static umf h() {
        return DEFAULT_INSTANCE;
    }

    public static smf k(umf umfVar) {
        return (smf) DEFAULT_INSTANCE.createBuilder(umfVar);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (pmf.a[methodToInvoke.ordinal()]) {
            case 1:
                return new umf();
            case 2:
                return new smf(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", tmf.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<umf> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (umf.class) {
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

    public final rmf i(rmf rmfVar) {
        MapFieldLite<String, rmf> mapFieldLite = this.limits_;
        return mapFieldLite.containsKey("APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY") ? mapFieldLite.get("APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY") : rmfVar;
    }

    public final MapFieldLite j() {
        if (!this.limits_.isMutable()) {
            this.limits_ = this.limits_.mutableCopy();
        }
        return this.limits_;
    }
}
