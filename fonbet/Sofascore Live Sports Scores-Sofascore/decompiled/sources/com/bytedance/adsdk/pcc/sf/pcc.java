package com.bytedance.adsdk.pcc.sf;

import com.bytedance.adsdk.pcc.sf.gm.pcc.gm;
import com.bytedance.adsdk.pcc.sf.gm.pcc.kj;
import com.bytedance.adsdk.pcc.sf.gm.pcc.oo;
import com.bytedance.adsdk.pcc.sf.gm.pcc.ork;
import com.bytedance.adsdk.pcc.sf.gm.pcc.qf;
import com.bytedance.adsdk.pcc.sf.gm.pcc.sf;
import com.bytedance.adsdk.pcc.sf.gm.pcc.vj;
import com.bytedance.adsdk.pcc.sf.gm.pcc.vy;
import com.bytedance.adsdk.pcc.sf.gm.pcc.wh;
import defpackage.a70;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static final com.bytedance.adsdk.pcc.sf.gm.pcc pcc;
    private com.bytedance.adsdk.pcc.sf.sf.pcc gm;
    private Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> oo = new LinkedList();
    private final com.bytedance.adsdk.pcc.sf.gm.pcc sf;
    private String vj;

    static {
        int i = 8;
        wh[] whVarArr = {new ork(), new oo(), new vy(), new sf(), new vj(), new com.bytedance.adsdk.pcc.sf.gm.pcc.pcc(), new qf(), new gm(), new kj()};
        final com.bytedance.adsdk.pcc.sf.gm.pcc pccVar = new com.bytedance.adsdk.pcc.sf.gm.pcc() { // from class: com.bytedance.adsdk.pcc.sf.pcc.1
            @Override // com.bytedance.adsdk.pcc.sf.gm.pcc
            public int pcc(String str, int i2, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque) {
                return i2;
            }
        };
        while (i >= 0) {
            final wh whVar = whVarArr[i];
            i--;
            pccVar = new com.bytedance.adsdk.pcc.sf.gm.pcc() { // from class: com.bytedance.adsdk.pcc.sf.pcc.2
                @Override // com.bytedance.adsdk.pcc.sf.gm.pcc
                public int pcc(String str, int i2, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque) {
                    return wh.this.pcc(str, i2, deque, pccVar);
                }
            };
        }
        pcc = pccVar;
    }

    private pcc(String str, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar) {
        this.sf = pccVar;
        this.vj = str;
        try {
            pcc();
        } catch (Exception e) {
            throw new com.bytedance.adsdk.pcc.pcc.sf(str, e);
        }
    }

    private void pcc() {
        int length = this.vj.length();
        int i = 0;
        while (i < length) {
            int pcc2 = this.sf.pcc(this.vj, i, this.oo);
            if (pcc2 == i) {
                a70.p("Unrecognized expression, unrecognized characters encountered during parsing:".concat(this.vj.substring(0, i)));
                return;
            }
            i = pcc2;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.pcc.sf.sf.pcc pollFirst = this.oo.pollFirst();
            if (pollFirst == null) {
                this.gm = com.bytedance.adsdk.pcc.sf.vj.sf.pcc(arrayList, this.vj, i);
                this.oo = null;
                return;
            }
            arrayList.add(0, pollFirst);
        }
    }

    public static pcc pcc(String str) {
        return new pcc(str, pcc);
    }

    public <T> T pcc(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("default_key", jSONObject);
        return (T) pcc(hashMap);
    }

    public <T> T pcc(Map<String, JSONObject> map) {
        return (T) this.gm.pcc(map);
    }
}
