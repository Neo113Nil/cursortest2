package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.DoNotParseDetail;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.Utf8;

/* loaded from: classes10.dex */
public abstract class Utf8AppleDataBox extends AppleDataBox {
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    String value;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("Utf8AppleDataBox.java", Utf8AppleDataBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getValue", "org.mp4parser.boxes.apple.Utf8AppleDataBox", "", "", "", "java.lang.String"), 20);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setValue", "org.mp4parser.boxes.apple.Utf8AppleDataBox", "java.lang.String", "value", "", "void"), 28);
    }

    protected Utf8AppleDataBox(String str) {
        super(str, 1);
    }

    public String getValue() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        return this.value;
    }

    public void setValue(String str) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.value = str;
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    @DoNotParseDetail
    public byte[] writeData() {
        return Utf8.convert(this.value);
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return this.value.getBytes(Charset.forName("UTF-8")).length;
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer) {
        this.value = IsoTypeReader.readString(byteBuffer, byteBuffer.remaining());
    }
}
