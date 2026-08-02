package com.coremedia.iso.boxes.sampleentry;

import com.facebook.soloader.MinElf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import xsna.aqw;
import xsna.crx0;
import xsna.imj0;
import xsna.pa8;
import xsna.up2;
import xsna.xuk;

/* loaded from: classes12.dex */
public final class VisualSampleEntry extends AbstractSampleEntry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "avc3";
    public static final String TYPE5 = "drmi";
    public static final String TYPE6 = "hvc1";
    public static final String TYPE7 = "hev1";
    public static final String TYPE_ENCRYPTED = "encv";
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long[] predefined;
    private double vertresolution;
    private int width;

    public class a implements xuk {
        public final /* synthetic */ long b;
        public final /* synthetic */ xuk c;

        public a(long j, xuk xukVar) {
            this.b = j;
            this.c = xukVar;
        }

        @Override // xsna.xuk
        public final ByteBuffer K0(long j, long j2) throws IOException {
            return this.c.K0(j, j2);
        }

        @Override // xsna.xuk
        public final long b1(long j, long j2, WritableByteChannel writableByteChannel) throws IOException {
            return this.c.b1(j, j2, writableByteChannel);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.c.close();
        }

        @Override // xsna.xuk
        public final long position() throws IOException {
            return this.c.position();
        }

        @Override // xsna.xuk
        public final int read(ByteBuffer byteBuffer) throws IOException {
            xuk xukVar = this.c;
            long position = xukVar.position();
            long j = this.b;
            if (j == position) {
                return -1;
            }
            if (byteBuffer.remaining() <= j - xukVar.position()) {
                return xukVar.read(byteBuffer);
            }
            ByteBuffer allocate = ByteBuffer.allocate(up2.p(j - xukVar.position()));
            xukVar.read(allocate);
            byteBuffer.put((ByteBuffer) allocate.rewind());
            return allocate.capacity();
        }

        @Override // xsna.xuk
        public final long size() throws IOException {
            return this.b;
        }

        @Override // xsna.xuk
        public final void position(long j) throws IOException {
            this.c.position(j);
        }
    }

    public VisualSampleEntry() {
        super(TYPE3);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        aqw.u(this.dataReferenceIndex, allocate);
        aqw.u(0, allocate);
        aqw.u(0, allocate);
        allocate.putInt((int) this.predefined[0]);
        allocate.putInt((int) this.predefined[1]);
        allocate.putInt((int) this.predefined[2]);
        aqw.u(getWidth(), allocate);
        aqw.u(getHeight(), allocate);
        aqw.r(allocate, getHorizresolution());
        aqw.r(allocate, getVertresolution());
        allocate.putInt((int) 0);
        aqw.u(getFrameCount(), allocate);
        allocate.put((byte) (imj0.j(getCompressorname()) & 255));
        allocate.put(imj0.b(getCompressorname()));
        int j = imj0.j(getCompressorname());
        while (j < 31) {
            j++;
            allocate.put((byte) 0);
        }
        aqw.u(getDepth(), allocate);
        aqw.u(MinElf.PN_XNUM, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public String getCompressorname() {
        return this.compressorname;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public int getHeight() {
        return this.height;
    }

    public double getHorizresolution() {
        return this.horizresolution;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize();
        return 78 + containerSize + ((this.largeBox || containerSize + 86 >= 4294967296L) ? 16 : 8);
    }

    public double getVertresolution() {
        return this.vertresolution;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
        long position = xukVar.position() + j;
        ByteBuffer allocate = ByteBuffer.allocate(78);
        xukVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = crx0.u(allocate);
        crx0.u(allocate);
        crx0.u(allocate);
        this.predefined[0] = crx0.w(allocate);
        this.predefined[1] = crx0.w(allocate);
        this.predefined[2] = crx0.w(allocate);
        this.width = crx0.u(allocate);
        this.height = crx0.u(allocate);
        this.horizresolution = crx0.p(allocate);
        this.vertresolution = crx0.p(allocate);
        crx0.w(allocate);
        this.frameCount = crx0.u(allocate);
        int e = crx0.e(allocate.get());
        if (e > 31) {
            e = 31;
        }
        byte[] bArr = new byte[e];
        allocate.get(bArr);
        this.compressorname = imj0.a(bArr);
        if (e < 31) {
            allocate.get(new byte[31 - e]);
        }
        this.depth = crx0.u(allocate);
        crx0.u(allocate);
        initContainer(new a(position, xukVar), j - 78, pa8Var);
    }

    public void setCompressorname(String str) {
        this.compressorname = str;
    }

    public void setDepth(int i) {
        this.depth = i;
    }

    public void setFrameCount(int i) {
        this.frameCount = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setHorizresolution(double d) {
        this.horizresolution = d;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVertresolution(double d) {
        this.vertresolution = d;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public VisualSampleEntry(String str) {
        super(str);
        this.horizresolution = 72.0d;
        this.vertresolution = 72.0d;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }
}
