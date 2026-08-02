package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.a;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.util.Map;

/* compiled from: ApplicationInfo.java */
/* loaded from: classes13.dex */
public final class c extends GeneratedMessageLite<c, b> implements MessageLiteOrBuilder {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile Parser<c> PARSER;
    private com.google.firebase.perf.v1.a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* compiled from: ApplicationInfo.java */
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

    /* compiled from: ApplicationInfo.java */
    public static final class b extends GeneratedMessageLite.Builder<c, b> implements MessageLiteOrBuilder {
        public b() {
            super(c.DEFAULT_INSTANCE);
        }

        public final boolean m() {
            return ((c) this.instance).p();
        }

        public final void n(Map map) {
            copyOnWrite();
            c.f((c) this.instance).putAll(map);
        }

        public final void o(a.b bVar) {
            copyOnWrite();
            c.h((c) this.instance, bVar.build());
        }

        public final void p(String str) {
            copyOnWrite();
            c.g((c) this.instance, str);
        }

        public final void q(ApplicationProcessState applicationProcessState) {
            copyOnWrite();
            c.d((c) this.instance, applicationProcessState);
        }

        public final void r(String str) {
            copyOnWrite();
            c.c((c) this.instance, str);
        }
    }

    /* compiled from: ApplicationInfo.java */
    /* renamed from: com.google.firebase.perf.v1.c$c, reason: collision with other inner class name */
    public static final class C0143c {
        public static final MapEntryLite<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.registerDefaultInstance(c.class, cVar);
    }

    public static void c(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 1;
        cVar.googleAppId_ = str;
    }

    public static void d(c cVar, ApplicationProcessState applicationProcessState) {
        cVar.getClass();
        cVar.applicationProcessState_ = applicationProcessState.getNumber();
        cVar.bitField0_ |= 8;
    }

    public static MapFieldLite f(c cVar) {
        if (!cVar.customAttributes_.isMutable()) {
            cVar.customAttributes_ = cVar.customAttributes_.mutableCopy();
        }
        return cVar.customAttributes_;
    }

    public static void g(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 2;
        cVar.appInstanceId_ = str;
    }

    public static void h(c cVar, com.google.firebase.perf.v1.a aVar) {
        cVar.getClass();
        aVar.getClass();
        cVar.androidAppInfo_ = aVar;
        cVar.bitField0_ |= 4;
    }

    public static c n() {
        return DEFAULT_INSTANCE;
    }

    public static b r() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", ApplicationProcessState.b.a, "customAttributes_", C0143c.a});
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

    public final boolean hasGoogleAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    public final com.google.firebase.perf.v1.a m() {
        com.google.firebase.perf.v1.a aVar = this.androidAppInfo_;
        return aVar == null ? com.google.firebase.perf.v1.a.g() : aVar;
    }

    public final boolean o() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean p() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean q() {
        return (this.bitField0_ & 8) != 0;
    }
}
