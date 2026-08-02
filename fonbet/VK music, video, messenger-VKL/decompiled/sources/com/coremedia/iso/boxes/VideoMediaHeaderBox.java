package com.coremedia.iso.boxes;

import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.h5s;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class VideoMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "vmhd";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private int graphicsmode;
    private int[] opcolor;

    static {
        ajc$preClinit();
    }

    public VideoMediaHeaderBox() {
        super(TYPE);
        this.graphicsmode = 0;
        this.opcolor = new int[3];
        setFlags(1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("VideoMediaHeaderBox.java", VideoMediaHeaderBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "int"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "[I"));
        ajc$tjp_2 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "java.lang.String"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.graphicsmode = crx0.u(byteBuffer);
        this.opcolor = new int[3];
        for (int i = 0; i < 3; i++) {
            this.opcolor[i] = crx0.u(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqw.u(this.graphicsmode, byteBuffer);
        for (int i : this.opcolor) {
            aqw.u(i, byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 12L;
    }

    public int getGraphicsmode() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.graphicsmode;
    }

    public int[] getOpcolor() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.opcolor;
    }

    public void setGraphicsmode(int i) {
        o0y d = whq.d(ajc$tjp_4, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.graphicsmode = i;
    }

    public void setOpcolor(int[] iArr) {
        o0y d = whq.d(ajc$tjp_3, this, this, iArr);
        w8g0.a();
        w8g0.b(d);
        this.opcolor = iArr;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("VideoMediaHeaderBox[graphicsmode=");
        sb.append(getGraphicsmode());
        sb.append(";opcolor0=");
        sb.append(getOpcolor()[0]);
        sb.append(";opcolor1=");
        sb.append(getOpcolor()[1]);
        sb.append(";opcolor2=");
        return h5s.c(getOpcolor()[2], X3.j.e, sb);
    }
}
