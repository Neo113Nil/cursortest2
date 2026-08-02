package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f67694a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final MediaMuxer f67695b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f67696c;

    /* renamed from: d, reason: collision with root package name */
    private int f67697d;

    /* renamed from: e, reason: collision with root package name */
    private int f67698e;

    /* renamed from: f, reason: collision with root package name */
    private long f67699f;

    public b(@NotNull String path, float f7) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f67694a = (long) (TimeUnit.SECONDS.toMicros(1L) / f7);
        this.f67695b = new MediaMuxer(path, 0);
    }

    public final long a() {
        if (this.f67698e == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.f67699f + this.f67694a, TimeUnit.MICROSECONDS);
    }

    public final boolean b() {
        return this.f67696c;
    }

    public final void c(@NotNull ByteBuffer encodedData, @NotNull MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(encodedData, "encodedData");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        int i11 = this.f67698e;
        this.f67698e = i11 + 1;
        long j11 = this.f67694a * i11;
        this.f67699f = j11;
        bufferInfo.presentationTimeUs = j11;
        this.f67695b.writeSampleData(this.f67697d, encodedData, bufferInfo);
    }

    public final void d() {
        MediaMuxer mediaMuxer = this.f67695b;
        mediaMuxer.stop();
        mediaMuxer.release();
    }

    public final void e(@NotNull MediaFormat videoFormat) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        MediaMuxer mediaMuxer = this.f67695b;
        this.f67697d = mediaMuxer.addTrack(videoFormat);
        mediaMuxer.start();
        this.f67696c = true;
    }
}
