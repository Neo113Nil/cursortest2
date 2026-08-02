package com.bytedance.sdk.openadsdk.oo.pcc;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.dax.sf.oo;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsz;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh implements com.bytedance.sdk.component.wh.pcc.sf.gm {
    public of<com.bytedance.sdk.openadsdk.oo.pcc> pcc;
    private final pcc sf = pcc.pcc();

    private boolean gm(List<com.bytedance.sdk.openadsdk.oo.pcc> list) {
        JSONObject oo;
        if (list == null || list.size() == 0 || (oo = list.get(0).oo()) == null) {
            return true;
        }
        return TextUtils.isEmpty(oo.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, List<com.bytedance.sdk.component.wh.pcc.oo.pcc>> oo(List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
        HashMap<String, List<com.bytedance.sdk.component.wh.pcc.oo.pcc>> hashMap = new HashMap<>();
        new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar = list.get(i);
            JSONObject wh = pccVar.wh();
            if (wh != null) {
                String optString = wh.optString("app_log_url");
                List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list2 = hashMap.get(optString);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    hashMap.put(optString, list2);
                }
                list2.add(pccVar);
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.sf.gm
    public void pcc(final List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list, @Nullable final com.bytedance.sdk.component.wh.pcc.sf.sf sfVar) {
        com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar;
        if (list == null || list.isEmpty() || com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj() || (pccVar = list.get(0)) == null) {
            return;
        }
        byte oo = pccVar.oo();
        final ArrayList arrayList = new ArrayList();
        if (oo == 0) {
            rnn.vj(new com.bytedance.sdk.component.kj.sf.gm("upload_ad_event", 7) { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.1
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = wh.this.oo(list).entrySet().iterator();
                    } catch (Throwable th) {
                        lo.gm("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    Iterator it2 = it;
                    if (it2 == null) {
                        com.bytedance.sdk.component.wh.pcc.sf.sf sfVar2 = sfVar;
                        if (sfVar2 != null) {
                            sfVar2.pcc(arrayList);
                            return;
                        }
                        return;
                    }
                    while (it2.hasNext()) {
                        try {
                            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.1.1
                                @Override // com.bytedance.sdk.openadsdk.lu.oo
                                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                    return wv8.e("applog");
                                }
                            });
                            List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list2 = (List) ((Map.Entry) it2.next()).getValue();
                            ArrayList arrayList2 = new ArrayList();
                            for (com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar2 : list2) {
                                arrayList2.add(new com.bytedance.sdk.openadsdk.oo.pcc(pccVar2.gm(), pccVar2.wh()));
                            }
                            com.bytedance.sdk.openadsdk.oo.vj pcc = wh.this.pcc(arrayList2);
                            if (sfVar != null && pcc != null) {
                                boolean z = pcc.oo;
                                if (wh.this.pcc(arrayList2, pcc)) {
                                    z = true;
                                }
                                boolean z2 = z;
                                arrayList.add(new com.bytedance.sdk.component.wh.pcc.sf.sf.pcc(new com.bytedance.sdk.component.wh.pcc.sf.sf.sf(pcc.pcc, pcc.sf, pcc.gm, z2, ""), list2));
                                if (pcc.sf == 200) {
                                    com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.1.2
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            return wv8.e("applog");
                                        }
                                    });
                                } else if (z2) {
                                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.1.3
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            return wv8.e("applog");
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.1.4
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            return wv8.e("applog");
                                        }
                                    });
                                }
                            }
                            if (sfVar != null && pcc == null) {
                                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.1.5
                                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                        return wv8.e("applog");
                                    }
                                });
                            }
                        } catch (Throwable th2) {
                            lo.gm("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                    com.bytedance.sdk.component.wh.pcc.sf.sf sfVar3 = sfVar;
                    if (sfVar3 != null) {
                        sfVar3.pcc(arrayList);
                    }
                }
            });
            return;
        }
        if (oo == 1) {
            if (com.bytedance.sdk.openadsdk.dax.gm.sf()) {
                if (sfVar != null) {
                    arrayList.add(new com.bytedance.sdk.component.wh.pcc.sf.sf.pcc(new com.bytedance.sdk.component.wh.pcc.sf.sf.sf(true, 200, "", false, ""), list));
                    sfVar.pcc(arrayList);
                    return;
                }
                return;
            }
            final ArrayList arrayList2 = new ArrayList();
            for (com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar2 : list) {
                arrayList2.add(new oo.pcc(pccVar2.gm(), pccVar2.wh()));
            }
            if (arrayList2.size() > 0) {
                com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.2
                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                        return wv8.e("stats");
                    }
                });
                rnn.vj(new com.bytedance.sdk.component.kj.sf.gm("upload_stats_event", 6) { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.oo.vj sf = wh.this.sf(arrayList2);
                        if (sfVar != null && sf != null) {
                            arrayList.add(new com.bytedance.sdk.component.wh.pcc.sf.sf.pcc(new com.bytedance.sdk.component.wh.pcc.sf.sf.sf(sf.pcc, sf.sf, sf.gm, sf.oo, ""), list));
                            sfVar.pcc(arrayList);
                            if (sf.sf == 200) {
                                com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.3.1
                                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                        return wv8.e("stats");
                                    }
                                });
                            } else if (sf.oo) {
                                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.3.2
                                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                        return wv8.e("stats");
                                    }
                                });
                            } else {
                                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.3.3
                                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                        return wv8.e("stats");
                                    }
                                });
                            }
                        }
                        if (sfVar == null || sf != null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.wh.3.4
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                return wv8.e("stats");
                            }
                        });
                    }
                });
            }
        }
    }

    public com.bytedance.sdk.openadsdk.oo.vj sf(List<oo.pcc> list) {
        if (this.pcc == null) {
            this.pcc = lu.gm();
        }
        if (list != null && list.size() != 0 && com.bytedance.sdk.openadsdk.core.settings.qf.pcc()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<oo.pcc> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().sf);
                }
                jSONObject.put("stats_list", jSONArray);
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis / 1000;
                jSONObject.put("ts", j);
                jSONObject.put("ts_ms", currentTimeMillis);
                String oo = com.bytedance.sdk.openadsdk.core.ork.sf().oo();
                if (oo == null) {
                    oo = "";
                }
                StringBuilder sb = new StringBuilder(tsz.pcc());
                sb.append("-");
                sb.append(currentTimeMillis);
                jSONObject.put("req_sign", com.bytedance.sdk.component.utils.vj.pcc(oo + j + BuildConfig.VERSION_NAME));
                jSONObject.put("req_uniq", com.bytedance.sdk.component.utils.vj.pcc(sb.toString()));
                return this.pcc.sf(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(List<com.bytedance.sdk.openadsdk.oo.pcc> list, com.bytedance.sdk.openadsdk.oo.vj vjVar) {
        int i;
        return !gm(list) && (i = vjVar.sf) >= 400 && i < 500;
    }

    public com.bytedance.sdk.openadsdk.oo.vj pcc(List<com.bytedance.sdk.openadsdk.oo.pcc> list) {
        of<com.bytedance.sdk.openadsdk.oo.pcc> ofVar = this.pcc;
        if (ofVar == null) {
            ofVar = lu.gm();
            this.pcc = ofVar;
        }
        if (ofVar == null) {
            return null;
        }
        return this.pcc.pcc(this.sf.pcc(this.sf.pcc(list, com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.pcc() == 3 ? 1 : -1), System.currentTimeMillis(), this.sf.sf()), this.sf.pcc(list), this.sf.sf(list));
    }
}
