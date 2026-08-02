package com.vk.superapp.vibration.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TapticNotificationOccurred.kt */
/* loaded from: classes6.dex */
public final class TapticNotificationOccurred$Parameters implements ad6 {

    @pmi0("disable_vibration_fallback")
    private final Boolean disableVibrationFallback;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TapticNotificationOccurred.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("error")
        public static final Type ERROR;

        @pmi0("success")
        public static final Type SUCCESS;

        @pmi0("warning")
        public static final Type WARNING;

        static {
            Type type = new Type("ERROR", 0);
            ERROR = type;
            Type type2 = new Type("SUCCESS", 1);
            SUCCESS = type2;
            Type type3 = new Type("WARNING", 2);
            WARNING = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public TapticNotificationOccurred$Parameters(Type type, String str, Boolean bool) {
        this.type = type;
        this.requestId = str;
        this.disableVibrationFallback = bool;
    }

    public static final TapticNotificationOccurred$Parameters a(TapticNotificationOccurred$Parameters tapticNotificationOccurred$Parameters) {
        return tapticNotificationOccurred$Parameters.requestId == null ? new TapticNotificationOccurred$Parameters(tapticNotificationOccurred$Parameters.type, "default_request_id", tapticNotificationOccurred$Parameters.disableVibrationFallback) : tapticNotificationOccurred$Parameters;
    }

    public static final void b(TapticNotificationOccurred$Parameters tapticNotificationOccurred$Parameters) {
        if (tapticNotificationOccurred$Parameters.type == null) {
            throw new IllegalArgumentException("Value of non-nullable member type cannot be\n                        null");
        }
        if (tapticNotificationOccurred$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final Boolean c() {
        return this.disableVibrationFallback;
    }

    public final Type d() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapticNotificationOccurred$Parameters)) {
            return false;
        }
        TapticNotificationOccurred$Parameters tapticNotificationOccurred$Parameters = (TapticNotificationOccurred$Parameters) obj;
        return this.type == tapticNotificationOccurred$Parameters.type && epx.f(this.requestId, tapticNotificationOccurred$Parameters.requestId) && epx.f(this.disableVibrationFallback, tapticNotificationOccurred$Parameters.disableVibrationFallback);
    }

    public final int hashCode() {
        int a = urd0.a(this.type.hashCode() * 31, 31, this.requestId);
        Boolean bool = this.disableVibrationFallback;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(type=");
        sb.append(this.type);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", disableVibrationFallback=");
        return tn.a(sb, this.disableVibrationFallback, ')');
    }

    public /* synthetic */ TapticNotificationOccurred$Parameters(Type type, String str, Boolean bool, int i, zcl zclVar) {
        this(type, str, (i & 4) != 0 ? null : bool);
    }
}
