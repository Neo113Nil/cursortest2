package org.mp4parser.boxes.iso23001.part7;

import com.facebook.imageutils.JfifUtil;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso23001.part7.CencSampleAuxiliaryDataFormat;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.DoNotParseDetail;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.objectweb.asm.Opcodes;

/* loaded from: classes10.dex */
public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    protected int algorithmId;
    List<CencSampleAuxiliaryDataFormat> entries;
    protected int ivSize;
    protected byte[] kid;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AbstractSampleEncryptionBox.java", AbstractSampleEncryptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getOffsetToFirstIV", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "int"), 29);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 98);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "void"), 102);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "equals", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", "boolean"), Opcodes.INVOKEVIRTUAL);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hashCode", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "int"), 209);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntrySizes", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), JfifUtil.MARKER_EOI);
    }

    protected AbstractSampleEncryptionBox(String str) {
        super(str);
        this.algorithmId = -1;
        this.ivSize = -1;
        this.kid = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.entries = Collections.EMPTY_LIST;
    }

    public int getOffsetToFirstIV() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return (getSize() > 4294967296L ? 16 : 8) + (isOverrideTrackEncryptionBoxParameters() ? this.kid.length + 4 : 0) + 4;
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) > 0) {
            this.algorithmId = IsoTypeReader.readUInt24(byteBuffer);
            this.ivSize = IsoTypeReader.readUInt8(byteBuffer);
            byte[] bArr = new byte[16];
            this.kid = bArr;
            byteBuffer.get(bArr);
        }
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        ByteBuffer duplicate3 = byteBuffer.duplicate();
        List<CencSampleAuxiliaryDataFormat> parseEntries = parseEntries(duplicate, readUInt32, 8);
        this.entries = parseEntries;
        if (parseEntries != null) {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate.remaining());
            return;
        }
        List<CencSampleAuxiliaryDataFormat> parseEntries2 = parseEntries(duplicate2, readUInt32, 16);
        this.entries = parseEntries2;
        if (parseEntries2 != null) {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate2.remaining());
            return;
        }
        List<CencSampleAuxiliaryDataFormat> parseEntries3 = parseEntries(duplicate3, readUInt32, 0);
        this.entries = parseEntries3;
        if (parseEntries3 != null) {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate3.remaining());
            return;
        }
        throw new RuntimeException("Cannot parse SampleEncryptionBox");
    }

    private List<CencSampleAuxiliaryDataFormat> parseEntries(ByteBuffer byteBuffer, long j, int i) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            long j2 = j - 1;
            if (j <= 0) {
                return arrayList;
            }
            try {
                CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat = new CencSampleAuxiliaryDataFormat();
                cencSampleAuxiliaryDataFormat.iv = new byte[i];
                byteBuffer.get(cencSampleAuxiliaryDataFormat.iv);
                if ((getFlags() & 2) > 0) {
                    cencSampleAuxiliaryDataFormat.pairs = new CencSampleAuxiliaryDataFormat.Pair[IsoTypeReader.readUInt16(byteBuffer)];
                    for (int i2 = 0; i2 < cencSampleAuxiliaryDataFormat.pairs.length; i2++) {
                        cencSampleAuxiliaryDataFormat.pairs[i2] = cencSampleAuxiliaryDataFormat.createPair(IsoTypeReader.readUInt16(byteBuffer), IsoTypeReader.readUInt32(byteBuffer));
                    }
                }
                arrayList.add(cencSampleAuxiliaryDataFormat);
                j = j2;
            } catch (BufferUnderflowException unused) {
                return null;
            }
        }
    }

    public List<CencSampleAuxiliaryDataFormat> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this));
        return this.entries;
    }

    public void setEntries(List<CencSampleAuxiliaryDataFormat> list) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this, list));
        this.entries = list;
    }

    @DoNotParseDetail
    public boolean isSubSampleEncryption() {
        return (getFlags() & 2) > 0;
    }

    @DoNotParseDetail
    public void setSubSampleEncryption(boolean z) {
        if (z) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & 16777213);
        }
    }

    @DoNotParseDetail
    protected boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (isOverrideTrackEncryptionBoxParameters()) {
            IsoTypeWriter.writeUInt24(byteBuffer, this.algorithmId);
            IsoTypeWriter.writeUInt8(byteBuffer, this.ivSize);
            byteBuffer.put(this.kid);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, getNonEmptyEntriesNum());
        for (CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat : this.entries) {
            if (cencSampleAuxiliaryDataFormat.getSize() > 0) {
                if (cencSampleAuxiliaryDataFormat.iv.length != 8 && cencSampleAuxiliaryDataFormat.iv.length != 16) {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
                byteBuffer.put(cencSampleAuxiliaryDataFormat.iv);
                if (isSubSampleEncryption()) {
                    IsoTypeWriter.writeUInt16(byteBuffer, cencSampleAuxiliaryDataFormat.pairs.length);
                    for (CencSampleAuxiliaryDataFormat.Pair pair : cencSampleAuxiliaryDataFormat.pairs) {
                        IsoTypeWriter.writeUInt16(byteBuffer, pair.clear());
                        IsoTypeWriter.writeUInt32(byteBuffer, pair.encrypted());
                    }
                }
            }
        }
    }

    private int getNonEmptyEntriesNum() {
        Iterator<CencSampleAuxiliaryDataFormat> it = this.entries.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getSize() > 0) {
                i++;
            }
        }
        return i;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        long length = (isOverrideTrackEncryptionBoxParameters() ? 8 + this.kid.length : 4L) + 4;
        while (this.entries.iterator().hasNext()) {
            length += r0.next().getSize();
        }
        return length;
    }

    @Override // org.mp4parser.support.AbstractBox, org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }

    public boolean equals(Object obj) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractSampleEncryptionBox abstractSampleEncryptionBox = (AbstractSampleEncryptionBox) obj;
        if (this.algorithmId != abstractSampleEncryptionBox.algorithmId || this.ivSize != abstractSampleEncryptionBox.ivSize) {
            return false;
        }
        List<CencSampleAuxiliaryDataFormat> list = this.entries;
        if (list == null ? abstractSampleEncryptionBox.entries == null : list.equals(abstractSampleEncryptionBox.entries)) {
            return Arrays.equals(this.kid, abstractSampleEncryptionBox.kid);
        }
        return false;
    }

    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        int i = ((this.algorithmId * 31) + this.ivSize) * 31;
        byte[] bArr = this.kid;
        int hashCode = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List<CencSampleAuxiliaryDataFormat> list = this.entries;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public List<Short> getEntrySizes() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this));
        ArrayList arrayList = new ArrayList(this.entries.size());
        for (CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat : this.entries) {
            short length = (short) cencSampleAuxiliaryDataFormat.iv.length;
            if (isSubSampleEncryption()) {
                length = (short) (((short) (length + 2)) + (cencSampleAuxiliaryDataFormat.pairs.length * 6));
            }
            arrayList.add(Short.valueOf(length));
        }
        return arrayList;
    }
}
