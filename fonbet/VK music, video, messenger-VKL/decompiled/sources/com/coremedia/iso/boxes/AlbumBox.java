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
public class AlbumBox extends AbstractFullBox {
    public static final String TYPE = "albm";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private String albumTitle;
    private String language;
    private int trackNumber;

    static {
        ajc$preClinit();
    }

    public AlbumBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("AlbumBox.java", AlbumBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getLanguage", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "int"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setLanguage", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "language", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("setAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "albumTitle", "", "void"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "int", "trackNumber", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = crx0.r(byteBuffer);
        this.albumTitle = crx0.t(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            this.trackNumber = crx0.e(byteBuffer.get());
        } else {
            this.trackNumber = -1;
        }
    }

    public String getAlbumTitle() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.albumTitle;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqw.t(this.language, byteBuffer);
        jq.h(this.albumTitle, byteBuffer, (byte) 0);
        int i = this.trackNumber;
        if (i != -1) {
            byteBuffer.put((byte) (i & 255));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return imj0.j(this.albumTitle) + 7 + (this.trackNumber == -1 ? 0 : 1);
    }

    public String getLanguage() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.language;
    }

    public int getTrackNumber() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.trackNumber;
    }

    public void setAlbumTitle(String str) {
        o0y d = whq.d(ajc$tjp_4, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.albumTitle = str;
    }

    public void setLanguage(String str) {
        o0y d = whq.d(ajc$tjp_3, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.language = str;
    }

    public void setTrackNumber(int i) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.trackNumber = i;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("AlbumBox[language=");
        sb.append(getLanguage());
        sb.append(";albumTitle=");
        sb.append(getAlbumTitle());
        if (this.trackNumber >= 0) {
            sb.append(";trackNumber=");
            sb.append(getTrackNumber());
        }
        sb.append(X3.j.e);
        return sb.toString();
    }
}
