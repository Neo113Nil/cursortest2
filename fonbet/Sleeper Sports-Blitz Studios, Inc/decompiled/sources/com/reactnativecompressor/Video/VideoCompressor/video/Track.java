package com.reactnativecompressor.Video.VideoCompressor.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.OpusUtil;
import com.reactnativecompressor.Utils.Utils;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.sentry.protocol.profiling.SentryProfile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.AudioSpecificConfig;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.DecoderConfigDescriptor;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.SLConfigDescriptor;
import org.mp4parser.boxes.iso14496.part12.SampleDescriptionBox;
import org.mp4parser.boxes.iso14496.part14.ESDescriptorBox;
import org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox;
import org.mp4parser.boxes.sampleentry.AudioSampleEntry;
import org.mp4parser.boxes.sampleentry.VisualSampleEntry;

/* compiled from: Track.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010#\u001a\u00020\u000bJ\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010*\u001a\u00020\u000bJ\u0006\u0010+\u001a\u00020\u0011J\u0006\u0010,\u001a\u00020\u0013J\b\u0010-\u001a\u0004\u0018\u00010.J\u0006\u0010/\u001a\u00020\u0003J\u0006\u00100\u001a\u00020\u0018J\u0006\u00101\u001a\u00020\u0003J\u0006\u00102\u001a\u00020\u0003J\u0006\u00103\u001a\u00020\u001cJ\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\u0006\u0010\u001e\u001a\u00020\u0007J\f\u00105\u001a\u000206*\u000206H\u0002J\u001c\u00105\u001a\u000207*\u0002072\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003H\u0002J\u0014\u00105\u001a\u00020:*\u00020:2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/reactnativecompressor/Video/VideoCompressor/video/Track;", "", "id", "", "format", "Landroid/media/MediaFormat;", MimeTypes.BASE_TYPE_AUDIO, "", "<init>", "(ILandroid/media/MediaFormat;Z)V", "trackId", "", SentryProfile.JsonKeys.SAMPLES, "Ljava/util/ArrayList;", "Lcom/reactnativecompressor/Video/VideoCompressor/video/Sample;", "duration", "handler", "", "sampleDescriptionBox", "Lorg/mp4parser/boxes/iso14496/part12/SampleDescriptionBox;", "syncSamples", "Ljava/util/LinkedList;", "timeScale", "creationTime", "Ljava/util/Date;", "height", "width", "volume", "", "sampleDurations", "isAudio", "samplingFrequencyIndexMap", "", "lastPresentationTimeUs", "first", "getTrackId", "addSample", "", TypedValues.CycleType.S_WAVE_OFFSET, "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "getSamples", "getDuration", "getHandler", "getSampleDescriptionBox", "getSyncSamples", "", "getTimeScale", "getCreationTime", "getWidth", "getHeight", "getVolume", "getSampleDurations", "setup", "Lorg/mp4parser/boxes/iso14496/part1/objectdescriptors/DecoderConfigDescriptor;", "Lorg/mp4parser/boxes/sampleentry/VisualSampleEntry;", "w", CmcdData.STREAMING_FORMAT_HLS, "Lorg/mp4parser/boxes/sampleentry/AudioSampleEntry;", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Track {
    private final Date creationTime;
    private long duration;
    private boolean first;
    private String handler;
    private int height;
    private final boolean isAudio;
    private long lastPresentationTimeUs;
    private SampleDescriptionBox sampleDescriptionBox;
    private final ArrayList<Long> sampleDurations;
    private final ArrayList<Sample> samples;
    private Map<Integer, Integer> samplingFrequencyIndexMap;
    private LinkedList<Integer> syncSamples;
    private int timeScale;
    private long trackId;
    private float volume;
    private int width;

    public Track(int i, MediaFormat format, boolean z) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.samples = new ArrayList<>();
        this.creationTime = new Date();
        ArrayList<Long> arrayList = new ArrayList<>();
        this.sampleDurations = arrayList;
        this.isAudio = z;
        this.samplingFrequencyIndexMap = new HashMap();
        this.first = true;
        this.samplingFrequencyIndexMap = MapsKt.mapOf(TuplesKt.to(96000, 0), TuplesKt.to(88200, 1), TuplesKt.to(64000, 2), TuplesKt.to(Integer.valueOf(OpusUtil.SAMPLE_RATE), 3), TuplesKt.to(Integer.valueOf(AudioConstants.AUDIO_SAMPLE_RATE), 4), TuplesKt.to(32000, 5), TuplesKt.to(24000, 6), TuplesKt.to(22050, 7), TuplesKt.to(Integer.valueOf(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND), 8), TuplesKt.to(12000, 9), TuplesKt.to(11025, 10), TuplesKt.to(8000, 11));
        this.trackId = i;
        if (!z) {
            arrayList.add(3015L);
            this.duration = 3015L;
            this.width = format.getInteger("width");
            this.height = format.getInteger("height");
            this.timeScale = 90000;
            this.syncSamples = new LinkedList<>();
            this.handler = "vide";
            this.sampleDescriptionBox = new SampleDescriptionBox();
            String string = format.getString("mime");
            if (Intrinsics.areEqual(string, MimeTypes.VIDEO_H264)) {
                VisualSampleEntry upVar = setup(new VisualSampleEntry(VisualSampleEntry.TYPE3), this.width, this.height);
                AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox();
                ByteBuffer byteBuffer = format.getByteBuffer("csd-0");
                avcConfigurationBox.setSequenceParameterSets(byteBuffer != null ? CollectionsKt.listOf(Utils.subBuffer$default(Utils.INSTANCE, byteBuffer, 4, 0, 4, null)) : null);
                ByteBuffer byteBuffer2 = format.getByteBuffer("csd-1");
                avcConfigurationBox.setPictureParameterSets(byteBuffer2 != null ? CollectionsKt.listOf(Utils.subBuffer$default(Utils.INSTANCE, byteBuffer2, 4, 0, 4, null)) : null);
                if (format.containsKey("level")) {
                    int integer = format.getInteger("level");
                    if (integer == 1) {
                        avcConfigurationBox.setAvcLevelIndication(1);
                    } else if (integer != 2) {
                        switch (integer) {
                            case 4:
                                avcConfigurationBox.setAvcLevelIndication(11);
                                break;
                            case 8:
                                avcConfigurationBox.setAvcLevelIndication(12);
                                break;
                            case 16:
                                avcConfigurationBox.setAvcLevelIndication(13);
                                break;
                            case 32:
                                avcConfigurationBox.setAvcLevelIndication(2);
                                break;
                            case 64:
                                avcConfigurationBox.setAvcLevelIndication(21);
                                break;
                            case 128:
                                avcConfigurationBox.setAvcLevelIndication(22);
                                break;
                            case 256:
                                avcConfigurationBox.setAvcLevelIndication(3);
                                break;
                            case 512:
                                avcConfigurationBox.setAvcLevelIndication(31);
                                break;
                            case 1024:
                                avcConfigurationBox.setAvcLevelIndication(32);
                                break;
                            case 2048:
                                avcConfigurationBox.setAvcLevelIndication(4);
                                break;
                            case 4096:
                                avcConfigurationBox.setAvcLevelIndication(41);
                                break;
                            case 8192:
                                avcConfigurationBox.setAvcLevelIndication(42);
                                break;
                            case 16384:
                                avcConfigurationBox.setAvcLevelIndication(5);
                                break;
                            case 32768:
                                avcConfigurationBox.setAvcLevelIndication(51);
                                break;
                            case 65536:
                                avcConfigurationBox.setAvcLevelIndication(52);
                                break;
                            default:
                                avcConfigurationBox.setAvcLevelIndication(13);
                                break;
                        }
                    } else {
                        avcConfigurationBox.setAvcLevelIndication(27);
                    }
                } else {
                    avcConfigurationBox.setAvcLevelIndication(13);
                }
                avcConfigurationBox.setAvcProfileIndication(100);
                avcConfigurationBox.setBitDepthLumaMinus8(-1);
                avcConfigurationBox.setBitDepthChromaMinus8(-1);
                avcConfigurationBox.setChromaFormat(-1);
                avcConfigurationBox.setConfigurationVersion(1);
                avcConfigurationBox.setLengthSizeMinusOne(3);
                avcConfigurationBox.setProfileCompatibility(0);
                upVar.addBox(avcConfigurationBox);
                this.sampleDescriptionBox.addBox(upVar);
                return;
            }
            if (Intrinsics.areEqual(string, "video/mp4v")) {
                this.sampleDescriptionBox.addBox(setup(new VisualSampleEntry(VisualSampleEntry.TYPE1), this.width, this.height));
                return;
            }
            return;
        }
        arrayList.add(1024L);
        this.duration = 1024L;
        this.volume = 1.0f;
        this.timeScale = format.getInteger("sample-rate");
        this.handler = "soun";
        this.sampleDescriptionBox = new SampleDescriptionBox();
        AudioSampleEntry upVar2 = setup(new AudioSampleEntry(AudioSampleEntry.TYPE3), format);
        ESDescriptorBox eSDescriptorBox = new ESDescriptorBox();
        ESDescriptor eSDescriptor = new ESDescriptor();
        eSDescriptor.setEsId(0);
        SLConfigDescriptor sLConfigDescriptor = new SLConfigDescriptor();
        sLConfigDescriptor.setPredefined(2);
        eSDescriptor.setSlConfigDescriptor(sLConfigDescriptor);
        DecoderConfigDescriptor upVar3 = setup(new DecoderConfigDescriptor());
        AudioSpecificConfig audioSpecificConfig = new AudioSpecificConfig();
        audioSpecificConfig.setOriginalAudioObjectType(2);
        Integer num = this.samplingFrequencyIndexMap.get(Integer.valueOf((int) upVar2.getSampleRate()));
        Intrinsics.checkNotNull(num);
        audioSpecificConfig.setSamplingFrequencyIndex(num.intValue());
        audioSpecificConfig.setChannelConfiguration(upVar2.getChannelCount());
        upVar3.setAudioSpecificInfo(audioSpecificConfig);
        eSDescriptor.setDecoderConfigDescriptor(upVar3);
        eSDescriptorBox.setEsDescriptor(eSDescriptor);
        upVar2.addBox(eSDescriptorBox);
        this.sampleDescriptionBox.addBox(upVar2);
    }

    public final long getTrackId() {
        return this.trackId;
    }

    public final void addSample(long offset, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        boolean z = (this.isAudio || (bufferInfo.flags & 1) == 0) ? false : true;
        this.samples.add(new Sample(offset, bufferInfo.size));
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList != null && z && linkedList != null) {
            linkedList.add(Integer.valueOf(this.samples.size()));
        }
        long j = bufferInfo.presentationTimeUs - this.lastPresentationTimeUs;
        this.lastPresentationTimeUs = bufferInfo.presentationTimeUs;
        long j2 = ((j * this.timeScale) + 500000) / 1000000;
        if (!this.first) {
            ArrayList<Long> arrayList = this.sampleDurations;
            arrayList.add(arrayList.size() - 1, Long.valueOf(j2));
            this.duration += j2;
        }
        this.first = false;
    }

    public final ArrayList<Sample> getSamples() {
        return this.samples;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getHandler() {
        return this.handler;
    }

    public final SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public final long[] getSyncSamples() {
        LinkedList<Integer> linkedList = this.syncSamples;
        if (linkedList == null) {
            return null;
        }
        Intrinsics.checkNotNull(linkedList);
        if (linkedList.isEmpty()) {
            return null;
        }
        LinkedList<Integer> linkedList2 = this.syncSamples;
        Intrinsics.checkNotNull(linkedList2);
        long[] jArr = new long[linkedList2.size()];
        LinkedList<Integer> linkedList3 = this.syncSamples;
        Intrinsics.checkNotNull(linkedList3);
        int size = linkedList3.size();
        for (int i = 0; i < size; i++) {
            Intrinsics.checkNotNull(this.syncSamples);
            jArr[i] = r3.get(i).intValue();
        }
        return jArr;
    }

    public final int getTimeScale() {
        return this.timeScale;
    }

    public final Date getCreationTime() {
        return this.creationTime;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final ArrayList<Long> getSampleDurations() {
        return this.sampleDurations;
    }

    /* renamed from: isAudio, reason: from getter */
    public final boolean getIsAudio() {
        return this.isAudio;
    }

    private final DecoderConfigDescriptor setup(DecoderConfigDescriptor decoderConfigDescriptor) {
        decoderConfigDescriptor.setObjectTypeIndication(64);
        decoderConfigDescriptor.setStreamType(5);
        decoderConfigDescriptor.setBufferSizeDB(1536);
        decoderConfigDescriptor.setMaxBitRate(96000L);
        decoderConfigDescriptor.setAvgBitRate(96000L);
        return decoderConfigDescriptor;
    }

    private final VisualSampleEntry setup(VisualSampleEntry visualSampleEntry, int i, int i2) {
        visualSampleEntry.setDataReferenceIndex(1);
        visualSampleEntry.setDepth(24);
        visualSampleEntry.setFrameCount(1);
        visualSampleEntry.setHorizresolution(72.0d);
        visualSampleEntry.setVertresolution(72.0d);
        visualSampleEntry.setWidth(i);
        visualSampleEntry.setHeight(i2);
        visualSampleEntry.setCompressorname("AVC Coding");
        return visualSampleEntry;
    }

    private final AudioSampleEntry setup(AudioSampleEntry audioSampleEntry, MediaFormat mediaFormat) {
        audioSampleEntry.setChannelCount(mediaFormat.getInteger("channel-count"));
        audioSampleEntry.setSampleRate(mediaFormat.getInteger("sample-rate"));
        audioSampleEntry.setDataReferenceIndex(1);
        audioSampleEntry.setSampleSize(16);
        return audioSampleEntry;
    }
}
