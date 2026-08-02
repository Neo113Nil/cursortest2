package com.vk.auth.main;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AfterPhoneReuseVerificationWay.kt */
/* loaded from: classes15.dex */
public final class AfterPhoneReuseVerificationWay {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AfterPhoneReuseVerificationWay[] $VALUES;
    public static final AfterPhoneReuseVerificationWay BY_PHONE;
    public static final AfterPhoneReuseVerificationWay BY_PUSH;
    public static final a Companion;

    /* compiled from: AfterPhoneReuseVerificationWay.kt */
    public static final class a {
    }

    /* compiled from: AfterPhoneReuseVerificationWay.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AfterPhoneReuseVerificationWay.values().length];
            try {
                iArr[AfterPhoneReuseVerificationWay.BY_PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay = new AfterPhoneReuseVerificationWay("BY_PUSH", 0);
        BY_PUSH = afterPhoneReuseVerificationWay;
        AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay2 = new AfterPhoneReuseVerificationWay("BY_PHONE", 1);
        BY_PHONE = afterPhoneReuseVerificationWay2;
        AfterPhoneReuseVerificationWay[] afterPhoneReuseVerificationWayArr = {afterPhoneReuseVerificationWay, afterPhoneReuseVerificationWay2};
        $VALUES = afterPhoneReuseVerificationWayArr;
        $ENTRIES = new asp(afterPhoneReuseVerificationWayArr);
        Companion = new a();
    }

    public AfterPhoneReuseVerificationWay() {
        throw null;
    }

    public static AfterPhoneReuseVerificationWay valueOf(String str) {
        return (AfterPhoneReuseVerificationWay) Enum.valueOf(AfterPhoneReuseVerificationWay.class, str);
    }

    public static AfterPhoneReuseVerificationWay[] values() {
        return (AfterPhoneReuseVerificationWay[]) $VALUES.clone();
    }
}
