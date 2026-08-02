package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.dax.sf.oo;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsz;
import defpackage.iem;
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
public class oo {
    public static of<com.bytedance.sdk.openadsdk.oo.pcc> pcc;
    private static final com.bytedance.sdk.openadsdk.oo.pcc.pcc sf = com.bytedance.sdk.openadsdk.oo.pcc.pcc.pcc();

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, ArrayList<vy>> oo(List<vy> list) {
        HashMap<String, ArrayList<vy>> hashMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            vy vyVar = list.get(i);
            String optString = ((JSONObject) vyVar.gm()).optString("app_log_url");
            ArrayList<vy> arrayList = hashMap.get(optString);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                hashMap.put(optString, arrayList);
            }
            arrayList.add(vyVar);
        }
        return hashMap;
    }

    public static com.bytedance.sdk.openadsdk.oo.vj pcc(List<oo.pcc> list) {
        of<com.bytedance.sdk.openadsdk.oo.pcc> ofVar = pcc;
        if (ofVar == null) {
            ofVar = lu.gm();
            pcc = ofVar;
        }
        if (ofVar != null && list != null && !list.isEmpty() && com.bytedance.sdk.openadsdk.core.settings.qf.pcc()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<oo.pcc> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().sf);
                }
                jSONObject.putOpt("stats_list", jSONArray);
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis / 1000;
                jSONObject.putOpt("ts", Long.valueOf(j));
                jSONObject.putOpt("ts_ms", Long.valueOf(currentTimeMillis));
                String oo = com.bytedance.sdk.openadsdk.core.ork.sf().oo();
                if (oo == null) {
                    oo = "";
                }
                StringBuilder sb = new StringBuilder(tsz.pcc());
                sb.append("-");
                sb.append(currentTimeMillis);
                jSONObject.putOpt("req_sign", com.bytedance.sdk.component.utils.vj.pcc(oo + j + BuildConfig.VERSION_NAME));
                jSONObject.putOpt("req_uniq", com.bytedance.sdk.component.utils.vj.pcc(sb.toString()));
                return pcc.sf(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static void sf(final ArrayList<vh> arrayList, @Nullable final iem iemVar) {
        if (arrayList == null || arrayList.isEmpty() || com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj() || arrayList.get(0) == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.dax.gm.sf()) {
            if (iemVar != null) {
                iemVar.f(arrayList, true);
                return;
            }
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        Iterator<vh> it = arrayList.iterator();
        while (it.hasNext()) {
            vh next = it.next();
            arrayList2.add(new oo.pcc(next.wh(), (JSONObject) next.gm()));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.3
            @Override // com.bytedance.sdk.openadsdk.lu.oo
            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                return wv8.e("stats_2");
            }
        });
        rnn.vj(new com.bytedance.sdk.component.kj.sf.gm("upload_stats_event", 6) { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.oo.vj pcc2 = oo.pcc(arrayList2);
                if (pcc2 == null) {
                    pcc2 = new com.bytedance.sdk.openadsdk.oo.vj(false, -2000, "result is null", false);
                }
                if (iemVar != null) {
                    iemVar.f(arrayList, new com.bytedance.sdk.component.wh.pcc.sf.sf.sf(pcc2.pcc, pcc2.sf, pcc2.gm, pcc2.oo, "").pcc);
                    if (pcc2.sf == 200) {
                        com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.4.1
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                return wv8.e("stats_2");
                            }
                        });
                    } else if (pcc2.oo) {
                        com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.4.2
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                return wv8.e("stats_2");
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.4.3
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                return wv8.e("stats_2");
                            }
                        });
                    }
                }
            }
        });
    }

    private static boolean vj(List<com.bytedance.sdk.openadsdk.oo.pcc> list) {
        JSONObject oo;
        if (list == null || list.isEmpty() || (oo = list.get(0).oo()) == null) {
            return true;
        }
        return TextUtils.isEmpty(oo.optString("app_log_url"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.oo.vj wh(List<com.bytedance.sdk.openadsdk.oo.pcc> list) {
        of<com.bytedance.sdk.openadsdk.oo.pcc> ofVar = pcc;
        if (ofVar == null) {
            ofVar = lu.gm();
            pcc = ofVar;
        }
        if (ofVar == null) {
            return null;
        }
        int i = wh.pcc() != 3 ? -1 : 3;
        com.bytedance.sdk.openadsdk.oo.pcc.pcc pccVar = sf;
        return pcc.pcc(pccVar.pcc(pccVar.pcc(list, i), System.currentTimeMillis(), pccVar.sf()), pccVar.pcc(list), pccVar.sf(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sf(List<com.bytedance.sdk.openadsdk.oo.pcc> list, com.bytedance.sdk.openadsdk.oo.vj vjVar) {
        int i;
        return !vj(list) && (i = vjVar.sf) >= 400 && i < 500;
    }

    public static void pcc(final ArrayList<vy> arrayList, final iem iemVar) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
            if (iemVar != null) {
                iemVar.f(arrayList, false);
            }
        } else {
            if (arrayList.get(0) == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.1
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    return wv8.e("applog_2");
                }
            });
            rnn.vj(new com.bytedance.sdk.component.kj.sf.gm("upload_ad_event", 7) { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.2
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = oo.oo(arrayList).entrySet().iterator();
                    } catch (Throwable th) {
                        lo.gm("OverSeaEventUploadImp", th.getMessage());
                        it = null;
                    }
                    Iterator it2 = it;
                    if (it2 == null) {
                        iem iemVar2 = iemVar;
                        if (iemVar2 != null) {
                            iemVar2.f(arrayList, false);
                            return;
                        }
                        return;
                    }
                    while (it2.hasNext()) {
                        try {
                            ArrayList arrayList2 = (ArrayList) ((Map.Entry) it2.next()).getValue();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                vy vyVar = (vy) it3.next();
                                arrayList3.add(new com.bytedance.sdk.openadsdk.oo.pcc(vyVar.wh(), (JSONObject) vyVar.gm()));
                            }
                            com.bytedance.sdk.openadsdk.oo.vj wh = oo.wh(arrayList3);
                            if (wh == null) {
                                wh = new com.bytedance.sdk.openadsdk.oo.vj(false, -2000, "result is null", false);
                            }
                            if (iemVar != null) {
                                boolean z = wh.oo;
                                if (oo.sf(arrayList3, wh)) {
                                    z = true;
                                }
                                boolean z2 = z;
                                iemVar.f(arrayList2, new com.bytedance.sdk.component.wh.pcc.sf.sf.sf(wh.pcc, wh.sf, wh.gm, z2, "").pcc);
                                if (wh.sf == 200) {
                                    com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.2.1
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            return wv8.e("applog_2");
                                        }
                                    });
                                } else if (z2) {
                                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.2.2
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            return wv8.e("applog_2");
                                        }
                                    });
                                } else {
                                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.oo.2.3
                                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                            return wv8.e("applog_2");
                                        }
                                    });
                                }
                            }
                        } catch (Throwable th2) {
                            lo.gm("OverSeaEventUploadImp", th2.getMessage());
                        }
                    }
                }
            });
        }
    }
}
