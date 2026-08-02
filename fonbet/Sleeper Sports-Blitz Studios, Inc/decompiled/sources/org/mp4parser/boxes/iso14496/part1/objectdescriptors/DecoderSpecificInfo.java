package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mp4parser.tools.Hex;
import org.mp4parser.tools.IsoTypeWriter;

@Descriptor(tags = {5})
/* loaded from: classes10.dex */
public class DecoderSpecificInfo extends BaseDescriptor {
    byte[] bytes;

    public DecoderSpecificInfo() {
        this.tag = 5;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer) throws IOException {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.bytes = bArr;
        byteBuffer.get(bArr);
    }

    public void setData(byte[] bArr) {
        this.bytes = bArr;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() {
        return this.bytes.length;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer allocate = ByteBuffer.allocate(getSize());
        IsoTypeWriter.writeUInt8(allocate, this.tag);
        writeSize(allocate, getContentSize());
        allocate.put(this.bytes);
        return (ByteBuffer) allocate.rewind();
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        StringBuilder sb = new StringBuilder("DecoderSpecificInfo{bytes=");
        byte[] bArr = this.bytes;
        sb.append(bArr == null ? AbstractJsonLexerKt.NULL : Hex.encodeHex(bArr));
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.bytes, ((DecoderSpecificInfo) obj).bytes);
    }

    public int hashCode() {
        byte[] bArr = this.bytes;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }
}
