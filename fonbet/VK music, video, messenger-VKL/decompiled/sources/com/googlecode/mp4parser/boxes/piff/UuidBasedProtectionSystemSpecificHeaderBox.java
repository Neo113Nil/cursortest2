package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;
import java.util.UUID;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.crx0;
import xsna.k15;
import xsna.l8e0;
import xsna.n0y;
import xsna.o0y;
import xsna.rjt;
import xsna.up2;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes13.dex */
public class UuidBasedProtectionSystemSpecificHeaderBox extends AbstractFullBox {
    public static byte[] USER_TYPE;
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    private static final /* synthetic */ n0y ajc$tjp_6 = null;
    l8e0 protectionSpecificHeader;
    UUID systemId;

    static {
        ajc$preClinit();
        USER_TYPE = new byte[]{-48, -118, 79, 24, AmfConstants.TYPE_TYPED_OBJECT_MARKER, -13, 74, -126, -74, -56, 50, -40, -85, -95, -125, -45};
    }

    public UuidBasedProtectionSystemSpecificHeaderBox() {
        super("uuid", USER_TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("UuidBasedProtectionSystemSpecificHeaderBox.java", UuidBasedProtectionSystemSpecificHeaderBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.util.UUID"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "java.util.UUID", "systemId", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getSystemIdString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"));
        ajc$tjp_3 = whqVar.f(whqVar.e("getProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getProtectionSpecificHeaderString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader", "protectionSpecificHeader", "", "void"));
        ajc$tjp_6 = whqVar.f(whqVar.e("toString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        l8e0 l8e0Var;
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.systemId = k15.j(bArr);
        up2.p(crx0.w(byteBuffer));
        Class cls = (Class) l8e0.a.get(this.systemId);
        if (cls != null) {
            try {
                l8e0Var = (l8e0) cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            l8e0Var = null;
        }
        if (l8e0Var == null) {
            l8e0Var = new rjt();
        }
        l8e0Var.b(byteBuffer);
        this.protectionSpecificHeader = l8e0Var;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putLong(this.systemId.getMostSignificantBits());
        byteBuffer.putLong(this.systemId.getLeastSignificantBits());
        ByteBuffer a = this.protectionSpecificHeader.a();
        a.rewind();
        byteBuffer.putInt(a.limit());
        byteBuffer.put(a);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.protectionSpecificHeader.a().limit() + 24;
    }

    public l8e0 getProtectionSpecificHeader() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.protectionSpecificHeader;
    }

    public String getProtectionSpecificHeaderString() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.protectionSpecificHeader.toString();
    }

    public UUID getSystemId() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.systemId;
    }

    public String getSystemIdString() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.systemId.toString();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return USER_TYPE;
    }

    public void setProtectionSpecificHeader(l8e0 l8e0Var) {
        o0y d = whq.d(ajc$tjp_5, this, this, l8e0Var);
        w8g0.a();
        w8g0.b(d);
        this.protectionSpecificHeader = l8e0Var;
    }

    public void setSystemId(UUID uuid) {
        o0y d = whq.d(ajc$tjp_1, this, this, uuid);
        w8g0.a();
        w8g0.b(d);
        this.systemId = uuid;
    }

    public String toString() {
        o0y c = whq.c(ajc$tjp_6, this, this);
        w8g0.a();
        w8g0.b(c);
        return "UuidBasedProtectionSystemSpecificHeaderBox{systemId=" + this.systemId.toString() + ", dataSize=" + this.protectionSpecificHeader.a().limit() + '}';
    }
}
