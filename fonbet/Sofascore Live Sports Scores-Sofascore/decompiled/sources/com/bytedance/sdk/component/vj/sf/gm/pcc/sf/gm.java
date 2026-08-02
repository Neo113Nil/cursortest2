package com.bytedance.sdk.component.vj.sf.gm.pcc.sf;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.vj.nac;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements nac {
    private final nac pcc;
    private final com.bytedance.sdk.component.vj.sf.gm.pcc.pcc sf;

    public gm(nac nacVar, com.bytedance.sdk.component.vj.sf.gm.pcc.pcc pccVar) {
        this.pcc = nacVar;
        this.sf = pccVar;
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public boolean sf(String str) {
        return this.pcc.sf(str);
    }

    public gm(nac nacVar) {
        this(nacVar, null);
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public boolean pcc(String str, Bitmap bitmap) {
        return this.pcc.pcc(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.vj.pcc
    public Bitmap pcc(String str) {
        return this.pcc.pcc(str);
    }
}
