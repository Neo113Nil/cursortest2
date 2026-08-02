package com.bytedance.sdk.component.adexpress.pcc.sf;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.pcc.gm.pcc;
import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj extends gm {
    private static File pcc;
    private static volatile vj sf;
    private AtomicBoolean gm = new AtomicBoolean(true);
    private AtomicBoolean oo = new AtomicBoolean(false);
    private boolean vj = false;
    private AtomicBoolean wh = new AtomicBoolean(false);
    private AtomicInteger qf = new AtomicInteger(0);
    private AtomicLong kj = new AtomicLong();

    private vj() {
        vy();
    }

    public static File kj() {
        if (pcc == null) {
            try {
                File pcc2 = oo.pcc();
                Context sf2 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf();
                File file = new File(sf2 != null ? com.bytedance.sdk.component.utils.qf.pcc(sf2, "tt_tmpl_pkg") : new File(pcc2, "tt_tmpl_pkg"), "template");
                file.mkdirs();
                pcc = file;
            } catch (Throwable unused) {
            }
        }
        return pcc;
    }

    private void ork() {
        if (this.qf.getAndSet(0) <= 0 || System.currentTimeMillis() - this.kj.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        qf();
    }

    public static vj sf() {
        if (sf == null) {
            synchronized (vj.class) {
                try {
                    if (sf == null) {
                        sf = new vj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sf;
    }

    private void vy() {
        com.bytedance.sdk.component.adexpress.oo.oo.sf(new com.bytedance.sdk.component.kj.sf.gm("init") { // from class: com.bytedance.sdk.component.adexpress.pcc.sf.vj.1
            @Override // java.lang.Runnable
            public void run() {
                kj.pcc();
                vj.this.gm.set(false);
                vj.this.oo();
                vj.this.qf();
                if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() == null || !fum.pcc(com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf()) || com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() == null) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().oo();
            }
        }, 10);
    }

    public void gm() {
        vy();
    }

    public void oo() {
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc sf2 = kj.sf();
        if (sf2 == null || !sf2.kj()) {
            return;
        }
        boolean pcc2 = pcc(sf2);
        if (!pcc2) {
            kj.oo();
        }
        this.vj = pcc2;
    }

    public void pcc(boolean z) {
        List<pcc.C0043pcc> list;
        boolean z2;
        if (this.gm.get()) {
            return;
        }
        try {
            if (this.oo.get()) {
                if (z) {
                    this.qf.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z3 = true;
            this.oo.set(true);
            com.bytedance.sdk.component.adexpress.pcc.gm.pcc vj = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().vj();
            com.bytedance.sdk.component.adexpress.pcc.gm.pcc sf2 = kj.sf();
            if (vj != null && vj.kj()) {
                if (!kj.sf(vj)) {
                    this.oo.set(false);
                    this.kj.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() != null) {
                    com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().gm().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.pcc.sf.vj.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.vj.vj.pcc().sf();
                        }
                    });
                }
                kj.pcc(vj);
                boolean pcc2 = (vj.vj() == null || TextUtils.isEmpty(vj.vj().pcc())) ? false : pcc(vj.vj().pcc());
                if (vj.pcc().size() != 0) {
                    list = pcc(vj, sf2);
                    z2 = list != null;
                } else {
                    list = null;
                    z2 = pcc2;
                }
                if (!pcc2) {
                    List<pcc.C0043pcc> sf3 = sf(vj, sf2);
                    if (list == null || sf3 == null) {
                        list = sf3;
                    } else {
                        list.addAll(sf3);
                    }
                    if (sf3 == null) {
                        z3 = false;
                    }
                    if (sf3 == null) {
                        this.oo.set(false);
                    }
                    z2 = z3;
                }
                if (z2 && pcc(vj)) {
                    kj.pcc(vj);
                    kj.gm();
                    sf(list);
                }
                oo();
                this.oo.set(false);
                this.kj.set(System.currentTimeMillis());
                ork();
                return;
            }
            this.oo.set(false);
            pcc(109);
        } catch (Throwable unused) {
        }
    }

    public void qf() {
        pcc(false);
    }

    public boolean vj() {
        return this.vj;
    }

    public com.bytedance.sdk.component.adexpress.pcc.gm.pcc wh() {
        return kj.sf();
    }

    public boolean pcc(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar) {
        if (pccVar == null) {
            return false;
        }
        return pcc(pccVar.pcc()) || pcc(pccVar.vj()) || pcc(pccVar.wh());
    }

    @Override // com.bytedance.sdk.component.adexpress.pcc.sf.gm
    public File pcc() {
        return kj();
    }
}
