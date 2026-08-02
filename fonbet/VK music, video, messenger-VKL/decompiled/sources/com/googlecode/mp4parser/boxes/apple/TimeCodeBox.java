package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.googlecode.mp4parser.AbstractBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.List;
import xsna.aqw;
import xsna.crx0;
import xsna.ga8;
import xsna.n0y;
import xsna.o0y;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;
import xsna.yej;

/* loaded from: classes13.dex */
public class TimeCodeBox extends AbstractBox implements SampleEntry, yej {
    public static final String TYPE = "tmcd";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_12 = null;
    private static final /* synthetic */ n0y ajc$tjp_13 = null;
    private static final /* synthetic */ n0y ajc$tjp_14 = null;
    private static final /* synthetic */ n0y ajc$tjp_15 = null;
    private static final /* synthetic */ n0y ajc$tjp_16 = null;
    private static final /* synthetic */ n0y ajc$tjp_17 = null;
    private static final /* synthetic */ n0y ajc$tjp_18 = null;
    private static final /* synthetic */ n0y ajc$tjp_19 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_20 = null;
    private static final /* synthetic */ n0y ajc$tjp_21 = null;
    private static final /* synthetic */ n0y ajc$tjp_22 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    int dataReferenceIndex;
    long flags;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    byte[] rest;
    int timeScale;

    static {
        ajc$preClinit();
    }

    public TimeCodeBox() {
        super(TYPE);
        this.rest = new byte[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TimeCodeBox.java", TimeCodeBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "dataReferenceIndex", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("setReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved1", "", "void"));
        ajc$tjp_11 = whqVar.f(whqVar.e("getReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"));
        ajc$tjp_12 = whqVar.f(whqVar.e("setReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved2", "", "void"));
        ajc$tjp_13 = whqVar.f(whqVar.e("getFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "long"));
        ajc$tjp_14 = whqVar.f(whqVar.e("setFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "long", "flags", "", "void"));
        ajc$tjp_15 = whqVar.f(whqVar.e("getRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "[B"));
        ajc$tjp_16 = whqVar.f(whqVar.e("setRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "[B", "rest", "", "void"));
        ajc$tjp_17 = whqVar.f(whqVar.e("getBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.util.List"));
        ajc$tjp_18 = whqVar.f(whqVar.e("setBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.util.List", "boxes", "", "void"));
        ajc$tjp_19 = whqVar.f(whqVar.e("getBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.lang.Class", "clazz", "", "java.util.List"));
        ajc$tjp_2 = whqVar.f(whqVar.e("toString", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.lang.String"));
        ajc$tjp_20 = whqVar.f(whqVar.e("getBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.lang.Class:boolean", "clazz:recursive", "", "java.util.List"));
        ajc$tjp_21 = whqVar.f(whqVar.e("getByteBuffer", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "long:long", "start:size", "java.io.IOException", "java.nio.ByteBuffer"));
        ajc$tjp_22 = whqVar.f(whqVar.e("writeContainer", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.nio.channels.WritableByteChannel", "bb", "java.io.IOException", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"));
        ajc$tjp_4 = whqVar.f(whqVar.e("setTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "timeScale", "", "void"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"));
        ajc$tjp_6 = whqVar.f(whqVar.e("setFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "frameDuration", "", "void"));
        ajc$tjp_7 = whqVar.f(whqVar.e("getNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"));
        ajc$tjp_8 = whqVar.f(whqVar.e("setNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "numberOfFrames", "", "void"));
        ajc$tjp_9 = whqVar.f(whqVar.e("getReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        byteBuffer.position(6);
        this.dataReferenceIndex = crx0.u(byteBuffer);
        this.reserved1 = byteBuffer.getInt();
        this.flags = crx0.w(byteBuffer);
        this.timeScale = byteBuffer.getInt();
        this.frameDuration = byteBuffer.getInt();
        this.numberOfFrames = crx0.e(byteBuffer.get());
        this.reserved2 = crx0.v(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.rest = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry, xsna.yej
    public <T extends ga8> List<T> getBoxes(Class<T> cls, boolean z) {
        o0y b = whq.b(ajc$tjp_20, this, this, cls, new Boolean(z));
        w8g0.a();
        w8g0.b(b);
        return Collections.EMPTY_LIST;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry, xsna.yej
    public ByteBuffer getByteBuffer(long j, long j2) throws IOException {
        o0y b = whq.b(ajc$tjp_21, this, this, new Long(j), new Long(j2));
        w8g0.a();
        w8g0.b(b);
        return null;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[6]);
        aqw.u(this.dataReferenceIndex, byteBuffer);
        byteBuffer.putInt(this.reserved1);
        byteBuffer.putInt((int) this.flags);
        byteBuffer.putInt(this.timeScale);
        byteBuffer.putInt(this.frameDuration);
        byteBuffer.put((byte) (this.numberOfFrames & 255));
        aqw.v(this.reserved2, byteBuffer);
        byteBuffer.put(this.rest);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.rest.length + 28;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.dataReferenceIndex;
    }

    public long getFlags() {
        o0y c = whq.c(ajc$tjp_13, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.flags;
    }

    public int getFrameDuration() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.frameDuration;
    }

    public int getNumberOfFrames() {
        o0y c = whq.c(ajc$tjp_7, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.numberOfFrames;
    }

    public int getReserved1() {
        o0y c = whq.c(ajc$tjp_9, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved1;
    }

    public int getReserved2() {
        o0y c = whq.c(ajc$tjp_11, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved2;
    }

    public byte[] getRest() {
        o0y c = whq.c(ajc$tjp_15, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.rest;
    }

    public int getTimeScale() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.timeScale;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setBoxes(List<ga8> list) {
        o0y d = whq.d(ajc$tjp_18, this, this, list);
        w8g0.a();
        w8g0.b(d);
        throw new RuntimeException("Time Code Box doesn't accept any children");
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int i) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.dataReferenceIndex = i;
    }

    public void setFlags(long j) {
        o0y d = whq.d(ajc$tjp_14, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.flags = j;
    }

    public void setFrameDuration(int i) {
        o0y d = whq.d(ajc$tjp_6, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.frameDuration = i;
    }

    public void setNumberOfFrames(int i) {
        o0y d = whq.d(ajc$tjp_8, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.numberOfFrames = i;
    }

    public void setReserved1(int i) {
        o0y d = whq.d(ajc$tjp_10, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        o0y d = whq.d(ajc$tjp_12, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.reserved2 = i;
    }

    public void setRest(byte[] bArr) {
        o0y d = whq.d(ajc$tjp_16, this, this, bArr);
        w8g0.a();
        w8g0.b(d);
        this.rest = bArr;
    }

    public void setTimeScale(int i) {
        o0y d = whq.d(ajc$tjp_4, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.timeScale = i;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("TimeCodeBox{timeScale=");
        sb.append(this.timeScale);
        sb.append(", frameDuration=");
        sb.append(this.frameDuration);
        sb.append(", numberOfFrames=");
        sb.append(this.numberOfFrames);
        sb.append(", reserved1=");
        sb.append(this.reserved1);
        sb.append(", reserved2=");
        sb.append(this.reserved2);
        sb.append(", flags=");
        return vu5.a('}', this.flags, sb);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry, xsna.yej
    public void writeContainer(WritableByteChannel writableByteChannel) throws IOException {
        o0y d = whq.d(ajc$tjp_22, this, this, writableByteChannel);
        w8g0.a();
        w8g0.b(d);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry, xsna.yej
    public List<ga8> getBoxes() {
        o0y c = whq.c(ajc$tjp_17, this, this);
        w8g0.a();
        w8g0.b(c);
        return Collections.EMPTY_LIST;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry, xsna.yej
    public <T extends ga8> List<T> getBoxes(Class<T> cls) {
        o0y d = whq.d(ajc$tjp_19, this, this, cls);
        w8g0.a();
        w8g0.b(d);
        return Collections.EMPTY_LIST;
    }
}
