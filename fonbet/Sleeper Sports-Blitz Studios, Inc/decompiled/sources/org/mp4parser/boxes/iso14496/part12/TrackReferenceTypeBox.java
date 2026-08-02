package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Mp4Arrays;

/* loaded from: classes10.dex */
public class TrackReferenceTypeBox extends AbstractBox {
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    long[] trackIds;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TrackReferenceTypeBox.java", TrackReferenceTypeBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTrackIds", "org.mp4parser.boxes.iso14496.part12.TrackReferenceTypeBox", "", "", "", "[J"), 58);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTrackIds", "org.mp4parser.boxes.iso14496.part12.TrackReferenceTypeBox", "[J", "trackIds", "", "void"), 62);
    }

    public TrackReferenceTypeBox(String str) {
        super(str);
        this.trackIds = new long[0];
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.trackIds.length * 4;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        for (long j : this.trackIds) {
            IsoTypeWriter.writeUInt32(byteBuffer, j);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        while (byteBuffer.remaining() >= 4) {
            this.trackIds = Mp4Arrays.copyOfAndAppend(this.trackIds, IsoTypeReader.readUInt32(byteBuffer));
        }
    }

    public long[] getTrackIds() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.trackIds;
    }

    public void setTrackIds(long[] jArr) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, jArr));
        this.trackIds = jArr;
    }
}
