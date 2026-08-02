package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes10.dex */
public class UnknownDescriptor extends BaseDescriptor {
    private static Logger LOG = LoggerFactory.getLogger((Class<?>) UnknownDescriptor.class);
    private ByteBuffer data;

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer) throws IOException {
        this.data = byteBuffer.slice();
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        return "UnknownDescriptor{tag=" + this.tag + ", sizeOfInstance=" + this.sizeOfInstance + ", data=" + this.data + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        throw new RuntimeException("sdjlhfl");
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() {
        throw new RuntimeException("sdjlhfl");
    }
}
