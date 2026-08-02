package com.reactnativecompressor.Video.VideoCompressor.compressor;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.reactnativecompressor.Video.VideoCompressor.CompressionProgressListener;
import com.reactnativecompressor.Video.VideoCompressor.utils.CompressorUtils;
import com.reactnativecompressor.Video.VideoCompressor.utils.StreamableVideo;
import com.reactnativecompressor.Video.VideoCompressor.video.InputSurface;
import com.reactnativecompressor.Video.VideoCompressor.video.MP4Builder;
import com.reactnativecompressor.Video.VideoCompressor.video.OutputSurface;
import com.reactnativecompressor.Video.VideoCompressor.video.Result;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Compressor.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJb\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0005H\u0002J(\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\fH\u0002J\u0018\u00105\u001a\u0002012\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u000208H\u0002J8\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u0002012\u0006\u0010<\u001a\u0002012\u0006\u0010=\u001a\u00020>2\u0006\u00107\u001a\u0002082\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006?"}, d2 = {"Lcom/reactnativecompressor/Video/VideoCompressor/compressor/Compressor;", "", "<init>", "()V", "MIN_BITRATE", "", "MIME_TYPE", "", "MEDIACODEC_TIMEOUT_DEFAULT", "", "INVALID_BITRATE", "isRunning", "", "()Z", "setRunning", "(Z)V", "compressVideo", "Lcom/reactnativecompressor/Video/VideoCompressor/video/Result;", "index", "context", "Landroid/content/Context;", "srcUri", "Landroid/net/Uri;", "destination", "streamableFile", "outputWidth", "outputHeight", "outputBitrate", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/reactnativecompressor/Video/VideoCompressor/CompressionProgressListener;", "(ILandroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;IIILcom/reactnativecompressor/Video/VideoCompressor/CompressionProgressListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "id", "newWidth", "newHeight", "newBitrate", "disableAudio", "extractor", "Landroid/media/MediaExtractor;", "compressionProgressListener", "duration", "rotation", "processAudio", "", "mediaMuxer", "Lcom/reactnativecompressor/Video/VideoCompressor/video/MP4Builder;", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "prepareEncoder", "Landroid/media/MediaCodec;", "outputFormat", "Landroid/media/MediaFormat;", "hasQTI", "prepareDecoder", "inputFormat", "outputSurface", "Lcom/reactnativecompressor/Video/VideoCompressor/video/OutputSurface;", "dispose", "videoIndex", "decoder", "encoder", "inputSurface", "Lcom/reactnativecompressor/Video/VideoCompressor/video/InputSurface;", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Compressor {
    private static final String INVALID_BITRATE = "The provided bitrate is smaller than what is needed for compression, try to set isMinBitRateEnabled to false";
    private static final long MEDIACODEC_TIMEOUT_DEFAULT = 100;
    private static final String MIME_TYPE = "video/avc";
    private static final int MIN_BITRATE = 2000000;
    public static final Compressor INSTANCE = new Compressor();
    private static boolean isRunning = true;

    private Compressor() {
    }

    public final boolean isRunning() {
        return isRunning;
    }

    public final void setRunning(boolean z) {
        isRunning = z;
    }

    public final Object compressVideo(int i, Context context, Uri uri, String str, String str2, int i2, int i3, int i4, CompressionProgressListener compressionProgressListener, Continuation<? super Result> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new Compressor$compressVideo$2(context, uri, i, i4, i2, i3, str, str2, compressionProgressListener, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f7, code lost:
    
        r4 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Result start(int id, int newWidth, int newHeight, String destination, int newBitrate, String streamableFile, boolean disableAudio, MediaExtractor extractor, CompressionProgressListener compressionProgressListener, long duration, int rotation) {
        InputSurface inputSurface;
        OutputSurface outputSurface;
        MediaCodec prepareDecoder;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        MediaCodec mediaCodec;
        boolean z4;
        int dequeueOutputBuffer;
        boolean z5;
        int i2;
        int i3;
        MediaCodec mediaCodec2;
        int dequeueInputBuffer;
        Compressor compressor = this;
        int i4 = id;
        MediaExtractor mediaExtractor = extractor;
        if (newWidth != 0 && newHeight != 0) {
            File file = new File(destination);
            try {
                try {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    MP4Builder createMovie = new MP4Builder().createMovie(CompressorUtils.INSTANCE.setUpMP4Movie(rotation, file));
                    int findTrack = CompressorUtils.INSTANCE.findTrack(mediaExtractor, true);
                    mediaExtractor.selectTrack(findTrack);
                    mediaExtractor.seekTo(0L, 0);
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                    Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", newWidth, newHeight);
                    Intrinsics.checkNotNullExpressionValue(createVideoFormat, "createVideoFormat(...)");
                    CompressorUtils.INSTANCE.setOutputFileParameters(trackFormat, createVideoFormat, newBitrate);
                    MediaCodec prepareEncoder = compressor.prepareEncoder(createVideoFormat, CompressorUtils.INSTANCE.hasQTI());
                    try {
                        inputSurface = new InputSurface(prepareEncoder.createInputSurface());
                        inputSurface.makeCurrent();
                        prepareEncoder.start();
                        outputSurface = new OutputSurface();
                        prepareDecoder = compressor.prepareDecoder(trackFormat, outputSurface);
                        prepareDecoder.start();
                        z = false;
                        z2 = false;
                        i = -5;
                    } catch (Exception e) {
                        e = e;
                    }
                    while (!z) {
                        if (z2) {
                            z3 = z;
                        } else {
                            int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
                            if (sampleTrackIndex == findTrack) {
                                z3 = z;
                                int dequeueInputBuffer2 = prepareDecoder.dequeueInputBuffer(100L);
                                if (dequeueInputBuffer2 >= 0) {
                                    ByteBuffer inputBuffer = prepareDecoder.getInputBuffer(dequeueInputBuffer2);
                                    Intrinsics.checkNotNull(inputBuffer);
                                    int readSampleData = mediaExtractor.readSampleData(inputBuffer, 0);
                                    if (readSampleData < 0) {
                                        mediaCodec = prepareDecoder;
                                        mediaCodec.queueInputBuffer(dequeueInputBuffer2, 0, 0, 0L, 4);
                                        z2 = true;
                                    } else {
                                        MediaCodec mediaCodec3 = prepareDecoder;
                                        mediaCodec3.queueInputBuffer(dequeueInputBuffer2, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                                        prepareDecoder = mediaCodec3;
                                        mediaExtractor.advance();
                                    }
                                }
                            } else {
                                z3 = z;
                                if (sampleTrackIndex == -1 && (dequeueInputBuffer = prepareDecoder.dequeueInputBuffer(100L)) >= 0) {
                                    mediaCodec = prepareDecoder;
                                    mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                    z2 = true;
                                }
                            }
                            z = z3;
                            boolean z6 = true;
                            z4 = true;
                            while (true) {
                                if (!z4 || z6) {
                                    try {
                                    } catch (Exception e2) {
                                        e = e2;
                                    }
                                    if (isRunning) {
                                        compressor.dispose(findTrack, mediaCodec, prepareEncoder, inputSurface, outputSurface, mediaExtractor);
                                        compressionProgressListener.onProgressCancelled(i4);
                                        return new Result(id, false, "The compression has stopped!", 0L, null, 24, null);
                                    }
                                    boolean z7 = z;
                                    MediaCodec mediaCodec4 = prepareEncoder;
                                    int i5 = findTrack;
                                    MediaCodec mediaCodec5 = mediaCodec;
                                    int i6 = i;
                                    OutputSurface outputSurface2 = outputSurface;
                                    try {
                                        dequeueOutputBuffer = mediaCodec4.dequeueOutputBuffer(bufferInfo, 100L);
                                        if (dequeueOutputBuffer == -1) {
                                            i = i6;
                                            i3 = -1;
                                            i2 = i5;
                                            z6 = false;
                                            z5 = z7;
                                        } else {
                                            if (dequeueOutputBuffer == -2) {
                                                try {
                                                    MediaFormat outputFormat = mediaCodec4.getOutputFormat();
                                                    Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                                                    if (i6 == -5) {
                                                        int addTrack = createMovie.addTrack(outputFormat, false);
                                                        z5 = z7;
                                                        i = addTrack;
                                                        i2 = i5;
                                                        i3 = -1;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                }
                                            } else if (dequeueOutputBuffer != -3) {
                                                if (dequeueOutputBuffer < 0) {
                                                    throw new RuntimeException("unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer);
                                                }
                                                ByteBuffer outputBuffer = mediaCodec4.getOutputBuffer(dequeueOutputBuffer);
                                                if (outputBuffer == null) {
                                                    throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                                                }
                                                i2 = i5;
                                                if (bufferInfo.size > 1 && (bufferInfo.flags & 2) == 0) {
                                                    createMovie.writeSampleData(i6, outputBuffer, bufferInfo, false);
                                                }
                                                z5 = (bufferInfo.flags & 4) != 0;
                                                mediaCodec4.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                i = i6;
                                                i3 = -1;
                                            }
                                            i2 = i5;
                                            z5 = z7;
                                            i = i6;
                                            i3 = -1;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                    }
                                    if (dequeueOutputBuffer == i3) {
                                        int dequeueOutputBuffer2 = mediaCodec5.dequeueOutputBuffer(bufferInfo, 100L);
                                        if (dequeueOutputBuffer2 == i3) {
                                            i4 = id;
                                            mediaExtractor = extractor;
                                            z = z5;
                                            prepareEncoder = mediaCodec4;
                                            outputSurface = outputSurface2;
                                            z4 = false;
                                            compressor = this;
                                            mediaCodec = mediaCodec5;
                                            findTrack = i2;
                                        } else if (dequeueOutputBuffer2 != -3 && dequeueOutputBuffer2 != -2) {
                                            if (dequeueOutputBuffer2 < 0) {
                                                throw new RuntimeException("unexpected result from decoder.dequeueOutputBuffer: " + dequeueOutputBuffer2);
                                            }
                                            boolean z8 = bufferInfo.size != 0;
                                            mediaCodec5.releaseOutputBuffer(dequeueOutputBuffer2, z8);
                                            if (z8) {
                                                try {
                                                    outputSurface2.awaitNewImage();
                                                    outputSurface2.drawImage();
                                                    mediaCodec2 = mediaCodec5;
                                                    inputSurface.setPresentationTime(bufferInfo.presentationTimeUs * 1000);
                                                    i4 = id;
                                                    compressionProgressListener.onProgressChanged(i4, (bufferInfo.presentationTimeUs / duration) * 100);
                                                    inputSurface.swapBuffers();
                                                } catch (Exception e5) {
                                                    i4 = id;
                                                    mediaCodec2 = mediaCodec5;
                                                    String message = e5.getMessage();
                                                    if (message == null) {
                                                        message = "Compression failed at swapping buffer";
                                                    }
                                                    Log.e("Compressor", message);
                                                }
                                            } else {
                                                i4 = id;
                                                mediaCodec2 = mediaCodec5;
                                            }
                                            if ((bufferInfo.flags & 4) != 0) {
                                                mediaCodec4.signalEndOfInputStream();
                                                mediaCodec = mediaCodec2;
                                                outputSurface = outputSurface2;
                                                mediaExtractor = extractor;
                                                z = z5;
                                                prepareEncoder = mediaCodec4;
                                                findTrack = i2;
                                                z4 = false;
                                                compressor = this;
                                            }
                                            mediaCodec = mediaCodec2;
                                            outputSurface = outputSurface2;
                                            mediaExtractor = extractor;
                                            z = z5;
                                            prepareEncoder = mediaCodec4;
                                            findTrack = i2;
                                            compressor = this;
                                            e = e2;
                                            CompressorUtils.INSTANCE.printException(e);
                                            return new Result(id, false, e.getMessage(), 0L, null, 24, null);
                                        }
                                    }
                                    i4 = id;
                                    mediaCodec2 = mediaCodec5;
                                    mediaCodec = mediaCodec2;
                                    outputSurface = outputSurface2;
                                    mediaExtractor = extractor;
                                    z = z5;
                                    prepareEncoder = mediaCodec4;
                                    findTrack = i2;
                                    compressor = this;
                                }
                            }
                        }
                        mediaCodec = prepareDecoder;
                        z = z3;
                        boolean z62 = true;
                        z4 = true;
                        while (true) {
                            if (!z4) {
                            }
                            if (isRunning) {
                            }
                        }
                    }
                    compressor.dispose(findTrack, prepareDecoder, prepareEncoder, inputSurface, outputSurface, mediaExtractor);
                    compressor.processAudio(createMovie, bufferInfo, disableAudio, mediaExtractor);
                    mediaExtractor.release();
                    try {
                        createMovie.finishMovie();
                    } catch (Exception e6) {
                        CompressorUtils.INSTANCE.printException(e6);
                    }
                } catch (Exception e7) {
                    e = e7;
                    CompressorUtils.INSTANCE.printException(e);
                    if (streamableFile != null) {
                    }
                    return new Result(id, true, null, file.length(), file.getPath());
                }
            } catch (Exception e8) {
                e = e8;
                CompressorUtils.INSTANCE.printException(e);
                if (streamableFile != null) {
                }
                return new Result(id, true, null, file.length(), file.getPath());
            }
            if (streamableFile != null) {
                try {
                    boolean start = StreamableVideo.INSTANCE.start(file, new File(streamableFile));
                    File file2 = new File(streamableFile);
                    if (start) {
                        try {
                            if (file.exists()) {
                                file.delete();
                            }
                        } catch (Exception e9) {
                            e = e9;
                            file = file2;
                            CompressorUtils.INSTANCE.printException(e);
                            return new Result(id, true, null, file.length(), file.getPath());
                        }
                    }
                    file = file2;
                } catch (Exception e10) {
                    e = e10;
                }
            }
            return new Result(id, true, null, file.length(), file.getPath());
        }
        return new Result(id, false, "Something went wrong, please try again", 0L, null, 24, null);
    }

    private final void processAudio(MP4Builder mediaMuxer, MediaCodec.BufferInfo bufferInfo, boolean disableAudio, MediaExtractor extractor) {
        long sampleSize;
        int findTrack = CompressorUtils.INSTANCE.findTrack(extractor, false);
        if (findTrack < 0 || disableAudio) {
            return;
        }
        extractor.selectTrack(findTrack);
        MediaFormat trackFormat = extractor.getTrackFormat(findTrack);
        Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
        int addTrack = mediaMuxer.addTrack(trackFormat, true);
        int integer = trackFormat.getInteger("max-input-size");
        if (integer <= 0) {
            integer = 65536;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(integer);
        Intrinsics.checkNotNullExpressionValue(allocateDirect, "allocateDirect(...)");
        if (Build.VERSION.SDK_INT >= 28) {
            sampleSize = extractor.getSampleSize();
            if (sampleSize > integer) {
                allocateDirect = ByteBuffer.allocateDirect((int) (sampleSize + 1024));
                Intrinsics.checkNotNullExpressionValue(allocateDirect, "allocateDirect(...)");
            }
        }
        extractor.seekTo(0L, 0);
        boolean z = false;
        while (!z) {
            int sampleTrackIndex = extractor.getSampleTrackIndex();
            if (sampleTrackIndex == findTrack) {
                bufferInfo.size = extractor.readSampleData(allocateDirect, 0);
                if (bufferInfo.size >= 0) {
                    bufferInfo.presentationTimeUs = extractor.getSampleTime();
                    bufferInfo.offset = 0;
                    bufferInfo.flags = 1;
                    mediaMuxer.writeSampleData(addTrack, allocateDirect, bufferInfo, true);
                    extractor.advance();
                } else {
                    bufferInfo.size = 0;
                    z = true;
                }
            } else if (sampleTrackIndex == -1) {
                z = true;
            }
        }
        extractor.unselectTrack(findTrack);
    }

    private final MediaCodec prepareEncoder(MediaFormat outputFormat, boolean hasQTI) {
        MediaCodec createEncoderByType;
        if (hasQTI) {
            createEncoderByType = MediaCodec.createByCodecName("c2.android.avc.encoder");
        } else {
            createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        }
        Intrinsics.checkNotNull(createEncoderByType);
        createEncoderByType.configure(outputFormat, (Surface) null, (MediaCrypto) null, 1);
        return createEncoderByType;
    }

    private final MediaCodec prepareDecoder(MediaFormat inputFormat, OutputSurface outputSurface) {
        String string = inputFormat.getString("mime");
        Intrinsics.checkNotNull(string);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
        Intrinsics.checkNotNullExpressionValue(createDecoderByType, "createDecoderByType(...)");
        createDecoderByType.configure(inputFormat, outputSurface.getMSurface(), (MediaCrypto) null, 0);
        return createDecoderByType;
    }

    private final void dispose(int videoIndex, MediaCodec decoder, MediaCodec encoder, InputSurface inputSurface, OutputSurface outputSurface, MediaExtractor extractor) {
        extractor.unselectTrack(videoIndex);
        decoder.stop();
        decoder.release();
        encoder.stop();
        encoder.release();
        inputSurface.release();
        outputSurface.release();
    }
}
