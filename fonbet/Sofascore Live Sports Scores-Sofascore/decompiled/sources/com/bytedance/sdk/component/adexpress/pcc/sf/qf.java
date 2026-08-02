package com.bytedance.sdk.component.adexpress.pcc.sf;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {
    private static volatile qf pcc;
    private AtomicBoolean sf = new AtomicBoolean(false);

    private qf() {
    }

    private JSONObject gm(String str) {
        com.bytedance.sdk.component.adexpress.pcc.pcc.gm gm = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm();
        if (gm == null) {
            return null;
        }
        com.bytedance.sdk.component.qf.sf.sf qf = gm.qf();
        qf.gm(str);
        com.bytedance.sdk.component.qf.sf vj = qf.vj();
        if (vj != null) {
            try {
                if (vj.wh() && vj.oo() != null) {
                    return new JSONObject(vj.oo());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private void pcc(String str, String str2, String str3) {
        JSONObject gm;
        if (TextUtils.isEmpty(str) || (gm = gm(str)) == null) {
            return;
        }
        String optString = gm.optString("md5");
        String optString2 = gm.optString("version");
        String optString3 = gm.optString("data");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.pcc.gm.sf pcc2 = new com.bytedance.sdk.component.adexpress.pcc.gm.sf().pcc(str2).sf(str3).gm(optString).oo(str).vj(optString3).wh(optString2).pcc(Long.valueOf(System.currentTimeMillis()));
        wh.pcc().pcc(pcc2, false);
        sf();
        if (kj.pcc(optString2)) {
            pcc2.wh(optString2);
            vj.sf().pcc(true);
        }
    }

    private void sf() {
        if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() == null) {
            return;
        }
        int pcc2 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().pcc();
        if (pcc2 <= 0) {
            pcc2 = 100;
        }
        List<com.bytedance.sdk.component.adexpress.pcc.gm.sf> sf = wh.pcc().sf();
        if (sf == null || sf.isEmpty() || pcc2 >= sf.size()) {
            if (sf == null) {
                return;
            }
            sf.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.pcc.gm.sf sfVar : sf) {
            treeMap.put(sfVar.qf(), sfVar);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (sf.size() - (pcc2 * 0.75f));
        int i = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i < size) {
                i++;
                ((Long) entry.getKey()).getClass();
                com.bytedance.sdk.component.adexpress.pcc.gm.sf sfVar2 = (com.bytedance.sdk.component.adexpress.pcc.gm.sf) entry.getValue();
                if (sfVar2 != null) {
                    hashSet.add(sfVar2.sf());
                }
            }
        }
        pcc(hashSet);
        this.sf.set(false);
    }

    public static qf pcc() {
        if (pcc == null) {
            synchronized (qf.class) {
                try {
                    if (pcc == null) {
                        pcc = new qf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    public com.bytedance.sdk.component.adexpress.pcc.gm.sf pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return wh.pcc().pcc(str);
    }

    public void pcc(com.bytedance.sdk.component.adexpress.pcc.gm.oo ooVar, String str) {
        String str2;
        if (ooVar == null) {
            return;
        }
        final String str3 = ooVar.pcc;
        final String str4 = ooVar.gm;
        final String str5 = ooVar.sf;
        final String str6 = ooVar.oo;
        final String str7 = ooVar.vj;
        if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() != null) {
            str2 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().kj();
        } else {
            str2 = "";
        }
        final String str8 = TextUtils.isEmpty(str) ? str2 : str;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.oo.oo.pcc(new com.bytedance.sdk.component.kj.sf.gm("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.pcc.sf.qf.1
            @Override // java.lang.Runnable
            public void run() {
                qf.this.pcc(str3, str4, str5, str6, str7, str8);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pcc(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        if (pcc(str) != null) {
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                str7 = str5;
                sf(str6, str, str3, str2, str4, str7);
            }
            return;
        }
        str7 = str5;
        if (TextUtils.isEmpty(str4)) {
            pcc(str2, str6, str);
        } else if (TextUtils.isEmpty(str3)) {
            pcc(str2, str6, str);
        } else {
            sf(str6, str, str3, str2, str4, str7);
        }
        boolean pcc2 = kj.pcc(str7);
        if (!sf.vj() || pcc2) {
            vj.sf().pcc(true);
        }
    }

    public void pcc(Set<String> set) {
        try {
            wh.pcc().pcc(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public Set<String> sf(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return wh.pcc().sf(str);
    }

    private void sf(String str, String str2, String str3, String str4, String str5, String str6) {
        wh.pcc().pcc(new com.bytedance.sdk.component.adexpress.pcc.gm.sf().pcc(str).sf(str2).gm(str3).oo(str4).vj(str5).wh(str6).pcc(Long.valueOf(System.currentTimeMillis())), false);
        sf();
    }
}
