package org.mp4parser.boxes.iso14496.part12;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;

/* loaded from: classes10.dex */
public class FreeSpaceBox extends AbstractBox {
    public static final String TYPE = "skip";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    byte[] data;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("FreeSpaceBox.java", FreeSpaceBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getData", "org.mp4parser.boxes.iso14496.part12.FreeSpaceBox", "", "", "", "[B"), 42);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setData", "org.mp4parser.boxes.iso14496.part12.FreeSpaceBox", "[B", "data", "", "void"), 46);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.iso14496.part12.FreeSpaceBox", "", "", "", "java.lang.String"), 61);
    }

    public FreeSpaceBox() {
        super("skip");
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.data.length;
    }

    public byte[] getData() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.data;
    }

    public void setData(byte[] bArr) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, bArr));
        this.data = bArr;
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.data = bArr;
        byteBuffer.get(bArr);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(this.data);
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return "FreeSpaceBox[size=" + this.data.length + ";type=" + getType() + "]";
    }
}
