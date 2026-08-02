package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.aqw;
import xsna.crx0;
import xsna.kpa;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    protected int algorithmId;
    List<kpa> entries;
    protected int ivSize;
    protected byte[] kid;

    static {
        ajc$preClinit();
    }

    public AbstractSampleEncryptionBox(String str) {
        super(str);
        this.algorithmId = -1;
        this.ivSize = -1;
        this.kid = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("AbstractSampleEncryptionBox.java", AbstractSampleEncryptionBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getOffsetToFirstIV", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"));
        ajc$tjp_2 = whqVar.f(whqVar.e("setEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("equals", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", "boolean"));
        ajc$tjp_4 = whqVar.f(whqVar.e("hashCode", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getEntrySizes", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"));
    }

    private int getNonEmptyEntriesNum() {
        Iterator<kpa> it = this.entries.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().b() > 0) {
                i++;
            }
        }
        return i;
    }

    private List<kpa> parseEntries(ByteBuffer byteBuffer, long j, int i) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            long j2 = j - 1;
            if (j <= 0) {
                return arrayList;
            }
            try {
                kpa kpaVar = new kpa();
                byte[] bArr = new byte[i];
                kpaVar.a = bArr;
                byteBuffer.get(bArr);
                if ((getFlags() & 2) > 0) {
                    kpaVar.b = new kpa.j[crx0.u(byteBuffer)];
                    int i2 = 0;
                    while (true) {
                        kpa.j[] jVarArr = kpaVar.b;
                        if (i2 >= jVarArr.length) {
                            break;
                        }
                        jVarArr[i2] = kpa.a(crx0.u(byteBuffer), crx0.w(byteBuffer));
                        i2++;
                    }
                }
                arrayList.add(kpaVar);
                j = j2;
            } catch (BufferUnderflowException unused) {
                return null;
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) > 0) {
            this.algorithmId = crx0.v(byteBuffer);
            this.ivSize = crx0.e(byteBuffer.get());
            byte[] bArr = new byte[16];
            this.kid = bArr;
            byteBuffer.get(bArr);
        }
        long w = crx0.w(byteBuffer);
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        List<kpa> parseEntries = parseEntries(duplicate, w, 8);
        this.entries = parseEntries;
        if (parseEntries == null) {
            this.entries = parseEntries(duplicate2, w, 16);
            byteBuffer.position((byteBuffer.remaining() + byteBuffer.position()) - duplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.remaining() + byteBuffer.position()) - duplicate.remaining());
        }
        if (this.entries == null) {
            throw new RuntimeException("Cannot parse SampleEncryptionBox");
        }
    }

    public boolean equals(Object obj) {
        o0y d = whq.d(ajc$tjp_3, this, this, obj);
        w8g0.a();
        w8g0.b(d);
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
        List<kpa> list = this.entries;
        if (list != null) {
            if (!list.equals(abstractSampleEncryptionBox.entries)) {
                return false;
            }
        } else if (abstractSampleEncryptionBox.entries != null) {
            return false;
        }
        return Arrays.equals(this.kid, abstractSampleEncryptionBox.kid);
    }

    @Override // com.googlecode.mp4parser.AbstractBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (isOverrideTrackEncryptionBoxParameters()) {
            aqw.v(this.algorithmId, byteBuffer);
            byteBuffer.put((byte) (this.ivSize & 255));
            byteBuffer.put(this.kid);
        }
        byteBuffer.putInt(getNonEmptyEntriesNum());
        for (kpa kpaVar : this.entries) {
            if (kpaVar.b() > 0) {
                byte[] bArr = kpaVar.a;
                if (bArr.length != 8 && bArr.length != 16) {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
                byteBuffer.put(bArr);
                if (isSubSampleEncryption()) {
                    aqw.u(kpaVar.b.length, byteBuffer);
                    for (kpa.j jVar : kpaVar.b) {
                        aqw.u(jVar.clear(), byteBuffer);
                        byteBuffer.putInt((int) jVar.a());
                    }
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long length = (isOverrideTrackEncryptionBoxParameters() ? 8 + this.kid.length : 4L) + 4;
        while (this.entries.iterator().hasNext()) {
            length += r0.next().b();
        }
        return length;
    }

    public List<kpa> getEntries() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.entries;
    }

    public List<Short> getEntrySizes() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        ArrayList arrayList = new ArrayList(this.entries.size());
        for (kpa kpaVar : this.entries) {
            short length = (short) kpaVar.a.length;
            if (isSubSampleEncryption()) {
                length = (short) ((kpaVar.b.length * 6) + ((short) (length + 2)));
            }
            arrayList.add(Short.valueOf(length));
        }
        return arrayList;
    }

    public int getOffsetToFirstIV() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return (getSize() > 4294967296L ? 16 : 8) + (isOverrideTrackEncryptionBoxParameters() ? this.kid.length + 4 : 0) + 4;
    }

    public int hashCode() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        int i = ((this.algorithmId * 31) + this.ivSize) * 31;
        byte[] bArr = this.kid;
        int hashCode = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List<kpa> list = this.entries;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    public boolean isSubSampleEncryption() {
        return (getFlags() & 2) > 0;
    }

    public void setEntries(List<kpa> list) {
        o0y d = whq.d(ajc$tjp_2, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.entries = list;
    }

    public void setSubSampleEncryption(boolean z) {
        if (z) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & 16777213);
        }
    }
}
