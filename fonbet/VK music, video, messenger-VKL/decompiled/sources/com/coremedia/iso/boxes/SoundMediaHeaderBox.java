package com.coremedia.iso.boxes;

import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class SoundMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "smhd";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private float balance;

    static {
        ajc$preClinit();
    }

    public SoundMediaHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("SoundMediaHeaderBox.java", SoundMediaHeaderBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "float"));
        ajc$tjp_1 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.balance = crx0.q(byteBuffer);
        crx0.u(byteBuffer);
    }

    public float getBalance() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.balance;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqw.s(byteBuffer, this.balance);
        aqw.u(0, byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 8L;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return "SoundMediaHeaderBox[balance=" + getBalance() + X3.j.e;
    }
}
