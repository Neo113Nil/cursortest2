package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.text.TextUtils;
import defpackage.wt3;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class atb {
    private static atb pcc;
    private com.bytedance.sdk.openadsdk.pcc.oo.sf qf;
    private com.bytedance.sdk.openadsdk.pcc.vj.pcc vj;
    private com.bytedance.sdk.openadsdk.pcc.gm.sf wh;
    private final AtomicInteger sf = new AtomicInteger(0);
    private Map<Integer, com.bytedance.sdk.openadsdk.core.model.pcc> gm = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, pcc<?>> oo = new ConcurrentHashMap<>();
    private final Map<String, sf> kj = new HashMap();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc<T> {
        public final long gm = System.currentTimeMillis();
        public final T pcc;
        public final String sf;

        public pcc(T t, String str) {
            this.pcc = t;
            this.sf = str;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc();
    }

    private atb() {
    }

    private static String oo(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar == null) {
            return null;
        }
        String qxv = ofVar.qxv();
        return TextUtils.isEmpty(qxv) ? String.valueOf(ofVar.hashCode()) : qxv;
    }

    public void gm(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        String oo = oo(ofVar);
        if (TextUtils.isEmpty(oo)) {
            return;
        }
        this.kj.remove(oo);
    }

    public void pcc(String str, boolean z, boolean z2) {
        boolean z3 = z || !z2;
        boolean jr = ork.sf().jr();
        if (jr) {
            com.bytedance.sdk.component.utils.lo.pcc("BVA", "cleanListener: isFinish = " + z + ",isConfigChange = " + z2);
        }
        if (z3) {
            pcc(str, jr);
        } else if (z || !z2) {
            pcc(str, jr);
        }
    }

    public void sf(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        sf sfVar;
        if (ofVar == null) {
            return;
        }
        String oo = oo(ofVar);
        if (TextUtils.isEmpty(oo) || (sfVar = this.kj.get(oo)) == null) {
            return;
        }
        sfVar.pcc();
    }

    public void vj() {
        this.vj = null;
        this.wh = null;
        this.qf = null;
    }

    public void gm(int i) {
        this.gm.remove(Integer.valueOf(i));
    }

    public com.bytedance.sdk.openadsdk.pcc.gm.sf gm() {
        return this.wh;
    }

    public com.bytedance.sdk.openadsdk.pcc.oo.sf oo() {
        return this.qf;
    }

    public com.bytedance.sdk.openadsdk.core.model.pcc sf(int i) {
        return this.gm.remove(Integer.valueOf(i));
    }

    public com.bytedance.sdk.openadsdk.pcc.vj.pcc sf() {
        return this.vj;
    }

    public <T> T pcc(String str, Class<T> cls) {
        pcc<?> pccVar;
        if (TextUtils.isEmpty(str) || cls == null || (pccVar = this.oo.get(str)) == null || !cls.isInstance(pccVar.pcc)) {
            return null;
        }
        return cls.cast(pccVar.pcc);
    }

    public pcc<?> pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.oo.remove(str);
    }

    public static atb pcc() {
        atb atbVar = pcc;
        if (atbVar != null) {
            return atbVar;
        }
        atb atbVar2 = new atb();
        pcc = atbVar2;
        return atbVar2;
    }

    public com.bytedance.sdk.openadsdk.core.model.of pcc(int i) {
        com.bytedance.sdk.openadsdk.core.model.pcc remove = this.gm.remove(Integer.valueOf(i));
        if (remove != null) {
            return remove.hc();
        }
        return null;
    }

    public int pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        com.bytedance.sdk.openadsdk.core.model.pcc pccVar = new com.bytedance.sdk.openadsdk.core.model.pcc();
        pccVar.sf(ofVar);
        return pcc(pccVar);
    }

    public void pcc(com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar) {
        this.wh = sfVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar) {
        this.vj = pccVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.pcc.oo.sf sfVar) {
        this.qf = sfVar;
    }

    public int pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        int incrementAndGet = this.sf.incrementAndGet();
        this.gm.put(Integer.valueOf(incrementAndGet), pccVar);
        return incrementAndGet;
    }

    public static int pcc(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, sf sfVar) {
        if (ofVar == null || sfVar == null) {
            return;
        }
        String oo = oo(ofVar);
        if (TextUtils.isEmpty(oo)) {
            return;
        }
        this.kj.put(oo, sfVar);
    }

    public <T> void pcc(String str, T t) {
        if (TextUtils.isEmpty(str) || t == null) {
            return;
        }
        this.oo.put(str, new pcc<>(t, str));
    }

    private void pcc(String str, boolean z) {
        pcc<?> pcc2 = pcc(str);
        if (z) {
            if (pcc2 == null) {
                com.bytedance.sdk.component.utils.lo.pcc("BVA", "cleanListener: removeCallback failed,listenerKey=".concat(String.valueOf(str)));
                return;
            }
            StringBuilder q = wt3.q("cleanListener: removeCallback success,listenerKey=", str, ",callback=");
            q.append(pcc2.pcc);
            com.bytedance.sdk.component.utils.lo.pcc("BVA", q.toString());
        }
    }
}
