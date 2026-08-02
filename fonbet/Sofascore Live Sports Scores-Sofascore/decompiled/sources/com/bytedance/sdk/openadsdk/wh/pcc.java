package com.bytedance.sdk.openadsdk.wh;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.bytedance.sdk.openadsdk.core.gm;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.yt.vj;
import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static volatile pcc pcc;
    private boolean dax;
    private boolean gbb;
    private boolean gm;
    private boolean hc;
    private int jr;
    private int[] kj;
    private boolean nac;
    private boolean oo;
    private boolean ork;
    private int[] qf;
    private boolean sf;
    private int[] tmg;
    private boolean vh;
    private int[] vj;
    private int[] vy;
    private int[] wh;

    private pcc() {
        sf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] gm(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i = 0;
        for (String str : strArr) {
            try {
                int parseInt = Integer.parseInt(str);
                iArr[i] = parseInt;
                if (parseInt > 0) {
                    i++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i == length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public static pcc pcc() {
        if (pcc == null) {
            synchronized (gm.class) {
                try {
                    if (pcc == null) {
                        pcc = new pcc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] sf(String[] strArr) {
        return strArr.length > 0 ? gm(strArr[0].split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) : new int[0];
    }

    public int[] dax() {
        return this.tmg;
    }

    public boolean gbb() {
        return this.ork;
    }

    public int[] hc() {
        return this.vy;
    }

    public boolean jr() {
        return this.vh;
    }

    public boolean lu() {
        return this.nac;
    }

    public boolean nac() {
        return this.hc;
    }

    public int[] ork() {
        return this.wh;
    }

    public int[] tmg() {
        return this.kj;
    }

    public int[] vh() {
        return this.qf;
    }

    public boolean kj() {
        return this.oo;
    }

    public boolean qf() {
        return this.gm;
    }

    public int[] vy() {
        return this.vj;
    }

    public int oo() {
        return this.jr;
    }

    public boolean vj() {
        return this.dax;
    }

    public boolean wh() {
        return this.sf;
    }

    public void sf() {
        jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wh.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                pcc.this.gbb = vj.pcc("feature_switch", false);
                if (pcc.this.gbb) {
                    try {
                        pcc.this.nac = vj.pcc("exclude_banner_native", false);
                        pcc.this.jr = vj.pcc("feature_timer_interval", 10000);
                        pcc.this.dax = vj.pcc("enable_feature_cids", true);
                        String[] split = vj.pcc("pag_ad_show_cnt", "1,3,5&session").split(U3.j.c);
                        String[] split2 = vj.pcc("pag_ad_click_cnt", "1,3,5&session").split(U3.j.c);
                        String[] split3 = vj.pcc("pag_video_play_cnt", "1,3,5&session").split(U3.j.c);
                        String[] split4 = vj.pcc("pag_dislike_cnt", "1,3,5session").split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                        pcc pccVar = pcc.this;
                        pccVar.sf = pccVar.pcc(split);
                        pcc pccVar2 = pcc.this;
                        pccVar2.gm = pccVar2.pcc(split2);
                        pcc pccVar3 = pcc.this;
                        pccVar3.oo = pccVar3.pcc(split3);
                        pcc pccVar4 = pcc.this;
                        pccVar4.vj = pccVar4.sf(split);
                        pcc pccVar5 = pcc.this;
                        pccVar5.wh = pccVar5.sf(split2);
                        pcc pccVar6 = pcc.this;
                        pccVar6.qf = pccVar6.sf(split3);
                        pcc pccVar7 = pcc.this;
                        pccVar7.tmg = pccVar7.gm(split4);
                        String[] split5 = vj.pcc("pag_landingPage_stay_time", "1,3,5&session").split(U3.j.c);
                        String[] split6 = vj.pcc("pag_video_stay_time", "1,3,5&session").split(U3.j.c);
                        pcc pccVar8 = pcc.this;
                        pccVar8.ork = pccVar8.pcc(split5);
                        pcc pccVar9 = pcc.this;
                        pccVar9.vh = pccVar9.pcc(split6);
                        pcc pccVar10 = pcc.this;
                        pccVar10.kj = pccVar10.sf(split5);
                        pcc pccVar11 = pcc.this;
                        pccVar11.vy = pccVar11.sf(split6);
                        pcc.this.hc = vj.pcc("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }

    public boolean gm() {
        return this.gbb;
    }
}
