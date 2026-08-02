package org.mp4parser.boxes.microsoft;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.msgpack.core.MessagePack;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes10.dex */
public class TfrfBox extends AbstractFullBox {
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    public List<Entry> entries;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TfrfBox.java", TfrfBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFragmentCount", "org.mp4parser.boxes.microsoft.TfrfBox", "", "", "", "long"), 91);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.microsoft.TfrfBox", "", "", "", "java.util.List"), 95);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.microsoft.TfrfBox", "", "", "", "java.lang.String"), 100);
    }

    public TfrfBox() {
        super("uuid");
        this.entries = new ArrayList();
    }

    @Override // org.mp4parser.support.AbstractBox
    public byte[] getUserType() {
        return new byte[]{MessagePack.Code.FIXEXT1, Byte.MIN_VALUE, BuiltinOptions.RightShiftOptions, -14, MessagePack.Code.FLOAT32, BuiltinOptions.ArgMinOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, -107, -114, BuiltinOptions.CosOptions, BuiltinOptions.DequantizeOptions, MessagePack.Code.FLOAT64, -98, BuiltinOptions.BidirectionalSequenceRNNOptions, -89, -97};
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return (this.entries.size() * (getVersion() == 1 ? 16 : 8)) + 5;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt8(byteBuffer, this.entries.size());
        for (Entry entry : this.entries) {
            if (getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer, entry.fragmentAbsoluteTime);
                IsoTypeWriter.writeUInt64(byteBuffer, entry.fragmentAbsoluteDuration);
            } else {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.fragmentAbsoluteTime);
                IsoTypeWriter.writeUInt32(byteBuffer, entry.fragmentAbsoluteDuration);
            }
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        for (int i = 0; i < readUInt8; i++) {
            Entry entry = new Entry();
            if (getVersion() == 1) {
                entry.fragmentAbsoluteTime = IsoTypeReader.readUInt64(byteBuffer);
                entry.fragmentAbsoluteDuration = IsoTypeReader.readUInt64(byteBuffer);
            } else {
                entry.fragmentAbsoluteTime = IsoTypeReader.readUInt32(byteBuffer);
                entry.fragmentAbsoluteDuration = IsoTypeReader.readUInt32(byteBuffer);
            }
            this.entries.add(entry);
        }
    }

    public long getFragmentCount() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries.size();
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this));
        return this.entries;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return "TfrfBox{entries=" + this.entries + AbstractJsonLexerKt.END_OBJ;
    }

    public class Entry {
        long fragmentAbsoluteDuration;
        long fragmentAbsoluteTime;

        public Entry() {
        }

        public long getFragmentAbsoluteTime() {
            return this.fragmentAbsoluteTime;
        }

        public long getFragmentAbsoluteDuration() {
            return this.fragmentAbsoluteDuration;
        }

        public String toString() {
            return "Entry{fragmentAbsoluteTime=" + this.fragmentAbsoluteTime + ", fragmentAbsoluteDuration=" + this.fragmentAbsoluteDuration + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
