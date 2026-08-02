package com.vk.media.recorder.impl;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.vk.media.recorder.impl.BufferItem;
import com.vk.media.recorder.impl.Streamer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.d830;
import xsna.l3r0;
import xsna.lms0;
import xsna.qom0;
import xsna.w09;

/* compiled from: VideoListener.java */
/* loaded from: classes3.dex */
public abstract class h {
    public static final byte[] p = {0, 0, 0, 1};
    public Streamer.CAPTURE_STATE b;
    public final qom0 c;
    public Streamer.b d;
    public b e;
    public c f;
    public MediaFormat g;
    public lms0 h;
    public final a i;
    public long k;
    public long l;
    public HandlerThread m;
    public Handler n;
    public volatile d830 o;
    public final AtomicBoolean a = new AtomicBoolean();
    public long j = 1;

    public h(qom0 qom0Var, Streamer.b bVar) {
        if (qom0Var == null) {
            throw new IllegalArgumentException();
        }
        this.c = qom0Var;
        this.d = bVar;
        this.b = Streamer.CAPTURE_STATE.STOPPED;
        HandlerThread handlerThread = new HandlerThread("h");
        this.m = handlerThread;
        handlerThread.start();
        this.n = new Handler(this.m.getLooper());
        this.i = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        b bVar = this.e;
        if (bVar != null) {
            bVar.a();
            this.e = null;
        }
        HandlerThread handlerThread = this.m;
        if (handlerThread != null) {
            handlerThread.quit();
            try {
                try {
                    this.m.join();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } finally {
                this.m = null;
                this.n = null;
            }
        }
    }

    public final void b(Streamer.CAPTURE_STATE capture_state) {
        if (capture_state != this.b) {
            this.b = capture_state;
            Streamer.b bVar = this.d;
            Handler handler = bVar != null ? bVar.getHandler() : null;
            if (handler != null) {
                handler.post(new w09(this, bVar, capture_state, 3));
            }
        }
    }

    /* compiled from: VideoListener.java */
    public class a extends MediaCodec.Callback {
        public long a;
        public long b;
        public long c;

        public a() {
        }

        public final long a(MediaCodec.BufferInfo bufferInfo, long j) {
            d830 d830Var = h.this.o;
            long j2 = 0;
            if (d830Var == null || d830Var.a >= 1.0f) {
                long nanos = TimeUnit.MICROSECONDS.toNanos(bufferInfo.presentationTimeUs);
                if (d830Var != null) {
                    j = d830Var.a(j);
                }
                if (d830Var != null) {
                    nanos = d830Var.a(nanos);
                }
                h hVar = h.this;
                long j3 = nanos - hVar.l;
                if (hVar.k == 0 || Math.abs(j3) > 250000) {
                    hVar.k = j / 1000;
                } else {
                    j2 = j3;
                }
                hVar.k += j2;
                hVar.l = nanos;
                return h.this.k;
            }
            long j4 = this.b;
            if (j4 != 0) {
                long j5 = this.c;
                if (j5 != 0) {
                    this.b = j4 + this.a;
                    this.c = j5 - 1;
                    return this.b;
                }
            }
            long a = d830Var.a(TimeUnit.MICROSECONDS.toNanos(bufferInfo.presentationTimeUs));
            if (this.b == 0) {
                this.b = TimeUnit.NANOSECONDS.toMicros(a);
            } else {
                long micros = TimeUnit.NANOSECONDS.toMicros(a);
                long j6 = this.b;
                long j7 = this.a;
                this.b = Math.max(((micros + j6) + j7) / 2, j6 + j7);
            }
            this.c = ((int) (1.0f / d830Var.a)) - 1;
            return this.b;
        }

        @Override // android.media.MediaCodec.Callback
        @TargetApi(21)
        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            Log.e("h", BatchApiRequest.FIELD_NAME_ON_ERROR);
            h hVar = h.this;
            if (hVar.a.get() || codecException.isTransient()) {
                return;
            }
            Log.e("h", Log.getStackTraceString(codecException));
            hVar.b(Streamer.CAPTURE_STATE.ENCODER_FAIL);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
        
            if (((android.media.MediaCodec.CodecException) r12).isTransient() != false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
        
            r4 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
        
            if (r4 == false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
        
            android.util.Log.e("h", android.util.Log.getStackTraceString(r12));
            r1.b(r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
        
            if ((r12 instanceof java.lang.IllegalStateException) != false) goto L27;
         */
        @Override // android.media.MediaCodec.Callback
        @TargetApi(21)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            byte[] bArr = h.p;
            h hVar = h.this;
            if (hVar.a.get()) {
                return;
            }
            long nanoTime = System.nanoTime();
            boolean z = false;
            try {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                if ((bufferInfo.flags & 2) == 0) {
                    int i2 = bufferInfo.size;
                    if (l3r0.a(outputBuffer, bArr)) {
                        i2 -= 4;
                    }
                    long j = hVar.j;
                    hVar.j = 1 + j;
                    BufferItem bufferItem = new BufferItem(j, BufferItem.FrameType.VIDEO, i2);
                    bufferItem.i = TimeUnit.NANOSECONDS.toMicros(nanoTime) - bufferInfo.presentationTimeUs;
                    bufferItem.d = a(bufferInfo, nanoTime);
                    bufferItem.e = bufferInfo.presentationTimeUs;
                    bufferItem.h = bufferInfo.flags;
                    outputBuffer.get(bufferItem.c, 0, i2);
                    if (hVar.f != null) {
                        outputBuffer.position(bufferInfo.offset);
                        int i3 = bufferInfo.size;
                        byte[] bArr2 = new byte[i3];
                        outputBuffer.get(bArr2, 0, i3);
                        bufferItem.g = bArr2;
                    }
                    hVar.c.b(bufferItem);
                }
                mediaCodec.releaseOutputBuffer(i, false);
            } catch (Exception e) {
                Streamer.CAPTURE_STATE capture_state = Streamer.CAPTURE_STATE.FAILED;
                if (e instanceof MediaCodec.CodecException) {
                    capture_state = Streamer.CAPTURE_STATE.ENCODER_FAIL;
                }
            }
        }

        @Override // android.media.MediaCodec.Callback
        @TargetApi(21)
        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            h hVar = h.this;
            if (hVar.a.get()) {
                return;
            }
            qom0.b bVar = new qom0.b();
            ByteBuffer duplicate = mediaFormat.getByteBuffer("csd-0").duplicate();
            byte[] bArr = h.p;
            l3r0.a(duplicate, bArr);
            int limit = duplicate.limit() - duplicate.position();
            bVar.b = limit;
            byte[] bArr2 = new byte[limit];
            bVar.a = bArr2;
            duplicate.get(bArr2, 0, limit);
            ByteBuffer duplicate2 = mediaFormat.getByteBuffer("csd-1").duplicate();
            l3r0.a(duplicate2, bArr);
            int limit2 = duplicate2.limit() - duplicate2.position();
            bVar.d = limit2;
            byte[] bArr3 = new byte[limit2];
            bVar.c = bArr3;
            duplicate2.get(bArr3, 0, limit2);
            hVar.c.e = bVar;
            hVar.b(Streamer.CAPTURE_STATE.STARTED);
            this.a = TimeUnit.SECONDS.toMicros(1L) / ((!mediaFormat.containsKey("frame-rate") || mediaFormat.getInteger("frame-rate") == 0) ? 30 : mediaFormat.getInteger("frame-rate"));
            hVar.g = mediaFormat;
            c cVar = hVar.f;
            if (cVar == null) {
                hVar.g = mediaFormat;
            } else {
                cVar.c(mediaFormat);
                hVar.h = new lms0(mediaFormat);
            }
        }

        @Override // android.media.MediaCodec.Callback
        @TargetApi(21)
        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        }
    }
}
