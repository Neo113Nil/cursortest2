package com.bytedance.sdk.component.sf.pcc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class hc {
    public vy gm;
    public String oo;
    public byte[] vj;
    public pcc wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum pcc {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public hc(vy vyVar, String str, pcc pccVar) {
        this.gm = vyVar;
        this.oo = str;
        this.wh = pccVar;
    }

    public static hc pcc(vy vyVar, String str) {
        return new hc(vyVar, str, pcc.STRING_TYPE);
    }

    public static hc pcc(vy vyVar, byte[] bArr) {
        return new hc(vyVar, bArr, pcc.BYTE_ARRAY_TYPE);
    }

    public hc() {
    }

    public hc(vy vyVar, byte[] bArr, pcc pccVar) {
        this.gm = vyVar;
        this.vj = bArr;
        this.wh = pccVar;
    }
}
