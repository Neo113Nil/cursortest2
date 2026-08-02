package org.mp4parser.boxes.webm;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class ContentLightLevelBox extends AbstractFullBox {
    public static final String TYPE = "CoLL";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private int maxCLL;
    private int maxFALL;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ContentLightLevelBox.java", ContentLightLevelBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxCLL", "org.mp4parser.boxes.webm.ContentLightLevelBox", "", "", "", "int"), 38);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMaxCLL", "org.mp4parser.boxes.webm.ContentLightLevelBox", "int", "maxCLL", "", "void"), 42);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxFALL", "org.mp4parser.boxes.webm.ContentLightLevelBox", "", "", "", "int"), 46);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMaxFALL", "org.mp4parser.boxes.webm.ContentLightLevelBox", "int", "maxFALL", "", "void"), 50);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    protected ContentLightLevelBox() {
        super(TYPE);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt16(byteBuffer, this.maxCLL);
        IsoTypeWriter.writeUInt16(byteBuffer, this.maxFALL);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxCLL = IsoTypeReader.readUInt16(byteBuffer);
        this.maxFALL = IsoTypeReader.readUInt16(byteBuffer);
    }

    public int getMaxCLL() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.maxCLL;
    }

    public void setMaxCLL(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.maxCLL = i;
    }

    public int getMaxFALL() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.maxFALL;
    }

    public void setMaxFALL(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.maxFALL = i;
    }
}
