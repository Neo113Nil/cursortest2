package com.bytedance.sdk.openadsdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class TTImage {
    private final String gm;
    private double oo;
    private final int pcc;
    private final int sf;

    public TTImage(int i, int i2, String str, double d) {
        this.pcc = i;
        this.sf = i2;
        this.gm = str;
        this.oo = d;
    }

    public double getDuration() {
        return this.oo;
    }

    public int getHeight() {
        return this.pcc;
    }

    public String getImageUrl() {
        return this.gm;
    }

    public int getWidth() {
        return this.sf;
    }

    public boolean isValid() {
        String str;
        return this.pcc > 0 && this.sf > 0 && (str = this.gm) != null && str.length() > 0;
    }

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, 0.0d);
    }
}
