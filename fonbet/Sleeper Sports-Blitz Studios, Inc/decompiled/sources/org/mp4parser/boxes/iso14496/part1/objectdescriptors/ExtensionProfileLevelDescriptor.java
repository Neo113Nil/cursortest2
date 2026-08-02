package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mp4parser.tools.Hex;

@Descriptor(tags = {19})
/* loaded from: classes10.dex */
public class ExtensionProfileLevelDescriptor extends BaseDescriptor {
    byte[] bytes;

    public ExtensionProfileLevelDescriptor() {
        this.tag = 19;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer) throws IOException {
        if (getSize() > 0) {
            byte[] bArr = new byte[getSize()];
            this.bytes = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        throw new RuntimeException("Not Implemented");
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() {
        throw new RuntimeException("Not Implemented");
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        StringBuilder sb = new StringBuilder("ExtensionDescriptor{bytes=");
        byte[] bArr = this.bytes;
        sb.append(bArr == null ? AbstractJsonLexerKt.NULL : Hex.encodeHex(bArr));
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
