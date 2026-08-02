package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import androidx.media3.extractor.ts.PsExtractor;
import com.facebook.imageutils.JfifUtil;
import com.google.mlkit.common.MlKitException;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mp4parser.tools.Hex;
import org.mp4parser.tools.IsoTypeWriter;
import org.objectweb.asm.Opcodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Descriptor(tags = {19, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, Opcodes.IF_ICMPGE, Opcodes.IF_ICMPGT, Opcodes.IF_ICMPLE, Opcodes.IF_ACMPEQ, Opcodes.IF_ACMPNE, Opcodes.GOTO, Opcodes.JSR, Opcodes.RET, Opcodes.TABLESWITCH, Opcodes.LOOKUPSWITCH, 172, Opcodes.LRETURN, Opcodes.FRETURN, Opcodes.DRETURN, Opcodes.ARETURN, Opcodes.RETURN, Opcodes.GETSTATIC, Opcodes.PUTSTATIC, 180, Opcodes.PUTFIELD, Opcodes.INVOKEVIRTUAL, Opcodes.INVOKESPECIAL, Opcodes.INVOKESTATIC, Opcodes.INVOKEINTERFACE, Opcodes.INVOKEDYNAMIC, Opcodes.NEW, 188, 189, 190, Opcodes.ATHROW, 192, Opcodes.INSTANCEOF, Opcodes.MONITORENTER, Opcodes.MONITOREXIT, 196, Opcodes.MULTIANEWARRAY, Opcodes.IFNULL, Opcodes.IFNONNULL, 200, 201, 202, 203, 204, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 206, 207, JfifUtil.MARKER_RST0, 209, 210, 211, 212, 213, 214, JfifUtil.MARKER_RST7, JfifUtil.MARKER_SOI, JfifUtil.MARKER_EOI, JfifUtil.MARKER_SOS, 219, 220, 221, 222, 223, 224, JfifUtil.MARKER_APP1, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, PsExtractor.VIDEO_STREAM_MASK, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253})
/* loaded from: classes10.dex */
public class ExtensionDescriptor extends BaseDescriptor {
    private static Logger LOG = LoggerFactory.getLogger(ExtensionDescriptor.class.getName());
    ByteBuffer data;

    static int[] allTags() {
        int[] iArr = new int[148];
        for (int i = 106; i < 254; i++) {
            int i2 = i - 106;
            LOG.trace("pos: {}", Integer.valueOf(i2));
            iArr[i2] = i;
        }
        return iArr;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer) throws IOException {
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + this.data.remaining());
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        return "ExtensionDescriptortag=" + this.tag + ",bytes=" + Hex.encodeHex(this.data.array()) + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer allocate = ByteBuffer.allocate(getSize());
        IsoTypeWriter.writeUInt8(allocate, this.tag);
        writeSize(allocate, getContentSize());
        allocate.put(this.data.duplicate());
        return allocate;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() {
        return this.data.remaining();
    }
}
