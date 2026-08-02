package com.vk.media.pipeline.audio;

import xsna.asp;
import xsna.lhg;
import xsna.shy;
import xsna.zrp;

/* compiled from: AudioPcm.kt */
/* loaded from: classes3.dex */
public final class AudioPcm {
    public final int a;
    public final int b;
    public final EncodingType c;
    public final boolean d;
    public final int e;
    public final double f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPcm.kt */
    public static final class EncodingType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EncodingType[] $VALUES;
        public static final EncodingType PCM_16BIT;
        public static final EncodingType PCM_16BIT_BIG_ENDIAN;
        public static final EncodingType PCM_24BIT;
        public static final EncodingType PCM_24BIT_BIG_ENDIAN;
        public static final EncodingType PCM_32BIT;
        public static final EncodingType PCM_32BIT_BIG_ENDIAN;
        public static final EncodingType PCM_8BIT;
        public static final EncodingType PCM_FLOAT;
        public static final EncodingType UNSET;

        static {
            EncodingType encodingType = new EncodingType("UNSET", 0);
            UNSET = encodingType;
            EncodingType encodingType2 = new EncodingType("PCM_8BIT", 1);
            PCM_8BIT = encodingType2;
            EncodingType encodingType3 = new EncodingType("PCM_16BIT", 2);
            PCM_16BIT = encodingType3;
            EncodingType encodingType4 = new EncodingType("PCM_16BIT_BIG_ENDIAN", 3);
            PCM_16BIT_BIG_ENDIAN = encodingType4;
            EncodingType encodingType5 = new EncodingType("PCM_24BIT", 4);
            PCM_24BIT = encodingType5;
            EncodingType encodingType6 = new EncodingType("PCM_24BIT_BIG_ENDIAN", 5);
            PCM_24BIT_BIG_ENDIAN = encodingType6;
            EncodingType encodingType7 = new EncodingType("PCM_32BIT", 6);
            PCM_32BIT = encodingType7;
            EncodingType encodingType8 = new EncodingType("PCM_32BIT_BIG_ENDIAN", 7);
            PCM_32BIT_BIG_ENDIAN = encodingType8;
            EncodingType encodingType9 = new EncodingType("PCM_FLOAT", 8);
            PCM_FLOAT = encodingType9;
            EncodingType[] encodingTypeArr = {encodingType, encodingType2, encodingType3, encodingType4, encodingType5, encodingType6, encodingType7, encodingType8, encodingType9};
            $VALUES = encodingTypeArr;
            $ENTRIES = new asp(encodingTypeArr);
        }

        public EncodingType() {
            throw null;
        }

        public static EncodingType valueOf(String str) {
            return (EncodingType) Enum.valueOf(EncodingType.class, str);
        }

        public static EncodingType[] values() {
            return (EncodingType[]) $VALUES.clone();
        }
    }

    public AudioPcm(int i, int i2, EncodingType encodingType) {
        this.a = i;
        this.b = i2;
        this.c = encodingType;
        this.d = (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || encodingType == EncodingType.UNSET) ? false : true;
        if (i != Integer.MIN_VALUE && i <= 0) {
            throw new IllegalArgumentException(lhg.a(i, "Wrong sample rate=").toString());
        }
        if (i2 != Integer.MIN_VALUE && i2 <= 0) {
            throw new IllegalArgumentException(lhg.a(i2, "Wrong channel count=").toString());
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = Integer.MIN_VALUE;
        } else if (encodingType == EncodingType.UNSET || encodingType == EncodingType.PCM_16BIT || encodingType == EncodingType.PCM_16BIT_BIG_ENDIAN) {
            i2 *= 2;
        } else if (encodingType != EncodingType.PCM_8BIT) {
            if (encodingType == EncodingType.PCM_24BIT || encodingType == EncodingType.PCM_24BIT_BIG_ENDIAN) {
                i2 *= 3;
            } else {
                if (encodingType != EncodingType.PCM_32BIT && encodingType != EncodingType.PCM_32BIT_BIG_ENDIAN && encodingType != EncodingType.PCM_FLOAT) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                i2 *= 4;
            }
        }
        this.e = i2;
        if (i2 <= 0 && i2 != Integer.MIN_VALUE) {
            throw new IllegalStateException(lhg.a(i2, "illegal amount of bytesPerSample=").toString());
        }
        this.f = (1000000.0d / i) / i2;
    }

    public static AudioPcm a(AudioPcm audioPcm, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = audioPcm.a;
        }
        if ((i3 & 2) != 0) {
            i2 = audioPcm.b;
        }
        return new AudioPcm(i, i2, audioPcm.c);
    }

    public final long b(int i) {
        return (long) (((i > 0 ? i / this.e : 0) * 1000000.0f) / this.a);
    }

    public final int c(long j) {
        if (j <= 0) {
            return 0;
        }
        int i = (int) (j / this.f);
        int i2 = this.e;
        return i % i2 != 0 ? i - (i % i2) : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPcm)) {
            return false;
        }
        AudioPcm audioPcm = (AudioPcm) obj;
        return this.a == audioPcm.a && this.b == audioPcm.b && this.c == audioPcm.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AudioPcm(sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ')';
    }
}
