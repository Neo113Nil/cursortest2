package com.vk.media.recorder.impl;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import com.vk.media.recorder.impl.BufferItem;
import com.vk.media.recorder.impl.Streamer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import xsna.le9;
import xsna.nhf0;
import xsna.qom0;
import xsna.vky;

/* compiled from: StreamRecorder.java */
@TargetApi(18)
/* loaded from: classes3.dex */
public final class c {
    public static final /* synthetic */ int n = 0;
    public qom0 b;
    public MediaMuxer c;
    public File d;
    public final Streamer.MODE e;
    public a h;
    public BufferItem i;
    public long j;
    public final Streamer.b k;
    public final nhf0 m;
    public final Object a = new Object();
    public int f = -1;
    public int g = -1;
    public Streamer.RECORD_STATE l = Streamer.RECORD_STATE.FAILED;

    /* compiled from: StreamRecorder.java */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            long j;
            long j2;
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            c cVar = c.this;
            if (cVar.e == Streamer.MODE.AUDIO_ONLY) {
                cVar.d(Streamer.RECORD_STATE.STARTED);
            }
            c cVar2 = c.this;
            Streamer.b bVar = cVar2.k;
            long j3 = 0;
            if (bVar != null) {
                bVar.c(0L);
            }
            c cVar3 = c.this;
            nhf0 nhf0Var = cVar3.m;
            try {
                try {
                    cVar3.c.start();
                    boolean z = false;
                    long j4 = Long.MAX_VALUE;
                    long j5 = 0;
                    long j6 = 0;
                    long j7 = -1;
                    long j8 = -1;
                    while (!isInterrupted()) {
                        c cVar4 = c.this;
                        cVar4.i = cVar4.b.a(cVar4.j);
                        c cVar5 = c.this;
                        BufferItem bufferItem = cVar5.i;
                        if (bufferItem == null) {
                            Thread.sleep(10L);
                        } else {
                            cVar5.j = bufferItem.b + 1;
                            BufferItem.FrameType frameType = bufferItem.f;
                            if (frameType == BufferItem.FrameType.AUDIO) {
                                Streamer.MODE mode = cVar5.e;
                                if (mode != Streamer.MODE.AUDIO_ONLY && mode != Streamer.MODE.AUDIO_VIDEO) {
                                    j = j3;
                                    j3 = j;
                                }
                                ByteBuffer wrap = ByteBuffer.wrap(bufferItem.c);
                                j2 = c.this.i.d;
                                j = j3;
                                bufferInfo.set(wrap.arrayOffset(), wrap.limit(), j2, c.this.i.h);
                                c cVar6 = c.this;
                                cVar6.c.writeSampleData(cVar6.f, wrap, bufferInfo);
                                if (j2 > j7) {
                                    if (j8 == -1) {
                                        j8 = j2;
                                    }
                                    long millis = TimeUnit.MICROSECONDS.toMillis(j2 - j8);
                                    Streamer.b bVar2 = cVar2.k;
                                    if (bVar2 != null) {
                                        bVar2.c(millis);
                                    }
                                    j7 = j2;
                                    j3 = j;
                                } else {
                                    j3 = j;
                                }
                            } else {
                                j = j3;
                                if (frameType == BufferItem.FrameType.VIDEO && bufferItem.g != null) {
                                    if (!z && (z = bufferItem.a())) {
                                        nhf0Var.a();
                                        c cVar7 = c.this;
                                        BufferItem bufferItem2 = cVar7.i;
                                        j4 = bufferItem2.e;
                                        long j9 = bufferItem2.i;
                                        cVar7.d(Streamer.RECORD_STATE.STARTED);
                                        Streamer.b bVar3 = c.this.k;
                                        if (bVar3 != null) {
                                            Handler handler = bVar3.getHandler();
                                            if (handler != null) {
                                                handler.post(new le9(2, bVar3, nhf0Var));
                                            }
                                            bVar3.f();
                                        }
                                        j6 = j9;
                                    }
                                    WeakReference<vky> weakReference = nhf0Var.a;
                                    vky vkyVar = weakReference == null ? null : weakReference.get();
                                    if (vkyVar != null && j5 == j) {
                                        long c = vkyVar.c();
                                        if (c > j) {
                                            long micros = ((TimeUnit.NANOSECONDS.toMicros(System.nanoTime()) - j4) + j6) - TimeUnit.MILLISECONDS.toMicros(c);
                                            nhf0Var.b = micros;
                                            j5 = micros;
                                        }
                                    }
                                    c cVar8 = c.this;
                                    if (cVar8.e != Streamer.MODE.AUDIO_ONLY && z) {
                                        nhf0Var.b(cVar8.i.d);
                                        ByteBuffer wrap2 = ByteBuffer.wrap(c.this.i.g);
                                        j2 = c.this.i.d;
                                        bufferInfo.set(wrap2.arrayOffset(), wrap2.limit(), j2, c.this.i.h);
                                        c cVar9 = c.this;
                                        cVar9.c.writeSampleData(cVar9.g, wrap2, bufferInfo);
                                        if (j2 > j7) {
                                            if (j8 == -1) {
                                                j8 = j2;
                                            }
                                            long millis2 = TimeUnit.MICROSECONDS.toMillis(j2 - j8);
                                            Streamer.b bVar4 = cVar2.k;
                                            if (bVar4 != null) {
                                                bVar4.c(millis2);
                                            }
                                            j7 = j2;
                                        }
                                    }
                                }
                                j3 = j;
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.e("c", "Record failed", e);
                    Thread.currentThread().interrupt();
                }
                c.a(c.this);
            } catch (Throwable th) {
                c.a(c.this);
                throw th;
            }
        }
    }

    /* compiled from: StreamRecorder.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            cVar.k.g(cVar.l);
        }
    }

    /* compiled from: StreamRecorder.java */
    /* renamed from: com.vk.media.recorder.impl.c$c, reason: collision with other inner class name */
    public static /* synthetic */ class C1265c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Streamer.MODE.values().length];
            a = iArr;
            try {
                iArr[Streamer.MODE.AUDIO_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Streamer.MODE.AUDIO_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Streamer.MODE.VIDEO_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(qom0 qom0Var, Streamer.b bVar, File file, Streamer.MODE mode, @NonNull nhf0 nhf0Var) {
        this.m = nhf0Var;
        if (qom0Var == null) {
            throw new IllegalArgumentException("StreamBuffer is null");
        }
        this.b = qom0Var;
        this.k = bVar;
        this.e = mode;
        this.d = file;
        file.getAbsolutePath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(c cVar) {
        try {
            try {
                MediaMuxer mediaMuxer = cVar.c;
                if (mediaMuxer != null) {
                    mediaMuxer.stop();
                    cVar.c.release();
                }
            } catch (IllegalStateException e) {
                File file = cVar.d;
                if (file != null) {
                    file.delete();
                }
                Log.e("c", Log.getStackTraceString(e));
            }
        } finally {
            cVar.c = null;
            cVar.b = null;
            cVar.g = -1;
            cVar.f = -1;
            cVar.d = null;
            cVar.i = null;
            cVar.j = 0L;
            cVar.d(Streamer.RECORD_STATE.STOPPED);
        }
    }

    public final void b(MediaFormat mediaFormat) {
        synchronized (this.a) {
            try {
                if (this.f != -1) {
                    return;
                }
                MediaMuxer mediaMuxer = this.c;
                if (mediaMuxer != null) {
                    this.f = mediaMuxer.addTrack(mediaFormat);
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(MediaFormat mediaFormat) {
        synchronized (this.a) {
            try {
                if (this.g != -1) {
                    return;
                }
                MediaMuxer mediaMuxer = this.c;
                if (mediaMuxer != null) {
                    this.g = mediaMuxer.addTrack(mediaFormat);
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Streamer.RECORD_STATE record_state) {
        Handler handler;
        if (record_state != this.l) {
            this.l = record_state;
            Streamer.b bVar = this.k;
            if (bVar == null || (handler = bVar.getHandler()) == null) {
                return;
            }
            handler.post(new b());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:11:0x002f, B:13:0x0033, B:15:0x0037, B:16:0x0046, B:19:0x0029, B:21:0x002d, B:23:0x0021, B:25:0x0025, B:27:0x0018, B:29:0x001c, B:32:0x0048), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d A[Catch: all -> 0x0027, DONT_GENERATE, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:11:0x002f, B:13:0x0033, B:15:0x0037, B:16:0x0046, B:19:0x0029, B:21:0x002d, B:23:0x0021, B:25:0x0025, B:27:0x0018, B:29:0x001c, B:32:0x0048), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        synchronized (this.a) {
            try {
                int i = C1265c.a[this.e.ordinal()];
                if (i == 1) {
                    if (this.g != -1) {
                        if (this.f == -1) {
                        }
                    }
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        if (this.h == null && this.c != null) {
                            a aVar = new a();
                            this.h = aVar;
                            aVar.setPriority(1);
                            this.h.start();
                        }
                    }
                    if (this.g == -1) {
                        return;
                    }
                    if (this.h == null) {
                        a aVar2 = new a();
                        this.h = aVar2;
                        aVar2.setPriority(1);
                        this.h.start();
                    }
                }
                if (this.f == -1) {
                    return;
                }
                if (this.g == -1) {
                }
                if (this.h == null) {
                }
            } finally {
            }
        }
    }
}
