package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import h7.C6833f0;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
final class b implements a {
    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final void close(long j11, long j12, long j13, long j14, long j15) {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final long initialize(byte[] bArr, long j11, long j12, long j13, long j14, long j15) {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final long initializeFrameBufferReleaseCallback(long j11) {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final long initializeFrameManager() {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final long initializeIsolationCallback() {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final long initializeResultsCallback() {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final byte[] process(long j11, long j12, long j13, byte[] bArr, int i11, int i12, int i13, int i14) {
        return C6833f0.b().zbl();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final byte[] processBitmap(long j11, long j12, Bitmap bitmap, int i11, int i12, int i13, int i14) {
        return C6833f0.b().zbl();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final byte[] processYuvFrame(long j11, long j12, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, int i16) {
        return C6833f0.b().zbl();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final void start(long j11) throws PipelineException {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final boolean stop(long j11) {
        return true;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final void waitUntilIdle(long j11) throws PipelineException {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final void zba() {
    }
}
