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
import android.media.MediaSync;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes8.dex */
public class RNSkVideo {
    private final Context context;
    private MediaCodec decoder;
    private double durationMs;
    private MediaExtractor extractor;
    private double frameRate;
    private ImageReader imageReader;
    private MediaPlayer mediaPlayer;
    private MediaSync mediaSync;
    private Surface outputSurface;
    private final Uri uri;
    private int rotationDegrees = 0;
    private int width = 0;
    private int height = 0;
    private boolean isPlaying = false;
    private boolean isLooping = false;
    private boolean isPrepared = false;
    private boolean playWhenReady = false;
    private HardwareBuffer lastBuffer = null;
    private boolean pendingSeek = false;
    private double lastFrameTimeMs = 0.0d;

    RNSkVideo(Context context, String str) {
        this.uri = Uri.parse(str);
        this.context = context;
        initializeReader();
    }

    private void initializeReader() {
        ImageReader newInstance;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.extractor = mediaExtractor;
        try {
            mediaExtractor.setDataSource(this.context, this.uri, (Map<String, String>) null);
            int selectVideoTrack = selectVideoTrack(this.extractor);
            if (selectVideoTrack < 0) {
                throw new RuntimeException("No video track found in " + this.uri);
            }
            this.extractor.selectTrack(selectVideoTrack);
            MediaFormat trackFormat = this.extractor.getTrackFormat(selectVideoTrack);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.mediaPlayer = mediaPlayer;
            mediaPlayer.setDataSource(this.context, this.uri);
            this.mediaPlayer.setAudioStreamType(3);
            this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.shopify.reactnative.skia.RNSkVideo$$ExternalSyntheticLambda3
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    RNSkVideo.this.lambda$initializeReader$0(mediaPlayer2);
                }
            });
            this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.shopify.reactnative.skia.RNSkVideo$$ExternalSyntheticLambda4
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    RNSkVideo.this.lambda$initializeReader$1(mediaPlayer2);
                }
            });
            this.mediaPlayer.prepareAsync();
            if (trackFormat.containsKey("durationUs")) {
                this.durationMs = trackFormat.getLong("durationUs") / 1000;
            }
            if (trackFormat.containsKey("frame-rate")) {
                this.frameRate = trackFormat.getInteger("frame-rate");
            }
            if (trackFormat.containsKey("rotation-degrees")) {
                this.rotationDegrees = trackFormat.getInteger("rotation-degrees");
            }
            this.width = trackFormat.getInteger("width");
            this.height = trackFormat.getInteger("height");
            if (Build.VERSION.SDK_INT >= 29) {
                newInstance = ImageReader.newInstance(this.width, this.height, 34, 2, 256L);
                this.imageReader = newInstance;
            } else {
                this.imageReader = ImageReader.newInstance(this.width, this.height, 34, 2);
            }
            this.outputSurface = this.imageReader.getSurface();
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
            this.decoder = createDecoderByType;
            createDecoderByType.configure(trackFormat, this.outputSurface, (MediaCrypto) null, 0);
            this.decoder.start();
        } catch (IOException e) {
            throw new RuntimeException("Failed to initialize extractor or decoder", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeReader$0(MediaPlayer mediaPlayer) {
        this.durationMs = mediaPlayer.getDuration();
        this.isPrepared = true;
        mediaPlayer.setLooping(this.isLooping);
        if (this.playWhenReady) {
            mediaPlayer.start();
            this.isPlaying = true;
            this.playWhenReady = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeReader$1(MediaPlayer mediaPlayer) {
        this.isPlaying = false;
    }

    public double getDuration() {
        return this.durationMs;
    }

    public double getFrameRate() {
        return this.frameRate;
    }

    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public HardwareBuffer nextImage() {
        HardwareBuffer hardwareBuffer;
        HardwareBuffer hardwareBuffer2;
        if (!this.isPlaying && !this.pendingSeek && (hardwareBuffer2 = this.lastBuffer) != null) {
            return hardwareBuffer2;
        }
        if (!decoderOutputAvailable()) {
            decodeFrame();
        }
        Image acquireLatestImage = this.imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            hardwareBuffer = acquireLatestImage.getHardwareBuffer();
            acquireLatestImage.close();
            this.lastBuffer = hardwareBuffer;
            if (this.pendingSeek) {
                this.pendingSeek = false;
            }
            return hardwareBuffer;
        }
        return this.lastBuffer;
    }

    public void seek(double d) {
        this.extractor.seekTo((long) (1000.0d * d), 2);
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null && this.isPrepared) {
            mediaPlayer.seekTo((int) d, 3);
        }
        MediaCodec mediaCodec = this.decoder;
        if (mediaCodec != null) {
            mediaCodec.flush();
        }
        this.pendingSeek = true;
        decodeFrame();
    }

    public Point getSize() {
        return new Point(this.width, this.height);
    }

    private int selectVideoTrack(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("video/")) {
                return i;
            }
        }
        return -1;
    }

    private boolean decoderOutputAvailable() {
        int dequeueOutputBuffer = this.decoder.dequeueOutputBuffer(new MediaCodec.BufferInfo(), 0L);
        if (dequeueOutputBuffer < 0) {
            return false;
        }
        this.decoder.releaseOutputBuffer(dequeueOutputBuffer, true);
        return true;
    }

    private void decodeFrame() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueInputBuffer = this.decoder.dequeueInputBuffer(10000L);
        if (dequeueInputBuffer >= 0) {
            int readSampleData = this.extractor.readSampleData(this.decoder.getInputBuffer(dequeueInputBuffer), 0);
            if (readSampleData < 0) {
                this.decoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            } else {
                this.decoder.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), 0);
                this.extractor.advance();
            }
        }
        int dequeueOutputBuffer = this.decoder.dequeueOutputBuffer(bufferInfo, 10000L);
        if (dequeueOutputBuffer >= 0) {
            this.lastFrameTimeMs = bufferInfo.presentationTimeUs / 1000.0d;
            this.decoder.releaseOutputBuffer(dequeueOutputBuffer, true);
            int i = bufferInfo.flags;
        }
    }

    public void play() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null || this.isPlaying) {
            return;
        }
        if (this.isPrepared) {
            mediaPlayer.start();
            this.isPlaying = true;
        } else {
            this.playWhenReady = true;
        }
    }

    public void pause() {
        this.playWhenReady = false;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null || !this.isPlaying) {
            return;
        }
        mediaPlayer.pause();
        this.isPlaying = false;
    }

    public void setVolume(float f) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
    }

    public double getCurrentTime() {
        return this.lastFrameTimeMs;
    }

    public void setLooping(boolean z) {
        this.isLooping = z;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null || !this.isPrepared) {
            return;
        }
        mediaPlayer.setLooping(z);
    }

    public boolean getIsPlaying() {
        return this.isPlaying;
    }

    public void release() {
        this.lastBuffer = null;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer = null;
        }
        MediaCodec mediaCodec = this.decoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.decoder.release();
            this.decoder = null;
        }
        MediaExtractor mediaExtractor = this.extractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.extractor = null;
        }
    }
}
