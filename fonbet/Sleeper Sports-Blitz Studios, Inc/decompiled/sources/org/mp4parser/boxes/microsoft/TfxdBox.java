package org.mp4parser.boxes.microsoft;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.msgpack.core.MessagePack;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes10.dex */
public class TfxdBox extends AbstractFullBox {
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    public long fragmentAbsoluteDuration;
    public long fragmentAbsoluteTime;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TfxdBox.java", TfxdBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFragmentAbsoluteTime", "org.mp4parser.boxes.microsoft.TfxdBox", "", "", "", "long"), 79);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFragmentAbsoluteDuration", "org.mp4parser.boxes.microsoft.TfxdBox", "", "", "", "long"), 83);
    }

    public TfxdBox() {
        super("uuid");
    }

    @Override // org.mp4parser.support.AbstractBox
    public byte[] getUserType() {
        return new byte[]{BuiltinOptions.HashtableImportOptions, 29, -101, 5, BuiltinOptions.SquareOptions, MessagePack.Code.FIXEXT2, BuiltinOptions.FillOptions, -26, Byte.MIN_VALUE, -30, 20, 29, -81, -9, BuiltinOptions.ReverseSequenceOptions, -78};
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return getVersion() == 1 ? 20 : 12;
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.fragmentAbsoluteTime = IsoTypeReader.readUInt64(byteBuffer);
            this.fragmentAbsoluteDuration = IsoTypeReader.readUInt64(byteBuffer);
        } else {
            this.fragmentAbsoluteTime = IsoTypeReader.readUInt32(byteBuffer);
            this.fragmentAbsoluteDuration = IsoTypeReader.readUInt32(byteBuffer);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, this.fragmentAbsoluteTime);
            IsoTypeWriter.writeUInt64(byteBuffer, this.fragmentAbsoluteDuration);
        } else {
            IsoTypeWriter.writeUInt32(byteBuffer, this.fragmentAbsoluteTime);
            IsoTypeWriter.writeUInt32(byteBuffer, this.fragmentAbsoluteDuration);
        }
    }

    public long getFragmentAbsoluteTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.fragmentAbsoluteTime;
    }

    public long getFragmentAbsoluteDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this));
        return this.fragmentAbsoluteDuration;
    }
}
