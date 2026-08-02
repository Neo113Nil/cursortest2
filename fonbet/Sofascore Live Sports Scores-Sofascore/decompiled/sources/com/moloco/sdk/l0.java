package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CCPA_FIELD_NUMBER = 1;
    public static final int COPPA_FIELD_NUMBER = 3;
    private static final l0 DEFAULT_INSTANCE;
    public static final int GDPR_FIELD_NUMBER = 2;
    private static volatile Parser<l0> PARSER = null;
    public static final int TCF_CONSENT_STRING_FIELD_NUMBER = 5;
    public static final int US_PRIVACY_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean ccpa_;
    private boolean coppa_;
    private boolean gdpr_;
    private String usPrivacy_ = "";
    private String tcfConsentString_ = "";

    static {
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        GeneratedMessageLite.registerDefaultInstance(l0.class, l0Var);
    }

    public static k0 h() {
        return (k0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new l0();
            case 2:
                return new k0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "ccpa_", "gdpr_", "coppa_", "usPrivacy_", "tcfConsentString_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<l0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (l0.class) {
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

    public final void i(boolean z) {
        this.bitField0_ |= 1;
        this.ccpa_ = z;
    }

    public final void j(boolean z) {
        this.bitField0_ |= 4;
        this.coppa_ = z;
    }

    public final void k(boolean z) {
        this.bitField0_ |= 2;
        this.gdpr_ = z;
    }

    public final void l(String str) {
        this.bitField0_ |= 16;
        this.tcfConsentString_ = str;
    }

    public final void m(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.usPrivacy_ = str;
    }
}
