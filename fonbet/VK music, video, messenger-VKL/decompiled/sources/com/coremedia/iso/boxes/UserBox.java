package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import xsna.h5s;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class UserBox extends AbstractBox {
    public static final String TYPE = "uuid";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    byte[] data;

    static {
        ajc$preClinit();
    }

    public UserBox(byte[] bArr) {
        super("uuid", bArr);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("UserBox.java", UserBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.UserBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("getData", "com.coremedia.iso.boxes.UserBox", "", "", "", "[B"));
        ajc$tjp_2 = whqVar.f(whqVar.e("setData", "com.coremedia.iso.boxes.UserBox", "[B", "data", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.data = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(this.data);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.data.length;
    }

    public byte[] getData() {
        o0y c = whq.c(ajc$tjp_1, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.data;
    }

    public void setData(byte[] bArr) {
        o0y d = whq.d(ajc$tjp_2, this, this, bArr);
        w8g0.a();
        w8g0.b(d);
        this.data = bArr;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        StringBuilder sb = new StringBuilder("UserBox[type=");
        sb.append(getType());
        sb.append(";userType=");
        sb.append(new String(getUserType()));
        sb.append(";contentLength=");
        return h5s.c(this.data.length, X3.j.e, sb);
    }
}
