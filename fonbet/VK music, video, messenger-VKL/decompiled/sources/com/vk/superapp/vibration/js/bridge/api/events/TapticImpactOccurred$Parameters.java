package com.vk.superapp.vibration.js.bridge.api.events;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TapticImpactOccurred.kt */
/* loaded from: classes6.dex */
public final class TapticImpactOccurred$Parameters implements ad6 {

    @pmi0("disable_vibration_fallback")
    private final Boolean disableVibrationFallback;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final Style style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TapticImpactOccurred.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;

        @pmi0("heavy")
        public static final Style HEAVY;

        @pmi0("light")
        public static final Style LIGHT;

        @pmi0("medium")
        public static final Style MEDIUM;

        static {
            Style style = new Style("LIGHT", 0);
            LIGHT = style;
            Style style2 = new Style("MEDIUM", 1);
            MEDIUM = style2;
            Style style3 = new Style("HEAVY", 2);
            HEAVY = style3;
            Style[] styleArr = {style, style2, style3};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
        }

        private Style(String str, int i) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public TapticImpactOccurred$Parameters(Style style, String str, Boolean bool) {
        this.style = style;
        this.requestId = str;
        this.disableVibrationFallback = bool;
    }

    public static final TapticImpactOccurred$Parameters a(TapticImpactOccurred$Parameters tapticImpactOccurred$Parameters) {
        return tapticImpactOccurred$Parameters.requestId == null ? new TapticImpactOccurred$Parameters(tapticImpactOccurred$Parameters.style, "default_request_id", tapticImpactOccurred$Parameters.disableVibrationFallback) : tapticImpactOccurred$Parameters;
    }

    public static final void b(TapticImpactOccurred$Parameters tapticImpactOccurred$Parameters) {
        if (tapticImpactOccurred$Parameters.style == null) {
            throw new IllegalArgumentException("Value of non-nullable member style cannot be\n                        null");
        }
        if (tapticImpactOccurred$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final Boolean c() {
        return this.disableVibrationFallback;
    }

    public final Style d() {
        return this.style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapticImpactOccurred$Parameters)) {
            return false;
        }
        TapticImpactOccurred$Parameters tapticImpactOccurred$Parameters = (TapticImpactOccurred$Parameters) obj;
        return this.style == tapticImpactOccurred$Parameters.style && epx.f(this.requestId, tapticImpactOccurred$Parameters.requestId) && epx.f(this.disableVibrationFallback, tapticImpactOccurred$Parameters.disableVibrationFallback);
    }

    public final int hashCode() {
        int a = urd0.a(this.style.hashCode() * 31, 31, this.requestId);
        Boolean bool = this.disableVibrationFallback;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(style=");
        sb.append(this.style);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", disableVibrationFallback=");
        return tn.a(sb, this.disableVibrationFallback, ')');
    }

    public /* synthetic */ TapticImpactOccurred$Parameters(Style style, String str, Boolean bool, int i, zcl zclVar) {
        this(style, str, (i & 4) != 0 ? null : bool);
    }
}
