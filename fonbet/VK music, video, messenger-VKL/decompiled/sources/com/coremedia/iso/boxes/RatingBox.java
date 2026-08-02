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
public class RatingBox extends AbstractFullBox {
    public static final String TYPE = "rtng";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private String language;
    private String ratingCriteria;
    private String ratingEntity;
    private String ratingInfo;

    static {
        ajc$preClinit();
    }

    public RatingBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("RatingBox.java", RatingBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("setRatingEntity", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingEntity", "", "void"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingCriteria", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("setLanguage", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "language", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setRatingInfo", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingInfo", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getLanguage", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"));
        ajc$tjp_5 = whqVar.f(whqVar.e("getRatingEntity", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"));
        ajc$tjp_7 = whqVar.f(whqVar.e("getRatingInfo", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"));
        ajc$tjp_8 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.ratingEntity = crx0.n(byteBuffer);
        this.ratingCriteria = crx0.n(byteBuffer);
        this.language = crx0.r(byteBuffer);
        this.ratingInfo = crx0.t(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(etx.c(this.ratingEntity));
        byteBuffer.put(etx.c(this.ratingCriteria));
        aqw.t(this.language, byteBuffer);
        jq.h(this.ratingInfo, byteBuffer, (byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return imj0.j(this.ratingInfo) + 15;
    }

    public String getLanguage() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.language;
    }

    public String getRatingCriteria() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.ratingCriteria;
    }

    public String getRatingEntity() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.ratingEntity;
    }

    public String getRatingInfo() {
        o0y c = whq.c(ajc$tjp_7, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.ratingInfo;
    }

    public void setLanguage(String str) {
        o0y d = whq.d(ajc$tjp_2, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.language = str;
    }

    public void setRatingCriteria(String str) {
        o0y d = whq.d(ajc$tjp_1, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.ratingCriteria = str;
    }

    public void setRatingEntity(String str) {
        o0y d = whq.d(ajc$tjp_0, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.ratingEntity = str;
    }

    public void setRatingInfo(String str) {
        o0y d = whq.d(ajc$tjp_3, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.ratingInfo = str;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return "RatingBox[language=" + getLanguage() + "ratingEntity=" + getRatingEntity() + ";ratingCriteria=" + getRatingCriteria() + ";language=" + getLanguage() + ";ratingInfo=" + getRatingInfo() + X3.j.e;
    }
}
