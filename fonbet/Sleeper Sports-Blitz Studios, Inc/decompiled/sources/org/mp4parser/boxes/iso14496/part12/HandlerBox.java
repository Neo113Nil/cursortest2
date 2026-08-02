package org.mp4parser.boxes.iso14496.part12;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

/* loaded from: classes10.dex */
public class HandlerBox extends AbstractFullBox {
    public static final String TYPE = "hdlr";
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    public static final Map<String, String> readableTypes;

    /* renamed from: a, reason: collision with root package name */
    private long f913a;
    private long b;
    private long c;
    private String handlerType;
    private String name;
    private long shouldBeZeroButAppleWritesHereSomeValue;
    private boolean zeroTerm;

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("HandlerBox.java", HandlerBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "handlerType", "", "void"), 82);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 86);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "name", "", "void"), 95);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getHumanReadableTrackType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 99);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", InAppPurchaseConstants.METHOD_TO_STRING, "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    static {
        ajc$preClinit();
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put(ViewHierarchyConstants.HINT_KEY, "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        readableTypes = Collections.unmodifiableMap(hashMap);
    }

    public HandlerBox() {
        super(TYPE);
        this.name = null;
        this.zeroTerm = true;
    }

    public String getHandlerType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.handlerType;
    }

    public void setHandlerType(String str) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.handlerType = str;
    }

    public String getName() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.name;
    }

    public void setName(String str) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.name = str;
    }

    public String getHumanReadableTrackType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        Map<String, String> map = readableTypes;
        return map.get(this.handlerType) != null ? map.get(this.handlerType) : "Unknown Handler Type";
    }

    @Override // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        int utf8StringLengthInBytes;
        if (this.zeroTerm) {
            utf8StringLengthInBytes = Utf8.utf8StringLengthInBytes(this.name) + 25;
        } else {
            utf8StringLengthInBytes = Utf8.utf8StringLengthInBytes(this.name) + 24;
        }
        return utf8StringLengthInBytes;
    }

    @Override // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.shouldBeZeroButAppleWritesHereSomeValue = IsoTypeReader.readUInt32(byteBuffer);
        this.handlerType = IsoTypeReader.read4cc(byteBuffer);
        this.f913a = IsoTypeReader.readUInt32(byteBuffer);
        this.b = IsoTypeReader.readUInt32(byteBuffer);
        this.c = IsoTypeReader.readUInt32(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            String readString = IsoTypeReader.readString(byteBuffer, byteBuffer.remaining());
            this.name = readString;
            if (readString.endsWith("\u0000")) {
                String str = this.name;
                this.name = str.substring(0, str.length() - 1);
                this.zeroTerm = true;
                return;
            }
            this.zeroTerm = false;
            return;
        }
        this.zeroTerm = false;
    }

    @Override // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.shouldBeZeroButAppleWritesHereSomeValue);
        byteBuffer.put(IsoFile.fourCCtoBytes(this.handlerType));
        IsoTypeWriter.writeUInt32(byteBuffer, this.f913a);
        IsoTypeWriter.writeUInt32(byteBuffer, this.b);
        IsoTypeWriter.writeUInt32(byteBuffer, this.c);
        String str = this.name;
        if (str != null) {
            byteBuffer.put(Utf8.convert(str));
        }
        if (this.zeroTerm) {
            byteBuffer.put((byte) 0);
        }
    }

    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this));
        return "HandlerBox[handlerType=" + getHandlerType() + ";name=" + getName() + "]";
    }
}
