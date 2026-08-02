package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ACCESSIBILITY_CAPTIONING_ENABLED_FIELD_NUMBER = 1;
    public static final int ACCESSIBILITY_LARGE_POINTER_ICON_FIELD_NUMBER = 2;
    private static final k DEFAULT_INSTANCE;
    public static final int FONT_SCALE_FIELD_NUMBER = 4;
    private static volatile Parser<k> PARSER = null;
    public static final int REDUCE_BRIGHT_COLORS_ACTIVATED_FIELD_NUMBER = 3;
    private boolean accessibilityCaptioningEnabled_;
    private boolean accessibilityLargePointerIcon_;
    private int bitField0_;
    private float fontScale_;
    private boolean reduceBrightColorsActivated_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        GeneratedMessageLite.registerDefaultInstance(k.class, kVar);
    }

    public static j h() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new j(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003", new Object[]{"bitField0_", "accessibilityCaptioningEnabled_", "accessibilityLargePointerIcon_", "reduceBrightColorsActivated_", "fontScale_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<k> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (k.class) {
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
        this.accessibilityCaptioningEnabled_ = z;
    }

    public final void j(boolean z) {
        this.bitField0_ |= 2;
        this.accessibilityLargePointerIcon_ = z;
    }

    public final void k(boolean z) {
        this.bitField0_ |= 4;
        this.reduceBrightColorsActivated_ = z;
    }

    public final void setFontScale(float f) {
        this.bitField0_ |= 8;
        this.fontScale_ = f;
    }
}
