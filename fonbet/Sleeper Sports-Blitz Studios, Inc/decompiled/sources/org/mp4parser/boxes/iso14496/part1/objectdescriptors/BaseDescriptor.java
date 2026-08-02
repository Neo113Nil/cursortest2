package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mp4parser.tools.IsoTypeReader;

@Descriptor(tags = {0})
/* loaded from: classes10.dex */
public abstract class BaseDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    int sizeBytes;
    int sizeOfInstance;
    int tag;

    abstract int getContentSize();

    public abstract void parseDetail(ByteBuffer byteBuffer) throws IOException;

    public abstract ByteBuffer serialize();

    public int getTag() {
        return this.tag;
    }

    public void writeSize(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        int i2 = 0;
        while (true) {
            if (i <= 0 && i2 >= this.sizeBytes) {
                byteBuffer.position(position + getSizeSize());
                return;
            }
            i2++;
            if (i > 0) {
                byteBuffer.put((getSizeSize() + position) - i2, (byte) (i & 127));
            } else {
                byteBuffer.put((getSizeSize() + position) - i2, Byte.MIN_VALUE);
            }
            i >>>= 7;
        }
    }

    public int getSizeSize() {
        int contentSize = getContentSize();
        int i = 0;
        while (true) {
            if (contentSize <= 0 && i >= this.sizeBytes) {
                return i;
            }
            contentSize >>>= 7;
            i++;
        }
    }

    public int getSize() {
        return getContentSize() + getSizeSize() + 1;
    }

    public final void parse(int i, ByteBuffer byteBuffer) throws IOException {
        this.tag = i;
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.sizeOfInstance = readUInt8 & 127;
        int i2 = 1;
        while ((readUInt8 >>> 7) == 1) {
            readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
            i2++;
            this.sizeOfInstance = (this.sizeOfInstance << 7) | (readUInt8 & 127);
        }
        this.sizeBytes = i2;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.sizeOfInstance);
        parseDetail(slice);
        byteBuffer.position(byteBuffer.position() + this.sizeOfInstance);
    }

    public String toString() {
        return "BaseDescriptor{tag=" + this.tag + ", sizeOfInstance=" + this.sizeOfInstance + AbstractJsonLexerKt.END_OBJ;
    }
}
