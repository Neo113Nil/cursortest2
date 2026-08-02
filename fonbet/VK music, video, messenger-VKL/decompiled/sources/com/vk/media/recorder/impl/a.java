package com.vk.media.recorder.impl;

import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.vk.media.recorder.impl.BufferItem;
import com.vk.media.recorder.impl.Streamer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import xsna.ajp;
import xsna.qom0;
import xsna.st4;
import xsna.zip;
import xsna.zp4;

/* compiled from: AudioListener.java */
/* loaded from: classes3.dex */
public final class a extends Thread {
    public final float c;
    public final float d;
    public AudioRecord e;
    public qom0 g;
    public Streamer.b h;
    public final int i;
    public zip j;
    public c k;
    public MediaFormat l;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public ExtraAudioSupplier s;
    public int t;
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final MediaCodec.BufferInfo f = new MediaCodec.BufferInfo();
    public Streamer.CAPTURE_STATE m = Streamer.CAPTURE_STATE.STOPPED;

    public a(qom0 qom0Var, int i, zip zipVar, Streamer.b bVar, ExtraAudioSupplier extraAudioSupplier, float f, float f2) {
        if (qom0Var == null) {
            throw new IllegalArgumentException();
        }
        if (zipVar == null || zipVar.a == null) {
            throw new IllegalArgumentException();
        }
        this.g = qom0Var;
        this.i = i;
        this.j = zipVar;
        this.h = bVar;
        this.s = extraAudioSupplier;
        this.c = f;
        this.d = f2;
    }

    public final void a(byte[] bArr, int i, int i2, int i3, boolean z) {
        long j;
        int i4 = i / i2;
        if (z) {
            long j2 = i4;
            long j3 = i3;
            long j4 = (j2 * 1000000) / j3;
            j = (System.nanoTime() / 1000) - j4;
            if (this.q == 0) {
                this.o = j;
                this.q = 0L;
            }
            long j5 = ((this.q * 1000000) / j3) + this.o;
            if (j - j5 >= j4 * 2) {
                this.o = j;
                this.q = 0L;
            } else {
                j = j5;
            }
            this.q += j2;
        } else {
            long micros = (TimeUnit.SECONDS.toMicros(1L) * i4) / i3;
            long j6 = this.p;
            if (j6 == 0) {
                long micros2 = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                this.p = micros2;
                j6 = micros2 - micros;
            } else {
                this.p = micros + j6;
            }
            j = j6;
        }
        long j7 = j;
        int dequeueInputBuffer = this.j.a.dequeueInputBuffer(500000L);
        if (dequeueInputBuffer < 0) {
            return;
        }
        this.j.a.getInputBuffer(dequeueInputBuffer).put(bArr, 0, i);
        this.j.a.queueInputBuffer(dequeueInputBuffer, 0, i, j7, 0);
        while (true) {
            try {
                int dequeueOutputBuffer = this.j.a.dequeueOutputBuffer(this.f, 0L);
                if (-2 == dequeueOutputBuffer) {
                    MediaFormat outputFormat = this.j.a.getOutputFormat();
                    qom0.a aVar = new qom0.a();
                    byte[] array = outputFormat.getByteBuffer("csd-0").array();
                    aVar.a = array;
                    aVar.b = array.length;
                    aVar.c = outputFormat.getInteger("sample-rate");
                    aVar.d = outputFormat.getInteger("channel-count");
                    this.g.f = aVar;
                    c cVar = this.k;
                    if (cVar != null) {
                        cVar.b(outputFormat);
                    } else {
                        this.l = outputFormat;
                    }
                    b(Streamer.CAPTURE_STATE.STARTED);
                } else {
                    if (dequeueOutputBuffer < 0) {
                        return;
                    }
                    ByteBuffer outputBuffer = this.j.a.getOutputBuffer(dequeueOutputBuffer);
                    MediaCodec.BufferInfo bufferInfo = this.f;
                    if ((bufferInfo.flags & 2) == 2) {
                        qom0.a aVar2 = new qom0.a();
                        int i5 = this.f.size;
                        byte[] bArr2 = new byte[i5];
                        aVar2.a = bArr2;
                        aVar2.b = i5;
                        outputBuffer.get(bArr2, 0, i5);
                        this.g.f = aVar2;
                        b(Streamer.CAPTURE_STATE.STARTED);
                    } else {
                        long j8 = this.n;
                        this.n = j8 + 1;
                        BufferItem bufferItem = new BufferItem(j8, BufferItem.FrameType.AUDIO, bufferInfo.size);
                        MediaCodec.BufferInfo bufferInfo2 = this.f;
                        bufferItem.d = bufferInfo2.presentationTimeUs;
                        bufferItem.h = bufferInfo2.flags;
                        outputBuffer.get(bufferItem.c, 0, bufferInfo2.size);
                        this.g.b(bufferItem);
                    }
                    this.j.a.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            } catch (Exception e) {
                Log.e("a", Log.getStackTraceString(e));
                b(e instanceof MediaCodec.CodecException ? Streamer.CAPTURE_STATE.ENCODER_FAIL : Streamer.CAPTURE_STATE.FAILED);
                return;
            }
        }
    }

    public final void b(final Streamer.CAPTURE_STATE capture_state) {
        if (capture_state != this.m) {
            this.m = capture_state;
            final Streamer.b bVar = this.h;
            Handler handler = bVar != null ? bVar.getHandler() : null;
            if (handler != null) {
                handler.post(new Runnable() { // from class: xsna.aq4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Streamer.b bVar2 = bVar;
                        Streamer.CAPTURE_STATE capture_state2 = capture_state;
                        bVar2.a(capture_state2);
                        if (capture_state2 == Streamer.CAPTURE_STATE.STOPPED) {
                            com.vk.media.recorder.impl.a.this.h = null;
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0169  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AudioRecord audioRecord;
        zip zipVar;
        int i;
        int minBufferSize;
        int i2;
        st4 st4Var;
        zp4 zp4Var;
        int b;
        Streamer.CAPTURE_STATE capture_state = Streamer.CAPTURE_STATE.STOPPED;
        long j = 0;
        this.p = 0L;
        boolean z = false;
        try {
            int integer = this.j.b.getInteger("channel-count");
            this.t = integer;
            i = integer == 1 ? 16 : 12;
            minBufferSize = AudioRecord.getMinBufferSize(this.j.b.getInteger("sample-rate"), i, 2);
        } catch (Exception e) {
            e = e;
            Log.e("a", Log.getStackTraceString(e));
            capture_state = !(!(e instanceof MediaCodec.CodecException) ? true : z) ? Streamer.CAPTURE_STATE.ENCODER_FAIL : Streamer.CAPTURE_STATE.FAILED;
            if (this.g != null) {
            }
            this.l = null;
            this.k = null;
            audioRecord = this.e;
            if (audioRecord != null) {
            }
            zipVar = this.j;
            if (zipVar != null) {
            }
            b(capture_state);
        }
        if (minBufferSize <= 0) {
            throw new Exception();
        }
        try {
            this.j.b.setInteger("max-input-size", minBufferSize);
            zip zipVar2 = this.j;
            MediaCodec mediaCodec = zipVar2.a;
            if (mediaCodec != null && zipVar2.d == ajp.a.Uninitialized) {
                mediaCodec.configure(zipVar2.b, (Surface) null, (MediaCrypto) null, 1);
                zipVar2.d = ajp.a.Configured;
            }
            zip zipVar3 = this.j;
            MediaCodec mediaCodec2 = zipVar3.a;
            if (mediaCodec2 != null && zipVar3.d == ajp.a.Configured) {
                mediaCodec2.start();
                zipVar3.d = ajp.a.Executing;
            }
            int integer2 = this.j.b.getInteger("sample-rate");
            AudioRecord audioRecord2 = new AudioRecord(this.i, integer2, i, 2, minBufferSize * 4);
            this.e = audioRecord2;
            if (audioRecord2.getState() != 1) {
                throw new Exception();
            }
            int integer3 = this.j.b.getInteger("channel-count");
            int i3 = integer3 * 2;
            int i4 = integer3 * 2048;
            byte[] bArr = new byte[i4];
            st4 a = st4.a(this.c, this.d, integer2, this.t, i4);
            zp4 zp4Var2 = a != null ? new zp4(this, i3, integer2) : null;
            this.e.startRecording();
            loop0: while (this.b.get()) {
                while (!isInterrupted()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int read = this.e.read(bArr, 0, i4);
                    if (read > 0) {
                        long j2 = j;
                        if (this.p == j2) {
                            this.p = TimeUnit.NANOSECONDS.toMicros(System.nanoTime()) - TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis() - currentTimeMillis);
                        }
                        if (this.r) {
                            Arrays.fill(bArr, (byte) 0);
                        }
                        ExtraAudioSupplier extraAudioSupplier = this.s;
                        if (extraAudioSupplier != null) {
                            i2 = i4;
                            extraAudioSupplier.getRawData(bArr, i2, this.t, Boolean.TRUE, this.r);
                        } else {
                            i2 = i4;
                        }
                        if (a == null) {
                            zp4Var = zp4Var2;
                            st4Var = a;
                            a(bArr, read, i3, integer2, true);
                        } else {
                            st4Var = a;
                            zp4Var = zp4Var2;
                            st4Var.c(read, bArr);
                            do {
                                b = st4Var.b();
                                if (b > 0) {
                                    zp4Var.a.a(st4Var.a, b, zp4Var.b, zp4Var.c, false);
                                }
                            } while (b != 0);
                        }
                        a = st4Var;
                        zp4Var2 = zp4Var;
                        i4 = i2;
                        j = j2;
                    }
                }
            }
            if (this.g != null) {
                this.g = null;
            }
            this.l = null;
            this.k = null;
            audioRecord = this.e;
            if (audioRecord != null) {
                audioRecord.release();
                this.e = null;
            }
            zipVar = this.j;
            if (zipVar != null) {
                zipVar.a();
                this.j = null;
            }
            b(capture_state);
        } catch (Exception e2) {
            Log.e("a", Log.getStackTraceString(e2));
            try {
                throw new Exception();
            } catch (Exception e3) {
                e = e3;
                z = true;
                Log.e("a", Log.getStackTraceString(e));
                capture_state = !(!(e instanceof MediaCodec.CodecException) ? true : z) ? Streamer.CAPTURE_STATE.ENCODER_FAIL : Streamer.CAPTURE_STATE.FAILED;
                if (this.g != null) {
                }
                this.l = null;
                this.k = null;
                audioRecord = this.e;
                if (audioRecord != null) {
                }
                zipVar = this.j;
                if (zipVar != null) {
                }
                b(capture_state);
            }
        }
    }
}
