package com.moloco.sdk;

import android.os.Build;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class r3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final r3 DEFAULT_INSTANCE;
    public static final int MODEL_FIELD_NUMBER = 3;
    public static final int OS_FIELD_NUMBER = 1;
    public static final int OS_VER_FIELD_NUMBER = 2;
    private static volatile Parser<r3> PARSER = null;
    public static final int SCREEN_SCALE_FIELD_NUMBER = 4;
    private int os_;
    private float screenScale_;
    private String osVer_ = "";
    private String model_ = "";

    static {
        r3 r3Var = new r3();
        DEFAULT_INSTANCE = r3Var;
        GeneratedMessageLite.registerDefaultInstance(r3.class, r3Var);
    }

    public static p3 h() {
        return (p3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new r3();
            case 2:
                return new p3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0001", new Object[]{"os_", "osVer_", "model_", "screenScale_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<r3> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (r3.class) {
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

    public final void i(String str) {
        this.model_ = str;
    }

    public final void j() {
        this.os_ = q3.ANDROID.getNumber();
    }

    public final void k() {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        this.osVer_ = str;
    }

    public final void l(float f) {
        this.screenScale_ = f;
    }
}
