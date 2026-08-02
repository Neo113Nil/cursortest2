package com.google.android.libraries.barhopper;

import N7.a;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import g9.C6669a;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class BarhopperV3 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private long f57869a;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j11);

    private native long createNativeWithClientOptions(byte[] bArr);

    private static C6669a m(byte[] bArr) {
        bArr.getClass();
        try {
            return C6669a.b(bArr, zzds.zza());
        } catch (zzer e11) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e11);
        }
    }

    private native byte[] recognizeBitmapNative(long j11, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j11, int i11, int i12, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j11, int i11, int i12, byte[] bArr, RecognitionOptions recognitionOptions);

    public final void c(@NonNull a aVar) {
        if (this.f57869a != 0) {
            Log.w("BarhopperV3", "Native pointer already exists.");
            return;
        }
        long createNativeWithClientOptions = createNativeWithClientOptions(aVar.zzD());
        this.f57869a = createNativeWithClientOptions;
        if (createNativeWithClientOptions == 0) {
            throw new IllegalArgumentException("Failed to create native pointer with client options.");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j11 = this.f57869a;
        if (j11 != 0) {
            closeNative(j11);
            this.f57869a = 0L;
        }
    }

    @NonNull
    public final C6669a d(int i11, int i12, @NonNull ByteBuffer byteBuffer, @NonNull RecognitionOptions recognitionOptions) {
        long j11 = this.f57869a;
        if (j11 != 0) {
            return m(recognizeBufferNative(j11, i11, i12, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @NonNull
    public final C6669a j(int i11, int i12, @NonNull byte[] bArr, @NonNull RecognitionOptions recognitionOptions) {
        long j11 = this.f57869a;
        if (j11 != 0) {
            return m(recognizeNative(j11, i11, i12, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @NonNull
    public final C6669a k(@NonNull Bitmap bitmap, @NonNull RecognitionOptions recognitionOptions) {
        if (this.f57869a == 0) {
            throw new IllegalStateException("Native pointer does not exist.");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Log.d("BarhopperV3", "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return m(recognizeBitmapNative(this.f57869a, bitmap, recognitionOptions));
    }
}
