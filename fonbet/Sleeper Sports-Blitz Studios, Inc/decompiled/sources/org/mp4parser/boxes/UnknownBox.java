package org.mp4parser.boxes;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

/* loaded from: classes10.dex */
public class UnknownBox extends AbstractBox {
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    ByteBuffer data;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("UnknownBox.java", UnknownBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getData", "org.mp4parser.boxes.UnknownBox", "", "", "", "java.nio.ByteBuffer"), 53);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setData", "org.mp4parser.boxes.UnknownBox", "java.nio.ByteBuffer", "data", "", "void"), 57);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.UnknownBox", "", "", "", "java.lang.String"), 62);
    }

    public UnknownBox(String str) {
        super(str);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.data.limit();
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        this.data.rewind();
        byteBuffer.put(this.data);
    }

    public ByteBuffer getData() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.data;
    }

    public void setData(ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, byteBuffer));
        this.data = byteBuffer;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return "UnknownBox{type=" + this.type + AbstractJsonLexerKt.END_OBJ;
    }
}
