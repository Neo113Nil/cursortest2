package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.imj0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class KeywordsBox extends AbstractFullBox {
    public static final String TYPE = "kywd";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private String[] keywords;
    private String language;

    static {
        ajc$preClinit();
    }

    public KeywordsBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("KeywordsBox.java", KeywordsBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getLanguage", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getKeywords", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "[Ljava.lang.String;"));
        ajc$tjp_2 = whqVar.f(whqVar.e("setLanguage", "com.coremedia.iso.boxes.KeywordsBox", "java.lang.String", "language", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setKeywords", "com.coremedia.iso.boxes.KeywordsBox", "[Ljava.lang.String;", "keywords", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = crx0.r(byteBuffer);
        int e = crx0.e(byteBuffer.get());
        this.keywords = new String[e];
        for (int i = 0; i < e; i++) {
            byteBuffer.get();
            this.keywords[i] = crx0.t(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqw.t(this.language, byteBuffer);
        byteBuffer.put((byte) (this.keywords.length & 255));
        for (String str : this.keywords) {
            byteBuffer.put((byte) ((imj0.j(str) + 1) & 255));
            byteBuffer.put(imj0.b(str));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long j = 7;
        for (int i = 0; i < this.keywords.length; i++) {
            j += imj0.j(r0[i]) + 2;
        }
        return j;
    }

    public String[] getKeywords() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.keywords;
    }

    public String getLanguage() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.language;
    }

    public void setKeywords(String[] strArr) {
        o0y d = whq.d(ajc$tjp_3, this, this, strArr);
        w8g0.a();
        w8g0.b(d);
        this.keywords = strArr;
    }

    public void setLanguage(String str) {
        o0y d = whq.d(ajc$tjp_2, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.language = str;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuffer stringBuffer = new StringBuffer("KeywordsBox[language=");
        stringBuffer.append(getLanguage());
        for (int i = 0; i < this.keywords.length; i++) {
            stringBuffer.append(";keyword");
            stringBuffer.append(i);
            stringBuffer.append("=");
            stringBuffer.append(this.keywords[i]);
        }
        stringBuffer.append(X3.j.e);
        return stringBuffer.toString();
    }
}
