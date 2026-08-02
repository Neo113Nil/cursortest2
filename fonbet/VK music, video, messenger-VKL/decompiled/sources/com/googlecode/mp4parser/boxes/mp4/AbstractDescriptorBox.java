package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.AbstractFullBox;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.lp70;
import xsna.n0y;
import xsna.o0y;
import xsna.sc6;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class AbstractDescriptorBox extends AbstractFullBox {
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static Logger log;
    protected ByteBuffer data;
    protected sc6 descriptor;

    static {
        ajc$preClinit();
        log = Logger.getLogger(AbstractDescriptorBox.class.getName());
    }

    public AbstractDescriptorBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("AbstractDescriptorBox.java", AbstractDescriptorBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
        try {
            this.data.rewind();
            this.descriptor = lp70.a(-1, this.data.duplicate());
        } catch (IOException e) {
            log.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e);
        } catch (IndexOutOfBoundsException e2) {
            log.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e2);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        this.data.rewind();
        byteBuffer.put(this.data);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.data.limit() + 4;
    }

    public ByteBuffer getData() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.data;
    }

    public sc6 getDescriptor() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.descriptor;
    }

    public String getDescriptorAsString() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.descriptor.toString();
    }

    public void setData(ByteBuffer byteBuffer) {
        o0y d = whq.d(ajc$tjp_1, this, this, byteBuffer);
        w8g0.a();
        w8g0.b(d);
        this.data = byteBuffer;
    }

    public void setDescriptor(sc6 sc6Var) {
        o0y d = whq.d(ajc$tjp_3, this, this, sc6Var);
        w8g0.a();
        w8g0.b(d);
        this.descriptor = sc6Var;
    }
}
