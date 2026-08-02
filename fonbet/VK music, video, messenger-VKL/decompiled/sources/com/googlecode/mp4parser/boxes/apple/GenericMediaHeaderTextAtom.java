package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractBox;
import java.nio.ByteBuffer;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class GenericMediaHeaderTextAtom extends AbstractBox {
    public static final String TYPE = "text";
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
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    int unknown_1;
    int unknown_2;
    int unknown_3;
    int unknown_4;
    int unknown_5;
    int unknown_6;
    int unknown_7;
    int unknown_8;
    int unknown_9;

    static {
        ajc$preClinit();
    }

    public GenericMediaHeaderTextAtom() {
        super("text");
        this.unknown_1 = 65536;
        this.unknown_5 = 65536;
        this.unknown_9 = 1073741824;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("GenericMediaHeaderTextAtom.java", GenericMediaHeaderTextAtom.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getUnknown_1", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setUnknown_1", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_1", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getUnknown_6", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setUnknown_6", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_6", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("getUnknown_7", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setUnknown_7", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_7", "", "void"));
        ajc$tjp_14 = whqVar.f(whqVar.e("getUnknown_8", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        ajc$tjp_15 = whqVar.f(whqVar.e("setUnknown_8", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_8", "", "void"));
        ajc$tjp_16 = whqVar.f(whqVar.e("getUnknown_9", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        ajc$tjp_17 = whqVar.f(whqVar.e("setUnknown_9", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_9", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getUnknown_2", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setUnknown_2", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_2", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getUnknown_3", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setUnknown_3", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_3", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getUnknown_4", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setUnknown_4", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_4", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getUnknown_5", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setUnknown_5", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_5", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.unknown_1 = byteBuffer.getInt();
        this.unknown_2 = byteBuffer.getInt();
        this.unknown_3 = byteBuffer.getInt();
        this.unknown_4 = byteBuffer.getInt();
        this.unknown_5 = byteBuffer.getInt();
        this.unknown_6 = byteBuffer.getInt();
        this.unknown_7 = byteBuffer.getInt();
        this.unknown_8 = byteBuffer.getInt();
        this.unknown_9 = byteBuffer.getInt();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.unknown_1);
        byteBuffer.putInt(this.unknown_2);
        byteBuffer.putInt(this.unknown_3);
        byteBuffer.putInt(this.unknown_4);
        byteBuffer.putInt(this.unknown_5);
        byteBuffer.putInt(this.unknown_6);
        byteBuffer.putInt(this.unknown_7);
        byteBuffer.putInt(this.unknown_8);
        byteBuffer.putInt(this.unknown_9);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 36L;
    }

    public int getUnknown_1() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.unknown_1;
    }

    public int getUnknown_2() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.unknown_2;
    }

    public int getUnknown_3() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.unknown_3;
    }

    public int getUnknown_4() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.unknown_4;
    }

    public int getUnknown_5() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.unknown_5;
    }

    public int getUnknown_6() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.unknown_6;
    }

    public int getUnknown_7() {
        o0y c = whq.c(ajc$tjp_12, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.unknown_7;
    }

    public int getUnknown_8() {
        o0y c = whq.c(ajc$tjp_14, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.unknown_8;
    }

    public int getUnknown_9() {
        o0y c = whq.c(ajc$tjp_16, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.unknown_9;
    }

    public void setUnknown_1(int i) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.unknown_1 = i;
    }

    public void setUnknown_2(int i) {
        o0y d = whq.d(ajc$tjp_3, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.unknown_2 = i;
    }

    public void setUnknown_3(int i) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.unknown_3 = i;
    }

    public void setUnknown_4(int i) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.unknown_4 = i;
    }

    public void setUnknown_5(int i) {
        o0y d = whq.d(ajc$tjp_9, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.unknown_5 = i;
    }

    public void setUnknown_6(int i) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.unknown_6 = i;
    }

    public void setUnknown_7(int i) {
        o0y d = whq.d(ajc$tjp_13, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.unknown_7 = i;
    }

    public void setUnknown_8(int i) {
        o0y d = whq.d(ajc$tjp_15, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.unknown_8 = i;
    }

    public void setUnknown_9(int i) {
        o0y d = whq.d(ajc$tjp_17, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.unknown_9 = i;
    }
}
