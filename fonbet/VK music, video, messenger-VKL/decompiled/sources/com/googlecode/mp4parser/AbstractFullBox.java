package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.FullBox;
import java.nio.ByteBuffer;
import xsna.aqw;
import xsna.crx0;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public abstract class AbstractFullBox extends AbstractBox implements FullBox {
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private int flags;
    private int version;

    static {
        ajc$preClinit();
    }

    public AbstractFullBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("AbstractFullBox.java", AbstractFullBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "", "void"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "", "void"));
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.flags;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
        if (!this.isParsed) {
            parseDetails();
        }
        return this.version;
    }

    public final long parseVersionAndFlags(ByteBuffer byteBuffer) {
        this.version = crx0.y(byteBuffer);
        this.flags = crx0.v(byteBuffer);
        return 4L;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int i) {
        o0y d = whq.d(ajc$tjp_1, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.flags = i;
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int i) {
        o0y d = whq.d(ajc$tjp_0, this, this, new Integer(i));
        w8g0.a();
        w8g0.b(d);
        this.version = i;
    }

    public final void writeVersionAndFlags(ByteBuffer byteBuffer) {
        aqw.w(this.version, byteBuffer);
        aqw.v(this.flags, byteBuffer);
    }

    public AbstractFullBox(String str, byte[] bArr) {
        super(str, bArr);
    }
}
