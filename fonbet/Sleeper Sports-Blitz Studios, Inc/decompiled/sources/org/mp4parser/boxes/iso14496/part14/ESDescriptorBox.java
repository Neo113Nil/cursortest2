package org.mp4parser.boxes.iso14496.part14;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor;
import org.mp4parser.support.RequiresParseDetailAspect;

/* loaded from: classes10.dex */
public class ESDescriptorBox extends AbstractDescriptorBox {
    public static final String TYPE = "esds";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ESDescriptorBox.java", ESDescriptorBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEsDescriptor", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "", "", "", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor"), 36);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEsDescriptor", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor", "esDescriptor", "", "void"), 40);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "equals", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "java.lang.Object", "o", "", "boolean"), 45);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hashCode", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "", "", "", "int"), 56);
    }

    public ESDescriptorBox() {
        super(TYPE);
    }

    public ESDescriptor getEsDescriptor() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return (ESDescriptor) super.getDescriptor();
    }

    public void setEsDescriptor(ESDescriptor eSDescriptor) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, eSDescriptor));
        super.setDescriptor(eSDescriptor);
    }

    public boolean equals(Object obj) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ESDescriptorBox eSDescriptorBox = (ESDescriptorBox) obj;
        return this.data == null ? eSDescriptorBox.data == null : this.data.equals(eSDescriptorBox.data);
    }

    public int hashCode() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this));
        if (this.data != null) {
            return this.data.hashCode();
        }
        return 0;
    }

    @Override // org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox, org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        int remaining;
        ESDescriptor esDescriptor = getEsDescriptor();
        if (esDescriptor != null) {
            remaining = esDescriptor.getSize();
        } else {
            remaining = this.data.remaining();
        }
        return remaining + 4;
    }

    @Override // org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox, org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        ESDescriptor esDescriptor = getEsDescriptor();
        if (esDescriptor != null) {
            byteBuffer.put((ByteBuffer) esDescriptor.serialize().rewind());
        } else {
            byteBuffer.put(this.data.duplicate());
        }
    }
}
