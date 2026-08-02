package com.vk.medianative;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.medianative.AudioNative;
import java.nio.ByteBuffer;
import xsna.a44;
import xsna.as4;
import xsna.de4;
import xsna.gzs;
import xsna.s3q0;
import xsna.wr4;
import xsna.xr4;
import xsna.zr4;

/* compiled from: AudioNative.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class AudioNative {
    public static final AudioNative INSTANCE = new AudioNative();
    public static volatile boolean a;

    @Keep
    public static volatile Context context;

    public static int a(int i, int i2, String str) {
        return INSTANCE.nativeAudioStartRecord(str, i, i2);
    }

    public static final NativeError audioGetIoError() {
        AudioNative audioNative = INSTANCE;
        audioNative.getClass();
        h();
        return audioNative.nativeGetAudioIoError();
    }

    public static final long audioGetTotalPcmDuration() {
        AudioNative audioNative = INSTANCE;
        de4 de4Var = new de4(1);
        audioNative.getClass();
        return ((Number) (h() ? de4Var.invoke() : 0L)).longValue();
    }

    public static final byte[] audioGetWaveform(short[] sArr, int i) {
        AudioNative audioNative = INSTANCE;
        as4 as4Var = new as4(sArr, i, 0);
        audioNative.getClass();
        return (byte[]) (h() ? as4Var.invoke() : new byte[0]);
    }

    public static final void audioReadOpusFile(ByteBuffer byteBuffer, int i, int[] iArr) {
        AudioNative audioNative = INSTANCE;
        zr4 zr4Var = new zr4(byteBuffer, i, iArr);
        audioNative.getClass();
        if (h()) {
            zr4Var.invoke();
        } else {
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public static final int audioSeekOpusFile(float f) {
        AudioNative audioNative = INSTANCE;
        audioNative.getClass();
        h();
        return audioNative.nativeAudioSeekOpusFile(f);
    }

    public static final int audioStartRecord(final String str, final int i, final int i2) {
        AudioNative audioNative = INSTANCE;
        gzs gzsVar = new gzs() { // from class: xsna.yr4
            @Override // xsna.gzs
            public final Object invoke() {
                return Integer.valueOf(AudioNative.a(i, i2, str));
            }
        };
        audioNative.getClass();
        return ((Number) (h() ? gzsVar.invoke() : 0)).intValue();
    }

    public static final void audioStopRecord() {
        AudioNative audioNative = INSTANCE;
        a44 a44Var = new a44(1);
        audioNative.getClass();
        if (h()) {
            a44Var.invoke();
        } else {
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public static final int audioWriteFrame(ByteBuffer byteBuffer, int i) {
        AudioNative audioNative = INSTANCE;
        wr4 wr4Var = new wr4(byteBuffer, i, 0);
        audioNative.getClass();
        return ((Number) (h() ? wr4Var.invoke() : 0)).intValue();
    }

    public static long b() {
        return INSTANCE.nativeAudioGetTotalPcmDuration();
    }

    public static int c(int i, ByteBuffer byteBuffer) {
        return INSTANCE.nativeAudioWriteFrame(byteBuffer, i);
    }

    public static s3q0 d() {
        INSTANCE.nativeAudioStopRecord();
        return s3q0.a;
    }

    public static s3q0 e(ByteBuffer byteBuffer, int i, int[] iArr) {
        INSTANCE.nativeAudioReadOpusFile(byteBuffer, i, iArr);
        return s3q0.a;
    }

    public static byte[] f(short[] sArr, int i) {
        return INSTANCE.nativeAudioGetWaveform(sArr, i);
    }

    public static int g(String str) {
        return INSTANCE.nativeAudioOpenOpusFile(str);
    }

    public static boolean h() {
        if (a) {
            return true;
        }
        synchronized (AudioNative.class) {
            if (a) {
                return true;
            }
            try {
                a = NativeLibLoader.j(NativeLibLoader.a, NativeLib.VK_MEDIA);
                return a;
            } catch (UnsatisfiedLinkError unused) {
                return false;
            }
        }
    }

    private final native long nativeAudioGetTotalPcmDuration();

    private final native byte[] nativeAudioGetWaveform(short[] sArr, int i);

    private final native int nativeAudioOpenOpusFile(String str);

    private final native void nativeAudioReadOpusFile(ByteBuffer byteBuffer, int i, int[] iArr);

    private final native int nativeAudioSeekOpusFile(float f);

    private final native int nativeAudioStartRecord(String str, int i, int i2);

    private final native void nativeAudioStopRecord();

    private final native int nativeAudioWriteFrame(ByteBuffer byteBuffer, int i);

    private final native NativeError nativeGetAudioIoError();

    public static final int openOpusFile(String str) {
        AudioNative audioNative = INSTANCE;
        xr4 xr4Var = new xr4(str, 0);
        audioNative.getClass();
        return ((Number) (h() ? xr4Var.invoke() : 0)).intValue();
    }
}
