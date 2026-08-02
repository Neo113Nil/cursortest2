package org.mp4parser.boxes.iso14496.part14;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.ObjectDescriptorFactory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes10.dex */
public class AbstractDescriptorBox extends AbstractFullBox {
    private static Logger LOG;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    protected ByteBuffer data;
    protected BaseDescriptor descriptor;

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AbstractDescriptorBox.java", AbstractDescriptorBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"), 43);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"), 47);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor"), 63);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 67);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDescriptorAsString", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "java.lang.String"), 71);
    }

    static {
        ajc$preClinit();
        LOG = LoggerFactory.getLogger(AbstractDescriptorBox.class.getName());
    }

    public AbstractDescriptorBox(String str) {
        super(str);
    }

    public ByteBuffer getData() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.data;
    }

    public void setData(ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, byteBuffer));
        this.data = byteBuffer;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        this.data.rewind();
        byteBuffer.put(this.data);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.data.limit() + 4;
    }

    public BaseDescriptor getDescriptor() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.descriptor;
    }

    public void setDescriptor(BaseDescriptor baseDescriptor) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, baseDescriptor));
        this.descriptor = baseDescriptor;
    }

    public String getDescriptorAsString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.descriptor.toString();
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.data = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.data.rewind();
            this.descriptor = ObjectDescriptorFactory.createFrom(-1, this.data.duplicate());
        } catch (IOException e) {
            LOG.warn("Error parsing ObjectDescriptor", (Throwable) e);
        } catch (IndexOutOfBoundsException e2) {
            LOG.warn("Error parsing ObjectDescriptor", (Throwable) e2);
        }
    }
}
