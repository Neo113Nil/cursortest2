package com.moloco.sdk;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACCESSIBILITY_INFO_FIELD_NUMBER = 11;
    public static final int AD_INFO_FIELD_NUMBER = 8;
    public static final int AUDIO_INFO_FIELD_NUMBER = 10;
    public static final int BATTERY_INFO_FIELD_NUMBER = 9;
    private static final q0 DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 3;
    public static final int DIR_INFO_FIELD_NUMBER = 6;
    public static final int IDFV_FIELD_NUMBER = 1;
    public static final int IMP_LVL_REV_DATA_FIELD_NUMBER = 12;
    public static final int INFO_FIELD_NUMBER = 4;
    public static final int MEMORY_INFO_FIELD_NUMBER = 5;
    public static final int NETWORK_INFO_FIELD_NUMBER = 7;
    private static volatile Parser<q0> PARSER = null;
    public static final int PRIVACY_FIELD_NUMBER = 2;
    public static final int TEST_CONFIG_FIELD_NUMBER = 13;
    private k accessibilityInfo_;
    private m adInfo_;
    private p audioInfo_;
    private s batteryInfo_;
    private int bitField0_;
    private w device_;
    private y dirInfo_;
    private String idfv_ = "";
    private e0 impLvlRevData_;
    private n0 info_;
    private g0 memoryInfo_;
    private j0 networkInfo_;
    private l0 privacy_;
    private p0 testConfig_;

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        GeneratedMessageLite.registerDefaultInstance(q0.class, q0Var);
    }

    public static t h() {
        return (t) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new q0();
            case 2:
                return new t(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ለ\u0000\u0002\t\u0003\t\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fဉ\t\rဉ\n", new Object[]{"bitField0_", "idfv_", "privacy_", "device_", "info_", "memoryInfo_", "dirInfo_", "networkInfo_", "adInfo_", "batteryInfo_", "audioInfo_", "accessibilityInfo_", "impLvlRevData_", "testConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<q0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (q0.class) {
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

    public final void i(k kVar) {
        kVar.getClass();
        this.accessibilityInfo_ = kVar;
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final void j(m mVar) {
        mVar.getClass();
        this.adInfo_ = mVar;
        this.bitField0_ |= 32;
    }

    public final void k(p pVar) {
        pVar.getClass();
        this.audioInfo_ = pVar;
        this.bitField0_ |= 128;
    }

    public final void l(s sVar) {
        sVar.getClass();
        this.batteryInfo_ = sVar;
        this.bitField0_ |= 64;
    }

    public final void m(w wVar) {
        wVar.getClass();
        this.device_ = wVar;
    }

    public final void n(y yVar) {
        yVar.getClass();
        this.dirInfo_ = yVar;
        this.bitField0_ |= 8;
    }

    public final void o(e0 e0Var) {
        e0Var.getClass();
        this.impLvlRevData_ = e0Var;
        this.bitField0_ |= 512;
    }

    public final void p(n0 n0Var) {
        n0Var.getClass();
        this.info_ = n0Var;
        this.bitField0_ |= 2;
    }

    public final void q(g0 g0Var) {
        g0Var.getClass();
        this.memoryInfo_ = g0Var;
        this.bitField0_ |= 4;
    }

    public final void r(j0 j0Var) {
        j0Var.getClass();
        this.networkInfo_ = j0Var;
        this.bitField0_ |= 16;
    }

    public final void s(l0 l0Var) {
        l0Var.getClass();
        this.privacy_ = l0Var;
    }

    public final void t(p0 p0Var) {
        p0Var.getClass();
        this.testConfig_ = p0Var;
        this.bitField0_ |= 1024;
    }
}
