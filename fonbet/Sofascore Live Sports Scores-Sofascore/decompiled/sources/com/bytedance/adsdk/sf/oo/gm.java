package com.bytedance.adsdk.sf.oo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum gm {
    JSON(".json"),
    ZIP(".zip");

    public final String gm;

    gm(String str) {
        this.gm = str;
    }

    public String pcc() {
        return ".temp" + this.gm;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.gm;
    }
}
