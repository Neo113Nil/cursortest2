package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.etx;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class OriginalFormatBox extends AbstractBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "frma";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private String dataFormat;

    static {
        ajc$preClinit();
    }

    public OriginalFormatBox() {
        super(TYPE);
        this.dataFormat = "    ";
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("OriginalFormatBox.java", OriginalFormatBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "java.lang.String", "dataFormat", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.dataFormat = crx0.n(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(etx.c(this.dataFormat));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 4L;
    }

    public String getDataFormat() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.dataFormat;
    }

    public void setDataFormat(String str) {
        o0y d = whq.d(ajc$tjp_1, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.dataFormat = str;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return "OriginalFormatBox[dataFormat=" + getDataFormat() + X3.j.e;
    }
}
