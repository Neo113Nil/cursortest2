package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final f2 DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 5;
    public static final int MAX_SESSION_LEN_FIELD_NUMBER = 6;
    private static volatile Parser<f2> PARSER = null;
    public static final int RAW_IMP_URL_FIELD_NUMBER = 2;
    public static final int RETRY_COUNT_FIELD_NUMBER = 4;
    public static final int SESSION_EXP_FIELD_NUMBER = 3;
    public static final int SUPPORTED_NETWORKS_FIELD_NUMBER = 8;
    public static final int UPLOAD_INTERVAL_FIELD_NUMBER = 7;
    private static final Internal.ListAdapter.Converter<Integer, i2> supportedNetworks_converter_ = new d2();
    private boolean enabled_;
    private int maxBatchSize_;
    private int maxSessionLen_;
    private int retryCount_;
    private int sessionExp_;
    private int supportedNetworksMemoizedSerializedSize;
    private int uploadInterval_;
    private String rawImpUrl_ = "";
    private Internal.IntList supportedNetworks_ = GeneratedMessageLite.emptyIntList();

    static {
        f2 f2Var = new f2();
        DEFAULT_INSTANCE = f2Var;
        GeneratedMessageLite.registerDefaultInstance(f2.class, f2Var);
    }

    public static f2 h() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (l1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new f2();
            case 2:
                return new e2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b,", new Object[]{"enabled_", "rawImpUrl_", "sessionExp_", "retryCount_", "maxBatchSize_", "maxSessionLen_", "uploadInterval_", "supportedNetworks_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<f2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (f2.class) {
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

    public final boolean getEnabled() {
        return this.enabled_;
    }

    public final int getMaxBatchSize() {
        return this.maxBatchSize_;
    }

    public final int i() {
        return this.maxSessionLen_;
    }

    public final String j() {
        return this.rawImpUrl_;
    }

    public final int k() {
        return this.sessionExp_;
    }

    public final Internal.ListAdapter l() {
        return new Internal.ListAdapter(this.supportedNetworks_, supportedNetworks_converter_);
    }

    public final int m() {
        return this.uploadInterval_;
    }
}
