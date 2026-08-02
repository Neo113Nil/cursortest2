package com.bytedance.sdk.openadsdk.core.hc.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.bf3;
import defpackage.wv8;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private static volatile sf pcc;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(int i, String str, String str2);

        void pcc(JSONObject jSONObject, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        int vj = lu.oo().vj();
        if (vj <= 0) {
            vj = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.hc.pcc.pcc> sf = gm.pcc().sf();
        if (sf == null || sf.isEmpty() || vj >= sf.size()) {
            if (sf == null) {
                return;
            }
            sf.size();
            return;
        }
        int size = (int) (sf.size() - (vj * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.hc.pcc.pcc pccVar : sf) {
            treeMap.put(pccVar.oo(), pccVar);
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                com.bytedance.sdk.openadsdk.core.hc.pcc.pcc pccVar2 = (com.bytedance.sdk.openadsdk.core.hc.pcc.pcc) entry.getValue();
                if (pccVar2 != null) {
                    hashSet.add(pccVar2.pcc());
                }
            }
        }
        pcc(hashSet);
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.hc.kj.pcc pccVar, String str) {
        if (pccVar == null || TextUtils.isEmpty(pccVar.pcc())) {
            return;
        }
        StringBuilder p = bf3.p(str, "_");
        p.append(pccVar.pcc());
        final String sb = p.toString();
        final String gm = pccVar.gm();
        final String sf = pccVar.sf();
        final String oo = pccVar.oo();
        String vj = pccVar.vj();
        if (TextUtils.isEmpty(vj)) {
            if (str.equals("ad")) {
                vj = ork.sf().oo();
            } else if (str.equals("adv3")) {
                vj = ork.sf().oo() + "_v3";
            }
        }
        final String str2 = vj;
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.sf.1
            @Override // java.lang.Runnable
            public void run() {
                sf.this.pcc(sb, gm, sf, oo, str2);
            }
        }, 10);
    }

    public static sf pcc() {
        if (pcc == null) {
            synchronized (sf.class) {
                try {
                    if (pcc == null) {
                        pcc = new sf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str, String str2, String str3, String str4, String str5) {
        if (pcc(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            sf(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            pcc(str2, str, str3, str5, (pcc) null);
        } else {
            sf(str2, str3, str5, str4, str);
        }
    }

    public void pcc(String str, String str2, String str3, String str4, String str5, final pcc pccVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (pccVar != null) {
                pccVar.pcc(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String i = wv8.i(str, "_", str3);
        com.bytedance.sdk.openadsdk.core.hc.pcc.pcc pcc2 = pcc(i, str4);
        if (pcc2 != null && !TextUtils.isEmpty(pcc2.vj())) {
            pcc(pcc2);
            if (pccVar != null) {
                try {
                    pccVar.pcc(new JSONObject(pcc2.vj()), ServiceProvider.NAMED_LOCAL);
                    return;
                } catch (JSONException unused) {
                    pccVar.pcc(2, "parse json exception data is " + pcc2.vj(), ServiceProvider.NAMED_LOCAL);
                    return;
                }
            }
            return;
        }
        pcc(str2, i, str4, str5, new pcc() { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.sf.2
            @Override // com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc
            public void pcc(JSONObject jSONObject, String str6) {
                pcc pccVar2 = pccVar;
                if (pccVar2 != null) {
                    pccVar2.pcc(jSONObject, str6);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc
            public void pcc(int i2, String str6, String str7) {
                pcc pccVar2 = pccVar;
                if (pccVar2 != null) {
                    pccVar2.pcc(i2, str6, str7);
                }
            }
        });
    }

    private void sf(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.hc.pcc.pcc pccVar = new com.bytedance.sdk.openadsdk.core.hc.pcc.pcc();
        pccVar.gm(str).vj(str3).oo(str4).sf(str2).pcc(str5).pcc(Long.valueOf(System.currentTimeMillis()));
        gm.pcc().pcc(pccVar);
        sf();
    }

    private void pcc(final String str, final String str2, final String str3, final String str4, final pcc pccVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (pccVar != null) {
                pccVar.pcc(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.qf.sf.sf gm = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().gm();
            gm.gm(str);
            gm.pcc(7);
            gm.sf("load_ug_t");
            gm.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.sf.3
                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                    if (sfVar == null) {
                        return;
                    }
                    if (!sfVar.wh()) {
                        pcc pccVar2 = pccVar;
                        if (pccVar2 != null) {
                            pccVar2.pcc(3, "net code error code is " + sfVar.pcc() + " message is " + sfVar.sf(), "net");
                            return;
                        }
                        return;
                    }
                    String oo = sfVar.oo();
                    if (TextUtils.isEmpty(oo)) {
                        pcc pccVar3 = pccVar;
                        if (pccVar3 != null) {
                            pccVar3.pcc(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    gm.pcc().pcc(new com.bytedance.sdk.openadsdk.core.hc.pcc.pcc().pcc(str2).sf(str3).gm(str).vj(str4).oo(oo).pcc(Long.valueOf(System.currentTimeMillis())));
                    sf.this.sf();
                    if (pccVar != null) {
                        try {
                            pccVar.pcc(new JSONObject(oo), "net");
                        } catch (JSONException unused) {
                            pccVar.pcc(2, "parse json exception data is".concat(String.valueOf(oo)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                    pcc pccVar2 = pccVar;
                    if (pccVar2 != null) {
                        pccVar2.pcc(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.hc.pcc.pcc> pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return gm.pcc().pcc(str);
    }

    public String pcc(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.hc.pcc.pcc pcc2 = pcc(wv8.i(str, "_", str2), str3);
        if (pcc2 == null) {
            return null;
        }
        pcc(pcc2);
        return pcc2.vj();
    }

    private com.bytedance.sdk.openadsdk.core.hc.pcc.pcc pcc(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return gm.pcc().pcc(str, str2);
    }

    private void pcc(final com.bytedance.sdk.openadsdk.core.hc.pcc.pcc pccVar) {
        pccVar.pcc(Long.valueOf(System.currentTimeMillis()));
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.sf.4
            @Override // java.lang.Runnable
            public void run() {
                gm.pcc().pcc(pccVar);
            }
        }, 10);
    }

    public void pcc(Set<String> set) {
        try {
            gm.pcc().pcc(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
