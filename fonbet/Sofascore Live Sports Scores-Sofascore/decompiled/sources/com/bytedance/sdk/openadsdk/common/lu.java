package com.bytedance.sdk.openadsdk.common;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lu {
    private static volatile lu vj;
    private final Map<String, List<com.bytedance.sdk.openadsdk.component.vj.sf>> pcc = new ConcurrentHashMap();
    private final Map<String, List<String>> sf = new ConcurrentHashMap();
    private final Map<String, AdSlot> gm = new ConcurrentHashMap();
    private final Object oo = new Object();
    private final Runnable wh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.lu.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(2);
            com.bytedance.sdk.component.wh.pcc.qf.pcc.pcc().postDelayed(lu.this.wh, com.bytedance.sdk.openadsdk.component.qf.pcc.ork());
        }
    };

    private lu() {
    }

    private void sf(AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        if (this.gm.size() < com.bytedance.sdk.openadsdk.component.qf.pcc.tmg() && !this.gm.containsKey(codeId)) {
            this.gm.put(codeId, adSlot);
            Objects.toString(this.gm.keySet());
        }
    }

    public Map<String, AdSlot> gm() {
        return this.gm;
    }

    public void oo() {
        com.bytedance.sdk.component.wh.pcc.qf.pcc.pcc().postDelayed(this.wh, com.bytedance.sdk.openadsdk.component.qf.pcc.ork());
    }

    public void pcc(of ofVar, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        AdSlot gqd;
        if (ofVar == null || pccVar == null || (gqd = ofVar.gqd()) == null || ofVar.duh() || !TextUtils.isEmpty(gqd.getBidAdm()) || ofVar.msk() == 2) {
            return;
        }
        String codeId = gqd.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return;
        }
        synchronized (this.oo) {
            try {
                int tmg = com.bytedance.sdk.openadsdk.component.qf.pcc.tmg();
                if (!this.pcc.containsKey(codeId) && this.pcc.size() >= tmg) {
                    this.pcc.size();
                    return;
                }
                com.bytedance.sdk.openadsdk.component.vj.sf sf = sf(ofVar, pccVar);
                List<com.bytedance.sdk.openadsdk.component.vj.sf> list = this.pcc.get(codeId);
                if (list == null) {
                    list = new ArrayList<>();
                }
                pcc(list);
                int kj = com.bytedance.sdk.openadsdk.component.qf.pcc.kj();
                if (list.size() >= kj) {
                    if (pcc(list, gqd) && list.size() < kj) {
                        list.add(sf);
                        pcc(codeId, list);
                    }
                    return;
                }
                list.size();
                com.bytedance.sdk.openadsdk.component.oo.sf.pcc(ofVar, list.size(), gqd.getCacheScene(), false);
                list.add(sf);
                this.pcc.put(codeId, list);
                pcc(gqd, ofVar.qxv());
                pcc(codeId, list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sf() {
        try {
            synchronized (this.oo) {
                this.pcc.clear();
                this.sf.clear();
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad_material_cache_origin");
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad_material_cache_encrypt");
            }
        } catch (Exception unused) {
        }
    }

    private void sf(String str) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad_material_cache_encrypt", "material".concat(String.valueOf(str)));
    }

    private com.bytedance.sdk.openadsdk.component.vj.sf sf(of ofVar, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        if (ofVar == null || ofVar.gqd() == null || pccVar == null) {
            return null;
        }
        String codeId = ofVar.gqd().getCodeId();
        String qxv = ofVar.qxv();
        return new com.bytedance.sdk.openadsdk.component.vj.sf(codeId, pccVar.tmg(), ofVar.wjv(), System.currentTimeMillis(), ofVar.hds(), qxv);
    }

    public static lu pcc() {
        if (vj == null) {
            synchronized (lu.class) {
                try {
                    if (vj == null) {
                        vj = new lu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return vj;
    }

    private List<com.bytedance.sdk.openadsdk.component.vj.sf> pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String sf = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), (String) null);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(sf)) {
            try {
                JSONArray jSONArray = new JSONArray(sf);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(com.bytedance.sdk.openadsdk.component.vj.sf.pcc(jSONArray.getJSONObject(i)));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private void pcc(String str, List<com.bytedance.sdk.openadsdk.component.vj.sf> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.sdk.openadsdk.component.vj.sf sfVar : list) {
            if (sfVar != null) {
                try {
                    jSONArray.put(sfVar.pcc());
                } catch (Exception unused) {
                }
            }
        }
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad_material_cache_origin", "material".concat(String.valueOf(str)), jSONArray.toString());
    }

    public boolean pcc(String str, int i, int i2) {
        boolean z = true;
        if (!com.bytedance.sdk.openadsdk.component.qf.pcc.vj()) {
            return i2 <= 0;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int kj = com.bytedance.sdk.openadsdk.component.qf.pcc.kj();
        synchronized (this.oo) {
            try {
                List<com.bytedance.sdk.openadsdk.component.vj.sf> list = this.pcc.get(str);
                if (list != null && !list.isEmpty()) {
                    int size = list.size();
                    long currentTimeMillis = System.currentTimeMillis();
                    long vy = com.bytedance.sdk.openadsdk.component.qf.pcc.vy();
                    for (com.bytedance.sdk.openadsdk.component.vj.sf sfVar : list) {
                        if (sfVar != null) {
                            if (currentTimeMillis / 1000 <= sfVar.gm() && currentTimeMillis - sfVar.oo() <= vy) {
                            }
                            size--;
                        }
                    }
                    if (i + size >= kj) {
                        z = false;
                    }
                    list.size();
                    return z;
                }
                z = false;
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.bytedance.sdk.openadsdk.component.vj.sf pcc(AdSlot adSlot) {
        if (adSlot == null) {
            return null;
        }
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId)) {
            return null;
        }
        synchronized (this.oo) {
            try {
                pcc(codeId, adSlot);
                List<com.bytedance.sdk.openadsdk.component.vj.sf> list = this.pcc.get(codeId);
                List<String> list2 = this.sf.get(codeId);
                if (list != null && !list.isEmpty()) {
                    boolean pcc = pcc(list);
                    if (list.isEmpty()) {
                        list.size();
                        pcc(codeId, (String) null);
                        return null;
                    }
                    if (pcc) {
                        pcc(codeId, list);
                    }
                    List<com.bytedance.sdk.openadsdk.component.vj.sf> pcc2 = pcc(list, adSlot, list2);
                    if (pcc2 != null && !pcc2.isEmpty()) {
                        Collections.sort(pcc2, com.bytedance.sdk.openadsdk.component.vj.sf.pcc);
                        com.bytedance.sdk.openadsdk.component.vj.sf sfVar = pcc2.get(0);
                        if (com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(adSlot) && list2 != null) {
                            if (list2.size() >= list.size()) {
                                return null;
                            }
                            list2.add(sfVar.wh());
                        }
                        return sfVar;
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    private void pcc(AdSlot adSlot, String str) {
        if (adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        boolean z = adSlot.getCacheScene() != 0;
        String codeId = adSlot.getCodeId();
        if (TextUtils.isEmpty(codeId) || z || !com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(adSlot)) {
            return;
        }
        List<String> list = this.sf.get(codeId);
        if (list == null) {
            list = new ArrayList<>();
        }
        if (list.contains(str)) {
            return;
        }
        list.add(str);
        this.sf.put(codeId, list);
    }

    private void pcc(String str, AdSlot adSlot) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int tmg = com.bytedance.sdk.openadsdk.component.qf.pcc.tmg();
        if (!this.pcc.containsKey(str) && this.pcc.size() >= tmg) {
            this.pcc.size();
            return;
        }
        List<com.bytedance.sdk.openadsdk.component.vj.sf> list = this.pcc.get(str);
        if (list == null || list.isEmpty()) {
            List<com.bytedance.sdk.openadsdk.component.vj.sf> pcc = pcc(str);
            if (pcc == null) {
                pcc = new ArrayList<>();
            }
            this.pcc.put(str, pcc);
        }
        if (!this.sf.containsKey(str)) {
            this.sf.put(str, new ArrayList());
        }
        sf(adSlot);
    }

    private boolean pcc(List<com.bytedance.sdk.openadsdk.component.vj.sf> list) {
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<com.bytedance.sdk.openadsdk.component.vj.sf> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.vj.sf next = it.next();
                if (next != null && currentTimeMillis > next.gm()) {
                    com.bytedance.sdk.openadsdk.component.wh.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(next.sf());
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    private boolean pcc(List<com.bytedance.sdk.openadsdk.component.vj.sf> list, AdSlot adSlot) {
        if (list != null && !list.isEmpty() && adSlot != null) {
            long vy = com.bytedance.sdk.openadsdk.component.qf.pcc.vy();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<com.bytedance.sdk.openadsdk.component.vj.sf> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.component.vj.sf next = it.next();
                if (next != null && currentTimeMillis - next.oo() > vy) {
                    it.remove();
                    com.bytedance.sdk.openadsdk.component.oo.sf.pcc(next.sf(), list.size(), adSlot.getCacheScene(), true);
                    return true;
                }
            }
        }
        return false;
    }

    private List<com.bytedance.sdk.openadsdk.component.vj.sf> pcc(List<com.bytedance.sdk.openadsdk.component.vj.sf> list, AdSlot adSlot, List<String> list2) {
        if (adSlot == null || list == null || list.isEmpty() || list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.component.vj.sf sfVar : list) {
            if (sfVar != null) {
                if (com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(adSlot) && list2.contains(sfVar.wh())) {
                    adSlot.getCodeId();
                    sfVar.wh();
                } else {
                    arrayList.add(sfVar);
                }
            }
        }
        return arrayList;
    }

    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.oo) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.pcc.remove(str);
                    sf(str);
                    return;
                }
                List<com.bytedance.sdk.openadsdk.component.vj.sf> list = this.pcc.get(str);
                if (list != null && !list.isEmpty()) {
                    Iterator<com.bytedance.sdk.openadsdk.component.vj.sf> it = list.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.openadsdk.component.vj.sf next = it.next();
                        if (next != null && str2.equals(next.wh())) {
                            list.size();
                            it.remove();
                        }
                    }
                    if (list.isEmpty()) {
                        list.size();
                        this.pcc.remove(str);
                        sf(str);
                    } else if (list.size() < com.bytedance.sdk.openadsdk.component.qf.pcc.kj()) {
                        list.size();
                        pcc(str, list);
                    }
                    List<String> list2 = this.sf.get(str);
                    if (list2 != null && !list2.isEmpty()) {
                        if (TextUtils.isEmpty(str2)) {
                            this.sf.remove(str);
                        } else {
                            list2.remove(str2);
                            if (list2.isEmpty()) {
                                this.sf.remove(str);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
