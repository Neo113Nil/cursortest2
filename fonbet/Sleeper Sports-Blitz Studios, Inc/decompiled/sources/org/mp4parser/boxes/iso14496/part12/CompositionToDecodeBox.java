package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;

/* loaded from: classes10.dex */
public class CompositionToDecodeBox extends AbstractFullBox {
    public static final String TYPE = "cslg";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    int compositionOffsetToDisplayOffsetShift;
    int displayEndTime;
    int displayStartTime;
    int greatestDisplayOffset;
    int leastDisplayOffset;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("CompositionToDecodeBox.java", CompositionToDecodeBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCompositionOffsetToDisplayOffsetShift", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"), 60);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCompositionOffsetToDisplayOffsetShift", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "compositionOffsetToDisplayOffsetShift", "", "void"), 64);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLeastDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"), 68);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLeastDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "leastDisplayOffset", "", "void"), 72);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getGreatestDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"), 76);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setGreatestDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "greatestDisplayOffset", "", "void"), 80);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDisplayStartTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"), 84);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDisplayStartTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "displayStartTime", "", "void"), 88);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDisplayEndTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"), 92);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDisplayEndTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "displayEndTime", "", "void"), 96);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 24L;
    }

    public CompositionToDecodeBox() {
        super(TYPE);
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.compositionOffsetToDisplayOffsetShift = byteBuffer.getInt();
        this.leastDisplayOffset = byteBuffer.getInt();
        this.greatestDisplayOffset = byteBuffer.getInt();
        this.displayStartTime = byteBuffer.getInt();
        this.displayEndTime = byteBuffer.getInt();
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.compositionOffsetToDisplayOffsetShift);
        byteBuffer.putInt(this.leastDisplayOffset);
        byteBuffer.putInt(this.greatestDisplayOffset);
        byteBuffer.putInt(this.displayStartTime);
        byteBuffer.putInt(this.displayEndTime);
    }

    public int getCompositionOffsetToDisplayOffsetShift() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.compositionOffsetToDisplayOffsetShift;
    }

    public void setCompositionOffsetToDisplayOffsetShift(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.compositionOffsetToDisplayOffsetShift = i;
    }

    public int getLeastDisplayOffset() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.leastDisplayOffset;
    }

    public void setLeastDisplayOffset(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.leastDisplayOffset = i;
    }

    public int getGreatestDisplayOffset() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.greatestDisplayOffset;
    }

    public void setGreatestDisplayOffset(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.greatestDisplayOffset = i;
    }

    public int getDisplayStartTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_6, this, this));
        return this.displayStartTime;
    }

    public void setDisplayStartTime(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.displayStartTime = i;
    }

    public int getDisplayEndTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_8, this, this));
        return this.displayEndTime;
    }

    public void setDisplayEndTime(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.displayEndTime = i;
    }
}
