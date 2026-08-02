package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.crx0;
import xsna.etx;
import xsna.hq;
import xsna.imj0;
import xsna.n0y;
import xsna.o0y;
import xsna.qoy;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes12.dex */
public class HandlerBox extends AbstractFullBox {
    public static final String TYPE = "hdlr";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    public static final Map<String, String> readableTypes;
    private long a;
    private long b;
    private long c;
    private String handlerType;
    private String name;
    private long shouldBeZeroButAppleWritesHereSomeValue;
    private boolean zeroTerm;

    static {
        ajc$preClinit();
        HashMap a = hq.a("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO", "crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        a.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        a.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        a.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        a.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        a.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        a.put("mdir", "Apple Meta Data iTunes Reader");
        a.put("mp7b", "MPEG-7 binary XML");
        a.put("mp7t", "MPEG-7 XML");
        a.put("vide", "Video Track");
        a.put("soun", "Sound Track");
        a.put("hint", "Hint Track");
        a.put("appl", "Apple specific");
        a.put(MetaBox.TYPE, "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        readableTypes = Collections.unmodifiableMap(a);
    }

    public HandlerBox() {
        super(TYPE);
        this.name = null;
        this.zeroTerm = true;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("HandlerBox.java", HandlerBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "", "void"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"));
        ajc$tjp_5 = whqVar.f(whqVar.e("toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.shouldBeZeroButAppleWritesHereSomeValue = crx0.w(byteBuffer);
        this.handlerType = crx0.n(byteBuffer);
        this.a = crx0.w(byteBuffer);
        this.b = crx0.w(byteBuffer);
        this.c = crx0.w(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.zeroTerm = false;
            return;
        }
        String s = crx0.s(byteBuffer.remaining(), byteBuffer);
        this.name = s;
        if (!s.endsWith("\u0000")) {
            this.zeroTerm = false;
        } else {
            this.name = qoy.c(1, 0, this.name);
            this.zeroTerm = true;
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.shouldBeZeroButAppleWritesHereSomeValue);
        byteBuffer.put(etx.c(this.handlerType));
        byteBuffer.putInt((int) this.a);
        byteBuffer.putInt((int) this.b);
        byteBuffer.putInt((int) this.c);
        String str = this.name;
        if (str != null) {
            byteBuffer.put(imj0.b(str));
        }
        if (this.zeroTerm) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.zeroTerm ? imj0.j(this.name) + 25 : imj0.j(this.name) + 24;
    }

    public String getHandlerType() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.handlerType;
    }

    public String getHumanReadableTrackType() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        Map<String, String> map = readableTypes;
        return map.get(this.handlerType) != null ? map.get(this.handlerType) : "Unknown Handler Type";
    }

    public String getName() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.name;
    }

    public void setHandlerType(String str) {
        o0y d = whq.d(ajc$tjp_2, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.handlerType = str;
    }

    public void setName(String str) {
        o0y d = whq.d(ajc$tjp_1, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.name = str;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_5, this, this);
        w8g0.a();
        w8g0.b(c);
        return "HandlerBox[handlerType=" + getHandlerType() + ";name=" + getName() + X3.j.e;
    }
}
