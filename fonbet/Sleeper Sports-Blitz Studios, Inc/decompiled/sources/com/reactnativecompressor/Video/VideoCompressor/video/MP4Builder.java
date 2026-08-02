package com.reactnativecompressor.Video.VideoCompressor.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.mp4parser.Box;
import org.mp4parser.boxes.iso14496.part12.DataEntryUrlBox;
import org.mp4parser.boxes.iso14496.part12.DataInformationBox;
import org.mp4parser.boxes.iso14496.part12.DataReferenceBox;
import org.mp4parser.boxes.iso14496.part12.FileTypeBox;
import org.mp4parser.boxes.iso14496.part12.HandlerBox;
import org.mp4parser.boxes.iso14496.part12.HintMediaHeaderBox;
import org.mp4parser.boxes.iso14496.part12.MediaBox;
import org.mp4parser.boxes.iso14496.part12.MediaDataBox;
import org.mp4parser.boxes.iso14496.part12.MediaHeaderBox;
import org.mp4parser.boxes.iso14496.part12.MediaInformationBox;
import org.mp4parser.boxes.iso14496.part12.MovieBox;
import org.mp4parser.boxes.iso14496.part12.MovieHeaderBox;
import org.mp4parser.boxes.iso14496.part12.NullMediaHeaderBox;
import org.mp4parser.boxes.iso14496.part12.SampleSizeBox;
import org.mp4parser.boxes.iso14496.part12.SampleTableBox;
import org.mp4parser.boxes.iso14496.part12.SampleToChunkBox;
import org.mp4parser.boxes.iso14496.part12.SoundMediaHeaderBox;
import org.mp4parser.boxes.iso14496.part12.StaticChunkOffsetBox;
import org.mp4parser.boxes.iso14496.part12.SubtitleMediaHeaderBox;
import org.mp4parser.boxes.iso14496.part12.SyncSampleBox;
import org.mp4parser.boxes.iso14496.part12.TimeToSampleBox;
import org.mp4parser.boxes.iso14496.part12.TrackBox;
import org.mp4parser.boxes.iso14496.part12.TrackHeaderBox;
import org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox;
import org.mp4parser.support.Matrix;

/* compiled from: MP4Builder.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0002J&\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0010J\u0016\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010%\u001a\u00020\u001aJ\b\u0010&\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\rH\u0002J\u0010\u0010+\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0007H\u0002J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0007H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00101\u001a\u00020\u0013H\u0002J\u0018\u00104\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u00132\u0006\u00105\u001a\u000206H\u0002J\u0018\u00107\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u00132\u0006\u00105\u001a\u000206H\u0002J\u0018\u00108\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u00132\u0006\u00105\u001a\u000206H\u0002J\u0018\u00109\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u00132\u0006\u00105\u001a\u000206H\u0002J\u0018\u0010:\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u00132\u0006\u00105\u001a\u000206H\u0002J\u0018\u0010;\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u00132\u0006\u00105\u001a\u000206H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/reactnativecompressor/Video/VideoCompressor/video/MP4Builder;", "", "<init>", "()V", MediaDataBox.TYPE, "Lcom/reactnativecompressor/Video/VideoCompressor/video/Mdat;", "currentMp4Movie", "Lcom/reactnativecompressor/Video/VideoCompressor/video/Mp4Movie;", "fos", "Ljava/io/FileOutputStream;", "fc", "Ljava/nio/channels/FileChannel;", "dataOffset", "", "wroteSinceLastMdat", "writeNewMdat", "", "track2SampleSizes", "Ljava/util/HashMap;", "Lcom/reactnativecompressor/Video/VideoCompressor/video/Track;", "", "sizeBuffer", "Ljava/nio/ByteBuffer;", "createMovie", "mp4Movie", "flushCurrentMdat", "", "writeSampleData", "trackIndex", "", "byteBuf", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "isAudio", "addTrack", "mediaFormat", "Landroid/media/MediaFormat;", "finishMovie", "createFileTypeBox", "Lorg/mp4parser/boxes/iso14496/part12/FileTypeBox;", "gcd", "a", "b", "getTimescale", "createMovieBox", "Lorg/mp4parser/boxes/iso14496/part12/MovieBox;", "movie", "createTrackBox", "Lorg/mp4parser/boxes/iso14496/part12/TrackBox;", "track", "createStbl", "Lorg/mp4parser/Box;", "createStsd", SampleTableBox.TYPE, "Lorg/mp4parser/boxes/iso14496/part12/SampleTableBox;", "createStts", "createStss", "createStsc", "createStsz", "createStco", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MP4Builder {
    private Mp4Movie currentMp4Movie;
    private long dataOffset;
    private FileChannel fc;
    private FileOutputStream fos;
    private Mdat mdat;
    private ByteBuffer sizeBuffer;
    private long wroteSinceLastMdat;
    private boolean writeNewMdat = true;
    private final HashMap<Track, long[]> track2SampleSizes = new HashMap<>();

    public final MP4Builder createMovie(Mp4Movie mp4Movie) throws Exception {
        Intrinsics.checkNotNullParameter(mp4Movie, "mp4Movie");
        this.currentMp4Movie = mp4Movie;
        FileOutputStream fileOutputStream = new FileOutputStream(mp4Movie.getCacheFile());
        this.fos = fileOutputStream;
        this.fc = fileOutputStream.getChannel();
        FileTypeBox createFileTypeBox = createFileTypeBox();
        FileChannel fileChannel = this.fc;
        if (fileChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel = null;
        }
        createFileTypeBox.getBox(fileChannel);
        long size = this.dataOffset + createFileTypeBox.getSize();
        this.dataOffset = size;
        this.wroteSinceLastMdat = size;
        this.mdat = new Mdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    private final void flushCurrentMdat() throws Exception {
        FileChannel fileChannel = this.fc;
        FileOutputStream fileOutputStream = null;
        if (fileChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel = null;
        }
        long position = fileChannel.position();
        FileChannel fileChannel2 = this.fc;
        if (fileChannel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel2 = null;
        }
        Mdat mdat = this.mdat;
        if (mdat == null) {
            Intrinsics.throwUninitializedPropertyAccessException(MediaDataBox.TYPE);
            mdat = null;
        }
        fileChannel2.position(mdat.getDataOffset());
        Mdat mdat2 = this.mdat;
        if (mdat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(MediaDataBox.TYPE);
            mdat2 = null;
        }
        FileChannel fileChannel3 = this.fc;
        if (fileChannel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel3 = null;
        }
        mdat2.getBox(fileChannel3);
        FileChannel fileChannel4 = this.fc;
        if (fileChannel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel4 = null;
        }
        fileChannel4.position(position);
        Mdat mdat3 = this.mdat;
        if (mdat3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(MediaDataBox.TYPE);
            mdat3 = null;
        }
        mdat3.setDataOffset(0L);
        Mdat mdat4 = this.mdat;
        if (mdat4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(MediaDataBox.TYPE);
            mdat4 = null;
        }
        mdat4.setContentSize(0L);
        FileOutputStream fileOutputStream2 = this.fos;
        if (fileOutputStream2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fos");
        } else {
            fileOutputStream = fileOutputStream2;
        }
        fileOutputStream.flush();
    }

    public final void writeSampleData(int trackIndex, ByteBuffer byteBuf, MediaCodec.BufferInfo bufferInfo, boolean isAudio) throws Exception {
        boolean z;
        Intrinsics.checkNotNullParameter(byteBuf, "byteBuf");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        FileOutputStream fileOutputStream = null;
        if (this.writeNewMdat) {
            Mdat mdat = this.mdat;
            if (mdat == null) {
                Intrinsics.throwUninitializedPropertyAccessException(MediaDataBox.TYPE);
                mdat = null;
            }
            mdat.setContentSize(0L);
            FileChannel fileChannel = this.fc;
            if (fileChannel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fc");
                fileChannel = null;
            }
            mdat.getBox(fileChannel);
            mdat.setDataOffset(this.dataOffset);
            long j = 16;
            this.dataOffset += j;
            this.wroteSinceLastMdat += j;
            this.writeNewMdat = false;
        }
        Mdat mdat2 = this.mdat;
        if (mdat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(MediaDataBox.TYPE);
            mdat2 = null;
        }
        Mdat mdat3 = this.mdat;
        if (mdat3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(MediaDataBox.TYPE);
            mdat3 = null;
        }
        mdat2.setContentSize(mdat3.getContentSize() + bufferInfo.size);
        long j2 = this.wroteSinceLastMdat + bufferInfo.size;
        this.wroteSinceLastMdat = j2;
        if (j2 >= 32768) {
            flushCurrentMdat();
            z = true;
            this.writeNewMdat = true;
            this.wroteSinceLastMdat = 0L;
        } else {
            z = false;
        }
        Mp4Movie mp4Movie = this.currentMp4Movie;
        if (mp4Movie == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentMp4Movie");
            mp4Movie = null;
        }
        mp4Movie.addSample(trackIndex, this.dataOffset, bufferInfo);
        if (!isAudio) {
            byteBuf.position(bufferInfo.offset + 4);
            byteBuf.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer byteBuffer = this.sizeBuffer;
            if (byteBuffer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeBuffer");
                byteBuffer = null;
            }
            byteBuffer.position(0);
            ByteBuffer byteBuffer2 = this.sizeBuffer;
            if (byteBuffer2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeBuffer");
                byteBuffer2 = null;
            }
            byteBuffer2.putInt(bufferInfo.size - 4);
            ByteBuffer byteBuffer3 = this.sizeBuffer;
            if (byteBuffer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeBuffer");
                byteBuffer3 = null;
            }
            byteBuffer3.position(0);
            FileChannel fileChannel2 = this.fc;
            if (fileChannel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fc");
                fileChannel2 = null;
            }
            ByteBuffer byteBuffer4 = this.sizeBuffer;
            if (byteBuffer4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeBuffer");
                byteBuffer4 = null;
            }
            Integer.valueOf(fileChannel2.write(byteBuffer4));
        } else {
            byteBuf.position(bufferInfo.offset);
            byteBuf.limit(bufferInfo.offset + bufferInfo.size);
        }
        FileChannel fileChannel3 = this.fc;
        if (fileChannel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel3 = null;
        }
        fileChannel3.write(byteBuf);
        this.dataOffset += bufferInfo.size;
        if (z) {
            FileOutputStream fileOutputStream2 = this.fos;
            if (fileOutputStream2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fos");
            } else {
                fileOutputStream = fileOutputStream2;
            }
            fileOutputStream.flush();
        }
    }

    public final int addTrack(MediaFormat mediaFormat, boolean isAudio) {
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        Mp4Movie mp4Movie = this.currentMp4Movie;
        if (mp4Movie == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentMp4Movie");
            mp4Movie = null;
        }
        return mp4Movie.addTrack(mediaFormat, isAudio);
    }

    public final void finishMovie() throws Exception {
        Mdat mdat = this.mdat;
        FileOutputStream fileOutputStream = null;
        if (mdat == null) {
            Intrinsics.throwUninitializedPropertyAccessException(MediaDataBox.TYPE);
            mdat = null;
        }
        if (mdat.getContentSize() != 0) {
            flushCurrentMdat();
        }
        Mp4Movie mp4Movie = this.currentMp4Movie;
        if (mp4Movie == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentMp4Movie");
            mp4Movie = null;
        }
        Iterator<Track> it = mp4Movie.getTracks().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Track next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Track track = next;
            ArrayList<Sample> samples = track.getSamples();
            int size = samples.size();
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                jArr[i] = samples.get(i).getSize();
            }
            this.track2SampleSizes.put(track, jArr);
        }
        Mp4Movie mp4Movie2 = this.currentMp4Movie;
        if (mp4Movie2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentMp4Movie");
            mp4Movie2 = null;
        }
        MovieBox createMovieBox = createMovieBox(mp4Movie2);
        FileChannel fileChannel = this.fc;
        if (fileChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel = null;
        }
        createMovieBox.getBox(fileChannel);
        FileOutputStream fileOutputStream2 = this.fos;
        if (fileOutputStream2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fos");
            fileOutputStream2 = null;
        }
        fileOutputStream2.flush();
        FileChannel fileChannel2 = this.fc;
        if (fileChannel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fc");
            fileChannel2 = null;
        }
        fileChannel2.close();
        FileOutputStream fileOutputStream3 = this.fos;
        if (fileOutputStream3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fos");
        } else {
            fileOutputStream = fileOutputStream3;
        }
        fileOutputStream.close();
    }

    private final FileTypeBox createFileTypeBox() {
        return new FileTypeBox("isom", 0L, CollectionsKt.listOf((Object[]) new String[]{"isom", "iso2", "mp41"}));
    }

    private final long gcd(long a2, long b) {
        return b == 0 ? a2 : gcd(b, a2 % b);
    }

    private final long getTimescale(Mp4Movie mp4Movie) {
        long timeScale = !mp4Movie.getTracks().isEmpty() ? mp4Movie.getTracks().iterator().next().getTimeScale() : 0L;
        Iterator<Track> it = mp4Movie.getTracks().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Intrinsics.checkNotNullExpressionValue(it.next(), "next(...)");
            timeScale = gcd(r2.getTimeScale(), timeScale);
        }
        return timeScale;
    }

    private final MovieBox createMovieBox(Mp4Movie movie) {
        MovieBox movieBox = new MovieBox();
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setCreationTime(new Date());
        movieHeaderBox.setModificationTime(new Date());
        movieHeaderBox.setMatrix(Matrix.ROTATE_0);
        long timescale = getTimescale(movie);
        Iterator<Track> it = movie.getTracks().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        long j = 0;
        while (it.hasNext()) {
            Track next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            long duration = (next.getDuration() * timescale) / r8.getTimeScale();
            if (duration > j) {
                j = duration;
            }
        }
        movieHeaderBox.setDuration(j);
        movieHeaderBox.setTimescale(timescale);
        movieHeaderBox.setNextTrackId(movie.getTracks().size() + 1);
        movieBox.addBox(movieHeaderBox);
        Iterator<Track> it2 = movie.getTracks().iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            Track next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
            movieBox.addBox(createTrackBox(next2, movie));
        }
        return movieBox;
    }

    private final TrackBox createTrackBox(Track track, Mp4Movie movie) {
        Matrix matrix;
        TrackBox trackBox = new TrackBox();
        TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setEnabled(true);
        trackHeaderBox.setInPreview(true);
        trackHeaderBox.setInMovie(true);
        if (track.getIsAudio()) {
            matrix = Matrix.ROTATE_0;
        } else {
            matrix = movie.getMatrix();
        }
        trackHeaderBox.setMatrix(matrix);
        trackHeaderBox.setAlternateGroup(0);
        trackHeaderBox.setCreationTime(track.getCreationTime());
        trackHeaderBox.setDuration((track.getDuration() * getTimescale(movie)) / track.getTimeScale());
        trackHeaderBox.setHeight(track.getHeight());
        trackHeaderBox.setWidth(track.getWidth());
        trackHeaderBox.setLayer(0);
        trackHeaderBox.setModificationTime(new Date());
        trackHeaderBox.setTrackId(track.getTrackId() + 1);
        trackHeaderBox.setVolume(track.getVolume());
        trackBox.addBox(trackHeaderBox);
        MediaBox mediaBox = new MediaBox();
        trackBox.addBox(mediaBox);
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(track.getCreationTime());
        mediaHeaderBox.setDuration(track.getDuration());
        mediaHeaderBox.setTimescale(track.getTimeScale());
        mediaHeaderBox.setLanguage("eng");
        mediaBox.addBox(mediaHeaderBox);
        HandlerBox handlerBox = new HandlerBox();
        handlerBox.setName(track.getIsAudio() ? "SoundHandle" : "VideoHandle");
        handlerBox.setHandlerType(track.getHandler());
        mediaBox.addBox(handlerBox);
        MediaInformationBox mediaInformationBox = new MediaInformationBox();
        if (Intrinsics.areEqual(track.getHandler(), "vide")) {
            mediaInformationBox.addBox(new VideoMediaHeaderBox());
        } else if (Intrinsics.areEqual(track.getHandler(), "soun")) {
            mediaInformationBox.addBox(new SoundMediaHeaderBox());
        } else if (Intrinsics.areEqual(track.getHandler(), "text")) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        } else if (Intrinsics.areEqual(track.getHandler(), "subt")) {
            mediaInformationBox.addBox(new SubtitleMediaHeaderBox());
        } else if (Intrinsics.areEqual(track.getHandler(), ViewHierarchyConstants.HINT_KEY)) {
            mediaInformationBox.addBox(new HintMediaHeaderBox());
        } else if (Intrinsics.areEqual(track.getHandler(), "sbtl")) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        }
        DataInformationBox dataInformationBox = new DataInformationBox();
        DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        mediaInformationBox.addBox(dataInformationBox);
        mediaInformationBox.addBox(createStbl(track));
        mediaBox.addBox(mediaInformationBox);
        return trackBox;
    }

    private final Box createStbl(Track track) {
        SampleTableBox sampleTableBox = new SampleTableBox();
        createStsd(track, sampleTableBox);
        createStts(track, sampleTableBox);
        createStss(track, sampleTableBox);
        createStsc(track, sampleTableBox);
        createStsz(track, sampleTableBox);
        createStco(track, sampleTableBox);
        return sampleTableBox;
    }

    private final void createStsd(Track track, SampleTableBox stbl) {
        stbl.addBox(track.getSampleDescriptionBox());
    }

    private final void createStts(Track track, SampleTableBox stbl) {
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = track.getSampleDurations().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        TimeToSampleBox.Entry entry = null;
        while (it.hasNext()) {
            Long next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            long longValue = next.longValue();
            if (entry != null && entry.getDelta() == longValue) {
                entry.setCount(entry.getCount() + 1);
            } else {
                entry = new TimeToSampleBox.Entry(1L, longValue);
                arrayList.add(entry);
            }
        }
        TimeToSampleBox timeToSampleBox = new TimeToSampleBox();
        timeToSampleBox.setEntries(arrayList);
        stbl.addBox(timeToSampleBox);
    }

    private final void createStss(Track track, SampleTableBox stbl) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null) {
            if (syncSamples.length == 0) {
                return;
            }
            SyncSampleBox syncSampleBox = new SyncSampleBox();
            syncSampleBox.setSampleNumber(syncSamples);
            stbl.addBox(syncSampleBox);
        }
    }

    private final void createStsc(Track track, SampleTableBox stbl) {
        int i;
        SampleToChunkBox sampleToChunkBox = new SampleToChunkBox();
        sampleToChunkBox.setEntries(new LinkedList());
        int size = track.getSamples().size();
        int i2 = -1;
        int i3 = 1;
        int i4 = 0;
        for (0; i < size; i + 1) {
            Sample sample = track.getSamples().get(i);
            Intrinsics.checkNotNullExpressionValue(sample, "get(...)");
            Sample sample2 = sample;
            long offset = sample2.getOffset() + sample2.getSize();
            i4++;
            if (i != size - 1) {
                Sample sample3 = track.getSamples().get(i + 1);
                Intrinsics.checkNotNullExpressionValue(sample3, "get(...)");
                i = offset == sample3.getOffset() ? i + 1 : 0;
            }
            if (i2 != i4) {
                sampleToChunkBox.getEntries().add(new SampleToChunkBox.Entry(i3, i4, 1L));
                i2 = i4;
            }
            i3++;
            i4 = 0;
        }
        stbl.addBox(sampleToChunkBox);
    }

    private final void createStsz(Track track, SampleTableBox stbl) {
        SampleSizeBox sampleSizeBox = new SampleSizeBox();
        sampleSizeBox.setSampleSizes(this.track2SampleSizes.get(track));
        stbl.addBox(sampleSizeBox);
    }

    private final void createStco(Track track, SampleTableBox stbl) {
        ArrayList arrayList = new ArrayList();
        Iterator<Sample> it = track.getSamples().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        long j = -1;
        while (it.hasNext()) {
            Sample next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Sample sample = next;
            long offset = sample.getOffset();
            if (j != -1 && j != offset) {
                j = -1;
            }
            if (j == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            j = sample.getSize() + offset;
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            jArr[i] = ((Number) obj).longValue();
        }
        StaticChunkOffsetBox staticChunkOffsetBox = new StaticChunkOffsetBox();
        staticChunkOffsetBox.setChunkOffsets(jArr);
        stbl.addBox(staticChunkOffsetBox);
    }
}
