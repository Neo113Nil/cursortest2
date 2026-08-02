package com.googlecode.mp4parser.boxes.dece;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.aqw;
import xsna.crx0;
import xsna.imj0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class ContentInformationBox extends AbstractFullBox {
    public static final String TYPE = "cinf";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_12 = null;
    private static final /* synthetic */ n0y ajc$tjp_13 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    Map<String, String> brandEntries;
    String codecs;
    Map<String, String> idEntries;
    String languages;
    String mimeSubtypeName;
    String profileLevelIdc;
    String protection;

    static {
        ajc$preClinit();
    }

    public ContentInformationBox() {
        super(TYPE);
        this.brandEntries = new LinkedHashMap();
        this.idEntries = new LinkedHashMap();
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("ContentInformationBox.java", ContentInformationBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "mimeSubtypeName", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "brandEntries", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("getIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "idEntries", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "profileLevelIdc", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "codecs", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "protection", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "languages", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.mimeSubtypeName = crx0.t(byteBuffer);
        this.profileLevelIdc = crx0.t(byteBuffer);
        this.codecs = crx0.t(byteBuffer);
        this.protection = crx0.t(byteBuffer);
        this.languages = crx0.t(byteBuffer);
        int e = crx0.e(byteBuffer.get());
        while (true) {
            int i = e - 1;
            if (e <= 0) {
                break;
            }
            this.brandEntries.put(crx0.t(byteBuffer), crx0.t(byteBuffer));
            e = i;
        }
        int e2 = crx0.e(byteBuffer.get());
        while (true) {
            int i2 = e2 - 1;
            if (e2 <= 0) {
                return;
            }
            this.idEntries.put(crx0.t(byteBuffer), crx0.t(byteBuffer));
            e2 = i2;
        }
    }

    public Map<String, String> getBrandEntries() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.brandEntries;
    }

    public String getCodecs() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.codecs;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqw.x(this.mimeSubtypeName, byteBuffer);
        aqw.x(this.profileLevelIdc, byteBuffer);
        aqw.x(this.codecs, byteBuffer);
        aqw.x(this.protection, byteBuffer);
        aqw.x(this.languages, byteBuffer);
        byteBuffer.put((byte) (this.brandEntries.size() & 255));
        for (Map.Entry<String, String> entry : this.brandEntries.entrySet()) {
            aqw.x(entry.getKey(), byteBuffer);
            aqw.x(entry.getValue(), byteBuffer);
        }
        byteBuffer.put((byte) (this.idEntries.size() & 255));
        for (Map.Entry<String, String> entry2 : this.idEntries.entrySet()) {
            aqw.x(entry2.getKey(), byteBuffer);
            aqw.x(entry2.getValue(), byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long j = imj0.j(this.mimeSubtypeName) + 1 + 4 + imj0.j(this.profileLevelIdc) + 1 + imj0.j(this.codecs) + 1 + imj0.j(this.protection) + 1 + imj0.j(this.languages) + 1 + 1;
        for (Map.Entry<String, String> entry : this.brandEntries.entrySet()) {
            j = j + imj0.j(entry.getKey()) + 1 + imj0.j(entry.getValue()) + 1;
        }
        long j2 = j + 1;
        for (Map.Entry<String, String> entry2 : this.idEntries.entrySet()) {
            j2 = j2 + imj0.j(entry2.getKey()) + 1 + imj0.j(entry2.getValue()) + 1;
        }
        return j2;
    }

    public Map<String, String> getIdEntries() {
        o0y c = whq.c(ajc$tjp_12, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.idEntries;
    }

    public String getLanguages() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.languages;
    }

    public String getMimeSubtypeName() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.mimeSubtypeName;
    }

    public String getProfileLevelIdc() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.profileLevelIdc;
    }

    public String getProtection() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.protection;
    }

    public void setBrandEntries(Map<String, String> map) {
        o0y d = whq.d(ajc$tjp_11, this, this, map);
        w8g0.a();
        w8g0.b(d);
        this.brandEntries = map;
    }

    public void setCodecs(String str) {
        o0y d = whq.d(ajc$tjp_5, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.codecs = str;
    }

    public void setIdEntries(Map<String, String> map) {
        o0y d = whq.d(ajc$tjp_13, this, this, map);
        w8g0.a();
        w8g0.b(d);
        this.idEntries = map;
    }

    public void setLanguages(String str) {
        o0y d = whq.d(ajc$tjp_9, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.languages = str;
    }

    public void setMimeSubtypeName(String str) {
        o0y d = whq.d(ajc$tjp_1, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.mimeSubtypeName = str;
    }

    public void setProfileLevelIdc(String str) {
        o0y d = whq.d(ajc$tjp_3, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.profileLevelIdc = str;
    }

    public void setProtection(String str) {
        o0y d = whq.d(ajc$tjp_7, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.protection = str;
    }
}
