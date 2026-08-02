package com.bytedance.sdk.openadsdk.sf;

import defpackage.a70;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends pcc {
    private int gm;
    private volatile boolean oo;
    private int sf;

    public sf(int i, int i2, boolean z) {
        this.sf = 15;
        this.gm = 3;
        if (i <= 0) {
            a70.p("Max count must be positive number!");
            throw null;
        }
        this.sf = i;
        this.gm = i2;
        this.oo = z;
    }

    private void gm(List<File> list) {
        long sf = sf(list);
        int size = list.size();
        if (pcc(sf, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                sf -= length;
            }
            if (pcc(file, sf, size)) {
                return;
            }
        }
    }

    private void oo(List<File> list) {
        long sf;
        int size;
        boolean pcc;
        if (list != null) {
            try {
                if (list.size() != 0 && !(pcc = pcc((sf = sf(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !pcc) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                sf -= length;
                            }
                            if (pcc(file2, sf, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sf.pcc
    public void pcc(List<File> list) {
        if (!this.oo) {
            gm(list);
        } else {
            oo(list);
            this.oo = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sf.pcc
    public boolean pcc(File file, long j, int i) {
        return i <= this.gm;
    }

    @Override // com.bytedance.sdk.openadsdk.sf.pcc
    public boolean pcc(long j, int i) {
        return i <= this.sf;
    }

    public sf(int i, int i2) {
        this.sf = 15;
        this.gm = 3;
        if (i > 0) {
            this.sf = i;
            this.gm = i2;
        } else {
            a70.p("Max count must be positive number!");
            throw null;
        }
    }
}
