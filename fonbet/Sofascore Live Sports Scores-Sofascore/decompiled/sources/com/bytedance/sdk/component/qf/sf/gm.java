package com.bytedance.sdk.component.qf.sf;

import android.text.TextUtils;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.inmobi.media.core.config.models.CrashConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class gm {
    protected vh gm;
    private List<String> sf;
    String vj;
    protected com.bytedance.sdk.openadsdk.lu.oo vy;
    int wh;
    protected String oo = null;
    protected final Map<String, String> qf = new HashMap();
    protected String kj = null;
    private String pcc = null;
    private long vh = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
    protected boolean ork = false;

    public gm(vh vhVar) {
        this.gm = vhVar;
        try {
            oo(UUID.randomUUID().toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public String gm() {
        return this.pcc;
    }

    public void kj() {
        if (this.vy == null) {
            return;
        }
        try {
            vh vhVar = this.gm;
            if (vhVar == null || vhVar.pcc() == null) {
                return;
            }
            this.gm.pcc().sf(this.vy);
        } catch (Throwable unused) {
        }
    }

    public void oo(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.qf.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public abstract com.bytedance.sdk.component.qf.sf pcc();

    public abstract void pcc(com.bytedance.sdk.component.qf.pcc.pcc pccVar);

    public void pcc(tmg.pcc pccVar) {
        if (com.bytedance.sdk.component.qf.pcc.wh()) {
            List<String> list = this.sf;
            if (list != null && !list.isEmpty()) {
                pccVar.pcc(this.sf);
            }
            pccVar.pcc(this.vh);
        }
    }

    public void qf() {
        if (this.vy == null) {
            return;
        }
        try {
            vh vhVar = this.gm;
            if (vhVar == null || vhVar.pcc() == null) {
                return;
            }
            this.gm.pcc().pcc(this.vy);
        } catch (Throwable unused) {
        }
    }

    public void sf() {
        vh vhVar;
        if (this.oo == null || (vhVar = this.gm) == null) {
            return;
        }
        com.bytedance.sdk.component.sf.pcc.oo sf = vhVar.sf();
        synchronized (sf) {
            try {
                for (com.bytedance.sdk.component.sf.pcc.sf sfVar : sf.gm()) {
                    if (this.oo.equals(sfVar.pcc().gm())) {
                        sfVar.gm();
                    }
                }
                for (com.bytedance.sdk.component.sf.pcc.sf sfVar2 : sf.oo()) {
                    if (this.oo.equals(sfVar2.pcc().gm())) {
                        sfVar2.gm();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.bytedance.sdk.component.qf.sf vj() {
        com.bytedance.sdk.component.qf.sf sfVar;
        qf();
        try {
            sfVar = pcc();
            if (sfVar != null) {
                try {
                    if (sfVar.wh()) {
                        kj();
                        return sfVar;
                    }
                } catch (Throwable unused) {
                    vy();
                    return sfVar;
                }
            }
            vy();
            return sfVar;
        } catch (Throwable unused2) {
            sfVar = null;
        }
    }

    public void vy() {
        if (this.vy == null) {
            return;
        }
        try {
            vh vhVar = this.gm;
            if (vhVar == null || vhVar.pcc() == null) {
                return;
            }
            this.gm.pcc().gm(this.vy);
        } catch (Throwable unused) {
        }
    }

    public String wh() {
        return this.kj;
    }

    public void gm(String str) {
        this.kj = str;
    }

    public void pcc(com.bytedance.sdk.openadsdk.lu.oo ooVar) {
        this.vy = ooVar;
    }

    public void pcc(List<String> list) {
        this.sf = list;
    }

    public void pcc(long j, TimeUnit timeUnit) {
        this.vh = timeUnit.toMillis(j);
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public void pcc(int i) {
        this.wh = i;
    }

    public void oo(String str) {
        this.oo = str;
    }

    public String oo() {
        return this.oo;
    }

    public void sf(String str, String str2) {
        this.qf.put(str, str2);
    }

    public void sf(String str) {
        this.vj = str;
    }

    public final void sf(final com.bytedance.sdk.component.qf.pcc.pcc pccVar) {
        qf();
        pcc(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.component.qf.sf.gm.1
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                if (sfVar == null || !sfVar.wh()) {
                    gm.this.vy();
                } else {
                    gm.this.kj();
                }
                com.bytedance.sdk.component.qf.pcc.pcc pccVar2 = pccVar;
                if (pccVar2 != null) {
                    pccVar2.pcc(gmVar, sfVar);
                }
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(gm gmVar, IOException iOException) {
                gm.this.vy();
                com.bytedance.sdk.component.qf.pcc.pcc pccVar2 = pccVar;
                if (pccVar2 != null) {
                    pccVar2.pcc(gmVar, iOException);
                }
            }
        });
    }

    public void sf(tmg.pcc pccVar) {
        if (pccVar != null && this.qf.size() > 0) {
            for (Map.Entry<String, String> entry : this.qf.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    pccVar.sf(key, value);
                }
            }
        }
    }
}
