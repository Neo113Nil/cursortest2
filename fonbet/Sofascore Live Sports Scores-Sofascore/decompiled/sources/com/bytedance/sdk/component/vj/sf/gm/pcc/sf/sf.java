package com.bytedance.sdk.component.vj.sf.gm.pcc.sf;

import com.bytedance.sdk.component.vj.lu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf implements lu {
    private int gm;
    private com.bytedance.sdk.component.vj.sf.gm.pcc.gm<String, byte[]> oo;
    private long pcc = 1048576;
    private int sf;

    public sf(int i, int i2) {
        this.gm = i;
        this.sf = i2;
        this.oo = new com.bytedance.sdk.component.vj.sf.gm.pcc.gm<>(i2);
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public boolean pcc(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.pcc) {
                    return false;
                }
                this.oo.pcc(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public boolean sf(String str) {
        return this.oo.pcc((com.bytedance.sdk.component.vj.sf.gm.pcc.gm<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public byte[] pcc(String str) {
        try {
            return this.oo.pcc((com.bytedance.sdk.component.vj.sf.gm.pcc.gm<String, byte[]>) str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
