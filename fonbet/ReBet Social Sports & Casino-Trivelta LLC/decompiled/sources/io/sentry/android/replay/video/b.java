package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f51804a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaMuxer f51805b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f51806c;

    /* renamed from: d, reason: collision with root package name */
    public int f51807d;

    /* renamed from: e, reason: collision with root package name */
    public int f51808e;

    /* renamed from: f, reason: collision with root package name */
    public long f51809f;

    public b(String path, float f10) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f51804a = (long) (TimeUnit.SECONDS.toMicros(1L) / f10);
        this.f51805b = new MediaMuxer(path, 0);
    }

    public long a() {
        if (this.f51808e == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.f51809f + this.f51804a, TimeUnit.MICROSECONDS);
    }

    public boolean b() {
        return this.f51806c;
    }

    public void c(ByteBuffer encodedData, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(encodedData, "encodedData");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        long j10 = this.f51804a;
        int i10 = this.f51808e;
        this.f51808e = i10 + 1;
        long j11 = j10 * i10;
        this.f51809f = j11;
        bufferInfo.presentationTimeUs = j11;
        this.f51805b.writeSampleData(this.f51807d, encodedData, bufferInfo);
    }

    public void d() {
        if (this.f51806c) {
            this.f51805b.stop();
        }
        this.f51805b.release();
    }

    public void e(MediaFormat videoFormat) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        this.f51807d = this.f51805b.addTrack(videoFormat);
        this.f51805b.start();
        this.f51806c = true;
    }
}
