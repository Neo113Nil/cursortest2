package com.coremedia.iso.boxes.vodafone;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.imj0;
import xsna.jq;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class CoverUriBox extends AbstractFullBox {
    public static final String TYPE = "cvru";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private String coverUri;

    static {
        ajc$preClinit();
    }

    public CoverUriBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("CoverUriBox.java", CoverUriBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "java.lang.String", "coverUri", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.coverUri = crx0.t(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        jq.h(this.coverUri, byteBuffer, (byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return imj0.j(this.coverUri) + 5;
    }

    public String getCoverUri() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.coverUri;
    }

    public void setCoverUri(String str) {
        o0y d = whq.d(ajc$tjp_1, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.coverUri = str;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return "CoverUriBox[coverUri=" + getCoverUri() + X3.j.e;
    }
}
