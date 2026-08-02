package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq;
import h7.C6833f0;
import h7.C6867x;
import h7.C6869y;
import h7.N;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final C6869y f57874a;

    /* renamed from: b, reason: collision with root package name */
    private final a f57875b;

    /* renamed from: c, reason: collision with root package name */
    private long f57876c;

    /* renamed from: d, reason: collision with root package name */
    private final long f57877d;

    /* renamed from: e, reason: collision with root package name */
    private final long f57878e;

    /* renamed from: f, reason: collision with root package name */
    private final long f57879f;

    /* renamed from: g, reason: collision with root package name */
    private final long f57880g;

    /* renamed from: h, reason: collision with root package name */
    protected final zbtp f57881h;

    public c(N n11) {
        zbtp zbb = zbtp.zbb();
        zbb = zbb == null ? zbtp.zba() : zbb;
        if (n11.g()) {
            this.f57875b = new b();
        } else if (n11.f()) {
            this.f57875b = new NativePipelineImpl(this, this, this, zbb);
        } else {
            NativePipelineImpl nativePipelineImpl = new NativePipelineImpl(this, this, this, zbb);
            System.loadLibrary("mlkit_google_ocr_pipeline");
            this.f57875b = nativePipelineImpl;
        }
        if (n11.zbi()) {
            this.f57874a = new C6869y(n11.a());
        } else {
            this.f57874a = new C6869y(10);
        }
        this.f57881h = zbb;
        long initializeFrameManager = this.f57875b.initializeFrameManager();
        this.f57877d = initializeFrameManager;
        long initializeFrameBufferReleaseCallback = this.f57875b.initializeFrameBufferReleaseCallback(initializeFrameManager);
        this.f57878e = initializeFrameBufferReleaseCallback;
        long initializeResultsCallback = this.f57875b.initializeResultsCallback();
        this.f57879f = initializeResultsCallback;
        long initializeIsolationCallback = this.f57875b.initializeIsolationCallback();
        this.f57880g = initializeIsolationCallback;
        this.f57876c = this.f57875b.initialize(n11.zbl(), initializeFrameBufferReleaseCallback, initializeResultsCallback, initializeIsolationCallback, 0L, 0L);
    }

    public final void a(long j11) {
        this.f57874a.a(j11);
    }

    public final zbki b(C6867x c6867x) {
        if (this.f57876c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (this.f57874a.b(c6867x, c6867x.a())) {
            byte[] process = this.f57875b.process(this.f57876c, this.f57877d, c6867x.a(), c6867x.c(), c6867x.b().zbb(), c6867x.b().zba(), c6867x.d() - 1, c6867x.e() - 1);
            if (process != null) {
                try {
                    return zbki.zbe(C6833f0.c(process, this.f57881h));
                } catch (zbuq e11) {
                    throw new IllegalStateException("Could not parse results", e11);
                }
            }
        }
        return zbki.zbd();
    }

    public final synchronized void c() {
        long j11 = this.f57876c;
        if (j11 != 0) {
            this.f57875b.stop(j11);
            this.f57875b.close(this.f57876c, this.f57877d, this.f57878e, this.f57879f, this.f57880g);
            this.f57876c = 0L;
            this.f57875b.zba();
        }
    }

    public final void d() throws PipelineException {
        a aVar = this.f57875b;
        long j11 = this.f57876c;
        if (j11 == 0) {
            throw new PipelineException(d.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
        }
        try {
            aVar.start(j11);
            aVar.waitUntilIdle(this.f57876c);
        } catch (PipelineException e11) {
            aVar.stop(this.f57876c);
            throw e11;
        }
    }

    public final void e() {
        long j11 = this.f57876c;
        if (j11 == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (!this.f57875b.stop(j11)) {
            throw new IllegalStateException("Pipeline did not stop successfully.");
        }
    }

    public final zbki f(long j11, Bitmap bitmap, int i11) {
        if (this.f57876c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Unsupported bitmap config ".concat(String.valueOf(bitmap.getConfig())));
        }
        byte[] processBitmap = this.f57875b.processBitmap(this.f57876c, j11, bitmap, bitmap.getWidth(), bitmap.getHeight(), 0, i11 - 1);
        if (processBitmap == null) {
            return zbki.zbd();
        }
        try {
            return zbki.zbe(C6833f0.c(processBitmap, this.f57881h));
        } catch (zbuq e11) {
            throw new IllegalStateException("Could not parse results", e11);
        }
    }

    public final zbki g(long j11, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (this.f57876c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalStateException("Byte buffers are not direct.");
        }
        byte[] processYuvFrame = this.f57875b.processYuvFrame(this.f57876c, j11, byteBuffer, byteBuffer2, byteBuffer3, i11, i12, i13, i14, i15, i16 - 1);
        if (processYuvFrame == null) {
            return zbki.zbd();
        }
        try {
            return zbki.zbe(C6833f0.c(processYuvFrame, this.f57881h));
        } catch (zbuq e11) {
            throw new IllegalStateException("Could not parse results", e11);
        }
    }
}
