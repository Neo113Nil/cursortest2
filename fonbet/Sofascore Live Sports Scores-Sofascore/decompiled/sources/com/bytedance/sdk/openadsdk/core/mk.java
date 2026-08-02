package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class mk {
    public static ConcurrentHashMap<Integer, mk> pcc = new ConcurrentHashMap<>();
    private int oo;
    private int vj;
    private String wh;
    private String sf = "";
    private String gm = "";

    public static void gm(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        mk mkVar;
        if (ofVar == null) {
            return;
        }
        int kot = ofVar.kot();
        Integer valueOf = Integer.valueOf(kot);
        if (kot == 0) {
            return;
        }
        ConcurrentHashMap<Integer, mk> concurrentHashMap = pcc;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            pcc = concurrentHashMap;
        }
        if (!concurrentHashMap.containsKey(valueOf) || (mkVar = pcc.get(valueOf)) == null) {
            return;
        }
        mkVar.pcc(1);
    }

    public static void sf(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar == null || TextUtils.isEmpty(ofVar.hl())) {
            return;
        }
        int kot = ofVar.kot();
        Integer valueOf = Integer.valueOf(kot);
        if (kot == 0) {
            return;
        }
        ConcurrentHashMap<Integer, mk> concurrentHashMap = pcc;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            pcc = concurrentHashMap;
        }
        mk mkVar = concurrentHashMap.containsKey(valueOf) ? pcc.get(valueOf) : null;
        if (mkVar == null) {
            mkVar = new mk();
        }
        String qxv = ofVar.qxv();
        if (TextUtils.isEmpty(qxv) || !qxv.equals(mkVar.pcc())) {
            mkVar.wh();
            mkVar.pcc(ofVar);
            pcc.put(valueOf, mkVar);
        }
    }

    private void wh() {
        this.sf = "";
        this.gm = "";
        this.oo = 0;
        this.vj = 0;
    }

    public int oo() {
        return this.oo;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar != null) {
            String qxv = ofVar.qxv();
            if (!TextUtils.isEmpty(qxv)) {
                this.wh = qxv;
            }
            String xy = ofVar.xy();
            if (TextUtils.isEmpty(xy) && ofVar.on()) {
                xy = ofVar.ibs().vy();
            }
            if (!TextUtils.isEmpty(xy)) {
                String[] split = xy.split("/");
                if (split.length >= 3) {
                    this.sf = split[2];
                }
            }
            if (ofVar.xfm() == null || TextUtils.isEmpty(ofVar.xfm().gm())) {
                return;
            }
            this.gm = ofVar.xfm().gm();
        }
    }

    public int vj() {
        return this.vj;
    }

    public static void gm(int i) {
        mk mkVar;
        if (i == 0) {
            return;
        }
        ConcurrentHashMap<Integer, mk> concurrentHashMap = pcc;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            pcc = concurrentHashMap;
        }
        if (!concurrentHashMap.containsKey(Integer.valueOf(i)) || (mkVar = pcc.get(Integer.valueOf(i))) == null) {
            return;
        }
        mkVar.sf(1);
    }

    public String gm() {
        return this.gm;
    }

    public void pcc(int i) {
        this.oo = i;
    }

    public void sf(int i) {
        this.vj = i;
    }

    public String pcc() {
        return this.wh;
    }

    public String sf() {
        return this.sf;
    }
}
