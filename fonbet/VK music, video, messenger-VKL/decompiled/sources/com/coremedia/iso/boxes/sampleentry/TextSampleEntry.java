package com.coremedia.iso.boxes.sampleentry;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import xsna.aqw;
import xsna.crx0;
import xsna.pa8;
import xsna.xuk;

/* loaded from: classes12.dex */
public class TextSampleEntry extends AbstractSampleEntry {
    public static final String TYPE1 = "tx3g";
    public static final String TYPE_ENCRYPTED = "enct";
    private int[] backgroundColorRgba;
    private a boxRecord;
    private long displayFlags;
    private int horizontalJustification;
    private b styleRecord;
    private int verticalJustification;

    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.b == aVar.b && this.d == aVar.d && this.a == aVar.a;
        }

        public final int hashCode() {
            return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
        }
    }

    public static class b {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int[] f = {255, 255, 255, 255};

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.d == bVar.d && this.c == bVar.c && this.e == bVar.e && this.a == bVar.a && Arrays.equals(this.f, bVar.f);
        }

        public final int hashCode() {
            int i = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
            int[] iArr = this.f;
            return i + (iArr != null ? Arrays.hashCode(iArr) : 0);
        }
    }

    public TextSampleEntry() {
        super(TYPE1);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new a();
        this.styleRecord = new b();
    }

    public int[] getBackgroundColorRgba() {
        return this.backgroundColorRgba;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(getHeader());
        ByteBuffer allocate = ByteBuffer.allocate(38);
        allocate.position(6);
        aqw.u(this.dataReferenceIndex, allocate);
        allocate.putInt((int) this.displayFlags);
        allocate.put((byte) (this.horizontalJustification & 255));
        allocate.put((byte) (this.verticalJustification & 255));
        allocate.put((byte) (this.backgroundColorRgba[0] & 255));
        allocate.put((byte) (this.backgroundColorRgba[1] & 255));
        allocate.put((byte) (this.backgroundColorRgba[2] & 255));
        allocate.put((byte) (this.backgroundColorRgba[3] & 255));
        a aVar = this.boxRecord;
        aqw.u(aVar.a, allocate);
        aqw.u(aVar.b, allocate);
        aqw.u(aVar.c, allocate);
        aqw.u(aVar.d, allocate);
        b bVar = this.styleRecord;
        aqw.u(bVar.a, allocate);
        aqw.u(bVar.b, allocate);
        aqw.u(bVar.c, allocate);
        allocate.put((byte) (bVar.d & 255));
        allocate.put((byte) (bVar.e & 255));
        allocate.put((byte) (bVar.f[0] & 255));
        allocate.put((byte) (bVar.f[1] & 255));
        allocate.put((byte) (bVar.f[2] & 255));
        allocate.put((byte) (bVar.f[3] & 255));
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        writeContainer(writableByteChannel);
    }

    public a getBoxRecord() {
        return this.boxRecord;
    }

    public int getHorizontalJustification() {
        return this.horizontalJustification;
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public long getSize() {
        long containerSize = getContainerSize() + 38;
        return containerSize + ((this.largeBox || containerSize >= 4294967296L) ? 16 : 8);
    }

    public b getStyleRecord() {
        return this.styleRecord;
    }

    public int getVerticalJustification() {
        return this.verticalJustification;
    }

    public boolean isContinuousKaraoke() {
        return (this.displayFlags & PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) == PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
    }

    public boolean isFillTextRegion() {
        return (this.displayFlags & PlaybackStateCompat.ACTION_SET_REPEAT_MODE) == PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public boolean isScrollDirection() {
        return (this.displayFlags & 384) == 384;
    }

    public boolean isScrollIn() {
        return (this.displayFlags & 32) == 32;
    }

    public boolean isScrollOut() {
        return (this.displayFlags & 64) == 64;
    }

    public boolean isWriteTextVertically() {
        return (this.displayFlags & PlaybackStateCompat.ACTION_PREPARE_FROM_URI) == PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, xsna.ga8, com.coremedia.iso.boxes.FullBox
    public void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(38);
        xukVar.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = crx0.u(allocate);
        this.displayFlags = crx0.w(allocate);
        this.horizontalJustification = crx0.e(allocate.get());
        this.verticalJustification = crx0.e(allocate.get());
        int[] iArr = new int[4];
        this.backgroundColorRgba = iArr;
        iArr[0] = crx0.e(allocate.get());
        this.backgroundColorRgba[1] = crx0.e(allocate.get());
        this.backgroundColorRgba[2] = crx0.e(allocate.get());
        this.backgroundColorRgba[3] = crx0.e(allocate.get());
        a aVar = new a();
        this.boxRecord = aVar;
        aVar.a = crx0.u(allocate);
        aVar.b = crx0.u(allocate);
        aVar.c = crx0.u(allocate);
        aVar.d = crx0.u(allocate);
        b bVar = new b();
        this.styleRecord = bVar;
        bVar.a = crx0.u(allocate);
        bVar.b = crx0.u(allocate);
        bVar.c = crx0.u(allocate);
        bVar.d = crx0.e(allocate.get());
        bVar.e = crx0.e(allocate.get());
        int[] iArr2 = new int[4];
        bVar.f = iArr2;
        iArr2[0] = crx0.e(allocate.get());
        bVar.f[1] = crx0.e(allocate.get());
        bVar.f[2] = crx0.e(allocate.get());
        bVar.f[3] = crx0.e(allocate.get());
        initContainer(xukVar, j - 38, pa8Var);
    }

    public void setBackgroundColorRgba(int[] iArr) {
        this.backgroundColorRgba = iArr;
    }

    public void setBoxRecord(a aVar) {
        this.boxRecord = aVar;
    }

    public void setContinuousKaraoke(boolean z) {
        if (z) {
            this.displayFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        } else {
            this.displayFlags &= -2049;
        }
    }

    public void setFillTextRegion(boolean z) {
        if (z) {
            this.displayFlags |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        } else {
            this.displayFlags &= -262145;
        }
    }

    public void setHorizontalJustification(int i) {
        this.horizontalJustification = i;
    }

    public void setScrollDirection(boolean z) {
        if (z) {
            this.displayFlags |= 384;
        } else {
            this.displayFlags &= -385;
        }
    }

    public void setScrollIn(boolean z) {
        if (z) {
            this.displayFlags |= 32;
        } else {
            this.displayFlags &= -33;
        }
    }

    public void setScrollOut(boolean z) {
        if (z) {
            this.displayFlags |= 64;
        } else {
            this.displayFlags &= -65;
        }
    }

    public void setStyleRecord(b bVar) {
        this.styleRecord = bVar;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVerticalJustification(int i) {
        this.verticalJustification = i;
    }

    public void setWriteTextVertically(boolean z) {
        if (z) {
            this.displayFlags |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        } else {
            this.displayFlags &= -131073;
        }
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return "TextSampleEntry";
    }

    public TextSampleEntry(String str) {
        super(str);
        this.backgroundColorRgba = new int[4];
        this.boxRecord = new a();
        this.styleRecord = new b();
    }
}
