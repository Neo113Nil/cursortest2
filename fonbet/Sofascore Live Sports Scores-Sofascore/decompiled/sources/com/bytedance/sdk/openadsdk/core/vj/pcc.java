package com.bytedance.sdk.openadsdk.core.vj;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.qf;
import com.bytedance.sdk.component.utils.vj;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.jr.gm.gm;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.dax.sf;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private final List<String> pcc = new CopyOnWriteArrayList();
    private final gm sf = new gm(5, 5, true);
    private final ConcurrentHashMap<String, Long> gm = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.vj.pcc$pcc, reason: collision with other inner class name */
    public static class C0103pcc {
        private static final pcc pcc = new pcc();
    }

    private boolean gm(String str) {
        return !this.pcc.contains(str);
    }

    private void pcc(of ofVar) {
        of.pcc kx;
        String vy;
        if (ofVar == null || (kx = ofVar.kx()) == null || (vy = kx.vy()) == null || !vy.contains("music_url")) {
            return;
        }
        gm();
        String sf = kx.sf();
        if (TextUtils.isEmpty(sf)) {
            try {
                new JSONObject().put("result", 0);
            } catch (JSONException e) {
                lo.gm("MusicCacheManager", e.getMessage());
            }
            pcc(0, -1L, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "music url string is null");
            return;
        }
        File sf2 = sf(sf);
        if (sf2 == null) {
            return;
        }
        sf2.getPath();
        if (pcc(sf2)) {
            pcc(2, -1L, -1, null);
        } else {
            pcc(ofVar, sf, sf2);
        }
    }

    public void sf() {
        File pcc = pcc(lu.pcc());
        pcc.getAbsolutePath();
        try {
            this.sf.pcc(pcc);
        } catch (IOException e) {
            lo.pcc("MusicCacheManager", "trimFileCache fail", e);
        }
    }

    public void gm() {
        oo.pcc("music_preload_start", false, new sf() { // from class: com.bytedance.sdk.openadsdk.core.vj.pcc.2
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                com.bytedance.sdk.openadsdk.dax.pcc.oo pcc = com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("music_preload_start");
                pcc.pcc();
                return pcc;
            }
        });
    }

    public File sf(String str) {
        String pcc = vj.pcc(str);
        if (pcc == null) {
            return null;
        }
        File pcc2 = pcc(lu.pcc());
        pcc2.getAbsoluteFile();
        return new File(pcc2, pcc);
    }

    public static pcc pcc() {
        return C0103pcc.pcc;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        List<of> vj = pccVar.vj();
        if (vj == null || vj.size() == 0) {
            return;
        }
        for (int i = 0; i < vj.size(); i++) {
            of ofVar = vj.get(i);
            if (ofVar != null) {
                pcc(ofVar);
            }
        }
    }

    public InputStream pcc(String str) {
        File sf = sf(str);
        if (sf == null || !pcc(sf)) {
            return null;
        }
        try {
            return new FileInputStream(sf);
        } catch (Exception e) {
            lo.gm("MusicCacheManager", e.getMessage());
            return null;
        }
    }

    private File pcc(Context context) {
        return qf.sf(context, new File(CacheDirFactory.getRootDir()).getName() + "/music");
    }

    private boolean pcc(File file) {
        return file.exists() && file.length() != 0;
    }

    private void pcc(of ofVar, String str, File file) {
        if (gm(str)) {
            this.gm.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            com.bytedance.sdk.component.qf.sf.pcc oo = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().oo();
            oo.gm(str);
            oo.pcc(file.getParent(), file.getName());
            oo.oo(str);
            this.pcc.add(str);
            oo.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.vj.pcc.1
                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                    sfVar.gm();
                    sfVar.pcc();
                    String oo2 = gmVar.oo();
                    Long l = (Long) pcc.this.gm.get(oo2);
                    if (sfVar.wh() && sfVar.vj() != null && sfVar.vj().exists()) {
                        sfVar.vj();
                        if (l != null) {
                            pcc.this.gm.remove(oo2);
                            pcc.this.pcc(1, SystemClock.elapsedRealtime() - l.longValue(), -1, null);
                        }
                        try {
                            qf.sf(sfVar.vj());
                        } catch (IOException e) {
                            lo.gm("MusicCacheManager", e.getMessage());
                        }
                    }
                    if (sfVar.wh() || l == null) {
                        return;
                    }
                    pcc.this.pcc(0, SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                    Long l = (Long) pcc.this.gm.get(gmVar.oo());
                    if (l != null) {
                        pcc.this.pcc(0, SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final int i, final long j, final int i2, final String str) {
        oo.pcc("music_preload_finish", false, new sf() { // from class: com.bytedance.sdk.openadsdk.core.vj.pcc.3
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i);
                long j2 = j;
                if (j2 != -1) {
                    jSONObject.put("load_duration", j2);
                }
                com.bytedance.sdk.openadsdk.dax.pcc.oo sf = com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("music_preload_finish").sf(jSONObject.toString());
                if (!TextUtils.isEmpty(str)) {
                    sf.sf(i2);
                    sf.wh(str);
                }
                sf.pcc();
                return sf;
            }
        });
    }

    public void pcc(final boolean z) {
        oo.pcc("music_cache", false, new sf() { // from class: com.bytedance.sdk.openadsdk.core.vj.pcc.4
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z);
                com.bytedance.sdk.openadsdk.dax.pcc.oo sf = com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("music_cache").sf(jSONObject.toString());
                sf.pcc();
                return sf;
            }
        });
    }
}
