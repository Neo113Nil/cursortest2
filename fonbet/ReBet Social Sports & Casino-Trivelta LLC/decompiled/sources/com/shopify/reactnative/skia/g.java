package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.Point;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import com.facebook.jni.annotations.DoNotStrip;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f41497a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f41498b;

    /* renamed from: c, reason: collision with root package name */
    public MediaExtractor f41499c;

    /* renamed from: d, reason: collision with root package name */
    public MediaCodec f41500d;

    /* renamed from: e, reason: collision with root package name */
    public ImageReader f41501e;

    /* renamed from: f, reason: collision with root package name */
    public Surface f41502f;

    /* renamed from: g, reason: collision with root package name */
    public MediaPlayer f41503g;

    /* renamed from: h, reason: collision with root package name */
    public double f41504h;

    /* renamed from: i, reason: collision with root package name */
    public double f41505i;

    /* renamed from: j, reason: collision with root package name */
    public int f41506j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f41507k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f41508l = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f41509m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f41510n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f41511o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f41512p = false;

    /* renamed from: q, reason: collision with root package name */
    public HardwareBuffer f41513q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f41514r = false;

    /* renamed from: s, reason: collision with root package name */
    public double f41515s = 0.0d;

    public g(Context context, String str) {
        this.f41497a = Uri.parse(str);
        this.f41498b = context;
        e();
    }

    public final void c() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueInputBuffer = this.f41500d.dequeueInputBuffer(10000L);
        if (dequeueInputBuffer >= 0) {
            int readSampleData = this.f41499c.readSampleData(this.f41500d.getInputBuffer(dequeueInputBuffer), 0);
            if (readSampleData < 0) {
                this.f41500d.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            } else {
                this.f41500d.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.f41499c.getSampleTime(), 0);
                this.f41499c.advance();
            }
        }
        int dequeueOutputBuffer = this.f41500d.dequeueOutputBuffer(bufferInfo, 10000L);
        if (dequeueOutputBuffer >= 0) {
            this.f41515s = bufferInfo.presentationTimeUs / 1000.0d;
            this.f41500d.releaseOutputBuffer(dequeueOutputBuffer, true);
        }
    }

    public final boolean d() {
        int dequeueOutputBuffer = this.f41500d.dequeueOutputBuffer(new MediaCodec.BufferInfo(), 0L);
        if (dequeueOutputBuffer < 0) {
            return false;
        }
        this.f41500d.releaseOutputBuffer(dequeueOutputBuffer, true);
        return true;
    }

    public final void e() {
        ImageReader newInstance;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f41499c = mediaExtractor;
        try {
            mediaExtractor.setDataSource(this.f41498b, this.f41497a, (Map<String, String>) null);
            int h10 = h(this.f41499c);
            if (h10 < 0) {
                throw new RuntimeException("No video track found in " + this.f41497a);
            }
            this.f41499c.selectTrack(h10);
            MediaFormat trackFormat = this.f41499c.getTrackFormat(h10);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f41503g = mediaPlayer;
            mediaPlayer.setDataSource(this.f41498b, this.f41497a);
            this.f41503g.setAudioStreamType(3);
            this.f41503g.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.shopify.reactnative.skia.e
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    g.this.f(mediaPlayer2);
                }
            });
            this.f41503g.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.shopify.reactnative.skia.f
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    g.this.g(mediaPlayer2);
                }
            });
            this.f41503g.prepareAsync();
            if (trackFormat.containsKey("durationUs")) {
                this.f41504h = trackFormat.getLong("durationUs") / 1000;
            }
            if (trackFormat.containsKey("frame-rate")) {
                this.f41505i = trackFormat.getInteger("frame-rate");
            }
            if (trackFormat.containsKey("rotation-degrees")) {
                this.f41506j = trackFormat.getInteger("rotation-degrees");
            }
            this.f41507k = trackFormat.getInteger("width");
            int integer = trackFormat.getInteger("height");
            this.f41508l = integer;
            if (Build.VERSION.SDK_INT >= 29) {
                newInstance = ImageReader.newInstance(this.f41507k, integer, 34, 2, 256L);
                this.f41501e = newInstance;
            } else {
                this.f41501e = ImageReader.newInstance(this.f41507k, integer, 34, 2);
            }
            this.f41502f = this.f41501e.getSurface();
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
            this.f41500d = createDecoderByType;
            createDecoderByType.configure(trackFormat, this.f41502f, (MediaCrypto) null, 0);
            this.f41500d.start();
        } catch (IOException e10) {
            throw new RuntimeException("Failed to initialize extractor or decoder", e10);
        }
    }

    public final /* synthetic */ void f(MediaPlayer mediaPlayer) {
        this.f41504h = mediaPlayer.getDuration();
        this.f41511o = true;
        mediaPlayer.setLooping(this.f41510n);
        if (this.f41512p) {
            mediaPlayer.start();
            this.f41509m = true;
            this.f41512p = false;
        }
    }

    public final /* synthetic */ void g(MediaPlayer mediaPlayer) {
        this.f41509m = false;
    }

    @DoNotStrip
    public double getCurrentTime() {
        return this.f41515s;
    }

    @DoNotStrip
    public double getDuration() {
        return this.f41504h;
    }

    @DoNotStrip
    public double getFrameRate() {
        return this.f41505i;
    }

    @DoNotStrip
    public boolean getIsPlaying() {
        return this.f41509m;
    }

    @DoNotStrip
    public int getRotationDegrees() {
        return this.f41506j;
    }

    @DoNotStrip
    public Point getSize() {
        return new Point(this.f41507k, this.f41508l);
    }

    public final int h(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            if (mediaExtractor.getTrackFormat(i10).getString("mime").startsWith("video/")) {
                return i10;
            }
        }
        return -1;
    }

    @DoNotStrip
    public HardwareBuffer nextImage() {
        HardwareBuffer hardwareBuffer;
        HardwareBuffer hardwareBuffer2;
        if (!this.f41509m && !this.f41514r && (hardwareBuffer2 = this.f41513q) != null) {
            return hardwareBuffer2;
        }
        if (!d()) {
            c();
        }
        Image acquireLatestImage = this.f41501e.acquireLatestImage();
        if (acquireLatestImage == null) {
            return this.f41513q;
        }
        hardwareBuffer = acquireLatestImage.getHardwareBuffer();
        acquireLatestImage.close();
        this.f41513q = hardwareBuffer;
        if (this.f41514r) {
            this.f41514r = false;
        }
        return hardwareBuffer;
    }

    @DoNotStrip
    public void pause() {
        this.f41512p = false;
        MediaPlayer mediaPlayer = this.f41503g;
        if (mediaPlayer == null || !this.f41509m) {
            return;
        }
        mediaPlayer.pause();
        this.f41509m = false;
    }

    @DoNotStrip
    public void play() {
        MediaPlayer mediaPlayer = this.f41503g;
        if (mediaPlayer == null || this.f41509m) {
            return;
        }
        if (!this.f41511o) {
            this.f41512p = true;
        } else {
            mediaPlayer.start();
            this.f41509m = true;
        }
    }

    @DoNotStrip
    public void seek(double d10) {
        this.f41499c.seekTo((long) (1000.0d * d10), 2);
        MediaPlayer mediaPlayer = this.f41503g;
        if (mediaPlayer != null && this.f41511o) {
            mediaPlayer.seekTo((int) d10, 3);
        }
        MediaCodec mediaCodec = this.f41500d;
        if (mediaCodec != null) {
            mediaCodec.flush();
        }
        this.f41514r = true;
        c();
    }

    @DoNotStrip
    public void setLooping(boolean z10) {
        this.f41510n = z10;
        MediaPlayer mediaPlayer = this.f41503g;
        if (mediaPlayer == null || !this.f41511o) {
            return;
        }
        mediaPlayer.setLooping(z10);
    }

    @DoNotStrip
    public void setVolume(float f10) {
        MediaPlayer mediaPlayer = this.f41503g;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f10, f10);
        }
    }
}
