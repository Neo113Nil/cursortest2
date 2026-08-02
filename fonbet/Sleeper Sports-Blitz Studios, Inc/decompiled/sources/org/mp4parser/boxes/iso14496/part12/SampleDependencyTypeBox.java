package org.mp4parser.boxes.iso14496.part12;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

/* loaded from: classes10.dex */
public class SampleDependencyTypeBox extends AbstractFullBox {
    public static final String TYPE = "sdtp";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private List<Entry> entries;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleDependencyTypeBox.java", SampleDependencyTypeBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "org.mp4parser.boxes.iso14496.part12.SampleDependencyTypeBox", "", "", "", "java.util.List"), 70);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "org.mp4parser.boxes.iso14496.part12.SampleDependencyTypeBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "void"), 74);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.iso14496.part12.SampleDependencyTypeBox", "", "", "", "java.lang.String"), 79);
    }

    public SampleDependencyTypeBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return this.entries.size() + 4;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        Iterator<Entry> it = this.entries.iterator();
        while (it.hasNext()) {
            IsoTypeWriter.writeUInt8(byteBuffer, it.next().value);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.entries.add(new Entry(IsoTypeReader.readUInt8(byteBuffer)));
        }
    }

    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<Entry> list) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return "SampleDependencyTypeBox{entries=" + this.entries + AbstractJsonLexerKt.END_OBJ;
    }

    public static class Entry {
        private int value;

        public Entry(int i) {
            this.value = i;
        }

        public byte getIsLeading() {
            return (byte) ((this.value >> 6) & 3);
        }

        public void setIsLeading(int i) {
            this.value = ((i & 3) << 6) | (this.value & 63);
        }

        public byte getSampleDependsOn() {
            return (byte) ((this.value >> 4) & 3);
        }

        public void setSampleDependsOn(int i) {
            this.value = ((i & 3) << 4) | (this.value & 207);
        }

        public byte getSampleIsDependedOn() {
            return (byte) ((this.value >> 2) & 3);
        }

        public void setSampleIsDependedOn(int i) {
            this.value = ((i & 3) << 2) | (this.value & 243);
        }

        public byte getSampleHasRedundancy() {
            return (byte) (this.value & 3);
        }

        public void setSampleHasRedundancy(int i) {
            this.value = (i & 3) | (this.value & 252);
        }

        public String toString() {
            return "Entry{isLeading=" + ((int) getIsLeading()) + ", sampleDependsOn=" + ((int) getSampleDependsOn()) + ", sampleIsDependentOn=" + ((int) getSampleIsDependedOn()) + ", sampleHasRedundancy=" + ((int) getSampleHasRedundancy()) + AbstractJsonLexerKt.END_OBJ;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.value == ((Entry) obj).value;
        }

        public int hashCode() {
            return this.value;
        }
    }
}
