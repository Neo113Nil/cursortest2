package com.bytedance.adsdk.sf.gm;

import com.bytedance.adsdk.sf.gm.sf.dax;
import defpackage.dmi;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private final double gm;
    private final double oo;
    private final List<dax> pcc;
    private final char sf;
    private final String vj;
    private final String wh;

    public oo(List<dax> list, char c, double d, double d2, String str, String str2) {
        this.pcc = list;
        this.sf = c;
        this.gm = d;
        this.oo = d2;
        this.vj = str;
        this.wh = str2;
    }

    public static int pcc(char c, String str, String str2) {
        return str2.hashCode() + dmi.c(c * 31, 31, str);
    }

    public int hashCode() {
        return pcc(this.sf, this.wh, this.vj);
    }

    public double sf() {
        return this.oo;
    }

    public List<dax> pcc() {
        return this.pcc;
    }
}
