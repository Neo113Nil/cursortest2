package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.imj0;
import xsna.jq;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class TitleBox extends AbstractFullBox {
    public static final String TYPE = "titl";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private String language;
    private String title;

    static {
        ajc$preClinit();
    }

    public TitleBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("TitleBox.java", TitleBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getLanguage", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getTitle", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"));
        ajc$tjp_2 = whqVar.f(whqVar.e("setLanguage", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "language", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setTitle", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "title", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = crx0.r(byteBuffer);
        this.title = crx0.t(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqw.t(this.language, byteBuffer);
        jq.h(this.title, byteBuffer, (byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return imj0.j(this.title) + 7;
    }

    public String getLanguage() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.language;
    }

    public String getTitle() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.title;
    }

    public void setLanguage(String str) {
        o0y d = whq.d(ajc$tjp_2, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.language = str;
    }

    public void setTitle(String str) {
        o0y d = whq.d(ajc$tjp_3, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.title = str;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return "TitleBox[language=" + getLanguage() + ";title=" + getTitle() + X3.j.e;
    }
}
