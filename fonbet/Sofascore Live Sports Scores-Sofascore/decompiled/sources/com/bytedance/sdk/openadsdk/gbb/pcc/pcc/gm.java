package com.bytedance.sdk.openadsdk.gbb.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.qy;
import com.bytedance.sdk.openadsdk.core.model.tz;
import com.bytedance.sdk.openadsdk.utils.rnn;
import defpackage.lnb;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private static final LinkedHashMap<String, SoftReference<String>> oo = new LinkedHashMap<String, SoftReference<String>>(16, 0.75f, true) { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, SoftReference<String>> entry) {
            return size() > 5;
        }
    };
    private static volatile gm pcc;
    private of vj;
    private final Object sf = new Object();
    private of gm = null;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc(List<com.bytedance.sdk.openadsdk.gbb.pcc.pcc> list);
    }

    public static List<of> sf(String str) {
        if (str == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.core.model.pcc pccVar = new com.bytedance.sdk.openadsdk.core.model.pcc();
        try {
            JSONObject jSONObject = new JSONObject(str);
            pccVar.pcc(jSONObject.optString("request_id"));
            pccVar.pcc(jSONObject.optInt("ret"));
            pccVar.sf(jSONObject.optInt("multi_ad_style", 0));
            pccVar.sf(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String optString = jSONObject.optString("gdid_encrypted");
            pccVar.pcc(tz.pcc(jSONObject.optJSONObject("loop_config")));
            String optString2 = jSONObject.optString("auction_price");
            if (pccVar.oo() != 0) {
                return null;
            }
            pccVar.pcc(qy.pcc(jSONObject.optString("multi_ad_config")));
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    of pcc2 = com.bytedance.sdk.openadsdk.core.sf.pcc(optJSONArray.optJSONObject(i), null, null, pccVar, i);
                    if (pcc2 != null) {
                        pcc2.gbb(optString2);
                        if (TextUtils.isEmpty(pcc2.qrz())) {
                            pcc2.pq(jSONObject.toString());
                        }
                        if (!TextUtils.isEmpty(optString)) {
                            pcc2.vy(optString);
                        }
                    }
                    pccVar.pcc(pcc2);
                    arrayList.add(pcc2);
                }
            }
            return arrayList.isEmpty() ? pccVar.vj() : arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private String vj(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.sf) {
            try {
                LinkedHashMap<String, SoftReference<String>> linkedHashMap = oo;
                SoftReference<String> softReference = linkedHashMap.get(str);
                if (softReference != null) {
                    String str2 = softReference.get();
                    if (str2 != null) {
                        wh("After add: ".concat(String.valueOf(str)));
                        return str2;
                    }
                    linkedHashMap.remove(str);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void wh(String str) {
        Iterator<Map.Entry<String, SoftReference<String>>> it = oo.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey();
        }
    }

    public String gm(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.gbb.pcc.pcc.pcc.pcc(str, "XOR$1_");
        } catch (Exception unused) {
            return null;
        }
    }

    public String oo(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String sf2 = com.bytedance.sdk.openadsdk.gbb.pcc.pcc.pcc.sf(str, "XOR$1_");
            return !TextUtils.isEmpty(sf2) ? sf2 : str;
        } catch (Exception unused) {
            return null;
        }
    }

    public void pcc(final String str, final InterfaceC0108gm interfaceC0108gm) {
        if (TextUtils.isEmpty(str)) {
            if (interfaceC0108gm != null) {
                interfaceC0108gm.sf("materialKey is empty");
                return;
            }
            return;
        }
        String vj = vj(str);
        if (vj == null) {
            rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("iabhistory_query_material") { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String oo2 = gm.this.oo(com.bytedance.sdk.openadsdk.gbb.pcc.pcc.sf.pcc().pcc(str));
                        if (!TextUtils.isEmpty(oo2)) {
                            gm.this.pcc(str, oo2);
                        }
                        InterfaceC0108gm interfaceC0108gm2 = interfaceC0108gm;
                        if (interfaceC0108gm2 != null) {
                            interfaceC0108gm2.pcc(oo2);
                        }
                    } catch (Exception e) {
                        InterfaceC0108gm interfaceC0108gm3 = interfaceC0108gm;
                        if (interfaceC0108gm3 != null) {
                            interfaceC0108gm3.sf(e.getMessage());
                        }
                    }
                }
            }, 8);
        } else if (interfaceC0108gm != null) {
            interfaceC0108gm.pcc(vj);
        }
    }

    public of gm() {
        return this.vj;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm$gm, reason: collision with other inner class name */
    public interface InterfaceC0108gm {
        void pcc(String str);

        default void sf(String str) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc();

        default void pcc(Exception exc) {
        }
    }

    public static gm pcc() {
        if (pcc == null) {
            synchronized (gm.class) {
                try {
                    if (pcc == null) {
                        pcc = new gm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        synchronized (this.sf) {
            LinkedHashMap<String, SoftReference<String>> linkedHashMap = oo;
            linkedHashMap.put(str, new SoftReference<>(str2));
            linkedHashMap.size();
        }
    }

    public void pcc(final com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar) {
        if (pccVar == null) {
            return;
        }
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("iabhistory_insert") { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.gbb.pcc.pcc.sf.pcc().pcc(pccVar);
                } catch (Exception unused) {
                }
            }
        }, 8);
    }

    public void pcc(final sf sfVar) {
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("iabhistory_get_all") { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    List<com.bytedance.sdk.openadsdk.gbb.pcc.pcc> sf2 = com.bytedance.sdk.openadsdk.gbb.pcc.pcc.sf.pcc().sf();
                    sf sfVar2 = sfVar;
                    if (sfVar2 != null) {
                        if (sf2 == null) {
                            sf2 = Collections.EMPTY_LIST;
                        }
                        sfVar2.pcc(sf2);
                    }
                } catch (Exception unused) {
                }
            }
        }, 8);
    }

    public void pcc(final pcc pccVar) {
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("iabhistory_clear") { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.gbb.pcc.pcc.sf.pcc().gm();
                    gm.oo.clear();
                    pcc pccVar2 = pccVar;
                    if (pccVar2 != null) {
                        pccVar2.pcc();
                    }
                } catch (Exception e) {
                    pcc pccVar3 = pccVar;
                    if (pccVar3 != null) {
                        pccVar3.pcc(e);
                    }
                }
            }
        }, 8);
    }

    public String pcc(String str) {
        try {
            return lnb.o("https://", new URL(str).getHost(), "/favicon.ico");
        } catch (Exception unused) {
            return null;
        }
    }

    public void pcc(of ofVar) {
        this.vj = ofVar;
    }

    public void sf() {
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("iabhistory_clear_overlimit") { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.gbb.pcc.pcc.sf.pcc().oo();
                } catch (Exception unused) {
                }
            }
        }, 8);
    }

    public void sf(final com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar) {
        if (pccVar == null) {
            return;
        }
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("iabhistory_insert") { // from class: com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.gbb.pcc.pcc.sf.pcc().sf(pccVar);
                } catch (Exception unused) {
                }
            }
        }, 8);
    }
}
