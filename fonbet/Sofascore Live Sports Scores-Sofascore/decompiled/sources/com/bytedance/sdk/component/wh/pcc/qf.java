package com.bytedance.sdk.component.wh.pcc;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {
    private static qf tmg;
    private static volatile com.bytedance.sdk.component.wh.pcc.vj.pcc vy;
    private long gbb;
    private volatile com.bytedance.sdk.component.wh.pcc.oo.sf.pcc gm;
    private final AtomicBoolean hc = new AtomicBoolean(false);
    private volatile vj kj;
    private volatile com.bytedance.sdk.component.wh.pcc.oo.sf.pcc oo;
    private volatile com.bytedance.sdk.component.wh.pcc.sf.gm ork;
    private volatile Context pcc;
    private volatile com.bytedance.sdk.component.wh.pcc.pcc.vj qf;
    private volatile com.bytedance.sdk.component.wh.pcc.oo.sf.pcc sf;
    private volatile Map<Integer, com.bytedance.sdk.component.wh.pcc.sf.gm> vh;
    private volatile com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vj;
    private volatile com.bytedance.sdk.component.wh.pcc.oo.sf.pcc wh;

    private qf() {
    }

    public static com.bytedance.sdk.component.wh.pcc.vj.pcc oo() {
        if (vy == null) {
            synchronized (qf.class) {
                try {
                    if (vy == null) {
                        vy = new com.bytedance.sdk.component.wh.pcc.vj.sf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return vy;
    }

    public static synchronized qf wh() {
        qf qfVar;
        synchronized (qf.class) {
            qfVar = tmg;
            if (qfVar == null) {
                qfVar = new qf();
                tmg = qfVar;
            }
        }
        return qfVar;
    }

    public long dax() {
        return this.gbb * 86400000;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc gbb() {
        return this.vj;
    }

    public com.bytedance.sdk.component.wh.pcc.pcc.vj gm() {
        return this.qf;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc hc() {
        return this.oo;
    }

    public vj jr() {
        return this.kj;
    }

    public void kj() {
        com.bytedance.sdk.component.wh.pcc.sf.oo.pcc.sf();
    }

    public void ork() {
        com.bytedance.sdk.component.wh.pcc.sf.oo.pcc.gm();
    }

    public void pcc(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar) {
        if (pccVar == null) {
            return;
        }
        pccVar.pcc(System.currentTimeMillis());
        com.bytedance.sdk.component.wh.pcc.sf.oo.pcc.pcc(pccVar, pccVar.oo());
    }

    public com.bytedance.sdk.component.wh.pcc.sf.gm qf() {
        return this.ork;
    }

    public Map<Integer, com.bytedance.sdk.component.wh.pcc.sf.gm> sf() {
        return this.vh;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc tmg() {
        return this.gm;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vh() {
        return this.sf;
    }

    public Context vj() {
        return this.pcc;
    }

    public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc vy() {
        return this.wh;
    }

    public void gm(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        this.gm = pccVar;
    }

    public void sf(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        this.sf = pccVar;
    }

    public void vj(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        this.vj = pccVar;
    }

    public void pcc(boolean z) {
        this.hc.set(z);
    }

    public void pcc(com.bytedance.sdk.component.wh.pcc.pcc.vj vjVar) {
        this.qf = vjVar;
    }

    public void pcc(Context context) {
        this.pcc = context;
    }

    public void pcc(com.bytedance.sdk.component.wh.pcc.sf.gm gmVar) {
        this.ork = gmVar;
    }

    public void pcc(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        this.wh = pccVar;
    }

    public boolean pcc() {
        return this.hc.get();
    }

    public void pcc(String str, boolean z) {
        com.bytedance.sdk.component.wh.pcc.wh.pcc.pcc().pcc(str, z);
    }

    public void pcc(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.wh.pcc.wh.pcc.pcc().pcc(str, list, z, map, i, str2);
    }

    public void oo(com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        this.oo = pccVar;
    }

    public void pcc(vj vjVar) {
        this.kj = vjVar;
    }

    public void pcc(long j) {
        this.gbb = j;
    }
}
