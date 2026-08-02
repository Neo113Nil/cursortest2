package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.vj.dax;
import com.bytedance.sdk.component.vj.kj;
import com.bytedance.sdk.component.vj.ork;
import com.bytedance.sdk.component.vj.vh;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.common.sf;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.lq;
import com.bytedance.sdk.openadsdk.core.model.tsz;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.core.tz;
import com.bytedance.sdk.openadsdk.utils.lu;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsx;
import defpackage.bf3;
import defpackage.etm;
import defpackage.mz1;
import defpackage.nem;
import defpackage.swm;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    private static String pcc = "openad_image_cache";
    private static volatile wh sf;
    private final com.bytedance.sdk.openadsdk.sf.sf gm;
    private final of<com.bytedance.sdk.openadsdk.oo.pcc> oo;
    private final Context vj;
    private final Map<String, AtomicInteger> wh = new ConcurrentHashMap();
    private final Map<String, String> qf = new ConcurrentHashMap();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface gm {
        void pcc(Object obj);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc();

        void pcc(@Nullable com.bytedance.sdk.openadsdk.lo.pcc.sf sfVar);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc();

        void pcc(int i, String str);
    }

    private wh(Context context) {
        if (context != null) {
            this.vj = context.getApplicationContext();
        } else {
            this.vj = lu.pcc();
        }
        this.gm = new com.bytedance.sdk.openadsdk.sf.sf(10, 8, true);
        this.oo = lu.gm();
        pcc = mz1.o(new StringBuilder(), pcc, "_p");
        com.bytedance.sdk.openadsdk.common.sf.pcc("tt_openad_materialMeta_new", new sf.pcc("tt_openad_materialMeta_new") { // from class: com.bytedance.sdk.openadsdk.component.wh.1
            @Override // com.bytedance.sdk.openadsdk.common.sf.pcc
            public void pcc(AdSlot adSlot, String str, String str2) {
                com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad_materialMeta_new", "material".concat(String.valueOf(adSlot.getCodeId())), str);
            }

            @Override // com.bytedance.sdk.openadsdk.common.sf.pcc
            public String sf(String str) {
                return com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)), (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.sf.pcc
            public String pcc(String str) {
                return "tt_openad_materialMeta_new";
            }
        });
    }

    private int oo(AdSlot adSlot) {
        StringBuilder sb = new StringBuilder("material_expiration_time");
        sb.append(adSlot.getCodeId());
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad", sb.toString(), -1L) == -1 ? 0 : 1;
    }

    private void sf(String str) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad_materialMeta", "material".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad", "material_expiration_time".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad", "video_has_cached".concat(String.valueOf(str)));
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad", "image_has_cached".concat(String.valueOf(str)));
    }

    public String gm(int i) {
        String sf2 = com.bytedance.sdk.openadsdk.common.sf.pcc("tt_openad_materialMeta_new").sf(String.valueOf(i));
        long pcc2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad", "material_expiration_time".concat(String.valueOf(i)), -1L);
        if (System.currentTimeMillis() / 1000 < pcc2) {
            return sf2;
        }
        if (pcc2 != -1) {
            pcc(i, (String) null);
            pcc(sf2);
        }
        return null;
    }

    public void pcc(final com.bytedance.sdk.openadsdk.core.model.of ofVar, final lq lqVar, final pcc pccVar) {
        final tsx sf2 = tsx.sf();
        final int kot = ofVar.kot();
        com.bytedance.sdk.openadsdk.core.model.lu luVar = ofVar.by().get(0);
        String qf = luVar.qf();
        String pcc2 = luVar.pcc();
        int sf3 = luVar.sf();
        int gm2 = luVar.gm();
        String pcc3 = TextUtils.isEmpty(qf) ? com.bytedance.sdk.component.utils.vj.pcc(pcc2) : qf;
        if (TextUtils.isEmpty(pcc3) || pcc3.contains("../") || pcc3.contains("/") || pcc3.contains("..")) {
            if (pccVar != null) {
                pccVar.pcc();
                return;
            }
            return;
        }
        File sf4 = com.bytedance.sdk.openadsdk.component.qf.pcc.sf(pcc3);
        String parent = sf4 != null ? sf4.getParent() : null;
        if (!pcc(pcc2, qf)) {
            com.bytedance.sdk.openadsdk.utils.lu.pcc(new com.bytedance.sdk.openadsdk.lo.pcc(pcc2, luVar.qf()), sf3, gm2, new lu.pcc() { // from class: com.bytedance.sdk.openadsdk.component.wh.10
                @Override // com.bytedance.sdk.openadsdk.utils.lu.pcc
                public void pcc(@NonNull com.bytedance.sdk.openadsdk.lo.pcc.sf sfVar) {
                    if (!sfVar.vj()) {
                        com.bytedance.sdk.openadsdk.component.oo.sf.pcc(ofVar, sf2.oo(), false);
                        pccVar.pcc();
                        return;
                    }
                    wh.this.sf(kot);
                    long oo = sf2.oo();
                    com.bytedance.sdk.openadsdk.component.oo.sf.pcc(ofVar, oo, true);
                    lq lqVar2 = lqVar;
                    if (lqVar2 != null) {
                        lqVar2.pcc(oo);
                        lqVar.pcc(2);
                    }
                    pccVar.pcc(sfVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.lu.pcc
                public void pcc() {
                    com.bytedance.sdk.openadsdk.component.oo.sf.pcc(ofVar, sf2.oo(), false);
                    pccVar.pcc();
                }
            }, parent);
            return;
        }
        sf(kot);
        long oo = sf2.oo();
        if (lqVar != null) {
            lqVar.pcc(oo);
            lqVar.pcc(1);
        }
        pccVar.pcc(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.wh.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.wh.put(adSlot.getCodeId(), atomicInteger);
    }

    private void gm(@NonNull final com.bytedance.sdk.openadsdk.core.model.of ofVar, final AdSlot adSlot, final lq lqVar, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        if (com.bytedance.sdk.openadsdk.component.qf.pcc.vj()) {
            pcc(ofVar, adSlot, lqVar, pccVar);
        }
        pcc(ofVar, lqVar, new pcc() { // from class: com.bytedance.sdk.openadsdk.component.wh.8
            @Override // com.bytedance.sdk.openadsdk.component.wh.pcc
            public void pcc(com.bytedance.sdk.openadsdk.lo.pcc.sf sfVar) {
                if (com.bytedance.sdk.openadsdk.component.qf.pcc.vj()) {
                    return;
                }
                wh.this.pcc(ofVar, adSlot, lqVar, pccVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.wh.pcc
            public void pcc() {
                wh.this.gm(adSlot);
            }
        });
    }

    public void sf(int i) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad", "image_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    public boolean sf(AdSlot adSlot) {
        if (!com.bytedance.sdk.openadsdk.component.qf.pcc.vj() && adSlot != null) {
            String codeId = adSlot.getCodeId();
            if (com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(adSlot) && !TextUtils.isEmpty(codeId)) {
                return this.qf.containsKey(codeId);
            }
        }
        return false;
    }

    private void sf(@NonNull final com.bytedance.sdk.openadsdk.core.model.of ofVar, final AdSlot adSlot, final lq lqVar, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        if (com.bytedance.sdk.openadsdk.component.qf.pcc.vj()) {
            pcc(ofVar, adSlot, lqVar, pccVar);
        }
        pcc(ofVar, adSlot, lqVar, new sf() { // from class: com.bytedance.sdk.openadsdk.component.wh.7
            @Override // com.bytedance.sdk.openadsdk.component.wh.sf
            public void pcc() {
                if (com.bytedance.sdk.openadsdk.component.qf.pcc.vj()) {
                    return;
                }
                wh.this.pcc(ofVar, adSlot, lqVar, pccVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.wh.sf
            public void pcc(int i, String str) {
                wh.this.gm(adSlot);
            }
        });
    }

    public File sf() {
        StringBuilder p = bf3.p(new File(CacheDirFactory.getRootDir()).getName(), "/");
        p.append(pcc);
        return com.bytedance.sdk.component.utils.qf.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), p.toString());
    }

    public static wh pcc(Context context) {
        if (sf == null) {
            synchronized (wh.class) {
                try {
                    if (sf == null) {
                        sf = new wh(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sf;
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, gm gmVar) {
        pcc(ofVar, gmVar, 0);
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, final gm gmVar, final int i) {
        String str = ofVar.kez().f;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ork oo = com.bytedance.sdk.openadsdk.ork.oo.pcc(str).pcc(ofVar.kez().b).sf(ofVar.kez().a).vj(rj.vj(com.bytedance.sdk.openadsdk.core.lu.pcc())).oo(rj.gm(com.bytedance.sdk.openadsdk.core.lu.pcc()));
        if (i > 0) {
            oo.gm(2).pcc(new kj() { // from class: com.bytedance.sdk.openadsdk.component.wh.4
                @Override // com.bytedance.sdk.component.vj.kj
                public Bitmap pcc(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.oo.pcc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), bitmap, i);
                }
            });
        } else {
            oo.gm(1);
        }
        oo.pcc(new com.bytedance.sdk.openadsdk.ork.sf(ofVar, str, new dax() { // from class: com.bytedance.sdk.openadsdk.component.wh.5
            @Override // com.bytedance.sdk.component.vj.dax
            public void pcc(vh vhVar) {
                gm gmVar2;
                if (vhVar == null || vhVar.sf() == null || vhVar.gm() == null || (gmVar2 = gm.this) == null) {
                    return;
                }
                gmVar2.pcc(vhVar.sf());
            }

            @Override // com.bytedance.sdk.component.vj.dax
            public void pcc(int i2, String str2, @Nullable Throwable th) {
            }
        }));
    }

    public void pcc(final AdSlot adSlot) {
        Objects.toString(adSlot);
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.wh.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        if (!com.bytedance.sdk.openadsdk.common.lu.pcc().pcc(adSlot.getCodeId(), atomicInteger.get(), atomicInteger.get() + oo(adSlot))) {
            com.bytedance.sdk.openadsdk.component.qf.pcc.kj();
            return;
        }
        atomicInteger.incrementAndGet();
        this.wh.put(adSlot.getCodeId(), atomicInteger);
        final lq lqVar = new lq();
        lqVar.pcc(tsx.sf());
        lqVar.sf(com.bytedance.sdk.openadsdk.component.qf.pcc.sf());
        lqVar.sf(com.bytedance.sdk.openadsdk.component.qf.pcc.gm());
        tsz tszVar = new tsz();
        tszVar.vh = lqVar;
        tszVar.oo = 2;
        tszVar.vy = 2;
        this.oo.pcc(adSlot, tszVar, 3, new tz() { // from class: com.bytedance.sdk.openadsdk.component.wh.6
            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                wh.this.gm(adSlot);
                com.bytedance.sdk.openadsdk.component.oo.sf.pcc(lqVar, 100, 2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                wh.this.pcc(pccVar, gmVar, adSlot, lqVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar, AdSlot adSlot, lq lqVar) {
        com.bytedance.sdk.openadsdk.component.oo.sf.pcc(lqVar, 100, 1);
        if (pccVar != null && pccVar.vj() != null && !pccVar.vj().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.of ofVar = pccVar.vj().get(0);
            if (ofVar == null) {
                return;
            }
            if (ofVar.ye()) {
                pcc(ofVar, adSlot, lqVar, pccVar);
                return;
            } else if (com.bytedance.sdk.openadsdk.core.model.of.vj(ofVar)) {
                sf(ofVar, adSlot, lqVar, pccVar);
                return;
            } else {
                gm(ofVar, adSlot, lqVar, pccVar);
                return;
            }
        }
        gmVar.pcc(-3);
        gmVar.gm(2);
        com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
    }

    public void pcc(@NonNull com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot, lq lqVar, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        if (lqVar != null) {
            ofVar.gm(lqVar.ork());
        }
        pcc(new com.bytedance.sdk.openadsdk.component.vj.pcc(ofVar.kot(), ofVar, pccVar));
        com.bytedance.sdk.openadsdk.component.oo.sf.pcc(ofVar, 1, lqVar);
        gm(adSlot);
    }

    public void pcc(@NonNull final com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot, final lq lqVar, final sf sfVar) {
        final tsx sf2 = tsx.sf();
        final int kot = ofVar.kot();
        swm kez = ofVar.kez();
        String str = kez.g;
        String a = kez.a();
        if (TextUtils.isEmpty(a)) {
            a = com.bytedance.sdk.component.utils.vj.pcc(str);
        }
        final File pcc2 = com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(a);
        if (pcc2.exists()) {
            com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(pcc2);
            pcc(kot);
            long oo = sf2.oo();
            if (lqVar != null) {
                lqVar.pcc(oo);
                lqVar.pcc(1);
            }
            sfVar.pcc();
            pcc(ofVar, (gm) null);
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.lu.oo().jsj(String.valueOf(kot)) && !com.bytedance.sdk.component.utils.lu.oo(com.bytedance.sdk.openadsdk.core.lu.pcc())) {
            sfVar.pcc(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc3 = com.bytedance.sdk.openadsdk.core.model.of.pcc(pcc2.getParent(), ofVar);
        pcc3.pcc("material_meta", ofVar);
        pcc3.pcc("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc3, new etm() { // from class: com.bytedance.sdk.openadsdk.component.wh.9
            @Override // defpackage.etm
            public void pcc(nem nemVar, int i, String str2) {
                long oo2 = sf2.oo();
                com.bytedance.sdk.openadsdk.component.oo.sf.sf(ofVar, oo2, false);
                lq lqVar2 = lqVar;
                if (lqVar2 != null) {
                    lqVar2.pcc(oo2);
                }
                sfVar.pcc(i, str2);
                try {
                    if (pcc2.exists() && pcc2.isFile()) {
                        com.bytedance.sdk.component.utils.qf.gm(pcc2);
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // defpackage.etm
            public void pcc(nem nemVar, int i) {
                wh.this.pcc(kot);
                long oo2 = sf2.oo();
                com.bytedance.sdk.openadsdk.component.oo.sf.sf(ofVar, oo2, true);
                lq lqVar2 = lqVar;
                if (lqVar2 != null) {
                    lqVar2.pcc(oo2);
                    lqVar.pcc(2);
                }
                sfVar.pcc();
                wh.pcc(ofVar, (gm) null);
            }

            @Override // defpackage.etm
            public void sf(nem nemVar, int i) {
            }
        });
    }

    public void pcc(int i) {
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad", "video_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    public void pcc(final com.bytedance.sdk.openadsdk.component.vj.pcc pccVar) {
        jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.wh.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.core.model.of sf2 = pccVar.sf();
                    if (sf2 == null || com.bytedance.sdk.openadsdk.core.model.of.wh(sf2) || sf2.duh()) {
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.component.qf.pcc.vj()) {
                        com.bytedance.sdk.openadsdk.common.lu.pcc().pcc(sf2, pccVar.gm());
                        return;
                    }
                    if (wh.this.sf(sf2.gqd())) {
                        return;
                    }
                    wh.this.pcc(sf2.gqd(), sf2.qxv());
                    com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad", "material_expiration_time" + pccVar.pcc(), Long.valueOf(sf2.wjv()));
                    com.bytedance.sdk.openadsdk.common.sf.pcc("tt_openad_materialMeta_new").pcc(pccVar.sf().gqd(), pccVar.gm());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void pcc(final String str) {
        rnn.pcc(new com.bytedance.sdk.component.kj.sf.gm("opencache") { // from class: com.bytedance.sdk.openadsdk.component.wh.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.pcc sf2;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = com.bytedance.sdk.openadsdk.core.lu.gm().pcc(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (sf2 = com.bytedance.sdk.openadsdk.core.model.pcc.sf(jSONObject)) == null || !sf2.wh()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.oo.sf.pcc(sf2.qf());
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Nullable
    public String pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar == null || ofVar.kez() == null || TextUtils.isEmpty(ofVar.kez().g)) {
            return null;
        }
        String str = ofVar.kez().g;
        String a = ofVar.kez().a();
        if (TextUtils.isEmpty(a)) {
            a = com.bytedance.sdk.component.utils.vj.pcc(str);
        }
        File pcc2 = com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(a);
        if (pcc2.exists() && pcc2.isFile()) {
            return pcc2.getAbsolutePath();
        }
        return null;
    }

    public boolean pcc(String str, String str2) {
        boolean z;
        String str3;
        String str4;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.vj.pcc(str);
            }
            if (!TextUtils.isEmpty(str2) && !str2.contains("../") && !str2.contains("/") && !str2.contains("..")) {
                File sf2 = com.bytedance.sdk.openadsdk.component.qf.pcc.sf(str2);
                InputStream pcc2 = com.bytedance.sdk.openadsdk.ork.oo.pcc(str, str2);
                if (pcc2 != null) {
                    try {
                        pcc2.close();
                    } catch (IOException e) {
                        lo.gm("TTAppOpenAdCacheManager", e.getMessage());
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (sf2 != null) {
                        str3 = sf2.getParent();
                        str4 = sf2.getPath();
                    } else {
                        str3 = null;
                        str4 = null;
                    }
                    if (com.bytedance.sdk.openadsdk.ork.oo.pcc(str, str2, str3)) {
                        return true;
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        if (new File(str4).exists()) {
                            return true;
                        }
                    }
                }
                return z;
            }
            return false;
        } catch (Exception e2) {
            lo.gm("TTAppOpenAdCacheManager", e2.getMessage());
            return false;
        }
    }

    public void pcc(AdSlot adSlot, String str) {
        if (com.bytedance.sdk.openadsdk.component.qf.pcc.vj() || adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        String codeId = adSlot.getCodeId();
        boolean z = adSlot.getCacheScene() != 0;
        if (!com.bytedance.sdk.openadsdk.component.qf.pcc.pcc(adSlot) || z || TextUtils.isEmpty(codeId)) {
            return;
        }
        this.qf.put(codeId, str);
    }

    public void pcc(int i, String str) {
        String valueOf = String.valueOf(i);
        if (com.bytedance.sdk.openadsdk.component.qf.pcc.vj()) {
            com.bytedance.sdk.openadsdk.common.lu.pcc().pcc(valueOf, str);
            return;
        }
        if (this.qf.size() != 0 && !TextUtils.isEmpty(str) && this.qf.containsKey(valueOf)) {
            if (this.qf.containsValue(str)) {
                this.qf.remove(valueOf);
                sf(valueOf);
                return;
            }
            return;
        }
        sf(valueOf);
    }

    public void pcc() {
        File[] listFiles;
        try {
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad_materialMeta_new");
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File file = new File(CacheDirFactory.getRootDir());
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.wh.3
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 == null) {
                        return false;
                    }
                    String name = file2.getName();
                    return name.contains(wh.pcc) || name.contains("openad_video_cache");
                }
            })) != null) {
                for (File file2 : listFiles) {
                    try {
                        com.bytedance.sdk.component.utils.qf.gm(file2);
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
