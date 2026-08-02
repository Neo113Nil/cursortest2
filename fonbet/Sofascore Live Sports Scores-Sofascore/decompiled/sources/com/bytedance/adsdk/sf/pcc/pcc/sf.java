package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private final List<fum> pcc = new ArrayList();

    public void pcc(Path path) {
        for (int size = this.pcc.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.sf.wh.wh.pcc(path, this.pcc.get(size));
        }
    }

    public void pcc(fum fumVar) {
        this.pcc.add(fumVar);
    }
}
