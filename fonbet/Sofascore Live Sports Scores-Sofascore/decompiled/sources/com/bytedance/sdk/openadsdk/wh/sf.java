package com.bytedance.sdk.openadsdk.wh;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.kj;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.dax.pcc.gm;
import com.bytedance.sdk.openadsdk.utils.mu;
import com.ironsource.Ua;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private static volatile sf pcc;
    private final ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.nac.pcc> sf = new ConcurrentHashMap<>();
    private com.bytedance.sdk.openadsdk.nac.pcc gm = null;
    private volatile boolean oo = false;
    private volatile HandlerThread vj = null;
    private volatile Handler wh = null;
    private String qf = "";
    private int kj = 0;
    private volatile long vy = 0;
    private final Runnable ork = new Runnable() { // from class: com.bytedance.sdk.openadsdk.wh.sf.6
        @Override // java.lang.Runnable
        public void run() {
            boolean vj;
            sf sfVar;
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    vj = pcc.pcc().vj();
                    sfVar = sf.this;
                } catch (Throwable th) {
                    lo.gm(th.getMessage(), new Object[0]);
                }
                if (!vj) {
                    try {
                        if (sfVar.gm != null) {
                            jSONObject.put("common", sf.this.gm.pcc(jSONObject2));
                        }
                    } catch (JSONException e) {
                        lo.gm(e.getMessage(), new Object[0]);
                    }
                    sf.this.qf = jSONObject.toString();
                    sf sfVar2 = sf.this;
                    sfVar2.pcc(sfVar2.ork, pcc.pcc().oo());
                }
                Set<String> keySet = sfVar.sf.keySet();
                if (keySet.size() > sf.this.kj) {
                    sf.this.kj = keySet.size();
                }
                HashSet hashSet = new HashSet(5);
                ArrayList arrayList = new ArrayList(keySet.size());
                arrayList.addAll(sf.this.sf.values());
                Collections.sort(arrayList);
                for (int i = 0; i < arrayList.size() && i < 5; i++) {
                    hashSet.add(((com.bytedance.sdk.openadsdk.nac.pcc) arrayList.get(i)).sf());
                }
                try {
                    for (String str : keySet) {
                        com.bytedance.sdk.openadsdk.nac.pcc pccVar = (com.bytedance.sdk.openadsdk.nac.pcc) sf.this.sf.get(str);
                        if (pccVar != null) {
                            JSONObject pcc2 = pccVar.pcc(jSONObject2);
                            if (hashSet.contains(str)) {
                                jSONObject.put(str, pcc2);
                            }
                        }
                    }
                    jSONObject.put("common", jSONObject2);
                } catch (JSONException e2) {
                    lo.gm(e2.getMessage(), new Object[0]);
                }
                sf.this.qf = jSONObject.toString();
                sf sfVar22 = sf.this;
                sfVar22.pcc(sfVar22.ork, pcc.pcc().oo());
            } catch (OutOfMemoryError e3) {
                lo.gm(e3.getMessage(), new Object[0]);
            }
        }
    };

    private sf() {
    }

    private Handler gm() {
        if (this.vj == null || !this.vj.isAlive()) {
            synchronized (jr.class) {
                try {
                    if (this.vj != null) {
                        if (!this.vj.isAlive()) {
                        }
                    }
                    this.vj = kj.pcc("pag_feature", -1);
                    this.wh = new Handler(this.vj.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (this.wh == null) {
            synchronized (jr.class) {
                try {
                    if (this.wh == null) {
                        this.wh = new Handler(this.vj.getLooper());
                    }
                } finally {
                }
            }
        }
        return this.wh;
    }

    private void oo() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.vy > Ua.s) {
            oo.pcc("track_feature_result", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.wh.sf.1
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                @Nullable
                public gm pcc() throws Exception {
                    sf.this.vy = elapsedRealtime;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, String.valueOf(sf.this.kj));
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("track_feature_result").sf(jSONObject.toString());
                }
            });
        }
    }

    private void vj() {
        if (this.oo) {
            return;
        }
        this.oo = true;
        pcc(this.ork, pcc.pcc().oo());
    }

    public void pcc(@NonNull final String str, @NonNull final String str2, final String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !pcc.pcc().gm()) {
            return;
        }
        if ("show".equals(str) || "click".equals(str) || "dislike".equals(str)) {
            pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wh.sf.2
                @Override // java.lang.Runnable
                public void run() {
                    sf.this.pcc(str, str2, str3);
                }
            });
            return;
        }
        if (pcc.pcc().lu()) {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            if (!"rewarded_video".equals(str4) && !"fullscreen_interstitial_ad".equals(str4) && !"open_ad".equals(str4)) {
                return;
            }
        }
        if ("feed_play".equals(str) || "feed_pause".equals(str) || "feed_continue".equals(str) || "feed_over".equals(str) || "feed_break".equals(str) || "play_error".equals(str)) {
            pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wh.sf.3
                @Override // java.lang.Runnable
                public void run() {
                    sf.this.pcc(str, str2, str3);
                }
            });
        }
    }

    public void sf() {
        try {
            if (pcc.pcc().gm()) {
                pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wh.sf.7
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean vj = pcc.pcc().vj();
                        sf sfVar = sf.this;
                        if (!vj) {
                            if (sfVar.gm != null) {
                                sf.this.gm.pcc();
                            }
                        } else {
                            Iterator it = sfVar.sf.keySet().iterator();
                            while (it.hasNext()) {
                                com.bytedance.sdk.openadsdk.nac.pcc pccVar = (com.bytedance.sdk.openadsdk.nac.pcc) sf.this.sf.get((String) it.next());
                                if (pccVar != null) {
                                    pccVar.pcc();
                                }
                            }
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e) {
            lo.gm(e.getMessage(), new Object[0]);
        }
    }

    private void pcc(Runnable runnable) {
        if (mu.pcc || runnable == null) {
            return;
        }
        try {
            gm().post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(Runnable runnable, long j) {
        if (mu.pcc || runnable == null) {
            return;
        }
        try {
            gm().postDelayed(runnable, j);
        } catch (Throwable unused) {
        }
    }

    public static sf pcc() {
        if (pcc == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.gm.class) {
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

    public void pcc(JSONObject jSONObject) {
        if (pcc.pcc().gm()) {
            try {
                jSONObject.put("feature_data", this.qf);
                oo();
            } catch (JSONException e) {
                lo.gm(e.getMessage(), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(@NonNull String str, @NonNull String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && pcc.pcc().gm()) {
                vj();
                if (pcc.pcc().vj()) {
                    com.bytedance.sdk.openadsdk.nac.pcc pccVar = this.sf.get(str2);
                    if (pccVar == null) {
                        pccVar = new com.bytedance.sdk.openadsdk.nac.pcc(str2);
                    }
                    pccVar.pcc(str, str3);
                    this.sf.put(str2, pccVar);
                    return;
                }
                com.bytedance.sdk.openadsdk.nac.pcc pccVar2 = this.gm;
                if (pccVar2 == null) {
                    pccVar2 = new com.bytedance.sdk.openadsdk.nac.pcc(str2);
                    this.gm = pccVar2;
                }
                pccVar2.pcc(str, str3);
            }
        } catch (OutOfMemoryError e) {
            lo.gm(e.getMessage(), new Object[0]);
        }
    }

    public void pcc(@NonNull final String str, final of ofVar) {
        if (!TextUtils.isEmpty(str) && pcc.pcc().gm() && of.vj(ofVar)) {
            if (!pcc.pcc().lu() || ofVar.tqg() == 8 || ofVar.tqg() == 7 || ofVar.tqg() == 3) {
                if ("videoPercent30".equals(str) || "videoForceBreak".equals(str)) {
                    pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wh.sf.4
                        @Override // java.lang.Runnable
                        public void run() {
                            String hpk = ofVar.hpk();
                            String qxv = ofVar.qxv();
                            if (TextUtils.isEmpty(hpk)) {
                                return;
                            }
                            sf.this.pcc(str, hpk, qxv);
                        }
                    });
                }
            }
        }
    }

    public void pcc(@NonNull final String str, final of ofVar, final String str2) {
        if (TextUtils.isEmpty(str) || !pcc.pcc().gm()) {
            return;
        }
        if ("landingStart".equals(str) || "landingFinish".equals(str) || "landingContinue".equals(str) || "landingPause".equals(str)) {
            pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wh.sf.5
                @Override // java.lang.Runnable
                public void run() {
                    of ofVar2 = ofVar;
                    if (ofVar2 == null || TextUtils.isEmpty(ofVar2.hpk())) {
                        return;
                    }
                    sf.this.pcc(str, ofVar.hpk(), ofVar.qxv() + str2);
                }
            });
        }
    }
}
