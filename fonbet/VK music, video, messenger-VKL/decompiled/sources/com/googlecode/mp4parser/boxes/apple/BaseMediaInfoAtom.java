package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.vu5;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class BaseMediaInfoAtom extends AbstractFullBox {
    public static final String TYPE = "gmin";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_12 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    short balance;
    short graphicsMode;
    int opColorB;
    int opColorG;
    int opColorR;
    short reserved;

    static {
        ajc$preClinit();
    }

    public BaseMediaInfoAtom() {
        super(TYPE);
        this.graphicsMode = (short) 64;
        this.opColorR = 32768;
        this.opColorG = 32768;
        this.opColorB = 32768;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("BaseMediaInfoAtom.java", BaseMediaInfoAtom.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "graphicsMode", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "reserved", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("toString", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "java.lang.String"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorR", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorG", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorB", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "balance", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.graphicsMode = byteBuffer.getShort();
        this.opColorR = crx0.u(byteBuffer);
        this.opColorG = crx0.u(byteBuffer);
        this.opColorB = crx0.u(byteBuffer);
        this.balance = byteBuffer.getShort();
        this.reserved = byteBuffer.getShort();
    }

    public short getBalance() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.balance;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putShort(this.graphicsMode);
        aqw.u(this.opColorR, byteBuffer);
        aqw.u(this.opColorG, byteBuffer);
        aqw.u(this.opColorB, byteBuffer);
        byteBuffer.putShort(this.balance);
        byteBuffer.putShort(this.reserved);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 16L;
    }

    public short getGraphicsMode() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.graphicsMode;
    }

    public int getOpColorB() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.opColorB;
    }

    public int getOpColorG() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.opColorG;
    }

    public int getOpColorR() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.opColorR;
    }

    public short getReserved() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.reserved;
    }

    public void setBalance(short s) {
        o0y d = whq.d(ajc$tjp_9, this, this, new Short(s));
        w8g0.a();
        w8g0.b(d);
        this.balance = s;
    }

    public void setGraphicsMode(short s) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Short(s));
        w8g0.a();
        w8g0.b(d);
        this.graphicsMode = s;
    }

    public void setOpColorB(int i) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.opColorB = i;
    }

    public void setOpColorG(int i) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.opColorG = i;
    }

    public void setOpColorR(int i) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.opColorR = i;
    }

    public void setReserved(short s) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Short(s));
        w8g0.a();
        w8g0.b(d);
        this.reserved = s;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_12, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("BaseMediaInfoAtom{graphicsMode=");
        sb.append((int) this.graphicsMode);
        sb.append(", opColorR=");
        sb.append(this.opColorR);
        sb.append(", opColorG=");
        sb.append(this.opColorG);
        sb.append(", opColorB=");
        sb.append(this.opColorB);
        sb.append(", balance=");
        sb.append((int) this.balance);
        sb.append(", reserved=");
        return vu5.b(sb, this.reserved, '}');
    }
}
