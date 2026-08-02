package org.mp4parser.boxes.iso14496.part12;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class MovieFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mfhd";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private long sequenceNumber;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("MovieFragmentHeaderBox.java", MovieFragmentHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSequenceNumber", "org.mp4parser.boxes.iso14496.part12.MovieFragmentHeaderBox", "", "", "", "long"), 59);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSequenceNumber", "org.mp4parser.boxes.iso14496.part12.MovieFragmentHeaderBox", "long", "sequenceNumber", "", "void"), 63);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.iso14496.part12.MovieFragmentHeaderBox", "", "", "", "java.lang.String"), 68);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 8L;
    }

    public MovieFragmentHeaderBox() {
        super(TYPE);
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.sequenceNumber);
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.sequenceNumber = IsoTypeReader.readUInt32(byteBuffer);
    }

    public long getSequenceNumber() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.sequenceNumber;
    }

    public void setSequenceNumber(long j) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(j)));
        this.sequenceNumber = j;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return "MovieFragmentHeaderBox{sequenceNumber=" + this.sequenceNumber + AbstractJsonLexerKt.END_OBJ;
    }
}
