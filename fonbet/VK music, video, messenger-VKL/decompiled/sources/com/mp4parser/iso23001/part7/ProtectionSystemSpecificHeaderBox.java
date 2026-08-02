package com.mp4parser.iso23001.part7;

import com.googlecode.mp4parser.AbstractFullBox;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import xsna.crx0;
import xsna.k15;
import xsna.n0y;
import xsna.o0y;
import xsna.up2;
import xsna.w8g0;
import xsna.whq;

/* loaded from: classes14.dex */
public class ProtectionSystemSpecificHeaderBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static byte[] OMA2_SYSTEM_ID = null;
    public static byte[] PLAYREADY_SYSTEM_ID = null;
    public static final String TYPE = "pssh";
    public static byte[] WIDEVINE;
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;
    private static final /* synthetic */ n0y ajc$tjp_4 = null;
    private static final /* synthetic */ n0y ajc$tjp_5 = null;
    byte[] content;
    List<UUID> keyIds;
    byte[] systemId;

    static {
        ajc$preClinit();
        OMA2_SYSTEM_ID = k15.k(UUID.fromString("A2B55680-6F43-11E0-9A3F-0002A5D5C51B"));
        WIDEVINE = k15.k(UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"));
        PLAYREADY_SYSTEM_ID = k15.k(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"));
    }

    public ProtectionSystemSpecificHeaderBox(byte[] bArr, byte[] bArr2) {
        super(TYPE);
        this.keyIds = new ArrayList();
        this.content = bArr2;
        this.systemId = bArr;
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("ProtectionSystemSpecificHeaderBox.java", ProtectionSystemSpecificHeaderBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getKeyIds", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "java.util.List"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setKeyIds", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "java.util.List", "keyIds", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("getSystemId", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"));
        ajc$tjp_3 = whqVar.f(whqVar.e("setSystemId", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "systemId", "", "void"));
        ajc$tjp_4 = whqVar.f(whqVar.e("getContent", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"));
        ajc$tjp_5 = whqVar.f(whqVar.e("setContent", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "", "void"));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[16];
        this.systemId = bArr;
        byteBuffer.get(bArr);
        if (getVersion() > 0) {
            int p = up2.p(crx0.w(byteBuffer));
            while (true) {
                int i = p - 1;
                if (p <= 0) {
                    break;
                }
                byte[] bArr2 = new byte[16];
                byteBuffer.get(bArr2);
                this.keyIds.add(k15.j(bArr2));
                p = i;
            }
        }
        crx0.w(byteBuffer);
        byte[] bArr3 = new byte[byteBuffer.remaining()];
        this.content = bArr3;
        byteBuffer.get(bArr3);
    }

    public byte[] getContent() {
        o0y c = whq.c(ajc$tjp_4, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.content;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long length = this.content.length + 24;
        return getVersion() > 0 ? length + 4 + (this.keyIds.size() * 16) : length;
    }

    public List<UUID> getKeyIds() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.keyIds;
    }

    public byte[] getSystemId() {
        o0y c = whq.c(ajc$tjp_2, this, this);
        w8g0.a();
        w8g0.b(c);
        return this.systemId;
    }

    public void setContent(byte[] bArr) {
        o0y d = whq.d(ajc$tjp_5, this, this, bArr);
        w8g0.a();
        w8g0.b(d);
        this.content = bArr;
    }

    public void setKeyIds(List<UUID> list) {
        o0y d = whq.d(ajc$tjp_1, this, this, list);
        w8g0.a();
        w8g0.b(d);
        this.keyIds = list;
    }

    public void setSystemId(byte[] bArr) {
        o0y d = whq.d(ajc$tjp_3, this, this, bArr);
        w8g0.a();
        w8g0.b(d);
        this.systemId = bArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.systemId, 0, 16);
        if (getVersion() > 0) {
            byteBuffer.putInt(this.keyIds.size());
            Iterator<UUID> it = this.keyIds.iterator();
            while (it.hasNext()) {
                byteBuffer.put(k15.k(it.next()));
            }
        }
        byteBuffer.putInt(this.content.length);
        byteBuffer.put(this.content);
    }

    public ProtectionSystemSpecificHeaderBox() {
        super(TYPE);
        this.keyIds = new ArrayList();
    }
}
