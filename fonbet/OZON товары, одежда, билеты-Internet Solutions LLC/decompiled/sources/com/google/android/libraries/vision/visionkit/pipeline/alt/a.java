package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
interface a {
    void close(long j11, long j12, long j13, long j14, long j15);

    long initialize(byte[] bArr, long j11, long j12, long j13, long j14, long j15);

    long initializeFrameBufferReleaseCallback(long j11);

    long initializeFrameManager();

    long initializeIsolationCallback();

    long initializeResultsCallback();

    byte[] process(long j11, long j12, long j13, byte[] bArr, int i11, int i12, int i13, int i14);

    byte[] processBitmap(long j11, long j12, Bitmap bitmap, int i11, int i12, int i13, int i14);

    byte[] processYuvFrame(long j11, long j12, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, int i16);

    void start(long j11) throws PipelineException;

    boolean stop(long j11);

    void waitUntilIdle(long j11) throws PipelineException;

    void zba();
}
