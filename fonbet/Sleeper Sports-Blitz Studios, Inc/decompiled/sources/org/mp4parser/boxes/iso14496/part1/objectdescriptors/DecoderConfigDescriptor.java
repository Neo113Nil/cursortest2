package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mp4parser.tools.Hex;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Descriptor(tags = {4})
/* loaded from: classes10.dex */
public class DecoderConfigDescriptor extends BaseDescriptor {
    private static final Logger LOG = LoggerFactory.getLogger((Class<?>) DecoderConfigDescriptor.class);
    AudioSpecificConfig audioSpecificInfo;
    long avgBitRate;
    int bufferSizeDB;
    byte[] configDescriptorDeadBytes;
    DecoderSpecificInfo decoderSpecificInfo;
    long maxBitRate;
    int objectTypeIndication;
    List<ProfileLevelIndicationDescriptor> profileLevelIndicationDescriptors = new ArrayList();
    int streamType;
    int upStream;

    public DecoderConfigDescriptor() {
        this.tag = 4;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer) throws IOException {
        int size;
        this.objectTypeIndication = IsoTypeReader.readUInt8(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.streamType = readUInt8 >>> 2;
        this.upStream = (readUInt8 >> 1) & 1;
        this.bufferSizeDB = IsoTypeReader.readUInt24(byteBuffer);
        this.maxBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.avgBitRate = IsoTypeReader.readUInt32(byteBuffer);
        while (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            BaseDescriptor createFrom = ObjectDescriptorFactory.createFrom(this.objectTypeIndication, byteBuffer);
            int position2 = byteBuffer.position() - position;
            LOG.trace("{} - DecoderConfigDescr1 read: {}, size: {}", createFrom, Integer.valueOf(position2), createFrom != null ? Integer.valueOf(createFrom.getSize()) : null);
            if (createFrom != null && position2 < (size = createFrom.getSize())) {
                byte[] bArr = new byte[size - position2];
                this.configDescriptorDeadBytes = bArr;
                byteBuffer.get(bArr);
            }
            if (createFrom instanceof DecoderSpecificInfo) {
                this.decoderSpecificInfo = (DecoderSpecificInfo) createFrom;
            } else if (createFrom instanceof AudioSpecificConfig) {
                this.audioSpecificInfo = (AudioSpecificConfig) createFrom;
            } else if (createFrom instanceof ProfileLevelIndicationDescriptor) {
                this.profileLevelIndicationDescriptors.add((ProfileLevelIndicationDescriptor) createFrom);
            }
        }
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() {
        AudioSpecificConfig audioSpecificConfig = this.audioSpecificInfo;
        int size = (audioSpecificConfig == null ? 0 : audioSpecificConfig.getSize()) + 13;
        DecoderSpecificInfo decoderSpecificInfo = this.decoderSpecificInfo;
        int size2 = size + (decoderSpecificInfo != null ? decoderSpecificInfo.getSize() : 0);
        Iterator<ProfileLevelIndicationDescriptor> it = this.profileLevelIndicationDescriptors.iterator();
        while (it.hasNext()) {
            size2 += it.next().getSize();
        }
        return size2;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer allocate = ByteBuffer.allocate(getSize());
        IsoTypeWriter.writeUInt8(allocate, this.tag);
        writeSize(allocate, getContentSize());
        IsoTypeWriter.writeUInt8(allocate, this.objectTypeIndication);
        IsoTypeWriter.writeUInt8(allocate, (this.streamType << 2) | (this.upStream << 1) | 1);
        IsoTypeWriter.writeUInt24(allocate, this.bufferSizeDB);
        IsoTypeWriter.writeUInt32(allocate, this.maxBitRate);
        IsoTypeWriter.writeUInt32(allocate, this.avgBitRate);
        DecoderSpecificInfo decoderSpecificInfo = this.decoderSpecificInfo;
        if (decoderSpecificInfo != null) {
            allocate.put(decoderSpecificInfo.serialize());
        }
        AudioSpecificConfig audioSpecificConfig = this.audioSpecificInfo;
        if (audioSpecificConfig != null) {
            allocate.put(audioSpecificConfig.serialize());
        }
        Iterator<ProfileLevelIndicationDescriptor> it = this.profileLevelIndicationDescriptors.iterator();
        while (it.hasNext()) {
            allocate.put(it.next().serialize());
        }
        return (ByteBuffer) allocate.rewind();
    }

    public DecoderSpecificInfo getDecoderSpecificInfo() {
        return this.decoderSpecificInfo;
    }

    public void setDecoderSpecificInfo(DecoderSpecificInfo decoderSpecificInfo) {
        this.decoderSpecificInfo = decoderSpecificInfo;
    }

    public AudioSpecificConfig getAudioSpecificInfo() {
        return this.audioSpecificInfo;
    }

    public void setAudioSpecificInfo(AudioSpecificConfig audioSpecificConfig) {
        this.audioSpecificInfo = audioSpecificConfig;
    }

    public List<ProfileLevelIndicationDescriptor> getProfileLevelIndicationDescriptors() {
        return this.profileLevelIndicationDescriptors;
    }

    public int getObjectTypeIndication() {
        return this.objectTypeIndication;
    }

    public void setObjectTypeIndication(int i) {
        this.objectTypeIndication = i;
    }

    public int getStreamType() {
        return this.streamType;
    }

    public void setStreamType(int i) {
        this.streamType = i;
    }

    public int getUpStream() {
        return this.upStream;
    }

    public void setUpStream(int i) {
        this.upStream = i;
    }

    public int getBufferSizeDB() {
        return this.bufferSizeDB;
    }

    public void setBufferSizeDB(int i) {
        this.bufferSizeDB = i;
    }

    public long getMaxBitRate() {
        return this.maxBitRate;
    }

    public void setMaxBitRate(long j) {
        this.maxBitRate = j;
    }

    public long getAvgBitRate() {
        return this.avgBitRate;
    }

    public void setAvgBitRate(long j) {
        this.avgBitRate = j;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        StringBuilder sb = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb.append(this.objectTypeIndication);
        sb.append(", streamType=");
        sb.append(this.streamType);
        sb.append(", upStream=");
        sb.append(this.upStream);
        sb.append(", bufferSizeDB=");
        sb.append(this.bufferSizeDB);
        sb.append(", maxBitRate=");
        sb.append(this.maxBitRate);
        sb.append(", avgBitRate=");
        sb.append(this.avgBitRate);
        sb.append(", decoderSpecificInfo=");
        sb.append(this.decoderSpecificInfo);
        sb.append(", audioSpecificInfo=");
        sb.append(this.audioSpecificInfo);
        sb.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.configDescriptorDeadBytes;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append(Hex.encodeHex(bArr));
        sb.append(", profileLevelIndicationDescriptors=");
        Object obj = this.profileLevelIndicationDescriptors;
        if (obj == null) {
            obj = AbstractJsonLexerKt.NULL;
        }
        sb.append(obj);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
