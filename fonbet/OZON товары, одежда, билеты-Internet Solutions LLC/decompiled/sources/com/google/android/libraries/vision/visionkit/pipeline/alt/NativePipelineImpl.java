package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq;
import h7.C6833f0;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
class NativePipelineImpl implements a {

    /* renamed from: a, reason: collision with root package name */
    private zbtp f57870a;

    /* renamed from: b, reason: collision with root package name */
    private c f57871b;

    /* renamed from: c, reason: collision with root package name */
    private c f57872c;

    /* renamed from: d, reason: collision with root package name */
    private c f57873d;

    public NativePipelineImpl(c cVar, c cVar2, c cVar3, zbtp zbtpVar) {
        this.f57871b = cVar;
        this.f57872c = cVar2;
        this.f57873d = cVar3;
        this.f57870a = zbtpVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native void close(long j11, long j12, long j13, long j14, long j15);

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void closeFileDescriptor(int i11) {
        this.f57873d.getClass();
        Log.w("VKP", "closeFileDescriptor called but is not available for this pipeline. Ignoring call.");
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initialize(byte[] bArr, long j11, long j12, long j13, long j14, long j15);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeFrameBufferReleaseCallback(long j11);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeFrameManager();

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeIsolationCallback();

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeResultsCallback();

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onReleaseAtTimestampUs(long j11) {
        this.f57871b.a(j11);
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onResult(byte[] bArr) {
        try {
            C6833f0 c11 = C6833f0.c(bArr, this.f57870a);
            c cVar = this.f57872c;
            cVar.getClass();
            zbcq.zba.zbb(cVar, "Pipeline received results: ".concat(String.valueOf(c11)), new Object[0]);
        } catch (zbuq e11) {
            zbcq.zba.zba(e11, "Error in result from JNI layer", new Object[0]);
        }
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public int openFileDescriptor(String str) {
        this.f57873d.getClass();
        Log.w("VKP", "openFileDescriptor called but is not available for this pipeline. Ignoring call.");
        return -1;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native byte[] process(long j11, long j12, long j13, byte[] bArr, int i11, int i12, int i13, int i14);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native byte[] processBitmap(long j11, long j12, Bitmap bitmap, int i11, int i12, int i13, int i14);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native byte[] processYuvFrame(long j11, long j12, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, int i16);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native void start(long j11) throws PipelineException;

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native boolean stop(long j11);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native void waitUntilIdle(long j11) throws PipelineException;

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final void zba() {
        this.f57870a = null;
        this.f57871b = null;
        this.f57872c = null;
        this.f57873d = null;
    }
}
