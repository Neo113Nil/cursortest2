package com.reactnativecompressor.Audio;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AudioExtractor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007¨\u0006\u0010"}, d2 = {"Lcom/reactnativecompressor/Audio/AudioExtractor;", "", "<init>", "()V", "genVideoUsingMuxer", "", "srcPath", "", "dstPath", "startMs", "", "endMs", "useAudio", "", "useVideo", "Companion", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AudioExtractor {
    private static final int DEFAULT_BUFFER_SIZE = 1048576;
    private static final String TAG = "AudioExtractorDecoder";

    public final void genVideoUsingMuxer(String srcPath, String dstPath, int startMs, int endMs, boolean useAudio, boolean useVideo) throws IOException {
        int parseInt;
        int integer;
        MediaExtractor mediaExtractor = new MediaExtractor();
        Intrinsics.checkNotNull(srcPath);
        mediaExtractor.setDataSource(srcPath);
        int trackCount = mediaExtractor.getTrackCount();
        Intrinsics.checkNotNull(dstPath);
        MediaMuxer mediaMuxer = new MediaMuxer(dstPath, 0);
        HashMap hashMap = new HashMap(trackCount);
        int i = -1;
        for (int i2 = 0; i2 < trackCount; i2++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            Intrinsics.checkNotNull(string);
            if ((StringsKt.startsWith$default(string, "audio/", false, 2, (Object) null) && useAudio) || (StringsKt.startsWith$default(string, "video/", false, 2, (Object) null) && useVideo)) {
                mediaExtractor.selectTrack(i2);
                hashMap.put(Integer.valueOf(i2), Integer.valueOf(mediaMuxer.addTrack(trackFormat)));
                if (trackFormat.containsKey("max-input-size") && (integer = trackFormat.getInteger("max-input-size")) > i) {
                    i = integer;
                }
            }
        }
        if (i < 0) {
            i = 1048576;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(srcPath);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
        if (extractMetadata != null && (parseInt = Integer.parseInt(extractMetadata)) >= 0) {
            mediaMuxer.setOrientationHint(parseInt);
        }
        if (startMs > 0) {
            mediaExtractor.seekTo(startMs * 1000, 2);
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        mediaMuxer.start();
        while (true) {
            bufferInfo.offset = 0;
            bufferInfo.size = mediaExtractor.readSampleData(allocate, 0);
            if (bufferInfo.size < 0) {
                Log.d(TAG, "Saw input EOS.");
                bufferInfo.size = 0;
                break;
            }
            bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
            if (endMs > 0 && bufferInfo.presentationTimeUs > endMs * 1000) {
                Log.d(TAG, "The current sample is over the trim end time.");
                break;
            }
            bufferInfo.flags = mediaExtractor.getSampleFlags();
            Object obj = hashMap.get(Integer.valueOf(mediaExtractor.getSampleTrackIndex()));
            Intrinsics.checkNotNull(obj);
            mediaMuxer.writeSampleData(((Number) obj).intValue(), allocate, bufferInfo);
            mediaExtractor.advance();
        }
        mediaMuxer.stop();
        mediaMuxer.release();
    }
}
