package com.reactnativecompressor.Video.VideoCompressor.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mp4parser.support.Matrix;

/* compiled from: Mp4Movie.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bJ\u001e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/reactnativecompressor/Video/VideoCompressor/video/Mp4Movie;", "", "<init>", "()V", "matrix", "Lorg/mp4parser/support/Matrix;", "kotlin.jvm.PlatformType", "tracks", "Ljava/util/ArrayList;", "Lcom/reactnativecompressor/Video/VideoCompressor/video/Track;", "cacheFile", "Ljava/io/File;", "getMatrix", "setCacheFile", "", "file", "setRotation", "angle", "", "getTracks", "getCacheFile", "addSample", "trackIndex", TypedValues.CycleType.S_WAVE_OFFSET, "", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "addTrack", "mediaFormat", "Landroid/media/MediaFormat;", "isAudio", "", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Mp4Movie {
    private File cacheFile;
    private Matrix matrix = Matrix.ROTATE_0;
    private final ArrayList<Track> tracks = new ArrayList<>();

    public final Matrix getMatrix() {
        return this.matrix;
    }

    public final void setCacheFile(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.cacheFile = file;
    }

    public final void setRotation(int angle) {
        if (angle == 0) {
            this.matrix = Matrix.ROTATE_0;
            return;
        }
        if (angle == 90) {
            this.matrix = Matrix.ROTATE_90;
        } else if (angle == 180) {
            this.matrix = Matrix.ROTATE_180;
        } else {
            if (angle != 270) {
                return;
            }
            this.matrix = Matrix.ROTATE_270;
        }
    }

    public final ArrayList<Track> getTracks() {
        return this.tracks;
    }

    public final File getCacheFile() {
        return this.cacheFile;
    }

    public final void addSample(int trackIndex, long offset, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (trackIndex < 0 || trackIndex >= this.tracks.size()) {
            return;
        }
        Track track = this.tracks.get(trackIndex);
        Intrinsics.checkNotNullExpressionValue(track, "get(...)");
        track.addSample(offset, bufferInfo);
    }

    public final int addTrack(MediaFormat mediaFormat, boolean isAudio) {
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        this.tracks.add(new Track(this.tracks.size(), mediaFormat, isAudio));
        return this.tracks.size() - 1;
    }
}
