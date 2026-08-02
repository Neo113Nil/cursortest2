package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.etx;
import xsna.imj0;
import xsna.jq;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class ClassificationBox extends AbstractFullBox {
    public static final String TYPE = "clsf";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private String classificationEntity;
    private String classificationInfo;
    private int classificationTableIndex;
    private String language;

    static {
        ajc$preClinit();
    }

    public ClassificationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("ClassificationBox.java", ClassificationBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getLanguage", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "int"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"));
        ajc$tjp_4 = whqVar.f(whqVar.e("setClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationEntity", "", "void"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "int", "classificationTableIndex", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("setLanguage", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "language", "", "void"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationInfo", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        this.classificationEntity = etx.b(bArr);
        this.classificationTableIndex = crx0.u(byteBuffer);
        this.language = crx0.r(byteBuffer);
        this.classificationInfo = crx0.t(byteBuffer);
    }

    public String getClassificationEntity() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.classificationEntity;
    }

    public String getClassificationInfo() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.classificationInfo;
    }

    public int getClassificationTableIndex() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.classificationTableIndex;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(etx.c(this.classificationEntity));
        aqw.u(this.classificationTableIndex, byteBuffer);
        aqw.t(this.language, byteBuffer);
        jq.h(this.classificationInfo, byteBuffer, (byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return imj0.j(this.classificationInfo) + 9;
    }

    public String getLanguage() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.language;
    }

    public void setClassificationEntity(String str) {
        o0y d = whq.d(ajc$tjp_4, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.classificationEntity = str;
    }

    public void setClassificationInfo(String str) {
        o0y d = whq.d(ajc$tjp_7, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.classificationInfo = str;
    }

    public void setClassificationTableIndex(int i) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.classificationTableIndex = i;
    }

    public void setLanguage(String str) {
        o0y d = whq.d(ajc$tjp_6, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.language = str;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return "ClassificationBox[language=" + getLanguage() + "classificationEntity=" + getClassificationEntity() + ";classificationTableIndex=" + getClassificationTableIndex() + ";language=" + getLanguage() + ";classificationInfo=" + getClassificationInfo() + X3.j.e;
    }
}
