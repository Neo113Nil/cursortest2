package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class UnknownBox extends AbstractBox {
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    ByteBuffer data;

    static {
        ajc$preClinit();
    }

    public UnknownBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("UnknownBox.java", UnknownBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getData", "com.coremedia.iso.boxes.UnknownBox", "", "", "", "java.nio.ByteBuffer"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setData", "com.coremedia.iso.boxes.UnknownBox", "java.nio.ByteBuffer", "data", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.UnknownBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        this.data.rewind();
        byteBuffer.put(this.data);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.data.limit();
    }

    public ByteBuffer getData() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.data;
    }

    public void setData(ByteBuffer byteBuffer) {
        o0y d = whq.d(ajc$tjp_1, this, this, byteBuffer);
        w8g0.a();
        w8g0.b(d);
        this.data = byteBuffer;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return getClass().getName() + X3.j.d + getType() + "]@" + Integer.toHexString(hashCode());
    }
}
