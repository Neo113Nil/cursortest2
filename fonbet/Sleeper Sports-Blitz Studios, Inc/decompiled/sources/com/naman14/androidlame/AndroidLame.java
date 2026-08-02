package com.naman14.androidlame;

import com.naman14.androidlame.LameBuilder;

/* loaded from: classes8.dex */
public class AndroidLame {
    private static native int encodeBufferInterleaved(short[] sArr, int i, byte[] bArr);

    private static native void initialize(int i, int i2, int i3, int i4, float f, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, String str4, String str5);

    private static native void initializeDefault();

    private static native void lameClose();

    private static native int lameEncode(short[] sArr, short[] sArr2, int i, byte[] bArr);

    private static native int lameFlush(byte[] bArr);

    static {
        System.loadLibrary("androidlame");
    }

    public AndroidLame() {
        initializeDefault();
    }

    public AndroidLame(LameBuilder lameBuilder) {
        initialize(lameBuilder);
    }

    private void initialize(LameBuilder lameBuilder) {
        initialize(lameBuilder.inSampleRate, lameBuilder.outChannel, lameBuilder.outSampleRate, lameBuilder.outBitrate, lameBuilder.scaleInput, getIntForMode(lameBuilder.mode), getIntForVbrMode(lameBuilder.vbrMode), lameBuilder.quality, lameBuilder.vbrQuality, lameBuilder.abrMeanBitrate, lameBuilder.lowpassFreq, lameBuilder.highpassFreq, lameBuilder.id3tagTitle, lameBuilder.id3tagArtist, lameBuilder.id3tagAlbum, lameBuilder.id3tagYear, lameBuilder.id3tagComment);
    }

    public int encode(short[] sArr, short[] sArr2, int i, byte[] bArr) {
        return lameEncode(sArr, sArr2, i, bArr);
    }

    public int encodeBufferInterLeaved(short[] sArr, int i, byte[] bArr) {
        return encodeBufferInterleaved(sArr, i, bArr);
    }

    public int flush(byte[] bArr) {
        return lameFlush(bArr);
    }

    public void close() {
        lameClose();
    }

    private static int getIntForMode(LameBuilder.Mode mode) {
        int i = AnonymousClass1.$SwitchMap$com$naman14$androidlame$LameBuilder$Mode[mode.ordinal()];
        int i2 = 1;
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    return -1;
                }
            }
        }
        return i2;
    }

    /* renamed from: com.naman14.androidlame.AndroidLame$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$naman14$androidlame$LameBuilder$Mode;
        static final /* synthetic */ int[] $SwitchMap$com$naman14$androidlame$LameBuilder$VbrMode;

        static {
            int[] iArr = new int[LameBuilder.VbrMode.values().length];
            $SwitchMap$com$naman14$androidlame$LameBuilder$VbrMode = iArr;
            try {
                iArr[LameBuilder.VbrMode.VBR_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$naman14$androidlame$LameBuilder$VbrMode[LameBuilder.VbrMode.VBR_RH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$naman14$androidlame$LameBuilder$VbrMode[LameBuilder.VbrMode.VBR_ABR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$naman14$androidlame$LameBuilder$VbrMode[LameBuilder.VbrMode.VBR_MTRH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$naman14$androidlame$LameBuilder$VbrMode[LameBuilder.VbrMode.VBR_DEFAUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[LameBuilder.Mode.values().length];
            $SwitchMap$com$naman14$androidlame$LameBuilder$Mode = iArr2;
            try {
                iArr2[LameBuilder.Mode.STEREO.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$naman14$androidlame$LameBuilder$Mode[LameBuilder.Mode.JSTEREO.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$naman14$androidlame$LameBuilder$Mode[LameBuilder.Mode.MONO.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$naman14$androidlame$LameBuilder$Mode[LameBuilder.Mode.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private static int getIntForVbrMode(LameBuilder.VbrMode vbrMode) {
        int i = AnonymousClass1.$SwitchMap$com$naman14$androidlame$LameBuilder$VbrMode[vbrMode.ordinal()];
        if (i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    return i != 5 ? -1 : 6;
                }
            }
        }
        return i2;
    }
}
