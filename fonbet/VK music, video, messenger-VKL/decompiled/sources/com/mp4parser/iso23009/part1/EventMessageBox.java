package com.mp4parser.iso23009.part1;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import xsna.crx0;
import xsna.imj0;
import xsna.jq;
import xsna.n0y;
import xsna.o0y;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes14.dex */
public class EventMessageBox extends AbstractFullBox {
    public static final String TYPE = "emsg";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_10 = null;
    private static final /* synthetic */ n0y ajc$tjp_11 = null;
    private static final /* synthetic */ n0y ajc$tjp_12 = null;
    private static final /* synthetic */ n0y ajc$tjp_13 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    private static final /* synthetic */ n0y ajc$tjp_7 = null;
    private static final /* synthetic */ n0y ajc$tjp_8 = null;
    private static final /* synthetic */ n0y ajc$tjp_9 = null;
    long eventDuration;
    long id;
    byte[] messageData;
    long presentationTimeDelta;
    String schemeIdUri;
    long timescale;
    String value;

    static {
        ajc$preClinit();
    }

    public EventMessageBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("EventMessageBox.java", EventMessageBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "schemeIdUri", "", "void"));
        ajc$tjp_10 = whqVar.f(whqVar.e("getId", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"));
        ajc$tjp_11 = whqVar.f(whqVar.e("setId", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "id", "", "void"));
        ajc$tjp_12 = whqVar.f(whqVar.e("getMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "[B"));
        ajc$tjp_13 = whqVar.f(whqVar.e("setMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "[B", "messageData", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getValue", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setValue", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "value", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "timescale", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("getPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"));
        ajc$tjp_7 = whqVar.f(whqVar.e("setPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "presentationTimeDelta", "", "void"));
        ajc$tjp_8 = whqVar.f(whqVar.e("getEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"));
        ajc$tjp_9 = whqVar.f(whqVar.e("setEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "eventDuration", "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.schemeIdUri = crx0.t(byteBuffer);
        this.value = crx0.t(byteBuffer);
        this.timescale = crx0.w(byteBuffer);
        this.presentationTimeDelta = crx0.w(byteBuffer);
        this.eventDuration = crx0.w(byteBuffer);
        this.id = crx0.w(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.messageData = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(imj0.b(this.schemeIdUri));
        byte b = (byte) 0;
        byteBuffer.put(b);
        jq.h(this.value, byteBuffer, b);
        byteBuffer.putInt((int) this.timescale);
        byteBuffer.putInt((int) this.presentationTimeDelta);
        byteBuffer.putInt((int) this.eventDuration);
        byteBuffer.putInt((int) this.id);
        byteBuffer.put(this.messageData);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return imj0.j(this.value) + imj0.j(this.schemeIdUri) + 22 + this.messageData.length;
    }

    public long getEventDuration() {
        o0y c = whq.c(ajc$tjp_8, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.eventDuration;
    }

    public long getId() {
        o0y c = whq.c(ajc$tjp_10, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.id;
    }

    public byte[] getMessageData() {
        o0y c = whq.c(ajc$tjp_12, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.messageData;
    }

    public long getPresentationTimeDelta() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.presentationTimeDelta;
    }

    public String getSchemeIdUri() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.schemeIdUri;
    }

    public long getTimescale() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.timescale;
    }

    public String getValue() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.value;
    }

    public void setEventDuration(long j) {
        o0y d = whq.d(ajc$tjp_9, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.eventDuration = j;
    }

    public void setId(long j) {
        o0y d = whq.d(ajc$tjp_11, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.id = j;
    }

    public void setMessageData(byte[] bArr) {
        o0y d = whq.d(ajc$tjp_13, this, this, bArr);
        w8g0.a();
        w8g0.b(d);
        this.messageData = bArr;
    }

    public void setPresentationTimeDelta(long j) {
        o0y d = whq.d(ajc$tjp_7, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.presentationTimeDelta = j;
    }

    public void setSchemeIdUri(String str) {
        o0y d = whq.d(ajc$tjp_1, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.schemeIdUri = str;
    }

    public void setTimescale(long j) {
        o0y d = whq.d(ajc$tjp_5, this, this, new Long(j));
        w8g0.a();
        w8g0.b(d);
        this.timescale = j;
    }

    public void setValue(String str) {
        o0y d = whq.d(ajc$tjp_3, this, this, str);
        w8g0.a();
        w8g0.b(d);
        this.value = str;
    }
}
