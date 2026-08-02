package com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.ironsource.Ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class gm {
    private static int gm = 20;
    private boolean kj;
    private final Context pcc;
    private boolean vj;
    protected final List<com.bytedance.sdk.component.wh.pcc.oo.pcc> sf = new ArrayList();
    private final List<com.bytedance.sdk.component.wh.pcc.oo.pcc> oo = new ArrayList();
    private boolean wh = false;
    private volatile boolean qf = false;
    private final Runnable vy = new Runnable() { // from class: com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (gm.this) {
                try {
                    gm.this.qf = false;
                    boolean isEmpty = gm.this.sf.isEmpty();
                    gm gmVar = gm.this;
                    if (isEmpty) {
                        gmVar.wh = false;
                        return;
                    }
                    if (gmVar.vj) {
                        int size = gm.this.sf.size();
                        for (int i = 0; i < size; i++) {
                            gm.this.oo.add(gm.this.sf.get(i));
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(gm.this.sf);
                    }
                    gm.this.sf.clear();
                    gm.this.wh = false;
                    gm gmVar2 = gm.this;
                    if (arrayList != null) {
                        gmVar2.oo(arrayList);
                    } else {
                        gmVar2.oo(gmVar2.oo);
                        gm.this.oo.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public gm(Context context) {
        this.kj = true;
        this.pcc = context;
        try {
            com.bytedance.sdk.component.wh.pcc.vj jr = com.bytedance.sdk.component.wh.pcc.qf.wh().jr();
            if (jr != null) {
                this.kj = jr.hc();
                this.vj = jr.gbb();
                gm = jr.jr();
            }
            lo.pcc("DBInsertMemRepo", "enableOpt:" + this.kj + ",BATCH_SIZE:" + gm, Boolean.valueOf(this.vj));
        } catch (Throwable unused) {
        }
    }

    private void pcc() {
        if (!this.wh) {
            com.bytedance.sdk.component.wh.pcc.qf.pcc.pcc().postDelayed(this.vy, this.vj ? wh() : com.bytedance.sdk.component.wh.pcc.qf.pcc.sf());
            this.wh = true;
        }
        if (this.kj && this.sf.size() >= gm && !this.qf) {
            com.bytedance.sdk.component.wh.pcc.qf.pcc.pcc().removeCallbacks(this.vy);
            com.bytedance.sdk.component.wh.pcc.qf.pcc.pcc().post(this.vy);
            this.wh = true;
            this.qf = true;
        }
    }

    public synchronized void gm(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.wh.pcc.oo.pcc> it = this.sf.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.wh.pcc.oo.pcc next = it.next();
                        if (next != null) {
                            String gm2 = next.gm();
                            if (!TextUtils.isEmpty(gm2) && list.contains(gm2)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th) {
                    sf();
                    th.getMessage();
                }
            }
        }
    }

    public void oo(List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), list);
    }

    public abstract String sf();

    public Context vj() {
        return this.pcc;
    }

    public long wh() {
        return Ua.s;
    }

    public synchronized void pcc(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar) {
        if (pccVar.wh() != null && !TextUtils.isEmpty(pccVar.gm())) {
            this.sf.add(pccVar);
            pcc();
        }
    }
}
