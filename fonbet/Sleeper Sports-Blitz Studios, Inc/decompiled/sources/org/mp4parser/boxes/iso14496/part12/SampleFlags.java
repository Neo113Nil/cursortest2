package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class SampleFlags {
    private byte isLeading;
    private byte reserved;
    private int sampleDegradationPriority;
    private byte sampleDependsOn;
    private byte sampleHasRedundancy;
    private byte sampleIsDependedOn;
    private boolean sampleIsDifferenceSample;
    private byte samplePaddingValue;

    public SampleFlags() {
    }

    public SampleFlags(ByteBuffer byteBuffer) {
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        this.reserved = (byte) (((-268435456) & readUInt32) >> 28);
        this.isLeading = (byte) ((201326592 & readUInt32) >> 26);
        this.sampleDependsOn = (byte) ((50331648 & readUInt32) >> 24);
        this.sampleIsDependedOn = (byte) ((12582912 & readUInt32) >> 22);
        this.sampleHasRedundancy = (byte) ((3145728 & readUInt32) >> 20);
        this.samplePaddingValue = (byte) ((917504 & readUInt32) >> 17);
        this.sampleIsDifferenceSample = ((65536 & readUInt32) >> 16) > 0;
        this.sampleDegradationPriority = (int) (readUInt32 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    public void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt32(byteBuffer, (this.reserved << 28) | (this.isLeading << 26) | (this.sampleDependsOn << 24) | (this.sampleIsDependedOn << 22) | (this.sampleHasRedundancy << 20) | (this.samplePaddingValue << 17) | ((this.sampleIsDifferenceSample ? 1 : 0) << 16) | this.sampleDegradationPriority);
    }

    public int getReserved() {
        return this.reserved;
    }

    public void setReserved(int i) {
        this.reserved = (byte) i;
    }

    public byte getIsLeading() {
        return this.isLeading;
    }

    public void setIsLeading(byte b) {
        this.isLeading = b;
    }

    public int getSampleDependsOn() {
        return this.sampleDependsOn;
    }

    public void setSampleDependsOn(int i) {
        this.sampleDependsOn = (byte) i;
    }

    public int getSampleIsDependedOn() {
        return this.sampleIsDependedOn;
    }

    public void setSampleIsDependedOn(int i) {
        this.sampleIsDependedOn = (byte) i;
    }

    public int getSampleHasRedundancy() {
        return this.sampleHasRedundancy;
    }

    public void setSampleHasRedundancy(int i) {
        this.sampleHasRedundancy = (byte) i;
    }

    public int getSamplePaddingValue() {
        return this.samplePaddingValue;
    }

    public void setSamplePaddingValue(int i) {
        this.samplePaddingValue = (byte) i;
    }

    public boolean isSampleIsDifferenceSample() {
        return this.sampleIsDifferenceSample;
    }

    public void setSampleIsDifferenceSample(boolean z) {
        this.sampleIsDifferenceSample = z;
    }

    public int getSampleDegradationPriority() {
        return this.sampleDegradationPriority;
    }

    public void setSampleDegradationPriority(int i) {
        this.sampleDegradationPriority = i;
    }

    public String toString() {
        return "SampleFlags{reserved=" + ((int) this.reserved) + ", isLeading=" + ((int) this.isLeading) + ", depOn=" + ((int) this.sampleDependsOn) + ", isDepOn=" + ((int) this.sampleIsDependedOn) + ", hasRedundancy=" + ((int) this.sampleHasRedundancy) + ", padValue=" + ((int) this.samplePaddingValue) + ", isDiffSample=" + this.sampleIsDifferenceSample + ", degradPrio=" + this.sampleDegradationPriority + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SampleFlags sampleFlags = (SampleFlags) obj;
        return this.isLeading == sampleFlags.isLeading && this.reserved == sampleFlags.reserved && this.sampleDegradationPriority == sampleFlags.sampleDegradationPriority && this.sampleDependsOn == sampleFlags.sampleDependsOn && this.sampleHasRedundancy == sampleFlags.sampleHasRedundancy && this.sampleIsDependedOn == sampleFlags.sampleIsDependedOn && this.sampleIsDifferenceSample == sampleFlags.sampleIsDifferenceSample && this.samplePaddingValue == sampleFlags.samplePaddingValue;
    }

    public int hashCode() {
        return (((((((((((((this.reserved * 31) + this.isLeading) * 31) + this.sampleDependsOn) * 31) + this.sampleIsDependedOn) * 31) + this.sampleHasRedundancy) * 31) + this.samplePaddingValue) * 31) + (this.sampleIsDifferenceSample ? 1 : 0)) * 31) + this.sampleDegradationPriority;
    }
}
