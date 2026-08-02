package com.bytedance.sdk.openadsdk.core.jr.gm;

import com.bytedance.sdk.component.utils.qf;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends com.bytedance.sdk.openadsdk.sf.sf {
    public gm(int i, int i2, boolean z) {
        super(i, i2);
        this.pcc = z;
    }

    @Override // com.bytedance.sdk.openadsdk.sf.sf, com.bytedance.sdk.openadsdk.sf.pcc
    public void pcc(List<File> list) {
        int size = list.size();
        if (pcc(0L, size)) {
            return;
        }
        for (File file : list) {
            qf.gm(file);
            size--;
            if (pcc(file, 0L, size)) {
                return;
            }
        }
    }

    public gm(int i, int i2) {
        super(i, i2);
    }
}
