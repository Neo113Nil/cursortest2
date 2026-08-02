package com.bytedance.sdk.component.sf.pcc;

import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.C4094gc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class tmg {
    private List<String> gm;
    public vh pcc;
    private long oo = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
    public com.bytedance.sdk.component.gm.pcc.pcc sf = new com.bytedance.sdk.component.gm.pcc.pcc();

    public abstract Object gm();

    public abstract String kj();

    public abstract qf oo();

    public hc ork() {
        return null;
    }

    public List<String> pcc() {
        return this.gm;
    }

    public abstract com.bytedance.sdk.component.sf.pcc.pcc qf();

    public long sf() {
        return this.oo;
    }

    public pcc vh() {
        return new pcc(this);
    }

    public abstract String vj();

    public abstract int vy();

    public abstract Map<String, List<String>> wh();

    public void pcc(vh vhVar) {
        this.pcc = vhVar;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        qf gm;
        String kj;
        String oo;
        private long ork;
        com.bytedance.sdk.component.sf.pcc.pcc pcc;
        int qf;
        Map<String, List<String>> sf;
        Object vj;
        private List<String> vy;
        hc wh;

        public pcc(tmg tmgVar) {
            this.ork = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            this.gm = tmgVar.oo();
            this.oo = tmgVar.vj();
            this.sf = tmgVar.wh();
            this.vj = tmgVar.gm();
            this.wh = tmgVar.ork();
            this.pcc = tmgVar.qf();
            this.qf = tmgVar.vy();
            this.kj = tmgVar.kj();
            this.vy = tmgVar.pcc();
            this.ork = tmgVar.sf();
        }

        public pcc pcc() {
            return pcc(C4094gc.a, (hc) null);
        }

        public pcc sf(String str, String str2) {
            if (!this.sf.containsKey(str)) {
                this.sf.put(str, new ArrayList());
            }
            this.sf.get(str).add(str2);
            return this;
        }

        public pcc pcc(com.bytedance.sdk.component.sf.pcc.pcc pccVar) {
            this.pcc = pccVar;
            return this;
        }

        public pcc pcc(String str) {
            this.kj = str;
            return this;
        }

        public pcc pcc(int i) {
            this.qf = i;
            return this;
        }

        public pcc pcc(Object obj) {
            this.vj = obj;
            return this;
        }

        public pcc pcc(qf qfVar) {
            this.gm = qfVar;
            return this;
        }

        public pcc pcc(String str, String str2) {
            return sf(str, str2);
        }

        private pcc pcc(String str, hc hcVar) {
            this.oo = str;
            this.wh = hcVar;
            return this;
        }

        public pcc pcc(hc hcVar) {
            return pcc(C4094gc.b, hcVar);
        }

        public pcc pcc(List<String> list) {
            this.vy = list;
            return this;
        }

        public pcc pcc(long j) {
            this.ork = j;
            return this;
        }

        public pcc sf(String str) {
            return pcc(qf.gm(str));
        }

        public tmg sf() {
            return new tmg() { // from class: com.bytedance.sdk.component.sf.pcc.tmg.pcc.1
                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public Object gm() {
                    return pcc.this.vj;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public String kj() {
                    return pcc.this.kj;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public qf oo() {
                    return pcc.this.gm;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public hc ork() {
                    return pcc.this.wh;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public List<String> pcc() {
                    return pcc.this.vy;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public com.bytedance.sdk.component.sf.pcc.pcc qf() {
                    return pcc.this.pcc;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public long sf() {
                    return pcc.this.ork;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public String vj() {
                    return pcc.this.oo;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public int vy() {
                    return pcc.this.qf;
                }

                @Override // com.bytedance.sdk.component.sf.pcc.tmg
                public Map wh() {
                    return pcc.this.sf;
                }
            };
        }

        public pcc() {
            this.ork = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            this.sf = new HashMap();
        }
    }
}
