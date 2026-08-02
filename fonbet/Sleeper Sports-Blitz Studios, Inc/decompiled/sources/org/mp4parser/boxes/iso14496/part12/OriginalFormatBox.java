package org.mp4parser.boxes.iso14496.part12;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;

/* loaded from: classes10.dex */
public class OriginalFormatBox extends AbstractBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "frma";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private String dataFormat;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("OriginalFormatBox.java", OriginalFormatBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDataFormat", "org.mp4parser.boxes.iso14496.part12.OriginalFormatBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDataFormat", "org.mp4parser.boxes.iso14496.part12.OriginalFormatBox", "java.lang.String", "dataFormat", "", "void"), 47);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.iso14496.part12.OriginalFormatBox", "", "", "", "java.lang.String"), 67);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 4L;
    }

    public OriginalFormatBox() {
        super(TYPE);
        this.dataFormat = "    ";
    }

    public String getDataFormat() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.dataFormat;
    }

    public void setDataFormat(String str) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.dataFormat = str;
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.dataFormat = IsoTypeReader.read4cc(byteBuffer);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(IsoFile.fourCCtoBytes(this.dataFormat));
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return "OriginalFormatBox[dataFormat=" + getDataFormat() + "]";
    }
}
