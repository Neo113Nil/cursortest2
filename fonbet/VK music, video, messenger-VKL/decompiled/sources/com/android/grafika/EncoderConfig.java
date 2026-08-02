package com.android.grafika;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes12.dex */
public final class EncoderConfig {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final CBRMode h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CBRMode {
        private static final /* synthetic */ CBRMode[] $VALUES;
        public static final CBRMode DISABLED;
        public static final CBRMode ENABLED;
        public static final CBRMode ENFORCED;

        static {
            CBRMode cBRMode = new CBRMode("DISABLED", 0);
            DISABLED = cBRMode;
            CBRMode cBRMode2 = new CBRMode("ENABLED", 1);
            ENABLED = cBRMode2;
            CBRMode cBRMode3 = new CBRMode("ENFORCED", 2);
            ENFORCED = cBRMode3;
            $VALUES = new CBRMode[]{cBRMode, cBRMode2, cBRMode3};
        }

        public CBRMode() {
            throw null;
        }

        public static CBRMode valueOf(String str) {
            return (CBRMode) Enum.valueOf(CBRMode.class, str);
        }

        public static CBRMode[] values() {
            return (CBRMode[]) $VALUES.clone();
        }
    }

    public EncoderConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, CBRMode cBRMode) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = cBRMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EncoderConfig.class == obj.getClass()) {
            EncoderConfig encoderConfig = (EncoderConfig) obj;
            if (this.a == encoderConfig.a && this.b == encoderConfig.b && this.c == encoderConfig.c && this.d == encoderConfig.d && this.e == encoderConfig.e && this.f == encoderConfig.f && this.h == encoderConfig.h && this.g == encoderConfig.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), this.h);
    }

    @NonNull
    public final String toString() {
        return "EncoderConfig{width=" + this.a + ", height=" + this.b + ", rotation=" + this.c + ", bitrate=" + this.d + ", bitrateMarginPercent= " + this.e + ", frameRate=" + this.f + ", iframeIntervalSeconds=" + this.g + ", cbrMode= " + this.h + '}';
    }
}
