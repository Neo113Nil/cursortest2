package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.efz;
import xsna.etx;
import xsna.imj0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class SchemeTypeBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "schm";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    String schemeType;
    String schemeUri;
    long schemeVersion;

    static {
        ajc$preClinit();
    }

    public SchemeTypeBox() {
        super(TYPE);
        this.schemeType = "    ";
        this.schemeUri = null;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("SchemeTypeBox.java", SchemeTypeBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "long"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeType", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("setSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "int", "schemeVersion", "", "void"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeUri", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.schemeType = crx0.n(byteBuffer);
        this.schemeVersion = crx0.w(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.schemeUri = crx0.t(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(etx.c(this.schemeType));
        byteBuffer.putInt((int) this.schemeVersion);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(imj0.b(this.schemeUri));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return ((getFlags() & 1) == 1 ? imj0.j(this.schemeUri) + 1 : 0) + 12;
    }

    public String getSchemeType() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.schemeType;
    }

    public String getSchemeUri() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.schemeUri;
    }

    public long getSchemeVersion() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.schemeVersion;
    }

    public void setSchemeType(String str) {
        o0y d = whq.d(ajc$tjp_3, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.schemeType = str;
    }

    public void setSchemeUri(String str) {
        o0y d = whq.d(ajc$tjp_5, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.schemeUri = str;
    }

    public void setSchemeVersion(int i) {
        o0y d = whq.d(ajc$tjp_4, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.schemeVersion = i;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("Schema Type Box[schemeUri=");
        sb.append(this.schemeUri);
        sb.append("; schemeType=");
        sb.append(this.schemeType);
        sb.append("; schemeVersion=");
        return efz.b(this.schemeVersion, "; ]", sb);
    }
}
